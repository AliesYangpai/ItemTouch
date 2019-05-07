package org.alie.itemtouchhelper.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.alie.itemtouchhelper.R;
import org.alie.itemtouchhelper.callback.AdapterTouchCallback;
import org.alie.itemtouchhelper.entity.Student;
import org.alie.itemtouchhelper.viewholder.MyViewHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alie on 2019/5/7.
 * 类描述
 * 版本
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements AdapterTouchCallback {

    private List<Student> list;

    public void setData(List<Student> students) {
        if(null == students) {
            students = new ArrayList<>();
        }
        this.list = students;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Student student = list.get(position);
        holder.iv_logo.setImageResource(student.getLogo());
        holder.tv_title.setText(student.getTitle());
        holder.tv_content.setText(student.getContent());
    }

    @Override
    public int getItemCount() {
        if(null != list && list.size() > 0) {
            return list.size();
        }
        return 0;
    }

    @Override
    public void onDragCallback(int startPosition, int targetPosition) {
        Collections.swap(list,startPosition,targetPosition);
        notifyItemMoved(startPosition,targetPosition);
    }

    @Override
    public void onSwipeCallback(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }
}
