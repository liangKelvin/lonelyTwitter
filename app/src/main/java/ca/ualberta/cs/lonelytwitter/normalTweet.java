package ca.ualberta.cs.lonelytwitter;

/**
 * Created by liangmah on 9/15/16.
 */
public class normalTweet extends tweet {

    public normalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
