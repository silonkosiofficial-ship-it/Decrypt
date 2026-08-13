package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f42835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42840f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42841g = true;

    public g(android.view.View view) {
        this.f42835a = view;
    }

    void a() {
        android.view.View view = this.f42835a;
        androidx.core.view.X.Y(view, this.f42838d - (view.getTop() - this.f42836b));
        android.view.View view2 = this.f42835a;
        androidx.core.view.X.X(view2, this.f42839e - (view2.getLeft() - this.f42837c));
    }

    public int b() {
        return this.f42838d;
    }

    void c() {
        this.f42836b = this.f42835a.getTop();
        this.f42837c = this.f42835a.getLeft();
    }

    public boolean d(int i6) {
        if (!this.f42841g || this.f42839e == i6) {
            return false;
        }
        this.f42839e = i6;
        a();
        return true;
    }

    public boolean e(int i6) {
        if (!this.f42840f || this.f42838d == i6) {
            return false;
        }
        this.f42838d = i6;
        a();
        return true;
    }
}
