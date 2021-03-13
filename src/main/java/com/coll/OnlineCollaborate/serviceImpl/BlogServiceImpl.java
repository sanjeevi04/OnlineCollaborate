package com.coll.OnlineCollaborate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaborate.dao.IBlogDao;
import com.coll.OnlineCollaborate.model.Blog;
import com.coll.OnlineCollaborate.service.IBlogService;

@Service
@Transactional
public class BlogServiceImpl implements IBlogService {
	
	@Autowired
	IBlogDao blogDao;

	@Override
	public List<Blog> getAllBlogs() {
		
		return blogDao.getAllBlogs();
	}

	@Override
	public List<Blog> getBlogsByStatus(String status) {
		
		return blogDao.getBlogsByStatus(status);
	}

	@Override
	public List<Blog> getUsersBlogs(int id) {
		
		return blogDao.getUsersBlogs(id);
	}

	@Override
	public Blog getBlogsById(int blogId) {
		
		return blogDao.getBlogsById(blogId);
	}

	@Override
	public boolean addBlog(Blog blog) {
		
		return blogDao.addBlog(blog);
	}

	@Override
	public boolean updateBlog(Blog blog) {
		
		return blogDao.updateBlog(blog);
	}

	@Override
	public boolean deleteBlog(Blog blog) {
		
		return blogDao.deleteBlog(blog);
	}

}
