package ru.netology.manager;

public class WallSearch {
    private int ownerId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int count;
    private int offset;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(boolean ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
