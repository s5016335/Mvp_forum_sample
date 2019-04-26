package com.example.jiancheng.mvpmodel.Discuss;

import com.example.jiancheng.mvpmodel.Model.Api.RetrofyManage;
import com.example.jiancheng.mvpmodel.Model.Api.Webservice;
import com.example.jiancheng.mvpmodel.Model.Content;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class DiscussPresenter implements DiscussContract.Presenter {

    private CompositeDisposable compositeDisposable;
    private DiscussContract.View view;
    Webservice webservice = RetrofyManage.getWebservice();


    public DiscussPresenter(DiscussContract.View view) {
        this.view = view;
        compositeDisposable=new CompositeDisposable();
        view.setPresenter(this);

    }

    @Override
    public void subscribe() {
        loadDiscussLists();
    }

    @Override
    public void loadDiscussLists() {
        compositeDisposable.add(webservice.getConversation()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<Content>>() {
                    @Override
                    public void accept(List<Content> contents) throws Exception {

                        view.onDiscussListsLoaded(contents);
                    }
                }));


    }



    @Override
    public void unsubscribe() {
        compositeDisposable.clear();
    }

}
