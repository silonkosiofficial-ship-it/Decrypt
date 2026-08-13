package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4853pw0 implements com.google.android.gms.internal.ads.Ew0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f38101m = new int[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final sun.misc.Unsafe f38102n = com.google.android.gms.internal.ads.Sw0.q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f38103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object[] f38104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4523mw0 f38107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f38108f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f38109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f38110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f38112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lw0 f38113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5840yv0 f38114l;

    private C4853pw0(int[] iArr, java.lang.Object[] objArr, int i6, int i10, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0, boolean z6, int[] iArr2, int i11, int i12, com.google.android.gms.internal.ads.C5072rw0 c5072rw0, com.google.android.gms.internal.ads.Zv0 zv0, com.google.android.gms.internal.ads.Lw0 lw0, com.google.android.gms.internal.ads.AbstractC5840yv0 abstractC5840yv0, com.google.android.gms.internal.ads.C3865gw0 c3865gw0) {
        this.f38103a = iArr;
        this.f38104b = objArr;
        this.f38105c = i6;
        this.f38106d = i10;
        this.f38109g = interfaceC4523mw0 instanceof com.google.android.gms.internal.ads.Jv0;
        this.f38110h = iArr2;
        this.f38111i = i11;
        this.f38112j = i12;
        this.f38113k = lw0;
        this.f38114l = abstractC5840yv0;
        this.f38107e = interfaceC4523mw0;
    }

    private static boolean A(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.ads.Jv0) {
            return ((com.google.android.gms.internal.ads.Jv0) obj).V();
        }
        return true;
    }

    private final boolean B(java.lang.Object obj, int i6, int i10) {
        return com.google.android.gms.internal.ads.Sw0.l(obj, (long) (L(i10) & 1048575)) == i6;
    }

    private static boolean C(java.lang.Object obj, long j6) {
        return ((java.lang.Boolean) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).booleanValue();
    }

    private static final void D(int i6, java.lang.Object obj, com.google.android.gms.internal.ads.Yw0 yw0) {
        if (obj instanceof java.lang.String) {
            yw0.j(i6, (java.lang.String) obj);
        } else {
            yw0.J(i6, (com.google.android.gms.internal.ads.AbstractC3753fv0) obj);
        }
    }

    static com.google.android.gms.internal.ads.Mw0 F(java.lang.Object obj) {
        com.google.android.gms.internal.ads.Jv0 jv0 = (com.google.android.gms.internal.ads.Jv0) obj;
        com.google.android.gms.internal.ads.Mw0 mw0 = jv0.zzt;
        if (mw0 != com.google.android.gms.internal.ads.Mw0.c()) {
            return mw0;
        }
        com.google.android.gms.internal.ads.Mw0 mw0F = com.google.android.gms.internal.ads.Mw0.f();
        jv0.zzt = mw0F;
        return mw0F;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:170:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x039f  */
    static com.google.android.gms.internal.ads.C4853pw0 G(java.lang.Class cls, com.google.android.gms.internal.ads.InterfaceC4083iw0 interfaceC4083iw0, com.google.android.gms.internal.ads.C5072rw0 c5072rw0, com.google.android.gms.internal.ads.Zv0 zv0, com.google.android.gms.internal.ads.Lw0 lw0, com.google.android.gms.internal.ads.AbstractC5840yv0 abstractC5840yv0, com.google.android.gms.internal.ads.C3865gw0 c3865gw0) {
        int i6;
        int iCharAt;
        int iCharAt2;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        int i29;
        java.lang.reflect.Field fieldM;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        java.lang.Object obj;
        java.lang.reflect.Field fieldM2;
        int i36;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldM3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(interfaceC4083iw0 instanceof com.google.android.gms.internal.ads.C5732xw0)) {
            androidx.appcompat.app.D.a(interfaceC4083iw0);
            throw null;
        }
        com.google.android.gms.internal.ads.C5732xw0 c5732xw0 = (com.google.android.gms.internal.ads.C5732xw0) interfaceC4083iw0;
        java.lang.String strD = c5732xw0.d();
        int length = strD.length();
        char c6 = 55296;
        if (strD.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i6 = i41 + 1;
                if (strD.charAt(i41) < 55296) {
                    break;
                }
                i41 = i6;
            }
        } else {
            i6 = 1;
        }
        int i42 = i6 + 1;
        int iCharAt3 = strD.charAt(i6);
        if (iCharAt3 >= 55296) {
            int i43 = iCharAt3 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strD.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt3 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt3 == 0) {
            i12 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i10 = 0;
            i13 = 0;
            i11 = 0;
            iArr = f38101m;
            i14 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt4 = strD.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i45 + 1;
                    cCharAt8 = strD.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i22;
                }
                iCharAt4 = i46 | (cCharAt8 << i47);
                i45 = i22;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strD.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt7 = strD.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt5 = i49 | (cCharAt7 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strD.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt6 = strD.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt6 = i52 | (cCharAt6 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int iCharAt7 = strD.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt5 = strD.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt7 = i55 | (cCharAt5 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt = strD.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt4 = strD.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            iCharAt2 = strD.charAt(i57);
            if (iCharAt2 >= 55296) {
                int i61 = iCharAt2 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt3 = strD.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt2 = i61 | (cCharAt3 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int iCharAt8 = strD.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt2 = strD.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strD.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i15 = i66 + 1;
                    cCharAt = strD.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i15;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i15;
            }
            int i69 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i10 = iCharAt6;
            i11 = iCharAt9;
            i12 = i69;
            iArr = iArr2;
            i13 = iCharAt7;
            i14 = iCharAt4;
            i42 = i66;
        }
        sun.misc.Unsafe unsafe = f38102n;
        java.lang.Object[] objArrE = c5732xw0.e();
        java.lang.Class<?> cls2 = c5732xw0.a().getClass();
        int i70 = i11 + iCharAt2;
        int i71 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[i71];
        int i72 = i11;
        int i73 = i70;
        int i74 = 0;
        int i75 = 0;
        while (i42 < length) {
            int i76 = i42 + 1;
            int iCharAt10 = strD.charAt(i42);
            if (iCharAt10 >= c6) {
                int i77 = iCharAt10 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i39 = i78 + 1;
                    cCharAt12 = strD.charAt(i78);
                    if (cCharAt12 < c6) {
                        break;
                    }
                    i77 |= (cCharAt12 & 8191) << i79;
                    i79 += 13;
                    i78 = i39;
                }
                iCharAt10 = i77 | (cCharAt12 << i79);
                i23 = i39;
            } else {
                i23 = i76;
            }
            int i80 = i23 + 1;
            int iCharAt11 = strD.charAt(i23);
            if (iCharAt11 >= c6) {
                int i81 = iCharAt11 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i38 = i82 + 1;
                    cCharAt11 = strD.charAt(i82);
                    if (cCharAt11 < c6) {
                        break;
                    }
                    i81 |= (cCharAt11 & 8191) << i83;
                    i83 += 13;
                    i82 = i38;
                }
                iCharAt11 = i81 | (cCharAt11 << i83);
                i24 = i38;
            } else {
                i24 = i80;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int i84 = iCharAt11 & 255;
            int i85 = length;
            int i86 = iCharAt11 & 2048;
            int i87 = i13;
            if (i84 >= 51) {
                int i88 = i24 + 1;
                int iCharAt12 = strD.charAt(i24);
                if (iCharAt12 >= 55296) {
                    int i89 = iCharAt12 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i37 = i90 + 1;
                        cCharAt10 = strD.charAt(i90);
                        i25 = i10;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i89 |= (cCharAt10 & 8191) << i91;
                        i91 += 13;
                        i90 = i37;
                        i10 = i25;
                    }
                    iCharAt12 = i89 | (cCharAt10 << i91);
                    i33 = i37;
                } else {
                    i25 = i10;
                    i33 = i88;
                }
                int i92 = i84 - 51;
                int i93 = i33;
                if (i92 == 9 || i92 == 17) {
                    i34 = i12 + 1;
                    int i94 = i75 / 3;
                    objArr[i94 + i94 + 1] = objArrE[i12];
                } else {
                    if (i92 == 12) {
                        if (c5732xw0.c() == 1 || i86 != 0) {
                            i34 = i12 + 1;
                            int i95 = i75 / 3;
                            objArr[i95 + i95 + 1] = objArrE[i12];
                        } else {
                            i86 = 0;
                        }
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrE[i35];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldM2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldM2 = m(cls2, (java.lang.String) obj);
                        objArrE[i35] = fieldM2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM2);
                    i36 = i35 + 1;
                    obj2 = objArrE[i36];
                    int i96 = i86;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldM3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldM3 = m(cls2, (java.lang.String) obj2);
                        objArrE[i36] = fieldM3;
                    }
                    i26 = i12;
                    i27 = i93;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3);
                    i28 = 0;
                    strD = strD;
                    c5732xw0 = c5732xw0;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i29 = i96;
                }
                i12 = i34;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrE[i35];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldM2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldM2 = m(cls2, (java.lang.String) obj);
                    objArrE[i35] = fieldM2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM2);
                i36 = i35 + 1;
                obj2 = objArrE[i36];
                int i97 = i86;
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldM3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldM3 = m(cls2, (java.lang.String) obj2);
                    objArrE[i36] = fieldM3;
                }
                i26 = i12;
                i27 = i93;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3);
                i28 = 0;
                strD = strD;
                c5732xw0 = c5732xw0;
                iObjectFieldOffset = iObjectFieldOffset4;
                i29 = i97;
            } else {
                i25 = i10;
                i26 = i12 + 1;
                java.lang.reflect.Field fieldM4 = m(cls2, (java.lang.String) objArrE[i12]);
                if (i84 == 9 || i84 == 17) {
                    int i98 = i75 / 3;
                    objArr[i98 + i98 + 1] = fieldM4.getType();
                } else {
                    if (i84 != 27) {
                        if (i84 == 49) {
                            i32 = i12 + 2;
                            i31 = 1;
                        } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                            c5732xw0 = c5732xw0;
                            if (c5732xw0.c() == 1 || i86 != 0) {
                                i32 = i12 + 2;
                                int i99 = i75 / 3;
                                objArr[i99 + i99 + 1] = objArrE[i26];
                                i26 = i32;
                            } else {
                                i86 = 0;
                            }
                        } else if (i84 == 50) {
                            int i100 = i12 + 2;
                            int i101 = i72 + 1;
                            iArr[i72] = i75;
                            int i102 = i75 / 3;
                            int i103 = i102 + i102;
                            objArr[i103] = objArrE[i26];
                            if (i86 != 0) {
                                i26 = i12 + 3;
                                objArr[i103 + 1] = objArrE[i100];
                                i72 = i101;
                                c5732xw0 = c5732xw0;
                            } else {
                                i26 = i100;
                                i72 = i101;
                                i86 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i84 > 17) {
                            i27 = i24;
                            i28 = 0;
                        } else {
                            int i104 = i24 + 1;
                            int iCharAt13 = strD.charAt(i24);
                            if (iCharAt13 >= 55296) {
                                int i105 = iCharAt13 & 8191;
                                int i106 = 13;
                                while (true) {
                                    i30 = i104 + 1;
                                    cCharAt9 = strD.charAt(i104);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i105 |= (cCharAt9 & 8191) << i106;
                                    i106 += 13;
                                    i104 = i30;
                                }
                                iCharAt13 = i105 | (cCharAt9 << i106);
                                i104 = i30;
                            }
                            int i107 = i14 + i14 + (iCharAt13 / 32);
                            java.lang.Object obj3 = objArrE[i107];
                            i27 = i104;
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldM = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldM = m(cls2, (java.lang.String) obj3);
                                objArrE[i107] = fieldM;
                            }
                            i28 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM);
                        }
                        if (i84 >= 18 && i84 <= 49) {
                            iArr[i73] = iObjectFieldOffset;
                            i73++;
                        }
                        i29 = i86;
                    } else {
                        i31 = 1;
                        i32 = i12 + 2;
                    }
                    int i108 = i75 / 3;
                    objArr[i108 + i108 + i31] = objArrE[i26];
                    i26 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i27 = i24;
                        i28 = 0;
                    } else {
                        i27 = i24;
                        i28 = 0;
                    }
                    if (i84 >= 18) {
                        iArr[i73] = iObjectFieldOffset;
                        i73++;
                    }
                    i29 = i86;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i27 = i24;
                    i28 = 0;
                } else {
                    i27 = i24;
                    i28 = 0;
                }
                if (i84 >= 18) {
                    iArr[i73] = iObjectFieldOffset;
                    i73++;
                }
                i29 = i86;
            }
            int i109 = i75 + 1;
            iArr3[i75] = iCharAt10;
            int i110 = i75 + 2;
            java.lang.Class<?> cls3 = cls2;
            iArr3[i109] = iObjectFieldOffset | (i29 != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i84 << 20);
            i75 += 3;
            iArr3[i110] = (i28 << 20) | iObjectFieldOffset2;
            strD = strD;
            i12 = i26;
            length = i85;
            i13 = i87;
            cls2 = cls3;
            c5732xw0 = c5732xw0;
            i42 = i27;
            i10 = i25;
            c6 = 55296;
        }
        return new com.google.android.gms.internal.ads.C4853pw0(iArr3, objArr, i10, i13, c5732xw0.a(), false, iArr, i11, i70, c5072rw0, zv0, lw0, abstractC5840yv0, c3865gw0);
    }

    private static double H(java.lang.Object obj, long j6) {
        return ((java.lang.Double) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).doubleValue();
    }

    private static float I(java.lang.Object obj, long j6) {
        return ((java.lang.Float) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).floatValue();
    }

    private static int J(java.lang.Object obj, long j6) {
        return ((java.lang.Integer) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).intValue();
    }

    private final int K(int i6) {
        if (i6 < this.f38105c || i6 > this.f38106d) {
            return -1;
        }
        return M(i6, 0);
    }

    private final int L(int i6) {
        return this.f38103a[i6 + 2];
    }

    private final int M(int i6, int i10) {
        int length = (this.f38103a.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.f38103a[i12];
            if (i6 == i13) {
                return i12;
            }
            if (i6 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int N(int i6) {
        return (i6 >>> 20) & 255;
    }

    private final int O(int i6) {
        return this.f38103a[i6 + 1];
    }

    private static long P(java.lang.Object obj, long j6) {
        return ((java.lang.Long) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).longValue();
    }

    private final com.google.android.gms.internal.ads.Nv0 Q(int i6) {
        int i10 = i6 / 3;
        return (com.google.android.gms.internal.ads.Nv0) this.f38104b[i10 + i10 + 1];
    }

    private final com.google.android.gms.internal.ads.Ew0 R(int i6) {
        java.lang.Object[] objArr = this.f38104b;
        int i10 = i6 / 3;
        int i11 = i10 + i10;
        com.google.android.gms.internal.ads.Ew0 ew0 = (com.google.android.gms.internal.ads.Ew0) objArr[i11];
        if (ew0 != null) {
            return ew0;
        }
        com.google.android.gms.internal.ads.Ew0 ew0B = com.google.android.gms.internal.ads.C5512vw0.a().b((java.lang.Class) objArr[i11 + 1]);
        this.f38104b[i11] = ew0B;
        return ew0B;
    }

    private final java.lang.Object S(java.lang.Object obj, int i6, java.lang.Object obj2, com.google.android.gms.internal.ads.Lw0 lw0, java.lang.Object obj3) {
        int i10 = this.f38103a[i6];
        java.lang.Object objP = com.google.android.gms.internal.ads.Sw0.p(obj, O(i6) & 1048575);
        if (objP == null || Q(i6) == null) {
            return obj2;
        }
        androidx.appcompat.app.D.a(T(i6));
        throw null;
    }

    private final java.lang.Object T(int i6) {
        int i10 = i6 / 3;
        return this.f38104b[i10 + i10];
    }

    private final java.lang.Object k(java.lang.Object obj, int i6) {
        com.google.android.gms.internal.ads.Ew0 ew0R = R(i6);
        int iO = O(i6) & 1048575;
        if (!x(obj, i6)) {
            return ew0R.d();
        }
        java.lang.Object object = f38102n.getObject(obj, iO);
        if (A(object)) {
            return object;
        }
        java.lang.Object objD = ew0R.d();
        if (object != null) {
            ew0R.e(objD, object);
        }
        return objD;
    }

    private final java.lang.Object l(java.lang.Object obj, int i6, int i10) {
        com.google.android.gms.internal.ads.Ew0 ew0R = R(i10);
        if (!B(obj, i6, i10)) {
            return ew0R.d();
        }
        java.lang.Object object = f38102n.getObject(obj, O(i10) & 1048575);
        if (A(object)) {
            return object;
        }
        java.lang.Object objD = ew0R.d();
        if (object != null) {
            ew0R.e(objD, object);
        }
        return objD;
    }

    private static java.lang.reflect.Field m(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    private static void n(java.lang.Object obj) {
        if (!A(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
        }
    }

    private final void o(java.lang.Object obj, java.lang.Object obj2, int i6) {
        if (x(obj2, i6)) {
            int iO = O(i6) & 1048575;
            sun.misc.Unsafe unsafe = f38102n;
            long j6 = iO;
            java.lang.Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f38103a[i6] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.ads.Ew0 ew0R = R(i6);
            if (!x(obj, i6)) {
                if (A(object)) {
                    java.lang.Object objD = ew0R.d();
                    ew0R.e(objD, object);
                    unsafe.putObject(obj, j6, objD);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                r(obj, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j6);
            if (!A(object2)) {
                java.lang.Object objD2 = ew0R.d();
                ew0R.e(objD2, object2);
                unsafe.putObject(obj, j6, objD2);
                object2 = objD2;
            }
            ew0R.e(object2, object);
        }
    }

    private final void p(java.lang.Object obj, java.lang.Object obj2, int i6) {
        int i10 = this.f38103a[i6];
        if (B(obj2, i10, i6)) {
            int iO = O(i6) & 1048575;
            sun.misc.Unsafe unsafe = f38102n;
            long j6 = iO;
            java.lang.Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f38103a[i6] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.ads.Ew0 ew0R = R(i6);
            if (!B(obj, i10, i6)) {
                if (A(object)) {
                    java.lang.Object objD = ew0R.d();
                    ew0R.e(objD, object);
                    unsafe.putObject(obj, j6, objD);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                s(obj, i10, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j6);
            if (!A(object2)) {
                java.lang.Object objD2 = ew0R.d();
                ew0R.e(objD2, object2);
                unsafe.putObject(obj, j6, objD2);
                object2 = objD2;
            }
            ew0R.e(object2, object);
        }
    }

    private final void q(java.lang.Object obj, int i6, com.google.android.gms.internal.ads.InterfaceC5842yw0 interfaceC5842yw0) {
        java.lang.Object objT;
        long j6 = i6 & 1048575;
        if (w(i6)) {
            objT = interfaceC5842yw0.u();
        } else {
            objT = this.f38109g ? interfaceC5842yw0.t() : interfaceC5842yw0.q();
        }
        com.google.android.gms.internal.ads.Sw0.D(obj, j6, objT);
    }

    private final void r(java.lang.Object obj, int i6) {
        int iL = L(i6);
        long j6 = 1048575 & iL;
        if (j6 == 1048575) {
            return;
        }
        com.google.android.gms.internal.ads.Sw0.B(obj, j6, (1 << (iL >>> 20)) | com.google.android.gms.internal.ads.Sw0.l(obj, j6));
    }

    private final void s(java.lang.Object obj, int i6, int i10) {
        com.google.android.gms.internal.ads.Sw0.B(obj, L(i10) & 1048575, i6);
    }

    private final void t(java.lang.Object obj, int i6, java.lang.Object obj2) {
        f38102n.putObject(obj, O(i6) & 1048575, obj2);
        r(obj, i6);
    }

    private final void u(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        f38102n.putObject(obj, O(i10) & 1048575, obj2);
        s(obj, i6, i10);
    }

    private final boolean v(java.lang.Object obj, java.lang.Object obj2, int i6) {
        return x(obj, i6) == x(obj2, i6);
    }

    private static boolean w(int i6) {
        return (i6 & 536870912) != 0;
    }

    private final boolean x(java.lang.Object obj, int i6) {
        int iL = L(i6);
        long j6 = iL & 1048575;
        if (j6 != 1048575) {
            return (com.google.android.gms.internal.ads.Sw0.l(obj, j6) & (1 << (iL >>> 20))) != 0;
        }
        int iO = O(i6);
        long j10 = iO & 1048575;
        switch (N(iO)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.ads.Sw0.j(obj, j10)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.ads.Sw0.k(obj, j10)) != 0;
            case 2:
                return com.google.android.gms.internal.ads.Sw0.n(obj, j10) != 0;
            case 3:
                return com.google.android.gms.internal.ads.Sw0.n(obj, j10) != 0;
            case 4:
                return com.google.android.gms.internal.ads.Sw0.l(obj, j10) != 0;
            case 5:
                return com.google.android.gms.internal.ads.Sw0.n(obj, j10) != 0;
            case 6:
                return com.google.android.gms.internal.ads.Sw0.l(obj, j10) != 0;
            case 7:
                return com.google.android.gms.internal.ads.Sw0.H(obj, j10);
            case 8:
                java.lang.Object objP = com.google.android.gms.internal.ads.Sw0.p(obj, j10);
                if (objP instanceof java.lang.String) {
                    return !((java.lang.String) objP).isEmpty();
                }
                if (objP instanceof com.google.android.gms.internal.ads.AbstractC3753fv0) {
                    return !com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D.equals(objP);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.ads.Sw0.p(obj, j10) != null;
            case 10:
                return !com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D.equals(com.google.android.gms.internal.ads.Sw0.p(obj, j10));
            case 11:
                return com.google.android.gms.internal.ads.Sw0.l(obj, j10) != 0;
            case 12:
                return com.google.android.gms.internal.ads.Sw0.l(obj, j10) != 0;
            case 13:
                return com.google.android.gms.internal.ads.Sw0.l(obj, j10) != 0;
            case 14:
                return com.google.android.gms.internal.ads.Sw0.n(obj, j10) != 0;
            case 15:
                return com.google.android.gms.internal.ads.Sw0.l(obj, j10) != 0;
            case 16:
                return com.google.android.gms.internal.ads.Sw0.n(obj, j10) != 0;
            case 17:
                return com.google.android.gms.internal.ads.Sw0.p(obj, j10) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean y(java.lang.Object obj, int i6, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return x(obj, i6);
        }
        return (i11 & i12) != 0;
    }

    private static boolean z(java.lang.Object obj, int i6, com.google.android.gms.internal.ads.Ew0 ew0) {
        return ew0.i(com.google.android.gms.internal.ads.Sw0.p(obj, i6 & 1048575));
    }

    /* JADX WARN: Code duplicated, block: B:232:0x064d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0655  */
    /* JADX WARN: Code duplicated, block: B:236:0x065d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0660  */
    /* JADX WARN: Code duplicated, block: B:528:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:0x08d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x08ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x063c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x05c9 -> B:196:0x05a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x065d -> B:228:0x063c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:256:0x06a9 -> B:246:0x0680). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    final int E(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.Su0 r37) {
        /*
            Method dump skipped, instruction units count: 3376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4853pw0.E(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.Su0):int");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:25:0x0061 for B:17:0x0037 already processed. Defaulting to fallback option. */
    @Override // com.google.android.gms.internal.ads.Ew0
    public final void a(java.lang.Object obj) {
        if (A(obj)) {
            if (obj instanceof com.google.android.gms.internal.ads.Jv0) {
                com.google.android.gms.internal.ads.Jv0 jv0 = (com.google.android.gms.internal.ads.Jv0) obj;
                jv0.C();
                jv0.B();
                jv0.E();
            }
            int[] iArr = this.f38103a;
            for (int i6 = 0; i6 < iArr.length; i6 += 3) {
                int iO = O(i6);
                int i10 = 1048575 & iO;
                int iN = N(iO);
                long j6 = i10;
                if (iN != 9) {
                    if (iN != 60 && iN != 68) {
                        switch (iN) {
                            case 17:
                                if (x(obj, i6)) {
                                    R(i6).a(f38102n.getObject(obj, j6));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((com.google.android.gms.internal.ads.Sv0) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).b();
                                continue;
                            case 50:
                                sun.misc.Unsafe unsafe = f38102n;
                                java.lang.Object object = unsafe.getObject(obj, j6);
                                if (object != null) {
                                    ((com.google.android.gms.internal.ads.C3755fw0) object).c();
                                    unsafe.putObject(obj, j6, object);
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (B(obj, this.f38103a[i6], i6)) {
                        R(i6).a(f38102n.getObject(obj, j6));
                    }
                } else if (x(obj, i6)) {
                    R(i6).a(f38102n.getObject(obj, j6));
                }
            }
            this.f38113k.i(obj);
            if (this.f38108f) {
                this.f38114l.a(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01e7 A[PHI: r0
  0x01e7: PHI (r0v187 int) = 
  (r0v150 int)
  (r0v153 int)
  (r0v156 int)
  (r0v159 int)
  (r0v162 int)
  (r0v165 int)
  (r0v168 int)
  (r0v171 int)
  (r0v174 int)
  (r0v177 int)
  (r0v180 int)
  (r0v183 int)
  (r0v186 int)
  (r0v190 int)
 binds: [B:138:0x02a2, B:135:0x0294, B:132:0x0286, B:129:0x0278, B:126:0x026a, B:123:0x025d, B:120:0x0250, B:117:0x0243, B:114:0x0234, B:111:0x0227, B:108:0x021a, B:105:0x020d, B:102:0x0200, B:99:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:177:0x0393  */
    /* JADX WARN: Code duplicated, block: B:262:0x0637 A[PHI: r17
  0x0637: PHI (r17v11 int) = (r17v3 int), (r17v12 int) binds: [B:277:0x06bc, B:261:0x0635] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:265:0x0652 A[PHI: r17
  0x0652: PHI (r17v9 int) = (r17v2 int), (r17v10 int) binds: [B:280:0x06d0, B:264:0x0650] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x0691 A[PHI: r17
  0x0691: PHI (r17v5 int) = (r17v4 int), (r17v6 int) binds: [B:274:0x06a9, B:271:0x068f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (B(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(r15 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (B(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(r15 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (B(r21, r15, r12) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        r0 = r15 << 3;
        r1 = J(r21, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC5070rv0.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        if (B(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (B(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        if (B(r21, r15, r12) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:
    
        if (B(r21, r15, r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        r0 = r15 << 3;
        r1 = P(r21, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        if (B(r21, r15, r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (B(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        if (B(r21, r15, r12) != false) goto L36;
     */
    @Override // com.google.android.gms.internal.ads.Ew0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4853pw0.b(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3 A[PHI: r1 r2
  0x00f3: PHI (r1v12 int) = (r1v7 int), (r1v13 int) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r2v10 java.lang.Object) = (r2v7 java.lang.Object), (r2v11 java.lang.Object) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.Ew0
    public final int c(java.lang.Object obj) {
        int i6;
        double dJ;
        float fK;
        boolean zH;
        int i10;
        java.lang.Object objP;
        int iL;
        long jN;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f38103a.length; i12 += 3) {
            int iO = O(i12);
            int[] iArr = this.f38103a;
            int i13 = 1048575 & iO;
            int iN = N(iO);
            int i14 = iArr[i12];
            long j6 = i13;
            int iHashCode = 37;
            switch (iN) {
                case 0:
                    i6 = i11 * 53;
                    dJ = com.google.android.gms.internal.ads.Sw0.j(obj, j6);
                    jN = java.lang.Double.doubleToLongBits(dJ);
                    byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
                    iL = (int) (jN ^ (jN >>> 32));
                    i11 = i6 + iL;
                    break;
                case 1:
                    i6 = i11 * 53;
                    fK = com.google.android.gms.internal.ads.Sw0.k(obj, j6);
                    iL = java.lang.Float.floatToIntBits(fK);
                    i11 = i6 + iL;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i6 = i11 * 53;
                    jN = com.google.android.gms.internal.ads.Sw0.n(obj, j6);
                    byte[] bArr2 = com.google.android.gms.internal.ads.Tv0.f32042b;
                    iL = (int) (jN ^ (jN >>> 32));
                    i11 = i6 + iL;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i6 = i11 * 53;
                    iL = com.google.android.gms.internal.ads.Sw0.l(obj, j6);
                    i11 = i6 + iL;
                    break;
                case 7:
                    i6 = i11 * 53;
                    zH = com.google.android.gms.internal.ads.Sw0.H(obj, j6);
                    iL = com.google.android.gms.internal.ads.Tv0.a(zH);
                    i11 = i6 + iL;
                    break;
                case 8:
                    i6 = i11 * 53;
                    iL = ((java.lang.String) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).hashCode();
                    i11 = i6 + iL;
                    break;
                case 9:
                    i10 = i11 * 53;
                    objP = com.google.android.gms.internal.ads.Sw0.p(obj, j6);
                    if (objP != null) {
                        iHashCode = objP.hashCode();
                    }
                    i11 = i10 + iHashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i6 = i11 * 53;
                    iL = com.google.android.gms.internal.ads.Sw0.p(obj, j6).hashCode();
                    i11 = i6 + iL;
                    break;
                case 17:
                    i10 = i11 * 53;
                    objP = com.google.android.gms.internal.ads.Sw0.p(obj, j6);
                    if (objP != null) {
                        iHashCode = objP.hashCode();
                    }
                    i11 = i10 + iHashCode;
                    break;
                case 51:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        dJ = H(obj, j6);
                        jN = java.lang.Double.doubleToLongBits(dJ);
                        byte[] bArr3 = com.google.android.gms.internal.ads.Tv0.f32042b;
                        iL = (int) (jN ^ (jN >>> 32));
                        i11 = i6 + iL;
                    }
                    break;
                case 52:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        fK = I(obj, j6);
                        iL = java.lang.Float.floatToIntBits(fK);
                        i11 = i6 + iL;
                    }
                    break;
                case 53:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jN = P(obj, j6);
                        byte[] bArr4 = com.google.android.gms.internal.ads.Tv0.f32042b;
                        iL = (int) (jN ^ (jN >>> 32));
                        i11 = i6 + iL;
                    }
                    break;
                case 54:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jN = P(obj, j6);
                        byte[] bArr5 = com.google.android.gms.internal.ads.Tv0.f32042b;
                        iL = (int) (jN ^ (jN >>> 32));
                        i11 = i6 + iL;
                    }
                    break;
                case 55:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = J(obj, j6);
                        i11 = i6 + iL;
                    }
                    break;
                case 56:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jN = P(obj, j6);
                        byte[] bArr6 = com.google.android.gms.internal.ads.Tv0.f32042b;
                        iL = (int) (jN ^ (jN >>> 32));
                        i11 = i6 + iL;
                    }
                    break;
                case 57:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = J(obj, j6);
                        i11 = i6 + iL;
                    }
                    break;
                case 58:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        zH = C(obj, j6);
                        iL = com.google.android.gms.internal.ads.Tv0.a(zH);
                        i11 = i6 + iL;
                    }
                    break;
                case 59:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = ((java.lang.String) com.google.android.gms.internal.ads.Sw0.p(obj, j6)).hashCode();
                        i11 = i6 + iL;
                    }
                    break;
                case 60:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = com.google.android.gms.internal.ads.Sw0.p(obj, j6).hashCode();
                        i11 = i6 + iL;
                    }
                    break;
                case 61:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = com.google.android.gms.internal.ads.Sw0.p(obj, j6).hashCode();
                        i11 = i6 + iL;
                    }
                    break;
                case 62:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = J(obj, j6);
                        i11 = i6 + iL;
                    }
                    break;
                case 63:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = J(obj, j6);
                        i11 = i6 + iL;
                    }
                    break;
                case 64:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = J(obj, j6);
                        i11 = i6 + iL;
                    }
                    break;
                case 65:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jN = P(obj, j6);
                        byte[] bArr7 = com.google.android.gms.internal.ads.Tv0.f32042b;
                        iL = (int) (jN ^ (jN >>> 32));
                        i11 = i6 + iL;
                    }
                    break;
                case 66:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = J(obj, j6);
                        i11 = i6 + iL;
                    }
                    break;
                case 67:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jN = P(obj, j6);
                        byte[] bArr8 = com.google.android.gms.internal.ads.Tv0.f32042b;
                        iL = (int) (jN ^ (jN >>> 32));
                        i11 = i6 + iL;
                    }
                    break;
                case 68:
                    if (B(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iL = com.google.android.gms.internal.ads.Sw0.p(obj, j6).hashCode();
                        i11 = i6 + iL;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + ((com.google.android.gms.internal.ads.Jv0) obj).zzt.hashCode();
        if (!this.f38108f) {
            return iHashCode2;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final java.lang.Object d() {
        return ((com.google.android.gms.internal.ads.Jv0) this.f38107e).K();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    @Override // com.google.android.gms.internal.ads.Ew0
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        n(obj);
        obj2.getClass();
        for (int i6 = 0; i6 < this.f38103a.length; i6 += 3) {
            int iO = O(i6);
            int i10 = 1048575 & iO;
            int[] iArr = this.f38103a;
            int iN = N(iO);
            int i11 = iArr[i6];
            long j6 = i10;
            switch (iN) {
                case 0:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.z(obj, j6, com.google.android.gms.internal.ads.Sw0.j(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 1:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.A(obj, j6, com.google.android.gms.internal.ads.Sw0.k(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 2:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.C(obj, j6, com.google.android.gms.internal.ads.Sw0.n(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 3:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.C(obj, j6, com.google.android.gms.internal.ads.Sw0.n(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 4:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.B(obj, j6, com.google.android.gms.internal.ads.Sw0.l(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 5:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.C(obj, j6, com.google.android.gms.internal.ads.Sw0.n(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 6:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.B(obj, j6, com.google.android.gms.internal.ads.Sw0.l(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 7:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.x(obj, j6, com.google.android.gms.internal.ads.Sw0.H(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 8:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.D(obj, j6, com.google.android.gms.internal.ads.Sw0.p(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 9:
                case 17:
                    o(obj, obj2, i6);
                    break;
                case 10:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.D(obj, j6, com.google.android.gms.internal.ads.Sw0.p(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 11:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.B(obj, j6, com.google.android.gms.internal.ads.Sw0.l(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 12:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.B(obj, j6, com.google.android.gms.internal.ads.Sw0.l(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 13:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.B(obj, j6, com.google.android.gms.internal.ads.Sw0.l(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 14:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.C(obj, j6, com.google.android.gms.internal.ads.Sw0.n(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 15:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.B(obj, j6, com.google.android.gms.internal.ads.Sw0.l(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 16:
                    if (x(obj2, i6)) {
                        com.google.android.gms.internal.ads.Sw0.C(obj, j6, com.google.android.gms.internal.ads.Sw0.n(obj2, j6));
                        r(obj, i6);
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    com.google.android.gms.internal.ads.Sv0 sv0K = (com.google.android.gms.internal.ads.Sv0) com.google.android.gms.internal.ads.Sw0.p(obj, j6);
                    com.google.android.gms.internal.ads.Sv0 sv0 = (com.google.android.gms.internal.ads.Sv0) com.google.android.gms.internal.ads.Sw0.p(obj2, j6);
                    int size = sv0K.size();
                    int size2 = sv0.size();
                    if (size > 0 && size2 > 0) {
                        if (!sv0K.c()) {
                            sv0K = sv0K.k(size2 + size);
                        }
                        sv0K.addAll(sv0);
                    }
                    if (size > 0) {
                        sv0 = sv0K;
                    }
                    com.google.android.gms.internal.ads.Sw0.D(obj, j6, sv0);
                    break;
                case 50:
                    int i12 = com.google.android.gms.internal.ads.Gw0.f27921b;
                    com.google.android.gms.internal.ads.Sw0.D(obj, j6, com.google.android.gms.internal.ads.C3865gw0.b(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (B(obj2, i11, i6)) {
                        com.google.android.gms.internal.ads.Sw0.D(obj, j6, com.google.android.gms.internal.ads.Sw0.p(obj2, j6));
                        s(obj, i11, i6);
                    }
                    break;
                case 60:
                case 68:
                    p(obj, obj2, i6);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (B(obj2, i11, i6)) {
                        com.google.android.gms.internal.ads.Sw0.D(obj, j6, com.google.android.gms.internal.ads.Sw0.p(obj2, j6));
                        s(obj, i11, i6);
                    }
                    break;
            }
        }
        com.google.android.gms.internal.ads.Gw0.A(this.f38113k, obj, obj2);
        if (this.f38108f) {
            com.google.android.gms.internal.ads.Gw0.z(this.f38114l, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final boolean f(java.lang.Object obj, java.lang.Object obj2) {
        for (int i6 = 0; i6 < this.f38103a.length; i6 += 3) {
            int iO = O(i6);
            long j6 = iO & 1048575;
            switch (N(iO)) {
                case 0:
                    if (!v(obj, obj2, i6) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.Sw0.j(obj, j6)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.Sw0.j(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!v(obj, obj2, i6) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.Sw0.k(obj, j6)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.Sw0.k(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.n(obj, j6) != com.google.android.gms.internal.ads.Sw0.n(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.n(obj, j6) != com.google.android.gms.internal.ads.Sw0.n(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.l(obj, j6) != com.google.android.gms.internal.ads.Sw0.l(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.n(obj, j6) != com.google.android.gms.internal.ads.Sw0.n(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.l(obj, j6) != com.google.android.gms.internal.ads.Sw0.l(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.H(obj, j6) != com.google.android.gms.internal.ads.Sw0.H(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!v(obj, obj2, i6) || !com.google.android.gms.internal.ads.Gw0.j(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!v(obj, obj2, i6) || !com.google.android.gms.internal.ads.Gw0.j(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!v(obj, obj2, i6) || !com.google.android.gms.internal.ads.Gw0.j(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.l(obj, j6) != com.google.android.gms.internal.ads.Sw0.l(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.l(obj, j6) != com.google.android.gms.internal.ads.Sw0.l(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.l(obj, j6) != com.google.android.gms.internal.ads.Sw0.l(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.n(obj, j6) != com.google.android.gms.internal.ads.Sw0.n(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.l(obj, j6) != com.google.android.gms.internal.ads.Sw0.l(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!v(obj, obj2, i6) || com.google.android.gms.internal.ads.Sw0.n(obj, j6) != com.google.android.gms.internal.ads.Sw0.n(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!v(obj, obj2, i6) || !com.google.android.gms.internal.ads.Gw0.j(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!com.google.android.gms.internal.ads.Gw0.j(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jL = L(i6) & 1048575;
                    if (com.google.android.gms.internal.ads.Sw0.l(obj, jL) != com.google.android.gms.internal.ads.Sw0.l(obj2, jL) || !com.google.android.gms.internal.ads.Gw0.j(com.google.android.gms.internal.ads.Sw0.p(obj, j6), com.google.android.gms.internal.ads.Sw0.p(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!((com.google.android.gms.internal.ads.Jv0) obj).zzt.equals(((com.google.android.gms.internal.ads.Jv0) obj2).zzt)) {
            return false;
        }
        if (!this.f38108f) {
            return true;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void g(java.lang.Object obj, com.google.android.gms.internal.ads.Yw0 yw0) {
        int i6;
        int i10;
        int i11;
        double dJ;
        float fK;
        long jP;
        long jP2;
        int iJ;
        long jP3;
        int iJ2;
        boolean zH;
        java.lang.Object object;
        java.lang.Object object2;
        java.lang.Object object3;
        int iJ3;
        int iJ4;
        int iJ5;
        long jP4;
        int iJ6;
        long jP5;
        java.lang.Object object4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        java.util.List list;
        if (this.f38108f) {
            androidx.appcompat.app.D.a(obj);
            throw null;
        }
        int[] iArr = this.f38103a;
        sun.misc.Unsafe unsafe = f38102n;
        int i20 = 1048575;
        int i21 = 1048575;
        int i22 = 0;
        int i23 = 0;
        while (i23 < iArr.length) {
            int iO = O(i23);
            int[] iArr2 = this.f38103a;
            int iN = N(iO);
            int i24 = iArr2[i23];
            boolean z6 = true;
            if (iN <= 17) {
                int i25 = iArr2[i23 + 2];
                int i26 = i25 & i20;
                if (i26 != i21) {
                    i22 = i26 == i20 ? 0 : unsafe.getInt(obj, i26);
                    i21 = i26;
                }
                i6 = i21;
                i10 = i22;
                i11 = 1 << (i25 >>> 20);
            } else {
                i6 = i21;
                i10 = i22;
                i11 = 0;
            }
            long j6 = iO & i20;
            switch (iN) {
                case 0:
                    if (y(obj, i23, i6, i10, i11)) {
                        dJ = com.google.android.gms.internal.ads.Sw0.j(obj, j6);
                        yw0.v(i24, dJ);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 1:
                    if (y(obj, i23, i6, i10, i11)) {
                        fK = com.google.android.gms.internal.ads.Sw0.k(obj, j6);
                        yw0.y(i24, fK);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 2:
                    if (y(obj, i23, i6, i10, i11)) {
                        jP = unsafe.getLong(obj, j6);
                        yw0.o(i24, jP);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 3:
                    if (y(obj, i23, i6, i10, i11)) {
                        jP2 = unsafe.getLong(obj, j6);
                        yw0.G(i24, jP2);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 4:
                    if (y(obj, i23, i6, i10, i11)) {
                        iJ = unsafe.getInt(obj, j6);
                        yw0.f(i24, iJ);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 5:
                    if (y(obj, i23, i6, i10, i11)) {
                        jP3 = unsafe.getLong(obj, j6);
                        yw0.E(i24, jP3);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 6:
                    if (y(obj, i23, i6, i10, i11)) {
                        iJ2 = unsafe.getInt(obj, j6);
                        yw0.m(i24, iJ2);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 7:
                    if (y(obj, i23, i6, i10, i11)) {
                        zH = com.google.android.gms.internal.ads.Sw0.H(obj, j6);
                        yw0.n(i24, zH);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 8:
                    if (y(obj, i23, i6, i10, i11)) {
                        object = unsafe.getObject(obj, j6);
                        D(i24, object, yw0);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 9:
                    if (y(obj, i23, i6, i10, i11)) {
                        object2 = unsafe.getObject(obj, j6);
                        yw0.I(i24, object2, R(i23));
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 10:
                    if (y(obj, i23, i6, i10, i11)) {
                        object3 = unsafe.getObject(obj, j6);
                        yw0.J(i24, (com.google.android.gms.internal.ads.AbstractC3753fv0) object3);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 11:
                    if (y(obj, i23, i6, i10, i11)) {
                        iJ3 = unsafe.getInt(obj, j6);
                        yw0.k(i24, iJ3);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 12:
                    if (y(obj, i23, i6, i10, i11)) {
                        iJ4 = unsafe.getInt(obj, j6);
                        yw0.t(i24, iJ4);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 13:
                    if (y(obj, i23, i6, i10, i11)) {
                        iJ5 = unsafe.getInt(obj, j6);
                        yw0.A(i24, iJ5);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 14:
                    if (y(obj, i23, i6, i10, i11)) {
                        jP4 = unsafe.getLong(obj, j6);
                        yw0.s(i24, jP4);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 15:
                    if (y(obj, i23, i6, i10, i11)) {
                        iJ6 = unsafe.getInt(obj, j6);
                        yw0.D(i24, iJ6);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 16:
                    if (y(obj, i23, i6, i10, i11)) {
                        jP5 = unsafe.getLong(obj, j6);
                        yw0.w(i24, jP5);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 17:
                    if (y(obj, i23, i6, i10, i11)) {
                        object4 = unsafe.getObject(obj, j6);
                        yw0.K(i24, object4, R(i23));
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 18:
                    z6 = false;
                    i12 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.D(i12, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 19:
                    z6 = false;
                    i13 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.H(i13, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 20:
                    z6 = false;
                    i14 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.a(i14, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    z6 = false;
                    i15 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.i(i15, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 22:
                    z6 = false;
                    i16 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.J(i16, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 23:
                    z6 = false;
                    i17 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.G(i17, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 24:
                    z6 = false;
                    i18 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.F(i18, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 25:
                    i19 = this.f38103a[i23];
                    list = (java.util.List) unsafe.getObject(obj, j6);
                    z6 = false;
                    com.google.android.gms.internal.ads.Gw0.B(i19, list, yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 26:
                    com.google.android.gms.internal.ads.Gw0.g(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 27:
                    com.google.android.gms.internal.ads.Gw0.b(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, R(i23));
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 28:
                    com.google.android.gms.internal.ads.Gw0.C(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 29:
                    com.google.android.gms.internal.ads.Gw0.h(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, false);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 30:
                    com.google.android.gms.internal.ads.Gw0.E(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, false);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 31:
                    com.google.android.gms.internal.ads.Gw0.c(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, false);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 32:
                    com.google.android.gms.internal.ads.Gw0.d(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, false);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    com.google.android.gms.internal.ads.Gw0.e(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, false);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 34:
                    com.google.android.gms.internal.ads.Gw0.f(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, false);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 35:
                    i12 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.D(i12, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 36:
                    i13 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.H(i13, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 37:
                    i14 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.a(i14, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 38:
                    i15 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.i(i15, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 39:
                    i16 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.J(i16, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 40:
                    i17 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.G(i17, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 41:
                    i18 = this.f38103a[i23];
                    com.google.android.gms.internal.ads.Gw0.F(i18, (java.util.List) unsafe.getObject(obj, j6), yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 42:
                    i19 = this.f38103a[i23];
                    list = (java.util.List) unsafe.getObject(obj, j6);
                    com.google.android.gms.internal.ads.Gw0.B(i19, list, yw0, z6);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 43:
                    com.google.android.gms.internal.ads.Gw0.h(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, true);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 44:
                    com.google.android.gms.internal.ads.Gw0.E(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, true);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 45:
                    com.google.android.gms.internal.ads.Gw0.c(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, true);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 46:
                    com.google.android.gms.internal.ads.Gw0.d(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, true);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 47:
                    com.google.android.gms.internal.ads.Gw0.e(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, true);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 48:
                    com.google.android.gms.internal.ads.Gw0.f(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, true);
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 49:
                    com.google.android.gms.internal.ads.Gw0.I(this.f38103a[i23], (java.util.List) unsafe.getObject(obj, j6), yw0, R(i23));
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j6) != null) {
                        androidx.appcompat.app.D.a(T(i23));
                        throw null;
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                    break;
                case 51:
                    if (B(obj, i24, i23)) {
                        dJ = H(obj, j6);
                        yw0.v(i24, dJ);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 52:
                    if (B(obj, i24, i23)) {
                        fK = I(obj, j6);
                        yw0.y(i24, fK);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 53:
                    if (B(obj, i24, i23)) {
                        jP = P(obj, j6);
                        yw0.o(i24, jP);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 54:
                    if (B(obj, i24, i23)) {
                        jP2 = P(obj, j6);
                        yw0.G(i24, jP2);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 55:
                    if (B(obj, i24, i23)) {
                        iJ = J(obj, j6);
                        yw0.f(i24, iJ);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 56:
                    if (B(obj, i24, i23)) {
                        jP3 = P(obj, j6);
                        yw0.E(i24, jP3);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 57:
                    if (B(obj, i24, i23)) {
                        iJ2 = J(obj, j6);
                        yw0.m(i24, iJ2);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 58:
                    if (B(obj, i24, i23)) {
                        zH = C(obj, j6);
                        yw0.n(i24, zH);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 59:
                    if (B(obj, i24, i23)) {
                        object = unsafe.getObject(obj, j6);
                        D(i24, object, yw0);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 60:
                    if (B(obj, i24, i23)) {
                        object2 = unsafe.getObject(obj, j6);
                        yw0.I(i24, object2, R(i23));
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 61:
                    if (B(obj, i24, i23)) {
                        object3 = unsafe.getObject(obj, j6);
                        yw0.J(i24, (com.google.android.gms.internal.ads.AbstractC3753fv0) object3);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 62:
                    if (B(obj, i24, i23)) {
                        iJ3 = J(obj, j6);
                        yw0.k(i24, iJ3);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 63:
                    if (B(obj, i24, i23)) {
                        iJ4 = J(obj, j6);
                        yw0.t(i24, iJ4);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 64:
                    if (B(obj, i24, i23)) {
                        iJ5 = J(obj, j6);
                        yw0.A(i24, iJ5);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 65:
                    if (B(obj, i24, i23)) {
                        jP4 = P(obj, j6);
                        yw0.s(i24, jP4);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 66:
                    if (B(obj, i24, i23)) {
                        iJ6 = J(obj, j6);
                        yw0.D(i24, iJ6);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 67:
                    if (B(obj, i24, i23)) {
                        jP5 = P(obj, j6);
                        yw0.w(i24, jP5);
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                case 68:
                    if (B(obj, i24, i23)) {
                        object4 = unsafe.getObject(obj, j6);
                        yw0.K(i24, object4, R(i23));
                    }
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
                default:
                    i23 += 3;
                    i21 = i6;
                    i22 = i10;
                    i20 = 1048575;
                    break;
            }
        }
        ((com.google.android.gms.internal.ads.Jv0) obj).zzt.k(yw0);
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void h(java.lang.Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.Su0 su0) {
        E(obj, bArr, i6, i10, 0, su0);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[LOOP:1: B:45:0x00b3->B:50:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Ew0
    public final boolean i(java.lang.Object obj) {
        int i6;
        int i10;
        java.util.List list;
        com.google.android.gms.internal.ads.Ew0 ew0R;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f38111i) {
            int[] iArr = this.f38110h;
            int[] iArr2 = this.f38103a;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int iO = O(i15);
            int i17 = this.f38103a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f38102n.getInt(obj, i18);
                }
                i10 = i12;
                i6 = i18;
            } else {
                i6 = i14;
                i10 = i12;
            }
            if ((268435456 & iO) != 0 && !y(obj, i15, i6, i10, i19)) {
                return false;
            }
            int iN = N(iO);
            if (iN == 9 || iN == 17) {
                if (y(obj, i15, i6, i10, i19) && !z(obj, iO, R(i15))) {
                    return false;
                }
            } else if (iN == 27) {
                list = (java.util.List) com.google.android.gms.internal.ads.Sw0.p(obj, iO & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ew0R = R(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!ew0R.i(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iN == 60 || iN == 68) {
                if (B(obj, i16, i15) && !z(obj, iO, R(i15))) {
                    return false;
                }
            } else if (iN == 49) {
                list = (java.util.List) com.google.android.gms.internal.ads.Sw0.p(obj, iO & 1048575);
                if (list.isEmpty()) {
                    ew0R = R(i15);
                    while (i11 < list.size()) {
                        if (!ew0R.i(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iN == 50 && !((com.google.android.gms.internal.ads.C3755fw0) com.google.android.gms.internal.ads.Sw0.p(obj, iO & 1048575)).isEmpty()) {
                androidx.appcompat.app.D.a(T(i15));
                throw null;
            }
            i13++;
            i14 = i6;
            i12 = i10;
        }
        if (!this.f38108f) {
            return true;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0461  */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Ew0
    public final void j(java.lang.Object obj, com.google.android.gms.internal.ads.InterfaceC5842yw0 interfaceC5842yw0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0;
        int iD;
        java.util.List listA;
        java.util.List listA2;
        java.util.List listA3;
        java.util.List listA4;
        java.util.List listA5;
        java.util.List listA6;
        java.util.List listA7;
        java.util.List listA8;
        java.util.List listA9;
        java.util.List listA10;
        com.google.android.gms.internal.ads.Nv0 nv0Q;
        java.util.List listA11;
        java.util.List listA12;
        java.util.List listA13;
        java.util.List listA14;
        com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw1;
        c5730xv0.getClass();
        n(obj);
        com.google.android.gms.internal.ads.Lw0 lw0 = this.f38113k;
        java.lang.Object objA = null;
        while (true) {
            try {
                int iC = interfaceC5842yw0.c();
                int iK = K(iC);
                if (iK >= 0) {
                    int iO = O(iK);
                    try {
                        switch (N(iO)) {
                            case 0:
                                com.google.android.gms.internal.ads.Sw0.z(obj, iO & 1048575, interfaceC5842yw0.a());
                                r(obj, iK);
                                break;
                            case 1:
                                com.google.android.gms.internal.ads.Sw0.A(obj, iO & 1048575, interfaceC5842yw0.b());
                                r(obj, iK);
                                break;
                            case 2:
                                com.google.android.gms.internal.ads.Sw0.C(obj, iO & 1048575, interfaceC5842yw0.l());
                                r(obj, iK);
                                break;
                            case 3:
                                com.google.android.gms.internal.ads.Sw0.C(obj, iO & 1048575, interfaceC5842yw0.p());
                                r(obj, iK);
                                break;
                            case 4:
                                com.google.android.gms.internal.ads.Sw0.B(obj, iO & 1048575, interfaceC5842yw0.i());
                                r(obj, iK);
                                break;
                            case 5:
                                com.google.android.gms.internal.ads.Sw0.C(obj, iO & 1048575, interfaceC5842yw0.k());
                                r(obj, iK);
                                break;
                            case 6:
                                com.google.android.gms.internal.ads.Sw0.B(obj, iO & 1048575, interfaceC5842yw0.e());
                                r(obj, iK);
                                break;
                            case 7:
                                com.google.android.gms.internal.ads.Sw0.x(obj, iO & 1048575, interfaceC5842yw0.M());
                                r(obj, iK);
                                break;
                            case 8:
                                q(obj, iO, interfaceC5842yw0);
                                r(obj, iK);
                                break;
                            case 9:
                                interfaceC4523mw0 = (com.google.android.gms.internal.ads.InterfaceC4523mw0) k(obj, iK);
                                interfaceC5842yw0.v(interfaceC4523mw0, R(iK), c5730xv0);
                                t(obj, iK, interfaceC4523mw0);
                                break;
                            case 10:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, interfaceC5842yw0.q());
                                r(obj, iK);
                                break;
                            case 11:
                                com.google.android.gms.internal.ads.Sw0.B(obj, iO & 1048575, interfaceC5842yw0.j());
                                r(obj, iK);
                                break;
                            case 12:
                                iD = interfaceC5842yw0.d();
                                com.google.android.gms.internal.ads.Nv0 nv0Q2 = Q(iK);
                                if (nv0Q2 == null || nv0Q2.r(iD)) {
                                    com.google.android.gms.internal.ads.Sw0.B(obj, iO & 1048575, iD);
                                    r(obj, iK);
                                } else {
                                    objA = com.google.android.gms.internal.ads.Gw0.y(obj, iC, iD, objA, lw0);
                                }
                                break;
                            case 13:
                                com.google.android.gms.internal.ads.Sw0.B(obj, iO & 1048575, interfaceC5842yw0.g());
                                r(obj, iK);
                                break;
                            case 14:
                                com.google.android.gms.internal.ads.Sw0.C(obj, iO & 1048575, interfaceC5842yw0.m());
                                r(obj, iK);
                                break;
                            case 15:
                                com.google.android.gms.internal.ads.Sw0.B(obj, iO & 1048575, interfaceC5842yw0.h());
                                r(obj, iK);
                                break;
                            case 16:
                                com.google.android.gms.internal.ads.Sw0.C(obj, iO & 1048575, interfaceC5842yw0.n());
                                r(obj, iK);
                                break;
                            case 17:
                                interfaceC4523mw0 = (com.google.android.gms.internal.ads.InterfaceC4523mw0) k(obj, iK);
                                interfaceC5842yw0.z(interfaceC4523mw0, R(iK), c5730xv0);
                                t(obj, iK, interfaceC4523mw0);
                                break;
                            case 18:
                                listA = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.w(listA);
                                break;
                            case 19:
                                listA2 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.K(listA2);
                                break;
                            case 20:
                                listA3 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.r(listA3);
                                break;
                            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                listA4 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.s(listA4);
                                break;
                            case 22:
                                listA5 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.y(listA5);
                                break;
                            case 23:
                                listA6 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.E(listA6);
                                break;
                            case 24:
                                listA7 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.C(listA7);
                                break;
                            case 25:
                                listA8 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.I(listA8);
                                break;
                            case 26:
                                if (w(iO)) {
                                    ((com.google.android.gms.internal.ads.C4411lv0) interfaceC5842yw0).L(com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575), true);
                                } else {
                                    ((com.google.android.gms.internal.ads.C4411lv0) interfaceC5842yw0).L(com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575), false);
                                }
                                break;
                            case 27:
                                interfaceC5842yw0.J(com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575), R(iK), c5730xv0);
                                break;
                            case 28:
                                interfaceC5842yw0.x(com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575));
                                break;
                            case 29:
                                listA9 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.H(listA9);
                                break;
                            case 30:
                                listA10 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.o(listA10);
                                nv0Q = Q(iK);
                                objA = com.google.android.gms.internal.ads.Gw0.x(obj, iC, listA10, nv0Q, objA, lw0);
                                break;
                            case 31:
                                listA11 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.B(listA11);
                                break;
                            case 32:
                                listA12 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.A(listA12);
                                break;
                            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                listA13 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.G(listA13);
                                break;
                            case 34:
                                listA14 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.D(listA14);
                                break;
                            case 35:
                                listA = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.w(listA);
                                break;
                            case 36:
                                listA2 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.K(listA2);
                                break;
                            case 37:
                                listA3 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.r(listA3);
                                break;
                            case 38:
                                listA4 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.s(listA4);
                                break;
                            case 39:
                                listA5 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.y(listA5);
                                break;
                            case 40:
                                listA6 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.E(listA6);
                                break;
                            case 41:
                                listA7 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.C(listA7);
                                break;
                            case 42:
                                listA8 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.I(listA8);
                                break;
                            case 43:
                                listA9 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.H(listA9);
                                break;
                            case 44:
                                listA10 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.o(listA10);
                                nv0Q = Q(iK);
                                objA = com.google.android.gms.internal.ads.Gw0.x(obj, iC, listA10, nv0Q, objA, lw0);
                                break;
                            case 45:
                                listA11 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.B(listA11);
                                break;
                            case 46:
                                listA12 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.A(listA12);
                                break;
                            case 47:
                                listA13 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.G(listA13);
                                break;
                            case 48:
                                listA14 = com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575);
                                interfaceC5842yw0.D(listA14);
                                break;
                            case 49:
                                interfaceC5842yw0.F(com.google.android.gms.internal.ads.Zv0.a(obj, iO & 1048575), R(iK), c5730xv0);
                                break;
                            case 50:
                                java.lang.Object objT = T(iK);
                                long jO = O(iK) & 1048575;
                                java.lang.Object objP = com.google.android.gms.internal.ads.Sw0.p(obj, jO);
                                if (objP == null) {
                                    objP = com.google.android.gms.internal.ads.C3755fw0.a().b();
                                    com.google.android.gms.internal.ads.Sw0.D(obj, jO, objP);
                                } else if (com.google.android.gms.internal.ads.C3865gw0.a(objP)) {
                                    java.lang.Object objB = com.google.android.gms.internal.ads.C3755fw0.a().b();
                                    com.google.android.gms.internal.ads.C3865gw0.b(objB, objP);
                                    com.google.android.gms.internal.ads.Sw0.D(obj, jO, objB);
                                    objP = objB;
                                }
                                androidx.appcompat.app.D.a(objT);
                                throw null;
                            case 51:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Double.valueOf(interfaceC5842yw0.a()));
                                s(obj, iC, iK);
                                break;
                            case 52:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Float.valueOf(interfaceC5842yw0.b()));
                                s(obj, iC, iK);
                                break;
                            case 53:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Long.valueOf(interfaceC5842yw0.l()));
                                s(obj, iC, iK);
                                break;
                            case 54:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Long.valueOf(interfaceC5842yw0.p()));
                                s(obj, iC, iK);
                                break;
                            case 55:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Integer.valueOf(interfaceC5842yw0.i()));
                                s(obj, iC, iK);
                                break;
                            case 56:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Long.valueOf(interfaceC5842yw0.k()));
                                s(obj, iC, iK);
                                break;
                            case 57:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Integer.valueOf(interfaceC5842yw0.e()));
                                s(obj, iC, iK);
                                break;
                            case 58:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Boolean.valueOf(interfaceC5842yw0.M()));
                                s(obj, iC, iK);
                                break;
                            case 59:
                                q(obj, iO, interfaceC5842yw0);
                                s(obj, iC, iK);
                                break;
                            case 60:
                                interfaceC4523mw1 = (com.google.android.gms.internal.ads.InterfaceC4523mw0) l(obj, iC, iK);
                                interfaceC5842yw0.v(interfaceC4523mw1, R(iK), c5730xv0);
                                u(obj, iC, iK, interfaceC4523mw1);
                                break;
                            case 61:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, interfaceC5842yw0.q());
                                s(obj, iC, iK);
                                break;
                            case 62:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Integer.valueOf(interfaceC5842yw0.j()));
                                s(obj, iC, iK);
                                break;
                            case 63:
                                iD = interfaceC5842yw0.d();
                                com.google.android.gms.internal.ads.Nv0 nv0Q3 = Q(iK);
                                if (nv0Q3 != null && !nv0Q3.r(iD)) {
                                    objA = com.google.android.gms.internal.ads.Gw0.y(obj, iC, iD, objA, lw0);
                                }
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Integer.valueOf(iD));
                                s(obj, iC, iK);
                                break;
                            case 64:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Integer.valueOf(interfaceC5842yw0.g()));
                                s(obj, iC, iK);
                                break;
                            case 65:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Long.valueOf(interfaceC5842yw0.m()));
                                s(obj, iC, iK);
                                break;
                            case 66:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Integer.valueOf(interfaceC5842yw0.h()));
                                s(obj, iC, iK);
                                break;
                            case 67:
                                com.google.android.gms.internal.ads.Sw0.D(obj, iO & 1048575, java.lang.Long.valueOf(interfaceC5842yw0.n()));
                                s(obj, iC, iK);
                                break;
                            case 68:
                                interfaceC4523mw1 = (com.google.android.gms.internal.ads.InterfaceC4523mw0) l(obj, iC, iK);
                                interfaceC5842yw0.z(interfaceC4523mw1, R(iK), c5730xv0);
                                u(obj, iC, iK, interfaceC4523mw1);
                                break;
                            default:
                                if (objA == null) {
                                    objA = lw0.a(obj);
                                }
                                if (!lw0.k(objA, interfaceC5842yw0, 0)) {
                                    for (int i6 = this.f38111i; i6 < this.f38112j; i6++) {
                                        S(obj, this.f38110h[i6], objA, lw0, obj);
                                    }
                                }
                                break;
                        }
                    } catch (com.google.android.gms.internal.ads.Uv0 unused) {
                        if (objA == null) {
                            objA = lw0.a(obj);
                        }
                        if (!lw0.k(objA, interfaceC5842yw0, 0)) {
                            for (int i10 = this.f38111i; i10 < this.f38112j; i10++) {
                                S(obj, this.f38110h[i10], objA, lw0, obj);
                            }
                            if (objA != null) {
                                lw0.j(obj, objA);
                            }
                        }
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    for (int i11 = this.f38111i; i11 < this.f38112j; i11++) {
                        S(obj, this.f38110h[i11], objA, lw0, obj);
                    }
                } else {
                    if (this.f38108f) {
                        c5730xv0.c(this.f38107e, iC);
                    }
                    if (objA == null) {
                        objA = lw0.a(obj);
                    }
                    if (!lw0.k(objA, interfaceC5842yw0, 0)) {
                        for (int i12 = this.f38111i; i12 < this.f38112j; i12++) {
                            S(obj, this.f38110h[i12], objA, lw0, obj);
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                for (int i13 = this.f38111i; i13 < this.f38112j; i13++) {
                    S(obj, this.f38110h[i13], objA, lw0, obj);
                }
                if (objA != null) {
                    lw0.j(obj, objA);
                }
                throw th;
            }
        }
        if (objA != null) {
            lw0.j(obj, objA);
        }
    }
}
