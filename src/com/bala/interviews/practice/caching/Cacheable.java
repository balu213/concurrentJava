package com.bala.interviews.practice.caching;

public interface Cacheable {
    public boolean isExpired();

    public Object getIdentifier();
}
