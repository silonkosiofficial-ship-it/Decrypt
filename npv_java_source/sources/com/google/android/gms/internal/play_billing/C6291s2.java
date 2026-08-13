package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6291s2 extends com.google.android.gms.internal.play_billing.AbstractC6309v2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f41649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41651f;

    C6291s2(byte[] bArr, int i6, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i10)));
        }
        this.f41649d = bArr;
        this.f41651f = 0;
        this.f41650e = i10;
    }

    public final void A(byte[] bArr, int i6, int i10) {
        try {
            java.lang.System.arraycopy(bArr, 0, this.f41649d, this.f41651f, i10);
            this.f41651f += i10;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.play_billing.C6297t2(this.f41651f, this.f41650e, i10, e6);
        }
    }

    public final void B(java.lang.String str) throws com.google.android.gms.internal.play_billing.C6297t2 {
        int i6 = this.f41651f;
        try {
            int iZ = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(str.length() * 3);
            int iZ2 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(str.length());
            if (iZ2 != iZ) {
                t(com.google.android.gms.internal.play_billing.J3.c(str));
                byte[] bArr = this.f41649d;
                int i10 = this.f41651f;
                this.f41651f = com.google.android.gms.internal.play_billing.J3.b(str, bArr, i10, this.f41650e - i10);
                return;
            }
            int i11 = i6 + iZ2;
            this.f41651f = i11;
            int iB = com.google.android.gms.internal.play_billing.J3.b(str, this.f41649d, i11, this.f41650e - i11);
            this.f41651f = i6;
            t((iB - i6) - iZ2);
            this.f41651f = iB;
        } catch (com.google.android.gms.internal.play_billing.I3 e6) {
            this.f41651f = i6;
            c(str, e6);
        } catch (java.lang.IndexOutOfBoundsException e10) {
            throw new com.google.android.gms.internal.play_billing.C6297t2(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final int e() {
        return this.f41650e - this.f41651f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void f(byte b6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.f41651f;
        try {
            int i10 = i6 + 1;
            try {
                this.f41649d[i6] = b6;
                this.f41651f = i10;
            } catch (java.lang.IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i6 = i10;
                throw new com.google.android.gms.internal.play_billing.C6297t2(i6, this.f41650e, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void g(int i6, boolean z6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t(i6 << 3);
        f(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void h(int i6, com.google.android.gms.internal.play_billing.AbstractC6268o2 abstractC6268o2) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t((i6 << 3) | 2);
        t(abstractC6268o2.f());
        abstractC6268o2.o(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void i(int i6, int i10) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t((i6 << 3) | 5);
        j(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void j(int i6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        int i10 = this.f41651f;
        try {
            byte[] bArr = this.f41649d;
            bArr[i10] = (byte) (i6 & 255);
            bArr[i10 + 1] = (byte) ((i6 >> 8) & 255);
            bArr[i10 + 2] = (byte) ((i6 >> 16) & 255);
            bArr[i10 + 3] = (byte) ((i6 >> 24) & 255);
            this.f41651f = i10 + 4;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.play_billing.C6297t2(i10, this.f41650e, 4, e6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void k(int i6, long j6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t((i6 << 3) | 1);
        l(j6);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void l(long j6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        int i6 = this.f41651f;
        try {
            byte[] bArr = this.f41649d;
            bArr[i6] = (byte) (((int) j6) & 255);
            bArr[i6 + 1] = (byte) (((int) (j6 >> 8)) & 255);
            bArr[i6 + 2] = (byte) (((int) (j6 >> 16)) & 255);
            bArr[i6 + 3] = (byte) (((int) (j6 >> 24)) & 255);
            bArr[i6 + 4] = (byte) (((int) (j6 >> 32)) & 255);
            bArr[i6 + 5] = (byte) (((int) (j6 >> 40)) & 255);
            bArr[i6 + 6] = (byte) (((int) (j6 >> 48)) & 255);
            bArr[i6 + 7] = (byte) (((int) (j6 >> 56)) & 255);
            this.f41651f = i6 + 8;
        } catch (java.lang.IndexOutOfBoundsException e6) {
            throw new com.google.android.gms.internal.play_billing.C6297t2(i6, this.f41650e, 8, e6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void m(int i6, int i10) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t(i6 << 3);
        n(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void n(int i6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        if (i6 >= 0) {
            t(i6);
        } else {
            v(i6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void o(byte[] bArr, int i6, int i10) {
        A(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    final void p(int i6, com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t((i6 << 3) | 2);
        t(((com.google.android.gms.internal.play_billing.Z1) interfaceC6233i3).b(interfaceC6298t3));
        interfaceC6298t3.h(interfaceC6233i3, this.f41662a);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void q(int i6, java.lang.String str) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t((i6 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void r(int i6, int i10) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t((i6 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void s(int i6, int i10) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t(i6 << 3);
        t(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void t(int i6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        while ((i6 & (-128)) != 0) {
            try {
                byte[] bArr = this.f41649d;
                int i10 = this.f41651f;
                this.f41651f = i10 + 1;
                bArr[i10] = (byte) ((i6 | 128) & 255);
                i6 >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e6) {
                throw new com.google.android.gms.internal.play_billing.C6297t2(this.f41651f, this.f41650e, 1, e6);
            }
        }
        byte[] bArr2 = this.f41649d;
        int i11 = this.f41651f;
        this.f41651f = i11 + 1;
        bArr2[i11] = (byte) i6;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void u(int i6, long j6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        t(i6 << 3);
        v(j6);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6309v2
    public final void v(long j6) throws com.google.android.gms.internal.play_billing.C6297t2 {
        if (!com.google.android.gms.internal.play_billing.AbstractC6309v2.f41661c || this.f41650e - this.f41651f < 10) {
            while ((j6 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f41649d;
                    int i6 = this.f41651f;
                    this.f41651f = i6 + 1;
                    bArr[i6] = (byte) ((((int) j6) | 128) & 255);
                    j6 >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e6) {
                    throw new com.google.android.gms.internal.play_billing.C6297t2(this.f41651f, this.f41650e, 1, e6);
                }
            }
            byte[] bArr2 = this.f41649d;
            int i10 = this.f41651f;
            this.f41651f = i10 + 1;
            bArr2[i10] = (byte) j6;
            return;
        }
        while (true) {
            int i11 = (int) j6;
            if ((j6 & (-128)) == 0) {
                byte[] bArr3 = this.f41649d;
                int i12 = this.f41651f;
                this.f41651f = i12 + 1;
                com.google.android.gms.internal.play_billing.G3.s(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.f41649d;
            int i13 = this.f41651f;
            this.f41651f = i13 + 1;
            com.google.android.gms.internal.play_billing.G3.s(bArr4, i13, (byte) ((i11 | 128) & 255));
            j6 >>>= 7;
        }
    }
}
