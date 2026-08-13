package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class X5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33054e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3267bV f33050a = new com.google.android.gms.internal.ads.C3267bV(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33055f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33056g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33057h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33051b = new com.google.android.gms.internal.ads.C5128sR();

    X5() {
    }

    public static long c(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iT = c5128sR.t();
        if (c5128sR.r() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c5128sR.h(bArr, 0, 9);
        c5128sR.l(iT);
        byte b6 = bArr[0];
        if ((b6 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j6 = b6;
        long j10 = b10;
        long j11 = (248 & j10) >> 3;
        long j12 = (j10 & 3) << 13;
        return j12 | ((bArr[1] & 255) << 20) | ((j6 & 3) << 28) | (((j6 & 56) >> 3) << 30) | (j11 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
    }

    private final int f(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        byte[] bArr = com.google.android.gms.internal.ads.EW.f27066f;
        int length = bArr.length;
        this.f33051b.j(bArr, 0);
        this.f33052c = true;
        interfaceC5300u0.j();
        return 0;
    }

    private static final int g(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }

    public final int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        long j6;
        long j10 = -9223372036854775807L;
        if (!this.f33054e) {
            long jF = interfaceC5300u0.f();
            int iMin = (int) java.lang.Math.min(20000L, jF);
            j6 = jF - ((long) iMin);
            if (interfaceC5300u0.e() == j6) {
                this.f33051b.i(iMin);
                interfaceC5300u0.j();
                interfaceC5300u0.N(this.f33051b.n(), 0, iMin);
                com.google.android.gms.internal.ads.C5128sR c5128sR = this.f33051b;
                int iT = c5128sR.t();
                for (int iU = c5128sR.u() - 4; iU >= iT; iU--) {
                    if (g(c5128sR.n(), iU) == 442) {
                        c5128sR.l(iU + 4);
                        long jC = c(c5128sR);
                        if (jC != -9223372036854775807L) {
                            j10 = jC;
                            break;
                        }
                    }
                }
                this.f33056g = j10;
                this.f33054e = true;
                return 0;
            }
            q6.f30855a = j6;
            return 1;
        }
        if (this.f33056g == -9223372036854775807L) {
            f(interfaceC5300u0);
            return 0;
        }
        if (this.f33053d) {
            long j11 = this.f33055f;
            if (j11 == -9223372036854775807L) {
                f(interfaceC5300u0);
                return 0;
            }
            com.google.android.gms.internal.ads.C3267bV c3267bV = this.f33050a;
            this.f33057h = c3267bV.c(this.f33056g) - c3267bV.b(j11);
            f(interfaceC5300u0);
            return 0;
        }
        int iMin2 = (int) java.lang.Math.min(20000L, interfaceC5300u0.f());
        j6 = 0;
        if (interfaceC5300u0.e() == 0) {
            this.f33051b.i(iMin2);
            interfaceC5300u0.j();
            interfaceC5300u0.N(this.f33051b.n(), 0, iMin2);
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f33051b;
            int iU2 = c5128sR2.u();
            for (int iT2 = c5128sR2.t(); iT2 < iU2 - 3; iT2++) {
                if (g(c5128sR2.n(), iT2) == 442) {
                    c5128sR2.l(iT2 + 4);
                    long jC2 = c(c5128sR2);
                    if (jC2 != -9223372036854775807L) {
                        j10 = jC2;
                        break;
                    }
                }
            }
            this.f33055f = j10;
            this.f33053d = true;
            return 0;
        }
        q6.f30855a = j6;
        return 1;
    }

    public final long b() {
        return this.f33057h;
    }

    public final com.google.android.gms.internal.ads.C3267bV d() {
        return this.f33050a;
    }

    public final boolean e() {
        return this.f33052c;
    }
}
