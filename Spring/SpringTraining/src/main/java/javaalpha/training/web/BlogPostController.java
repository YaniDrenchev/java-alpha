package javaalpha.training.web;

import javaalpha.training.models.BlogPost;
import javaalpha.training.services.base.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/blogposts")
public class BlogPostController {
    private BlogService blogService;
    private List<BlogPost> blogPosts = new ArrayList<>();
//
//    @Autowired
//    public BlogPostController(BlogService blogService){
//        this.blogService = blogService;
//    }
    @RequestMapping
    List<BlogPost> listAll(){
        return blogPosts;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    BlogPost search(@PathVariable("id") String idString){
        int id = Integer.parseInt(idString);
        return blogService.searchByID(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/")
    void createBlogPost(@RequestBody BlogPost blogPost){

        blogPosts.add(blogPost);
    }
}
