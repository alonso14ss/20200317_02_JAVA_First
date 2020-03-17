package co.kr.tjoeun.helloworld.a20200317_02_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import co.kr.tjoeun.helloworld.a20200317_02_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

//        edittext에 타이핑 => 입력버튼 => 텍스트뷰에 출력
//        +입력버튼 누르면 기존 입력내용 삭제

        binding.pushBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputLog = binding.inputEdt.getText().toString();
                binding.outputTxt.setText(inputLog);
                binding.inputEdt.setText("");
            }
        });

    }
}
