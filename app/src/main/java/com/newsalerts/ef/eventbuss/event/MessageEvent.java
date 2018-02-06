package com.newsalerts.ef.eventbuss.event;

/**
 * Created by EF on 05-Feb-18.
 */

public class MessageEvent {
    public String mMessage;

    public MessageEvent(String mMessage) {
        this.mMessage = mMessage;
    }

    public String getmMessage() {
        return mMessage;
    }
}
