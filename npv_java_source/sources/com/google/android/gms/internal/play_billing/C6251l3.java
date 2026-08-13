package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6251l3 implements com.google.android.gms.internal.play_billing.InterfaceC6298t3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f41575l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final sun.misc.Unsafe f41576m = com.google.android.gms.internal.play_billing.G3.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f41577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object[] f41578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.InterfaceC6233i3 f41581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f41582f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f41583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.AbstractC6333z3 f41586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.B2 f41587k;

    private C6251l3(int[] iArr, java.lang.Object[] objArr, int i6, int i10, com.google.android.gms.internal.play_billing.InterfaceC6233i3 interfaceC6233i3, boolean z6, int[] iArr2, int i11, int i12, com.google.android.gms.internal.play_billing.C6263n3 c6263n3, com.google.android.gms.internal.play_billing.V2 v6, com.google.android.gms.internal.play_billing.AbstractC6333z3 abstractC6333z3, com.google.android.gms.internal.play_billing.B2 b6, com.google.android.gms.internal.play_billing.C6203d3 c6203d3) {
        this.f41577a = iArr;
        this.f41578b = objArr;
        this.f41579c = i6;
        this.f41580d = i10;
        this.f41583g = iArr2;
        this.f41584h = i11;
        this.f41585i = i12;
        this.f41586j = abstractC6333z3;
        this.f41587k = b6;
        this.f41581e = interfaceC6233i3;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:170:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x0396  */
    /* JADX WARN: Code duplicated, block: B:188:0x039f  */
    static com.google.android.gms.internal.play_billing.C6251l3 A(java.lang.Class cls, com.google.android.gms.internal.play_billing.InterfaceC6215f3 interfaceC6215f3, com.google.android.gms.internal.play_billing.C6263n3 c6263n3, com.google.android.gms.internal.play_billing.V2 v6, com.google.android.gms.internal.play_billing.AbstractC6333z3 abstractC6333z3, com.google.android.gms.internal.play_billing.B2 b6, com.google.android.gms.internal.play_billing.C6203d3 c6203d3) {
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
        java.lang.reflect.Field fieldO;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        java.lang.Object obj;
        java.lang.reflect.Field fieldO2;
        int i36;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldO3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(interfaceC6215f3 instanceof com.google.android.gms.internal.play_billing.C6292s3)) {
            androidx.appcompat.app.D.a(interfaceC6215f3);
            throw null;
        }
        com.google.android.gms.internal.play_billing.C6292s3 c6292s3 = (com.google.android.gms.internal.play_billing.C6292s3) interfaceC6215f3;
        java.lang.String strD = c6292s3.d();
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
            iArr = f41575l;
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
        sun.misc.Unsafe unsafe = f41576m;
        java.lang.Object[] objArrE = c6292s3.e();
        java.lang.Class<?> cls2 = c6292s3.a().getClass();
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
                        if (c6292s3.c() == 1 || i86 != 0) {
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
                        fieldO2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldO2 = O(cls2, (java.lang.String) obj);
                        objArrE[i35] = fieldO2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                    i36 = i35 + 1;
                    obj2 = objArrE[i36];
                    int i96 = i86;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldO3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldO3 = O(cls2, (java.lang.String) obj2);
                        objArrE[i36] = fieldO3;
                    }
                    i26 = i12;
                    i27 = i93;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    i28 = 0;
                    strD = strD;
                    c6292s3 = c6292s3;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i29 = i96;
                }
                i12 = i34;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrE[i35];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldO2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldO2 = O(cls2, (java.lang.String) obj);
                    objArrE[i35] = fieldO2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO2);
                i36 = i35 + 1;
                obj2 = objArrE[i36];
                int i97 = i86;
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldO3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldO3 = O(cls2, (java.lang.String) obj2);
                    objArrE[i36] = fieldO3;
                }
                i26 = i12;
                i27 = i93;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                i28 = 0;
                strD = strD;
                c6292s3 = c6292s3;
                iObjectFieldOffset = iObjectFieldOffset4;
                i29 = i97;
            } else {
                i25 = i10;
                i26 = i12 + 1;
                java.lang.reflect.Field fieldO4 = O(cls2, (java.lang.String) objArrE[i12]);
                if (i84 == 9 || i84 == 17) {
                    int i98 = i75 / 3;
                    objArr[i98 + i98 + 1] = fieldO4.getType();
                } else {
                    if (i84 != 27) {
                        if (i84 == 49) {
                            i32 = i12 + 2;
                            i31 = 1;
                        } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                            c6292s3 = c6292s3;
                            if (c6292s3.c() == 1 || i86 != 0) {
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
                                c6292s3 = c6292s3;
                            } else {
                                i26 = i100;
                                i72 = i101;
                                i86 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
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
                                fieldO = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldO = O(cls2, (java.lang.String) obj3);
                                objArrE[i107] = fieldO;
                            }
                            i28 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
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
            c6292s3 = c6292s3;
            i42 = i27;
            i10 = i25;
            c6 = 55296;
        }
        return new com.google.android.gms.internal.play_billing.C6251l3(iArr3, objArr, i10, i13, c6292s3.a(), false, iArr, i11, i70, c6263n3, v6, abstractC6333z3, b6, c6203d3);
    }

    private static double B(java.lang.Object obj, long j6) {
        return ((java.lang.Double) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).doubleValue();
    }

    private static float C(java.lang.Object obj, long j6) {
        return ((java.lang.Float) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).floatValue();
    }

    private static int D(java.lang.Object obj, long j6) {
        return ((java.lang.Integer) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).intValue();
    }

    private final int E(int i6) {
        return this.f41577a[i6 + 2];
    }

    private final int F(int i6, int i10) {
        int length = (this.f41577a.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.f41577a[i12];
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

    private static int G(int i6) {
        return (i6 >>> 20) & 255;
    }

    private final int H(int i6) {
        return this.f41577a[i6 + 1];
    }

    private static long I(java.lang.Object obj, long j6) {
        return ((java.lang.Long) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).longValue();
    }

    private final com.google.android.gms.internal.play_billing.N2 J(int i6) {
        int i10 = i6 / 3;
        return (com.google.android.gms.internal.play_billing.N2) this.f41578b[i10 + i10 + 1];
    }

    private final com.google.android.gms.internal.play_billing.InterfaceC6298t3 K(int i6) {
        java.lang.Object[] objArr = this.f41578b;
        int i10 = i6 / 3;
        int i11 = i10 + i10;
        com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3 = (com.google.android.gms.internal.play_billing.InterfaceC6298t3) objArr[i11];
        if (interfaceC6298t3 != null) {
            return interfaceC6298t3;
        }
        com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3B = com.google.android.gms.internal.play_billing.C6281q3.a().b((java.lang.Class) objArr[i11 + 1]);
        this.f41578b[i11] = interfaceC6298t3B;
        return interfaceC6298t3B;
    }

    private final java.lang.Object L(int i6) {
        int i10 = i6 / 3;
        return this.f41578b[i10 + i10];
    }

    private final java.lang.Object M(java.lang.Object obj, int i6) {
        com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K = K(i6);
        int iH = H(i6) & 1048575;
        if (!r(obj, i6)) {
            return interfaceC6298t3K.d();
        }
        java.lang.Object object = f41576m.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        java.lang.Object objD = interfaceC6298t3K.d();
        if (object != null) {
            interfaceC6298t3K.e(objD, object);
        }
        return objD;
    }

    private final java.lang.Object N(java.lang.Object obj, int i6, int i10) {
        com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K = K(i10);
        if (!v(obj, i6, i10)) {
            return interfaceC6298t3K.d();
        }
        java.lang.Object object = f41576m.getObject(obj, H(i10) & 1048575);
        if (u(object)) {
            return object;
        }
        java.lang.Object objD = interfaceC6298t3K.d();
        if (object != null) {
            interfaceC6298t3K.e(objD, object);
        }
        return objD;
    }

    private static java.lang.reflect.Field O(java.lang.Class cls, java.lang.String str) {
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

    private static void j(java.lang.Object obj) {
        if (!u(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
        }
    }

    private final void k(java.lang.Object obj, java.lang.Object obj2, int i6) {
        if (r(obj2, i6)) {
            int iH = H(i6) & 1048575;
            sun.misc.Unsafe unsafe = f41576m;
            long j6 = iH;
            java.lang.Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f41577a[i6] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K = K(i6);
            if (!r(obj, i6)) {
                if (u(object)) {
                    java.lang.Object objD = interfaceC6298t3K.d();
                    interfaceC6298t3K.e(objD, object);
                    unsafe.putObject(obj, j6, objD);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                m(obj, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j6);
            if (!u(object2)) {
                java.lang.Object objD2 = interfaceC6298t3K.d();
                interfaceC6298t3K.e(objD2, object2);
                unsafe.putObject(obj, j6, objD2);
                object2 = objD2;
            }
            interfaceC6298t3K.e(object2, object);
        }
    }

    private final void l(java.lang.Object obj, java.lang.Object obj2, int i6) {
        int i10 = this.f41577a[i6];
        if (v(obj2, i10, i6)) {
            int iH = H(i6) & 1048575;
            sun.misc.Unsafe unsafe = f41576m;
            long j6 = iH;
            java.lang.Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f41577a[i6] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K = K(i6);
            if (!v(obj, i10, i6)) {
                if (u(object)) {
                    java.lang.Object objD = interfaceC6298t3K.d();
                    interfaceC6298t3K.e(objD, object);
                    unsafe.putObject(obj, j6, objD);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                n(obj, i10, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j6);
            if (!u(object2)) {
                java.lang.Object objD2 = interfaceC6298t3K.d();
                interfaceC6298t3K.e(objD2, object2);
                unsafe.putObject(obj, j6, objD2);
                object2 = objD2;
            }
            interfaceC6298t3K.e(object2, object);
        }
    }

    private final void m(java.lang.Object obj, int i6) {
        int iE = E(i6);
        long j6 = 1048575 & iE;
        if (j6 == 1048575) {
            return;
        }
        com.google.android.gms.internal.play_billing.G3.v(obj, j6, (1 << (iE >>> 20)) | com.google.android.gms.internal.play_billing.G3.h(obj, j6));
    }

    private final void n(java.lang.Object obj, int i6, int i10) {
        com.google.android.gms.internal.play_billing.G3.v(obj, E(i10) & 1048575, i6);
    }

    private final void o(java.lang.Object obj, int i6, java.lang.Object obj2) {
        f41576m.putObject(obj, H(i6) & 1048575, obj2);
        m(obj, i6);
    }

    private final void p(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        f41576m.putObject(obj, H(i10) & 1048575, obj2);
        n(obj, i6, i10);
    }

    private final boolean q(java.lang.Object obj, java.lang.Object obj2, int i6) {
        return r(obj, i6) == r(obj2, i6);
    }

    private final boolean r(java.lang.Object obj, int i6) {
        int iE = E(i6);
        long j6 = iE & 1048575;
        if (j6 != 1048575) {
            return (com.google.android.gms.internal.play_billing.G3.h(obj, j6) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i6);
        long j10 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.play_billing.G3.f(obj, j10)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.play_billing.G3.g(obj, j10)) != 0;
            case 2:
                return com.google.android.gms.internal.play_billing.G3.i(obj, j10) != 0;
            case 3:
                return com.google.android.gms.internal.play_billing.G3.i(obj, j10) != 0;
            case 4:
                return com.google.android.gms.internal.play_billing.G3.h(obj, j10) != 0;
            case 5:
                return com.google.android.gms.internal.play_billing.G3.i(obj, j10) != 0;
            case 6:
                return com.google.android.gms.internal.play_billing.G3.h(obj, j10) != 0;
            case 7:
                return com.google.android.gms.internal.play_billing.G3.B(obj, j10);
            case 8:
                java.lang.Object objK = com.google.android.gms.internal.play_billing.G3.k(obj, j10);
                if (objK instanceof java.lang.String) {
                    return !((java.lang.String) objK).isEmpty();
                }
                if (objK instanceof com.google.android.gms.internal.play_billing.AbstractC6268o2) {
                    return !com.google.android.gms.internal.play_billing.AbstractC6268o2.f41602D.equals(objK);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.play_billing.G3.k(obj, j10) != null;
            case 10:
                return !com.google.android.gms.internal.play_billing.AbstractC6268o2.f41602D.equals(com.google.android.gms.internal.play_billing.G3.k(obj, j10));
            case 11:
                return com.google.android.gms.internal.play_billing.G3.h(obj, j10) != 0;
            case 12:
                return com.google.android.gms.internal.play_billing.G3.h(obj, j10) != 0;
            case 13:
                return com.google.android.gms.internal.play_billing.G3.h(obj, j10) != 0;
            case 14:
                return com.google.android.gms.internal.play_billing.G3.i(obj, j10) != 0;
            case 15:
                return com.google.android.gms.internal.play_billing.G3.h(obj, j10) != 0;
            case 16:
                return com.google.android.gms.internal.play_billing.G3.i(obj, j10) != 0;
            case 17:
                return com.google.android.gms.internal.play_billing.G3.k(obj, j10) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean s(java.lang.Object obj, int i6, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return r(obj, i6);
        }
        return (i11 & i12) != 0;
    }

    private static boolean t(java.lang.Object obj, int i6, com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3) {
        return interfaceC6298t3.g(com.google.android.gms.internal.play_billing.G3.k(obj, i6 & 1048575));
    }

    private static boolean u(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.L2) {
            return ((com.google.android.gms.internal.play_billing.L2) obj).e();
        }
        return true;
    }

    private final boolean v(java.lang.Object obj, int i6, int i10) {
        return com.google.android.gms.internal.play_billing.G3.h(obj, (long) (E(i10) & 1048575)) == i6;
    }

    private static boolean w(java.lang.Object obj, long j6) {
        return ((java.lang.Boolean) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).booleanValue();
    }

    private static final void x(int i6, java.lang.Object obj, com.google.android.gms.internal.play_billing.K3 k6) {
        if (obj instanceof java.lang.String) {
            k6.j(i6, (java.lang.String) obj);
        } else {
            k6.I(i6, (com.google.android.gms.internal.play_billing.AbstractC6268o2) obj);
        }
    }

    static com.google.android.gms.internal.play_billing.A3 z(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.L2 l6 = (com.google.android.gms.internal.play_billing.L2) obj;
        com.google.android.gms.internal.play_billing.A3 a6 = l6.zzc;
        if (a6 != com.google.android.gms.internal.play_billing.A3.c()) {
            return a6;
        }
        com.google.android.gms.internal.play_billing.A3 a3F = com.google.android.gms.internal.play_billing.A3.f();
        l6.zzc = a3F;
        return a3F;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:25:0x0063 for B:17:0x0039 already processed. Defaulting to fallback option. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void a(java.lang.Object obj) {
        if (u(obj)) {
            if (obj instanceof com.google.android.gms.internal.play_billing.L2) {
                com.google.android.gms.internal.play_billing.L2 l6 = (com.google.android.gms.internal.play_billing.L2) obj;
                l6.y(Integer.MAX_VALUE);
                l6.zza = 0;
                l6.w();
            }
            int[] iArr = this.f41577a;
            for (int i6 = 0; i6 < iArr.length; i6 += 3) {
                int iH = H(i6);
                int i10 = 1048575 & iH;
                int iG = G(iH);
                long j6 = i10;
                if (iG != 9) {
                    if (iG != 60 && iG != 68) {
                        switch (iG) {
                            case 17:
                                if (r(obj, i6)) {
                                    K(i6).a(f41576m.getObject(obj, j6));
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
                                ((com.google.android.gms.internal.play_billing.P2) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).b();
                                continue;
                            case 50:
                                sun.misc.Unsafe unsafe = f41576m;
                                java.lang.Object object = unsafe.getObject(obj, j6);
                                if (object != null) {
                                    ((com.google.android.gms.internal.play_billing.C6197c3) object).c();
                                    unsafe.putObject(obj, j6, object);
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (v(obj, this.f41577a[i6], i6)) {
                        K(i6).a(f41576m.getObject(obj, j6));
                    }
                } else if (r(obj, i6)) {
                    K(i6).a(f41576m.getObject(obj, j6));
                }
            }
            this.f41586j.a(obj);
            if (this.f41582f) {
                this.f41587k.a(obj);
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
    
        if (v(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(r15 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (v(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(r15 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (v(r21, r15, r12) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        r0 = r15 << 3;
        r1 = D(r21, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.AbstractC6309v2.z(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        if (v(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (v(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        if (v(r21, r15, r12) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:
    
        if (v(r21, r15, r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        r0 = r15 << 3;
        r1 = I(r21, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        if (v(r21, r15, r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (v(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        if (v(r21, r15, r12) != false) goto L36;
     */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C6251l3.b(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3 A[PHI: r1 r2
  0x00f3: PHI (r1v12 int) = (r1v7 int), (r1v13 int) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r2v10 java.lang.Object) = (r2v7 java.lang.Object), (r2v11 java.lang.Object) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final int c(java.lang.Object obj) {
        int i6;
        double dF;
        float fG;
        boolean zB;
        int i10;
        java.lang.Object objK;
        int iH;
        long jI;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f41577a.length; i12 += 3) {
            int iH2 = H(i12);
            int[] iArr = this.f41577a;
            int i13 = 1048575 & iH2;
            int iG = G(iH2);
            int i14 = iArr[i12];
            long j6 = i13;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i6 = i11 * 53;
                    dF = com.google.android.gms.internal.play_billing.G3.f(obj, j6);
                    jI = java.lang.Double.doubleToLongBits(dF);
                    byte[] bArr = com.google.android.gms.internal.play_billing.Q2.f41449b;
                    iH = (int) (jI ^ (jI >>> 32));
                    i11 = i6 + iH;
                    break;
                case 1:
                    i6 = i11 * 53;
                    fG = com.google.android.gms.internal.play_billing.G3.g(obj, j6);
                    iH = java.lang.Float.floatToIntBits(fG);
                    i11 = i6 + iH;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i6 = i11 * 53;
                    jI = com.google.android.gms.internal.play_billing.G3.i(obj, j6);
                    byte[] bArr2 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                    iH = (int) (jI ^ (jI >>> 32));
                    i11 = i6 + iH;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i6 = i11 * 53;
                    iH = com.google.android.gms.internal.play_billing.G3.h(obj, j6);
                    i11 = i6 + iH;
                    break;
                case 7:
                    i6 = i11 * 53;
                    zB = com.google.android.gms.internal.play_billing.G3.B(obj, j6);
                    iH = com.google.android.gms.internal.play_billing.Q2.a(zB);
                    i11 = i6 + iH;
                    break;
                case 8:
                    i6 = i11 * 53;
                    iH = ((java.lang.String) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).hashCode();
                    i11 = i6 + iH;
                    break;
                case 9:
                    i10 = i11 * 53;
                    objK = com.google.android.gms.internal.play_billing.G3.k(obj, j6);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
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
                    iH = com.google.android.gms.internal.play_billing.G3.k(obj, j6).hashCode();
                    i11 = i6 + iH;
                    break;
                case 17:
                    i10 = i11 * 53;
                    objK = com.google.android.gms.internal.play_billing.G3.k(obj, j6);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i11 = i10 + iHashCode;
                    break;
                case 51:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        dF = B(obj, j6);
                        jI = java.lang.Double.doubleToLongBits(dF);
                        byte[] bArr3 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                        iH = (int) (jI ^ (jI >>> 32));
                        i11 = i6 + iH;
                    }
                    break;
                case 52:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        fG = C(obj, j6);
                        iH = java.lang.Float.floatToIntBits(fG);
                        i11 = i6 + iH;
                    }
                    break;
                case 53:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jI = I(obj, j6);
                        byte[] bArr4 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                        iH = (int) (jI ^ (jI >>> 32));
                        i11 = i6 + iH;
                    }
                    break;
                case 54:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jI = I(obj, j6);
                        byte[] bArr5 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                        iH = (int) (jI ^ (jI >>> 32));
                        i11 = i6 + iH;
                    }
                    break;
                case 55:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = D(obj, j6);
                        i11 = i6 + iH;
                    }
                    break;
                case 56:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jI = I(obj, j6);
                        byte[] bArr6 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                        iH = (int) (jI ^ (jI >>> 32));
                        i11 = i6 + iH;
                    }
                    break;
                case 57:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = D(obj, j6);
                        i11 = i6 + iH;
                    }
                    break;
                case 58:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        zB = w(obj, j6);
                        iH = com.google.android.gms.internal.play_billing.Q2.a(zB);
                        i11 = i6 + iH;
                    }
                    break;
                case 59:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = ((java.lang.String) com.google.android.gms.internal.play_billing.G3.k(obj, j6)).hashCode();
                        i11 = i6 + iH;
                    }
                    break;
                case 60:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = com.google.android.gms.internal.play_billing.G3.k(obj, j6).hashCode();
                        i11 = i6 + iH;
                    }
                    break;
                case 61:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = com.google.android.gms.internal.play_billing.G3.k(obj, j6).hashCode();
                        i11 = i6 + iH;
                    }
                    break;
                case 62:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = D(obj, j6);
                        i11 = i6 + iH;
                    }
                    break;
                case 63:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = D(obj, j6);
                        i11 = i6 + iH;
                    }
                    break;
                case 64:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = D(obj, j6);
                        i11 = i6 + iH;
                    }
                    break;
                case 65:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jI = I(obj, j6);
                        byte[] bArr7 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                        iH = (int) (jI ^ (jI >>> 32));
                        i11 = i6 + iH;
                    }
                    break;
                case 66:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = D(obj, j6);
                        i11 = i6 + iH;
                    }
                    break;
                case 67:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        jI = I(obj, j6);
                        byte[] bArr8 = com.google.android.gms.internal.play_billing.Q2.f41449b;
                        iH = (int) (jI ^ (jI >>> 32));
                        i11 = i6 + iH;
                    }
                    break;
                case 68:
                    if (v(obj, i14, i12)) {
                        i6 = i11 * 53;
                        iH = com.google.android.gms.internal.play_billing.G3.k(obj, j6).hashCode();
                        i11 = i6 + iH;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + ((com.google.android.gms.internal.play_billing.L2) obj).zzc.hashCode();
        if (!this.f41582f) {
            return iHashCode2;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final java.lang.Object d() {
        return ((com.google.android.gms.internal.play_billing.L2) this.f41581e).p();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        j(obj);
        obj2.getClass();
        for (int i6 = 0; i6 < this.f41577a.length; i6 += 3) {
            int iH = H(i6);
            int i10 = 1048575 & iH;
            int[] iArr = this.f41577a;
            int iG = G(iH);
            int i11 = iArr[i6];
            long j6 = i10;
            switch (iG) {
                case 0:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.t(obj, j6, com.google.android.gms.internal.play_billing.G3.f(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 1:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.u(obj, j6, com.google.android.gms.internal.play_billing.G3.g(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 2:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.w(obj, j6, com.google.android.gms.internal.play_billing.G3.i(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 3:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.w(obj, j6, com.google.android.gms.internal.play_billing.G3.i(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 4:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.v(obj, j6, com.google.android.gms.internal.play_billing.G3.h(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 5:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.w(obj, j6, com.google.android.gms.internal.play_billing.G3.i(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 6:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.v(obj, j6, com.google.android.gms.internal.play_billing.G3.h(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 7:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.r(obj, j6, com.google.android.gms.internal.play_billing.G3.B(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 8:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.x(obj, j6, com.google.android.gms.internal.play_billing.G3.k(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 9:
                case 17:
                    k(obj, obj2, i6);
                    break;
                case 10:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.x(obj, j6, com.google.android.gms.internal.play_billing.G3.k(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 11:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.v(obj, j6, com.google.android.gms.internal.play_billing.G3.h(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 12:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.v(obj, j6, com.google.android.gms.internal.play_billing.G3.h(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 13:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.v(obj, j6, com.google.android.gms.internal.play_billing.G3.h(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 14:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.w(obj, j6, com.google.android.gms.internal.play_billing.G3.i(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 15:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.v(obj, j6, com.google.android.gms.internal.play_billing.G3.h(obj2, j6));
                        m(obj, i6);
                    }
                    break;
                case 16:
                    if (r(obj2, i6)) {
                        com.google.android.gms.internal.play_billing.G3.w(obj, j6, com.google.android.gms.internal.play_billing.G3.i(obj2, j6));
                        m(obj, i6);
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
                    com.google.android.gms.internal.play_billing.P2 p2M = (com.google.android.gms.internal.play_billing.P2) com.google.android.gms.internal.play_billing.G3.k(obj, j6);
                    com.google.android.gms.internal.play_billing.P2 p6 = (com.google.android.gms.internal.play_billing.P2) com.google.android.gms.internal.play_billing.G3.k(obj2, j6);
                    int size = p2M.size();
                    int size2 = p6.size();
                    if (size > 0 && size2 > 0) {
                        if (!p2M.c()) {
                            p2M = p2M.m(size2 + size);
                        }
                        p2M.addAll(p6);
                    }
                    if (size > 0) {
                        p6 = p2M;
                    }
                    com.google.android.gms.internal.play_billing.G3.x(obj, j6, p6);
                    break;
                case 50:
                    int i12 = com.google.android.gms.internal.play_billing.AbstractC6310v3.f41664b;
                    com.google.android.gms.internal.play_billing.G3.x(obj, j6, com.google.android.gms.internal.play_billing.C6203d3.a(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6)));
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
                    if (v(obj2, i11, i6)) {
                        com.google.android.gms.internal.play_billing.G3.x(obj, j6, com.google.android.gms.internal.play_billing.G3.k(obj2, j6));
                        n(obj, i11, i6);
                    }
                    break;
                case 60:
                case 68:
                    l(obj, obj2, i6);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(obj2, i11, i6)) {
                        com.google.android.gms.internal.play_billing.G3.x(obj, j6, com.google.android.gms.internal.play_billing.G3.k(obj2, j6));
                        n(obj, i11, i6);
                    }
                    break;
            }
        }
        com.google.android.gms.internal.play_billing.AbstractC6310v3.u(this.f41586j, obj, obj2);
        if (this.f41582f) {
            com.google.android.gms.internal.play_billing.AbstractC6310v3.t(this.f41587k, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void f(java.lang.Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.play_billing.C6196c2 c6196c2) {
        y(obj, bArr, i6, i10, 0, c6196c2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4 A[LOOP:1: B:45:0x00b3->B:50:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final boolean g(java.lang.Object obj) {
        int i6;
        int i10;
        java.util.List list;
        com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f41584h) {
            int[] iArr = this.f41583g;
            int[] iArr2 = this.f41577a;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int iH = H(i15);
            int i17 = this.f41577a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f41576m.getInt(obj, i18);
                }
                i10 = i12;
                i6 = i18;
            } else {
                i6 = i14;
                i10 = i12;
            }
            if ((268435456 & iH) != 0 && !s(obj, i15, i6, i10, i19)) {
                return false;
            }
            int iG = G(iH);
            if (iG == 9 || iG == 17) {
                if (s(obj, i15, i6, i10, i19) && !t(obj, iH, K(i15))) {
                    return false;
                }
            } else if (iG == 27) {
                list = (java.util.List) com.google.android.gms.internal.play_billing.G3.k(obj, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC6298t3K = K(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!interfaceC6298t3K.g(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iG == 60 || iG == 68) {
                if (v(obj, i16, i15) && !t(obj, iH, K(i15))) {
                    return false;
                }
            } else if (iG == 49) {
                list = (java.util.List) com.google.android.gms.internal.play_billing.G3.k(obj, iH & 1048575);
                if (list.isEmpty()) {
                    interfaceC6298t3K = K(i15);
                    while (i11 < list.size()) {
                        if (!interfaceC6298t3K.g(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iG == 50 && !((com.google.android.gms.internal.play_billing.C6197c3) com.google.android.gms.internal.play_billing.G3.k(obj, iH & 1048575)).isEmpty()) {
                androidx.appcompat.app.D.a(L(i15));
                throw null;
            }
            i13++;
            i14 = i6;
            i12 = i10;
        }
        if (!this.f41582f) {
            return true;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final void h(java.lang.Object obj, com.google.android.gms.internal.play_billing.K3 k6) throws java.lang.Throwable {
        int i6;
        int i10;
        int i11;
        boolean z6;
        ?? r10 = 1;
        java.lang.Throwable th = null;
        if (this.f41582f) {
            androidx.appcompat.app.D.a(obj);
            throw null;
        }
        int[] iArr = this.f41577a;
        sun.misc.Unsafe unsafe = f41576m;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < iArr.length) {
            int iH = H(i15);
            int[] iArr2 = this.f41577a;
            int iG = G(iH);
            int i16 = iArr2[i15];
            if (iG <= 17) {
                int i17 = iArr2[i15 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i6 = i13;
                i10 = i14;
                i11 = r10 << (i17 >>> 20);
            } else {
                i6 = i13;
                i10 = i14;
                i11 = 0;
            }
            long j6 = iH & i12;
            switch (iG) {
                case 0:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.v(i16, com.google.android.gms.internal.play_billing.G3.f(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 1:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.y(i16, com.google.android.gms.internal.play_billing.G3.g(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 2:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.o(i16, unsafe.getLong(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 3:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.G(i16, unsafe.getLong(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 4:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.f(i16, unsafe.getInt(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 5:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.E(i16, unsafe.getLong(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 6:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.m(i16, unsafe.getInt(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 7:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.n(i16, com.google.android.gms.internal.play_billing.G3.B(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 8:
                    if (s(obj, i15, i6, i10, i11)) {
                        x(i16, unsafe.getObject(obj, j6), k6);
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 9:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.a(i16, unsafe.getObject(obj, j6), K(i15));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 10:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.I(i16, (com.google.android.gms.internal.play_billing.AbstractC6268o2) unsafe.getObject(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 11:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.k(i16, unsafe.getInt(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 12:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.t(i16, unsafe.getInt(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 13:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.A(i16, unsafe.getInt(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 14:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.s(i16, unsafe.getLong(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 15:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.D(i16, unsafe.getInt(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 16:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.w(i16, unsafe.getLong(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 17:
                    if (s(obj, i15, i6, i10, i11)) {
                        k6.e(i16, unsafe.getObject(obj, j6), K(i15));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 18:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.w(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 19:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.A(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 20:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.C(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.d(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 22:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.B(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 23:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.z(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 24:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.y(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 25:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.v(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 26:
                    int i19 = this.f41577a[i15];
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j6);
                    int i20 = com.google.android.gms.internal.play_billing.AbstractC6310v3.f41664b;
                    if (list != null && !list.isEmpty()) {
                        k6.F(i19, list);
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 27:
                    int i21 = this.f41577a[i15];
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j6);
                    com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K = K(i15);
                    int i22 = com.google.android.gms.internal.play_billing.AbstractC6310v3.f41664b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23 += r10) {
                            ((com.google.android.gms.internal.play_billing.C6315w2) k6).a(i21, list2.get(i23), interfaceC6298t3K);
                        }
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 28:
                    int i24 = this.f41577a[i15];
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j6);
                    int i25 = com.google.android.gms.internal.play_billing.AbstractC6310v3.f41664b;
                    if (list3 != null && !list3.isEmpty()) {
                        k6.i(i24, list3);
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 29:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.c(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 30:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.x(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 31:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.D(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 32:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.E(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.a(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 34:
                    z6 = false;
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.b(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, false);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 35:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.w(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 36:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.A(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 37:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.C(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 38:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.d(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 39:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.B(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 40:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.z(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 41:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.y(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 42:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.v(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 43:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.c(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 44:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.x(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 45:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.D(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 46:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.E(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 47:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.a(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 48:
                    com.google.android.gms.internal.play_billing.AbstractC6310v3.b(this.f41577a[i15], (java.util.List) unsafe.getObject(obj, j6), k6, r10);
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 49:
                    int i26 = this.f41577a[i15];
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j6);
                    com.google.android.gms.internal.play_billing.InterfaceC6298t3 interfaceC6298t3K2 = K(i15);
                    int i27 = com.google.android.gms.internal.play_billing.AbstractC6310v3.f41664b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28 += r10) {
                            ((com.google.android.gms.internal.play_billing.C6315w2) k6).e(i26, list4.get(i28), interfaceC6298t3K2);
                        }
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j6) != null) {
                        androidx.appcompat.app.D.a(L(i15));
                        throw th;
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 51:
                    if (v(obj, i16, i15)) {
                        k6.v(i16, B(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 52:
                    if (v(obj, i16, i15)) {
                        k6.y(i16, C(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 53:
                    if (v(obj, i16, i15)) {
                        k6.o(i16, I(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 54:
                    if (v(obj, i16, i15)) {
                        k6.G(i16, I(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 55:
                    if (v(obj, i16, i15)) {
                        k6.f(i16, D(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 56:
                    if (v(obj, i16, i15)) {
                        k6.E(i16, I(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 57:
                    if (v(obj, i16, i15)) {
                        k6.m(i16, D(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 58:
                    if (v(obj, i16, i15)) {
                        k6.n(i16, w(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 59:
                    if (v(obj, i16, i15)) {
                        x(i16, unsafe.getObject(obj, j6), k6);
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 60:
                    if (v(obj, i16, i15)) {
                        k6.a(i16, unsafe.getObject(obj, j6), K(i15));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 61:
                    if (v(obj, i16, i15)) {
                        k6.I(i16, (com.google.android.gms.internal.play_billing.AbstractC6268o2) unsafe.getObject(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 62:
                    if (v(obj, i16, i15)) {
                        k6.k(i16, D(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 63:
                    if (v(obj, i16, i15)) {
                        k6.t(i16, D(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 64:
                    if (v(obj, i16, i15)) {
                        k6.A(i16, D(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 65:
                    if (v(obj, i16, i15)) {
                        k6.s(i16, I(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 66:
                    if (v(obj, i16, i15)) {
                        k6.D(i16, D(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 67:
                    if (v(obj, i16, i15)) {
                        k6.w(i16, I(obj, j6));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                case 68:
                    if (v(obj, i16, i15)) {
                        k6.e(i16, unsafe.getObject(obj, j6), K(i15));
                    }
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
                default:
                    i15 += 3;
                    i13 = i6;
                    i14 = i10;
                    r10 = 1;
                    th = null;
                    i12 = 1048575;
                    break;
            }
        }
        ((com.google.android.gms.internal.play_billing.L2) obj).zzc.k(k6);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6298t3
    public final boolean i(java.lang.Object obj, java.lang.Object obj2) {
        for (int i6 = 0; i6 < this.f41577a.length; i6 += 3) {
            int iH = H(i6);
            long j6 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i6) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.play_billing.G3.f(obj, j6)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.play_billing.G3.f(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i6) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.play_billing.G3.g(obj, j6)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.play_billing.G3.g(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.i(obj, j6) != com.google.android.gms.internal.play_billing.G3.i(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.i(obj, j6) != com.google.android.gms.internal.play_billing.G3.i(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.h(obj, j6) != com.google.android.gms.internal.play_billing.G3.h(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.i(obj, j6) != com.google.android.gms.internal.play_billing.G3.i(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.h(obj, j6) != com.google.android.gms.internal.play_billing.G3.h(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.B(obj, j6) != com.google.android.gms.internal.play_billing.G3.B(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i6) || !com.google.android.gms.internal.play_billing.AbstractC6310v3.e(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!q(obj, obj2, i6) || !com.google.android.gms.internal.play_billing.AbstractC6310v3.e(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!q(obj, obj2, i6) || !com.google.android.gms.internal.play_billing.AbstractC6310v3.e(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.h(obj, j6) != com.google.android.gms.internal.play_billing.G3.h(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.h(obj, j6) != com.google.android.gms.internal.play_billing.G3.h(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.h(obj, j6) != com.google.android.gms.internal.play_billing.G3.h(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.i(obj, j6) != com.google.android.gms.internal.play_billing.G3.i(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.h(obj, j6) != com.google.android.gms.internal.play_billing.G3.h(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!q(obj, obj2, i6) || com.google.android.gms.internal.play_billing.G3.i(obj, j6) != com.google.android.gms.internal.play_billing.G3.i(obj2, j6)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!q(obj, obj2, i6) || !com.google.android.gms.internal.play_billing.AbstractC6310v3.e(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6))) {
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
                    if (!com.google.android.gms.internal.play_billing.AbstractC6310v3.e(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6))) {
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
                    long jE = E(i6) & 1048575;
                    if (com.google.android.gms.internal.play_billing.G3.h(obj, jE) != com.google.android.gms.internal.play_billing.G3.h(obj2, jE) || !com.google.android.gms.internal.play_billing.AbstractC6310v3.e(com.google.android.gms.internal.play_billing.G3.k(obj, j6), com.google.android.gms.internal.play_billing.G3.k(obj2, j6))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!((com.google.android.gms.internal.play_billing.L2) obj).zzc.equals(((com.google.android.gms.internal.play_billing.L2) obj2).zzc)) {
            return false;
        }
        if (!this.f41582f) {
            return true;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0296  */
    /* JADX WARN: Code duplicated, block: B:105:0x029e  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x02be  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:273:0x070e A[LOOP:7: B:274:0x0716->B:273:0x070e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x0718  */
    /* JADX WARN: Code duplicated, block: B:277:0x0720  */
    /* JADX WARN: Code duplicated, block: B:279:0x0728  */
    /* JADX WARN: Code duplicated, block: B:281:0x072c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:597:0x0735 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x072f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x0a42 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0a60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0260  */
    /* JADX WARN: Code duplicated, block: B:94:0x0268 A[LOOP:14: B:91:0x025e->B:94:0x0268, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x072c -> B:272:0x0708). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    final int y(java.lang.Object r46, byte[] r47, int r48, int r49, int r50, com.google.android.gms.internal.play_billing.C6196c2 r51) {
        /*
            Method dump skipped, instruction units count: 3682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C6251l3.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.c2):int");
    }
}
