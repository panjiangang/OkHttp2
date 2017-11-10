package app.com.okhttp.presenter;

import app.com.okhttp.MainActivity;
import app.com.okhttp.MultiBean;
import app.com.okhttp.MultiIView;
import app.com.okhttp.module.MultilActivityModule;

/**
 * Created by muhanxi on 17/11/10.
 */

public class MultilActivityPresenter {


    private MultiIView view;
    private MultilActivityModule multilActivityModule;

    public MultilActivityPresenter(MainActivity view) {
        this.view = view;
        this.multilActivityModule = new MultilActivityModule();
    }


    /**
     * 下啦刷新
     */
    public void onRefresh(boolean up) {

        multilActivityModule.onRefresh(up, new MultilActivityModule.ModuleCallBack() {
            @Override
            public void success(MultiBean bean) {
                view.success(bean);
            }

            @Override
            public void failure(Exception e) {

                view.failure(e);
            }
        });


    }


}
