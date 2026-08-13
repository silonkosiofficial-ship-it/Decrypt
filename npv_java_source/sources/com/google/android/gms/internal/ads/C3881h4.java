package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3881h4 extends com.google.android.gms.internal.ads.AbstractC3661f4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3771g4 f35983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f35984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f35985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3655f1 f35986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3436d1 f35987r;

    C3881h4() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final long a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        if ((c5128sR.n()[0] & 1) == 1) {
            return -1L;
        }
        byte b6 = c5128sR.n()[0];
        com.google.android.gms.internal.ads.C3771g4 c3771g4 = this.f35983n;
        com.google.android.gms.internal.ads.LC.b(c3771g4);
        int i6 = !c3771g4.f35533d[(b6 >> 1) & (255 >>> (8 - c3771g4.f35534e))].f34868a ? c3771g4.f35530a.f35242e : c3771g4.f35530a.f35243f;
        int i10 = this.f35985p ? (this.f35984o + i6) / 4 : 0;
        if (c5128sR.s() < c5128sR.u() + 4) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(c5128sR.n(), c5128sR.u() + 4);
            c5128sR.j(bArrCopyOf, bArrCopyOf.length);
        } else {
            c5128sR.k(c5128sR.u() + 4);
        }
        long j6 = i10;
        byte[] bArrN = c5128sR.n();
        bArrN[c5128sR.u() - 4] = (byte) (j6 & 255);
        bArrN[c5128sR.u() - 3] = (byte) ((j6 >>> 8) & 255);
        bArrN[c5128sR.u() - 2] = (byte) ((j6 >>> 16) & 255);
        bArrN[c5128sR.u() - 1] = (byte) ((j6 >>> 24) & 255);
        this.f35985p = true;
        this.f35984o = i6;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f35983n = null;
            this.f35986q = null;
            this.f35987r = null;
        }
        this.f35984o = 0;
        this.f35985p = false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b9  */
    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final boolean c(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6, com.google.android.gms.internal.ads.C3332c4 c3332c4) throws com.google.android.gms.internal.ads.C4708of {
        com.google.android.gms.internal.ads.C3771g4 c3771g4;
        int i6;
        int iB;
        int i10;
        if (this.f35983n != null) {
            c3332c4.f34441a.getClass();
            return false;
        }
        com.google.android.gms.internal.ads.C3655f1 c3655f1 = this.f35986q;
        int i11 = 4;
        if (c3655f1 != null) {
            com.google.android.gms.internal.ads.C3436d1 c3436d1 = this.f35987r;
            if (c3436d1 == null) {
                this.f35987r = com.google.android.gms.internal.ads.AbstractC3765g1.c(c5128sR, true, true);
            } else {
                byte[] bArr = new byte[c5128sR.u()];
                java.lang.System.arraycopy(c5128sR.n(), 0, bArr, 0, c5128sR.u());
                int i12 = c3655f1.f35238a;
                int i13 = 5;
                com.google.android.gms.internal.ads.AbstractC3765g1.d(5, c5128sR, false);
                int iC = c5128sR.C() + 1;
                com.google.android.gms.internal.ads.C3326c1 c3326c1 = new com.google.android.gms.internal.ads.C3326c1(c5128sR.n());
                c3326c1.c(c5128sR.t() * 8);
                int i14 = 0;
                while (true) {
                    int i15 = 2;
                    int i16 = 16;
                    if (i14 >= iC) {
                        com.google.android.gms.internal.ads.C3655f1 c3655f2 = c3655f1;
                        int i17 = 6;
                        int iB2 = c3326c1.b(6) + 1;
                        for (int i18 = 0; i18 < iB2; i18++) {
                            if (c3326c1.b(16) != 0) {
                                throw com.google.android.gms.internal.ads.C4708of.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i19 = 1;
                        int iB3 = c3326c1.b(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 >= iB3) {
                                int i22 = 1;
                                int iB4 = c3326c1.b(i17) + 1;
                                int i23 = 0;
                                while (i23 < iB4) {
                                    if (c3326c1.b(16) > 2) {
                                        throw com.google.android.gms.internal.ads.C4708of.a("residueType greater than 2 is not decodable", null);
                                    }
                                    c3326c1.c(24);
                                    c3326c1.c(24);
                                    c3326c1.c(24);
                                    int iB5 = c3326c1.b(i17) + i22;
                                    int i24 = 8;
                                    c3326c1.c(8);
                                    int[] iArr = new int[iB5];
                                    for (int i25 = 0; i25 < iB5; i25++) {
                                        iArr[i25] = ((c3326c1.d() ? c3326c1.b(5) : 0) * 8) + c3326c1.b(3);
                                    }
                                    int i26 = 0;
                                    while (i26 < iB5) {
                                        int i27 = 0;
                                        while (i27 < i24) {
                                            if ((iArr[i26] & (1 << i27)) != 0) {
                                                c3326c1.c(i24);
                                            }
                                            i27++;
                                            i24 = 8;
                                        }
                                        i26++;
                                        i24 = 8;
                                    }
                                    i23++;
                                    i17 = 6;
                                    i22 = 1;
                                }
                                int iB6 = c3326c1.b(i17) + 1;
                                for (int i28 = 0; i28 < iB6; i28++) {
                                    int iB7 = c3326c1.b(16);
                                    if (iB7 != 0) {
                                        com.google.android.gms.internal.ads.AbstractC3586eM.c("VorbisUtil", "mapping type other than 0 not supported: " + iB7);
                                    } else {
                                        if (c3326c1.d()) {
                                            i6 = 1;
                                            iB = c3326c1.b(4) + 1;
                                        } else {
                                            i6 = 1;
                                            iB = 1;
                                        }
                                        if (c3326c1.d()) {
                                            int iB8 = c3326c1.b(8) + i6;
                                            for (int i29 = 0; i29 < iB8; i29++) {
                                                int i30 = i12 - 1;
                                                c3326c1.c(com.google.android.gms.internal.ads.AbstractC3765g1.a(i30));
                                                c3326c1.c(com.google.android.gms.internal.ads.AbstractC3765g1.a(i30));
                                            }
                                        }
                                        if (c3326c1.b(2) != 0) {
                                            throw com.google.android.gms.internal.ads.C4708of.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB > 1) {
                                            for (int i31 = 0; i31 < i12; i31++) {
                                                c3326c1.c(4);
                                            }
                                        }
                                        for (int i32 = 0; i32 < iB; i32++) {
                                            c3326c1.c(8);
                                            c3326c1.c(8);
                                            c3326c1.c(8);
                                        }
                                    }
                                }
                                int iB9 = c3326c1.b(6);
                                int i33 = iB9 + 1;
                                com.google.android.gms.internal.ads.C3545e1[] c3545e1Arr = new com.google.android.gms.internal.ads.C3545e1[i33];
                                for (int i34 = 0; i34 < i33; i34++) {
                                    c3545e1Arr[i34] = new com.google.android.gms.internal.ads.C3545e1(c3326c1.d(), c3326c1.b(16), c3326c1.b(16), c3326c1.b(8));
                                }
                                if (!c3326c1.d()) {
                                    throw com.google.android.gms.internal.ads.C4708of.a("framing bit after modes not set as expected", null);
                                }
                                c3771g4 = new com.google.android.gms.internal.ads.C3771g4(c3655f2, c3436d1, bArr, c3545e1Arr, com.google.android.gms.internal.ads.AbstractC3765g1.a(iB9));
                                break;
                            }
                            int iB10 = c3326c1.b(i16);
                            if (iB10 == 0) {
                                i10 = iB3;
                                int i35 = 8;
                                c3326c1.c(8);
                                c3326c1.c(16);
                                c3326c1.c(16);
                                c3326c1.c(6);
                                c3326c1.c(8);
                                int iB11 = c3326c1.b(4) + 1;
                                int i36 = 0;
                                while (i36 < iB11) {
                                    c3326c1.c(i35);
                                    i36++;
                                    i35 = 8;
                                }
                            } else {
                                if (iB10 != i19) {
                                    throw com.google.android.gms.internal.ads.C4708of.a("floor type greater than 1 not decodable: " + iB10, null);
                                }
                                int iB12 = c3326c1.b(i13);
                                int[] iArr2 = new int[iB12];
                                int i37 = -1;
                                for (int i38 = 0; i38 < iB12; i38++) {
                                    int iB13 = c3326c1.b(4);
                                    iArr2[i38] = iB13;
                                    if (iB13 > i37) {
                                        i37 = iB13;
                                    }
                                }
                                int i39 = i37 + 1;
                                int[] iArr3 = new int[i39];
                                int i40 = 0;
                                while (i40 < i39) {
                                    iArr3[i40] = c3326c1.b(i21) + 1;
                                    int iB14 = c3326c1.b(i15);
                                    int i41 = 8;
                                    if (iB14 > 0) {
                                        c3326c1.c(8);
                                    }
                                    int i42 = iB3;
                                    int i43 = 0;
                                    for (int i44 = 1; i43 < (i44 << iB14); i44 = 1) {
                                        c3326c1.c(i41);
                                        i43++;
                                        i41 = 8;
                                    }
                                    i40++;
                                    iB3 = i42;
                                    i15 = 2;
                                    i21 = 3;
                                }
                                i10 = iB3;
                                c3326c1.c(i15);
                                int iB15 = c3326c1.b(4);
                                int i45 = 0;
                                int i46 = 0;
                                for (int i47 = 0; i47 < iB12; i47++) {
                                    i45 += iArr3[iArr2[i47]];
                                    while (i46 < i45) {
                                        c3326c1.c(iB15);
                                        i46++;
                                    }
                                }
                            }
                            i20++;
                            iB3 = i10;
                            i17 = 6;
                            i15 = 2;
                            i16 = 16;
                            i19 = 1;
                            i13 = 5;
                        }
                    } else {
                        if (c3326c1.b(24) != 5653314) {
                            throw com.google.android.gms.internal.ads.C4708of.a("expected code book to start with [0x56, 0x43, 0x42] at " + c3326c1.a(), null);
                        }
                        int iB16 = c3326c1.b(16);
                        int iB17 = c3326c1.b(24);
                        if (c3326c1.d()) {
                            c3326c1.c(5);
                            for (int iB18 = 0; iB18 < iB17; iB18 += c3326c1.b(com.google.android.gms.internal.ads.AbstractC3765g1.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zD = c3326c1.d();
                            for (int i48 = 0; i48 < iB17; i48++) {
                                if (!zD || c3326c1.d()) {
                                    c3326c1.c(5);
                                }
                            }
                        }
                        int iB19 = c3326c1.b(i11);
                        if (iB19 > 2) {
                            throw com.google.android.gms.internal.ads.C4708of.a("lookup type greater than 2 not decodable: " + iB19, null);
                        }
                        if (iB19 != 1) {
                            if (iB19 == 2) {
                            }
                            i14++;
                            c3655f1 = c3655f1;
                            i11 = 4;
                        } else {
                            i15 = iB19;
                        }
                        c3326c1.c(32);
                        c3326c1.c(32);
                        int iB20 = c3326c1.b(i11) + 1;
                        c3326c1.c(1);
                        c3326c1.c((int) ((i15 == 1 ? iB16 != 0 ? (long) java.lang.Math.floor(java.lang.Math.pow(iB17, 1.0d / ((double) iB16))) : 0L : ((long) iB16) * ((long) iB17)) * ((long) iB20)));
                        i14++;
                        c3655f1 = c3655f1;
                        i11 = 4;
                    }
                }
            }
            this.f35983n = c3771g4;
            if (c3771g4 == null) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.google.android.gms.internal.ads.C3655f1 c3655f3 = c3771g4.f35530a;
            arrayList.add(c3655f3.f35244g);
            arrayList.add(c3771g4.f35532c);
            com.google.android.gms.internal.ads.C2227Cb c2227CbB = com.google.android.gms.internal.ads.AbstractC3765g1.b(com.google.android.gms.internal.ads.AbstractC3398ci0.N(c3771g4.f35531b.f34628a));
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.B("audio/vorbis");
            c4682oK0.q0(c3655f3.f35241d);
            c4682oK0.v(c3655f3.f35240c);
            c4682oK0.r0(c3655f3.f35238a);
            c4682oK0.C(c3655f3.f35239b);
            c4682oK0.n(arrayList);
            c4682oK0.t(c2227CbB);
            c3332c4.f34441a = c4682oK0.H();
            return true;
        }
        com.google.android.gms.internal.ads.AbstractC3765g1.d(1, c5128sR, false);
        int iZ = c5128sR.z();
        int iC2 = c5128sR.C();
        int iZ2 = c5128sR.z();
        int iY = c5128sR.y();
        int i49 = iY <= 0 ? -1 : iY;
        int iY2 = c5128sR.y();
        int i50 = iY2 <= 0 ? -1 : iY2;
        int iY3 = c5128sR.y();
        int i51 = iY3 <= 0 ? -1 : iY3;
        int iC3 = c5128sR.C();
        this.f35986q = new com.google.android.gms.internal.ads.C3655f1(iZ, iC2, iZ2, i49, i50, i51, (int) java.lang.Math.pow(2.0d, iC3 & 15), (int) java.lang.Math.pow(2.0d, (iC3 & 240) >> 4), 1 == (c5128sR.C() & 1), java.util.Arrays.copyOf(c5128sR.n(), c5128sR.u()));
        c3771g4 = null;
        this.f35983n = c3771g4;
        if (c3771g4 == null) {
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.google.android.gms.internal.ads.C3655f1 c3655f4 = c3771g4.f35530a;
        arrayList2.add(c3655f4.f35244g);
        arrayList2.add(c3771g4.f35532c);
        com.google.android.gms.internal.ads.C2227Cb c2227CbB2 = com.google.android.gms.internal.ads.AbstractC3765g1.b(com.google.android.gms.internal.ads.AbstractC3398ci0.N(c3771g4.f35531b.f34628a));
        com.google.android.gms.internal.ads.C4682oK0 c4682oK1 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK1.B("audio/vorbis");
        c4682oK1.q0(c3655f4.f35241d);
        c4682oK1.v(c3655f4.f35240c);
        c4682oK1.r0(c3655f4.f35238a);
        c4682oK1.C(c3655f4.f35239b);
        c4682oK1.n(arrayList2);
        c4682oK1.t(c2227CbB2);
        c3332c4.f34441a = c4682oK1.H();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3661f4
    protected final void h(long j6) {
        super.h(j6);
        this.f35985p = j6 != 0;
        com.google.android.gms.internal.ads.C3655f1 c3655f1 = this.f35986q;
        this.f35984o = c3655f1 != null ? c3655f1.f35242e : 0;
    }
}
