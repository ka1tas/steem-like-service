package com.cts.steem.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "post")
@NamedQueries({ 
	@NamedQuery(
		name = "Post.fetchAllPostDetails", 
		query = "select distinct p from Post p left join fetch p.user left join p.commentList"
	) ,


@NamedQuery(
		name = "Post.fetchPostDetailById", 
		query =	"select distinct p from Post p left join fetch p.user left join fetch p.commentList where p.id= :postId")
 
})
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "po_id")
	private int id;

	@Column(name = "po_content")
	private String content;
	
	@Column(name = "po_title")
	private String title;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "po_us_id")
	private User user;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="post")
	private List<Comment> commentList;
	
	public Post() {
		super();

	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}
	
	
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", content=" + content + ", user=" + user + "]";
	}

}
