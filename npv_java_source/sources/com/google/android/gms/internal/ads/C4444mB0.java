package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4444mB0 implements com.google.android.gms.internal.ads.WH0, com.google.android.gms.internal.ads.TF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4664oB0 f37293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4993rB0 f37294b;

    public C4444mB0(com.google.android.gms.internal.ads.C4993rB0 c4993rB0, com.google.android.gms.internal.ads.C4664oB0 c4664oB0) {
        this.f37294b = c4993rB0;
        this.f37293a = c4664oB0;
    }

    private final android.util.Pair a(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        com.google.android.gms.internal.ads.LH0 lh0A;
        com.google.android.gms.internal.ads.LH0 lh1 = null;
        if (lh0 != null) {
            com.google.android.gms.internal.ads.C4664oB0 c4664oB0 = this.f37293a;
            int i10 = 0;
            while (true) {
                if (i10 >= c4664oB0.f37742c.size()) {
                    lh0A = null;
                    break;
                }
                if (((com.google.android.gms.internal.ads.LH0) c4664oB0.f37742c.get(i10)).f29457d == lh0.f29457d) {
                    lh0A = lh0.a(android.util.Pair.create(c4664oB0.f37741b, lh0.f29454a));
                    break;
                }
                i10++;
            }
            if (lh0A == null) {
                return null;
            }
            lh1 = lh0A;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(this.f37293a.f37743d), lh1);
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void B(int i6, com.google.android.gms.internal.ads.LH0 lh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        final android.util.Pair pairA = a(0, lh0);
        if (pairA != null) {
            this.f37294b.f38454i.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.kB0
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairA;
                    this.f36907C.f37294b.f38453h.B(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.LH0) pair.second, hh0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void F(int i6, com.google.android.gms.internal.ads.LH0 lh0, final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0, final java.io.IOException iOException, final boolean z6) {
        final android.util.Pair pairA = a(0, lh0);
        if (pairA != null) {
            this.f37294b.f38454i.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.hB0
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairA;
                    this.f36016C.f37294b.f38453h.F(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.LH0) pair.second, bh0, hh0, iOException, z6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void i(int i6, com.google.android.gms.internal.ads.LH0 lh0, final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        final android.util.Pair pairA = a(0, lh0);
        if (pairA != null) {
            this.f37294b.f38454i.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.iB0
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairA;
                    this.f36238C.f37294b.f38453h.i(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.LH0) pair.second, bh0, hh0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void t(int i6, com.google.android.gms.internal.ads.LH0 lh0, final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        final android.util.Pair pairA = a(0, lh0);
        if (pairA != null) {
            this.f37294b.f38454i.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.jB0
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairA;
                    this.f36609C.f37294b.f38453h.t(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.LH0) pair.second, bh0, hh0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.WH0
    public final void y(int i6, com.google.android.gms.internal.ads.LH0 lh0, final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        final android.util.Pair pairA = a(0, lh0);
        if (pairA != null) {
            this.f37294b.f38454i.n(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.lB0
                @Override // java.lang.Runnable
                public final void run() {
                    android.util.Pair pair = pairA;
                    this.f37112C.f37294b.f38453h.y(((java.lang.Integer) pair.first).intValue(), (com.google.android.gms.internal.ads.LH0) pair.second, bh0, hh0);
                }
            });
        }
    }
}
