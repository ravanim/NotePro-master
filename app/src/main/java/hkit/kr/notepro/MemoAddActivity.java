package hkit.kr.notepro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MemoAddActivity extends AppCompatActivity {

    EditText memoEditText;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_add);

        memoEditText = findViewById(R.id.memoEditText);
        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(addListener);
    }

    View.OnClickListener addListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String memo = memoEditText.getText().toString();

            Intent data = new Intent();
            data.putExtra("memo", memo);

            setResult(Activity.RESULT_OK, data);
            finish();
        }
    };
}
