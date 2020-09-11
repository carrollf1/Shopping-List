package com.example.android.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.android.shoppinglist.extra.REPLY";
    private Button mCheese;
    private Button mRice;
    private Button mApples;
    private Button mMilk;
    private Button mEggs;
    private Button mBread;
    private Button mCoffee;
    private Button mButter;
    private Button mChips;
    private Button mBananas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mCheese = findViewById(R.id.cheese_btn);
        mRice = findViewById(R.id.rice_btn);
        mApples = findViewById(R.id.apples_btn);
        mMilk = findViewById(R.id.milk_btn);
        mEggs = findViewById(R.id.eggs_btn);
        mBread = findViewById(R.id.bread_btn);
        mCoffee = findViewById(R.id.coffee_btn);
        mButter = findViewById(R.id.butter_btn);
        mChips = findViewById(R.id.chips_btn);
        mBananas = findViewById(R.id.bananas_btn);
    }

    public void cheeseClicked(View view) {
        Log.d(LOG_TAG, "Cheese Button Clicked!");
        String reply = mCheese.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void riceClicked(View view) {
        Log.d(LOG_TAG, "Rice Button Clicked!");
        String reply = mRice.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void applesClicked(View view) {
        Log.d(LOG_TAG, "Apples Button Clicked!");
        String reply = mApples.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void milkClicked(View view) {
        Log.d(LOG_TAG, "Milk Button Clicked!");
        String reply = mMilk.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void eggsClicked(View view) {
        Log.d(LOG_TAG, "Eggs Button Clicked!");
        String reply = mEggs.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void breadClicked(View view) {
        Log.d(LOG_TAG, "Bread Button Clicked!");
        String reply = mBread.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void coffeeClicked(View view) {
        Log.d(LOG_TAG, "Coffee Button Clicked!");
        String reply = mCoffee.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void butterClicked(View view) {
        Log.d(LOG_TAG, "Butter Button Clicked!");
        String reply = mButter.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void chipsClicked(View view) {
        Log.d(LOG_TAG, "Chips Button Clicked!");
        String reply = mChips.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void bananasClicked(View view) {
        Log.d(LOG_TAG, "Bananas Button Clicked!");
        String reply = mBananas.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}