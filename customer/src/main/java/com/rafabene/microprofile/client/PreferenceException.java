package com.rafabene.microprofile.client;

import javax.ws.rs.*;

public class PreferenceException extends WebApplicationException {

    private int status;

    public PreferenceException(int status, String message) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
