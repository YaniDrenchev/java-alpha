package javaalpha.training.data.Base;

import javaalpha.training.models.BlogPost;

import java.util.List;
import java.util.stream.Stream;

public interface GenericRepository <T> {
    List<T> listAll();
    Stream<T> modelsStream();
    T findbyId();
    void create(T blogPost);
    void delete (int id);
    void update (T blogPost);
}
