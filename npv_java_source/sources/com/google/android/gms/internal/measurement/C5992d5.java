package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5992d5 implements com.google.android.gms.internal.measurement.InterfaceC6100p5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f40835q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final sun.misc.Unsafe f40836r = com.google.android.gms.internal.measurement.G5.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object[] f40838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.InterfaceC5965a5 f40841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f40844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f40845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f40846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f40847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.InterfaceC6019g5 f40848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.J4 f40849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.F5 f40850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.AbstractC6036i4 f40851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.S4 f40852p;

    private C5992d5(int[] iArr, java.lang.Object[] objArr, int i6, int i10, com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5, boolean z6, int[] iArr2, int i11, int i12, com.google.android.gms.internal.measurement.InterfaceC6019g5 interfaceC6019g5, com.google.android.gms.internal.measurement.J4 j6, com.google.android.gms.internal.measurement.F5 f6, com.google.android.gms.internal.measurement.AbstractC6036i4 abstractC6036i4, com.google.android.gms.internal.measurement.S4 s6) {
        this.f40837a = iArr;
        this.f40838b = objArr;
        this.f40839c = i6;
        this.f40840d = i10;
        this.f40843g = interfaceC5965a5 instanceof com.google.android.gms.internal.measurement.AbstractC6130t4;
        this.f40842f = abstractC6036i4 != null && abstractC6036i4.d(interfaceC5965a5);
        this.f40844h = false;
        this.f40845i = iArr2;
        this.f40846j = i11;
        this.f40847k = i12;
        this.f40848l = interfaceC6019g5;
        this.f40849m = j6;
        this.f40850n = f6;
        this.f40851o = abstractC6036i4;
        this.f40841e = interfaceC5965a5;
        this.f40852p = s6;
    }

    private static boolean A(java.lang.Object obj, int i6, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        return interfaceC6100p5.d(com.google.android.gms.internal.measurement.G5.B(obj, i6 & 1048575));
    }

    private static float B(java.lang.Object obj, long j6) {
        return ((java.lang.Float) com.google.android.gms.internal.measurement.G5.B(obj, j6)).floatValue();
    }

    private final int C(int i6) {
        return this.f40837a[i6 + 2];
    }

    private final void D(java.lang.Object obj, int i6) {
        int iC = C(i6);
        long j6 = 1048575 & iC;
        if (j6 == 1048575) {
            return;
        }
        com.google.android.gms.internal.measurement.G5.h(obj, j6, (1 << (iC >>> 20)) | com.google.android.gms.internal.measurement.G5.t(obj, j6));
    }

    private final void E(java.lang.Object obj, int i6, int i10) {
        com.google.android.gms.internal.measurement.G5.h(obj, C(i10) & 1048575, i6);
    }

    private final void F(java.lang.Object obj, java.lang.Object obj2, int i6) {
        int i10 = this.f40837a[i6];
        if (K(obj2, i10, i6)) {
            long jG = G(i6) & 1048575;
            sun.misc.Unsafe unsafe = f40836r;
            java.lang.Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f40837a[i6] + " is present but null: " + java.lang.String.valueOf(obj2));
            }
            com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5O = O(i6);
            if (!K(obj, i10, i6)) {
                if (T(object)) {
                    java.lang.Object objA = interfaceC6100p5O.a();
                    interfaceC6100p5O.f(objA, object);
                    unsafe.putObject(obj, jG, objA);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                E(obj, i10, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jG);
            if (!T(object2)) {
                java.lang.Object objA2 = interfaceC6100p5O.a();
                interfaceC6100p5O.f(objA2, object2);
                unsafe.putObject(obj, jG, objA2);
                object2 = objA2;
            }
            interfaceC6100p5O.f(object2, object);
        }
    }

    private final int G(int i6) {
        return this.f40837a[i6 + 1];
    }

    private static int H(java.lang.Object obj, long j6) {
        return ((java.lang.Integer) com.google.android.gms.internal.measurement.G5.B(obj, j6)).intValue();
    }

    static com.google.android.gms.internal.measurement.E5 I(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4 = (com.google.android.gms.internal.measurement.AbstractC6130t4) obj;
        com.google.android.gms.internal.measurement.E5 e6 = abstractC6130t4.zzb;
        if (e6 != com.google.android.gms.internal.measurement.E5.k()) {
            return e6;
        }
        com.google.android.gms.internal.measurement.E5 e5L = com.google.android.gms.internal.measurement.E5.l();
        abstractC6130t4.zzb = e5L;
        return e5L;
    }

    private final boolean J(java.lang.Object obj, int i6) {
        int iC = C(i6);
        long j6 = iC & 1048575;
        if (j6 != 1048575) {
            return (com.google.android.gms.internal.measurement.G5.t(obj, j6) & (1 << (iC >>> 20))) != 0;
        }
        int iG = G(i6);
        long j10 = iG & 1048575;
        switch ((iG & 267386880) >>> 20) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.measurement.G5.a(obj, j10)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.measurement.G5.n(obj, j10)) != 0;
            case 2:
                return com.google.android.gms.internal.measurement.G5.x(obj, j10) != 0;
            case 3:
                return com.google.android.gms.internal.measurement.G5.x(obj, j10) != 0;
            case 4:
                return com.google.android.gms.internal.measurement.G5.t(obj, j10) != 0;
            case 5:
                return com.google.android.gms.internal.measurement.G5.x(obj, j10) != 0;
            case 6:
                return com.google.android.gms.internal.measurement.G5.t(obj, j10) != 0;
            case 7:
                return com.google.android.gms.internal.measurement.G5.F(obj, j10);
            case 8:
                java.lang.Object objB = com.google.android.gms.internal.measurement.G5.B(obj, j10);
                if (objB instanceof java.lang.String) {
                    return !((java.lang.String) objB).isEmpty();
                }
                if (objB instanceof com.google.android.gms.internal.measurement.L3) {
                    return !com.google.android.gms.internal.measurement.L3.f40566D.equals(objB);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.measurement.G5.B(obj, j10) != null;
            case 10:
                return !com.google.android.gms.internal.measurement.L3.f40566D.equals(com.google.android.gms.internal.measurement.G5.B(obj, j10));
            case 11:
                return com.google.android.gms.internal.measurement.G5.t(obj, j10) != 0;
            case 12:
                return com.google.android.gms.internal.measurement.G5.t(obj, j10) != 0;
            case 13:
                return com.google.android.gms.internal.measurement.G5.t(obj, j10) != 0;
            case 14:
                return com.google.android.gms.internal.measurement.G5.x(obj, j10) != 0;
            case 15:
                return com.google.android.gms.internal.measurement.G5.t(obj, j10) != 0;
            case 16:
                return com.google.android.gms.internal.measurement.G5.x(obj, j10) != 0;
            case 17:
                return com.google.android.gms.internal.measurement.G5.B(obj, j10) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean K(java.lang.Object obj, int i6, int i10) {
        return com.google.android.gms.internal.measurement.G5.t(obj, (long) (C(i10) & 1048575)) == i6;
    }

    private final boolean L(java.lang.Object obj, java.lang.Object obj2, int i6) {
        return J(obj, i6) == J(obj2, i6);
    }

    private static long M(java.lang.Object obj, long j6) {
        return ((java.lang.Long) com.google.android.gms.internal.measurement.G5.B(obj, j6)).longValue();
    }

    private final com.google.android.gms.internal.measurement.InterfaceC6162x4 N(int i6) {
        return (com.google.android.gms.internal.measurement.InterfaceC6162x4) this.f40838b[((i6 / 3) << 1) + 1];
    }

    private final com.google.android.gms.internal.measurement.InterfaceC6100p5 O(int i6) {
        int i10 = (i6 / 3) << 1;
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5 = (com.google.android.gms.internal.measurement.InterfaceC6100p5) this.f40838b[i10];
        if (interfaceC6100p5 != null) {
            return interfaceC6100p5;
        }
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5B = com.google.android.gms.internal.measurement.C6073m5.a().b((java.lang.Class) this.f40838b[i10 + 1]);
        this.f40838b[i10] = interfaceC6100p5B;
        return interfaceC6100p5B;
    }

    private static boolean P(java.lang.Object obj, long j6) {
        return ((java.lang.Boolean) com.google.android.gms.internal.measurement.G5.B(obj, j6)).booleanValue();
    }

    private final java.lang.Object Q(int i6) {
        return this.f40838b[(i6 / 3) << 1];
    }

    private static void R(java.lang.Object obj) {
        if (T(obj)) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Mutating immutable message: " + java.lang.String.valueOf(obj));
    }

    private static boolean S(int i6) {
        return (i6 & 536870912) != 0;
    }

    private static boolean T(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.AbstractC6130t4) {
            return ((com.google.android.gms.internal.measurement.AbstractC6130t4) obj).E();
        }
        return true;
    }

    private static double j(java.lang.Object obj, long j6) {
        return ((java.lang.Double) com.google.android.gms.internal.measurement.G5.B(obj, j6)).doubleValue();
    }

    private final int k(int i6) {
        if (i6 < this.f40839c || i6 > this.f40840d) {
            return -1;
        }
        return l(i6, 0);
    }

    private final int l(int i6, int i10) {
        int length = (this.f40837a.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.f40837a[i12];
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

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:168:0x033f  */
    /* JADX WARN: Code duplicated, block: B:183:0x038c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0399  */
    static com.google.android.gms.internal.measurement.C5992d5 n(java.lang.Class cls, com.google.android.gms.internal.measurement.Y4 y6, com.google.android.gms.internal.measurement.InterfaceC6019g5 interfaceC6019g5, com.google.android.gms.internal.measurement.J4 j6, com.google.android.gms.internal.measurement.F5 f6, com.google.android.gms.internal.measurement.AbstractC6036i4 abstractC6036i4, com.google.android.gms.internal.measurement.S4 s6) {
        int i6;
        int iCharAt;
        int iCharAt2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
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
        com.google.android.gms.internal.measurement.C6082n5 c6082n5;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        java.lang.reflect.Field fieldS;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        java.lang.Object obj;
        java.lang.reflect.Field fieldS2;
        int i35;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldS3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        if (!(y6 instanceof com.google.android.gms.internal.measurement.C6082n5)) {
            androidx.appcompat.app.D.a(y6);
            throw new java.lang.NoSuchMethodError();
        }
        com.google.android.gms.internal.measurement.C6082n5 c6082n6 = (com.google.android.gms.internal.measurement.C6082n5) y6;
        java.lang.String strD = c6082n6.d();
        int length = strD.length();
        char c6 = 55296;
        if (strD.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i6 = i40 + 1;
                if (strD.charAt(i40) < 55296) {
                    break;
                }
                i40 = i6;
            }
        } else {
            i6 = 1;
        }
        int i41 = i6 + 1;
        int iCharAt3 = strD.charAt(i6);
        if (iCharAt3 >= 55296) {
            int i42 = iCharAt3 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strD.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt3 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt3 == 0) {
            i14 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i13 = 0;
            i12 = 0;
            i11 = 0;
            iArr = f40835q;
            i10 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt4 = strD.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt8 = strD.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt4 = i45 | (cCharAt8 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt5 = strD.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt7 = strD.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt5 = i48 | (cCharAt7 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int iCharAt6 = strD.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt6 = strD.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt6 = i51 | (cCharAt6 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            int iCharAt7 = strD.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt5 = strD.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt7 = i54 | (cCharAt5 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            iCharAt = strD.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt4 = strD.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            iCharAt2 = strD.charAt(i56);
            if (iCharAt2 >= 55296) {
                int i60 = iCharAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt3 = strD.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt2 = i60 | (cCharAt3 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strD.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt2 = strD.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i16;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strD.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i15 = i65 + 1;
                    cCharAt = strD.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i15;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i15;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            int i68 = (iCharAt4 << 1) + iCharAt5;
            i10 = iCharAt4;
            i11 = iCharAt9;
            i41 = i65;
            i12 = iCharAt7;
            i13 = iCharAt6;
            i14 = i68;
            iArr = iArr2;
        }
        sun.misc.Unsafe unsafe = f40836r;
        java.lang.Object[] objArrE = c6082n6.e();
        java.lang.Class<?> cls2 = c6082n6.a().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[iCharAt << 1];
        int i69 = i11 + iCharAt2;
        int i70 = i11;
        int i71 = i69;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strD.charAt(i41);
            if (iCharAt10 >= c6) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strD.charAt(i76);
                    if (cCharAt12 < c6) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i23 = i38;
            } else {
                i23 = i74;
            }
            int i78 = i23 + 1;
            int iCharAt11 = strD.charAt(i23);
            if (iCharAt11 >= c6) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strD.charAt(i80);
                    i24 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                    length = i24;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = i12;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i84 = i13;
            if (i82 >= 51) {
                int i85 = i25 + 1;
                int iCharAt12 = strD.charAt(i25);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = 13;
                    while (true) {
                        i36 = i85 + 1;
                        cCharAt10 = strD.charAt(i85);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i36;
                        c10 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i87);
                    i85 = i36;
                }
                int i88 = i82 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i32 = 1;
                    i33 = i14 + 1;
                    objArr[((i72 / 3) << 1) + 1] = objArrE[i14];
                } else {
                    if (i88 != 12 || (!c6082n6.b().equals(com.google.android.gms.internal.measurement.EnumC6046j5.PROTO2) && (iCharAt11 & 2048) == 0)) {
                        i32 = 1;
                    } else {
                        i32 = 1;
                        i33 = i14 + 1;
                        objArr[((i72 / 3) << 1) + 1] = objArrE[i14];
                    }
                    i34 = iCharAt12 << i32;
                    obj = objArrE[i34];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldS2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldS2 = s(cls2, (java.lang.String) obj);
                        objArrE[i34] = fieldS2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldS2);
                    i35 = i34 + 1;
                    obj2 = objArrE[i35];
                    int i90 = i14;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldS3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldS3 = s(cls2, (java.lang.String) obj2);
                        objArrE[i35] = fieldS3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS3);
                    strD = strD;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = i90;
                    i29 = 0;
                    c6082n5 = c6082n6;
                    i26 = iCharAt10;
                    i28 = i89;
                }
                i14 = i33;
                i34 = iCharAt12 << i32;
                obj = objArrE[i34];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldS2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldS2 = s(cls2, (java.lang.String) obj);
                    objArrE[i34] = fieldS2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldS2);
                i35 = i34 + 1;
                obj2 = objArrE[i35];
                int i91 = i14;
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldS3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldS3 = s(cls2, (java.lang.String) obj2);
                    objArrE[i35] = fieldS3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS3);
                strD = strD;
                iObjectFieldOffset = iObjectFieldOffset4;
                i27 = i91;
                i29 = 0;
                c6082n5 = c6082n6;
                i26 = iCharAt10;
                i28 = i89;
            } else {
                int i92 = i14 + 1;
                java.lang.reflect.Field fieldS4 = s(cls2, (java.lang.String) objArrE[i14]);
                i26 = iCharAt10;
                if (i82 == 9 || i82 == 17) {
                    c6082n5 = c6082n6;
                    objArr[((i72 / 3) << 1) + 1] = fieldS4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        c6082n5 = c6082n6;
                        i31 = i14 + 2;
                        objArr[((i72 / 3) << 1) + 1] = objArrE[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        c6082n5 = c6082n6;
                        if (c6082n6.b() == com.google.android.gms.internal.measurement.EnumC6046j5.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i31 = i14 + 2;
                            objArr[((i72 / 3) << 1) + 1] = objArrE[i92];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        } else {
                            i28 = i25 + 1;
                            int iCharAt13 = strD.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i93 = iCharAt13 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i30 = i28 + 1;
                                    cCharAt9 = strD.charAt(i28);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i93 |= (cCharAt9 & 8191) << i94;
                                    i94 += 13;
                                    i28 = i30;
                                }
                                iCharAt13 = i93 | (cCharAt9 << i94);
                                i28 = i30;
                            }
                            int i95 = (i10 << 1) + (iCharAt13 / 32);
                            java.lang.Object obj3 = objArrE[i95];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldS = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldS = s(cls2, (java.lang.String) obj3);
                                objArrE[i95] = fieldS;
                            }
                            i29 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS);
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                    } else if (i82 == 50) {
                        int i96 = i70 + 1;
                        iArr[i70] = i72;
                        int i97 = (i72 / 3) << 1;
                        int i98 = i14 + 2;
                        objArr[i97] = objArrE[i92];
                        if ((iCharAt11 & 2048) != 0) {
                            i92 = i14 + 3;
                            objArr[i97 + 1] = objArrE[i98];
                            c6082n5 = c6082n6;
                            i70 = i96;
                        } else {
                            i70 = i96;
                            c6082n5 = c6082n6;
                            i27 = i98;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        }
                        if (i82 >= 18) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                    } else {
                        c6082n5 = c6082n6;
                    }
                    i27 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    }
                    if (i82 >= 18) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                }
                i27 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                }
                if (i82 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
            }
            int i99 = i72 + 1;
            iArr3[i72] = i26;
            int i100 = i72 + 2;
            java.lang.Class<?> cls3 = cls2;
            int i101 = i28;
            iArr3[i99] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | iObjectFieldOffset;
            i72 += 3;
            iArr3[i100] = (i29 << 20) | iObjectFieldOffset2;
            strD = strD;
            i12 = i83;
            i14 = i27;
            c6082n6 = c6082n5;
            length = i24;
            i13 = i84;
            cls2 = cls3;
            i41 = i101;
            c6 = 55296;
        }
        return new com.google.android.gms.internal.measurement.C5992d5(iArr3, objArr, i13, i12, c6082n6.a(), false, iArr, i11, i69, interfaceC6019g5, j6, f6, abstractC6036i4, s6);
    }

    private final java.lang.Object o(int i6, int i10, java.util.Map map, com.google.android.gms.internal.measurement.InterfaceC6162x4 interfaceC6162x4, java.lang.Object obj, com.google.android.gms.internal.measurement.F5 f6, java.lang.Object obj2) {
        this.f40852p.b(Q(i6));
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!interfaceC6162x4.r(((java.lang.Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = f6.i(obj2);
                }
                com.google.android.gms.internal.measurement.U3 u3N = com.google.android.gms.internal.measurement.L3.N(com.google.android.gms.internal.measurement.R4.a(null, entry.getKey(), entry.getValue()));
                try {
                    com.google.android.gms.internal.measurement.R4.b(u3N.b(), null, entry.getKey(), entry.getValue());
                    f6.c(obj, i10, u3N.a());
                    it.remove();
                } catch (java.io.IOException e6) {
                    throw new java.lang.RuntimeException(e6);
                }
            }
        }
        return obj;
    }

    private final java.lang.Object p(java.lang.Object obj, int i6) {
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5O = O(i6);
        long jG = G(i6) & 1048575;
        if (!J(obj, i6)) {
            return interfaceC6100p5O.a();
        }
        java.lang.Object object = f40836r.getObject(obj, jG);
        if (T(object)) {
            return object;
        }
        java.lang.Object objA = interfaceC6100p5O.a();
        if (object != null) {
            interfaceC6100p5O.f(objA, object);
        }
        return objA;
    }

    private final java.lang.Object q(java.lang.Object obj, int i6, int i10) {
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5O = O(i10);
        if (!K(obj, i6, i10)) {
            return interfaceC6100p5O.a();
        }
        java.lang.Object object = f40836r.getObject(obj, G(i10) & 1048575);
        if (T(object)) {
            return object;
        }
        java.lang.Object objA = interfaceC6100p5O.a();
        if (object != null) {
            interfaceC6100p5O.f(objA, object);
        }
        return objA;
    }

    private final java.lang.Object r(java.lang.Object obj, int i6, java.lang.Object obj2, com.google.android.gms.internal.measurement.F5 f6, java.lang.Object obj3) {
        com.google.android.gms.internal.measurement.InterfaceC6162x4 interfaceC6162x4N;
        int i10 = this.f40837a[i6];
        java.lang.Object objB = com.google.android.gms.internal.measurement.G5.B(obj, G(i6) & 1048575);
        return (objB == null || (interfaceC6162x4N = N(i6)) == null) ? obj2 : o(i6, i10, this.f40852p.d(objB), interfaceC6162x4N, obj2, f6, obj3);
    }

    private static java.lang.reflect.Field s(java.lang.Class cls, java.lang.String str) {
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

    private static void t(int i6, java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        if (obj instanceof java.lang.String) {
            x6.f(i6, (java.lang.String) obj);
        } else {
            x6.q(i6, (com.google.android.gms.internal.measurement.L3) obj);
        }
    }

    private static void u(com.google.android.gms.internal.measurement.F5 f6, java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        f6.g(f6.k(obj), x6);
    }

    private final void v(com.google.android.gms.internal.measurement.X5 x6, int i6, java.lang.Object obj, int i10) {
        if (obj != null) {
            this.f40852p.b(Q(i10));
            x6.n(i6, null, this.f40852p.e(obj));
        }
    }

    private final void w(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        f40836r.putObject(obj, G(i10) & 1048575, obj2);
        E(obj, i6, i10);
    }

    private final void x(java.lang.Object obj, int i6, java.lang.Object obj2) {
        f40836r.putObject(obj, G(i6) & 1048575, obj2);
        D(obj, i6);
    }

    private final void y(java.lang.Object obj, java.lang.Object obj2, int i6) {
        if (J(obj2, i6)) {
            long jG = G(i6) & 1048575;
            sun.misc.Unsafe unsafe = f40836r;
            java.lang.Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f40837a[i6] + " is present but null: " + java.lang.String.valueOf(obj2));
            }
            com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5O = O(i6);
            if (!J(obj, i6)) {
                if (T(object)) {
                    java.lang.Object objA = interfaceC6100p5O.a();
                    interfaceC6100p5O.f(objA, object);
                    unsafe.putObject(obj, jG, objA);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                D(obj, i6);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, jG);
            if (!T(object2)) {
                java.lang.Object objA2 = interfaceC6100p5O.a();
                interfaceC6100p5O.f(objA2, object2);
                unsafe.putObject(obj, jG, objA2);
                object2 = objA2;
            }
            interfaceC6100p5O.f(object2, object);
        }
    }

    private final boolean z(java.lang.Object obj, int i6, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return J(obj, i6);
        }
        return (i11 & i12) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final java.lang.Object a() {
        return this.f40848l.b(this.f40841e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r12
  0x0071: PHI (r12v4 int) = 
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v8 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v1 int)
  (r12v9 int)
  (r12v1 int)
 binds: [B:18:0x0058, B:182:0x03f3, B:179:0x03e3, B:174:0x03cb, B:171:0x03b6, B:168:0x03a1, B:165:0x038c, B:162:0x0377, B:159:0x0366, B:156:0x0356, B:153:0x0342, B:150:0x032d, B:147:0x0318, B:129:0x0253, B:126:0x0245, B:123:0x0237, B:120:0x0229, B:117:0x021b, B:114:0x020e, B:111:0x0201, B:108:0x01f4, B:105:0x01e7, B:102:0x01da, B:99:0x01cd, B:96:0x01c0, B:93:0x01b3, B:90:0x019b, B:85:0x0167, B:82:0x015b, B:79:0x014b, B:76:0x013b, B:73:0x012b, B:70:0x011f, B:67:0x0113, B:64:0x0107, B:58:0x00f0, B:54:0x00dd, B:50:0x00cc, B:46:0x00bd, B:42:0x00ae, B:40:0x00a8, B:38:0x00a1, B:35:0x0096, B:31:0x0087, B:27:0x0078, B:24:0x0070, B:21:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2 A[PHI: r0
  0x00d2: PHI (r0v190 java.lang.Object) = (r0v43 java.lang.Object), (r0v49 java.lang.Object), (r0v185 java.lang.Object), (r0v194 java.lang.Object) binds: [B:176:0x03d3, B:169:0x03a3, B:60:0x00f8, B:51:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb A[PHI: r0
  0x00fb: PHI (r0v181 java.lang.Object) = (r0v43 java.lang.Object), (r0v185 java.lang.Object) binds: [B:176:0x03d3, B:60:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01da, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f4, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0201, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020e, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0245, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0253, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0356, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0366, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03e3, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (K(r18, r13, r11) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        r0 = com.google.android.gms.internal.measurement.AbstractC5982c4.e0(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (K(r18, r13, r11) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r1 = com.google.android.gms.internal.measurement.AbstractC5982c4.p0(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (K(r18, r13, r11) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r0 = com.google.android.gms.internal.measurement.AbstractC5982c4.z(r13, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.AbstractC5982c4.s0(r13) + com.google.android.gms.internal.measurement.AbstractC5982c4.v0(r0)) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cd, code lost:
    
        if (r0 > 0) goto L91;
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5992d5.b(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4 A[PHI: r3
  0x00f4: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:74:0x0110, B:68:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final int c(java.lang.Object obj) {
        int i6;
        double dA;
        float fN;
        boolean zF;
        java.lang.Object objB;
        int iT;
        long jX;
        java.lang.Object objB2;
        int length = this.f40837a.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iG = G(i11);
            int i12 = this.f40837a[i11];
            long j6 = 1048575 & iG;
            int iHashCode = 37;
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    i6 = i10 * 53;
                    dA = com.google.android.gms.internal.measurement.G5.a(obj, j6);
                    jX = java.lang.Double.doubleToLongBits(dA);
                    iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                    i10 = i6 + iT;
                    break;
                case 1:
                    i6 = i10 * 53;
                    fN = com.google.android.gms.internal.measurement.G5.n(obj, j6);
                    iT = java.lang.Float.floatToIntBits(fN);
                    i10 = i6 + iT;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i6 = i10 * 53;
                    jX = com.google.android.gms.internal.measurement.G5.x(obj, j6);
                    iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                    i10 = i6 + iT;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i6 = i10 * 53;
                    iT = com.google.android.gms.internal.measurement.G5.t(obj, j6);
                    i10 = i6 + iT;
                    break;
                case 7:
                    i6 = i10 * 53;
                    zF = com.google.android.gms.internal.measurement.G5.F(obj, j6);
                    iT = com.google.android.gms.internal.measurement.AbstractC6146v4.c(zF);
                    i10 = i6 + iT;
                    break;
                case 8:
                    i6 = i10 * 53;
                    iT = ((java.lang.String) com.google.android.gms.internal.measurement.G5.B(obj, j6)).hashCode();
                    i10 = i6 + iT;
                    break;
                case 9:
                    objB = com.google.android.gms.internal.measurement.G5.B(obj, j6);
                    if (objB != null) {
                        iHashCode = objB.hashCode();
                    }
                    i10 = (i10 * 53) + iHashCode;
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
                    i6 = i10 * 53;
                    objB2 = com.google.android.gms.internal.measurement.G5.B(obj, j6);
                    iT = objB2.hashCode();
                    i10 = i6 + iT;
                    break;
                case 17:
                    objB = com.google.android.gms.internal.measurement.G5.B(obj, j6);
                    if (objB != null) {
                        iHashCode = objB.hashCode();
                    }
                    i10 = (i10 * 53) + iHashCode;
                    break;
                case 51:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        dA = j(obj, j6);
                        jX = java.lang.Double.doubleToLongBits(dA);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                        i10 = i6 + iT;
                    }
                    break;
                case 52:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        fN = B(obj, j6);
                        iT = java.lang.Float.floatToIntBits(fN);
                        i10 = i6 + iT;
                    }
                    break;
                case 53:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        jX = M(obj, j6);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                        i10 = i6 + iT;
                    }
                    break;
                case 54:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        jX = M(obj, j6);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                        i10 = i6 + iT;
                    }
                    break;
                case 55:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = H(obj, j6);
                        i10 = i6 + iT;
                    }
                    break;
                case 56:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        jX = M(obj, j6);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                        i10 = i6 + iT;
                    }
                    break;
                case 57:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = H(obj, j6);
                        i10 = i6 + iT;
                    }
                    break;
                case 58:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        zF = P(obj, j6);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.c(zF);
                        i10 = i6 + iT;
                    }
                    break;
                case 59:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = ((java.lang.String) com.google.android.gms.internal.measurement.G5.B(obj, j6)).hashCode();
                        i10 = i6 + iT;
                    }
                    break;
                case 60:
                    if (K(obj, i12, i11)) {
                        objB2 = com.google.android.gms.internal.measurement.G5.B(obj, j6);
                        i6 = i10 * 53;
                        iT = objB2.hashCode();
                        i10 = i6 + iT;
                    }
                    break;
                case 61:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        objB2 = com.google.android.gms.internal.measurement.G5.B(obj, j6);
                        iT = objB2.hashCode();
                        i10 = i6 + iT;
                    }
                    break;
                case 62:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = H(obj, j6);
                        i10 = i6 + iT;
                    }
                    break;
                case 63:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = H(obj, j6);
                        i10 = i6 + iT;
                    }
                    break;
                case 64:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = H(obj, j6);
                        i10 = i6 + iT;
                    }
                    break;
                case 65:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        jX = M(obj, j6);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                        i10 = i6 + iT;
                    }
                    break;
                case 66:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        iT = H(obj, j6);
                        i10 = i6 + iT;
                    }
                    break;
                case 67:
                    if (K(obj, i12, i11)) {
                        i6 = i10 * 53;
                        jX = M(obj, j6);
                        iT = com.google.android.gms.internal.measurement.AbstractC6146v4.b(jX);
                        i10 = i6 + iT;
                    }
                    break;
                case 68:
                    if (K(obj, i12, i11)) {
                        objB2 = com.google.android.gms.internal.measurement.G5.B(obj, j6);
                        i6 = i10 * 53;
                        iT = objB2.hashCode();
                        i10 = i6 + iT;
                    }
                    break;
            }
        }
        int iHashCode2 = (i10 * 53) + this.f40850n.k(obj).hashCode();
        return this.f40842f ? (iHashCode2 * 53) + this.f40851o.b(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7 A[LOOP:1: B:44:0x00b6->B:49:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final boolean d(java.lang.Object obj) {
        int i6;
        int i10;
        java.util.List list;
        com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5O;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f40846j) {
            int i15 = this.f40845i[i14];
            int i16 = this.f40837a[i15];
            int iG = G(i15);
            int i17 = this.f40837a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f40836r.getInt(obj, i18);
                }
                i10 = i13;
                i6 = i18;
            } else {
                i6 = i12;
                i10 = i13;
            }
            if ((268435456 & iG) != 0 && !z(obj, i15, i6, i10, i19)) {
                return false;
            }
            int i20 = (267386880 & iG) >>> 20;
            if (i20 == 9 || i20 == 17) {
                if (z(obj, i15, i6, i10, i19) && !A(obj, iG, O(i15))) {
                    return false;
                }
            } else if (i20 == 27) {
                list = (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC6100p5O = O(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!interfaceC6100p5O.d(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (i20 == 60 || i20 == 68) {
                if (K(obj, i16, i15) && !A(obj, iG, O(i15))) {
                    return false;
                }
            } else if (i20 == 49) {
                list = (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575);
                if (list.isEmpty()) {
                    interfaceC6100p5O = O(i15);
                    while (i11 < list.size()) {
                        if (!interfaceC6100p5O.d(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (i20 == 50 && !this.f40852p.e(com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575)).isEmpty()) {
                this.f40852p.b(Q(i15));
                throw null;
            }
            i14++;
            i12 = i6;
            i13 = i10;
        }
        return !this.f40842f || this.f40851o.b(obj).n();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:24:0x005f for B:16:0x0039 already processed. Defaulting to fallback option. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void e(java.lang.Object obj) {
        if (T(obj)) {
            if (obj instanceof com.google.android.gms.internal.measurement.AbstractC6130t4) {
                com.google.android.gms.internal.measurement.AbstractC6130t4 abstractC6130t4 = (com.google.android.gms.internal.measurement.AbstractC6130t4) obj;
                abstractC6130t4.i(Integer.MAX_VALUE);
                abstractC6130t4.zza = 0;
                abstractC6130t4.D();
            }
            int length = this.f40837a.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int iG = G(i6);
                long j6 = 1048575 & iG;
                int i10 = (iG & 267386880) >>> 20;
                if (i10 != 9) {
                    if (i10 != 60 && i10 != 68) {
                        switch (i10) {
                            case 17:
                                if (J(obj, i6)) {
                                    O(i6).e(f40836r.getObject(obj, j6));
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
                                this.f40849m.a(obj, j6);
                                continue;
                            case 50:
                                sun.misc.Unsafe unsafe = f40836r;
                                java.lang.Object object = unsafe.getObject(obj, j6);
                                if (object != null) {
                                    unsafe.putObject(obj, j6, this.f40852p.g(object));
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (K(obj, this.f40837a[i6], i6)) {
                        O(i6).e(f40836r.getObject(obj, j6));
                    }
                } else if (J(obj, i6)) {
                    O(i6).e(f40836r.getObject(obj, j6));
                }
            }
            this.f40850n.l(obj);
            if (this.f40842f) {
                this.f40851o.f(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void f(java.lang.Object obj, java.lang.Object obj2) {
        R(obj);
        obj2.getClass();
        for (int i6 = 0; i6 < this.f40837a.length; i6 += 3) {
            int iG = G(i6);
            long j6 = 1048575 & iG;
            int i10 = this.f40837a[i6];
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.f(obj, j6, com.google.android.gms.internal.measurement.G5.a(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 1:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.g(obj, j6, com.google.android.gms.internal.measurement.G5.n(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 2:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.i(obj, j6, com.google.android.gms.internal.measurement.G5.x(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 3:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.i(obj, j6, com.google.android.gms.internal.measurement.G5.x(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 4:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.h(obj, j6, com.google.android.gms.internal.measurement.G5.t(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 5:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.i(obj, j6, com.google.android.gms.internal.measurement.G5.x(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 6:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.h(obj, j6, com.google.android.gms.internal.measurement.G5.t(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 7:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.v(obj, j6, com.google.android.gms.internal.measurement.G5.F(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 8:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.j(obj, j6, com.google.android.gms.internal.measurement.G5.B(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 9:
                case 17:
                    y(obj, obj2, i6);
                    break;
                case 10:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.j(obj, j6, com.google.android.gms.internal.measurement.G5.B(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 11:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.h(obj, j6, com.google.android.gms.internal.measurement.G5.t(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 12:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.h(obj, j6, com.google.android.gms.internal.measurement.G5.t(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 13:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.h(obj, j6, com.google.android.gms.internal.measurement.G5.t(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 14:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.i(obj, j6, com.google.android.gms.internal.measurement.G5.x(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 15:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.h(obj, j6, com.google.android.gms.internal.measurement.G5.t(obj2, j6));
                        D(obj, i6);
                    }
                    break;
                case 16:
                    if (J(obj2, i6)) {
                        com.google.android.gms.internal.measurement.G5.i(obj, j6, com.google.android.gms.internal.measurement.G5.x(obj2, j6));
                        D(obj, i6);
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
                    this.f40849m.b(obj, obj2, j6);
                    break;
                case 50:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.m(this.f40852p, obj, obj2, j6);
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
                    if (K(obj2, i10, i6)) {
                        com.google.android.gms.internal.measurement.G5.j(obj, j6, com.google.android.gms.internal.measurement.G5.B(obj2, j6));
                        E(obj, i10, i6);
                    }
                    break;
                case 60:
                case 68:
                    F(obj, obj2, i6);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (K(obj2, i10, i6)) {
                        com.google.android.gms.internal.measurement.G5.j(obj, j6, com.google.android.gms.internal.measurement.G5.B(obj2, j6));
                        E(obj, i10, i6);
                    }
                    break;
            }
        }
        com.google.android.gms.internal.measurement.AbstractC6115r5.n(this.f40850n, obj, obj2);
        if (this.f40842f) {
            com.google.android.gms.internal.measurement.AbstractC6115r5.l(this.f40851o, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:190:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void g(java.lang.Object obj, com.google.android.gms.internal.measurement.X5 x6) {
        java.util.Map.Entry entry;
        java.util.Iterator it;
        int i6;
        int i10;
        int i11;
        boolean z6;
        int i12;
        sun.misc.Unsafe unsafe;
        boolean z10;
        java.util.Iterator itI;
        java.util.Map.Entry entry2;
        double dA;
        float fN;
        long jX;
        long jX2;
        int iT;
        long jX3;
        int iT2;
        boolean zF;
        int iT3;
        int iT4;
        int iT5;
        long jX4;
        int iT6;
        long jX5;
        com.google.android.gms.internal.measurement.X5 x10 = x6;
        int i13 = 267386880;
        int i14 = 1048575;
        if (x6.a() == 2) {
            u(this.f40850n, obj, x10);
            if (this.f40842f) {
                com.google.android.gms.internal.measurement.C6072m4 c6072m4B = this.f40851o.b(obj);
                if (c6072m4B.f41036a.isEmpty()) {
                    itI = null;
                    entry2 = null;
                } else {
                    itI = c6072m4B.i();
                    entry2 = (java.util.Map.Entry) itI.next();
                }
            } else {
                itI = null;
                entry2 = null;
            }
            for (int length = this.f40837a.length - 3; length >= 0; length -= 3) {
                int iG = G(length);
                int i15 = this.f40837a[length];
                while (entry2 != null && this.f40851o.a(entry2) > i15) {
                    this.f40851o.c(x10, entry2);
                    entry2 = itI.hasNext() ? (java.util.Map.Entry) itI.next() : null;
                }
                switch ((iG & 267386880) >>> 20) {
                    case 0:
                        if (J(obj, length)) {
                            dA = com.google.android.gms.internal.measurement.G5.a(obj, iG & 1048575);
                            x10.A(i15, dA);
                        }
                        break;
                    case 1:
                        if (J(obj, length)) {
                            fN = com.google.android.gms.internal.measurement.G5.n(obj, iG & 1048575);
                            x10.C(i15, fN);
                        }
                        break;
                    case 2:
                        if (J(obj, length)) {
                            jX = com.google.android.gms.internal.measurement.G5.x(obj, iG & 1048575);
                            x10.m(i15, jX);
                        }
                        break;
                    case 3:
                        if (J(obj, length)) {
                            jX2 = com.google.android.gms.internal.measurement.G5.x(obj, iG & 1048575);
                            x10.i(i15, jX2);
                        }
                        break;
                    case 4:
                        if (J(obj, length)) {
                            iT = com.google.android.gms.internal.measurement.G5.t(obj, iG & 1048575);
                            x10.u(i15, iT);
                        }
                        break;
                    case 5:
                        if (J(obj, length)) {
                            jX3 = com.google.android.gms.internal.measurement.G5.x(obj, iG & 1048575);
                            x10.e(i15, jX3);
                        }
                        break;
                    case 6:
                        if (J(obj, length)) {
                            iT2 = com.google.android.gms.internal.measurement.G5.t(obj, iG & 1048575);
                            x10.o(i15, iT2);
                        }
                        break;
                    case 7:
                        if (J(obj, length)) {
                            zF = com.google.android.gms.internal.measurement.G5.F(obj, iG & 1048575);
                            x10.j(i15, zF);
                        }
                        break;
                    case 8:
                        if (J(obj, length)) {
                            t(i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10);
                        }
                        break;
                    case 9:
                        if (J(obj, length)) {
                            x10.H(i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), O(length));
                        }
                        break;
                    case 10:
                        if (J(obj, length)) {
                            x10.q(i15, (com.google.android.gms.internal.measurement.L3) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575));
                        }
                        break;
                    case 11:
                        if (J(obj, length)) {
                            iT3 = com.google.android.gms.internal.measurement.G5.t(obj, iG & 1048575);
                            x10.E(i15, iT3);
                        }
                        break;
                    case 12:
                        if (J(obj, length)) {
                            iT4 = com.google.android.gms.internal.measurement.G5.t(obj, iG & 1048575);
                            x10.z(i15, iT4);
                        }
                        break;
                    case 13:
                        if (J(obj, length)) {
                            iT5 = com.google.android.gms.internal.measurement.G5.t(obj, iG & 1048575);
                            x10.K(i15, iT5);
                        }
                        break;
                    case 14:
                        if (J(obj, length)) {
                            jX4 = com.google.android.gms.internal.measurement.G5.x(obj, iG & 1048575);
                            x10.v(i15, jX4);
                        }
                        break;
                    case 15:
                        if (J(obj, length)) {
                            iT6 = com.google.android.gms.internal.measurement.G5.t(obj, iG & 1048575);
                            x10.N(i15, iT6);
                        }
                        break;
                    case 16:
                        if (J(obj, length)) {
                            jX5 = com.google.android.gms.internal.measurement.G5.x(obj, iG & 1048575);
                            x10.L(i15, jX5);
                        }
                        break;
                    case 17:
                        if (J(obj, length)) {
                            x10.F(i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), O(length));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.w(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.I(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.O(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.Y(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.L(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.F(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.C(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.k(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.u(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10);
                        break;
                    case 27:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.v(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, O(length));
                        break;
                    case 28:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.i(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10);
                        break;
                    case 29:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.X(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.z(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.R(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.U(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.V(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.W(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.w(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.I(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.O(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.Y(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.L(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.F(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.C(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.k(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.X(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.z(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.R(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.U(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.V(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.W(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.measurement.AbstractC6115r5.j(this.f40837a[length], (java.util.List) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10, O(length));
                        break;
                    case 50:
                        v(x10, i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), length);
                        break;
                    case 51:
                        if (K(obj, i15, length)) {
                            dA = j(obj, iG & 1048575);
                            x10.A(i15, dA);
                        }
                        break;
                    case 52:
                        if (K(obj, i15, length)) {
                            fN = B(obj, iG & 1048575);
                            x10.C(i15, fN);
                        }
                        break;
                    case 53:
                        if (K(obj, i15, length)) {
                            jX = M(obj, iG & 1048575);
                            x10.m(i15, jX);
                        }
                        break;
                    case 54:
                        if (K(obj, i15, length)) {
                            jX2 = M(obj, iG & 1048575);
                            x10.i(i15, jX2);
                        }
                        break;
                    case 55:
                        if (K(obj, i15, length)) {
                            iT = H(obj, iG & 1048575);
                            x10.u(i15, iT);
                        }
                        break;
                    case 56:
                        if (K(obj, i15, length)) {
                            jX3 = M(obj, iG & 1048575);
                            x10.e(i15, jX3);
                        }
                        break;
                    case 57:
                        if (K(obj, i15, length)) {
                            iT2 = H(obj, iG & 1048575);
                            x10.o(i15, iT2);
                        }
                        break;
                    case 58:
                        if (K(obj, i15, length)) {
                            zF = P(obj, iG & 1048575);
                            x10.j(i15, zF);
                        }
                        break;
                    case 59:
                        if (K(obj, i15, length)) {
                            t(i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), x10);
                        }
                        break;
                    case 60:
                        if (K(obj, i15, length)) {
                            x10.H(i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), O(length));
                        }
                        break;
                    case 61:
                        if (K(obj, i15, length)) {
                            x10.q(i15, (com.google.android.gms.internal.measurement.L3) com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575));
                        }
                        break;
                    case 62:
                        if (K(obj, i15, length)) {
                            iT3 = H(obj, iG & 1048575);
                            x10.E(i15, iT3);
                        }
                        break;
                    case 63:
                        if (K(obj, i15, length)) {
                            iT4 = H(obj, iG & 1048575);
                            x10.z(i15, iT4);
                        }
                        break;
                    case 64:
                        if (K(obj, i15, length)) {
                            iT5 = H(obj, iG & 1048575);
                            x10.K(i15, iT5);
                        }
                        break;
                    case 65:
                        if (K(obj, i15, length)) {
                            jX4 = M(obj, iG & 1048575);
                            x10.v(i15, jX4);
                        }
                        break;
                    case 66:
                        if (K(obj, i15, length)) {
                            iT6 = H(obj, iG & 1048575);
                            x10.N(i15, iT6);
                        }
                        break;
                    case 67:
                        if (K(obj, i15, length)) {
                            jX5 = M(obj, iG & 1048575);
                            x10.L(i15, jX5);
                        }
                        break;
                    case 68:
                        if (K(obj, i15, length)) {
                            x10.F(i15, com.google.android.gms.internal.measurement.G5.B(obj, iG & 1048575), O(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.f40851o.c(x10, entry2);
                entry2 = itI.hasNext() ? (java.util.Map.Entry) itI.next() : null;
            }
            return;
        }
        if (this.f40842f) {
            com.google.android.gms.internal.measurement.C6072m4 c6072m4B2 = this.f40851o.b(obj);
            if (c6072m4B2.f41036a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                java.util.Iterator itL = c6072m4B2.l();
                entry = (java.util.Map.Entry) itL.next();
                it = itL;
            }
        } else {
            entry = null;
            it = null;
        }
        int length2 = this.f40837a.length;
        sun.misc.Unsafe unsafe2 = f40836r;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i17 < length2) {
            int iG2 = G(i17);
            int[] iArr = this.f40837a;
            int i19 = iArr[i17];
            int i20 = (iG2 & i13) >>> 20;
            if (i20 <= 17) {
                int i21 = iArr[i17 + 2];
                int i22 = i21 & i14;
                if (i22 != i18) {
                    i16 = i22 == i14 ? 0 : unsafe2.getInt(obj, i22);
                    i18 = i22;
                }
                i10 = i16;
                i11 = 1 << (i21 >>> 20);
                i6 = i18;
            } else {
                i6 = i18;
                i10 = i16;
                i11 = 0;
            }
            while (entry != null && this.f40851o.a(entry) <= i19) {
                this.f40851o.c(x10, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j6 = iG2 & 1048575;
            switch (i20) {
                case 0:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.A(i19, com.google.android.gms.internal.measurement.G5.a(obj, j6));
                    }
                    break;
                case 1:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.C(i19, com.google.android.gms.internal.measurement.G5.n(obj, j6));
                    }
                    break;
                case 2:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.m(i19, unsafe.getLong(obj, j6));
                    }
                    break;
                case 3:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.i(i19, unsafe.getLong(obj, j6));
                    }
                    break;
                case 4:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.u(i19, unsafe.getInt(obj, j6));
                    }
                    break;
                case 5:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.e(i19, unsafe.getLong(obj, j6));
                    }
                    break;
                case 6:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.o(i19, unsafe.getInt(obj, j6));
                    }
                    break;
                case 7:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.j(i19, com.google.android.gms.internal.measurement.G5.F(obj, j6));
                    }
                    break;
                case 8:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        t(i19, unsafe.getObject(obj, j6), x10);
                    }
                    break;
                case 9:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.H(i19, unsafe.getObject(obj, j6), O(i12));
                    }
                    break;
                case 10:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.q(i19, (com.google.android.gms.internal.measurement.L3) unsafe.getObject(obj, j6));
                    }
                    break;
                case 11:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.E(i19, unsafe.getInt(obj, j6));
                    }
                    break;
                case 12:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.z(i19, unsafe.getInt(obj, j6));
                    }
                    break;
                case 13:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.K(i19, unsafe.getInt(obj, j6));
                    }
                    break;
                case 14:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.v(i19, unsafe.getLong(obj, j6));
                    }
                    break;
                case 15:
                    i6 = i6;
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.N(i19, unsafe.getInt(obj, j6));
                    }
                    break;
                case 16:
                    entry = entry;
                    length2 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    i6 = i6;
                    if (z(obj, i12, i6, i10, i11)) {
                        x10.L(i19, unsafe.getLong(obj, j6));
                    }
                    break;
                case 17:
                    z6 = false;
                    entry = entry;
                    i12 = i17;
                    length2 = length2;
                    unsafe = unsafe2;
                    if (z(obj, i17, i6, i10, i11)) {
                        x10 = x6;
                        x10.F(i19, unsafe.getObject(obj, j6), O(i12));
                    } else {
                        x10 = x6;
                    }
                    i6 = i6;
                    break;
                case 18:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.w(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 19:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.I(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 20:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.O(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.Y(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 22:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.L(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 23:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.F(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 24:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.C(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 25:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.k(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 26:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.u(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 27:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.v(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, O(i17));
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 28:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.i(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 29:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.X(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 30:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.z(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 31:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.R(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 32:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.U(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.V(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 34:
                    z10 = false;
                    com.google.android.gms.internal.measurement.AbstractC6115r5.W(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, false);
                    z6 = z10;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 35:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.w(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 36:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.I(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 37:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.O(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 38:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.Y(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 39:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.L(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 40:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.F(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 41:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.C(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 42:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.k(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 43:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.X(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 44:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.z(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 45:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.R(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 46:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.U(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 47:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.V(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 48:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.W(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, true);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 49:
                    com.google.android.gms.internal.measurement.AbstractC6115r5.j(this.f40837a[i17], (java.util.List) unsafe2.getObject(obj, j6), x10, O(i17));
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 50:
                    v(x10, i19, unsafe2.getObject(obj, j6), i17);
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 51:
                    if (K(obj, i19, i17)) {
                        x10.A(i19, j(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 52:
                    if (K(obj, i19, i17)) {
                        x10.C(i19, B(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 53:
                    if (K(obj, i19, i17)) {
                        x10.m(i19, M(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 54:
                    if (K(obj, i19, i17)) {
                        x10.i(i19, M(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 55:
                    if (K(obj, i19, i17)) {
                        x10.u(i19, H(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 56:
                    if (K(obj, i19, i17)) {
                        x10.e(i19, M(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 57:
                    if (K(obj, i19, i17)) {
                        x10.o(i19, H(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 58:
                    if (K(obj, i19, i17)) {
                        x10.j(i19, P(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 59:
                    if (K(obj, i19, i17)) {
                        t(i19, unsafe2.getObject(obj, j6), x10);
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 60:
                    if (K(obj, i19, i17)) {
                        x10.H(i19, unsafe2.getObject(obj, j6), O(i17));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 61:
                    if (K(obj, i19, i17)) {
                        x10.q(i19, (com.google.android.gms.internal.measurement.L3) unsafe2.getObject(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 62:
                    if (K(obj, i19, i17)) {
                        x10.E(i19, H(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 63:
                    if (K(obj, i19, i17)) {
                        x10.z(i19, H(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 64:
                    if (K(obj, i19, i17)) {
                        x10.K(i19, H(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 65:
                    if (K(obj, i19, i17)) {
                        x10.v(i19, M(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 66:
                    if (K(obj, i19, i17)) {
                        x10.N(i19, H(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 67:
                    if (K(obj, i19, i17)) {
                        x10.L(i19, M(obj, j6));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 68:
                    if (K(obj, i19, i17)) {
                        x10.F(i19, unsafe2.getObject(obj, j6), O(i17));
                    }
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                default:
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
            }
            i17 = i12 + 3;
            i16 = i10;
            unsafe2 = unsafe;
            i14 = 1048575;
            it = it;
            entry = entry;
            length2 = length2;
            i18 = i6;
            i13 = 267386880;
        }
        java.util.Iterator it2 = it;
        while (entry != null) {
            this.f40851o.c(x10, entry);
            entry = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
        }
        u(this.f40850n, obj, x10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final void h(java.lang.Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.measurement.K3 k6) throws com.google.android.gms.internal.measurement.C4 {
        m(obj, bArr, i6, i10, 0, k6);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC6100p5
    public final boolean i(java.lang.Object obj, java.lang.Object obj2) {
        int length = this.f40837a.length;
        int i6 = 0;
        while (true) {
            boolean zP = true;
            if (i6 >= length) {
                if (!this.f40850n.k(obj).equals(this.f40850n.k(obj2))) {
                    return false;
                }
                if (this.f40842f) {
                    return this.f40851o.b(obj).equals(this.f40851o.b(obj2));
                }
                return true;
            }
            int iG = G(i6);
            long j6 = iG & 1048575;
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    if (!L(obj, obj2, i6) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.G5.a(obj, j6)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.G5.a(obj2, j6))) {
                        zP = false;
                    }
                    break;
                case 1:
                    if (!L(obj, obj2, i6) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.G5.n(obj, j6)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.G5.n(obj2, j6))) {
                        zP = false;
                    }
                    break;
                case 2:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.x(obj, j6) != com.google.android.gms.internal.measurement.G5.x(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 3:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.x(obj, j6) != com.google.android.gms.internal.measurement.G5.x(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 4:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.t(obj, j6) != com.google.android.gms.internal.measurement.G5.t(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 5:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.x(obj, j6) != com.google.android.gms.internal.measurement.G5.x(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 6:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.t(obj, j6) != com.google.android.gms.internal.measurement.G5.t(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 7:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.F(obj, j6) != com.google.android.gms.internal.measurement.G5.F(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 8:
                    if (!L(obj, obj2, i6) || !com.google.android.gms.internal.measurement.AbstractC6115r5.p(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6))) {
                        zP = false;
                    }
                    break;
                case 9:
                    if (!L(obj, obj2, i6) || !com.google.android.gms.internal.measurement.AbstractC6115r5.p(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6))) {
                        zP = false;
                    }
                    break;
                case 10:
                    if (!L(obj, obj2, i6) || !com.google.android.gms.internal.measurement.AbstractC6115r5.p(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6))) {
                        zP = false;
                    }
                    break;
                case 11:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.t(obj, j6) != com.google.android.gms.internal.measurement.G5.t(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 12:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.t(obj, j6) != com.google.android.gms.internal.measurement.G5.t(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 13:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.t(obj, j6) != com.google.android.gms.internal.measurement.G5.t(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 14:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.x(obj, j6) != com.google.android.gms.internal.measurement.G5.x(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 15:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.t(obj, j6) != com.google.android.gms.internal.measurement.G5.t(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 16:
                    if (!L(obj, obj2, i6) || com.google.android.gms.internal.measurement.G5.x(obj, j6) != com.google.android.gms.internal.measurement.G5.x(obj2, j6)) {
                        zP = false;
                    }
                    break;
                case 17:
                    if (!L(obj, obj2, i6) || !com.google.android.gms.internal.measurement.AbstractC6115r5.p(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6))) {
                        zP = false;
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
                case 50:
                    zP = com.google.android.gms.internal.measurement.AbstractC6115r5.p(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6));
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
                    long jC = C(i6) & 1048575;
                    if (com.google.android.gms.internal.measurement.G5.t(obj, jC) != com.google.android.gms.internal.measurement.G5.t(obj2, jC) || !com.google.android.gms.internal.measurement.AbstractC6115r5.p(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6))) {
                        zP = false;
                    }
                    break;
            }
            if (!zP) {
                return false;
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:223:0x0633  */
    /* JADX WARN: Code duplicated, block: B:225:0x063b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0643 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x0646  */
    /* JADX WARN: Code duplicated, block: B:523:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0879 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x05af -> B:187:0x0589). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x0643 -> B:219:0x0622). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x0690 -> B:239:0x0667). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    final int m(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.K3 r36) throws com.google.android.gms.internal.measurement.C4 {
        /*
            Method dump skipped, instruction units count: 3202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5992d5.m(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.K3):int");
    }
}
