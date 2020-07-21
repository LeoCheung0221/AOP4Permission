package com.tufusi.permissonaop;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tufusi.zeropermission.annotation.PermissionRequired;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_request_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestCall();
            }
        });
    }

    @PermissionRequired(requestPermission = {Manifest.permission.CALL_PHONE, Manifest.permission.CAMERA}, requestCode = 12)
    private void requestCall() {
        // 检测权限
        Log.e("tufusi", "requestCall: 请求权限成功");
    }
}
