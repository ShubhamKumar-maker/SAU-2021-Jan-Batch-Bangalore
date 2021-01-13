package com.example.au.couchbasedemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.repository.BlogRepository;

@RestController
public class BlogController {
    
    @Autowired
    BlogRepository blogRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/blogs")
    public Blogs addBlogPost(@RequestBody Blogs newBlog) {
        return blogRepository.save(newBlog);
    }
    
    @GetMapping("/blogs/{id}")
    public Optional<Blogs> getBlog(@PathVariable String id) {
        if (blogRepository.existsById(id)) {
            return blogRepository.findById(id);
        } else
            return Optional.empty();
    }
   
    @GetMapping("/blogs/tags/{tags}")
    public List<Blogs> getBlogByTags(@PathVariable List<String> tags) {
		return blogRepository.findByTags(tags);
    	
    }
    
    @GetMapping("/blogs/tags1/{tags1}")
    public Optional<Blogs> getBlogByTags1(@PathVariable List<String> tags1) {
    	if(blogRepository.existsByTags1(tags1) != null) {
		return blogRepository.findByTags1(tags1);
    	}
    	else
    		return Optional.empty();
    }
    //getting item from tags2 if no item found then return null
    @GetMapping("/blogs/tags2/{tags2}")
    public Optional<Blogs> getBlogByTags2(@PathVariable List<String> tags2) {
    	if(blogRepository.existsByTags2(tags2) != null) {
		return blogRepository.findByTags1(tags2);
    	}
    	else
    		return Optional.empty();
    }
    //search item from tow tags
    
    @GetMapping("/blogs/tags1/{tags1}/tags2/{tags2}")
    public List<Blogs> getBlogByTags1AndTags2(@PathVariable List<String> tags1,@PathVariable List<String> tags2) {
		return blogRepository.findByTags1AndTags2(tags1,tags2);
    }
    
    @GetMapping("/blogs/author/{author}")
    public Blogs getBlogByAuthorName(@PathVariable String author) {
        return blogRepository.findByAuthor(author);
    }
    @GetMapping("/blogs/topic/{topic}/author/{author}")
    public Blogs getBlogByAuthorAndTopic(@PathVariable String topic, @PathVariable String author) {
        return blogRepository.findBytopicAndAuthor(topic,author);
    }
    
    
    
    @DeleteMapping("/blogs/topic/{topic}/author/{author}")
    public List<Blogs> deleteByAuthorAndTopic(@PathVariable String topic, @PathVariable String author) {
        return blogRepository.deleteBytopicAndAuthor(topic, author);
    }
    
    @DeleteMapping("/blogs/{id}")
    public void deleteById(@PathVariable String id) {
        blogRepository.deleteById(id);
    }
    
	/*
	 * @PutMapping("/blogs/{idToBeUpdated}") public String updateBlog(@PathVariable
	 * String idToBeUpdated, @RequestBody BlogsUpdateRequest blogsUpdateRequest) {
	 * 
	 * Optional<Blogs> mayBeBlog = blogRepository.findById(idToBeUpdated) .map(blogs
	 * –> blogRepository .save(Blogs .builder() .id(idToBeUpdated)
	 * .topic(blogsUpdateRequest.getTopic()) .tags(blogsUpdateRequest.getTags())
	 * .author(blogs.getAuthor()) .date(blogs.getDate()) .build()) ); if
	 * (mayBeBlog.isPresent()) { return "Blog Updated"; } else { return
	 * "Blog does not exist"; } }
	 */
}