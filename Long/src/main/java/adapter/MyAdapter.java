package adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.test.liumengxin201711042.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import bean.Mygson2;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：14:05
 * 用途：
 */
public class MyAdapter extends RecyclerView.Adapter {
    List<Mygson2.DataEntity> list;
    Context context;

    public MyAdapter(List<Mygson2.DataEntity> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder holder1 = (MyViewHolder) holder;
        holder1.title.setText(list.get(position).getTitle());


        Uri uri = Uri.parse(list.get(position).getImg());
        holder1.img.setImageURI(uri);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView img;
        TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.fr_img);
            title = itemView.findViewById(R.id.fr_title);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
