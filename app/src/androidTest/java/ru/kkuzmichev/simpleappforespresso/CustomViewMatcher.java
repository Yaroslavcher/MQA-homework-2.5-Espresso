package ru.kkuzmichev.simpleappforespresso;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.matcher.BoundedMatcher;

import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class CustomViewMatcher {
        public static Matcher<View> recyclerViewSizeMatcher(int size) {
            return new BoundedMatcher<View, RecyclerView>(RecyclerView.class) {
                String result;
                @Override
                protected boolean matchesSafety(RecyclerView item) {
                    int items = item.getAdapter().getItemCount();
                    result = "List size: " + items;
                    return size == items;
                }


                @Override
                public void describeTo(Description description) {
                    description.appendText("List size: " + size);
                }

            };
        }
}