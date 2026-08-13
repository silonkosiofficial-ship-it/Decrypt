package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes3.dex */
final class a extends com.google.android.material.sidesheet.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.material.sidesheet.SideSheetBehavior f43588a;

    a(com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior) {
        this.f43588a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i6) {
        float fD = d();
        return (i6 - fD) / (c() - fD);
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return java.lang.Math.max(0, this.f43588a.f0() + this.f43588a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return (-this.f43588a.Y()) - this.f43588a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f43588a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return -this.f43588a.Y();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(android.view.View view) {
        return view.getRight() + this.f43588a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f6) {
        return f6 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(android.view.View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f6, float f10) {
        return com.google.android.material.sidesheet.d.a(f6, f10) && java.lang.Math.abs(f6) > ((float) this.f43588a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(android.view.View view, float f6) {
        return java.lang.Math.abs(((float) view.getLeft()) + (f6 * this.f43588a.b0())) > this.f43588a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i6, int i10) {
        if (i6 <= this.f43588a.g0()) {
            marginLayoutParams.leftMargin = i10;
        }
    }
}
