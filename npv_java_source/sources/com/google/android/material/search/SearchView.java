package com.google.android.material.search;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchView extends android.widget.FrameLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean E(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.search.SearchView searchView, android.view.View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            androidx.appcompat.app.D.a(view);
            return E(coordinatorLayout, null, view2);
        }
    }
}
