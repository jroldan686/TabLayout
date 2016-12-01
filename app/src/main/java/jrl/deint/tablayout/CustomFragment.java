package jrl.deint.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CustomFragment extends Fragment {
    public final static String KEY_REG_TEXT = "text";
    TextView txvNameTab;

    public static Fragment newInstance (Bundle arguments) {
        CustomFragment customFragment = new CustomFragment();
        if(arguments != null) {
            customFragment.setArguments(arguments);
        }
        return customFragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        if(view != null) {
            txvNameTab = (TextView)view.findViewById(R.id.txvNameTab);
            txvNameTab.setText(getArguments().getString(KEY_REG_TEXT));
        }

        return view;
    }
}
