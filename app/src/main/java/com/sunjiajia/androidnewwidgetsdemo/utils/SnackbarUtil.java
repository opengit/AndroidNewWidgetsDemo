/*
 *
 *  *
 *  *  *
 *  *  *  * ===================================
 *  *  *  * Copyright (c) 2016.
 *  *  *  * 作者：安卓猴
 *  *  *  * 微博：@安卓猴
 *  *  *  * 博客：http://sunjiajia.com
 *  *  *  * Github：https://github.com/opengit
 *  *  *  *
 *  *  *  * 注意**：如果您使用或者修改该代码，请务必保留此版权信息。
 *  *  *  * ===================================
 *  *  *
 *  *  *
 *  *
 *
 */

package com.sunjiajia.androidnewwidgetsdemo.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

import com.sunjiajia.androidnewwidgetsdemo.R;

/**
 * Created by Monkey on 2015/7/1.
 */
public class SnackbarUtil {

  // android-support-design兼容包中新添加的一个类似Toast的控件。
  // make()中的第一个参数，可以写当前界面中的任意一个view对象。
  private static Snackbar mSnackbar;

  public static void show(View view, String msg, int flag) {

    if (flag == 0) { // 短时显示
      mSnackbar = Snackbar.make(view, msg, Snackbar.LENGTH_SHORT);
    } else { // 长时显示
      mSnackbar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG);
    }

    mSnackbar.show();
    // Snackbar中有一个可点击的文字，这里设置点击所触发的操作。
    mSnackbar.setAction(R.string.close, new View.OnClickListener() {
      @Override public void onClick(View v) {
        // Snackbar在点击“关闭”后消失
        mSnackbar.dismiss();
      }
    });
  }
}
