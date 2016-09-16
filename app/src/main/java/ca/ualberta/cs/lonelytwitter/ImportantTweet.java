package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by liangmah on 9/15/16.
 */
public class ImportantTweet extends tweet {

    public ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}
