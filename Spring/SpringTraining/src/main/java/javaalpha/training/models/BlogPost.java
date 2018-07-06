package javaalpha.training.models;


import com.fasterxml.jackson.annotation.JsonCreator;

public class BlogPost {
    private String name;

    public BlogPost(){

    }
    public BlogPost(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
