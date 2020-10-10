package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import pens.lab.app.belajaractivity.FirstActivity;
import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {
    TextView tvProfileEmail;
    TextView tvProfilePassword;
    Bundle bundle;

    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        tvProfileEmail = fragmentView.findViewById(R.id.tvProfileEmail);
        tvProfilePassword = fragmentView.findViewById(R.id.tvProfilePassword);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();
        tampilView();
        setTitle("Profile");
        return fragmentView;
    }

    public void tampilView(){
        if (bundle != null){
            String email = bundle.getString("email");
            tvProfileEmail.setText("Email kamu adalah = "+ email);

            String password = bundle.getString("password");
            tvProfilePassword.setText("Password kamu adalah = "+ password);
        }
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {

    }
}
