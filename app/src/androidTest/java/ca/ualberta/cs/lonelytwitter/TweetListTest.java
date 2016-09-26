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
}
