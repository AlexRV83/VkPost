package ru.netology.domain;
public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean interesting;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
    public boolean isInteresting() {
        return interesting;
    }
    public void setInteresting(boolean interesting) {
        this.interesting = interesting;
    }

}
