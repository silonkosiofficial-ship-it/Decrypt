package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4980r5 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5090s5 f38431a = new com.google.android.gms.internal.ads.C5090s5(null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38432b = new com.google.android.gms.internal.ads.C5128sR(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38433c;

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f38433c = false;
        this.f38431a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        int iH = interfaceC5300u0.H(this.f38432b.n(), 0, 16384);
        if (iH == -1) {
            return -1;
        }
        this.f38432b.l(0);
        this.f38432b.k(iH);
        if (!this.f38433c) {
            this.f38431a.e(0L, 4);
            this.f38433c = true;
        }
        this.f38431a.b(this.f38432b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        int i6;
        boolean z6 = true;
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(10);
        int i10 = 0;
        while (true) {
            com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
            c3983i0.L(c5128sR.n(), 0, 10, false);
            c5128sR.l(0);
            if (c5128sR.E() != 4801587) {
                break;
            }
            c5128sR.m(3);
            int iB = c5128sR.B();
            i10 += iB + 10;
            c3983i0.g(iB, false);
            z6 = true;
        }
        interfaceC5300u0.j();
        com.google.android.gms.internal.ads.C3983i0 c3983i1 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i1.g(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            c3983i1.L(c5128sR.n(), 0, 7, false);
            c5128sR.l(0);
            int iG = c5128sR.G();
            if (iG == 44096 || iG == 44097) {
                i11 += z6 ? 1 : 0;
                if (i11 >= 4) {
                    return z6;
                }
                byte[] bArrN = c5128sR.n();
                int i14 = com.google.android.gms.internal.ads.V.f32322b;
                if (bArrN.length < 7) {
                    i6 = -1;
                } else {
                    int i15 = (bArrN[3] & 255) | ((bArrN[2] & 255) << 8);
                    if (i15 == 65535) {
                        i15 = ((bArrN[4] & 255) << 16) | ((bArrN[5] & 255) << 8) | (bArrN[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iG == 44097) {
                        i13 += 2;
                    }
                    i6 = i15 + i13;
                }
                if (i6 == -1) {
                    return false;
                }
                c3983i1.g(i6 - 7, false);
                z6 = true;
            } else {
                interfaceC5300u0.j();
                i12 += z6 ? 1 : 0;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c3983i1.g(i12, false);
                i11 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f38431a.c(interfaceC5520w0, new com.google.android.gms.internal.ads.C4543n6(Integer.MIN_VALUE, 0, 1));
        interfaceC5520w0.Q();
        interfaceC5520w0.R(new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L));
    }
}
