package www.com.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import www.com.MainActivity;
import www.com.R;
import www.com.bean.ListBean;

/**
 * Name:  The.xue
 * Date  2019-05-13
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    Context context;
    List<ListBean.ItemsBean> result;
    private View view;

    public void ListAdapter(Context context, List<ListBean.ItemsBean> result){
        this.context = context;
        this.result = result;
    }

    @NonNull
    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view = View.inflate(context, R.layout.list_adapter, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.mTitle.setText(result.get(i).getTitle());
        Glide.with(view).load(result.get(i).getImage()).into(myViewHolder.mImage);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ImageView mImage;
        private final TextView mTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.image);
            mTitle = itemView.findViewById(R.id.tv_title);

        }
    }
}
