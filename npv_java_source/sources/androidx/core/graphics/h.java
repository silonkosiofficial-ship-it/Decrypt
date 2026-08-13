package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f21556b;

        a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private char f21557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f21558b;

        b(char c6, float[] fArr) {
            this.f21557a = c6;
            this.f21558b = fArr;
        }

        b(androidx.core.graphics.h.b bVar) {
            this.f21557a = bVar.f21557a;
            float[] fArr = bVar.f21558b;
            this.f21558b = androidx.core.graphics.h.c(fArr, 0, fArr.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(android.graphics.Path path, float[] fArr, char c6, char c10, float[] fArr2) {
            int i6;
            int i10;
            int i11;
            float f6;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            char c11 = c10;
            boolean z6 = false;
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr[2];
            float f20 = fArr[3];
            float f21 = fArr[4];
            float f22 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i6 = 7;
                    i10 = i6;
                    break;
                case 'C':
                case 'c':
                    i6 = 6;
                    i10 = i6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i10 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                    i10 = 2;
                    break;
            }
            float f23 = f17;
            float f24 = f18;
            float f25 = f21;
            float f26 = f22;
            int i12 = 0;
            char c12 = c6;
            while (i12 < fArr2.length) {
                if (c11 != 'A') {
                    if (c11 == 'C') {
                        i11 = i12;
                        int i13 = i11 + 2;
                        int i14 = i11 + 3;
                        int i15 = i11 + 4;
                        int i16 = i11 + 5;
                        path.cubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        f23 = fArr2[i15];
                        float f27 = fArr2[i16];
                        float f28 = fArr2[i13];
                        float f29 = fArr2[i14];
                        f24 = f27;
                        f20 = f29;
                        f19 = f28;
                    } else if (c11 == 'H') {
                        i11 = i12;
                        path.lineTo(fArr2[i11], f24);
                        f23 = fArr2[i11];
                    } else if (c11 == 'Q') {
                        i11 = i12;
                        int i17 = i11 + 1;
                        int i18 = i11 + 2;
                        int i19 = i11 + 3;
                        path.quadTo(fArr2[i11], fArr2[i17], fArr2[i18], fArr2[i19]);
                        float f30 = fArr2[i11];
                        float f31 = fArr2[i17];
                        f23 = fArr2[i18];
                        f24 = fArr2[i19];
                        f19 = f30;
                        f20 = f31;
                    } else if (c11 == 'V') {
                        i11 = i12;
                        path.lineTo(f23, fArr2[i11]);
                        f24 = fArr2[i11];
                    } else if (c11 != 'a') {
                        if (c11 != 'c') {
                            if (c11 == 'h') {
                                path.rLineTo(fArr2[i12], 0.0f);
                                f23 += fArr2[i12];
                            } else if (c11 != 'q') {
                                if (c11 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i12]);
                                    f12 = fArr2[i12];
                                } else if (c11 == 'L') {
                                    int i20 = i12 + 1;
                                    path.lineTo(fArr2[i12], fArr2[i20]);
                                    f23 = fArr2[i12];
                                    f24 = fArr2[i20];
                                } else if (c11 == 'M') {
                                    f23 = fArr2[i12];
                                    f24 = fArr2[i12 + 1];
                                    if (i12 > 0) {
                                        path.lineTo(f23, f24);
                                    } else {
                                        path.moveTo(f23, f24);
                                        i11 = i12;
                                        f26 = f24;
                                        f25 = f23;
                                    }
                                } else if (c11 == 'S') {
                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                        f23 = (f23 * 2.0f) - f19;
                                        f24 = (f24 * 2.0f) - f20;
                                    }
                                    float f32 = f24;
                                    float f33 = f23;
                                    int i21 = i12 + 1;
                                    int i22 = i12 + 2;
                                    int i23 = i12 + 3;
                                    path.cubicTo(f33, f32, fArr2[i12], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f6 = fArr2[i12];
                                    f10 = fArr2[i21];
                                    f23 = fArr2[i22];
                                    f24 = fArr2[i23];
                                    f19 = f6;
                                    f20 = f10;
                                } else if (c11 == 'T') {
                                    if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                        f23 = (f23 * 2.0f) - f19;
                                        f24 = (f24 * 2.0f) - f20;
                                    }
                                    int i24 = i12 + 1;
                                    path.quadTo(f23, f24, fArr2[i12], fArr2[i24]);
                                    i11 = i12;
                                    f20 = f24;
                                    f19 = f23;
                                    f23 = fArr2[i12];
                                    f24 = fArr2[i24];
                                } else if (c11 == 'l') {
                                    int i25 = i12 + 1;
                                    path.rLineTo(fArr2[i12], fArr2[i25]);
                                    f23 += fArr2[i12];
                                    f12 = fArr2[i25];
                                } else if (c11 == 'm') {
                                    float f34 = fArr2[i12];
                                    f23 += f34;
                                    float f35 = fArr2[i12 + 1];
                                    f24 += f35;
                                    if (i12 > 0) {
                                        path.rLineTo(f34, f35);
                                    } else {
                                        path.rMoveTo(f34, f35);
                                        i11 = i12;
                                        f26 = f24;
                                        f25 = f23;
                                    }
                                } else if (c11 == 's') {
                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                        float f36 = f23 - f19;
                                        f13 = f24 - f20;
                                        f14 = f36;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i26 = i12 + 1;
                                    int i27 = i12 + 2;
                                    int i28 = i12 + 3;
                                    path.rCubicTo(f14, f13, fArr2[i12], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    f6 = fArr2[i12] + f23;
                                    f10 = fArr2[i26] + f24;
                                    f23 += fArr2[i27];
                                    f11 = fArr2[i28];
                                } else if (c11 == 't') {
                                    if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                        f15 = f23 - f19;
                                        f16 = f24 - f20;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i29 = i12 + 1;
                                    path.rQuadTo(f15, f16, fArr2[i12], fArr2[i29]);
                                    float f37 = f15 + f23;
                                    float f38 = f16 + f24;
                                    f23 += fArr2[i12];
                                    f24 += fArr2[i29];
                                    f20 = f38;
                                    f19 = f37;
                                }
                                f24 += f12;
                            } else {
                                int i30 = i12 + 1;
                                int i31 = i12 + 2;
                                int i32 = i12 + 3;
                                path.rQuadTo(fArr2[i12], fArr2[i30], fArr2[i31], fArr2[i32]);
                                f6 = fArr2[i12] + f23;
                                f10 = fArr2[i30] + f24;
                                f23 += fArr2[i31];
                                f11 = fArr2[i32];
                            }
                            i11 = i12;
                        } else {
                            int i33 = i12 + 2;
                            int i34 = i12 + 3;
                            int i35 = i12 + 4;
                            int i36 = i12 + 5;
                            path.rCubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                            f6 = fArr2[i33] + f23;
                            f10 = fArr2[i34] + f24;
                            f23 += fArr2[i35];
                            f11 = fArr2[i36];
                        }
                        f24 += f11;
                        f19 = f6;
                        f20 = f10;
                        i11 = i12;
                    } else {
                        int i37 = i12 + 5;
                        int i38 = i12 + 6;
                        i11 = i12;
                        g(path, f23, f24, fArr2[i37] + f23, fArr2[i38] + f24, fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                        f23 += fArr2[i37];
                        f24 += fArr2[i38];
                    }
                    i12 = i11 + i10;
                    c12 = c10;
                    c11 = c12;
                    z6 = false;
                } else {
                    i11 = i12;
                    int i39 = i11 + 5;
                    int i40 = i11 + 6;
                    g(path, f23, f24, fArr2[i39], fArr2[i40], fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                    f23 = fArr2[i39];
                    f24 = fArr2[i40];
                }
                f20 = f24;
                f19 = f23;
                i12 = i11 + i10;
                c12 = c10;
                c11 = c12;
                z6 = false;
            }
            fArr[z6 ? 1 : 0] = f23;
            fArr[1] = f24;
            fArr[2] = f19;
            fArr[3] = f20;
            fArr[4] = f25;
            fArr[5] = f26;
        }

        private static void f(android.graphics.Path path, double d6, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
            double d18 = d11;
            int iCeil = (int) java.lang.Math.ceil(java.lang.Math.abs((d17 * 4.0d) / 3.141592653589793d));
            double dCos = java.lang.Math.cos(d15);
            double dSin = java.lang.Math.sin(d15);
            double dCos2 = java.lang.Math.cos(d16);
            double dSin2 = java.lang.Math.sin(d16);
            double d19 = -d18;
            double d20 = d19 * dCos;
            double d21 = d12 * dSin;
            double d22 = (d20 * dSin2) - (d21 * dCos2);
            double d23 = d19 * dSin;
            double d24 = d12 * dCos;
            double d25 = (dSin2 * d23) + (dCos2 * d24);
            double d26 = d17 / ((double) iCeil);
            double d27 = d25;
            double d28 = d22;
            int i6 = 0;
            double d29 = d13;
            double d30 = d14;
            double d31 = d16;
            while (i6 < iCeil) {
                double d32 = d31 + d26;
                double dSin3 = java.lang.Math.sin(d32);
                double dCos3 = java.lang.Math.cos(d32);
                double d33 = (d6 + ((d18 * dCos) * dCos3)) - (d21 * dSin3);
                double d34 = d10 + (d18 * dSin * dCos3) + (d24 * dSin3);
                double d35 = (d20 * dSin3) - (d21 * dCos3);
                double d36 = (dSin3 * d23) + (dCos3 * d24);
                double d37 = d32 - d31;
                double dTan = java.lang.Math.tan(d37 / 2.0d);
                double dSin4 = (java.lang.Math.sin(d37) * (java.lang.Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d38 = d29 + (d28 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d38, (float) (d30 + (d27 * dSin4)), (float) (d33 - (dSin4 * d35)), (float) (d34 - (dSin4 * d36)), (float) d33, (float) d34);
                i6++;
                d26 = d26;
                dSin = dSin;
                d29 = d33;
                d23 = d23;
                dCos = dCos;
                d31 = d32;
                d27 = d36;
                d28 = d35;
                iCeil = iCeil;
                d30 = d34;
                d18 = d11;
            }
        }

        private static void g(android.graphics.Path path, float f6, float f10, float f11, float f12, float f13, float f14, float f15, boolean z6, boolean z10) {
            double d6;
            double d10;
            double radians = java.lang.Math.toRadians(f15);
            double dCos = java.lang.Math.cos(radians);
            double dSin = java.lang.Math.sin(radians);
            double d11 = f6;
            double d12 = d11 * dCos;
            double d13 = f10;
            double d14 = f13;
            double d15 = (d12 + (d13 * dSin)) / d14;
            double d16 = (((double) (-f6)) * dSin) + (d13 * dCos);
            double d17 = f14;
            double d18 = d16 / d17;
            double d19 = f12;
            double d20 = ((((double) f11) * dCos) + (d19 * dSin)) / d14;
            double d21 = ((((double) (-f11)) * dSin) + (d19 * dCos)) / d17;
            double d22 = d15 - d20;
            double d23 = d18 - d21;
            double d24 = (d15 + d20) / 2.0d;
            double d25 = (d18 + d21) / 2.0d;
            double d26 = (d22 * d22) + (d23 * d23);
            if (d26 == 0.0d) {
                return;
            }
            double d27 = (1.0d / d26) - 0.25d;
            if (d27 < 0.0d) {
                java.lang.String str = "Points are too far apart " + d26;
                float fSqrt = (float) (java.lang.Math.sqrt(d26) / 1.99999d);
                g(path, f6, f10, f11, f12, f13 * fSqrt, f14 * fSqrt, f15, z6, z10);
                return;
            }
            double dSqrt = java.lang.Math.sqrt(d27);
            double d28 = d22 * dSqrt;
            double d29 = dSqrt * d23;
            if (z6 == z10) {
                d6 = d24 - d29;
                d10 = d25 + d28;
            } else {
                d6 = d24 + d29;
                d10 = d25 - d28;
            }
            double dAtan2 = java.lang.Math.atan2(d18 - d10, d15 - d6);
            double dAtan3 = java.lang.Math.atan2(d21 - d10, d20 - d6) - dAtan2;
            if (z10 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d30 = d6 * d14;
            double d31 = d10 * d17;
            f(path, (d30 * dCos) - (d31 * dSin), (d30 * dSin) + (d31 * dCos), d14, d17, d11, d13, radians, dAtan2, dAtan3);
        }

        public static void i(androidx.core.graphics.h.b[] bVarArr, android.graphics.Path path) {
            androidx.core.graphics.h.j(bVarArr, path);
        }

        public void h(androidx.core.graphics.h.b bVar, androidx.core.graphics.h.b bVar2, float f6) {
            this.f21557a = bVar.f21557a;
            int i6 = 0;
            while (true) {
                float[] fArr = bVar.f21558b;
                if (i6 >= fArr.length) {
                    return;
                }
                this.f21558b[i6] = (fArr[i6] * (1.0f - f6)) + (bVar2.f21558b[i6] * f6);
                i6++;
            }
        }
    }

    private static void a(java.util.ArrayList arrayList, char c6, float[] fArr) {
        arrayList.add(new androidx.core.graphics.h.b(c6, fArr));
    }

    public static boolean b(androidx.core.graphics.h.b[] bVarArr, androidx.core.graphics.h.b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < bVarArr.length; i6++) {
            if (bVarArr[i6].f21557a != bVarArr2[i6].f21557a || bVarArr[i6].f21558b.length != bVarArr2[i6].f21558b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i6, int i10) {
        if (i6 > i10) {
            throw new java.lang.IllegalArgumentException();
        }
        int length = fArr.length;
        if (i6 < 0 || i6 > length) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i11 = i10 - i6;
        int iMin = java.lang.Math.min(i11, length - i6);
        float[] fArr2 = new float[i11];
        java.lang.System.arraycopy(fArr, i6, fArr2, 0, iMin);
        return fArr2;
    }

    public static androidx.core.graphics.h.b[] d(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = 0;
        int i10 = 1;
        while (i10 < str.length()) {
            int i11 = i(str, i10);
            java.lang.String strTrim = str.substring(i6, i11).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i6 = i11;
            i10 = i11 + 1;
        }
        if (i10 - i6 == 1 && i6 < str.length()) {
            a(arrayList, str.charAt(i6), new float[0]);
        }
        return (androidx.core.graphics.h.b[]) arrayList.toArray(new androidx.core.graphics.h.b[0]);
    }

    public static android.graphics.Path e(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        try {
            androidx.core.graphics.h.b.i(d(str), path);
            return path;
        } catch (java.lang.RuntimeException e6) {
            throw new java.lang.RuntimeException("Error in parsing " + str, e6);
        }
    }

    public static androidx.core.graphics.h.b[] f(androidx.core.graphics.h.b[] bVarArr) {
        androidx.core.graphics.h.b[] bVarArr2 = new androidx.core.graphics.h.b[bVarArr.length];
        for (int i6 = 0; i6 < bVarArr.length; i6++) {
            bVarArr2[i6] = new androidx.core.graphics.h.b(bVarArr[i6]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    private static void g(java.lang.String str, int i6, androidx.core.graphics.h.a aVar) {
        aVar.f21556b = false;
        boolean z6 = false;
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = i6; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ' ') {
                z6 = false;
                z11 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z6 = false;
                        z11 = true;
                        break;
                    case '-':
                        if (i10 == i6 || z6) {
                            z6 = false;
                        } else {
                            aVar.f21556b = true;
                            z6 = false;
                            z11 = true;
                        }
                        break;
                    case '.':
                        if (z10) {
                            aVar.f21556b = true;
                            z6 = false;
                            z11 = true;
                        } else {
                            z6 = false;
                            z10 = true;
                        }
                        break;
                    default:
                        z6 = false;
                        break;
                }
            } else {
                z6 = true;
            }
            if (z11) {
                aVar.f21555a = i10;
            }
        }
        aVar.f21555a = i10;
    }

    private static float[] h(java.lang.String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            androidx.core.graphics.h.a aVar = new androidx.core.graphics.h.a();
            int length = str.length();
            int i6 = 1;
            int i10 = 0;
            while (i6 < length) {
                g(str, i6, aVar);
                int i11 = aVar.f21555a;
                if (i6 < i11) {
                    fArr[i10] = java.lang.Float.parseFloat(str.substring(i6, i11));
                    i10++;
                }
                i6 = aVar.f21556b ? i11 : i11 + 1;
            }
            return c(fArr, 0, i10);
        } catch (java.lang.NumberFormatException e6) {
            throw new java.lang.RuntimeException("error in parsing \"" + str + "\"", e6);
        }
    }

    private static int i(java.lang.String str, int i6) {
        while (i6 < str.length()) {
            char cCharAt = str.charAt(i6);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i6;
            }
            i6++;
        }
        return i6;
    }

    public static void j(androidx.core.graphics.h.b[] bVarArr, android.graphics.Path path) {
        float[] fArr = new float[6];
        char c6 = 'm';
        for (androidx.core.graphics.h.b bVar : bVarArr) {
            androidx.core.graphics.h.b.e(path, fArr, c6, bVar.f21557a, bVar.f21558b);
            c6 = bVar.f21557a;
        }
    }

    public static void k(androidx.core.graphics.h.b[] bVarArr, androidx.core.graphics.h.b[] bVarArr2) {
        for (int i6 = 0; i6 < bVarArr2.length; i6++) {
            bVarArr[i6].f21557a = bVarArr2[i6].f21557a;
            for (int i10 = 0; i10 < bVarArr2[i6].f21558b.length; i10++) {
                bVarArr[i6].f21558b[i10] = bVarArr2[i6].f21558b[i10];
            }
        }
    }
}
