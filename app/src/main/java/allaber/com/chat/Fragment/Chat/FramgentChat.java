package allaber.com.chat.Fragment.Chat;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import allaber.com.chat.Interface.NextFragment;
import allaber.com.chat.R;

public class FramgentChat extends Fragment implements View.OnClickListener {

    private NextFragment nextFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
        return rootView;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof NextFragment) {
            nextFragment = (NextFragment) context;
        }
    }
}
