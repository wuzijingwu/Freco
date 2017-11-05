package text.bwei.com.wuzijing123.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import text.bwei.com.wuzijing123.R;
import text.bwei.com.wuzijing123.bean.News;

/**
 * Created by dell on 2017/11/4.
 */

public class MyAdapter extends RecyclerView.Adapter {

    private MyViewHolder myViewHolder;
    List<News.DataBean> list;


    public MyAdapter(List<News.DataBean> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        myViewHolder = (MyViewHolder) holder;
        myViewHolder.textView.setText(list.get(position).getNews_title());
        ImageLoader.getInstance().displayImage(list.get(position).getPic_url(), myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        private final ImageView imageView;
        private final TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text22);
            imageView = itemView.findViewById(R.id.imagess);


        }
    }


}
