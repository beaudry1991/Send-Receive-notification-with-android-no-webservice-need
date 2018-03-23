package com.realdev.beaudry.daystory;


import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



/**
 * Created by Steph on 5/25/2017.
 */

public class FirebaseInstantIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d("Token", "Refreshed token: " + token);
    }
}
