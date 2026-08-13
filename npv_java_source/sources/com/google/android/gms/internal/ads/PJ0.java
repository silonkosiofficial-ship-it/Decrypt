package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.OJ0 f30690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.XJ0 f30691b;

    public abstract com.google.android.gms.internal.ads.CB0 b();

    public void c() {
        this.f30690a = null;
        this.f30691b = null;
    }

    public abstract void d(com.google.android.gms.internal.ads.C5459vS c5459vS);

    public abstract boolean e();

    public abstract com.google.android.gms.internal.ads.QJ0 f(com.google.android.gms.internal.ads.DB0[] db0Arr, com.google.android.gms.internal.ads.PI0 pi0, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm);

    public abstract void g(java.lang.Object obj);

    protected final com.google.android.gms.internal.ads.XJ0 h() {
        com.google.android.gms.internal.ads.XJ0 xj0 = this.f30691b;
        com.google.android.gms.internal.ads.LC.b(xj0);
        return xj0;
    }

    public final void i(com.google.android.gms.internal.ads.OJ0 oj0, com.google.android.gms.internal.ads.XJ0 xj0) {
        this.f30690a = oj0;
        this.f30691b = xj0;
    }

    protected final void j() {
        com.google.android.gms.internal.ads.OJ0 oj0 = this.f30690a;
        if (oj0 != null) {
            oj0.j();
        }
    }
}
