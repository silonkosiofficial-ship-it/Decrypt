package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4851pv0 extends com.google.android.gms.internal.ads.AbstractC4521mv0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.io.OutputStream f38100h;

    C4851pv0(java.io.OutputStream outputStream, int i6) {
        super(i6);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.f38100h = outputStream;
    }

    private final void H() throws java.io.IOException {
        this.f38100h.write(this.f37435d, 0, this.f37437f);
        this.f37437f = 0;
    }

    private final void I(int i6) throws java.io.IOException {
        if (this.f37436e - this.f37437f < i6) {
            H();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void A(long j6) throws java.io.IOException {
        I(10);
        G(j6);
    }

    public final void J(byte[] bArr, int i6, int i10) throws java.io.IOException {
        int i11 = this.f37436e;
        int i12 = this.f37437f;
        int i13 = i11 - i12;
        if (i13 >= i10) {
            java.lang.System.arraycopy(bArr, i6, this.f37435d, i12, i10);
            this.f37437f += i10;
        } else {
            java.lang.System.arraycopy(bArr, i6, this.f37435d, i12, i13);
            int i14 = i6 + i13;
            this.f37437f = this.f37436e;
            this.f37438g += i13;
            H();
            i10 -= i13;
            if (i10 <= this.f37436e) {
                java.lang.System.arraycopy(bArr, i14, this.f37435d, 0, i10);
                this.f37437f = i10;
            } else {
                this.f38100h.write(bArr, i14, i10);
            }
        }
        this.f37438g += i10;
    }

    public final void K(java.lang.String str) throws java.io.IOException {
        int iE;
        try {
            int length = str.length() * 3;
            int iE2 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(length);
            int i6 = iE2 + length;
            int i10 = this.f37436e;
            if (i6 > i10) {
                byte[] bArr = new byte[length];
                int iD = com.google.android.gms.internal.ads.Xw0.d(str, bArr, 0, length);
                y(iD);
                J(bArr, 0, iD);
                return;
            }
            if (i6 > i10 - this.f37437f) {
                H();
            }
            int iE3 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(str.length());
            int i11 = this.f37437f;
            try {
                if (iE3 == iE2) {
                    int i12 = i11 + iE3;
                    this.f37437f = i12;
                    int iD2 = com.google.android.gms.internal.ads.Xw0.d(str, this.f37435d, i12, this.f37436e - i12);
                    this.f37437f = i11;
                    iE = (iD2 - i11) - iE3;
                    F(iE);
                    this.f37437f = iD2;
                } else {
                    iE = com.google.android.gms.internal.ads.Xw0.e(str);
                    F(iE);
                    this.f37437f = com.google.android.gms.internal.ads.Xw0.d(str, this.f37435d, this.f37437f, iE);
                }
                this.f37438g += iE;
            } catch (com.google.android.gms.internal.ads.Ww0 e6) {
                this.f37438g -= this.f37437f - i11;
                this.f37437f = i11;
                throw e6;
            } catch (java.lang.ArrayIndexOutOfBoundsException e10) {
                throw new com.google.android.gms.internal.ads.C4741ov0(e10);
            }
        } catch (com.google.android.gms.internal.ads.Ww0 e11) {
            h(str, e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0, com.google.android.gms.internal.ads.Wu0
    public final void a(byte[] bArr, int i6, int i10) throws java.io.IOException {
        J(bArr, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void j() throws java.io.IOException {
        if (this.f37437f > 0) {
            H();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void k(byte b6) throws java.io.IOException {
        if (this.f37437f == this.f37436e) {
            H();
        }
        C(b6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void l(int i6, boolean z6) throws java.io.IOException {
        I(11);
        F(i6 << 3);
        C(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void m(int i6, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) throws java.io.IOException {
        y((i6 << 3) | 2);
        y(abstractC3753fv0.n());
        abstractC3753fv0.N(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void o(int i6, int i10) throws java.io.IOException {
        I(14);
        F((i6 << 3) | 5);
        D(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void p(int i6) throws java.io.IOException {
        I(4);
        D(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void q(int i6, long j6) throws java.io.IOException {
        I(18);
        F((i6 << 3) | 1);
        E(j6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void r(long j6) throws java.io.IOException {
        I(8);
        E(j6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void s(int i6, int i10) throws java.io.IOException {
        I(20);
        F(i6 << 3);
        if (i10 >= 0) {
            F(i10);
        } else {
            G(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void t(int i6) throws java.io.IOException {
        if (i6 >= 0) {
            y(i6);
        } else {
            A(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    final void u(int i6, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, com.google.android.gms.internal.ads.Ew0 ew0) throws java.io.IOException {
        y((i6 << 3) | 2);
        y(((com.google.android.gms.internal.ads.Ou0) interfaceC4523mw0).f(ew0));
        ew0.g(interfaceC4523mw0, this.f38576a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void v(int i6, java.lang.String str) throws java.io.IOException {
        y((i6 << 3) | 2);
        K(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void w(int i6, int i10) throws java.io.IOException {
        y((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void x(int i6, int i10) throws java.io.IOException {
        I(20);
        F(i6 << 3);
        F(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void y(int i6) throws java.io.IOException {
        I(5);
        F(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void z(int i6, long j6) throws java.io.IOException {
        I(20);
        F(i6 << 3);
        G(j6);
    }
}
