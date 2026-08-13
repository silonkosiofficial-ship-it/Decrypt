package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4081iv0 extends com.google.android.gms.internal.ads.AbstractC4301kv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.io.InputStream f36379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f36380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36386m;

    /* synthetic */ C4081iv0(java.io.InputStream inputStream, int i6, com.google.android.gms.internal.ads.AbstractC4191jv0 abstractC4191jv0) {
        super(null);
        this.f36386m = Integer.MAX_VALUE;
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        this.f36379f = inputStream;
        this.f36380g = new byte[4096];
        this.f36381h = 0;
        this.f36383j = 0;
        this.f36385l = 0;
    }

    private final java.util.List C(int i6) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i6 > 0) {
            int iMin = java.lang.Math.min(i6, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f36379f.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f36385l += i11;
                i10 += i11;
            }
            i6 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void D() {
        int i6 = this.f36381h + this.f36382i;
        this.f36381h = i6;
        int i10 = this.f36385l + i6;
        int i11 = this.f36386m;
        if (i10 <= i11) {
            this.f36382i = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f36382i = i12;
        this.f36381h = i6 - i12;
    }

    private final void E(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (F(i6)) {
            return;
        }
        if (i6 <= (Integer.MAX_VALUE - this.f36385l) - this.f36383j) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new com.google.android.gms.internal.ads.Vv0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean F(int i6) throws java.io.IOException {
        int i10 = this.f36383j;
        int i11 = i10 + i6;
        int i12 = this.f36381h;
        if (i11 <= i12) {
            throw new java.lang.IllegalStateException("refillBuffer() called when " + i6 + " bytes were already available in buffer");
        }
        int i13 = this.f36385l;
        if (i6 > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i6 > this.f36386m) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.f36380g;
                java.lang.System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.f36385l + i10;
            this.f36385l = i13;
            i12 = this.f36381h - i10;
            this.f36381h = i12;
            this.f36383j = 0;
        }
        try {
            int i14 = this.f36379f.read(this.f36380g, i12, java.lang.Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
            if (i14 == 0 || i14 < -1 || i14 > 4096) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.f36379f.getClass()) + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
            }
            if (i14 <= 0) {
                return false;
            }
            this.f36381h += i14;
            D();
            if (this.f36381h >= i6) {
                return true;
            }
            return F(i6);
        } catch (com.google.android.gms.internal.ads.Vv0 e6) {
            e6.a();
            throw e6;
        }
    }

    private final byte[] G(int i6, boolean z6) throws java.io.IOException {
        byte[] bArrH = H(i6);
        if (bArrH != null) {
            return bArrH;
        }
        int i10 = this.f36383j;
        int i11 = this.f36381h;
        int i12 = i11 - i10;
        this.f36385l += i11;
        this.f36383j = 0;
        this.f36381h = 0;
        java.util.List<byte[]> listC = C(i6 - i12);
        byte[] bArr = new byte[i6];
        java.lang.System.arraycopy(this.f36380g, i10, bArr, 0, i12);
        for (byte[] bArr2 : listC) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] H(int i6) throws java.io.IOException {
        if (i6 == 0) {
            return com.google.android.gms.internal.ads.Tv0.f32042b;
        }
        int i10 = this.f36385l;
        int i11 = this.f36383j;
        int i12 = i10 + i11 + i6;
        if ((-2147483647) + i12 > 0) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f36386m;
        if (i12 > i13) {
            B((i13 - i10) - i11);
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.f36381h - i11;
        int i15 = i6 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.f36379f.available()) {
                    return null;
                }
            } catch (com.google.android.gms.internal.ads.Vv0 e6) {
                e6.a();
                throw e6;
            }
        }
        byte[] bArr = new byte[i6];
        java.lang.System.arraycopy(this.f36380g, this.f36383j, bArr, 0, i14);
        this.f36385l += this.f36381h;
        this.f36383j = 0;
        this.f36381h = 0;
        while (i14 < i6) {
            try {
                int i16 = this.f36379f.read(bArr, i14, i6 - i14);
                if (i16 == -1) {
                    throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f36385l += i16;
                i14 += i16;
            } catch (com.google.android.gms.internal.ads.Vv0 e10) {
                e10.a();
                throw e10;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final void A(int i6) {
        this.f36386m = i6;
        D();
    }

    public final void B(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        int i10 = this.f36381h;
        int i11 = this.f36383j;
        int i12 = i10 - i11;
        if (i6 <= i12 && i6 >= 0) {
            this.f36383j = i11 + i6;
            return;
        }
        if (i6 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.f36385l;
        int i14 = i13 + i11;
        int i15 = this.f36386m;
        if (i14 + i6 > i15) {
            B((i15 - i13) - i11);
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f36385l = i14;
        this.f36381h = 0;
        this.f36383j = 0;
        while (i12 < i6) {
            try {
                long j6 = i6 - i12;
                try {
                    long jSkip = this.f36379f.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
                        throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.f36379f.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (com.google.android.gms.internal.ads.Vv0 e6) {
                    e6.a();
                    throw e6;
                }
            } catch (java.lang.Throwable th) {
                this.f36385l += i12;
                D();
                throw th;
            }
        }
        this.f36385l += i12;
        D();
        if (i12 >= i6) {
            return;
        }
        int i16 = this.f36381h;
        int i17 = i16 - this.f36383j;
        this.f36383j = i16;
        while (true) {
            E(1);
            int i18 = i6 - i17;
            int i19 = this.f36381h;
            if (i18 <= i19) {
                this.f36383j = i18;
                return;
            } else {
                i17 += i19;
                this.f36383j = i19;
            }
        }
    }

    public final int I() throws com.google.android.gms.internal.ads.Vv0 {
        int i6 = this.f36383j;
        if (this.f36381h - i6 < 4) {
            E(4);
            i6 = this.f36383j;
        }
        byte[] bArr = this.f36380g;
        this.f36383j = i6 + 4;
        int i10 = bArr[i6] & 255;
        int i11 = bArr[i6 + 1] & 255;
        int i12 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int J() {
        int i6;
        int i10 = this.f36383j;
        int i11 = this.f36381h;
        if (i11 != i10) {
            byte[] bArr = this.f36380g;
            int i12 = i10 + 1;
            byte b6 = bArr[i10];
            if (b6 >= 0) {
                this.f36383j = i12;
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
                this.f36383j = i13;
                return i6;
            }
        }
        return (int) M();
    }

    public final long K() throws com.google.android.gms.internal.ads.Vv0 {
        int i6 = this.f36383j;
        if (this.f36381h - i6 < 8) {
            E(8);
            i6 = this.f36383j;
        }
        byte[] bArr = this.f36380g;
        this.f36383j = i6 + 8;
        long j6 = bArr[i6];
        long j10 = (((long) bArr[i6 + 1]) & 255) << 8;
        long j11 = bArr[i6 + 2];
        long j12 = bArr[i6 + 3];
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (j6 & 255) | j10 | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    public final long L() {
        long j6;
        long j10;
        int i6 = this.f36383j;
        int i10 = this.f36381h;
        if (i10 != i6) {
            byte[] bArr = this.f36380g;
            int i11 = i6 + 1;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f36383j = i11;
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
                this.f36383j = i12;
                return j6;
            }
        }
        return M();
    }

    final long M() throws com.google.android.gms.internal.ads.Vv0 {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            if (this.f36383j == this.f36381h) {
                E(1);
            }
            byte[] bArr = this.f36380g;
            int i10 = this.f36383j;
            this.f36383j = i10 + 1;
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
        return this.f36383j == this.f36381h && !F(1);
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
        return this.f36385l + this.f36383j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final int j(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (i6 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = i6 + this.f36385l + this.f36383j;
        if (i10 < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("Failed to parse the message.");
        }
        int i11 = this.f36386m;
        if (i10 > i11) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f36386m = i10;
        D();
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
            this.f36384k = 0;
            return 0;
        }
        int iJ = J();
        this.f36384k = iJ;
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
    public final com.google.android.gms.internal.ads.AbstractC3753fv0 w() throws java.io.IOException {
        int iJ = J();
        int i6 = this.f36381h;
        int i10 = this.f36383j;
        if (iJ <= i6 - i10 && iJ > 0) {
            com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0T = com.google.android.gms.internal.ads.AbstractC3753fv0.T(this.f36380g, i10, iJ);
            this.f36383j += iJ;
            return abstractC3753fv0T;
        }
        if (iJ == 0) {
            return com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        }
        if (iJ < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrH = H(iJ);
        if (bArrH != null) {
            return com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrH, 0, bArrH.length);
        }
        int i11 = this.f36383j;
        int i12 = this.f36381h;
        int i13 = i12 - i11;
        this.f36385l += i12;
        this.f36383j = 0;
        this.f36381h = 0;
        java.util.List<byte[]> listC = C(iJ - i13);
        byte[] bArr = new byte[iJ];
        java.lang.System.arraycopy(this.f36380g, i11, bArr, 0, i13);
        for (byte[] bArr2 : listC) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return new com.google.android.gms.internal.ads.C3424cv0(bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final java.lang.String x() throws com.google.android.gms.internal.ads.Vv0 {
        int iJ = J();
        if (iJ > 0) {
            int i6 = this.f36381h;
            int i10 = this.f36383j;
            if (iJ <= i6 - i10) {
                java.lang.String str = new java.lang.String(this.f36380g, i10, iJ, com.google.android.gms.internal.ads.Tv0.f32041a);
                this.f36383j += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > this.f36381h) {
            return new java.lang.String(G(iJ, false), com.google.android.gms.internal.ads.Tv0.f32041a);
        }
        E(iJ);
        java.lang.String str2 = new java.lang.String(this.f36380g, this.f36383j, iJ, com.google.android.gms.internal.ads.Tv0.f32041a);
        this.f36383j += iJ;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final java.lang.String y() throws java.io.IOException {
        byte[] bArrG;
        int iJ = J();
        int i6 = this.f36383j;
        int i10 = this.f36381h;
        if (iJ <= i10 - i6 && iJ > 0) {
            bArrG = this.f36380g;
            this.f36383j = i6 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new com.google.android.gms.internal.ads.Vv0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i6 = 0;
            if (iJ <= i10) {
                E(iJ);
                bArrG = this.f36380g;
                this.f36383j = iJ;
            } else {
                bArrG = G(iJ, false);
            }
        }
        return com.google.android.gms.internal.ads.Xw0.g(bArrG, i6, iJ);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4301kv0
    public final void z(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (this.f36384k != i6) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message end-group tag did not match expected tag.");
        }
    }
}
