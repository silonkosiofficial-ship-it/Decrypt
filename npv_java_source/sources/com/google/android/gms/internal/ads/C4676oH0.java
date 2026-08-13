package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4676oH0 implements com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.IH0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.JH0 f37757C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.google.android.gms.internal.ads.IH0 f37758D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4566nH0[] f37759E = new com.google.android.gms.internal.ads.C4566nH0[0];

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f37760F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    long f37761G;

    public C4676oH0(com.google.android.gms.internal.ads.JH0 jh0, boolean z6, long j6, long j10) {
        this.f37757C = jh0;
        this.f37761G = j10;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final void a(long j6) {
        this.f37757C.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long b() {
        long jB = this.f37757C.b();
        if (jB != Long.MIN_VALUE) {
            long j6 = this.f37761G;
            if (j6 == Long.MIN_VALUE || jB < j6) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long c() {
        long jC = this.f37757C.c();
        if (jC != Long.MIN_VALUE) {
            long j6 = this.f37761G;
            if (j6 == Long.MIN_VALUE || jC < j6) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean d(com.google.android.gms.internal.ads.ZA0 za0) {
        return this.f37757C.d(za0);
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.HI0 hi0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f37758D;
        ih0.getClass();
        ih0.e(this);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long f() {
        if (n()) {
            long j6 = this.f37760F;
            this.f37760F = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j6;
        }
        long jF2 = this.f37757C.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        com.google.android.gms.internal.ads.LC.f(jF2 >= 0);
        long j10 = this.f37761G;
        com.google.android.gms.internal.ads.LC.f(j10 == Long.MIN_VALUE || jF2 <= j10);
        return jF2;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final com.google.android.gms.internal.ads.PI0 g() {
        return this.f37757C.g();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.JH0
    public final long h(long j6) {
        this.f37760F = -9223372036854775807L;
        boolean z6 = false;
        for (com.google.android.gms.internal.ads.C4566nH0 c4566nH0 : this.f37759E) {
            if (c4566nH0 != null) {
                c4566nH0.c();
            }
        }
        long jH = this.f37757C.h(j6);
        if (jH == j6) {
            z6 = true;
        } else if (jH >= 0) {
            long j10 = this.f37761G;
            if (j10 == Long.MIN_VALUE || jH <= j10) {
                z6 = true;
            }
        }
        com.google.android.gms.internal.ads.LC.f(z6);
        return jH;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long i(long j6, com.google.android.gms.internal.ads.GB0 gb0) {
        if (j6 == 0) {
            return 0L;
        }
        long jMax = java.lang.Math.max(0L, java.lang.Math.min(gb0.f27757a, j6));
        long j10 = gb0.f27758b;
        long j11 = this.f37761G;
        long jMax2 = java.lang.Math.max(0L, java.lang.Math.min(j10, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j6));
        if (jMax != gb0.f27757a || jMax2 != gb0.f27758b) {
            gb0 = new com.google.android.gms.internal.ads.GB0(jMax, jMax2);
        }
        return this.f37757C.i(j6, gb0);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void j(long j6, boolean z6) {
        this.f37757C.j(j6, false);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void k() {
        this.f37757C.k();
    }

    @Override // com.google.android.gms.internal.ads.IH0
    public final void l(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f37758D;
        ih0.getClass();
        ih0.l(this);
    }

    public final void m(long j6, long j10) {
        this.f37761G = j10;
    }

    final boolean n() {
        return this.f37760F != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.JH0
    public final long o(com.google.android.gms.internal.ads.IJ0[] ij0Arr, boolean[] zArr, com.google.android.gms.internal.ads.EI0[] ei0Arr, boolean[] zArr2, long j6) {
        int length = ei0Arr.length;
        this.f37759E = new com.google.android.gms.internal.ads.C4566nH0[length];
        com.google.android.gms.internal.ads.EI0[] ei0Arr2 = new com.google.android.gms.internal.ads.EI0[length];
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.EI0 ei0 = null;
            if (i6 >= ei0Arr.length) {
                break;
            }
            com.google.android.gms.internal.ads.C4566nH0[] c4566nH0Arr = this.f37759E;
            com.google.android.gms.internal.ads.C4566nH0 c4566nH0 = (com.google.android.gms.internal.ads.C4566nH0) ei0Arr[i6];
            c4566nH0Arr[i6] = c4566nH0;
            if (c4566nH0 != null) {
                ei0 = c4566nH0.f37554a;
            }
            ei0Arr2[i6] = ei0;
            i6++;
        }
        long jO = this.f37757C.o(ij0Arr, zArr, ei0Arr2, zArr2, j6);
        long j10 = (n() && j6 == 0) ? 0L : j6;
        this.f37760F = -9223372036854775807L;
        boolean z6 = true;
        if (jO != j10) {
            if (jO >= 0) {
                long j11 = this.f37761G;
                if (j11 != Long.MIN_VALUE && jO > j11) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
        }
        com.google.android.gms.internal.ads.LC.f(z6);
        for (int i10 = 0; i10 < ei0Arr.length; i10++) {
            com.google.android.gms.internal.ads.EI0 ei1 = ei0Arr2[i10];
            if (ei1 == null) {
                this.f37759E[i10] = null;
            } else {
                com.google.android.gms.internal.ads.C4566nH0[] c4566nH0Arr2 = this.f37759E;
                com.google.android.gms.internal.ads.C4566nH0 c4566nH1 = c4566nH0Arr2[i10];
                if (c4566nH1 == null || c4566nH1.f37554a != ei1) {
                    c4566nH0Arr2[i10] = new com.google.android.gms.internal.ads.C4566nH0(this, ei1);
                }
            }
            ei0Arr[i10] = this.f37759E[i10];
        }
        return jO;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void p(com.google.android.gms.internal.ads.IH0 ih0, long j6) {
        this.f37758D = ih0;
        this.f37757C.p(this, j6);
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean q() {
        return this.f37757C.q();
    }
}
