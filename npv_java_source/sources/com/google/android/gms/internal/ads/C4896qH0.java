package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4896qH0 implements com.google.android.gms.internal.ads.WH0, com.google.android.gms.internal.ads.TF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f38200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.VH0 f38201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.SF0 f38202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5115sH0 f38203d;

    public C4896qH0(com.google.android.gms.internal.ads.AbstractC5115sH0 abstractC5115sH0, java.lang.Object obj) {
        this.f38203d = abstractC5115sH0;
        this.f38201b = abstractC5115sH0.p(null);
        this.f38202c = abstractC5115sH0.n(null);
        this.f38200a = obj;
    }

    private final com.google.android.gms.internal.ads.HH0 a(com.google.android.gms.internal.ads.HH0 hh0, com.google.android.gms.internal.ads.LH0 lh0) {
        com.google.android.gms.internal.ads.AbstractC5115sH0 abstractC5115sH0 = this.f38203d;
        java.lang.Object obj = this.f38200a;
        long j6 = hh0.f28004c;
        abstractC5115sH0.B(obj, j6, lh0);
        com.google.android.gms.internal.ads.AbstractC5115sH0 abstractC5115sH1 = this.f38203d;
        java.lang.Object obj2 = this.f38200a;
        long j10 = hh0.f28005d;
        abstractC5115sH1.B(obj2, j10, lh0);
        return (j6 == hh0.f28004c && j10 == hh0.f28005d) ? hh0 : new com.google.android.gms.internal.ads.HH0(1, hh0.f28002a, hh0.f28003b, 0, null, j6, j10);
    }

    private final boolean x(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        com.google.android.gms.internal.ads.LH0 lh0C;
        if (lh0 != null) {
            lh0C = this.f38203d.C(this.f38200a, lh0);
            if (lh0C == null) {
                return false;
            }
        } else {
            lh0C = null;
        }
        this.f38203d.A(this.f38200a, 0);
        com.google.android.gms.internal.ads.VH0 vh0 = this.f38201b;
        int i10 = vh0.f32480a;
        if (!j$.util.Objects.equals(vh0.f32481b, lh0C)) {
            this.f38201b = this.f38203d.q(0, lh0C);
        }
        com.google.android.gms.internal.ads.SF0 sf0 = this.f38202c;
        int i11 = sf0.f31655a;
        if (j$.util.Objects.equals(sf0.f31656b, lh0C)) {
            return true;
        }
        this.f38202c = this.f38203d.o(0, lh0C);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void B(int i6, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.HH0 hh0) {
        if (x(0, lh0)) {
            this.f38201b.d(a(hh0, lh0));
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void F(int i6, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.BH0 bh0, com.google.android.gms.internal.ads.HH0 hh0, java.io.IOException iOException, boolean z6) {
        if (x(0, lh0)) {
            this.f38201b.g(bh0, a(hh0, lh0), iOException, z6);
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void i(int i6, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.BH0 bh0, com.google.android.gms.internal.ads.HH0 hh0) {
        if (x(0, lh0)) {
            this.f38201b.e(bh0, a(hh0, lh0));
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void t(int i6, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.BH0 bh0, com.google.android.gms.internal.ads.HH0 hh0) {
        if (x(0, lh0)) {
            this.f38201b.h(bh0, a(hh0, lh0));
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void y(int i6, com.google.android.gms.internal.ads.LH0 lh0, com.google.android.gms.internal.ads.BH0 bh0, com.google.android.gms.internal.ads.HH0 hh0) {
        if (x(0, lh0)) {
            this.f38201b.f(bh0, a(hh0, lh0));
        }
    }
}
