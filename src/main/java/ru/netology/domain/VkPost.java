package ru.netology.domain;
public class VkPost {

    private int id;
    private int ownerId;
    private char fromId;
    private int date;
    private char postText;
    private String video;
    private String logo;
    private String link;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;


    private Repost repost;
    private CountView countView;
    private CommentsInfo commentsInfo;
    private Like like;
    private Copyright copyright;
    private Geo geo;
    private Donut donut;


    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public char getName() {
        return fromId;
    }

    public int getPostTime() {
        return date;
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

    public void setName(char fromId) {
        this.fromId = fromId;
    }

    public void setPostTime(int date) {
        this.date = date;
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

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}

