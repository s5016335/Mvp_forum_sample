package com.example.jiancheng.mvpmodel.Discuss;

import com.example.jiancheng.mvpmodel.Model.Content;
import com.example.jiancheng.mvpmodel.base.BasePresenter;
import com.example.jiancheng.mvpmodel.base.BaseView;

import java.util.List;

public interface DiscussContract {

    interface View extends BaseView<Presenter> {
        void onDiscussListsLoaded(List<Content> contents);
    }


    interface Presenter extends BasePresenter {
        void loadDiscussLists();

    }
}
