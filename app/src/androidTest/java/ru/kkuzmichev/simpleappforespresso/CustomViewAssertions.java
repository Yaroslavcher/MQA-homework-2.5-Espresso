package ru.kkuzmichev.simpleappforespresso;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.assertion.ViewAssertions;

public class CustomViewAssertions {
    public static ViewAssertion isRecyclerView() {
        return new ViewAssertion() {
            @Override
            public void check(View view, NoMatchingViewException noViewFoundException) {
                if (!(view instanceof RecyclerView))
                    throw new IllegalStateException("Это не RecyclerView");
            }
        };
    }
}
