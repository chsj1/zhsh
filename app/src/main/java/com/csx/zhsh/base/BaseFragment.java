package com.csx.zhsh.base;

import android.annotation.TargetApi;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment基类
 * 1. 初始化布局 initView
 * 2. 初始化数据 initData
 * 
 * @author csx
 */
public abstract class BaseFragment extends Fragment {

	public Activity mActivity;

	// Fragment被创建
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mActivity = getActivity();// 获取所在的activity对象
	}

	// 初始化Fragment布局
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = initView();
		return view;
	}

	// activity创建结束
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		initData();
	}

	/**
	 * 初始化布局, 子类必须实现
	 */
	public abstract View initView();

	/**
	 * 初始化数据, 子类可以不实现
	 */
	public void initData() {

	}
}
