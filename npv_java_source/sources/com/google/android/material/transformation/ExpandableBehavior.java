package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43911a;

    public ExpandableBehavior() {
        this.f43911a = 0;
    }

    public ExpandableBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43911a = 0;
    }

    protected p225w4.a E(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        java.util.List listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view2 = (android.view.View) listR.get(i6);
            if (e(coordinatorLayout, view, view2)) {
                androidx.appcompat.app.D.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        androidx.appcompat.app.D.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        if (androidx.core.view.X.R(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }
}
