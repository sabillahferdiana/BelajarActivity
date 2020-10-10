package pens.lab.app.belajaractivity.modul.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;


public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void tampilView();
    }

    interface Presenter extends BasePresenter {

    }
}
