package ru.netology.domain;
public class VkPost {

    private int id;
    private int ownerId;
    private char name;
    private int postTime;
    private char postText;
    private String video;
    private String logo;
    private String link;

    private Share share;
    private CountView countView;
    private CommentsInfo commentsInfo;
    private Like like;


    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public char getName() {
        return name;
    }

    public int getPostTime() {
        return postTime;
    }

    public char getPostText() {
        return postText;
    }

    public String getVideo() {
        return video;
    }

    public String getLogo() {
        return logo;
    }

    public String getLink() {
        return link;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    public void setPostText(char postText) {
        this.postText = postText;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

