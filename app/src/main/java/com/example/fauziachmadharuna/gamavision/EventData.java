package com.example.fauziachmadharuna.gamavision;

/**
 * Created by fauziachmadharuna on 09/03/18.
 */

public class EventData {
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventOrganizer() {
        return eventOrganizer;
    }

    public void setEventOrganizer(String eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    private String eventName;
    private String eventOrganizer;
    private String eventDate;

    public EventData(){

    }
    public EventData(String eventName, String eventOrganizer, String eventDate){
        this.eventName=eventName;
        this.eventOrganizer=eventOrganizer;
        this.eventDate=eventDate;
    }

}
