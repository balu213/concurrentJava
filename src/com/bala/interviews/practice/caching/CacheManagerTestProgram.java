package com.bala.interviews.practice.caching;

public class CacheManagerTestProgram {
    public static void main(String[] args) {
        CacheManagerTestProgram ctp = new CacheManagerTestProgram();
        String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        /*
         * Create an instance of CachedObject, set the minutesToLive to 1
         * minute. Give the object some unique identifier.
         */
        CachedObject co = new CachedObject(s, new Long(1234), 1);
        /* Place the object into the cache! */
        CacheManager.putCache(co);
        /* Try to retrieve the object from the cache! */
        CachedObject o = (CachedObject) CacheManager.getCache(new Long(1234));
        /* Let's see if we got it! */
        if (o == null)
            System.out.println("CacheManagerTestProgram.Main:  FAILURE!  Object not Found.");
        else
            System.out.println("CacheManagerTestProgram.Main:  SUCCESS! " + ((String) o.object).toString());
    }
}
