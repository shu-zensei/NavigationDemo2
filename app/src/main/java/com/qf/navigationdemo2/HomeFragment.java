package com.qf.navigationdemo2;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /**
         * public View inflate(XmlPullParser parser, ViewGroup root, boolean attachToRoot)
         *
         * inflate方法的主要作用就是将xml转换成一个View对象，用于动态的创建布局。
         * parser : 要加载的xml 资源 ID，例如：R.layout.main_page
         * root : 如果下面的参数 attachToRoot 值为 true，则 root 就是即将生成的视图的父 View; 如果 attachToRoot 值为 false，则 root 给即将生成的视图提供 LayoutParams
         *        一般都是false
         * attachToRoot : attachToRoot 是否将载入的视图绑定到根视图中
         */
        View View = inflater.inflate(R.layout.fragment_home, container, false);
        Button button = View.findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = View.findViewById(R.id.editText1);
                String text = editText.getText().toString();
                if (TextUtils.isEmpty(text)){
                    Toast.makeText(getActivity(), "名前を入力してください", Toast.LENGTH_SHORT).show();
                    return;
                }

                Bundle bundle = new Bundle();
                bundle.putString("my_name",text);

                //fragment跳转
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_detailFragment, bundle);
            }
        });

        return View;
    }


}