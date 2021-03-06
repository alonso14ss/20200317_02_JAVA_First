package co.kr.tjoeun.helloworld.a20200317_02_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

                Log.d("버튼클릭","입력 버튼 눌림");
                String inputLog = binding.inputEdt.getText().toString();

                Log.d("입력값확인",inputLog);
                binding.outputTxt.setText(inputLog);
                binding.inputEdt.setText("");
            }
        });

//        입력한 비밀번호가 1234 일때 로그인 버튼을 누르면 
//        토스트로 => 로그인 성공
//        그외의 비밀번호로 로그인 버튼을 누르면
//        토스트로 잘못된 비밀번호 입니다
        
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                String inputPw = binding.pwEdt.getText().toString();


//                string을 ==으로 비교하면 false처리가 됨
                if (inputPw.equals("1234")){
                    Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "잘못된 비밀번호 입니다", Toast.LENGTH_SHORT).show();
                }
                
            }
        });

    }
}
