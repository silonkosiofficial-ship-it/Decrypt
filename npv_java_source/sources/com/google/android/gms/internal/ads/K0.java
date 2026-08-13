package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f28794a = new com.google.android.gms.internal.ads.C5128sR(10);

    public final com.google.android.gms.internal.ads.C2227Cb a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.C4645o2 c4645o2) {
        com.google.android.gms.internal.ads.C2227Cb c2227CbA = null;
        int i6 = 0;
        while (true) {
            try {
                interfaceC5300u0.N(this.f28794a.n(), 0, 10);
                this.f28794a.l(0);
                if (this.f28794a.E() != 4801587) {
                    break;
                }
                this.f28794a.m(3);
                int iB = this.f28794a.B();
                int i10 = iB + 10;
                if (c2227CbA == null) {
                    byte[] bArr = new byte[i10];
                    java.lang.System.arraycopy(this.f28794a.n(), 0, bArr, 0, 10);
                    interfaceC5300u0.N(bArr, 10, iB);
                    c2227CbA = com.google.android.gms.internal.ads.AbstractC4865q2.a(bArr, i10, c4645o2, new com.google.android.gms.internal.ads.R1());
                } else {
                    interfaceC5300u0.D(iB);
                }
                i6 += i10;
            } catch (java.io.EOFException unused) {
            }
        }
        interfaceC5300u0.j();
        interfaceC5300u0.D(i6);
        return c2227CbA;
    }
}
