package com.apjoex.nigeriamap;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.flexbox.AlignContent;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayout;
import com.sdsmdg.harjot.vectormaster.VectorMasterDrawable;

import java.util.ArrayList;

/**
 * Created by apjoex on 08/01/2018.
 */


public class NigeriaMap extends LinearLayout {

    private Context mContext;
    protected VectorMasterDrawable vectorMasterDrawable;

    private States states;
    private ArrayList<State> allStates = new ArrayList<>();

    public Zones zones;
    private ArrayList<Zone> allZones;

    public TextView title;
    private ImageView containerImg;
    private FlexboxLayout legendBox;

    private boolean isLegendShown = false;

    public NigeriaMap(Context context) {
        super(context);
        initialize(context, null);
    }

    public NigeriaMap(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context, attrs);
    }

    public NigeriaMap(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs);
    }

    private void initialize(Context context, AttributeSet attrs) {

        mContext = context;

        inflate(context, R.layout.map_view, this);

        containerImg = findViewById(R.id.containerImg);
        title = findViewById(R.id.label);
        legendBox = findViewById(R.id.legendBox);

        legendBox.setFlexWrap(FlexWrap.WRAP);
        legendBox.setAlignItems(AlignItems.STRETCH);
        legendBox.setAlignContent(AlignContent.STRETCH);

        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.NigeriaMap);

            Boolean titleStatus = typedArray.getBoolean(R.styleable.NigeriaMap_showTitle, true);
            if (titleStatus) {
                showTitle();
            } else {
                hideTitle();
            }

            Boolean legendStatus = typedArray.getBoolean(R.styleable.NigeriaMap_showLegend, true);
            if (legendStatus) {
                showLegend();
            } else {
                hideLegend();
            }

            String title = typedArray.getString(R.styleable.NigeriaMap_title);
            if (title != null && !title.isEmpty()) {
                this.title.setText(title);
            }

            typedArray.recycle();
        }

    }

    @Override
    protected void onFinishInflate() {

        super.onFinishInflate();

        vectorMasterDrawable = new VectorMasterDrawable(mContext, R.drawable.map);
        containerImg.setImageDrawable(vectorMasterDrawable);

        states = new States(vectorMasterDrawable, this);
        allStates = states.getAllStates();

        zones = new Zones(allStates, this);
        allZones = zones.getAllZones();

        hideLegend();
        updateLegend();

    }

    public void goColoured() {
        VectorMasterDrawable drawable = new VectorMasterDrawable(mContext, R.drawable.map);
        containerImg.setImageDrawable(drawable);
        vectorMasterDrawable = drawable;
        vectorMasterDrawable.update();
    }

    public void goGreyScale() {
        for (State state : allStates) {
            state.pathModel.setStrokeColor(Color.BLACK);
            state.pathModel.setFillColor(Color.parseColor(getResources().getString(R.string.disabledState)));
        }
    }

    public void hideTitle() {
        title.setVisibility(GONE);
    }

    public void showTitle() {
        title.setVisibility(VISIBLE);
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void showBorders() {
        for (State s : allStates) {
            s.pathModel.setStrokeAlpha(1.0f);
        }
    }

    public void hideBorders() {
        for (State s : allStates) {
            s.pathModel.setStrokeAlpha(0.0f);
        }
    }

    public void showLegend() {
        isLegendShown = true;
        legendBox.setVisibility(VISIBLE);
    }

    public void hideLegend() {
        isLegendShown = false;
        legendBox.setVisibility(GONE);
    }

    public void updateLegend() {
        vectorMasterDrawable.update();
        legendBox.removeAllViews();
        for (State s : allStates) {
            if (s.pathModel.getFillColor() != Color.parseColor(getResources().getString(R.string.disabledState))) {
                TextView mStateLegend = new TextView(mContext);
                mStateLegend.setTextSize(12);
                mStateLegend.setText("■ " + s.name + "   ", TextView.BufferType.SPANNABLE);
                mStateLegend.setGravity(Gravity.CENTER);
                Spannable span = (Spannable) mStateLegend.getText();
                span.setSpan(new ForegroundColorSpan(s.pathModel.getFillColor()), 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                legendBox.addView(mStateLegend);
            }
        }
        if (isLegendShown) {
            showLegend();
        }

    }


}
