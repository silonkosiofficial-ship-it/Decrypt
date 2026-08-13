package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f28563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f28571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f28573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.I90 f28574l;

    private J0(java.util.List list, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f6, int i18, java.lang.String str, com.google.android.gms.internal.ads.I90 i90) {
        this.f28563a = list;
        this.f28564b = i6;
        this.f28565c = i12;
        this.f28566d = i13;
        this.f28567e = i14;
        this.f28568f = i15;
        this.f28569g = i16;
        this.f28570h = i17;
        this.f28571i = f6;
        this.f28572j = i18;
        this.f28573k = str;
        this.f28574l = i90;
    }

    public static com.google.android.gms.internal.ads.J0 a(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        return c(c5128sR, false, null);
    }

    public static com.google.android.gms.internal.ads.J0 b(com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.I90 i90) {
        return c(c5128sR, true, i90);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0290  */
    /* JADX WARN: Code duplicated, block: B:116:0x0293  */
    private static com.google.android.gms.internal.ads.J0 c(com.google.android.gms.internal.ads.C5128sR c5128sR, boolean z6, com.google.android.gms.internal.ads.I90 i90) throws com.google.android.gms.internal.ads.C4708of {
        boolean z10;
        java.lang.String str;
        int i6;
        int i10;
        com.google.android.gms.internal.ads.E70 e70;
        int i11;
        int i12 = 4;
        if (z6) {
            try {
                c5128sR.m(4);
            } catch (java.lang.ArrayIndexOutOfBoundsException e6) {
                e = e6;
                z10 = true;
                if (z10 != z6) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw com.google.android.gms.internal.ads.C4708of.a("Error parsing".concat(str), e);
            }
        } else {
            try {
                c5128sR.m(21);
            } catch (java.lang.ArrayIndexOutOfBoundsException e10) {
                e = e10;
                z10 = true;
                if (z10 != z6) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw com.google.android.gms.internal.ads.C4708of.a("Error parsing".concat(str), e);
            }
        }
        int iC = c5128sR.C() & 3;
        int iC2 = c5128sR.C();
        int iT = c5128sR.t();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iC2; i15++) {
            c5128sR.m(1);
            int iG = c5128sR.G();
            for (int i16 = 0; i16 < iG; i16++) {
                int iG2 = c5128sR.G();
                i14 += iG2 + 4;
                c5128sR.m(iG2);
            }
        }
        c5128sR.l(iT);
        byte[] bArr = new byte[i14];
        com.google.android.gms.internal.ads.I90 i91 = i90;
        int i17 = 0;
        float f6 = 1.0f;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        java.lang.String strD = null;
        int i27 = 0;
        while (i27 < iC2) {
            int iC3 = c5128sR.C() & 63;
            int iG3 = c5128sR.G();
            int i28 = i13;
            com.google.android.gms.internal.ads.I90 i90D = i91;
            while (i28 < iG3) {
                int iG4 = c5128sR.G();
                int i29 = iC2;
                java.lang.System.arraycopy(com.google.android.gms.internal.ads.AbstractC4371lb0.f37187a, i13, bArr, i17, i12);
                int i30 = i17 + 4;
                java.lang.System.arraycopy(c5128sR.n(), c5128sR.t(), bArr, i30, iG4);
                int i31 = 32;
                if (iC3 == 32) {
                    if (i28 == 0) {
                        i90D = com.google.android.gms.internal.ads.AbstractC4371lb0.d(bArr, i30, i30 + iG4);
                        i6 = iG3;
                        iC3 = iC3;
                        i11 = 0;
                        i28 = 0;
                    }
                    i17 = i30 + iG4;
                    c5128sR.m(iG4);
                    i28++;
                    i13 = i11;
                    iC2 = i29;
                    iG3 = i6;
                    iC3 = iC3;
                    i12 = 4;
                } else {
                    i31 = iC3;
                }
                i6 = iG3;
                int i32 = 8;
                if (i31 != 33) {
                    iC3 = iC3;
                    if (i31 == 39 && i28 == 0) {
                        int i33 = i17 + 6;
                        int i34 = (i30 + iG4) - 1;
                        while (true) {
                            byte b6 = bArr[i34];
                            if (b6 != 0) {
                                if (b6 != 0 && i34 > i33) {
                                    com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0 = new com.google.android.gms.internal.ads.C2597Mb0(bArr, i33, i34 + 1);
                                    while (true) {
                                        if (c2597Mb0.g(16)) {
                                            int iA = c2597Mb0.a(i32);
                                            int i35 = 0;
                                            while (iA == 255) {
                                                i35 += 255;
                                                iA = c2597Mb0.a(i32);
                                            }
                                            int i36 = i35 + iA;
                                            int iA2 = c2597Mb0.a(i32);
                                            int i37 = 0;
                                            while (iA2 == 255) {
                                                i37 += 255;
                                                iA2 = c2597Mb0.a(8);
                                            }
                                            int i38 = i37 + iA2;
                                            if (i38 != 0 && c2597Mb0.g(i38)) {
                                                if (i36 == 176) {
                                                    int iC4 = c2597Mb0.c();
                                                    boolean zH = c2597Mb0.h();
                                                    int iC5 = zH ? c2597Mb0.c() : 0;
                                                    int iC6 = c2597Mb0.c();
                                                    int i39 = 0;
                                                    int iC7 = -1;
                                                    int iC8 = -1;
                                                    int i40 = -1;
                                                    int iA3 = -1;
                                                    int i41 = -1;
                                                    int iA4 = -1;
                                                    while (true) {
                                                        if (i39 <= iC6) {
                                                            iC7 = c2597Mb0.c();
                                                            iC8 = c2597Mb0.c();
                                                            i10 = i28;
                                                            int iA5 = c2597Mb0.a(6);
                                                            if (iA5 != 63) {
                                                                iA3 = c2597Mb0.a(iA5 == 0 ? java.lang.Math.max(0, iC4 - 30) : java.lang.Math.max(0, (iA5 + iC4) - 31));
                                                                if (zH) {
                                                                    int iA6 = c2597Mb0.a(6);
                                                                    if (iA6 != 63) {
                                                                        iA4 = c2597Mb0.a(iA6 == 0 ? java.lang.Math.max(0, iC5 - 30) : java.lang.Math.max(0, (iA6 + iC5) - 31));
                                                                        i41 = iA6;
                                                                    }
                                                                } else {
                                                                    zH = zH;
                                                                }
                                                                if (c2597Mb0.h()) {
                                                                    c2597Mb0.f(10);
                                                                }
                                                                i39++;
                                                                i40 = iA5;
                                                                i28 = i10;
                                                                zH = zH;
                                                                i18 = i18;
                                                            }
                                                            e70 = null;
                                                        } else {
                                                            i10 = i28;
                                                            i18 = i18;
                                                            e70 = new com.google.android.gms.internal.ads.E70(iC4, iC5, iC6 + 1, iC7, iC8, i40, iA3, i41, iA4);
                                                        }
                                                    }
                                                } else {
                                                    i32 = 8;
                                                }
                                            }
                                            i18 = i18;
                                            e70 = null;
                                        }
                                    }
                                }
                                if (e70 == null && i90D != null) {
                                    i11 = 0;
                                    if (e70.f26913a == ((com.google.android.gms.internal.ads.C5639x40) i90D.f28412a.get(0)).f39779b) {
                                        i28 = i10;
                                        i18 = i18;
                                        i25 = 4;
                                    } else {
                                        i25 = 5;
                                    }
                                }
                                i28 = i10;
                                i18 = i18;
                            } else if (i34 > i33) {
                                i34--;
                            }
                            i10 = i28;
                            i18 = i18;
                            e70 = null;
                            if (e70 == null) {
                            }
                        }
                    } else {
                        i10 = i28;
                        i18 = i18;
                    }
                    i11 = 0;
                    i28 = i10;
                    i18 = i18;
                } else if (i28 == 0) {
                    com.google.android.gms.internal.ads.C3670f80 c3670f80C = com.google.android.gms.internal.ads.AbstractC4371lb0.c(bArr, i30, i30 + iG4, i90D);
                    int i42 = c3670f80C.f35283d;
                    int i43 = c3670f80C.f35284e;
                    int i44 = c3670f80C.f35281b + 8;
                    int i45 = c3670f80C.f35282c + 8;
                    int i46 = c3670f80C.f35287h;
                    int i47 = c3670f80C.f35288i;
                    int i48 = c3670f80C.f35289j;
                    float f10 = c3670f80C.f35285f;
                    int i49 = c3670f80C.f35286g;
                    com.google.android.gms.internal.ads.C5861z50 c5861z50 = c3670f80C.f35280a;
                    if (c5861z50 != null) {
                        strD = com.google.android.gms.internal.ads.ND.d(c5861z50.f40210a, c5861z50.f40211b, c5861z50.f40212c, c5861z50.f40213d, c5861z50.f40214e, c5861z50.f40215f);
                    }
                    i18 = i42;
                    i19 = i43;
                    i11 = 0;
                    i26 = i49;
                    i24 = i48;
                    i22 = i46;
                    f6 = f10;
                    i23 = i47;
                    i21 = i45;
                    i20 = i44;
                } else {
                    iC3 = iC3;
                    i10 = i28;
                    i18 = i18;
                    i11 = 0;
                    i28 = i10;
                    i18 = i18;
                }
                i17 = i30 + iG4;
                c5128sR.m(iG4);
                i28++;
                i13 = i11;
                iC2 = i29;
                iG3 = i6;
                iC3 = iC3;
                i12 = 4;
            }
            i27++;
            i91 = i90D;
            i12 = 4;
        }
        return new com.google.android.gms.internal.ads.J0(i14 == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), iC + 1, i18, i19, i20, i21, i22, i23, i24, i25, f6, i26, strD, i91);
    }
}
