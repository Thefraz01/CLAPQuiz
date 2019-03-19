package com.example.CodeProject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity {

    private boolean mIsInit = false;
    private RadioButton mRbtnDegF;
    private RadioButton mRbtnDegC;


    //*all new down below:
    private Button btnQuiz;
    private Button mBtnCookAndHold;
    private Button mBtnRetherm;
    private TextView mSetTempScaleTxt;
    private RadioGroup mUseTempScale;
    private TextView mEqTypeTxt;

    //*all below are timer only selections

    private RadioButton mRbtnTmrOnly;
    private RadioButton mRbtnStandard;
    private TextView mSetChannelModeTxt;

    private final int NUMBER_CHANNELS = 8;

    private Button[] mButtons = new Button[NUMBER_CHANNELS];
    //*private ChannelData[] mChannelData = new ChannelData[NUMBER_CHANNELS];
    private int mChannel;

    private Button mBtnReset;



    private int getButtonIndex(View v) {
        int i = -1;

        if (v == findViewById(R.id.btnCah1))
            i = 0;
        else if (v == findViewById(R.id.btnCah2))
            i = 1;
        else if (v == findViewById(R.id.btnCah3))
            i = 2;
        else if (v == findViewById(R.id.btnCah4))
            i = 3;
        else if (v == findViewById(R.id.btnCah5))
            i = 4;
        else if (v == findViewById(R.id.btnCah6))
            i = 5;
        else if (v == findViewById(R.id.btnCah7))
            i = 6;
        else if (v == findViewById(R.id.btnCah8))
            i = 7;

        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);



        //*openChannelDataFromFile();

        // Populate the button array with the actual button instances so that they can be indexed.
        mButtons[0] = findViewById(R.id.btnCah1);
        mButtons[1] = findViewById(R.id.btnCah2);
        mButtons[2] = findViewById(R.id.btnCah3);
        mButtons[3] = findViewById(R.id.btnCah4);
        mButtons[4] = findViewById(R.id.btnCah5);
        mButtons[5] = findViewById(R.id.btnCah6);
        mButtons[6] = findViewById(R.id.btnCah7);
        mButtons[7] = findViewById(R.id.btnCah8);
        // Set up each button.
        /*for (int i = 0; i < NUMBER_CHANNELS; i++) {
            mButtons[i].setOnClickListener(proClick);
            ChannelData ch = mChannelData[i];
            // Only create new channel if it hasn't already been created.
            if (ch == null)
                ch = new ChannelData(DEFAULT_NAME, DEFAULT_USE_COOK, DEFAULT_USE_VAPOR_COOK, DEFAULT_USE_AIR_COOK,
                        DEFAULT_USE_COOK_TIME, DEFAULT_USE_PROBE, DEFAULT_TEMP_PROBE, DEFAULT_TEMP_COOK_VAPOR, DEFAULT_TEMP_COOK_AIR, DEFAULT_COOK_TIME,
                        DEFAULT_USE_HIGH_YIELD, DEFAULT_USE_CONVECTION_COOK, DEFAULT_USE_VAP_TEMP_HOLDING, DEFAULT_USE_AIR_TEMP_HOLD, DEFAULT_USE_HOLD_TIME,
                        DEFAULT_TEMP_HOLD_VAPOR, DEFAULT_TEMP_HOLD_AIR, DEFAULT_HOLD_TIME,
                        DEFAULT_USE_CONVECTION_HOLD,
                        DEFAULT_USE_SOUS_VIDE_COOK, DEFAULT_USE_SOUS_VIDE_HOLD, DEFAULT_COOK_HOURS, DEFAULT_COOK_MINUTES, DEFAULT_HOLD_HOURS,DEFAULT_HOLD_MINUTES, DEFAULT_USE_HOLD_ONLY,
                        DEFAULT_USE_DISABLED_HOLD );
            mChannelData[i] = ch;


        }



        updateButtonNames();

        // Set up the transfer data button.
        mBtnSend = findViewById(R.id.btnSendChannels);
        mBtnSend.setOnClickListener(sendClick);
        // Set up the reset data button.
        mBtnReset = findViewById(R.id.btnResetChannels);
        mBtnReset.setOnClickListener(resetClick);*/




    }











}




