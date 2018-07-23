package javaalpha.training.services;

import javaalpha.training.data.Base.GenericRepository;
import javaalpha.training.data.GenericRepositoryImpl;
import javaalpha.training.models.BlogPost;
import javaalpha.training.services.base.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    GenericRepository<BlogPost> genericRepository;

    public BlogServiceImpl(GenericRepository<BlogPost> genericRepository){
        this.genericRepository = genericRepository;
    }

    @Override
    public List<BlogPost> listall() {
        return genericRepository.listAll();
    }

    @Override
    public BlogPost searchByID(int id) {
        return null;
    }

    @Override
    public void changeBlockPost(int ind, BlogPost blogPost) {

    }

    @Override
    public void create(BlogPost blogPost) {
        genericRepository.create(blogPost);
    }
}
