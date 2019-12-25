package com.example.ad37_tranthihoan_day01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // khai báo tên
    Button btnLogin;
    EditText texthello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tên khai báo sẽ liên kết với id
        btnLogin= findViewById(R.id.btnLogin);
        texthello = findViewById(R.id.hello);

        // hàm thực hiện khi click vào nút
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = texthello.getText().toString();
                // intent là chuyển trang sự kiện
                Intent intent = new Intent(getBaseContext(),dangky02.class);
                intent.putExtra("a","xin chao "+text);
                startActivity(intent);
                //nox player
            }
        });
    }


}
