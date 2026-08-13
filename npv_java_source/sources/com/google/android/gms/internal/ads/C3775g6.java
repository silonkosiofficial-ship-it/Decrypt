package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3775g6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35547e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3267bV f35543a = new com.google.android.gms.internal.ads.C3267bV(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35548f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f35549g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f35550h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f35544b = new com.google.android.gms.internal.ads.C5128sR();

    C3775g6(int i6) {
    }

    private final int e(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        byte[] bArr = com.google.android.gms.internal.ads.EW.f27066f;
        int length = bArr.length;
        this.f35544b.j(bArr, 0);
        this.f35545c = true;
        interfaceC5300u0.j();
        return 0;
    }

    public final int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6, int i6) {
        long j6;
        if (i6 <= 0) {
            e(interfaceC5300u0);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.f35547e) {
            long jF = interfaceC5300u0.f();
            int iMin = (int) java.lang.Math.min(112800L, jF);
            j6 = jF - ((long) iMin);
            if (interfaceC5300u0.e() == j6) {
                this.f35544b.i(iMin);
                interfaceC5300u0.j();
                interfaceC5300u0.N(this.f35544b.n(), 0, iMin);
                com.google.android.gms.internal.ads.C5128sR c5128sR = this.f35544b;
                int iT = c5128sR.t();
                int iU = c5128sR.u();
                for (int i10 = iU - 188; i10 >= iT; i10--) {
                    byte[] bArrN = c5128sR.n();
                    int i11 = 0;
                    for (int i12 = -4; i12 <= 4; i12++) {
                        int i13 = (i12 * 188) + i10;
                        if (i13 >= iT && i13 < iU && bArrN[i13] == 71) {
                            i11++;
                            if (i11 == 5) {
                                long jB = com.google.android.gms.internal.ads.AbstractC4763p6.b(c5128sR, i10, i6);
                                if (jB == -9223372036854775807L) {
                                    break;
                                }
                                j10 = jB;
                                break;
                            }
                        } else {
                            i11 = 0;
                        }
                    }
                }
                this.f35549g = j10;
                this.f35547e = true;
                return 0;
            }
        } else {
            if (this.f35549g == -9223372036854775807L) {
                e(interfaceC5300u0);
                return 0;
            }
            if (this.f35546d) {
                long j11 = this.f35548f;
                if (j11 == -9223372036854775807L) {
                    e(interfaceC5300u0);
                    return 0;
                }
                com.google.android.gms.internal.ads.C3267bV c3267bV = this.f35543a;
                this.f35550h = c3267bV.c(this.f35549g) - c3267bV.b(j11);
                e(interfaceC5300u0);
                return 0;
            }
            int iMin2 = (int) java.lang.Math.min(112800L, interfaceC5300u0.f());
            j6 = 0;
            if (interfaceC5300u0.e() == 0) {
                this.f35544b.i(iMin2);
                interfaceC5300u0.j();
                interfaceC5300u0.N(this.f35544b.n(), 0, iMin2);
                com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f35544b;
                int iU2 = c5128sR2.u();
                for (int iT2 = c5128sR2.t(); iT2 < iU2; iT2++) {
                    if (c5128sR2.n()[iT2] == 71) {
                        long jB2 = com.google.android.gms.internal.ads.AbstractC4763p6.b(c5128sR2, iT2, i6);
                        if (jB2 != -9223372036854775807L) {
                            j10 = jB2;
                            break;
                        }
                    }
                }
                this.f35548f = j10;
                this.f35546d = true;
                return 0;
            }
        }
        q6.f30855a = j6;
        return 1;
    }

    public final long b() {
        return this.f35550h;
    }

    public final com.google.android.gms.internal.ads.C3267bV c() {
        return this.f35543a;
    }

    public final boolean d() {
        return this.f35545c;
    }
}
