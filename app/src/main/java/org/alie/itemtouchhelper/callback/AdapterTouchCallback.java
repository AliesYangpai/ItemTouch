package org.alie.itemtouchhelper.callback;

/**
 * Created by Alie on 2019/5/7.
 * 类描述
 * 版本
 */
public interface AdapterTouchCallback {

    void onDragCallback(int startPosition, int targetPosition);

    void onSwipeCallback(int position);
}
