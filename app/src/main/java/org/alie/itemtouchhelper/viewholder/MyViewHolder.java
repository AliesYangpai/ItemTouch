package org.alie.itemtouchhelper.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.alie.itemtouchhelper.R;

/**
 * Created by Alie on 2019/5/7.
 * 类描述
 * 版本
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView iv_logo;
    public TextView tv_title;
    public TextView tv_time;
    public TextView tv_content;
    public ImageView iv_pop;


    public MyViewHolder(View itemView) {
        super(itemView);
        iv_logo = itemView.findViewById(R.id.iv_logo);
        tv_title = itemView.findViewById(R.id.tv_title);
        tv_time = itemView.findViewById(R.id.tv_time);
        tv_content = itemView.findViewById(R.id.tv_content);
        iv_pop = itemView.findViewById(R.id.iv_pop);
    }
}
