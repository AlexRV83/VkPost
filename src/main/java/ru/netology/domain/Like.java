package ru.netology.domain;

public class Like {

    private int count;
    private boolean likeIt;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return likeIt;
    }

    public void setCanPost(boolean likeIt) {
        this.likeIt = likeIt;
    }
}
