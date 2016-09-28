package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Tests our TweetList class.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Testing...");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
        Tweet tweet1 = new NormalTweet("Testing...");
        try{
            list.add(tweet1);
            list.hasTweet(tweet1);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }

    }


    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet added = new NormalTweet("Testing...");
        Tweet notAdded = new NormalTweet("Testing...");

        assertFalse(list.hasTweet(added));
        list.add(added);

        assertTrue(list.hasTweet(added));
        assertFalse(list.hasTweet(notAdded));
    }

    /**
     * Tests getting tweet by index.
     */
    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        list.add(tweet);

        Tweet returnedTweet = list.getTweet(0);
        assertEquals(tweet.getMessage(), returnedTweet.getMessage());
        assertEquals(tweet.getDate(), returnedTweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        list.add(tweet);
        list.remove(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void getCount() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        Tweet tweet2 = new NormalTweet("Hello2");
        list.add(tweet);
        list.add(tweet2);
        assertFalse(list.getCount() == 2);
    }

    public void testGetTweets() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        Tweet tweet2 = new NormalTweet("Hello2");
        list.add(tweet);
        list.add(tweet2);
         assertTrue(list.equals(list.getTweets()));
    }

}
