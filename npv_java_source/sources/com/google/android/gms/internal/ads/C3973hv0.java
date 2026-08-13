package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3973hv0 extends com.google.android.gms.internal.ads.AbstractC4301kv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Iterable f36164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.Iterator f36165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.nio.ByteBuffer f36166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f36173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f36174p;

    /* synthetic */ C3973hv0(java.lang.Iterable iterable, int i6, boolean z6, com.google.android.gms.internal.ads.AbstractC4191jv0 abstractC4191jv0) {
        super(null);
        this.f36169k = Integer.MAX_VALUE;
        this.f36167i = i6;
        this.f36164f = iterable;
        this.f36165g = iterable.iterator();
        this.f36171m = 0;
        if (i6 != 0) {
            G();
            return;
        }
        this.f36166h = com.google.android.gms.internal.ads.Tv0.f32043c;
        this.f36172n = 0L;
        this.f36173o = 0L;
        this.f36174p = 0L;
    }

    private final int C() {
        return (int) ((((long) (this.f36167i - this.f36171m)) - this.f36172n) + this.f36173o);
    }

    private final void D() throws com.google.android.gms.internal.ads.Vv0 {
        if (!this.f36165g.hasNext()) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        G();
    }

    private final void E(byte[] bArr, int i6, int i10) throws com.google.android.gms.internal.ads.Vv0 {
        if (i10 > C()) {
            if (i10 > 0) {
                throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (this.f36174p - this.f36172n == 0) {
                D();
            }
            int iMin = java.lang.Math.min(i11, (int) (this.f36174p - this.f36172n));
            long j6 = iMin;
            com.google.android.gms.internal.ads.Sw0.w(this.f36172n, bArr, i10 - i11, j6);
            i11 -= iMin;
            this.f36172n += j6;
        }
    }

    private final void F() {
        int i6 = this.f36167i + this.f36168j;
        this.f36167i = i6;
        int i10 = this.f36169k;
        if (i6 <= i10) {
            this.f36168j = 0;
            return;
        }
        int i11 = i6 - i10;
        this.f36168j = i11;
        this.f36167i = i6 - i11;
    }

    private final void G() {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.f36165g.next();
        this.f36166h = byteBuffer;
        this.f36171m += (int) (this.f36172n - this.f36173o);
        long jPosition = byteBuffer.position();
        this.f36172n = jPosition;
        this.f36173o = jPosition;
        this.f36174p = this.f36166h.limit();
        long jM = com.google.android.gms.internal.ads.Sw0.m(this.f36166h);
        this.f36172n += jM;
        this.f36173o += jM;
        this.f36174p += jM;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final void A(int i6) {
        this.f36169k = i6;
        F();
    }

    final long B() throws com.google.android.gms.internal.ads.Vv0 {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            byte bH = H();
            j6 |= ((long) (bH & 127)) << i6;
            if ((bH & 128) == 0) {
                return j6;
            }
        }
        throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered a malformed varint.");
    }

    public final byte H() throws com.google.android.gms.internal.ads.Vv0 {
        if (this.f36174p - this.f36172n == 0) {
            D();
        }
        long j6 = this.f36172n;
        this.f36172n = 1 + j6;
        return com.google.android.gms.internal.ads.Sw0.i(j6);
    }

    public final int I() {
        long j6 = this.f36174p;
        long j10 = this.f36172n;
        if (j6 - j10 < 4) {
            int iH = H() & 255;
            int iH2 = (H() & 255) << 8;
            return iH | iH2 | ((H() & 255) << 16) | ((H() & 255) << 24);
        }
        this.f36172n = 4 + j10;
        int i6 = com.google.android.gms.internal.ads.Sw0.i(j10) & 255;
        int i10 = (com.google.android.gms.internal.ads.Sw0.i(1 + j10) & 255) << 8;
        return i6 | i10 | ((com.google.android.gms.internal.ads.Sw0.i(2 + j10) & 255) << 16) | ((com.google.android.gms.internal.ads.Sw0.i(j10 + 3) & 255) << 24);
    }

    public final int J() {
        int i6;
        long j6 = this.f36172n;
        if (this.f36174p != j6) {
            long j10 = j6 + 1;
            byte bI = com.google.android.gms.internal.ads.Sw0.i(j6);
            if (bI >= 0) {
                this.f36172n++;
                return bI;
            }
            if (this.f36174p - this.f36172n >= 10) {
                long j11 = 2 + j6;
                int i10 = (com.google.android.gms.internal.ads.Sw0.i(j10) << 7) ^ bI;
                if (i10 < 0) {
                    i6 = i10 ^ (-128);
                } else {
                    long j12 = 3 + j6;
                    int i11 = (com.google.android.gms.internal.ads.Sw0.i(j11) << 14) ^ i10;
                    if (i11 >= 0) {
                        i6 = i11 ^ 16256;
                    } else {
                        long j13 = 4 + j6;
                        int i12 = i11 ^ (com.google.android.gms.internal.ads.Sw0.i(j12) << 21);
                        if (i12 < 0) {
                            i6 = (-2080896) ^ i12;
                        } else {
                            j12 = 5 + j6;
                            byte bI2 = com.google.android.gms.internal.ads.Sw0.i(j13);
                            int i13 = (i12 ^ (bI2 << 28)) ^ 266354560;
                            if (bI2 < 0) {
                                j13 = 6 + j6;
                                if (com.google.android.gms.internal.ads.Sw0.i(j12) < 0) {
                                    j12 = 7 + j6;
                                    if (com.google.android.gms.internal.ads.Sw0.i(j13) < 0) {
                                        j13 = 8 + j6;
                                        if (com.google.android.gms.internal.ads.Sw0.i(j12) < 0) {
                                            j12 = 9 + j6;
                                            if (com.google.android.gms.internal.ads.Sw0.i(j13) < 0) {
                                                long j14 = j6 + 10;
                                                if (com.google.android.gms.internal.ads.Sw0.i(j12) >= 0) {
                                                    i6 = i13;
                                                    j11 = j14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i13;
                            }
                            i6 = i13;
                        }
                        j11 = j13;
                    }
                    j11 = j12;
                }
                this.f36172n = j11;
                return i6;
            }
        }
        return (int) B();
    }

    public final long K() {
        long j6 = this.f36174p;
        long j10 = this.f36172n;
        if (j6 - j10 < 8) {
            long jH = ((long) H()) & 255;
            long jH2 = (((long) H()) & 255) << 8;
            long jH3 = (((long) H()) & 255) << 16;
            long jH4 = (((long) H()) & 255) << 24;
            long jH5 = (((long) H()) & 255) << 32;
            long jH6 = (((long) H()) & 255) << 40;
            return jH | jH2 | jH3 | jH4 | jH5 | jH6 | ((((long) H()) & 255) << 48) | ((((long) H()) & 255) << 56);
        }
        this.f36172n = 8 + j10;
        long jI = ((long) com.google.android.gms.internal.ads.Sw0.i(j10)) & 255;
        long jI2 = (((long) com.google.android.gms.internal.ads.Sw0.i(1 + j10)) & 255) << 8;
        long jI3 = (((long) com.google.android.gms.internal.ads.Sw0.i(j10 + 2)) & 255) << 16;
        long jI4 = (((long) com.google.android.gms.internal.ads.Sw0.i(3 + j10)) & 255) << 24;
        long jI5 = (((long) com.google.android.gms.internal.ads.Sw0.i(j10 + 4)) & 255) << 32;
        long jI6 = (((long) com.google.android.gms.internal.ads.Sw0.i(j10 + 5)) & 255) << 40;
        return jI5 | jI | jI2 | jI3 | jI4 | jI6 | ((((long) com.google.android.gms.internal.ads.Sw0.i(j10 + 6)) & 255) << 48) | ((((long) com.google.android.gms.internal.ads.Sw0.i(j10 + 7)) & 255) << 56);
    }

    public final long L() {
        long j6;
        long j10;
        long j11 = this.f36172n;
        if (this.f36174p != j11) {
            long j12 = j11 + 1;
            byte bI = com.google.android.gms.internal.ads.Sw0.i(j11);
            if (bI >= 0) {
                this.f36172n++;
                return bI;
            }
            if (this.f36174p - this.f36172n >= 10) {
                long j13 = 2 + j11;
                int i6 = (com.google.android.gms.internal.ads.Sw0.i(j12) << 7) ^ bI;
                if (i6 < 0) {
                    j6 = i6 ^ (-128);
                } else {
                    long j14 = 3 + j11;
                    int i10 = (com.google.android.gms.internal.ads.Sw0.i(j13) << 14) ^ i6;
                    if (i10 >= 0) {
                        j6 = i10 ^ 16256;
                    } else {
                        long j15 = 4 + j11;
                        int i11 = i10 ^ (com.google.android.gms.internal.ads.Sw0.i(j14) << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                            j13 = j15;
                        } else {
                            j14 = 5 + j11;
                            long jI = (((long) com.google.android.gms.internal.ads.Sw0.i(j15)) << 28) ^ ((long) i11);
                            if (jI >= 0) {
                                j6 = 266354560 ^ jI;
                            } else {
                                long j16 = 6 + j11;
                                long jI2 = jI ^ (((long) com.google.android.gms.internal.ads.Sw0.i(j14)) << 35);
                                if (jI2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    long j17 = 7 + j11;
                                    long jI3 = jI2 ^ (((long) com.google.android.gms.internal.ads.Sw0.i(j16)) << 42);
                                    if (jI3 >= 0) {
                                        j6 = 4363953127296L ^ jI3;
                                    } else {
                                        j16 = 8 + j11;
                                        jI2 = jI3 ^ (((long) com.google.android.gms.internal.ads.Sw0.i(j17)) << 49);
                                        if (jI2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j17 = 9 + j11;
                                            long jI4 = (jI2 ^ (((long) com.google.android.gms.internal.ads.Sw0.i(j16)) << 56)) ^ 71499008037633920L;
                                            if (jI4 < 0) {
                                                long j18 = j11 + 10;
                                                if (com.google.android.gms.internal.ads.Sw0.i(j17) >= 0) {
                                                    j6 = jI4;
                                                    j13 = j18;
                                                }
                                            } else {
                                                j6 = jI4;
                                            }
                                        }
                                    }
                                    j13 = j17;
                                }
                                j6 = j10 ^ jI2;
                                j13 = j16;
                            }
                        }
                    }
                    j13 = j14;
                }
                this.f36172n = j13;
                return j6;
            }
        }
        return B();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final boolean a() {
        return (((long) this.f36171m) + this.f36172n) - this.f36173o == ((long) this.f36167i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final boolean b() {
        return L() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final double g() {
        return java.lang.Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final float h() {
        return java.lang.Float.intBitsToFloat(I());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int i() {
        return (int) ((((long) this.f36171m) + this.f36172n) - this.f36173o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int j(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (i6 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = i6 + i();
        int i11 = this.f36169k;
        if (i10 > i11) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f36169k = i10;
        F();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int k() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int l() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int m() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int n() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int o() {
        return com.google.android.gms.internal.ads.AbstractC4301kv0.c(J());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int p() throws com.google.android.gms.internal.ads.Vv0 {
        if (a()) {
            this.f36170l = 0;
            return 0;
        }
        int iJ = J();
        this.f36170l = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new com.google.android.gms.internal.ads.Vv0("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int q() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long s() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long u() {
        return com.google.android.gms.internal.ads.AbstractC4301kv0.d(L());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long v() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final com.google.android.gms.internal.ads.AbstractC3753fv0 w() throws com.google.android.gms.internal.ads.Vv0 {
        int iJ = J();
        if (iJ > 0) {
            long j6 = this.f36174p;
            long j10 = this.f36172n;
            long j11 = iJ;
            if (j11 <= j6 - j10) {
                byte[] bArr = new byte[iJ];
                com.google.android.gms.internal.ads.Sw0.w(j10, bArr, 0L, j11);
                this.f36172n += j11;
                return new com.google.android.gms.internal.ads.C3424cv0(bArr);
            }
        }
        if (iJ > 0 && iJ <= C()) {
            byte[] bArr2 = new byte[iJ];
            E(bArr2, 0, iJ);
            return new com.google.android.gms.internal.ads.C3424cv0(bArr2);
        }
        if (iJ == 0) {
            return com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        }
        if (iJ < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final java.lang.String x() throws com.google.android.gms.internal.ads.Vv0 {
        int iJ = J();
        if (iJ > 0) {
            long j6 = this.f36174p;
            long j10 = this.f36172n;
            long j11 = iJ;
            if (j11 <= j6 - j10) {
                byte[] bArr = new byte[iJ];
                com.google.android.gms.internal.ads.Sw0.w(j10, bArr, 0L, j11);
                java.lang.String str = new java.lang.String(bArr, com.google.android.gms.internal.ads.Tv0.f32041a);
                this.f36172n += j11;
                return str;
            }
        }
        if (iJ > 0 && iJ <= C()) {
            byte[] bArr2 = new byte[iJ];
            E(bArr2, 0, iJ);
            return new java.lang.String(bArr2, com.google.android.gms.internal.ads.Tv0.f32041a);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final java.lang.String y() throws com.google.android.gms.internal.ads.Vv0 {
        int iJ = J();
        if (iJ > 0) {
            long j6 = this.f36174p;
            long j10 = this.f36172n;
            long j11 = iJ;
            if (j11 <= j6 - j10) {
                java.lang.String strF = com.google.android.gms.internal.ads.Xw0.f(this.f36166h, (int) (j10 - this.f36173o), iJ);
                this.f36172n += j11;
                return strF;
            }
        }
        if (iJ >= 0 && iJ <= C()) {
            byte[] bArr = new byte[iJ];
            E(bArr, 0, iJ);
            return com.google.android.gms.internal.ads.Xw0.g(bArr, 0, iJ);
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final void z(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (this.f36170l != i6) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message end-group tag did not match expected tag.");
        }
    }
}
