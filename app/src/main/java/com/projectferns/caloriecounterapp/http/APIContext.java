package com.projectferns.caloriecounterapp.http;

import android.util.Log;

import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpParams;

import java.net.URL;

/**
 * Created by stephen on 7/12/14.
 */
public class APIContext {

    private String accessToken;
    private String requestId;

    public APIContext() {
        super();
    }

    /**
     *
     */

    public APIContext(String accessToken) {
        super(); //default
        if (accessToken == null || accessToken.length() <= 0) {
            throw new IllegalArgumentException("accessToken cannot be null");
        }
        this.accessToken = accessToken;
    }

    public APIContext(String accessToken, String requestId) {
        this(accessToken); //call other constructor;
        if (requestId == null || requestId.length() <= 0) {
            throw new IllegalArgumentException("RequestId cannot be null");
        }
        this.requestId = requestId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRequestId() {
        return requestId;
    }

    public void Connect()
        throws InterruptedException {
    }


}
