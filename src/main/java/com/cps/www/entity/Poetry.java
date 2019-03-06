package com.cps.www.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "lucene", type = "poetries")
public class Poetry implements Serializable {
    @Id
    private String id;

    private String poetId;

    private String title;

    private Date createdAt;

    private Date updatedAt;

    private String content;

    private static final long serialVersionUID = 1L;

    public Poetry() {
    }

    public Poetry(String id, String poetId, String title, Date createdAt, Date updatedAt, String content) {
        this.id = id;
        this.poetId = poetId;
        this.title = title;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
    }

    @Override
    public String toString() {
        return "PoetryController{" +
                "id='" + id + '\'' +
                ", poetId='" + poetId + '\'' +
                ", title='" + title + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Poetry poetry = (Poetry) o;

        if (id != null ? !id.equals(poetry.id) : poetry.id != null) return false;
        if (poetId != null ? !poetId.equals(poetry.poetId) : poetry.poetId != null) return false;
        if (title != null ? !title.equals(poetry.title) : poetry.title != null) return false;
        if (createdAt != null ? !createdAt.equals(poetry.createdAt) : poetry.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(poetry.updatedAt) : poetry.updatedAt != null) return false;
        return content != null ? content.equals(poetry.content) : poetry.content == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (poetId != null ? poetId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoetId() {
        return poetId;
    }

    public void setPoetId(String poetId) {
        this.poetId = poetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}