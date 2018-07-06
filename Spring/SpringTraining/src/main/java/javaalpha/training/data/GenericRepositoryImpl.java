package javaalpha.training.data;

import javaalpha.training.models.BlogPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GenericRepositoryImpl<T> {
    static List<Object> models;
    static {
        models = new ArrayList<>();
    }
    public void create(BlogPost blogPost){
        models.add(blogPost);
    }
}
