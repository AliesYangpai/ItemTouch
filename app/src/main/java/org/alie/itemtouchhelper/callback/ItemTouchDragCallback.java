package org.alie.itemtouchhelper.callback;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by Alie on 2019/5/7.
 * 类描述 自定义的拖动类
 * 版本
 */
public class ItemTouchDragCallback extends ItemTouchHelper.Callback {

    private AdapterTouchCallback adapterTouchCallback;

    public ItemTouchDragCallback(AdapterTouchCallback adapterTouchCallback) {
        this.adapterTouchCallback = adapterTouchCallback;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlag = ItemTouchHelper.UP|ItemTouchHelper.DOWN;
        int swipeFlag = ItemTouchHelper.LEFT;
        return makeMovementFlags(dragFlag,swipeFlag);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        adapterTouchCallback.onDragCallback(viewHolder.getAdapterPosition(),target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        adapterTouchCallback.onSwipeCallback(viewHolder.getAdapterPosition());
    }
}
