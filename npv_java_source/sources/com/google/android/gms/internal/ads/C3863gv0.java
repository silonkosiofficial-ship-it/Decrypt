package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3863gv0 extends com.google.android.gms.internal.ads.AbstractC4301kv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f35713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f35717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35719l;

    /* synthetic */ C3863gv0(byte[] bArr, int i6, int i10, boolean z6, com.google.android.gms.internal.ads.AbstractC4191jv0 abstractC4191jv0) {
        super(null);
        this.f35719l = Integer.MAX_VALUE;
        this.f35713f = bArr;
        this.f35714g = i10 + i6;
        this.f35716i = i6;
        this.f35717j = i6;
    }

    private final void B() {
        int i6 = this.f35714g + this.f35715h;
        this.f35714g = i6;
        int i10 = i6 - this.f35717j;
        int i11 = this.f35719l;
        if (i10 <= i11) {
            this.f35715h = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f35715h = i12;
        this.f35714g = i6 - i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final void A(int i6) {
        this.f35719l = i6;
        B();
    }

    public final int C() throws com.google.android.gms.internal.ads.Vv0 {
        int i6 = this.f35716i;
        if (this.f35714g - i6 < 4) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f35713f;
        this.f35716i = i6 + 4;
        int i10 = bArr[i6] & 255;
        int i11 = bArr[i6 + 1] & 255;
        int i12 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int D() {
        int i6;
        int i10 = this.f35716i;
        int i11 = this.f35714g;
        if (i11 != i10) {
            byte[] bArr = this.f35713f;
            int i12 = i10 + 1;
            byte b6 = bArr[i10];
            if (b6 >= 0) {
                this.f35716i = i12;
                return b6;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b6;
                if (i14 < 0) {
                    i6 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i6 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i6 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i6 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i19;
                            }
                            i6 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f35716i = i13;
                return i6;
            }
        }
        return (int) G();
    }

    public final long E() throws com.google.android.gms.internal.ads.Vv0 {
        int i6 = this.f35716i;
        if (this.f35714g - i6 < 8) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f35713f;
        this.f35716i = i6 + 8;
        long j6 = bArr[i6];
        long j10 = (((long) bArr[i6 + 1]) & 255) << 8;
        long j11 = bArr[i6 + 2];
        long j12 = bArr[i6 + 3];
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (j6 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    public final long F() {
        long j6;
        long j10;
        int i6 = this.f35716i;
        int i10 = this.f35714g;
        if (i10 != i6) {
            byte[] bArr = this.f35713f;
            int i11 = i6 + 1;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f35716i = i11;
                return b6;
            }
            if (i10 - i11 >= 9) {
                int i12 = i6 + 2;
                int i13 = (bArr[i11] << 7) ^ b6;
                if (i13 < 0) {
                    j6 = i13 ^ (-128);
                } else {
                    int i14 = i6 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j6 = i15 ^ 16256;
                    } else {
                        int i16 = i6 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j6 = j11;
                        } else {
                            i14 = i6 + 5;
                            long j12 = (((long) bArr[i16]) << 28) ^ ((long) i17);
                            if (j12 >= 0) {
                                j6 = j12 ^ 266354560;
                            } else {
                                i12 = i6 + 6;
                                long j13 = (((long) bArr[i14]) << 35) ^ j12;
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    int i18 = i6 + 7;
                                    long j14 = j13 ^ (((long) bArr[i12]) << 42);
                                    if (j14 >= 0) {
                                        j6 = j14 ^ 4363953127296L;
                                    } else {
                                        i12 = i6 + 8;
                                        j13 = j14 ^ (((long) bArr[i18]) << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i18 = i6 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i12 = i6 + 10;
                                                if (bArr[i18] >= 0) {
                                                    j6 = j15;
                                                }
                                            } else {
                                                j6 = j15;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j6 = j13 ^ j10;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.f35716i = i12;
                return j6;
            }
        }
        return G();
    }

    final long G() throws com.google.android.gms.internal.ads.Vv0 {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            int i10 = this.f35716i;
            if (i10 == this.f35714g) {
                throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.f35713f;
            this.f35716i = i10 + 1;
            byte b6 = bArr[i10];
            j6 |= ((long) (b6 & 127)) << i6;
            if ((b6 & 128) == 0) {
                return j6;
            }
        }
        throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final boolean a() {
        return this.f35716i == this.f35714g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final boolean b() {
        return F() != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final double g() {
        return java.lang.Double.longBitsToDouble(E());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final float h() {
        return java.lang.Float.intBitsToFloat(C());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int i() {
        return this.f35716i - this.f35717j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int j(int i6) {
        if (i6 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = i6 + (this.f35716i - this.f35717j);
        if (i10 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("Failed to parse the message.");
        }
        int i11 = this.f35719l;
        if (i10 > i11) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f35719l = i10;
        B();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int k() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int l() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int m() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int n() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int o() {
        return com.google.android.gms.internal.ads.AbstractC4301kv0.c(D());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int p() throws com.google.android.gms.internal.ads.Vv0 {
        if (a()) {
            this.f35718k = 0;
            return 0;
        }
        int iD = D();
        this.f35718k = iD;
        if ((iD >>> 3) != 0) {
            return iD;
        }
        throw new com.google.android.gms.internal.ads.Vv0("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int q() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long r() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long s() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long t() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long u() {
        return com.google.android.gms.internal.ads.AbstractC4301kv0.d(F());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final long v() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final com.google.android.gms.internal.ads.AbstractC3753fv0 w() throws com.google.android.gms.internal.ads.Vv0 {
        int iD = D();
        if (iD > 0) {
            int i6 = this.f35714g;
            int i10 = this.f35716i;
            if (iD <= i6 - i10) {
                com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0T = com.google.android.gms.internal.ads.AbstractC3753fv0.T(this.f35713f, i10, iD);
                this.f35716i += iD;
                return abstractC3753fv0T;
            }
        }
        if (iD == 0) {
            return com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        }
        if (iD > 0) {
            int i11 = this.f35714g;
            int i12 = this.f35716i;
            if (iD <= i11 - i12) {
                int i13 = iD + i12;
                this.f35716i = i13;
                return new com.google.android.gms.internal.ads.C3424cv0(java.util.Arrays.copyOfRange(this.f35713f, i12, i13));
            }
        }
        if (iD <= 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final java.lang.String x() throws com.google.android.gms.internal.ads.Vv0 {
        int iD = D();
        if (iD > 0) {
            int i6 = this.f35714g;
            int i10 = this.f35716i;
            if (iD <= i6 - i10) {
                java.lang.String str = new java.lang.String(this.f35713f, i10, iD, com.google.android.gms.internal.ads.Tv0.f32041a);
                this.f35716i += iD;
                return str;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final java.lang.String y() throws com.google.android.gms.internal.ads.Vv0 {
        int iD = D();
        if (iD > 0) {
            int i6 = this.f35714g;
            int i10 = this.f35716i;
            if (iD <= i6 - i10) {
                java.lang.String strG = com.google.android.gms.internal.ads.Xw0.g(this.f35713f, i10, iD);
                this.f35716i += iD;
                return strG;
            }
        }
        if (iD == 0) {
            return "";
        }
        if (iD <= 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final void z(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (this.f35718k != i6) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message end-group tag did not match expected tag.");
        }
    }
}
