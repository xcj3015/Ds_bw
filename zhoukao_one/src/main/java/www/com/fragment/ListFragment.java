package www.com.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.util.List;

import www.com.R;
import www.com.adapter.ListAdapter;
import www.com.bean.ListBean;
import www.com.mvp.presenter.PresenterIml;

/**
 * Name:  The.xue
 * Date  2019-05-10
 */
public class ListFragment extends Fragment {

    private RecyclerView recycler;
    private PresenterIml presenterIml;
    private ListAdapter listadapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getContext(), R.layout.list_fragment, null);

        recycler = view.findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(linearLayoutManager);

        presenterIml = new PresenterIml(this);
        presenterIml.doCommodity();
        return view;
    }

    public void getCommodity(String data) {
        getActivity().runOnUiThread(new Runnable() {

            @Override
            public void run() {
                Gson gson =new Gson();
                ListBean listBean = gson.fromJson(data, ListBean.class);
                List<ListBean.ResultBean> list = listBean.getResult();
                listadapter = new ListAdapter(getActivity(),list);
                recycler.setAdapter(listadapter);
            }
        });
    }
}
