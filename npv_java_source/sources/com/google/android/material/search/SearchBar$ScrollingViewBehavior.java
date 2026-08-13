package com.google.android.material.search;

/* JADX INFO: loaded from: classes3.dex */
public class SearchBar$ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f43554h;

    public SearchBar$ScrollingViewBehavior() {
        this.f43554h = false;
    }

    public SearchBar$ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43554h = false;
    }

    private void U(com.google.android.material.appbar.AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.e
    protected boolean P() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        boolean zH = super.h(coordinatorLayout, view, view2);
        if (!this.f43554h && (view2 instanceof com.google.android.material.appbar.AppBarLayout)) {
            this.f43554h = true;
            U((com.google.android.material.appbar.AppBarLayout) view2);
        }
        return zH;
    }
}
