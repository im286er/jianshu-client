package com.zhangyw.jianshu.entity;

import java.io.Serializable;

public class JSUser implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String nickname;//昵称
	private String avatar_url;//头像
	private String slug;//用户唯一标识
	private String total_wordage;//总写作字数
	private String public_notes_count;//文章总数
	private String total_likes_count;//收到喜欢数量
	private String followers_count;//被关注数
	public JSUser(String id, String nickname, String avatar_url, String slug,
			String total_wordage, String public_notes_count,
			String total_likes_count, String followers_count) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.avatar_url = avatar_url;
		this.slug = slug;
		this.total_wordage = total_wordage;
		this.public_notes_count = public_notes_count;
		this.total_likes_count = total_likes_count;
		this.followers_count = followers_count;
	}
	public JSUser() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getTotal_wordage() {
		return total_wordage;
	}
	public void setTotal_wordage(String total_wordage) {
		this.total_wordage = total_wordage;
	}
	public String getPublic_notes_count() {
		return public_notes_count;
	}
	public void setPublic_notes_count(String public_notes_count) {
		this.public_notes_count = public_notes_count;
	}
	public String getTotal_likes_count() {
		return total_likes_count;
	}
	public void setTotal_likes_count(String total_likes_count) {
		this.total_likes_count = total_likes_count;
	}
	public String getFollowers_count() {
		return followers_count;
	}
	public void setFollowers_count(String followers_count) {
		this.followers_count = followers_count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((avatar_url == null) ? 0 : avatar_url.hashCode());
		result = prime * result
				+ ((followers_count == null) ? 0 : followers_count.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nickname == null) ? 0 : nickname.hashCode());
		result = prime
				* result
				+ ((public_notes_count == null) ? 0 : public_notes_count
						.hashCode());
		result = prime * result + ((slug == null) ? 0 : slug.hashCode());
		result = prime
				* result
				+ ((total_likes_count == null) ? 0 : total_likes_count
						.hashCode());
		result = prime * result
				+ ((total_wordage == null) ? 0 : total_wordage.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JSUser other = (JSUser) obj;
		if (avatar_url == null) {
			if (other.avatar_url != null)
				return false;
		} else if (!avatar_url.equals(other.avatar_url))
			return false;
		if (followers_count == null) {
			if (other.followers_count != null)
				return false;
		} else if (!followers_count.equals(other.followers_count))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (public_notes_count == null) {
			if (other.public_notes_count != null)
				return false;
		} else if (!public_notes_count.equals(other.public_notes_count))
			return false;
		if (slug == null) {
			if (other.slug != null)
				return false;
		} else if (!slug.equals(other.slug))
			return false;
		if (total_likes_count == null) {
			if (other.total_likes_count != null)
				return false;
		} else if (!total_likes_count.equals(other.total_likes_count))
			return false;
		if (total_wordage == null) {
			if (other.total_wordage != null)
				return false;
		} else if (!total_wordage.equals(other.total_wordage))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JSUser [id=" + id + ", nickname=" + nickname + ", avatar_url="
				+ avatar_url + ", slug=" + slug + ", total_wordage="
				+ total_wordage + ", public_notes_count=" + public_notes_count
				+ ", total_likes_count=" + total_likes_count
				+ ", followers_count=" + followers_count + "]";
	}
}
