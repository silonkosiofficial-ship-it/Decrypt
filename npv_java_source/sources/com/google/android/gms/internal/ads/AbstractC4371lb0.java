package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4371lb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f37187a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f37188b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f37189c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f37190d = new int[10];

    public static int a(byte[] bArr, int i6, int i10, boolean[] zArr) {
        int i11 = i10 - i6;
        com.google.android.gms.internal.ads.LC.f(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            h(zArr);
            return i6 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i6] == 1) {
            h(zArr);
            return i6 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i6] == 0 && bArr[i6 + 1] == 1) {
            h(zArr);
            return i6 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i6 + 2;
        while (i13 < i12) {
            byte b6 = bArr[i13];
            if ((b6 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b6 == 1) {
                    h(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static int b(byte[] bArr, int i6) {
        int i10;
        synchronized (f37189c) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i6) {
                while (true) {
                    try {
                        if (i11 >= i6 - 2) {
                            i11 = i6;
                            break;
                        }
                        int i13 = i11 + 1;
                        if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11 = i13;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i6) {
                    int[] iArr = f37190d;
                    int length = iArr.length;
                    if (length <= i12) {
                        f37190d = java.util.Arrays.copyOf(iArr, length + length);
                    }
                    f37190d[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i6 - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = f37190d[i16] - i14;
                java.lang.System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            java.lang.System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    public static com.google.android.gms.internal.ads.C3670f80 c(byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.I90 i90) {
        boolean z6;
        int i11;
        int iC;
        int iC2;
        int i12;
        int i13;
        int iC3;
        int iMax;
        int i14;
        int iB;
        int i15;
        int i16;
        int i17;
        com.google.android.gms.internal.ads.C3892h90 c3892h90;
        int i18;
        int iA;
        int i19;
        int i20;
        com.google.android.gms.internal.ads.C3449d70 c3449d70;
        com.google.android.gms.internal.ads.Y40 y40L = l(new com.google.android.gms.internal.ads.C2597Mb0(bArr, i6, i10));
        com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0 = new com.google.android.gms.internal.ads.C2597Mb0(bArr, i6 + 2, i10);
        c2597Mb0.f(4);
        int iA2 = c2597Mb0.a(3);
        if (y40L.f33278b == 0 || iA2 != 7) {
            z6 = false;
        } else {
            iA2 = 7;
            z6 = true;
        }
        int i21 = (i90 == null || i90.f28412a.isEmpty()) ? 0 : ((com.google.android.gms.internal.ads.C5639x40) i90.f28412a.get(java.lang.Math.min(y40L.f33278b, i90.f28412a.size() - 1))).f39778a;
        com.google.android.gms.internal.ads.C5861z50 c5861z50M = null;
        if (!z6) {
            c2597Mb0.e();
            c5861z50M = m(c2597Mb0, true, iA2, null);
        } else if (i90 != null) {
            com.google.android.gms.internal.ads.C3228b60 c3228b60 = i90.f28413b;
            int i22 = c3228b60.f34229b[i21];
            if (c3228b60.f34228a.size() > i22) {
                c5861z50M = (com.google.android.gms.internal.ads.C5861z50) i90.f28413b.f34228a.get(i22);
            }
        }
        int iC4 = c2597Mb0.c();
        if (z6) {
            int iA3 = c2597Mb0.h() ? c2597Mb0.a(8) : -1;
            if (i90 == null || (c3449d70 = i90.f28414c) == null) {
                i13 = 0;
                i12 = 0;
                iC2 = 0;
                iC3 = 0;
                iC = 0;
            } else {
                if (iA3 == -1) {
                    iA3 = c3449d70.f34651b[i21];
                }
                if (iA3 == -1 || c3449d70.f34650a.size() <= iA3) {
                    i13 = 0;
                    i12 = 0;
                    iC2 = 0;
                    iC3 = 0;
                    iC = 0;
                } else {
                    com.google.android.gms.internal.ads.C60 c60 = (com.google.android.gms.internal.ads.C60) i90.f28414c.f34650a.get(iA3);
                    int i23 = c60.f26147a;
                    int i24 = c60.f26150d;
                    iC = c60.f26151e;
                    int i25 = c60.f26148b;
                    i13 = i24;
                    i12 = i23;
                    iC3 = c60.f26149c;
                    iC2 = i25;
                }
            }
        } else {
            int iC5 = c2597Mb0.c();
            if (iC5 == 3) {
                c2597Mb0.e();
                i11 = 3;
            } else {
                i11 = iC5;
            }
            int iC6 = c2597Mb0.c();
            iC = c2597Mb0.c();
            if (c2597Mb0.h()) {
                int iC7 = c2597Mb0.c();
                int iC8 = c2597Mb0.c();
                int iC9 = c2597Mb0.c();
                int iC10 = c2597Mb0.c();
                iC6 = k(iC6, i11, iC7, iC8);
                iC = j(iC, i11, iC9, iC10);
            }
            iC2 = c2597Mb0.c();
            i12 = iC5;
            i13 = iC6;
            iC3 = c2597Mb0.c();
        }
        int iC11 = c2597Mb0.c();
        if (z6) {
            iMax = -1;
        } else {
            int i26 = true != c2597Mb0.h() ? iA2 : 0;
            iMax = -1;
            while (i26 <= iA2) {
                c2597Mb0.c();
                iMax = java.lang.Math.max(c2597Mb0.c(), iMax);
                c2597Mb0.c();
                i26++;
                iA2 = iA2;
            }
        }
        c2597Mb0.c();
        c2597Mb0.c();
        c2597Mb0.c();
        c2597Mb0.c();
        c2597Mb0.c();
        c2597Mb0.c();
        if (c2597Mb0.h()) {
            int i27 = 6;
            if (z6 && c2597Mb0.h()) {
                c2597Mb0.f(6);
            } else if (c2597Mb0.h()) {
                int i28 = 4;
                int i29 = 0;
                while (i29 < i28) {
                    int i30 = 0;
                    while (i30 < i27) {
                        if (c2597Mb0.h()) {
                            int iMin = java.lang.Math.min(64, 1 << ((i29 + i29) + 4));
                            if (i29 > 1) {
                                c2597Mb0.b();
                            }
                            for (int i31 = 0; i31 < iMin; i31++) {
                                c2597Mb0.b();
                            }
                            i20 = 3;
                        } else {
                            c2597Mb0.c();
                            i20 = 3;
                        }
                        i30 += i29 == i20 ? 3 : 1;
                        i13 = i13;
                        iMax = iMax;
                        i27 = 6;
                    }
                    i29++;
                    i28 = 4;
                    i27 = 6;
                }
            }
        }
        int i32 = i13;
        int i33 = iMax;
        c2597Mb0.f(2);
        if (c2597Mb0.h()) {
            c2597Mb0.f(8);
            c2597Mb0.c();
            c2597Mb0.c();
            c2597Mb0.e();
        }
        int iC12 = c2597Mb0.c();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i34 = 0;
        int i35 = -1;
        int i36 = -1;
        while (i34 < iC12) {
            if (i34 == 0 || !c2597Mb0.h()) {
                int iC13 = c2597Mb0.c();
                int iC14 = c2597Mb0.c();
                iArr = new int[iC13];
                int i37 = 0;
                while (i37 < iC13) {
                    iArr[i37] = (i37 > 0 ? iArr[i37 - 1] : 0) - (c2597Mb0.c() + 1);
                    c2597Mb0.e();
                    i37++;
                }
                int[] iArr2 = new int[iC14];
                int i38 = 0;
                while (i38 < iC14) {
                    iArr2[i38] = (i38 > 0 ? iArr2[i38 - 1] : 0) + c2597Mb0.c() + 1;
                    c2597Mb0.e();
                    i38++;
                }
                i36 = iC14;
                iArrCopyOf = iArr2;
                i35 = iC13;
            } else {
                int i39 = i35 + i36;
                boolean zH = c2597Mb0.h();
                boolean z10 = true;
                int iC15 = c2597Mb0.c() + 1;
                int i40 = 1 - ((zH ? 1 : 0) + (zH ? 1 : 0));
                int i41 = i39 + 1;
                boolean[] zArr = new boolean[i41];
                int i42 = 0;
                while (i42 <= i39) {
                    if (c2597Mb0.h()) {
                        zArr[i42] = z10;
                    } else {
                        zArr[i42] = c2597Mb0.h();
                    }
                    i42++;
                    z10 = true;
                }
                int i43 = i36 - 1;
                int[] iArr3 = new int[i41];
                int[] iArr4 = new int[i41];
                int i44 = 0;
                while (true) {
                    i19 = i40 * iC15;
                    if (i43 < 0) {
                        break;
                    }
                    int i45 = iArrCopyOf[i43] + i19;
                    if (i45 < 0 && zArr[i35 + i43]) {
                        iArr3[i44] = i45;
                        i44++;
                    }
                    i43--;
                }
                if (i19 < 0 && zArr[i39]) {
                    iArr3[i44] = i19;
                    i44++;
                }
                int i46 = i44;
                for (int i47 = 0; i47 < i35; i47++) {
                    int i48 = iArr[i47] + i19;
                    if (i48 < 0 && zArr[i47]) {
                        iArr3[i46] = i48;
                        i46++;
                    }
                }
                int[] iArrCopyOf2 = java.util.Arrays.copyOf(iArr3, i46);
                int i49 = 0;
                for (int i50 = i35 - 1; i50 >= 0; i50--) {
                    int i51 = iArr[i50] + i19;
                    if (i51 > 0 && zArr[i50]) {
                        iArr4[i49] = i51;
                        i49++;
                    }
                }
                if (i19 > 0 && zArr[i39]) {
                    iArr4[i49] = i19;
                    i49++;
                }
                int i52 = i49;
                for (int i53 = 0; i53 < i36; i53++) {
                    int i54 = iArrCopyOf[i53] + i19;
                    if (i54 > 0 && zArr[i35 + i53]) {
                        iArr4[i52] = i54;
                        i52++;
                    }
                }
                i36 = i52;
                iArrCopyOf = java.util.Arrays.copyOf(iArr4, i52);
                iArr = iArrCopyOf2;
                i35 = i46;
            }
            i34++;
            iC12 = iC12;
            c5861z50M = c5861z50M;
            y40L = y40L;
            iC3 = iC3;
            iC2 = iC2;
            i12 = i12;
        }
        com.google.android.gms.internal.ads.Y40 y40 = y40L;
        int i55 = i12;
        int i56 = iC2;
        int i57 = iC3;
        com.google.android.gms.internal.ads.C5861z50 c5861z50 = c5861z50M;
        if (c2597Mb0.h()) {
            int iC16 = c2597Mb0.c();
            for (int i58 = 0; i58 < iC16; i58++) {
                c2597Mb0.f(iC11 + 5);
            }
        }
        c2597Mb0.f(2);
        float f6 = 1.0f;
        if (c2597Mb0.h()) {
            if (c2597Mb0.h()) {
                int iA4 = c2597Mb0.a(8);
                if (iA4 == 255) {
                    int iA5 = c2597Mb0.a(16);
                    int iA6 = c2597Mb0.a(16);
                    if (iA5 != 0 && iA6 != 0) {
                        f6 = iA5 / iA6;
                    }
                } else if (iA4 < 17) {
                    f6 = f37188b[iA4];
                } else {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iA4);
                }
            }
            if (c2597Mb0.h()) {
                c2597Mb0.e();
            }
            if (c2597Mb0.h()) {
                c2597Mb0.f(3);
                i17 = true != c2597Mb0.h() ? 2 : 1;
                if (c2597Mb0.h()) {
                    int iA7 = c2597Mb0.a(8);
                    int iA8 = c2597Mb0.a(8);
                    c2597Mb0.f(8);
                    iA = com.google.android.gms.internal.ads.PA0.a(iA7);
                    iB = com.google.android.gms.internal.ads.PA0.b(iA8);
                } else {
                    iB = -1;
                    iA = -1;
                }
            } else if (i90 == null || (c3892h90 = i90.f28415d) == null || c3892h90.f36011a.size() <= (i18 = c3892h90.f36012b[i21])) {
                iB = -1;
                i17 = -1;
                iA = -1;
            } else {
                com.google.android.gms.internal.ads.G80 g80 = (com.google.android.gms.internal.ads.G80) i90.f28415d.f36011a.get(i18);
                iA = g80.f27683a;
                int i59 = g80.f27684b;
                iB = g80.f27685c;
                i17 = i59;
            }
            if (c2597Mb0.h()) {
                c2597Mb0.c();
                c2597Mb0.c();
            }
            c2597Mb0.e();
            if (c2597Mb0.h()) {
                iC += iC;
            }
            i16 = i17;
            i15 = iA;
            i14 = iC;
        } else {
            i14 = iC;
            iB = -1;
            i15 = -1;
            i16 = -1;
        }
        return new com.google.android.gms.internal.ads.C3670f80(y40, c5861z50, i55, i56, i57, iC4, i32, i14, f6, i33, i15, i16, iB);
    }

    /* JADX WARN: Code duplicated, block: B:447:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.internal.ads.I90 d(byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        boolean[][] zArr;
        int[] iArr2;
        com.google.android.gms.internal.ads.C3892h90 c3892h90;
        boolean z6;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int i15;
        int i16;
        int i17;
        int[] iArr3;
        int i18;
        boolean[][] zArr2;
        int i19;
        boolean[][] zArr3;
        int[] iArr4;
        int i20;
        int i21;
        boolean z10;
        boolean zH;
        int i22;
        int i23;
        int i24;
        int iC;
        int i25;
        int i26;
        int i27;
        boolean z11;
        boolean z12;
        com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0 = new com.google.android.gms.internal.ads.C2597Mb0(bArr, i6, i10);
        com.google.android.gms.internal.ads.Y40 y40L = l(c2597Mb0);
        c2597Mb0.f(4);
        boolean zH2 = c2597Mb0.h();
        boolean zH3 = c2597Mb0.h();
        int iA5 = c2597Mb0.a(6);
        int i28 = iA5 + 1;
        int iA6 = c2597Mb0.a(3);
        c2597Mb0.f(17);
        int i29 = 1;
        com.google.android.gms.internal.ads.C5861z50 c5861z50M = m(c2597Mb0, true, iA6, null);
        int i30 = 0;
        for (int i31 = true != c2597Mb0.h() ? iA6 : 0; i31 <= iA6; i31++) {
            c2597Mb0.c();
            c2597Mb0.c();
            c2597Mb0.c();
        }
        int iA7 = c2597Mb0.a(6);
        int iC2 = c2597Mb0.c() + 1;
        com.google.android.gms.internal.ads.C3228b60 c3228b60 = new com.google.android.gms.internal.ads.C3228b60(com.google.android.gms.internal.ads.AbstractC3398ci0.P(c5861z50M), new int[1]);
        boolean z13 = i28 >= 2 && iC2 >= 2;
        boolean z14 = zH2 && zH3;
        int i32 = iA7 + 1;
        if (!z13 || !z14 || i32 < i28) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int[][] iArr5 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, iC2, i32);
        int[] iArr6 = new int[iC2];
        int[] iArr7 = new int[iC2];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        while (i29 < iC2) {
            int i33 = i30;
            while (i30 <= iA7) {
                if (c2597Mb0.h()) {
                    iArr5[i29][i33] = i30;
                    iArr7[i29] = i30;
                    i33++;
                }
                iArr6[i29] = i33;
                i30++;
            }
            i29++;
            i30 = 0;
        }
        if (c2597Mb0.h()) {
            c2597Mb0.f(64);
            if (c2597Mb0.h()) {
                c2597Mb0.c();
            }
            int iC3 = c2597Mb0.c();
            for (int i34 = 0; i34 < iC3; i34++) {
                c2597Mb0.c();
                if (i34 == 0 || c2597Mb0.h()) {
                    boolean zH4 = c2597Mb0.h();
                    boolean zH5 = c2597Mb0.h();
                    z12 = zH4;
                    z11 = zH5;
                    if (zH4 || zH5) {
                        zH = c2597Mb0.h();
                        if (zH) {
                            c2597Mb0.f(19);
                        }
                        c2597Mb0.f(8);
                        if (zH) {
                            c2597Mb0.f(4);
                        }
                        c2597Mb0.f(15);
                        i23 = zH4;
                        i22 = zH5;
                    }
                    i24 = 0;
                    while (i24 <= iA6) {
                        if (!c2597Mb0.h() || c2597Mb0.h()) {
                            c2597Mb0.c();
                        } else {
                            if (c2597Mb0.h()) {
                                iC = 0;
                            }
                            i25 = i23 + i22;
                            int[][] iArr8 = iArr5;
                            i26 = 0;
                            while (i26 < i25) {
                                int i35 = i25;
                                for (i27 = 0; i27 <= iC; i27++) {
                                    c2597Mb0.c();
                                    c2597Mb0.c();
                                    if (zH) {
                                        c2597Mb0.c();
                                        c2597Mb0.c();
                                    }
                                    c2597Mb0.e();
                                }
                                i26++;
                                i25 = i35;
                            }
                            i24++;
                            iArr7 = iArr7;
                            iC3 = iC3;
                            iArr5 = iArr8;
                        }
                        iC = c2597Mb0.c();
                        i25 = i23 + i22;
                        int[][] iArr9 = iArr5;
                        i26 = 0;
                        while (i26 < i25) {
                            int i36 = i25;
                            while (i27 <= iC) {
                                c2597Mb0.c();
                                c2597Mb0.c();
                                if (zH) {
                                    c2597Mb0.c();
                                    c2597Mb0.c();
                                }
                                c2597Mb0.e();
                            }
                            i26++;
                            i25 = i36;
                        }
                        i24++;
                        iArr7 = iArr7;
                        iC3 = iC3;
                        iArr5 = iArr9;
                    }
                } else {
                    z12 = false;
                    z11 = false;
                }
                zH = false;
                i23 = z12;
                i22 = z11;
                i24 = 0;
                while (i24 <= iA6) {
                    if (c2597Mb0.h()) {
                        c2597Mb0.c();
                        iC = c2597Mb0.c();
                    } else {
                        c2597Mb0.c();
                        iC = c2597Mb0.c();
                    }
                    i25 = i23 + i22;
                    int[][] iArr10 = iArr5;
                    i26 = 0;
                    while (i26 < i25) {
                        int i37 = i25;
                        while (i27 <= iC) {
                            c2597Mb0.c();
                            c2597Mb0.c();
                            if (zH) {
                                c2597Mb0.c();
                                c2597Mb0.c();
                            }
                            c2597Mb0.e();
                        }
                        i26++;
                        i25 = i37;
                    }
                    i24++;
                    iArr7 = iArr7;
                    iC3 = iC3;
                    iArr5 = iArr10;
                }
            }
        }
        int[][] iArr11 = iArr5;
        int[] iArr12 = iArr7;
        if (!c2597Mb0.h()) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        c2597Mb0.d();
        com.google.android.gms.internal.ads.C5861z50 c5861z50M2 = m(c2597Mb0, false, iA6, c5861z50M);
        boolean zH6 = c2597Mb0.h();
        boolean[] zArr4 = new boolean[16];
        int i38 = 0;
        for (int i39 = 0; i39 < 16; i39++) {
            boolean zH7 = c2597Mb0.h();
            zArr4[i39] = zH7;
            if (zH7) {
                i38++;
            }
        }
        if (i38 == 0 || !zArr4[1]) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int i40 = i38 + 1;
        int[] iArr13 = new int[i38];
        for (int i41 = 0; i41 < i38 - (zH6 ? 1 : 0); i41++) {
            iArr13[i41] = c2597Mb0.a(3);
        }
        int[] iArr14 = new int[i40];
        if (zH6) {
            for (int i42 = 1; i42 < i38; i42++) {
                for (int i43 = 0; i43 < i42; i43++) {
                    iArr14[i42] = iArr14[i42] + iArr13[i43] + 1;
                }
            }
            iArr14[i38] = 6;
        }
        int[][] iArr15 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i28, i38);
        int[] iArr16 = new int[i28];
        iArr16[0] = 0;
        boolean zH8 = c2597Mb0.h();
        int i44 = 1;
        while (i44 < i28) {
            if (zH8) {
                iArr16[i44] = c2597Mb0.a(6);
            } else {
                iArr16[i44] = i44;
            }
            if (zH6) {
                z10 = zH6 ? 1 : 0;
                int i45 = 0;
                while (i45 < i38) {
                    int i46 = i45 + 1;
                    iArr15[i44][i45] = (iArr16[i44] & ((1 << iArr14[i46]) - 1)) >> iArr14[i45];
                    i45 = i46;
                }
            } else {
                int i47 = 0;
                while (i47 < i38) {
                    iArr15[i44][i47] = c2597Mb0.a(iArr13[i47] + 1);
                    i47++;
                    zH6 = zH6 ? 1 : 0;
                }
                z10 = zH6;
            }
            i44++;
            zH6 = z10;
        }
        int[] iArr17 = new int[i32];
        int i48 = 1;
        for (int i49 = 0; i49 < i28; i49++) {
            iArr17[iArr16[i49]] = -1;
            int i50 = 0;
            int i51 = 0;
            while (i50 < 16) {
                if (zArr4[i50]) {
                    i20 = 1;
                    if (i50 == 1) {
                        iArr17[iArr16[i49]] = iArr15[i49][i51];
                        i21 = 1;
                    } else {
                        i21 = i50;
                    }
                    i51++;
                    i50 = i21;
                } else {
                    i20 = 1;
                }
                i50 += i20;
            }
            if (i49 > 0) {
                int i52 = 0;
                while (true) {
                    if (i52 >= i49) {
                        i48++;
                        break;
                    }
                    if (iArr17[iArr16[i49]] == iArr17[iArr16[i52]]) {
                        break;
                    }
                    i52++;
                }
            }
        }
        int iA8 = c2597Mb0.a(4);
        if (i48 < 2 || iA8 == 0) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int[] iArr18 = new int[i48];
        for (int i53 = 0; i53 < i48; i53++) {
            iArr18[i53] = c2597Mb0.a(iA8);
        }
        int[] iArr19 = new int[i32];
        for (int i54 = 0; i54 < i28; i54++) {
            iArr19[java.lang.Math.min(iArr16[i54], iA7)] = i54;
        }
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        int i55 = 0;
        while (i55 <= iA7) {
            int[] iArr20 = iArr17;
            int iMin = java.lang.Math.min(iArr17[i55], i48 - 1);
            c3083Zh0.g(new com.google.android.gms.internal.ads.C5639x40(iArr19[i55], iMin >= 0 ? iArr18[iMin] : -1));
            i55++;
            iArr17 = iArr20;
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0J = c3083Zh0.j();
        if (((com.google.android.gms.internal.ads.C5639x40) abstractC3398ci0J.get(0)).f39779b == -1) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int i56 = 1;
        while (true) {
            if (i56 > iA7) {
                i11 = -1;
                i56 = -1;
                break;
            }
            i11 = -1;
            if (((com.google.android.gms.internal.ads.C5639x40) abstractC3398ci0J.get(i56)).f39779b != -1) {
                break;
            }
            i56++;
        }
        if (i56 == i11) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        java.lang.Class cls = java.lang.Boolean.TYPE;
        boolean[][] zArr5 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i28, i28);
        boolean[][] zArr6 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i28, i28);
        for (int i57 = 1; i57 < i28; i57++) {
            for (int i58 = 0; i58 < i57; i58++) {
                boolean[] zArr7 = zArr5[i57];
                boolean[] zArr8 = zArr6[i57];
                boolean zH9 = c2597Mb0.h();
                zArr8[i58] = zH9;
                zArr7[i58] = zH9;
            }
        }
        for (int i59 = 1; i59 < i28; i59++) {
            for (int i60 = 0; i60 < iA5; i60++) {
                for (int i61 = 0; i61 < i59; i61++) {
                    boolean[] zArr9 = zArr6[i59];
                    if (zArr9[i61] && zArr6[i61][i60]) {
                        zArr9[i60] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr21 = new int[i32];
        for (int i62 = 0; i62 < i28; i62++) {
            int i63 = 0;
            for (int i64 = 0; i64 < i62; i64++) {
                i63 += zArr5[i62][i64] ? 1 : 0;
            }
            iArr21[iArr16[i62]] = i63;
        }
        int i65 = 0;
        for (int i66 = 0; i66 < i28; i66++) {
            if (iArr21[iArr16[i66]] == 0) {
                i65++;
            }
        }
        if (i65 > 1) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int[] iArr22 = new int[i28];
        int[] iArr23 = new int[i12];
        if (c2597Mb0.h()) {
            i12 = iC2;
            int i67 = 0;
            while (true) {
                iArr = iArr16;
                if (i67 >= i28) {
                    break;
                }
                iArr22[i67] = c2597Mb0.a(3);
                i67++;
                iArr16 = iArr;
            }
            i13 = iA6;
        } else {
            i12 = iC2;
            iArr = iArr16;
            i13 = iA6;
            java.util.Arrays.fill(iArr22, 0, i28, i13);
        }
        int i68 = 0;
        while (true) {
            i14 = i56;
            zArr = zArr6;
            iArr2 = iArr21;
            if (i68 >= i12) {
                break;
            }
            int iMax = 0;
            for (int i69 = 0; i69 < iArr6[i68]; i69++) {
                iMax = java.lang.Math.max(iMax, iArr22[((com.google.android.gms.internal.ads.C5639x40) abstractC3398ci0J.get(iArr11[i68][i69])).f39778a]);
            }
            iArr23[i68] = iMax + 1;
            i68++;
            zArr6 = zArr;
            iArr21 = iArr2;
            i56 = i14;
        }
        if (c2597Mb0.h()) {
            int i70 = 0;
            while (i70 < iA5) {
                int i71 = i70 + 1;
                for (int i72 = i71; i72 < i28; i72++) {
                    if (zArr5[i72][i70]) {
                        c2597Mb0.f(3);
                    }
                }
                i70 = i71;
            }
        }
        c2597Mb0.e();
        int iC4 = c2597Mb0.c() + 1;
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh1 = new com.google.android.gms.internal.ads.C3083Zh0();
        c3083Zh1.g(c5861z50M);
        if (iC4 > 1) {
            com.google.android.gms.internal.ads.C5861z50 c5861z50M3 = c5861z50M2;
            c3083Zh1.g(c5861z50M3);
            for (int i73 = 2; i73 < iC4; i73++) {
                c5861z50M3 = m(c2597Mb0, c2597Mb0.h(), i13, c5861z50M3);
                c3083Zh1.g(c5861z50M3);
            }
        }
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0J2 = c3083Zh1.j();
        int iC5 = c2597Mb0.c() + i12;
        if (iC5 > i12) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int iA9 = c2597Mb0.a(2);
        boolean[][] zArr10 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, iC5, i32);
        int[] iArr24 = new int[iC5];
        int[] iArr25 = new int[iC5];
        int i74 = 0;
        while (i74 < i12) {
            int i75 = i12;
            iArr24[i74] = 0;
            int i76 = iArr12[i74];
            iArr25[i74] = i76;
            if (iA9 == 0) {
                zArr3 = zArr5;
                i19 = i28;
                iArr4 = iArr23;
                java.util.Arrays.fill(zArr10[i74], 0, iArr6[i74], true);
                iArr24[i74] = iArr6[i74];
            } else {
                i19 = i28;
                zArr3 = zArr5;
                iArr4 = iArr23;
                if (iA9 == 1) {
                    for (int i77 = 0; i77 < iArr6[i74]; i77++) {
                        zArr10[i74][i77] = iArr11[i74][i77] == i76;
                    }
                    iArr24[i74] = 1;
                } else {
                    zArr10[0][0] = true;
                    iArr24[0] = 1;
                }
                i74++;
                i12 = i75;
                zArr5 = zArr3;
                iArr23 = iArr4;
                i28 = i19;
            }
            i74++;
            i12 = i75;
            zArr5 = zArr3;
            iArr23 = iArr4;
            i28 = i19;
        }
        int i78 = i28;
        boolean[][] zArr11 = zArr5;
        int[] iArr26 = iArr23;
        int i79 = i12;
        int[] iArr27 = new int[i32];
        int i80 = 2;
        boolean[][] zArr12 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, iC5, i32);
        int i81 = 0;
        int i82 = 1;
        while (i82 < iC5) {
            if (iA9 == i80) {
                for (int i83 = 0; i83 < iArr6[i82]; i83++) {
                    zArr10[i82][i83] = c2597Mb0.h();
                    int i84 = iArr24[i82];
                    boolean z15 = zArr10[i82][i83];
                    iArr24[i82] = i84 + (z15 ? 1 : 0);
                    if (z15) {
                        iArr25[i82] = iArr11[i82][i83];
                    }
                }
            }
            if (i81 != 0) {
                i15 = iA9;
                i16 = i14;
            } else if (iArr11[i82][0] == 0 && zArr10[i82][0]) {
                i81 = 0;
                int i85 = 1;
                while (i85 < iArr6[i82]) {
                    int i86 = iA9;
                    int i87 = i14;
                    if (iArr11[i82][i85] == i87 && zArr10[i82][i87]) {
                        i81 = i82;
                    }
                    i85++;
                    i14 = i87;
                    iA9 = i86;
                }
                i15 = iA9;
                i16 = i14;
            } else {
                i15 = iA9;
                i16 = i14;
                i81 = 0;
            }
            int i88 = 0;
            while (i88 < iArr6[i82]) {
                if (iC4 > 1) {
                    zArr12[i82][i88] = zArr10[i82][i88];
                    iArr3 = iArr25;
                    i18 = i16;
                    i17 = iC4;
                    int iA10 = com.google.android.gms.internal.ads.AbstractC5816yj0.a(iC4, java.math.RoundingMode.CEILING);
                    if (zArr12[i82][i88]) {
                        zArr2 = zArr10;
                        break;
                    }
                    int i89 = ((com.google.android.gms.internal.ads.C5639x40) abstractC3398ci0J.get(iArr11[i82][i88])).f39778a;
                    int i90 = 0;
                    while (true) {
                        if (i90 >= i88) {
                            zArr2 = zArr10;
                            break;
                        }
                        zArr2 = zArr10;
                        if (zArr[i89][((com.google.android.gms.internal.ads.C5639x40) abstractC3398ci0J.get(iArr11[i82][i90])).f39778a]) {
                            zArr12[i82][i88] = true;
                            break;
                        }
                        i90++;
                        zArr10 = zArr2;
                    }
                    if (zArr12[i82][i88]) {
                        if (i81 <= 0 || i82 != i81) {
                            c2597Mb0.f(iA10);
                        } else {
                            iArr27[i88] = c2597Mb0.a(iA10);
                        }
                    }
                } else {
                    i17 = iC4;
                    iArr3 = iArr25;
                    i18 = i16;
                    zArr2 = zArr10;
                }
                i88++;
                iArr25 = iArr3;
                i16 = i18;
                iC4 = i17;
                zArr10 = zArr2;
            }
            int i91 = iC4;
            int[] iArr28 = iArr25;
            i14 = i16;
            boolean[][] zArr13 = zArr10;
            if (iArr24[i82] == 1 && iArr2[iArr28[i82]] > 0) {
                c2597Mb0.e();
            }
            i82++;
            iArr25 = iArr28;
            iA9 = i15;
            iC4 = i91;
            zArr10 = zArr13;
            i80 = 2;
        }
        if (i81 == 0) {
            return new com.google.android.gms.internal.ads.I90(y40L, null, c3228b60, null, null);
        }
        int iC6 = c2597Mb0.c();
        int i92 = iC6 + 1;
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0C = com.google.android.gms.internal.ads.AbstractC3398ci0.C(i92);
        int[] iArr29 = new int[i78];
        int i93 = 0;
        while (i93 < i92) {
            int iA11 = c2597Mb0.a(16);
            int iA12 = c2597Mb0.a(16);
            if (c2597Mb0.h()) {
                iA2 = c2597Mb0.a(2);
                if (iA2 == 3) {
                    c2597Mb0.e();
                }
                iA3 = c2597Mb0.a(4);
                iA4 = c2597Mb0.a(4);
            } else {
                iA2 = 0;
                iA3 = 0;
                iA4 = 0;
            }
            if (c2597Mb0.h()) {
                int iC7 = c2597Mb0.c();
                int iC8 = c2597Mb0.c();
                int iC9 = c2597Mb0.c();
                int iC10 = c2597Mb0.c();
                iA11 = k(iA11, iA2, iC7, iC8);
                iA12 = j(iA12, iA2, iC9, iC10);
            }
            c3083Zh0C.g(new com.google.android.gms.internal.ads.C60(iA2, iA3, iA4, iA11, iA12));
            i93++;
            abstractC3398ci0J = abstractC3398ci0J;
            y40L = y40L;
            iArr27 = iArr27;
        }
        com.google.android.gms.internal.ads.Y40 y40 = y40L;
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = abstractC3398ci0J;
        int[] iArr30 = iArr27;
        if (i92 <= 1 || !c2597Mb0.h()) {
            for (int i94 = 1; i94 < i78; i94++) {
                iArr29[i94] = java.lang.Math.min(i94, iC6);
            }
        } else {
            int iA13 = com.google.android.gms.internal.ads.AbstractC5816yj0.a(i92, java.math.RoundingMode.CEILING);
            for (int i95 = 1; i95 < i78; i95++) {
                iArr29[i95] = c2597Mb0.a(iA13);
            }
        }
        com.google.android.gms.internal.ads.C3449d70 c3449d70 = new com.google.android.gms.internal.ads.C3449d70(c3083Zh0C.j(), iArr29);
        c2597Mb0.f(2);
        for (int i96 = 1; i96 < i78; i96++) {
            if (iArr2[iArr[i96]] == 0) {
                c2597Mb0.e();
            }
        }
        for (int i97 = 1; i97 < iC5; i97++) {
            boolean zH10 = c2597Mb0.h();
            int i98 = 0;
            while (i98 < iArr26[i97]) {
                if ((i98 <= 0 || !zH10) ? i98 == 0 : c2597Mb0.h()) {
                    for (int i99 = 0; i99 < iArr6[i97]; i99++) {
                        if (zArr12[i97][i99]) {
                            c2597Mb0.c();
                        }
                    }
                    c2597Mb0.c();
                    c2597Mb0.c();
                }
                i98++;
            }
        }
        int iC11 = c2597Mb0.c() + 2;
        if (c2597Mb0.h()) {
            c2597Mb0.f(iC11);
        } else {
            for (int i100 = 1; i100 < i78; i100++) {
                for (int i101 = 0; i101 < i100; i101++) {
                    if (zArr11[i100][i101]) {
                        c2597Mb0.f(iC11);
                    }
                }
            }
        }
        int iC12 = c2597Mb0.c();
        for (int i102 = 1; i102 <= iC12; i102++) {
            c2597Mb0.f(8);
        }
        if (c2597Mb0.h()) {
            c2597Mb0.d();
            if (c2597Mb0.h() || c2597Mb0.h()) {
                c2597Mb0.e();
            }
            boolean zH11 = c2597Mb0.h();
            boolean zH12 = c2597Mb0.h();
            if (zH11 || zH12) {
                for (int i103 = 0; i103 < i79; i103++) {
                    for (int i104 = 0; i104 < iArr26[i103]; i104++) {
                        boolean zH13 = zH11 ? c2597Mb0.h() : false;
                        boolean zH14 = zH12 ? c2597Mb0.h() : false;
                        if (zH13) {
                            c2597Mb0.f(32);
                        }
                        if (zH14) {
                            c2597Mb0.f(18);
                        }
                    }
                }
            }
            boolean zH15 = c2597Mb0.h();
            if (zH15) {
                z6 = true;
                iA = c2597Mb0.a(4) + 1;
            } else {
                z6 = true;
                iA = i78;
            }
            com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0C2 = com.google.android.gms.internal.ads.AbstractC3398ci0.C(iA);
            int[] iArr31 = new int[i78];
            int i105 = 0;
            while (i105 < iA) {
                c2597Mb0.f(3);
                int i106 = z6 != c2597Mb0.h() ? 2 : 1;
                int iA14 = com.google.android.gms.internal.ads.PA0.a(c2597Mb0.a(8));
                int iB = com.google.android.gms.internal.ads.PA0.b(c2597Mb0.a(8));
                c2597Mb0.f(8);
                c3083Zh0C2.g(new com.google.android.gms.internal.ads.G80(iA14, i106, iB));
                i105++;
                z6 = true;
            }
            if (zH15 && iA > 1) {
                for (int i107 = 0; i107 < i78; i107++) {
                    iArr31[i107] = c2597Mb0.a(4);
                }
            }
            c3892h90 = new com.google.android.gms.internal.ads.C3892h90(c3083Zh0C2.j(), iArr31);
        } else {
            c3892h90 = null;
        }
        return new com.google.android.gms.internal.ads.I90(y40, abstractC3398ci0, new com.google.android.gms.internal.ads.C3228b60(abstractC3398ci0J2, iArr30), c3449d70, c3892h90);
    }

    public static com.google.android.gms.internal.ads.C4149ja0 e(byte[] bArr, int i6, int i10) {
        com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0 = new com.google.android.gms.internal.ads.C2597Mb0(bArr, 4, i10);
        int iC = c2597Mb0.c();
        int iC2 = c2597Mb0.c();
        c2597Mb0.e();
        return new com.google.android.gms.internal.ads.C4149ja0(iC, iC2, c2597Mb0.h());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:119:0x0204  */
    /* JADX WARN: Code duplicated, block: B:122:0x0210  */
    /* JADX WARN: Code duplicated, block: B:125:0x021b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0224  */
    /* JADX WARN: Code duplicated, block: B:131:0x022b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0237  */
    /* JADX WARN: Code duplicated, block: B:136:0x0257  */
    /* JADX WARN: Code duplicated, block: B:137:0x025e  */
    /* JADX WARN: Code duplicated, block: B:142:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167 A[PHI: r2
  0x0167: PHI (r2v26 int) = (r2v4 int), (r2v3 int) binds: [B:86:0x016c, B:82:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x016a A[PHI: r2
  0x016a: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v27 int) binds: [B:72:0x014f, B:74:0x0153, B:76:0x0157, B:78:0x015b, B:80:0x015f, B:83:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:98:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x01a5, please report this as an issue */
    public static com.google.android.gms.internal.ads.C2522Ka0 f(byte[] bArr, int i6, int i10) {
        int iC;
        int i11;
        boolean zH;
        int iC2;
        int iC3;
        int i12;
        int i13;
        int i14;
        int i15;
        int iB;
        int i16;
        int iC4;
        boolean z6;
        boolean zH2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int iB2;
        float f6;
        float f10;
        boolean zH3;
        boolean zH4;
        int iA;
        int iA2;
        int i26;
        int i27;
        com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0 = new com.google.android.gms.internal.ads.C2597Mb0(bArr, i6, i10);
        int iA3 = c2597Mb0.a(8);
        int iA4 = c2597Mb0.a(8);
        int iA5 = c2597Mb0.a(8);
        int iC5 = c2597Mb0.c();
        if (iA3 == 100 || iA3 == 110 || iA3 == 122 || iA3 == 244 || iA3 == 44 || iA3 == 83 || iA3 == 86 || iA3 == 118 || iA3 == 128) {
            iC = c2597Mb0.c();
            if (iC == 3) {
                zH = c2597Mb0.h();
                i11 = 3;
            } else {
                i11 = iC;
                zH = false;
            }
            iC2 = c2597Mb0.c();
            iC3 = c2597Mb0.c();
            c2597Mb0.e();
            if (c2597Mb0.h()) {
                if (i11 != 3) {
                    i12 = 8;
                } else {
                    i12 = 12;
                }
                for (i13 = 0; i13 < i12; i13++) {
                    if (!c2597Mb0.h()) {
                        if (i13 < 6) {
                            i14 = 16;
                        } else {
                            i14 = 64;
                        }
                        iB = 8;
                        i16 = 8;
                        for (i15 = 0; i15 < i14; i15++) {
                            if (iB != 0) {
                                iB = ((i16 + c2597Mb0.b()) + 256) % 256;
                            }
                            if (iB != 0) {
                                i16 = iB;
                            }
                        }
                    }
                }
            }
        } else if (iA3 == 138) {
            iA3 = 138;
            iC = c2597Mb0.c();
            if (iC == 3) {
                zH = c2597Mb0.h();
                i11 = 3;
            } else {
                i11 = iC;
                zH = false;
            }
            iC2 = c2597Mb0.c();
            iC3 = c2597Mb0.c();
            c2597Mb0.e();
            if (c2597Mb0.h()) {
                if (i11 != 3) {
                    i12 = 8;
                } else {
                    i12 = 12;
                }
                while (i13 < i12) {
                    if (!c2597Mb0.h()) {
                        if (i13 < 6) {
                            i14 = 16;
                        } else {
                            i14 = 64;
                        }
                        iB = 8;
                        i16 = 8;
                        while (i15 < i14) {
                            if (iB != 0) {
                                iB = ((i16 + c2597Mb0.b()) + 256) % 256;
                            }
                            if (iB != 0) {
                                i16 = iB;
                            }
                        }
                    }
                }
            }
        } else {
            iC = 1;
            zH = false;
            iC2 = 0;
            iC3 = 0;
        }
        int iC6 = c2597Mb0.c() + 4;
        int iC7 = c2597Mb0.c();
        if (iC7 != 0) {
            if (iC7 == 1) {
                boolean zH5 = c2597Mb0.h();
                c2597Mb0.b();
                c2597Mb0.b();
                long jC = c2597Mb0.c();
                for (int i28 = 0; i28 < jC; i28++) {
                    c2597Mb0.c();
                }
                z6 = zH5;
                iC7 = 1;
                iC4 = 0;
            } else {
                iC4 = 0;
            }
            int iC8 = c2597Mb0.c();
            c2597Mb0.e();
            int iC9 = c2597Mb0.c() + 1;
            int iC10 = c2597Mb0.c() + 1;
            zH2 = c2597Mb0.h();
            i17 = 2 - (zH2 ? 1 : 0);
            if (!zH2) {
                c2597Mb0.e();
            }
            c2597Mb0.e();
            i18 = iC9 * 16;
            i19 = iC10 * i17 * 16;
            if (c2597Mb0.h()) {
                int iC11 = c2597Mb0.c();
                int iC12 = c2597Mb0.c();
                int iC13 = c2597Mb0.c();
                int iC14 = c2597Mb0.c();
                if (iC == 0) {
                    i26 = 1;
                } else {
                    if (iC == 3) {
                        i26 = 1;
                    } else {
                        i26 = 2;
                    }
                    if (iC == 1) {
                        i27 = 2;
                    } else {
                        i27 = 1;
                    }
                    i17 *= i27;
                }
                i18 -= (iC11 + iC12) * i26;
                i19 -= (iC13 + iC14) * i17;
            }
            int i29 = i18;
            int i30 = i19;
            if (iA3 != 44 || iA3 == 86 || iA3 == 100 || iA3 == 110 || iA3 == 122) {
                if ((iA4 & 16) != 0) {
                    i20 = iA3;
                    i21 = 0;
                } else {
                    i20 = iA3;
                    i21 = 16;
                }
            } else if (iA3 == 244) {
                iA3 = 244;
                if ((iA4 & 16) != 0) {
                    i20 = iA3;
                    i21 = 0;
                } else {
                    i20 = iA3;
                    i21 = 16;
                }
            } else {
                i20 = iA3;
                i21 = 16;
            }
            i22 = -1;
            if (c2597Mb0.h()) {
                if (c2597Mb0.h()) {
                    iA = c2597Mb0.a(8);
                    if (iA == 255) {
                        iA2 = c2597Mb0.a(16);
                        int iA6 = c2597Mb0.a(16);
                        if (iA2 != 0 || iA6 == 0) {
                            f10 = 1.0f;
                        } else {
                            f10 = iA2 / iA6;
                        }
                    } else if (iA < 17) {
                        f10 = f37188b[iA];
                    } else {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iA);
                        f10 = 1.0f;
                    }
                } else {
                    f10 = 1.0f;
                }
                if (c2597Mb0.h()) {
                    c2597Mb0.e();
                }
                if (c2597Mb0.h()) {
                    c2597Mb0.f(3);
                    int i31 = true != c2597Mb0.h() ? 2 : 1;
                    if (c2597Mb0.h()) {
                        int iA7 = c2597Mb0.a(8);
                        int iA8 = c2597Mb0.a(8);
                        c2597Mb0.f(8);
                        int iA9 = com.google.android.gms.internal.ads.PA0.a(iA7);
                        iB2 = com.google.android.gms.internal.ads.PA0.b(iA8);
                        i24 = iA9;
                    } else {
                        i24 = -1;
                        iB2 = -1;
                    }
                    i22 = i31;
                } else {
                    i24 = -1;
                    iB2 = -1;
                }
                if (c2597Mb0.h()) {
                    c2597Mb0.c();
                    c2597Mb0.c();
                }
                if (c2597Mb0.h()) {
                    c2597Mb0.f(65);
                }
                zH3 = c2597Mb0.h();
                if (zH3) {
                    n(c2597Mb0);
                }
                zH4 = c2597Mb0.h();
                if (zH4) {
                    n(c2597Mb0);
                }
                if (zH3 || zH4) {
                    c2597Mb0.e();
                }
                c2597Mb0.e();
                if (c2597Mb0.h()) {
                    c2597Mb0.e();
                    c2597Mb0.c();
                    c2597Mb0.c();
                    c2597Mb0.c();
                    c2597Mb0.c();
                    int iC15 = c2597Mb0.c();
                    c2597Mb0.c();
                    i23 = iC15;
                } else {
                    i23 = i21;
                }
                i25 = i22;
                f6 = f10;
            } else {
                i23 = i21;
                i24 = -1;
                i25 = -1;
                iB2 = -1;
                f6 = 1.0f;
            }
            return new com.google.android.gms.internal.ads.C2522Ka0(i20, iA4, iA5, iC5, iC8, i29, i30, f6, iC2, iC3, zH, zH2, iC6, iC7, iC4, z6, i24, i25, iB2, i23);
        }
        iC4 = c2597Mb0.c() + 4;
        z6 = false;
        int iC16 = c2597Mb0.c();
        c2597Mb0.e();
        int iC17 = c2597Mb0.c() + 1;
        int iC18 = c2597Mb0.c() + 1;
        zH2 = c2597Mb0.h();
        i17 = 2 - (zH2 ? 1 : 0);
        if (!zH2) {
            c2597Mb0.e();
        }
        c2597Mb0.e();
        i18 = iC17 * 16;
        i19 = iC18 * i17 * 16;
        if (c2597Mb0.h()) {
            int iC19 = c2597Mb0.c();
            int iC110 = c2597Mb0.c();
            int iC111 = c2597Mb0.c();
            int iC112 = c2597Mb0.c();
            if (iC == 0) {
                i26 = 1;
            } else {
                if (iC == 3) {
                    i26 = 1;
                } else {
                    i26 = 2;
                }
                if (iC == 1) {
                    i27 = 2;
                } else {
                    i27 = 1;
                }
                i17 *= i27;
            }
            i18 -= (iC19 + iC110) * i26;
            i19 -= (iC111 + iC112) * i17;
        }
        int i210 = i18;
        int i32 = i19;
        if (iA3 != 44) {
            if ((iA4 & 16) != 0) {
                i20 = iA3;
                i21 = 0;
            } else {
                i20 = iA3;
                i21 = 16;
            }
        } else if ((iA4 & 16) != 0) {
            i20 = iA3;
            i21 = 0;
        } else {
            i20 = iA3;
            i21 = 16;
        }
        i22 = -1;
        if (c2597Mb0.h()) {
            if (c2597Mb0.h()) {
                f10 = 1.0f;
            } else {
                iA = c2597Mb0.a(8);
                if (iA == 255) {
                    iA2 = c2597Mb0.a(16);
                    int iA10 = c2597Mb0.a(16);
                    if (iA2 != 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                    }
                } else if (iA < 17) {
                    f10 = f37188b[iA];
                } else {
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iA);
                    f10 = 1.0f;
                }
            }
            if (c2597Mb0.h()) {
                c2597Mb0.e();
            }
            if (c2597Mb0.h()) {
                c2597Mb0.f(3);
                if (true != c2597Mb0.h()) {
                }
                if (c2597Mb0.h()) {
                    int iA11 = c2597Mb0.a(8);
                    int iA12 = c2597Mb0.a(8);
                    c2597Mb0.f(8);
                    int iA13 = com.google.android.gms.internal.ads.PA0.a(iA11);
                    iB2 = com.google.android.gms.internal.ads.PA0.b(iA12);
                    i24 = iA13;
                } else {
                    i24 = -1;
                    iB2 = -1;
                }
                i22 = i31;
            } else {
                i24 = -1;
                iB2 = -1;
            }
            if (c2597Mb0.h()) {
                c2597Mb0.c();
                c2597Mb0.c();
            }
            if (c2597Mb0.h()) {
                c2597Mb0.f(65);
            }
            zH3 = c2597Mb0.h();
            if (zH3) {
                n(c2597Mb0);
            }
            zH4 = c2597Mb0.h();
            if (zH4) {
                n(c2597Mb0);
            }
            if (zH3) {
                c2597Mb0.e();
            } else {
                c2597Mb0.e();
            }
            c2597Mb0.e();
            if (c2597Mb0.h()) {
                c2597Mb0.e();
                c2597Mb0.c();
                c2597Mb0.c();
                c2597Mb0.c();
                c2597Mb0.c();
                int iC113 = c2597Mb0.c();
                c2597Mb0.c();
                i23 = iC113;
            } else {
                i23 = i21;
            }
            i25 = i22;
            f6 = f10;
        } else {
            i23 = i21;
            i24 = -1;
            i25 = -1;
            iB2 = -1;
            f6 = 1.0f;
        }
        return new com.google.android.gms.internal.ads.C2522Ka0(i20, iA4, iA5, iC5, iC16, i210, i32, f6, iC2, iC3, zH, zH2, iC6, iC7, iC4, z6, i24, i25, iB2, i23);
    }

    public static java.lang.String g(java.util.List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            byte[] bArr = (byte[]) list.get(i6);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
                int i10 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i10 >= length2) {
                        break;
                    }
                    int iA = a(bArr, i10, length2, zArr);
                    if (iA != length2) {
                        c3083Zh0.g(java.lang.Integer.valueOf(iA));
                    }
                    i10 = iA + 3;
                }
                com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0J = c3083Zh0.j();
                for (int i11 = 0; i11 < abstractC3398ci0J.size(); i11++) {
                    if (((java.lang.Integer) abstractC3398ci0J.get(i11)).intValue() + 3 < length) {
                        com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0 = new com.google.android.gms.internal.ads.C2597Mb0(bArr, ((java.lang.Integer) abstractC3398ci0J.get(i11)).intValue() + 3, length);
                        com.google.android.gms.internal.ads.Y40 y40L = l(c2597Mb0);
                        if (y40L.f33277a == 33 && y40L.f33278b == 0) {
                            c2597Mb0.f(4);
                            int iA2 = c2597Mb0.a(3);
                            c2597Mb0.e();
                            com.google.android.gms.internal.ads.C5861z50 c5861z50M = m(c2597Mb0, true, iA2, null);
                            return com.google.android.gms.internal.ads.ND.d(c5861z50M.f40210a, c5861z50M.f40211b, c5861z50M.f40212c, c5861z50M.f40213d, c5861z50M.f40214e, c5861z50M.f40215f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void h(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean i(byte b6) {
        if (((b6 & 96) >> 5) != 0) {
            return true;
        }
        int i6 = b6 & 31;
        return (i6 == 1 || i6 == 9 || i6 == 14) ? false : true;
    }

    private static int j(int i6, int i10, int i11, int i12) {
        return i6 - ((i10 == 1 ? 2 : 1) * (i11 + i12));
    }

    private static int k(int i6, int i10, int i11, int i12) {
        int i13 = 2;
        if (i10 != 1 && i10 != 2) {
            i13 = 1;
        }
        return i6 - (i13 * (i11 + i12));
    }

    private static com.google.android.gms.internal.ads.Y40 l(com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0) {
        c2597Mb0.e();
        return new com.google.android.gms.internal.ads.Y40(c2597Mb0.a(6), c2597Mb0.a(6), c2597Mb0.a(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static com.google.android.gms.internal.ads.C5861z50 m(com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0, boolean z6, int i6, com.google.android.gms.internal.ads.C5861z50 c5861z50) {
        int[] iArr;
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean zH;
        int iA;
        int i13;
        int i14;
        int[] iArr2 = new int[6];
        if (!z6) {
            if (c5861z50 != null) {
                int i15 = c5861z50.f40210a;
                zH = c5861z50.f40211b;
                iA = c5861z50.f40212c;
                i13 = c5861z50.f40213d;
                iArr2 = c5861z50.f40214e;
                i10 = i15;
            } else {
                iArr = iArr2;
                i10 = 0;
                z10 = false;
                i11 = 0;
                i12 = 0;
            }
            int iA2 = c2597Mb0.a(8);
            i14 = 0;
            for (int i16 = 0; i16 < i6; i16++) {
                if (c2597Mb0.h()) {
                    i14 += 88;
                }
                if (c2597Mb0.h()) {
                    i14 += 8;
                }
            }
            c2597Mb0.f(i14);
            if (i6 > 0) {
                int i17 = 8 - i6;
                c2597Mb0.f(i17 + i17);
            }
            return new com.google.android.gms.internal.ads.C5861z50(i10, z10, i11, i12, iArr, iA2);
        }
        int iA3 = c2597Mb0.a(2);
        zH = c2597Mb0.h();
        iA = c2597Mb0.a(5);
        i13 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (c2597Mb0.h()) {
                i13 |= 1 << i18;
            }
        }
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = c2597Mb0.a(8);
        }
        i10 = iA3;
        iArr = iArr2;
        z10 = zH;
        i11 = iA;
        i12 = i13;
        int iA4 = c2597Mb0.a(8);
        i14 = 0;
        while (i16 < i6) {
            if (c2597Mb0.h()) {
                i14 += 88;
            }
            if (c2597Mb0.h()) {
                i14 += 8;
            }
        }
        c2597Mb0.f(i14);
        if (i6 > 0) {
            int i110 = 8 - i6;
            c2597Mb0.f(i110 + i110);
        }
        return new com.google.android.gms.internal.ads.C5861z50(i10, z10, i11, i12, iArr, iA4);
    }

    private static void n(com.google.android.gms.internal.ads.C2597Mb0 c2597Mb0) {
        int iC = c2597Mb0.c() + 1;
        c2597Mb0.f(8);
        for (int i6 = 0; i6 < iC; i6++) {
            c2597Mb0.c();
            c2597Mb0.c();
            c2597Mb0.e();
        }
        c2597Mb0.f(20);
    }
}
