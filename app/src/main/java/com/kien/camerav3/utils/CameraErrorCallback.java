package com.kien.camerav3.utils;

import android.hardware.Camera;
import android.util.Log;

public class CameraErrorCallback implements Camera.ErrorCallback {

    private static final String TAG = "CameraErrorCallback";

    @Override
    public void onError(int error, Camera camera) {
        Log.e(TAG, "Encountered an unexpected camera error: " + error);
    }
}
