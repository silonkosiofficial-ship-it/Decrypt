package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class RQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f31264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31267d;

    public RQ() {
        this.f31264a = com.google.android.gms.internal.ads.EW.f27066f;
    }

    public RQ(byte[] bArr, int i6) {
        this.f31264a = bArr;
        this.f31267d = i6;
    }

    private final void q() {
        int i6;
        int i10 = this.f31265b;
        boolean z6 = false;
        if (i10 >= 0 && (i10 < (i6 = this.f31267d) || (i10 == i6 && this.f31266c == 0))) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.f(z6);
    }

    public final int a() {
        return ((this.f31267d - this.f31265b) * 8) - this.f31266c;
    }

    public final int b() {
        com.google.android.gms.internal.ads.LC.f(this.f31266c == 0);
        return this.f31265b;
    }

    public final int c() {
        return (this.f31265b * 8) + this.f31266c;
    }

    public final int d(int i6) {
        int i10;
        if (i6 == 0) {
            return 0;
        }
        this.f31266c += i6;
        int i11 = 0;
        while (true) {
            i10 = this.f31266c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f31266c = i12;
            byte[] bArr = this.f31264a;
            int i13 = this.f31265b;
            this.f31265b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f31264a;
        int i14 = this.f31265b;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i6;
        if (i10 == 8) {
            this.f31266c = 0;
            this.f31265b = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        q();
        return i17;
    }

    public final long e(int i6) {
        if (i6 <= 32) {
            int iD = d(i6);
            int i10 = com.google.android.gms.internal.ads.EW.f27061a;
            return 4294967295L & ((long) iD);
        }
        int iD2 = d(i6 - 32);
        int iD3 = d(32);
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        return (4294967295L & ((long) iD3)) | ((((long) iD2) & 4294967295L) << 32);
    }

    public final void f() {
        if (this.f31266c == 0) {
            return;
        }
        this.f31266c = 0;
        this.f31265b++;
        q();
    }

    public final void g(int i6, int i10) {
        int iMin = java.lang.Math.min(8 - this.f31266c, 14);
        int i11 = this.f31266c;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.f31264a;
        int i13 = this.f31265b;
        byte b6 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b6;
        int i14 = 14 - iMin;
        int i15 = i6 & 16383;
        bArr[i13] = (byte) (b6 | ((i15 >>> i14) << i12));
        int i16 = i13 + 1;
        while (i14 > 8) {
            i14 -= 8;
            this.f31264a[i16] = (byte) (i15 >>> i14);
            i16++;
        }
        int i17 = 8 - i14;
        byte[] bArr2 = this.f31264a;
        byte b10 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b10;
        bArr2[i16] = (byte) (((i15 & ((1 << i14) - 1)) << i17) | b10);
        n(14);
        q();
    }

    public final void h(byte[] bArr, int i6, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.f31264a;
            int i13 = this.f31265b;
            int i14 = i13 + 1;
            this.f31265b = i14;
            byte b6 = bArr2[i13];
            int i15 = this.f31266c;
            byte b10 = (byte) (b6 << i15);
            bArr[i12] = b10;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b10);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b11;
        int i17 = this.f31266c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f31264a;
            int i18 = this.f31265b;
            this.f31265b = i18 + 1;
            b11 = (byte) (b11 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b11;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.f31266c = i19;
        byte[] bArr4 = this.f31264a;
        int i20 = this.f31265b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b11);
        if (i19 == 8) {
            this.f31266c = 0;
            this.f31265b = i20 + 1;
        }
        q();
    }

    public final void i(byte[] bArr, int i6, int i10) {
        com.google.android.gms.internal.ads.LC.f(this.f31266c == 0);
        java.lang.System.arraycopy(this.f31264a, this.f31265b, bArr, 0, i10);
        this.f31265b += i10;
        q();
    }

    public final void j(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        k(c5128sR.n(), c5128sR.u());
        l(c5128sR.t() * 8);
    }

    public final void k(byte[] bArr, int i6) {
        this.f31264a = bArr;
        this.f31265b = 0;
        this.f31266c = 0;
        this.f31267d = i6;
    }

    public final void l(int i6) {
        int i10 = i6 / 8;
        this.f31265b = i10;
        this.f31266c = i6 - (i10 * 8);
        q();
    }

    public final void m() {
        int i6 = this.f31266c + 1;
        this.f31266c = i6;
        if (i6 == 8) {
            this.f31266c = 0;
            this.f31265b++;
        }
        q();
    }

    public final void n(int i6) {
        int i10 = i6 / 8;
        int i11 = this.f31265b + i10;
        this.f31265b = i11;
        int i12 = this.f31266c + (i6 - (i10 * 8));
        this.f31266c = i12;
        if (i12 > 7) {
            this.f31265b = i11 + 1;
            this.f31266c = i12 - 8;
        }
        q();
    }

    public final void o(int i6) {
        com.google.android.gms.internal.ads.LC.f(this.f31266c == 0);
        this.f31265b += i6;
        q();
    }

    public final boolean p() {
        int i6 = this.f31264a[this.f31265b] & (128 >> this.f31266c);
        m();
        return i6 != 0;
    }
}
