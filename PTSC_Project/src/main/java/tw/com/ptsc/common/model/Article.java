package tw.com.ptsc.common.model;

import lombok.Data;

/**
 *文章
 */
@Data
public class Article {
    /**標題*/
    private String title;
    /**內文*/
    private String body;
    /**作者*/
    private String author;
    /**發布時間*/
    private String publishDate;
}
