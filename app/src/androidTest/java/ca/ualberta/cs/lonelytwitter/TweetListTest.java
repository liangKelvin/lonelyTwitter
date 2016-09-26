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
}
