package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2880Ts implements O3.i {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final android.content.Context f32023C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final java.lang.String f32024D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final java.lang.ref.WeakReference f32025E;

    public AbstractC2880Ts(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs) {
        android.content.Context context = interfaceC3746fs.getContext();
        this.f32023C = context;
        this.f32024D = p174r3.v.t().H(context, interfaceC3746fs.n().f56217C);
        this.f32025E = new java.lang.ref.WeakReference(interfaceC3746fs);
    }

    static /* bridge */ /* synthetic */ void b(com.google.android.gms.internal.ads.AbstractC2880Ts abstractC2880Ts, java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs = (com.google.android.gms.internal.ads.InterfaceC3746fs) abstractC2880Ts.f32025E.get();
        if (interfaceC3746fs != null) {
            interfaceC3746fs.O("onPrecacheEvent", map);
        }
    }

    @Override // O3.i
    public void a() {
    }

    public abstract void c();

    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p224w3.g.f56228b.post(new com.google.android.gms.internal.ads.RunnableC2844Ss(this, str, str2, str3, str4));
    }

    protected final void e(java.lang.String str, java.lang.String str2, int i6) {
        p224w3.g.f56228b.post(new com.google.android.gms.internal.ads.RunnableC2771Qs(this, str, str2, i6));
    }

    public final void g(java.lang.String str, java.lang.String str2, long j6) {
        p224w3.g.f56228b.post(new com.google.android.gms.internal.ads.RunnableC2808Rs(this, str, str2, j6));
    }

    public final void h(java.lang.String str, java.lang.String str2, int i6, int i10, long j6, long j10, boolean z6, int i11, int i12) {
        p224w3.g.f56228b.post(new com.google.android.gms.internal.ads.RunnableC2734Ps(this, str, str2, i6, i10, j6, j10, z6, i11, i12));
    }

    public final void j(java.lang.String str, java.lang.String str2, long j6, long j10, boolean z6, long j11, long j12, long j13, int i6, int i10) {
        p224w3.g.f56228b.post(new com.google.android.gms.internal.ads.RunnableC2660Ns(this, str, str2, j6, j10, j11, j12, j13, z6, i6, i10));
    }

    protected void k(int i6) {
    }

    protected void l(int i6) {
    }

    protected void m(int i6) {
    }

    protected void n(int i6) {
    }

    public abstract boolean p(java.lang.String str);

    public boolean r(java.lang.String str, java.lang.String[] strArr) {
        return p(str);
    }

    public boolean s(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.C2550Ks c2550Ks) {
        return p(str);
    }
}
