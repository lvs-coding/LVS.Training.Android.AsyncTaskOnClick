package com.example.android.asynctaskonclick;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by laurent on 1/5/17.
 */

public class MyAsyncTask extends AsyncTask<String, Integer, String> {
    public MyAsyncRequest response = null;

    @Override
    protected String doInBackground(String... strings) {
        String s = "My message from AsyncTask";
        return s;
    }

    protected void onPostExecute(String result) {
        response.requestDone(result);
    }
}
