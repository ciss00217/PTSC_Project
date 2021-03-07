package tw.com.ptsc.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import tw.com.ptsc.common.model.Article;

/**
 * 主畫面
 */
@Controller
public class ArticleController {
	
    @GetMapping("/article")
	public ModelAndView displayArticle(Map<String, Object> model) {
	    List<Article> articles = IntStream.range(0, 10)
	            .mapToObj(i -> generateArticle("Article Title " + i))
	            .collect(Collectors.toList());
	    
	          model.put("articles", articles);
	    return new ModelAndView("index",model);
	}

	/**
	 * 產生溫張工具
	 * @param title
	 * @return
	 */
	private Article generateArticle(String title) {
	        Article article = new Article();
	        article.setTitle(title);
	        article.setBody(
	          "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur faucibus tempor diam. In molestie arcu eget ante facilisis sodales. Maecenas porta tellus sapien, eget rutrum nisi blandit in. Mauris tempor auctor ante, ut blandit velit venenatis id. Ut varius, augue aliquet feugiat congue, arcu ipsum finibus purus, dapibus semper velit sapien venenatis magna. Nunc quam ex, aliquet at rutrum sed, vestibulum quis libero. In laoreet libero cursus maximus vulputate. Nullam in fermentum sem. Duis aliquam ullamcorper dui, et dictum justo placerat id. Aliquam pretium orci quis sapien convallis, non blandit est tempus.");
	        article.setPublishDate(LocalDate.now().toString());
	        article.setAuthor("Lin");
	        return article;
	    }
}
