package com.example.jiancheng.mvpmodel.Discuss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jiancheng.mvpmodel.Model.Content;
import com.example.jiancheng.mvpmodel.R;

import java.util.List;

public class DiscussActivity extends AppCompatActivity implements DiscussContract.View{


    DiscussContract.Presenter mpresenter;
    ContentAdapter contentAdapter;
    RecyclerView conversation_recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discuss);

        new DiscussPresenter(this).subscribe();
        conversation_recycle=(RecyclerView) findViewById(R.id.conversation_recycle);
        conversation_recycle.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void onDiscussListsLoaded(List<Content> contents) {
        contentAdapter = new ContentAdapter(contents);
        conversation_recycle.setAdapter(contentAdapter);
    }

    @Override
    public void setPresenter(DiscussContract.Presenter Presenter) {
         mpresenter=Presenter;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mpresenter.unsubscribe();
    }
}
