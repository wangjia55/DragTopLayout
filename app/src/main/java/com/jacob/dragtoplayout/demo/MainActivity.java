package com.jacob.dragtoplayout.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity {

    private DragTopLayout mDragTopLayout;
    private RelativeLayout mRelativeTopView;
    private RelativeLayout mRelativeContentView;
    private ListView mListView;
    private List<String> mListString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        mDragTopLayout = (DragTopLayout) findViewById(R.id.drag_top_layout);
        mRelativeTopView = (RelativeLayout) findViewById(R.id.relative_top_view);
        mRelativeContentView = (RelativeLayout) findViewById(R.id.relative_content_view);
        mListView = (ListView) findViewById(R.id.list_view);
        mListView.setAdapter(new ArrayAdapter<String>(getApplication(),
                R.layout.layout_list_item,mListString));
    }

    private void initData(){
        mListString = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mListString.add("Android Jacob "+i);
        }
    }


}
