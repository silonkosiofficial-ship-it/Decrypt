package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5632x1 implements com.google.android.gms.internal.ads.InterfaceC3324c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.E0 f39762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f39763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5850z0 f39764c = new com.google.android.gms.internal.ads.C5850z0();

    /* synthetic */ C5632x1(com.google.android.gms.internal.ads.E0 e6, int i6, com.google.android.gms.internal.ads.AbstractC5742y1 abstractC5742y1) {
        this.f39762a = e6;
        this.f39763b = i6;
    }

    private final long c(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        while (interfaceC5300u0.d() < interfaceC5300u0.f() - 6) {
            com.google.android.gms.internal.ads.E0 e6 = this.f39762a;
            int i6 = this.f39763b;
            com.google.android.gms.internal.ads.C5850z0 c5850z0 = this.f39764c;
            long jD = interfaceC5300u0.d();
            byte[] bArr = new byte[2];
            interfaceC5300u0.N(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i6) {
                interfaceC5300u0.j();
                interfaceC5300u0.D((int) (jD - interfaceC5300u0.e()));
            } else {
                com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(16);
                java.lang.System.arraycopy(bArr, 0, c5128sR.n(), 0, 2);
                c5128sR.k(com.google.android.gms.internal.ads.AbstractC5630x0.a(interfaceC5300u0, c5128sR.n(), 2, 14));
                interfaceC5300u0.j();
                interfaceC5300u0.D((int) (jD - interfaceC5300u0.e()));
                if (com.google.android.gms.internal.ads.A0.c(c5128sR, e6, i6, c5850z0)) {
                    break;
                }
            }
            interfaceC5300u0.D(1);
        }
        if (interfaceC5300u0.d() < interfaceC5300u0.f() - 6) {
            return this.f39764c.f40186a;
        }
        interfaceC5300u0.D((int) (interfaceC5300u0.f() - interfaceC5300u0.d()));
        return this.f39762a.f26867j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3324c0
    public final com.google.android.gms.internal.ads.C3215b0 a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6) {
        long jE = interfaceC5300u0.e();
        long jC = c(interfaceC5300u0);
        long jD = interfaceC5300u0.d();
        interfaceC5300u0.D(java.lang.Math.max(6, this.f39762a.f26860c));
        long jC2 = c(interfaceC5300u0);
        long jD2 = interfaceC5300u0.d();
        if (jC > j6 || jC2 <= j6) {
            return jC2 <= j6 ? com.google.android.gms.internal.ads.C3215b0.f(jC2, jD2) : com.google.android.gms.internal.ads.C3215b0.d(jC, jE);
        }
        return com.google.android.gms.internal.ads.C3215b0.e(jD);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3324c0
    public final /* synthetic */ void b() {
    }
}
