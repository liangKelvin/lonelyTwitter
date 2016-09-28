package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Maintains a list of tweets!
 */
public class TweetList {
    private List<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) throws IllegalArgumentException {

        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public void remove(Tweet tweet) {
        tweets.remove(tweet);
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }
}
