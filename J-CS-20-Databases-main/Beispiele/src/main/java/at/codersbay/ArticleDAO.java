package at.codersbay;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ArticleDAO {
    public int createArticle(Article article);
    public int updateArticle(Article article);
    public int deleteArticle(int articleId);
    public Article getArticle(int articleId);
    public ArrayList<Article> getAllArticles();
}
