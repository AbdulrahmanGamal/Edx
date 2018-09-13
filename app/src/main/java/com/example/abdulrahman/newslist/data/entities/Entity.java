package com.example.abdulrahman.newslist.data.entities;

import java.io.Serializable;

/**
 * Created by mohamedyoussef on 24/07/17.
 */

abstract public class Entity implements Serializable {
    private boolean error=false;
    public boolean getError() {
        return error;
    }
    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isError() {
        return error;
    }
}
