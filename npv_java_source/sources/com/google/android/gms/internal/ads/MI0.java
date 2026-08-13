package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class MI0 implements com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.IH0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.JH0 f29700C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final long f29701D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.IH0 f29702E;

    public MI0(com.google.android.gms.internal.ads.JH0 jh0, long j6) {
        this.f29700C = jh0;
        this.f29701D = j6;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final void a(long j6) {
        this.f29700C.a(j6 - this.f29701D);
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long b() {
        long jB = this.f29700C.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB + this.f29701D;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final long c() {
        long jC = this.f29700C.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.f29701D;
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean d(com.google.android.gms.internal.ads.ZA0 za0) {
        long j6 = za0.f33511a;
        long j10 = this.f29701D;
        com.google.android.gms.internal.ads.XA0 xa0A = za0.a();
        xa0A.e(j6 - j10);
        return this.f29700C.d(xa0A.g());
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.HI0 hi0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f29702E;
        ih0.getClass();
        ih0.e(this);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long f() {
        long jF = this.f29700C.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.f29701D;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final com.google.android.gms.internal.ads.PI0 g() {
        return this.f29700C.g();
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long h(long j6) {
        long j10 = this.f29701D;
        return this.f29700C.h(j6 - j10) + j10;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long i(long j6, com.google.android.gms.internal.ads.GB0 gb0) {
        long j10 = this.f29701D;
        return this.f29700C.i(j6 - j10, gb0) + j10;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void j(long j6, boolean z6) {
        this.f29700C.j(j6 - this.f29701D, false);
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void k() {
        this.f29700C.k();
    }

    @Override // com.google.android.gms.internal.ads.IH0
    public final void l(com.google.android.gms.internal.ads.JH0 jh0) {
        com.google.android.gms.internal.ads.IH0 ih0 = this.f29702E;
        ih0.getClass();
        ih0.l(this);
    }

    public final com.google.android.gms.internal.ads.JH0 m() {
        return this.f29700C;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final long o(com.google.android.gms.internal.ads.IJ0[] ij0Arr, boolean[] zArr, com.google.android.gms.internal.ads.EI0[] ei0Arr, boolean[] zArr2, long j6) {
        com.google.android.gms.internal.ads.EI0[] ei0Arr2 = new com.google.android.gms.internal.ads.EI0[ei0Arr.length];
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.EI0 ei0C = null;
            if (i6 >= ei0Arr.length) {
                break;
            }
            com.google.android.gms.internal.ads.LI0 li0 = (com.google.android.gms.internal.ads.LI0) ei0Arr[i6];
            if (li0 != null) {
                ei0C = li0.c();
            }
            ei0Arr2[i6] = ei0C;
            i6++;
        }
        long jO = this.f29700C.o(ij0Arr, zArr, ei0Arr2, zArr2, j6 - this.f29701D);
        for (int i10 = 0; i10 < ei0Arr.length; i10++) {
            com.google.android.gms.internal.ads.EI0 ei0 = ei0Arr2[i10];
            if (ei0 == null) {
                ei0Arr[i10] = null;
            } else {
                com.google.android.gms.internal.ads.EI0 ei1 = ei0Arr[i10];
                if (ei1 == null || ((com.google.android.gms.internal.ads.LI0) ei1).c() != ei0) {
                    ei0Arr[i10] = new com.google.android.gms.internal.ads.LI0(ei0, this.f29701D);
                }
            }
        }
        return jO + this.f29701D;
    }

    @Override // com.google.android.gms.internal.ads.JH0
    public final void p(com.google.android.gms.internal.ads.IH0 ih0, long j6) {
        this.f29702E = ih0;
        this.f29700C.p(this, j6 - this.f29701D);
    }

    @Override // com.google.android.gms.internal.ads.JH0, com.google.android.gms.internal.ads.HI0
    public final boolean q() {
        return this.f29700C.q();
    }
}
