package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by liangmah on 9/15/16.
 */
public abstract class tweet {

    private String message;
    private Date date;
    private ArrayList<CurrentMood> listOfMoods;

    public tweet(String message) {
        this.message = message;
    }

    public tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public ArrayList<CurrentMood> getListOfMoods() {
        return listOfMoods;
    }

    public void addToListOfMoods(ArrayList<CurrentMood> listOfMoods) {
        this.listOfMoods = listOfMoods;
    }

    public abstract Boolean isImportant();
}
