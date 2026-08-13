package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3555e6 implements com.google.android.gms.internal.ads.InterfaceC3324c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3267bV f34883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f34884b = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34885c;

    public C3555e6(int i6, com.google.android.gms.internal.ads.C3267bV c3267bV, int i10) {
        this.f34885c = i6;
        this.f34883a = c3267bV;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3324c0
    public final com.google.android.gms.internal.ads.C3215b0 a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6) {
        int iA;
        int iA2;
        long jE = interfaceC5300u0.e();
        int iMin = (int) java.lang.Math.min(112800L, interfaceC5300u0.f() - jE);
        this.f34884b.i(iMin);
        interfaceC5300u0.N(this.f34884b.n(), 0, iMin);
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f34884b;
        int iU = c5128sR.u();
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (c5128sR.r() >= 188 && (iA2 = (iA = com.google.android.gms.internal.ads.AbstractC4763p6.a(c5128sR.n(), c5128sR.t(), iU)) + 188) <= iU) {
            long jB = com.google.android.gms.internal.ads.AbstractC4763p6.b(c5128sR, iA, this.f34885c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.f34883a.b(jB);
                if (jB2 <= j6) {
                    j12 = iA;
                    if (100000 + jB2 <= j6) {
                        j11 = jB2;
                    }
                } else if (j11 == -9223372036854775807L) {
                    return com.google.android.gms.internal.ads.C3215b0.d(jB2, jE);
                }
                return com.google.android.gms.internal.ads.C3215b0.e(jE + j12);
            }
            c5128sR.l(iA2);
            j10 = iA2;
        }
        return j11 != -9223372036854775807L ? com.google.android.gms.internal.ads.C3215b0.f(j11, jE + j10) : com.google.android.gms.internal.ads.C3215b0.f34182d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3324c0
    public final void b() {
        byte[] bArr = com.google.android.gms.internal.ads.EW.f27066f;
        int length = bArr.length;
        this.f34884b.j(bArr, 0);
    }
}
