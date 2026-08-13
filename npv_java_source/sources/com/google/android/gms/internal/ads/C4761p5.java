package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4761p5 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4871q5 f37912a = new com.google.android.gms.internal.ads.C4871q5(null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f37913b = new com.google.android.gms.internal.ads.C5128sR(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37914c;

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        this.f37914c = false;
        this.f37912a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        int iH = interfaceC5300u0.H(this.f37913b.n(), 0, 2786);
        if (iH == -1) {
            return -1;
        }
        this.f37913b.l(0);
        this.f37913b.k(iH);
        if (!this.f37914c) {
            this.f37912a.e(0L, 4);
            this.f37914c = true;
        }
        this.f37912a.b(this.f37913b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.EOFException, java.io.InterruptedIOException {
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(10);
        int i6 = 0;
        while (true) {
            com.google.android.gms.internal.ads.C3983i0 c3983i0 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
            c3983i0.L(c5128sR.n(), 0, 10, false);
            c5128sR.l(0);
            if (c5128sR.E() != 4801587) {
                break;
            }
            c5128sR.m(3);
            int iB = c5128sR.B();
            i6 += iB + 10;
            c3983i0.g(iB, false);
        }
        interfaceC5300u0.j();
        com.google.android.gms.internal.ads.C3983i0 c3983i1 = (com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0;
        c3983i1.g(i6, false);
        int i10 = 0;
        int i11 = i6;
        while (true) {
            c3983i1.L(c5128sR.n(), 0, 6, false);
            c5128sR.l(0);
            if (c5128sR.G() != 2935) {
                interfaceC5300u0.j();
                i11++;
                if (i11 - i6 >= 8192) {
                    return false;
                }
                c3983i1.g(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int iB2 = com.google.android.gms.internal.ads.S.b(c5128sR.n());
                if (iB2 == -1) {
                    return false;
                }
                c3983i1.g(iB2 - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f37912a.c(interfaceC5520w0, new com.google.android.gms.internal.ads.C4543n6(Integer.MIN_VALUE, 0, 1));
        interfaceC5520w0.Q();
        interfaceC5520w0.R(new com.google.android.gms.internal.ads.S0(-9223372036854775807L, 0L));
    }
}
