package ru.netology.domain;

public class Repost {
    private int count;
    private boolean repostIt;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isRepostIt() {
        return repostIt;
    }

    public void setShareIt(boolean repostIt) {
        this.repostIt = repostIt;
    }
}
