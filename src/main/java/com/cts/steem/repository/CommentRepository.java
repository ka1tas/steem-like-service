package com.cts.steem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.steem.bean.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
	List<Comment> fetchAllCommentDetails();

	Comment fetchCommentDetailById (@Param("postId") int postId);

}
