// Generated by view binder compiler. Do not edit!
package com.example.tictactoeonline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tictactoeonline.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGameBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btn0;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btn2;

  @NonNull
  public final Button btn3;

  @NonNull
  public final Button btn4;

  @NonNull
  public final Button btn5;

  @NonNull
  public final Button btn6;

  @NonNull
  public final Button btn7;

  @NonNull
  public final Button btn8;

  @NonNull
  public final TextView gameStatusText;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final Button startGameBtn;

  private ActivityGameBinding(@NonNull LinearLayout rootView, @NonNull Button btn0,
      @NonNull Button btn1, @NonNull Button btn2, @NonNull Button btn3, @NonNull Button btn4,
      @NonNull Button btn5, @NonNull Button btn6, @NonNull Button btn7, @NonNull Button btn8,
      @NonNull TextView gameStatusText, @NonNull LinearLayout main, @NonNull Button startGameBtn) {
    this.rootView = rootView;
    this.btn0 = btn0;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btn5 = btn5;
    this.btn6 = btn6;
    this.btn7 = btn7;
    this.btn8 = btn8;
    this.gameStatusText = gameStatusText;
    this.main = main;
    this.startGameBtn = startGameBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_game, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_0;
      Button btn0 = ViewBindings.findChildViewById(rootView, id);
      if (btn0 == null) {
        break missingId;
      }

      id = R.id.btn_1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn_2;
      Button btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.btn_3;
      Button btn3 = ViewBindings.findChildViewById(rootView, id);
      if (btn3 == null) {
        break missingId;
      }

      id = R.id.btn_4;
      Button btn4 = ViewBindings.findChildViewById(rootView, id);
      if (btn4 == null) {
        break missingId;
      }

      id = R.id.btn_5;
      Button btn5 = ViewBindings.findChildViewById(rootView, id);
      if (btn5 == null) {
        break missingId;
      }

      id = R.id.btn_6;
      Button btn6 = ViewBindings.findChildViewById(rootView, id);
      if (btn6 == null) {
        break missingId;
      }

      id = R.id.btn_7;
      Button btn7 = ViewBindings.findChildViewById(rootView, id);
      if (btn7 == null) {
        break missingId;
      }

      id = R.id.btn_8;
      Button btn8 = ViewBindings.findChildViewById(rootView, id);
      if (btn8 == null) {
        break missingId;
      }

      id = R.id.game_status_text;
      TextView gameStatusText = ViewBindings.findChildViewById(rootView, id);
      if (gameStatusText == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.start_game_btn;
      Button startGameBtn = ViewBindings.findChildViewById(rootView, id);
      if (startGameBtn == null) {
        break missingId;
      }

      return new ActivityGameBinding((LinearLayout) rootView, btn0, btn1, btn2, btn3, btn4, btn5,
          btn6, btn7, btn8, gameStatusText, main, startGameBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}