package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5115sH0 extends com.google.android.gms.internal.ads.AbstractC4236kH0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.HashMap f38712h = new java.util.HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.os.Handler f38713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.internal.ads.Pv0 f38714j;

    protected AbstractC5115sH0() {
    }

    protected int A(java.lang.Object obj, int i6) {
        return 0;
    }

    protected long B(java.lang.Object obj, long j6, com.google.android.gms.internal.ads.LH0 lh0) {
        return j6;
    }

    protected abstract com.google.android.gms.internal.ads.LH0 C(java.lang.Object obj, com.google.android.gms.internal.ads.LH0 lh0);

    @Override // com.google.android.gms.internal.ads.NH0
    public void J() {
        java.util.Iterator it = this.f38712h.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.C5005rH0) it.next()).f38476a.J();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void r() {
        for (com.google.android.gms.internal.ads.C5005rH0 c5005rH0 : this.f38712h.values()) {
            c5005rH0.f38476a.f(c5005rH0.f38477b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0
    protected final void s() {
        for (com.google.android.gms.internal.ads.C5005rH0 c5005rH0 : this.f38712h.values()) {
            c5005rH0.f38476a.i(c5005rH0.f38477b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0
    protected void t(com.google.android.gms.internal.ads.Pv0 pv0) {
        this.f38714j = pv0;
        this.f38713i = com.google.android.gms.internal.ads.EW.Q(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0
    protected void w() {
        for (com.google.android.gms.internal.ads.C5005rH0 c5005rH0 : this.f38712h.values()) {
            c5005rH0.f38476a.a(c5005rH0.f38477b);
            c5005rH0.f38476a.h(c5005rH0.f38478c);
            c5005rH0.f38476a.k(c5005rH0.f38478c);
        }
        this.f38712h.clear();
    }

    protected abstract void y(java.lang.Object obj, com.google.android.gms.internal.ads.NH0 nh0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm);

    protected final void z(final java.lang.Object obj, com.google.android.gms.internal.ads.NH0 nh0) {
        com.google.android.gms.internal.ads.LC.d(!this.f38712h.containsKey(obj));
        com.google.android.gms.internal.ads.MH0 mh0 = new com.google.android.gms.internal.ads.MH0() { // from class: com.google.android.gms.internal.ads.pH0
            @Override // com.google.android.gms.internal.ads.MH0
            public final void a(com.google.android.gms.internal.ads.NH0 nh1, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
                this.f37956a.y(obj, nh1, abstractC4942qm);
            }
        };
        com.google.android.gms.internal.ads.C4896qH0 c4896qH0 = new com.google.android.gms.internal.ads.C4896qH0(this, obj);
        this.f38712h.put(obj, new com.google.android.gms.internal.ads.C5005rH0(nh0, mh0, c4896qH0));
        android.os.Handler handler = this.f38713i;
        handler.getClass();
        nh0.l(handler, c4896qH0);
        android.os.Handler handler2 = this.f38713i;
        handler2.getClass();
        nh0.j(handler2, c4896qH0);
        nh0.g(mh0, this.f38714j, m());
        if (x()) {
            return;
        }
        nh0.f(mh0);
    }
}
