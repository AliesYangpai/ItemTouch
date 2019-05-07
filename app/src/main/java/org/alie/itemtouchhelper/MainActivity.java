package org.alie.itemtouchhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import org.alie.itemtouchhelper.adapter.MyAdapter;
import org.alie.itemtouchhelper.callback.ItemTouchDragCallback;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private MyAdapter myAdapter;
    private ItemTouchHelper itemTouchHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        initData();
    }

    private void initView() {
        rv = findViewById(R.id.rv);
        myAdapter = new MyAdapter();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(myAdapter);
        itemTouchHelper = new ItemTouchHelper(new ItemTouchDragCallback(myAdapter));
        itemTouchHelper.attachToRecyclerView(rv);
    }

    private void initListener() {
    }

    private void initData() {
        myAdapter.setData(Const.GET_STUDENT());
    }
}
