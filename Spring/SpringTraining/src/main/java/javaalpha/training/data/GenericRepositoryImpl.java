package javaalpha.training.data;

import javaalpha.training.data.Base.GenericRepository;
import javaalpha.training.models.BlogPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class GenericRepositoryImpl<T> implements GenericRepository <T> {
    private static List<Object> models;
    static {
        models = new ArrayList<>();
    }
    @Override
    public List<T> listAll() {
        return (List<T>) models;
    }

    @Override
    public Stream<T> modelsStream() {
        return null;
    }

    @Override
    public T findbyId() {
        return null;
    }

    @Override
    public void create(T blogPost) {
       models.add(blogPost);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(T blogPost) {

    }
}
