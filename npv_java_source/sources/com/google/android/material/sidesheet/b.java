package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes3.dex */
final class b extends com.google.android.material.sidesheet.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.material.sidesheet.SideSheetBehavior f43589a;

    b(com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior) {
        this.f43589a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i6) {
        float fD = d();
        return (fD - i6) / (fD - c());
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return java.lang.Math.max(0, (d() - this.f43589a.Y()) - this.f43589a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return this.f43589a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f43589a.g0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return c();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(android.view.View view) {
        return view.getLeft() - this.f43589a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f6) {
        return f6 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(android.view.View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f6, float f10) {
        return com.google.android.material.sidesheet.d.a(f6, f10) && java.lang.Math.abs(f6) > ((float) this.f43589a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(android.view.View view, float f6) {
        return java.lang.Math.abs(((float) view.getRight()) + (f6 * this.f43589a.b0())) > this.f43589a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i10) {
        int iG0 = this.f43589a.g0();
        if (i6 <= iG0) {
            marginLayoutParams.rightMargin = iG0 - i6;
        }
    }
}
