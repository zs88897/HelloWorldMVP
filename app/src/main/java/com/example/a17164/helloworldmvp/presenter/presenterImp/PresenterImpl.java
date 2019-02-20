package com.example.a17164.helloworldmvp.presenter.presenterImp;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;

import com.example.a17164.helloworldmvp.presenter.IPesenter;
import com.example.a17164.helloworldmvp.view.showView;

public class PresenterImpl implements IPesenter {
    private showView showView1;
    public PresenterImpl(showView showView){
        showView1=showView;
    }
    @Override
    public void show() {
        new AsyncTask<Void,Void,Void>(){

            @Override
            protected void onPostExecute(Void aVoid){
                super.onPostExecute(aVoid);
                Log.d("joy99","download complete");
                showView1.show("hello,mvp");

            }
            protected Void doInBackground(Void... voids) {
                for(int i=0;i<10;i++){
                    Log.d("joy99","downloading now...expect remaining time"+(10-i)+"second");
                    SystemClock.sleep(1000);
                }
                return null;
            }
        }.execute();
    }
}
