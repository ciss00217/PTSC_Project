package tw.com.ptsc.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import tw.com.ptsc.common.database.entity.MemberDemo;
import tw.com.ptsc.common.model.Article;
import tw.com.ptsc.service.member.MemberDemoService;

/**
 * 會員
 */
@Controller
public class MemberDemoController {
	@Autowired
	private MemberDemoService memberDemoService;

    @GetMapping("/member")
	public ModelAndView displayArticle(Map<String, Object> model) {
	    List<MemberDemo> members = memberDemoService.getAll();
	          model.put("members", members);
	    return new ModelAndView("index",model);
	}
}
