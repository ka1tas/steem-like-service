package com.cts.steem.bean;

import javax.persistence.CascadeType;
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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "comment")
@NamedQueries({ @NamedQuery(name = "Comment.fetchAllCommentDetails",
							query = "from Comment")
/*@NamedQuery(name = "Comment.fetchCommentDetails", query = " select c from Comment c"
			+ " left join fetch c.user " + " join fetch c.post" + " where user.id= :userId")	*/
							
			  })
   


public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "co_id")
	private int id;
	
	@Column(name = "co_content")
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "co_us_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "co_po_id")
	@JsonIgnore
	private Post post;
	
	
	public Comment() {
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", user=" + user + ", post=" + post + "]";
	}
	
	
	

}
