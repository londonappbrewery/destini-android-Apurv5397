package com.londonappbrewery.destini;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mQuestion;
    Button mAnswer1;
    Button mAnswer2;
    int mIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mQuestion= (TextView) findViewById(R.id.storyTextView);
        mAnswer1=(Button)findViewById(R.id.buttonTop);
        mAnswer2=(Button)findViewById(R.id.buttonBottom);
        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex++;
                if(mIndex!=2 && mIndex!=4) {
                    update();
                }
                else
                {
                    mQuestion.setText(R.string.T6_End);
                    mAnswer1.setVisibility(View.GONE);
                    mAnswer2.setVisibility(View.GONE);
                }
            }
        });
        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex+=2;
                if(mIndex!=3 && mIndex!=5) {
                    update();
                }
                else
                {
                    mQuestion.setText(R.string.T5_End);
                    mAnswer1.setVisibility(View.GONE);
                    mAnswer2.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
    public void update()
    {

        if(mIndex==2)
        {
            mQuestion.setText(R.string.T2_Story);
            mAnswer1.setText(R.string.T2_Ans1);
            mAnswer2.setText(R.string.T2_Ans2);

        }
        else if(mIndex==4)
        {
            mQuestion.setText(R.string.T4_End);
            mAnswer1.setVisibility(View.GONE);
            mAnswer2.setVisibility(View.GONE);
        }
        if(mIndex==1 || mIndex==3)
        {
            mQuestion.setText(R.string.T3_Story);
            mAnswer1.setText(R.string.T3_Ans1);
            mAnswer2.setText(R.string.T3_Ans2);


        }
    }
}
