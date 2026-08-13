package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4631nv0 extends com.google.android.gms.internal.ads.AbstractC5070rv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f37695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37697f;

    C4631nv0(byte[] bArr, int i6, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i10)));
        }
        this.f37695d = bArr;
        this.f37697f = 0;
        this.f37696e = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void A(long j6) throws com.google.android.gms.internal.ads.C4741ov0 {
        int i6;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.f37697f;
        if (!com.google.android.gms.internal.ads.AbstractC5070rv0.f38575c || this.f37696e - i10 < 10) {
            while ((j6 & (-128)) != 0) {
                try {
                    int i11 = i10 + 1;
                    try {
                        this.f37695d[i10] = (byte) (((int) j6) | 128);
                        j6 >>>= 7;
                        i10 = i11;
                    } catch (java.lang.IndexOutOfBoundsException e6) {
                        e = e6;
                        i10 = i11;
                        indexOutOfBoundsException = e;
                        throw new com.google.android.gms.internal.ads.C4741ov0(i10, this.f37696e, 1, indexOutOfBoundsException);
                    }
                } catch (java.lang.IndexOutOfBoundsException e10) {
                    e = e10;
                }
            }
            i6 = i10 + 1;
            try {
                this.f37695d[i10] = (byte) j6;
            } catch (java.lang.IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i10 = i6;
                throw new com.google.android.gms.internal.ads.C4741ov0(i10, this.f37696e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j6 & (-128)) != 0) {
                com.google.android.gms.internal.ads.Sw0.y(this.f37695d, i10, (byte) (((int) j6) | 128));
                j6 >>>= 7;
                i10++;
            }
            i6 = i10 + 1;
            com.google.android.gms.internal.ads.Sw0.y(this.f37695d, i10, (byte) j6);
        }
        this.f37697f = i6;
    }

    public final void C(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C4741ov0 {
        try {
            java.lang.System.arraycopy(bArr, i6, this.f37695d, this.f37697f, i10);
            this.f37697f += i10;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.ads.C4741ov0(this.f37697f, this.f37696e, i10, e6);
        }
    }

    public final void D(java.lang.String str) throws com.google.android.gms.internal.ads.C4741ov0 {
        int i6 = this.f37697f;
        try {
            int iE = com.google.android.gms.internal.ads.AbstractC5070rv0.e(str.length() * 3);
            int iE2 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(str.length());
            if (iE2 != iE) {
                y(com.google.android.gms.internal.ads.Xw0.e(str));
                byte[] bArr = this.f37695d;
                int i10 = this.f37697f;
                this.f37697f = com.google.android.gms.internal.ads.Xw0.d(str, bArr, i10, this.f37696e - i10);
                return;
            }
            int i11 = i6 + iE2;
            this.f37697f = i11;
            int iD = com.google.android.gms.internal.ads.Xw0.d(str, this.f37695d, i11, this.f37696e - i11);
            this.f37697f = i6;
            y((iD - i6) - iE2);
            this.f37697f = iD;
        } catch (com.google.android.gms.internal.ads.Ww0 e6) {
            this.f37697f = i6;
            h(str, e6);
        } catch (java.lang.IndexOutOfBoundsException e10) {
            throw new com.google.android.gms.internal.ads.C4741ov0(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0, com.google.android.gms.internal.ads.Wu0
    public final void a(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.C4741ov0 {
        C(bArr, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void k(byte b6) throws com.google.android.gms.internal.ads.C4741ov0 {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.f37697f;
        try {
            int i10 = i6 + 1;
            try {
                this.f37695d[i6] = b6;
                this.f37697f = i10;
            } catch (java.lang.IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i6 = i10;
                throw new com.google.android.gms.internal.ads.C4741ov0(i6, this.f37696e, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void l(int i6, boolean z6) throws com.google.android.gms.internal.ads.C4741ov0 {
        y(i6 << 3);
        k(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void m(int i6, com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) throws com.google.android.gms.internal.ads.C4741ov0 {
        y((i6 << 3) | 2);
        y(abstractC3753fv0.n());
        abstractC3753fv0.N(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final int n() {
        return this.f37696e - this.f37697f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void o(int i6, int i10) throws com.google.android.gms.internal.ads.C4741ov0 {
        y((i6 << 3) | 5);
        p(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void p(int i6) throws com.google.android.gms.internal.ads.C4741ov0 {
        int i10 = this.f37697f;
        try {
            byte[] bArr = this.f37695d;
            bArr[i10] = (byte) i6;
            bArr[i10 + 1] = (byte) (i6 >> 8);
            bArr[i10 + 2] = (byte) (i6 >> 16);
            bArr[i10 + 3] = (byte) (i6 >> 24);
            this.f37697f = i10 + 4;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.ads.C4741ov0(i10, this.f37696e, 4, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void q(int i6, long j6) throws com.google.android.gms.internal.ads.C4741ov0 {
        y((i6 << 3) | 1);
        r(j6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void r(long j6) throws com.google.android.gms.internal.ads.C4741ov0 {
        int i6 = this.f37697f;
        try {
            byte[] bArr = this.f37695d;
            bArr[i6] = (byte) j6;
            bArr[i6 + 1] = (byte) (j6 >> 8);
            bArr[i6 + 2] = (byte) (j6 >> 16);
            bArr[i6 + 3] = (byte) (j6 >> 24);
            bArr[i6 + 4] = (byte) (j6 >> 32);
            bArr[i6 + 5] = (byte) (j6 >> 40);
            bArr[i6 + 6] = (byte) (j6 >> 48);
            bArr[i6 + 7] = (byte) (j6 >> 56);
            this.f37697f = i6 + 8;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.ads.C4741ov0(i6, this.f37696e, 8, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void s(int i6, int i10) throws com.google.android.gms.internal.ads.C4741ov0 {
        y(i6 << 3);
        t(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void t(int i6) throws com.google.android.gms.internal.ads.C4741ov0 {
        if (i6 >= 0) {
            y(i6);
        } else {
            A(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    final void u(int i6, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, com.google.android.gms.internal.ads.Ew0 ew0) throws com.google.android.gms.internal.ads.C4741ov0 {
        y((i6 << 3) | 2);
        y(((com.google.android.gms.internal.ads.Ou0) interfaceC4523mw0).f(ew0));
        ew0.g(interfaceC4523mw0, this.f38576a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void v(int i6, java.lang.String str) throws com.google.android.gms.internal.ads.C4741ov0 {
        y((i6 << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void w(int i6, int i10) throws com.google.android.gms.internal.ads.C4741ov0 {
        y((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void x(int i6, int i10) throws com.google.android.gms.internal.ads.C4741ov0 {
        y(i6 << 3);
        y(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void y(int i6) throws com.google.android.gms.internal.ads.C4741ov0 {
        int i10;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.f37697f;
        while ((i6 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.f37695d[i11] = (byte) (i6 | 128);
                    i6 >>>= 7;
                    i11 = i10;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    indexOutOfBoundsException = e6;
                    i11 = i10;
                    throw new com.google.android.gms.internal.ads.C4741ov0(i11, this.f37696e, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new com.google.android.gms.internal.ads.C4741ov0(i11, this.f37696e, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.f37695d[i11] = (byte) i6;
        this.f37697f = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final void z(int i6, long j6) throws com.google.android.gms.internal.ads.C4741ov0 {
        y(i6 << 3);
        A(j6);
    }
}
