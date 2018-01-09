package com.silicontechnologies.productflavours;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by rajajawahar on 09/01/18.
 */

public class LoginActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_admin_login);
    Toast.makeText(this, "Admin Login Activity", Toast.LENGTH_SHORT).show();
  }
}
