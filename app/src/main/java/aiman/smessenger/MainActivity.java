package aiman.smessenger;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pollgen);


    }

    public void generateViews(View view)
    {
        LinearLayout layout = (LinearLayout) findViewById(R.id.a);

        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                300,
                200
        );
        EditText ed = (EditText)  findViewById(R.id.val);
        int i= Integer.parseInt(ed.getText().toString());
        if(i<2||i>4){
            Toast.makeText(MainActivity.this,"enter value between 2 and 4", Toast.LENGTH_LONG).show();

        }
        else {

            if(count==0) {
                for (int var = 0; var < i; var++) {
                    EditText bt = new EditText(this);
                    bt.setHint("please Enter OPtion");
                    bt.setLayoutParams(params);
                    layout.addView(bt);
                }
                count++;
            }
                else{
                    Toast.makeText(MainActivity.this,"options already created", Toast.LENGTH_LONG).show();
                }
            }
        }
    }


