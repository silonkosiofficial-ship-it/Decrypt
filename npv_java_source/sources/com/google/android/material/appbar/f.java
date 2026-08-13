package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
abstract class f extends androidx.coordinatorlayout.widget.CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.appbar.g f42832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42834c;

    public f() {
        this.f42833b = 0;
        this.f42834c = 0;
    }

    public f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42833b = 0;
        this.f42834c = 0;
    }

    public int E() {
        com.google.android.material.appbar.g gVar = this.f42832a;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    protected void F(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        coordinatorLayout.I(view, i6);
    }

    public boolean G(int i6) {
        com.google.android.material.appbar.g gVar = this.f42832a;
        if (gVar != null) {
            return gVar.e(i6);
        }
        this.f42833b = i6;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i6) {
        F(coordinatorLayout, view, i6);
        if (this.f42832a == null) {
            this.f42832a = new com.google.android.material.appbar.g(view);
        }
        this.f42832a.c();
        this.f42832a.a();
        int i10 = this.f42833b;
        if (i10 != 0) {
            this.f42832a.e(i10);
            this.f42833b = 0;
        }
        int i11 = this.f42834c;
        if (i11 == 0) {
            return true;
        }
        this.f42832a.d(i11);
        this.f42834c = 0;
        return true;
    }
}
