package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5619wv implements com.google.android.gms.internal.ads.InterfaceC2954Vu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.C2809Rt f39715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.C2809Rt f39716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2809Rt f39717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2809Rt f39718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.nio.ByteBuffer f39719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.nio.ByteBuffer f39720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39721h;

    public AbstractC5619wv() {
        java.nio.ByteBuffer byteBuffer = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        this.f39719f = byteBuffer;
        this.f39720g = byteBuffer;
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = com.google.android.gms.internal.ads.C2809Rt.f31383e;
        this.f39717d = c2809Rt;
        this.f39718e = c2809Rt;
        this.f39715b = c2809Rt;
        this.f39716c = c2809Rt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public java.nio.ByteBuffer b() {
        java.nio.ByteBuffer byteBuffer = this.f39720g;
        this.f39720g = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void c() {
        this.f39720g = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        this.f39721h = false;
        this.f39715b = this.f39717d;
        this.f39716c = this.f39718e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final com.google.android.gms.internal.ads.C2809Rt d(com.google.android.gms.internal.ads.C2809Rt c2809Rt) {
        this.f39717d = c2809Rt;
        this.f39718e = h(c2809Rt);
        return i() ? this.f39718e : com.google.android.gms.internal.ads.C2809Rt.f31383e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void e() {
        c();
        this.f39719f = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        com.google.android.gms.internal.ads.C2809Rt c2809Rt = com.google.android.gms.internal.ads.C2809Rt.f31383e;
        this.f39717d = c2809Rt;
        this.f39718e = c2809Rt;
        this.f39715b = c2809Rt;
        this.f39716c = c2809Rt;
        m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void f() {
        this.f39721h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public boolean g() {
        return this.f39721h && this.f39720g == com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
    }

    protected abstract com.google.android.gms.internal.ads.C2809Rt h(com.google.android.gms.internal.ads.C2809Rt c2809Rt);

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public boolean i() {
        return this.f39718e != com.google.android.gms.internal.ads.C2809Rt.f31383e;
    }

    protected final java.nio.ByteBuffer j(int i6) {
        if (this.f39719f.capacity() < i6) {
            this.f39719f = java.nio.ByteBuffer.allocateDirect(i6).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.f39719f.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.f39719f;
        this.f39720g = byteBuffer;
        return byteBuffer;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }

    protected final boolean n() {
        return this.f39720g.hasRemaining();
    }
}
