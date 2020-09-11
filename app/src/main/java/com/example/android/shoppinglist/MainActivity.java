package com.example.android.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;

    private TextView mCheeseTextView;
    private TextView mRiceTextView;
    private TextView mApplesTextView;
    private TextView mMilkTextView;
    private TextView mEggsTextView;
    private TextView mBreadTextView;
    private TextView mCoffeeTextView;
    private TextView mButterTextView;
    private TextView mChipsTextView;
    private TextView mBananasTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        mCheeseTextView = findViewById(R.id.item1);
        mRiceTextView = findViewById(R.id.item2);
        mApplesTextView = findViewById(R.id.item3);
        mMilkTextView = findViewById(R.id.item4);
        mEggsTextView = findViewById(R.id.item5);
        mBreadTextView = findViewById(R.id.item6);
        mCoffeeTextView = findViewById(R.id.item7);
        mButterTextView = findViewById(R.id.item8);
        mChipsTextView = findViewById(R.id.item9);
        mBananasTextView = findViewById(R.id.item10);

        if(savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if(isVisible) {
                mCheeseTextView.setText(savedInstanceState.getString("reply_text1"));
                mCheeseTextView.setVisibility(View.VISIBLE);

                mRiceTextView.setText(savedInstanceState.getString("reply_text2"));
                mRiceTextView.setVisibility(View.VISIBLE);

                mApplesTextView.setText(savedInstanceState.getString("reply_text3"));
                mApplesTextView.setVisibility(View.VISIBLE);

                mMilkTextView.setText(savedInstanceState.getString("reply_text4"));
                mMilkTextView.setVisibility(View.VISIBLE);

                mEggsTextView.setText(savedInstanceState.getString("reply_text5"));
                mEggsTextView.setVisibility(View.VISIBLE);

                mBreadTextView.setText(savedInstanceState.getString("reply_text6"));
                mBreadTextView.setVisibility(View.VISIBLE);

                mCoffeeTextView.setText(savedInstanceState.getString("reply_text7"));
                mCoffeeTextView.setVisibility(View.VISIBLE);

                mButterTextView.setText(savedInstanceState.getString("reply_text8"));
                mButterTextView.setVisibility(View.VISIBLE);

                mChipsTextView.setText(savedInstanceState.getString("reply_text9"));
                mChipsTextView.setVisibility(View.VISIBLE);

                mBananasTextView.setText(savedInstanceState.getString("reply_text10"));
                mBananasTextView.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mCheeseTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text1", mCheeseTextView.getText().toString());
        }
        if (mRiceTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text2", mRiceTextView.getText().toString());
        }
        if (mApplesTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text3", mApplesTextView.getText().toString());
        }
        if (mMilkTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text4", mMilkTextView.getText().toString());
        }
        if (mEggsTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text5", mEggsTextView.getText().toString());
        }
        if (mBreadTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text6", mEggsTextView.getText().toString());
        }
        if (mCoffeeTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text7", mCoffeeTextView.getText().toString());
        }
        if (mButterTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text8", mButterTextView.getText().toString());
        }
        if (mChipsTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text9", mChipsTextView.getText().toString());
        }
        if (mBananasTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text10", mBananasTextView.getText().toString());
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST) {
            if(resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                if(reply.equals("Cheese")) {
                    mCheeseTextView.setText(reply);
                    mCheeseTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Rice")) {
                    mRiceTextView.setText(reply);
                    mRiceTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Apples")) {
                    mApplesTextView.setText(reply);
                    mApplesTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Milk")) {
                    mMilkTextView.setText(reply);
                    mMilkTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Eggs")) {
                    mEggsTextView.setText(reply);
                    mEggsTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Bread")) {
                    mBreadTextView.setText(reply);
                    mBreadTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Coffee")) {
                    mCoffeeTextView.setText(reply);
                    mCoffeeTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Butter")) {
                    mButterTextView.setText(reply);
                    mButterTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Chips")) {
                    mChipsTextView.setText(reply);
                    mChipsTextView.setVisibility(View.VISIBLE);
                }
                if(reply.equals("Bananas")) {
                    mBananasTextView.setText(reply);
                    mBananasTextView.setVisibility(View.VISIBLE);
                }
            }
        }
    }
}