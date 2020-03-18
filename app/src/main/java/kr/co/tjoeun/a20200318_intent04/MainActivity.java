package kr.co.tjoeun.a20200318_intent04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200318_intent04.databinding.ActivityEditUserInfoBinding;

public class MainActivity extends AppCompatActivity {

    ActivityEditUserInfoBinding binding = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        
    }
}
