package text.bwei.com.myapplication.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import text.bwei.com.myapplication.R;
import text.bwei.com.myapplication.bean.News;

/**
 * Created by dell on 2017/11/5.
 */

public class Myadpater extends RecyclerView.Adapter {


    private MyViewHolder myViewHolder;
    List<News.DataBean> list;

    public Myadpater(List<News.DataBean> list) {
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
//        ImageLoader.getInstance().displayImage(list.get(position).getPic_url(),myViewHolder.imageView);
        Uri imgUrl = Uri.parse(list.get(position).getPic_url());
        myViewHolder.urlImg.setImageURI(imgUrl);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        private final TextView textView;
        private final SimpleDraweeView urlImg;
        //        private final ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
//            imageView = itemView.findViewById(R.id.image);
            urlImg = itemView.findViewById(R.id.image);
        }
    }


}
