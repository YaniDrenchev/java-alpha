package javaalpha.training.services.base;

import javaalpha.training.models.BlogPost;

import java.util.List;

public interface BlogService {
    List<BlogPost> listall();
    BlogPost searchByID(int id);
    void changeBlockPost(int ind, BlogPost blogPost);
    void create(BlogPost blogPost);
}
