package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2915Ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f32293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3746fs f32294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.view.ViewGroup f32295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2879Tr f32296d;

    public C2915Ur(android.content.Context context, android.view.ViewGroup viewGroup, com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot) {
        this.f32293a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f32295c = viewGroup;
        this.f32294b = interfaceC2698Ot;
        this.f32296d = null;
    }

    public final com.google.android.gms.internal.ads.C2879Tr a() {
        return this.f32296d;
    }

    public final java.lang.Integer b() {
        com.google.android.gms.internal.ads.C2879Tr c2879Tr = this.f32296d;
        if (c2879Tr != null) {
            return c2879Tr.v();
        }
        return null;
    }

    public final void c(int i6, int i10, int i11, int i12) {
        Q3.AbstractC1477p.e("The underlay may only be modified from the UI thread.");
        com.google.android.gms.internal.ads.C2879Tr c2879Tr = this.f32296d;
        if (c2879Tr != null) {
            c2879Tr.n(i6, i10, i11, i12);
        }
    }

    public final void d(int i6, int i10, int i11, int i12, int i13, boolean z6, com.google.android.gms.internal.ads.C3636es c3636es) {
        if (this.f32296d != null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2420Hf.a(this.f32294b.m().a(), this.f32294b.k(), "vpr2");
        android.content.Context context = this.f32293a;
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = this.f32294b;
        com.google.android.gms.internal.ads.C2879Tr c2879Tr = new com.google.android.gms.internal.ads.C2879Tr(context, interfaceC3746fs, i13, z6, interfaceC3746fs.m().a(), c3636es);
        this.f32296d = c2879Tr;
        this.f32295c.addView(c2879Tr, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f32296d.n(i6, i10, i11, i12);
        this.f32294b.u0(false);
    }

    public final void e() {
        Q3.AbstractC1477p.e("onDestroy must be called from the UI thread.");
        com.google.android.gms.internal.ads.C2879Tr c2879Tr = this.f32296d;
        if (c2879Tr != null) {
            c2879Tr.y();
            this.f32295c.removeView(this.f32296d);
            this.f32296d = null;
        }
    }

    public final void f() {
        Q3.AbstractC1477p.e("onPause must be called from the UI thread.");
        com.google.android.gms.internal.ads.C2879Tr c2879Tr = this.f32296d;
        if (c2879Tr != null) {
            c2879Tr.E();
        }
    }

    public final void g(int i6) {
        com.google.android.gms.internal.ads.C2879Tr c2879Tr = this.f32296d;
        if (c2879Tr != null) {
            c2879Tr.j(i6);
        }
    }
}
