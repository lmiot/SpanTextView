package com.limot.spantextviewlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Mr Li  on 2017/4/5.
 */

public class SpanTextView extends TextView {

    private int mColor01;
    private int mColor02;
    private int mSize01;
    private int mSize02;
    private String mText01;
    private String mText02;

    public SpanTextView(Context context) {
        super(context);
    }

    public SpanTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initData(attrs);
    }

    /**
     * 初始化数据，把属性找出来
     * @param attrs
     */
    private void initData(AttributeSet attrs) {
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.SpanTextView, 0, 0);
        mColor01 = typedArray.getColor(R.styleable.SpanTextView_color01, Color.BLACK);
        mColor02 = typedArray.getColor(R.styleable.SpanTextView_color02, Color.BLACK);
        mSize01 = typedArray.getInt(R.styleable.SpanTextView_size01, 10);
        mSize02 = typedArray.getInt(R.styleable.SpanTextView_size02, 10);
        mText01 = typedArray.getString(R.styleable.SpanTextView_text01);
        mText02 = typedArray.getString(R.styleable.SpanTextView_text02);

        ShowText();


    }

    /**
     * 设置颜色1
     * @param color01
     */
    public void setColor01(int color01){
        mColor01=color01;
        ShowText();

    }

    /**
     * 设置颜色2
     * @param color02
     */
    public void setColor02(int color02){
        mColor02=color02;
        ShowText();

    }

    /**
     * 设置字体大小1
     * @param size01
     */
    public void setSize01(int size01){
        mSize01=size01;
        ShowText();

    }
    /**
     * 设置字体大小2
     * @param size02
     */
    public void setSize02(int size02){
        mSize02=size02;
        ShowText();

    }

    /**
     * 设置字体01
     * @param text01
     */
    public void setText01(String text01){
        mText01=text01;
        ShowText();

    }

    /**
     * 设置字体02
     * @param text02
     */
    public void setText02(String text02){
        mText02=text02;
        ShowText();

    }


    /**
     * 显示字体
     */
    public void ShowText() {

        try {
            Spannable sp = new SpannableString(mText01 + mText02);
            sp.setSpan(new ForegroundColorSpan(mColor01), 0, mText01.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            sp.setSpan(new ForegroundColorSpan(mColor02), mText01.length(), mText01.length() + mText02.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);

            sp.setSpan(new AbsoluteSizeSpan(mSize01, true), 0, mText01.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            sp.setSpan(new AbsoluteSizeSpan(mSize02, true), mText01.length(), mText01.length() + mText02.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);

            setText(sp);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
