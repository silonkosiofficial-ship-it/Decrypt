package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class MF0 extends com.google.android.gms.internal.ads.AbstractC5619wv {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f29693l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f29695n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte[] f29698q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29694m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29696o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f29697p = 0;

    public MF0() {
        byte[] bArr = com.google.android.gms.internal.ads.EW.f27066f;
        this.f29695n = bArr;
        this.f29698q = bArr;
    }

    private final int q(int i6) {
        int iR = ((r(2000000L) - this.f29694m) * this.f29690i) - (this.f29695n.length >> 1);
        com.google.android.gms.internal.ads.LC.f(iR >= 0);
        int iMin = (int) java.lang.Math.min((i6 * 0.2f) + 0.5f, iR);
        int i10 = this.f29690i;
        return (iMin / i10) * i10;
    }

    private final int r(long j6) {
        return (int) ((j6 * ((long) this.f39715b.f31384a)) / 1000000);
    }

    private static int s(byte b6, byte b10) {
        return (b6 << 8) | (b10 & 255);
    }

    private final void t(boolean z6) {
        int i6;
        int length;
        int i10 = this.f29697p;
        int length2 = this.f29695n.length;
        if (i10 != length2) {
            if (!z6) {
                return;
            } else {
                z6 = true;
            }
        }
        if (this.f29694m == 0) {
            if (z6) {
                u(i10, 3);
                length = i10;
            } else {
                com.google.android.gms.internal.ads.LC.f(i10 >= (length2 >> 1));
                length = this.f29695n.length >> 1;
                u(length, 0);
            }
            i6 = length;
        } else {
            int i11 = length2 >> 1;
            int i12 = i10 - i11;
            if (z6) {
                int iQ = q(i12) + (this.f29695n.length >> 1);
                u(iQ, 2);
                int i13 = i11 + i12;
                i6 = iQ;
                length = i13;
            } else {
                int iQ2 = q(i12);
                u(iQ2, 1);
                i6 = iQ2;
                length = i12;
            }
        }
        com.google.android.gms.internal.ads.LC.g(length % this.f29690i == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        com.google.android.gms.internal.ads.LC.f(i10 >= i6);
        this.f29697p -= length;
        int i14 = this.f29696o + length;
        this.f29696o = i14;
        this.f29696o = i14 % this.f29695n.length;
        int i15 = this.f29694m;
        int i16 = this.f29690i;
        this.f29694m = i15 + (i6 / i16);
        this.f29693l += (long) ((length - i6) / i16);
    }

    private final void u(int i6, int i10) {
        int i11;
        if (i6 == 0) {
            return;
        }
        com.google.android.gms.internal.ads.LC.d(this.f29697p >= i6);
        int i12 = this.f29696o;
        if (i10 == 2) {
            int i13 = this.f29697p;
            int i14 = i12 + i13;
            byte[] bArr = this.f29695n;
            int length = bArr.length;
            if (i14 <= length) {
                java.lang.System.arraycopy(bArr, i14 - i6, this.f29698q, 0, i6);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i6) {
                    java.lang.System.arraycopy(bArr, i15 - i6, this.f29698q, 0, i6);
                } else {
                    int i16 = i6 - i15;
                    java.lang.System.arraycopy(bArr, length - i16, this.f29698q, 0, i16);
                    java.lang.System.arraycopy(this.f29695n, 0, this.f29698q, i16, i15);
                }
            }
        } else {
            int i17 = i12 + i6;
            byte[] bArr2 = this.f29695n;
            int length2 = bArr2.length;
            if (i17 <= length2) {
                java.lang.System.arraycopy(bArr2, i12, this.f29698q, 0, i6);
            } else {
                int i18 = length2 - i12;
                java.lang.System.arraycopy(bArr2, i12, this.f29698q, 0, i18);
                java.lang.System.arraycopy(this.f29695n, 0, this.f29698q, i18, i6 - i18);
            }
        }
        com.google.android.gms.internal.ads.LC.e(i6 % this.f29690i == 0, "sizeToOutput is not aligned to frame size: " + i6);
        com.google.android.gms.internal.ads.LC.f(this.f29696o < this.f29695n.length);
        byte[] bArr3 = this.f29698q;
        com.google.android.gms.internal.ads.LC.e(i6 % this.f29690i == 0, "byteOutput size is not aligned to frame size " + i6);
        if (i10 != 3) {
            for (int i19 = 0; i19 < i6; i19 += 2) {
                int i20 = i19 + 1;
                int iS = s(bArr3[i20], bArr3[i19]);
                if (i10 == 0) {
                    i11 = ((((i19 * 1000) / (i6 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i19) / (i6 - 1)) / 1000);
                    }
                }
                int i21 = (iS * i11) / 100;
                if (i21 >= 32767) {
                    bArr3[i19] = -1;
                    bArr3[i20] = 127;
                } else if (i21 <= -32768) {
                    bArr3[i19] = 0;
                    bArr3[i20] = -128;
                } else {
                    bArr3[i19] = (byte) (i21 & 255);
                    bArr3[i20] = (byte) (i21 >> 8);
                }
            }
        }
        j(i6).put(bArr3, 0, i6).flip();
    }

    private static final boolean v(byte b6, byte b10) {
        return java.lang.Math.abs(s(b6, b10)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        int iLimit2;
        int i6;
        while (byteBuffer.hasRemaining() && !n()) {
            if (this.f29692k != 0) {
                com.google.android.gms.internal.ads.LC.f(this.f29696o < this.f29695n.length);
                iLimit = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (v(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i10 = this.f29690i;
                            iLimit2 = i10 * (iPosition2 / i10);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                int i11 = this.f29696o;
                int i12 = this.f29697p;
                int i13 = i11 + i12;
                int length = this.f29695n.length;
                if (i13 < length) {
                    i6 = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i6 = i11 - i13;
                }
                int iMin = java.lang.Math.min(iPosition3, i6);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f29695n, i13, iMin);
                int i14 = this.f29697p + iMin;
                this.f29697p = i14;
                com.google.android.gms.internal.ads.LC.f(i14 <= this.f29695n.length);
                boolean z6 = iLimit2 < iLimit && iPosition3 < i6;
                t(z6);
                if (z6) {
                    this.f29692k = 0;
                    this.f29694m = 0;
                }
            } else {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(java.lang.Math.min(iLimit, byteBuffer.position() + this.f29695n.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (v(byteBuffer.get(iLimit3), byteBuffer.get(iLimit3 - 1))) {
                            int i15 = this.f29690i;
                            iPosition = ((iLimit3 / i15) * i15) + i15;
                            break;
                        }
                        iLimit3 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f29692k = 1;
                } else {
                    byteBuffer.limit(java.lang.Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
            }
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    protected final com.google.android.gms.internal.ads.C2809Rt h(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        if (c2809Rt.f31386c == 2) {
            return c2809Rt.f31384a == -1 ? com.google.android.gms.internal.ads.C2809Rt.f31383e : c2809Rt;
        }
        throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv, com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final boolean i() {
        return super.i() && this.f29691j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final void k() {
        if (i()) {
            int i6 = this.f39715b.f31385b;
            this.f29690i = i6 + i6;
            int iR = r(100000L) / 2;
            int i10 = this.f29690i;
            int i11 = (iR / i10) * i10;
            int i12 = i11 + i11;
            if (this.f29695n.length != i12) {
                this.f29695n = new byte[i12];
                this.f29698q = new byte[i12];
            }
        }
        this.f29692k = 0;
        this.f29693l = 0L;
        this.f29694m = 0;
        this.f29696o = 0;
        this.f29697p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final void l() {
        if (this.f29697p > 0) {
            t(true);
            this.f29694m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final void m() {
        this.f29691j = false;
        byte[] bArr = com.google.android.gms.internal.ads.EW.f27066f;
        this.f29695n = bArr;
        this.f29698q = bArr;
    }

    public final long o() {
        return this.f29693l;
    }

    public final void p(boolean z6) {
        this.f29691j = z6;
    }
}
