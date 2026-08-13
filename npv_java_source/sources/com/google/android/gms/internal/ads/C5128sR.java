package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5128sR {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f38737d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f38738e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3947hi0 f38739f = com.google.android.gms.internal.ads.AbstractC3947hi0.S(java.nio.charset.StandardCharsets.US_ASCII, java.nio.charset.StandardCharsets.UTF_8, java.nio.charset.StandardCharsets.UTF_16, java.nio.charset.StandardCharsets.UTF_16BE, java.nio.charset.StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f38740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38742c;

    public C5128sR() {
        this.f38740a = com.google.android.gms.internal.ads.EW.f27066f;
    }

    public C5128sR(int i6) {
        this.f38740a = new byte[i6];
        this.f38742c = i6;
    }

    public C5128sR(byte[] bArr) {
        this.f38740a = bArr;
        this.f38742c = bArr.length;
    }

    public C5128sR(byte[] bArr, int i6) {
        this.f38740a = bArr;
        this.f38742c = i6;
    }

    private final char o(java.nio.charset.Charset charset, char[] cArr) {
        int iP = p(charset);
        if (iP != 0) {
            int i6 = iP >> 16;
            for (char c6 : cArr) {
                char c10 = (char) i6;
                if (c6 == c10) {
                    this.f38741b += (char) iP;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private final int p(java.nio.charset.Charset charset) {
        byte bA;
        int i6;
        int i10;
        char cB;
        int i11;
        int i12;
        int i13 = 1;
        if (charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            int i14 = this.f38742c;
            int i15 = this.f38741b;
            if (i14 - i15 > 0) {
                bA = (byte) com.google.android.gms.internal.ads.AbstractC2355Fj0.a(this.f38740a[i15] & 255);
            } else {
                if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                    i6 = this.f38742c;
                    i10 = this.f38741b;
                    if (i6 - i10 >= 2) {
                        byte[] bArr = this.f38740a;
                        cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr[i10], bArr[i10 + 1]);
                    } else {
                        if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                            return 0;
                        }
                        i11 = this.f38742c;
                        i12 = this.f38741b;
                        if (i11 - i12 >= 2) {
                            return 0;
                        }
                        byte[] bArr2 = this.f38740a;
                        cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr2[i12 + 1], bArr2[i12]);
                    }
                } else {
                    if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i11 = this.f38742c;
                    i12 = this.f38741b;
                    if (i11 - i12 >= 2) {
                        return 0;
                    }
                    byte[] bArr3 = this.f38740a;
                    cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr3[i12 + 1], bArr3[i12]);
                }
                bA = (byte) cB;
                i13 = 2;
            }
        } else {
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16)) {
                i6 = this.f38742c;
                i10 = this.f38741b;
                if (i6 - i10 >= 2) {
                    byte[] bArr4 = this.f38740a;
                    cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr4[i10], bArr4[i10 + 1]);
                } else {
                    if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i11 = this.f38742c;
                    i12 = this.f38741b;
                    if (i11 - i12 >= 2) {
                        return 0;
                    }
                    byte[] bArr5 = this.f38740a;
                    cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr5[i12 + 1], bArr5[i12]);
                }
            } else {
                i6 = this.f38742c;
                i10 = this.f38741b;
                if (i6 - i10 >= 2) {
                    byte[] bArr6 = this.f38740a;
                    cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr6[i10], bArr6[i10 + 1]);
                } else {
                    if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i11 = this.f38742c;
                    i12 = this.f38741b;
                    if (i11 - i12 >= 2) {
                        return 0;
                    }
                    byte[] bArr7 = this.f38740a;
                    cB = com.google.android.gms.internal.ads.AbstractC2355Fj0.b(bArr7[i12 + 1], bArr7[i12]);
                }
            }
            bA = (byte) cB;
            i13 = 2;
        }
        return (com.google.android.gms.internal.ads.AbstractC2355Fj0.a(bA) << 16) + i13;
    }

    public final int A() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        this.f38741b = i6 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public final int C() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        this.f38741b = i6 + 1;
        return bArr[i6] & 255;
    }

    public final int D() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        this.f38741b = i6 + 2;
        int i12 = bArr[i10] & 255;
        this.f38741b = i6 + 4;
        return i12 | (i11 << 8);
    }

    public final int E() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i6 + 2;
        this.f38741b = i12;
        int i13 = bArr[i10] & 255;
        this.f38741b = i6 + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final int F() {
        int iW = w();
        if (iW >= 0) {
            return iW;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + iW);
    }

    public final int G() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        this.f38741b = i6 + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final long H() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        long j6 = bArr[i6];
        int i11 = i6 + 2;
        this.f38741b = i11;
        long j10 = bArr[i10];
        int i12 = i6 + 3;
        this.f38741b = i12;
        long j11 = bArr[i11];
        int i13 = i6 + 4;
        this.f38741b = i13;
        long j12 = bArr[i12];
        int i14 = i6 + 5;
        this.f38741b = i14;
        long j13 = bArr[i13];
        int i15 = i6 + 6;
        this.f38741b = i15;
        long j14 = bArr[i14];
        int i16 = i6 + 7;
        this.f38741b = i16;
        long j15 = bArr[i15];
        this.f38741b = i6 + 8;
        long j16 = j14 & 255;
        return ((((long) bArr[i16]) & 255) << 56) | ((j15 & 255) << 48) | ((j10 & 255) << 8) | (j6 & 255) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((j13 & 255) << 32) | (j16 << 40);
    }

    public final long I() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        long j6 = bArr[i6];
        int i11 = i6 + 2;
        this.f38741b = i11;
        long j10 = bArr[i10];
        int i12 = i6 + 3;
        this.f38741b = i12;
        long j11 = bArr[i11];
        this.f38741b = i6 + 4;
        return ((((long) bArr[i12]) & 255) << 24) | (j6 & 255) | ((j10 & 255) << 8) | ((j11 & 255) << 16);
    }

    public final long J() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        long j6 = bArr[i6];
        int i11 = i6 + 2;
        this.f38741b = i11;
        long j10 = bArr[i10];
        int i12 = i6 + 3;
        this.f38741b = i12;
        long j11 = bArr[i11];
        int i13 = i6 + 4;
        this.f38741b = i13;
        long j12 = bArr[i12];
        int i14 = i6 + 5;
        this.f38741b = i14;
        long j13 = bArr[i13];
        int i15 = i6 + 6;
        this.f38741b = i15;
        long j14 = bArr[i14];
        int i16 = i6 + 7;
        this.f38741b = i16;
        long j15 = bArr[i15];
        this.f38741b = i6 + 8;
        return (((long) bArr[i16]) & 255) | ((j6 & 255) << 56) | ((j10 & 255) << 48) | ((j11 & 255) << 40) | ((j12 & 255) << 32) | ((j13 & 255) << 24) | ((j14 & 255) << 16) | ((j15 & 255) << 8);
    }

    public final long K() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        long j6 = bArr[i6];
        int i11 = i6 + 2;
        this.f38741b = i11;
        long j10 = bArr[i10];
        int i12 = i6 + 3;
        this.f38741b = i12;
        long j11 = bArr[i11];
        this.f38741b = i6 + 4;
        return (((long) bArr[i12]) & 255) | ((j6 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public final long L() {
        long j6 = 0;
        for (int i6 = 0; i6 < 9; i6++) {
            if (this.f38741b == this.f38742c) {
                throw new java.lang.IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jC = C();
            j6 |= (127 & jC) << (i6 * 7);
            if ((jC & 128) == 0) {
                break;
            }
        }
        return j6;
    }

    public final long M() {
        long J10 = J();
        if (J10 >= 0) {
            return J10;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + J10);
    }

    public final long N() {
        int i6;
        int i10;
        long j6 = this.f38740a[this.f38741b];
        int i11 = 7;
        while (true) {
            i6 = 0;
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j6) == 0) {
                if (i11 >= 6) {
                    if (i11 != 7) {
                        break;
                    }
                    i6 = 1;
                    break;
                }
                j6 &= (long) (i12 - 1);
                i6 = 7 - i11;
                break;
            }
            i11--;
        }
        if (i6 == 0) {
            throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: " + j6);
        }
        for (i10 = 1; i10 < i6; i10++) {
            byte b6 = this.f38740a[this.f38741b + i10];
            if ((b6 & 192) != 128) {
                throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j6);
            }
            j6 = (j6 << 6) | ((long) (b6 & 63));
        }
        this.f38741b += i6;
        return j6;
    }

    public final java.lang.String O(char c6) {
        int i6 = this.f38742c;
        int i10 = this.f38741b;
        if (i6 - i10 == 0) {
            return null;
        }
        while (i10 < this.f38742c && this.f38740a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f38740a;
        int i11 = this.f38741b;
        java.lang.String strC = com.google.android.gms.internal.ads.EW.c(bArr, i11, i10 - i11);
        this.f38741b = i10;
        if (i10 < this.f38742c) {
            this.f38741b = i10 + 1;
        }
        return strC;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    public final java.lang.String P(java.nio.charset.Charset charset) {
        byte[] bArr;
        com.google.android.gms.internal.ads.LC.e(f38739f.contains(charset), "Unsupported charset: ".concat(java.lang.String.valueOf(charset)));
        if (this.f38742c - this.f38741b == 0) {
            return null;
        }
        java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            c();
        }
        int i6 = 1;
        if (!charset.equals(java.nio.charset.StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i6 = 2;
            if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: ".concat(java.lang.String.valueOf(charset)));
            }
        }
        int i10 = this.f38741b;
        while (true) {
            int i11 = this.f38742c;
            if (i10 >= i11 - (i6 - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) && com.google.android.gms.internal.ads.EW.l(this.f38740a[i10])) {
                break;
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f38740a;
                if (bArr2[i10] == 0 && com.google.android.gms.internal.ads.EW.l(bArr2[i10 + 1])) {
                    break;
                }
                if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                    bArr = this.f38740a;
                    if (bArr[i10 + 1] == 0 && com.google.android.gms.internal.ads.EW.l(bArr[i10])) {
                        break;
                    }
                }
                i10 += i6;
            } else {
                if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                    bArr = this.f38740a;
                    if (bArr[i10 + 1] == 0) {
                        continue;
                    }
                }
                i10 += i6;
            }
        }
        java.lang.String strB = b(i10 - this.f38741b, charset);
        if (this.f38741b != this.f38742c && o(charset, f38737d) == '\r') {
            o(charset, f38738e);
        }
        return strB;
    }

    public final java.lang.String a(int i6) {
        if (i6 == 0) {
            return "";
        }
        int i10 = this.f38741b;
        int i11 = (i10 + i6) - 1;
        java.lang.String strC = com.google.android.gms.internal.ads.EW.c(this.f38740a, i10, (i11 >= this.f38742c || this.f38740a[i11] != 0) ? i6 : i6 - 1);
        this.f38741b += i6;
        return strC;
    }

    public final java.lang.String b(int i6, java.nio.charset.Charset charset) {
        byte[] bArr = this.f38740a;
        int i10 = this.f38741b;
        java.lang.String str = new java.lang.String(bArr, i10, i6, charset);
        this.f38741b = i10 + i6;
        return str;
    }

    public final java.nio.charset.Charset c() {
        int i6 = this.f38742c;
        int i10 = this.f38741b;
        int i11 = i6 - i10;
        if (i11 >= 3) {
            byte[] bArr = this.f38740a;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f38741b = i10 + 3;
                return java.nio.charset.StandardCharsets.UTF_8;
            }
        }
        if (i11 < 2) {
            return null;
        }
        byte[] bArr2 = this.f38740a;
        byte b6 = bArr2[i10];
        if (b6 == -2) {
            if (bArr2[i10 + 1] != -1) {
                return null;
            }
            this.f38741b = i10 + 2;
            return java.nio.charset.StandardCharsets.UTF_16BE;
        }
        if (b6 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f38741b = i10 + 2;
        return java.nio.charset.StandardCharsets.UTF_16LE;
    }

    public final short d() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        this.f38741b = i6 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final short e() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        this.f38741b = i6 + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final void f(int i6) {
        byte[] bArr = this.f38740a;
        if (i6 > bArr.length) {
            this.f38740a = java.util.Arrays.copyOf(bArr, i6);
        }
    }

    public final void g(com.google.android.gms.internal.ads.RQ rq, int i6) {
        h(rq.f31264a, 0, i6);
        rq.l(0);
    }

    public final void h(byte[] bArr, int i6, int i10) {
        java.lang.System.arraycopy(this.f38740a, this.f38741b, bArr, i6, i10);
        this.f38741b += i10;
    }

    public final void i(int i6) {
        byte[] bArr = this.f38740a;
        if (bArr.length < i6) {
            bArr = new byte[i6];
        }
        j(bArr, i6);
    }

    public final void j(byte[] bArr, int i6) {
        this.f38740a = bArr;
        this.f38742c = i6;
        this.f38741b = 0;
    }

    public final void k(int i6) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= this.f38740a.length) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f38742c = i6;
    }

    public final void l(int i6) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= this.f38742c) {
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        this.f38741b = i6;
    }

    public final void m(int i6) {
        l(this.f38741b + i6);
    }

    public final byte[] n() {
        return this.f38740a;
    }

    public final char q(java.nio.charset.Charset charset) {
        com.google.android.gms.internal.ads.LC.e(f38739f.contains(charset), "Unsupported charset: ".concat(java.lang.String.valueOf(charset)));
        return (char) (p(charset) >> 16);
    }

    public final int r() {
        return this.f38742c - this.f38741b;
    }

    public final int s() {
        return this.f38740a.length;
    }

    public final int t() {
        return this.f38741b;
    }

    public final int u() {
        return this.f38742c;
    }

    public final int v() {
        return this.f38740a[this.f38741b] & 255;
    }

    public final int w() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i6 + 2;
        this.f38741b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i6 + 3;
        this.f38741b = i14;
        int i15 = bArr[i12] & 255;
        this.f38741b = i6 + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int x() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i6 + 2;
        this.f38741b = i12;
        int i13 = bArr[i10] & 255;
        this.f38741b = i6 + 3;
        return (bArr[i12] & 255) | ((i11 << 24) >> 8) | (i13 << 8);
    }

    public final int y() {
        byte[] bArr = this.f38740a;
        int i6 = this.f38741b;
        int i10 = i6 + 1;
        this.f38741b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i6 + 2;
        this.f38741b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i6 + 3;
        this.f38741b = i14;
        int i15 = bArr[i12] & 255;
        this.f38741b = i6 + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final int z() {
        int iY = y();
        if (iY >= 0) {
            return iY;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + iY);
    }
}
