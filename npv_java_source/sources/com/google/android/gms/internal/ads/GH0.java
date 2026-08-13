package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GH0 extends com.google.android.gms.internal.ads.RI0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f27765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2764Ql f27766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4830pl f27767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.gms.internal.ads.DH0 f27768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.gms.internal.ads.CH0 f27769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f27770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27772s;

    public GH0(com.google.android.gms.internal.ads.NH0 nh0, boolean z6) {
        boolean z10;
        super(nh0);
        if (z6) {
            nh0.v();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27765l = z10;
        this.f27766m = new com.google.android.gms.internal.ads.C2764Ql();
        this.f27767n = new com.google.android.gms.internal.ads.C4830pl();
        nh0.R();
        this.f27768o = com.google.android.gms.internal.ads.DH0.q(nh0.l0());
    }

    private final java.lang.Object I(java.lang.Object obj) {
        return (this.f27768o.f26637d == null || !obj.equals(com.google.android.gms.internal.ads.DH0.f26635e)) ? obj : this.f27768o.f26637d;
    }

    private final boolean K(long j6) {
        com.google.android.gms.internal.ads.CH0 ch0 = this.f27769p;
        int iA = this.f27768o.a(ch0.f26183C.f29454a);
        if (iA == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.DH0 dh0 = this.f27768o;
        com.google.android.gms.internal.ads.C4830pl c4830pl = this.f27767n;
        dh0.d(iA, c4830pl, false);
        long j10 = c4830pl.f38061d;
        if (j10 != -9223372036854775807L && j6 >= j10) {
            j6 = java.lang.Math.max(0L, j10 - 1);
        }
        ch0.s(j6);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RI0
    protected final com.google.android.gms.internal.ads.LH0 D(com.google.android.gms.internal.ads.LH0 lh0) {
        java.lang.Object obj = this.f27768o.f26637d;
        java.lang.Object obj2 = lh0.f29454a;
        if (obj != null && this.f27768o.f26637d.equals(obj2)) {
            obj2 = com.google.android.gms.internal.ads.DH0.f26635e;
        }
        return lh0.a(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.RI0
    protected final void E(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        long j6;
        com.google.android.gms.internal.ads.LH0 lh0A = null;
        if (this.f27771r) {
            this.f27768o = this.f27768o.p(abstractC4942qm);
            com.google.android.gms.internal.ads.CH0 ch0 = this.f27769p;
            if (ch0 != null) {
                K(ch0.m());
            }
        } else if (abstractC4942qm.o()) {
            this.f27768o = this.f27772s ? this.f27768o.p(abstractC4942qm) : com.google.android.gms.internal.ads.DH0.r(abstractC4942qm, com.google.android.gms.internal.ads.C2764Ql.f31037o, com.google.android.gms.internal.ads.DH0.f26635e);
        } else {
            abstractC4942qm.e(0, this.f27766m, 0L);
            java.lang.Object obj = this.f27766m.f31039a;
            com.google.android.gms.internal.ads.CH0 ch1 = this.f27769p;
            if (ch1 != null) {
                long jN = ch1.n();
                this.f27768o.n(ch1.f26183C.f29454a, this.f27767n);
                this.f27768o.e(0, this.f27766m, 0L);
                if (jN != 0) {
                    j6 = jN;
                } else {
                    j6 = 0;
                }
            } else {
                j6 = 0;
            }
            android.util.Pair pairL = abstractC4942qm.l(this.f27766m, this.f27767n, 0, j6);
            java.lang.Object obj2 = pairL.first;
            long jLongValue = ((java.lang.Long) pairL.second).longValue();
            this.f27768o = this.f27772s ? this.f27768o.p(abstractC4942qm) : com.google.android.gms.internal.ads.DH0.r(abstractC4942qm, obj, obj2);
            com.google.android.gms.internal.ads.CH0 ch2 = this.f27769p;
            if (ch2 != null && K(jLongValue)) {
                com.google.android.gms.internal.ads.LH0 lh0 = ch2.f26183C;
                lh0A = lh0.a(I(lh0.f29454a));
            }
        }
        this.f27772s = true;
        this.f27771r = true;
        u(this.f27768o);
        if (lh0A != null) {
            com.google.android.gms.internal.ads.CH0 ch3 = this.f27769p;
            ch3.getClass();
            ch3.r(lh0A);
        }
    }

    @Override // com.google.android.gms.internal.ads.RI0
    public final void F() {
        if (this.f27765l) {
            return;
        }
        this.f27770q = true;
        z(null, this.f31229k);
    }

    public final com.google.android.gms.internal.ads.AbstractC4942qm G() {
        return this.f27768o;
    }

    @Override // com.google.android.gms.internal.ads.NH0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.CH0 e(com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.YJ0 yj0, long j6) {
        com.google.android.gms.internal.ads.CH0 ch0 = new com.google.android.gms.internal.ads.CH0(lh0, yj0, j6);
        ch0.u(this.f31229k);
        if (this.f27771r) {
            ch0.r(lh0.a(I(lh0.f29454a)));
        } else {
            this.f27769p = ch0;
            if (!this.f27770q) {
                this.f27770q = true;
                z(null, this.f31229k);
            }
        }
        return ch0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0, com.google.android.gms.internal.ads.NH0
    public final void J() {
    }

    @Override // com.google.android.gms.internal.ads.RI0, com.google.android.gms.internal.ads.NH0
    public final void b(com.google.android.gms.internal.ads.JH0 jh0) {
        ((com.google.android.gms.internal.ads.CH0) jh0).t();
        if (jh0 == this.f27769p) {
            this.f27769p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4236kH0, com.google.android.gms.internal.ads.NH0
    public final void c(com.google.android.gms.internal.ads.Q7 q10) {
        this.f27768o = this.f27772s ? this.f27768o.p(new com.google.android.gms.internal.ads.NI0(this.f27768o.f40027b, q10)) : com.google.android.gms.internal.ads.DH0.q(q10);
        this.f31229k.c(q10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5115sH0, com.google.android.gms.internal.ads.AbstractC4236kH0
    public final void w() {
        this.f27771r = false;
        this.f27770q = false;
        super.w();
    }
}
