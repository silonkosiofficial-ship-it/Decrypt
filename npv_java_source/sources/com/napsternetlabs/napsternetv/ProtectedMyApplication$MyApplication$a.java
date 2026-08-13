package com.napsternetlabs.napsternetv;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedMyApplication$MyApplication$a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int Bwe = 40;
    private static final int Du = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44241f = 3;
    private static final int fd = 40;
    private static final int lq = 10;
    private static final int nvp = 30;
    private static final int qsap = 3;
    private static final int jes = h(40);
    private static final byte[][] de = {new byte[]{-1, 7, 10, 15, 20, 26, 18, 20, 24, 30, 18, 20, 24, 26, 30, 22, 24, 28, 30, 28, 28, 28, 28, 30, 30, 26, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30}, new byte[]{-1, 10, 16, 26, 18, 24, 16, 18, 22, 22, 26, 30, 22, 22, 24, 24, 28, 28, 26, 26, 26, 26, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28}, new byte[]{-1, 13, 22, 18, 26, 18, 24, 18, 22, 20, 24, 28, 26, 24, 20, 30, 24, 28, 28, 26, 30, 28, 30, 30, 30, 30, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30}, new byte[]{-1, 17, 28, 22, 16, 22, 28, 26, 26, 24, 28, 24, 28, 22, 24, 24, 30, 28, 28, 26, 28, 30, 24, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30}};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final byte[][] f44240F = {new byte[]{-1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6, 6, 6, 6, 7, 8, 8, 9, 9, 10, 12, 12, 12, 13, 14, 15, 16, 17, 18, 19, 19, 20, 21, 22, 24, 25}, new byte[]{-1, 1, 1, 1, 2, 2, 4, 4, 4, 5, 5, 5, 8, 9, 9, 10, 10, 11, 13, 14, 16, 17, 17, 18, 20, 21, 23, 25, 26, 28, 29, 31, 33, 35, 37, 38, 40, 43, 45, 47, 49}, new byte[]{-1, 1, 1, 2, 2, 4, 4, 6, 6, 8, 8, 8, 10, 12, 16, 12, 17, 16, 18, 21, 20, 23, 23, 25, 27, 29, 34, 34, 35, 38, 40, 43, 45, 48, 51, 53, 56, 59, 62, 65, 68}, new byte[]{-1, 1, 1, 2, 4, 4, 4, 5, 6, 8, 8, 11, 11, 16, 16, 18, 16, 19, 21, 25, 25, 25, 34, 30, 32, 35, 37, 40, 42, 45, 48, 51, 54, 57, 60, 63, 66, 70, 74, 77, 81}};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f44242o = 0;
    public static int wjx = 1;
    public static int zyn = 2;
    public static int jy = 3;

    public class c implements java.lang.reflect.InvocationHandler {
        private java.lang.Class DtE;
        private final java.lang.Object pen;
        private final java.util.Map kiE = new java.util.HashMap();
        private final java.util.Map epqpt = new java.util.HashMap();
        private final java.util.List ir = new java.util.ArrayList();

        public c(java.lang.Object obj) {
            this.pen = obj;
            this.DtE = obj.getClass();
            for (java.lang.reflect.Method method : obj.getClass().getDeclaredMethods()) {
                java.lang.String name = method.getName();
                if (method.getParameterTypes().length <= 0 && !name.equals("toString") && !name.equals("hashCode")) {
                    try {
                        java.lang.Object objInvoke = method.invoke(obj, new java.lang.Object[0]);
                        if (name.equals("annotationType") && (objInvoke instanceof java.lang.Class) && ((java.lang.Class) objInvoke).isAnnotation()) {
                            this.DtE = (java.lang.Class) objInvoke;
                        } else {
                            this.epqpt.put(name, com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.e.r(objInvoke));
                            this.kiE.put(name, method);
                            this.ir.add(name);
                        }
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                    }
                }
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (!obj.getClass().isAnnotation() || ((java.lang.annotation.Annotation) obj).annotationType() != this.DtE) {
                return com.napsternetlabs.napsternetv.ProtectedMyApplication$MyApplication$a.$assertionsDisabled;
            }
            try {
                for (java.lang.String str : this.ir) {
                    if (!com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.e.a(this.epqpt.get(str), ((java.lang.reflect.Method) this.kiE.get(str)).invoke(obj, new java.lang.Object[0]))) {
                        return com.napsternetlabs.napsternetv.ProtectedMyApplication$MyApplication$a.$assertionsDisabled;
                    }
                }
                return true;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                return com.napsternetlabs.napsternetv.ProtectedMyApplication$MyApplication$a.$assertionsDisabled;
            }
        }

        public int hashCode() {
            int iHashCode = 0;
            for (java.lang.String str : this.ir) {
                iHashCode += (str.hashCode() * com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) ^ com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.e.nuDd(this.epqpt.get(str));
            }
            return iHashCode;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.lang.String name = method.getName();
            if (name.equals("annotationType")) {
                return this.DtE;
            }
            if (name.equals("toString")) {
                return toString();
            }
            if (name.equals("hashCode")) {
                return java.lang.Integer.valueOf(hashCode());
            }
            if (name.equals("equals") && objArr.length == 1) {
                return java.lang.Boolean.valueOf(equals(objArr[0]));
            }
            if (this.epqpt.containsKey(name)) {
                return this.epqpt.get(name);
            }
            java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
            for (int i6 = 0; i6 < objArr.length; i6++) {
                clsArr[i6] = objArr[i6].getClass();
            }
            return this.pen.getClass().getMethod(name, clsArr).invoke(this.pen, objArr);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("@");
            sb.append(this.DtE.getCanonicalName());
            sb.append("(");
            boolean z6 = true;
            for (java.lang.String str : this.ir) {
                if (!z6) {
                    sb.append(", ");
                }
                z6 = com.napsternetlabs.napsternetv.ProtectedMyApplication$MyApplication$a.$assertionsDisabled;
                sb.append(str);
                sb.append("=");
                sb.append(com.napsternetlabs.napsternetv.ProtectedMyApplication.MainActivity.e.gc(this.epqpt.get(str), true));
            }
            sb.append(")");
            return sb.toString();
        }
    }

    static int A(int[] iArr, int i6) {
        int i10 = iArr[1];
        if (i10 > i6 * 3) {
            throw new java.lang.AssertionError();
        }
        boolean z6 = i10 > 0 && iArr[2] == i10 && iArr[3] == i10 * 3 && iArr[4] == i10 && iArr[5] == i10;
        return ((!z6 || iArr[0] < i10 * 4 || iArr[6] < i10) ? 0 : 1) + ((!z6 || iArr[6] < i10 * 4 || iArr[0] < i10) ? 0 : 1);
    }

    private static void BE(int i6, byte[] bArr) {
        int i10 = (i6 * 4) + 17;
        java.util.Arrays.fill(bArr, 0, (((i10 * i10) + 7) / 8) + 1, (byte) 0);
        bArr[0] = (byte) i10;
        vzh(6, 0, 1, i10, bArr);
        vzh(0, 6, i10, 1, bArr);
        vzh(0, 0, 9, 9, bArr);
        vzh(i10 - 8, 0, 8, 9, bArr);
        vzh(0, i10 - 8, 9, 8, bArr);
        int[] iArr = new int[7];
        int iWGg = wGg(i6, iArr);
        for (int i11 = 0; i11 < iWGg; i11++) {
            for (int i12 = 0; i12 < iWGg; i12++) {
                if ((i11 != 0 || i12 != 0) && ((i11 != 0 || i12 != iWGg - 1) && (i11 != iWGg - 1 || i12 != 0))) {
                    vzh(iArr[i11] - 2, iArr[i12] - 2, 5, 5, bArr);
                }
            }
        }
        if (i6 >= 7) {
            vzh(i10 - 11, 0, 3, 6, bArr);
            vzh(0, i10 - 11, 6, 3, bArr);
        }
    }

    static byte[] C(byte[] bArr) {
        int length = bArr.length;
        int iOm = om(f44242o);
        while (true) {
            byte[] bArrIk = ik(bArr, length);
            if (bArrIk.length <= iOm) {
                return bArrIk;
            }
            length = ((int) ((iOm / bArrIk.length) * length)) - 32;
        }
    }

    private static void Eyz(byte[] bArr, int i6, int i10, byte[] bArr2) {
        byte b6 = f44240F[i10][i6];
        byte b10 = de[i10][i6];
        int iYlE = ylE(i6) / 8;
        int iCHl = cHl(i6, i10);
        int i11 = b6 - (iYlE % b6);
        int i12 = (iYlE / b6) - b10;
        byte[] bArr3 = new byte[nvp];
        b(b10, bArr3);
        com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$b = new com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b(bArr);
        com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$b2 = new com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b(bArr);
        int i13 = 0;
        while (i13 < b6) {
            int i14 = (i13 < i11 ? 0 : 1) + i12;
            com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$bLnE = protectedMyApplication$a$b2.lnE(iCHl);
            hBn(protectedMyApplication$a$b, i14, bArr3, b10, protectedMyApplication$a$bLnE);
            int i15 = 0;
            int i16 = i13;
            while (i15 < i14) {
                if (i15 == i12) {
                    i16 -= i11;
                }
                bArr2[i16] = protectedMyApplication$a$b.aH(i15);
                i15++;
                i16 += b6;
            }
            int i17 = 0;
            int i18 = iCHl + i13;
            while (i17 < b10) {
                bArr2[i18] = protectedMyApplication$a$bLnE.aH(i17);
                i17++;
                i18 += b6;
            }
            protectedMyApplication$a$b.k(i14);
            i13++;
        }
    }

    private static boolean Fn(byte[] bArr, int i6, int i10) {
        int iSpw = spw(bArr[0]);
        if (21 > iSpw || iSpw > 177 || i6 < 0 || i6 >= iSpw || i10 < 0 || i10 >= iSpw) {
            throw new java.lang.AssertionError();
        }
        int i11 = (i10 * iSpw) + i6;
        return see(spw(bArr[(i11 >>> 3) + 1]), i11 & 7);
    }

    public static android.graphics.Bitmap a(byte[] bArr, int i6, boolean z6, int i10, int i11) {
        return nwx(pzpa(bArr, i6, z6), i10, i11, 6);
    }

    private static void b(int i6, byte[] bArr) {
        if (1 > i6 || i6 > nvp) {
            throw new java.lang.AssertionError();
        }
        java.util.Arrays.fill(bArr, (byte) 0);
        bArr[i6 - 1] = 1;
        byte bWIr = 1;
        for (int i10 = 0; i10 < i6; i10++) {
            for (int i11 = 0; i11 < i6; i11++) {
                bArr[i11] = wIr(bArr[i11], bWIr);
                if (i11 + 1 < i6) {
                    bArr[i11] = (byte) (bArr[i11] ^ bArr[i11 + 1]);
                }
            }
            bWIr = wIr(bWIr, (byte) 2);
        }
    }

    private static int cHl(int i6, int i10) {
        if (i10 < 0 || i10 >= 4) {
            throw new java.lang.AssertionError();
        }
        return (ylE(i6) / 8) - (de[i10][i6] * f44240F[i10][i6]);
    }

    static void crGw(int i6, int[] iArr, int i10) {
        if (iArr[0] == 0) {
            i6 += i10;
        }
        kb(iArr, 1, iArr, 0, 6);
        iArr[0] = i6;
    }

    static void dpF(int i6, int i10, byte[] bArr) {
        if (i10 < 0 || i10 > 7) {
            throw new java.lang.AssertionError();
        }
        int i11 = (new int[]{1, 0, 3, 2}[i6] << 3) | i10;
        int i12 = i11;
        for (int i13 = 0; i13 < 10; i13++) {
            i12 = (i12 << 1) ^ ((i12 >>> 9) * 1335);
        }
        int i14 = ((i11 << 10) | i12) ^ 21522;
        if ((i14 >> 15) != 0) {
            throw new java.lang.AssertionError();
        }
        for (int i15 = 0; i15 <= 5; i15++) {
            lzI(bArr, 8, i15, see(i14, i15));
        }
        lzI(bArr, 8, 7, see(i14, 6));
        lzI(bArr, 8, 8, see(i14, 7));
        lzI(bArr, 7, 8, see(i14, 8));
        for (int i16 = 9; i16 < 15; i16++) {
            lzI(bArr, 14 - i16, 8, see(i14, i16));
        }
        int iDxl = dxl(bArr);
        for (int i17 = 0; i17 < 8; i17++) {
            lzI(bArr, (iDxl - 1) - i17, 8, see(i14, i17));
        }
        for (int i18 = 8; i18 < 15; i18++) {
            lzI(bArr, 8, (iDxl - 15) + i18, see(i14, i18));
        }
        lzI(bArr, 8, iDxl - 8, true);
    }

    public static int dxl(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.AssertionError();
        }
        int iSpw = spw(bArr[0]);
        if (21 > iSpw || iSpw > 177) {
            throw new java.lang.AssertionError();
        }
        return iSpw;
    }

    private static int h(int i6) {
        return (((((i6 * 4) + 17) * ((i6 * 4) + 17)) + 7) / 8) + 1;
    }

    private static void hBn(com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$b, int i6, byte[] bArr, int i10, com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$b2) {
        if (1 > i10 || i10 > nvp) {
            throw new java.lang.AssertionError();
        }
        protectedMyApplication$a$b2.g(0, i10);
        for (int i11 = 0; i11 < i6; i11++) {
            byte bD = (byte) ((protectedMyApplication$a$b.D(i11) ^ protectedMyApplication$a$b2.D(0)) & 255);
            kb(protectedMyApplication$a$b2, 0, protectedMyApplication$a$b2, 1, i10 - 1);
            protectedMyApplication$a$b2.mon(i10 - 1, (byte) 0);
            for (int i12 = 0; i12 < i10; i12++) {
                protectedMyApplication$a$b2.mon(i12, (byte) ((protectedMyApplication$a$b2.D(i12) ^ spw(wIr(bArr[i12], bD))) & 255));
            }
        }
    }

    private static byte[] ik(byte[] bArr, int i6) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        deflater.setLevel(9);
        deflater.setInput(bArr, 0, i6);
        deflater.finish();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.min(bArr.length, i6));
            try {
                byte[] bArr2 = new byte[1024];
                while (!deflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(e6);
        }
    }

    private static int jGp(int i6) {
        if (1 > i6 || i6 > 40) {
            throw new java.lang.AssertionError();
        }
        return (i6 + 7) / 17 == 0 ? 8 : 16;
    }

    static void kb(com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$b, int i6, com.napsternetlabs.napsternetv.ProtectedMyApplication$a$b protectedMyApplication$a$b2, int i10, int i11) {
        protectedMyApplication$a$b.wl(protectedMyApplication$a$b2.ml(i10, i11), i6);
    }

    static void kb(int[] iArr, int i6, int[] iArr2, int i10, int i11) {
        java.lang.System.arraycopy(java.util.Arrays.copyOfRange(iArr2, i10, i10 + i11), 0, iArr, i6, i11);
    }

    public static boolean lAd(byte[] bArr, int i6, int i10) {
        int iSpw = spw(bArr[0]);
        if (i6 < 0 || i6 >= iSpw || i10 < 0 || i10 >= iSpw || !Fn(bArr, i6, i10)) {
            return $assertionsDisabled;
        }
        return true;
    }

    private static void lzI(byte[] bArr, int i6, int i10, boolean z6) {
        int iDxl = dxl(bArr);
        if (21 > iDxl || iDxl > 177 || i6 < 0 || i6 >= iDxl || i10 < 0 || i10 >= iDxl) {
            java.lang.System.out.printf("qrsize: %d, x: %d, y: %d\n", java.lang.Integer.valueOf(iDxl), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        if (21 > iDxl || iDxl > 177 || i6 < 0 || i6 >= iDxl || i10 < 0 || i10 >= iDxl) {
            throw new java.lang.AssertionError();
        }
        int i11 = (i10 * iDxl) + i6;
        int i12 = i11 & 7;
        int i13 = (i11 >>> 3) + 1;
        if (z6) {
            bArr[i13] = (byte) (((1 << i12) | spw(bArr[i13])) & 255);
        } else {
            bArr[i13] = (byte) (((1 << i12) ^ 255) & spw(bArr[i13]) & 255);
        }
    }

    public static android.graphics.Bitmap nwx(byte[] bArr, int i6, int i10, int i11) {
        int iDxl = dxl(bArr);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i6, i10, android.graphics.Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i6 * i10];
        float f6 = i6 / ((i11 * 2) + iDxl);
        float f10 = i10 / ((i11 * 2) + iDxl);
        float f11 = f6 * i11;
        float f12 = f10 * i11;
        for (int i12 = 0; i12 < i6; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                if (i12 < f11 || i13 < f12 || i12 > i6 - f11 || i13 > i10 - f12) {
                    iArr[(i13 * i6) + i12] = -1;
                } else {
                    iArr[(i13 * i6) + i12] = lAd(bArr, (int) ((((float) i12) - f11) / f6), (int) ((((float) i13) - f12) / f10)) ? -16777216 : -1;
                }
            }
        }
        bitmapCreateBitmap.setPixels(iArr, 0, i6, 0, 0, i6, i10);
        return bitmapCreateBitmap;
    }

    private static void oc(byte[] bArr, int i6, int i10, boolean z6) {
        int iDxl = dxl(bArr);
        if (i6 < 0 || i6 >= iDxl || i10 < 0 || i10 >= iDxl) {
            return;
        }
        lzI(bArr, i6, i10, z6);
    }

    private static void odq(byte[] bArr, int i6) {
        int i10;
        int iDxl = dxl(bArr);
        int i11 = 7;
        while (true) {
            if (i11 >= iDxl - 7) {
                break;
            }
            lzI(bArr, 6, i11, $assertionsDisabled);
            lzI(bArr, i11, 6, $assertionsDisabled);
            i11 += 2;
        }
        for (int i12 = -4; i12 <= 4; i12++) {
            for (int i13 = -4; i13 <= 4; i13++) {
                int iAbs = java.lang.Math.abs(i13);
                if (java.lang.Math.abs(i12) > iAbs) {
                    iAbs = java.lang.Math.abs(i12);
                }
                if (iAbs == 2 || iAbs == 4) {
                    oc(bArr, i13 + 3, i12 + 3, $assertionsDisabled);
                    oc(bArr, (iDxl - 4) + i13, i12 + 3, $assertionsDisabled);
                    oc(bArr, i13 + 3, (iDxl - 4) + i12, $assertionsDisabled);
                }
            }
        }
        int[] iArr = new int[7];
        int iWGg = wGg(i6, iArr);
        for (int i14 = 0; i14 < iWGg; i14++) {
            for (int i15 = 0; i15 < iWGg; i15++) {
                if ((i14 != 0 || i15 != 0) && ((i14 != 0 || i15 != iWGg - 1) && (i14 != iWGg - 1 || i15 != 0))) {
                    int i16 = -1;
                    while (i16 <= 1) {
                        int i17 = -1;
                        while (i17 <= 1) {
                            lzI(bArr, iArr[i14] + i17, iArr[i15] + i16, i17 == 0 && i16 == 0);
                            i17++;
                        }
                        i16++;
                    }
                }
            }
        }
        if (i6 >= 7) {
            int i18 = i6;
            for (int i19 = 0; i19 < 12; i19++) {
                i18 = (i18 << 1) ^ ((i18 >>> 11) * 7973);
            }
            long j6 = (((long) i6) << 12) | ((long) i18);
            if ((j6 >>> 18) != 0) {
                throw new java.lang.AssertionError();
            }
            int i20 = 0;
            for (i10 = 6; i20 < i10; i10 = 6) {
                for (int i21 = 0; i21 < 3; i21++) {
                    int i22 = (iDxl - 11) + i21;
                    lzI(bArr, i22, i20, (j6 & 1) != 0);
                    lzI(bArr, i20, i22, (j6 & 1) != 0);
                    j6 >>>= 1;
                }
                i20++;
            }
        }
    }

    public static int om(int i6) {
        return (cHl(26, i6) - jGp(26)) - 14;
    }

    public static byte[] pzpa(byte[] bArr, int i6, boolean z6) {
        int i10 = jes;
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[i10];
        int iMin = java.lang.Math.min(bArr.length, om(i6));
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, iMin);
        int i11 = iMin * 8;
        int i12 = 1;
        while (true) {
            int i13 = i6;
            int iCHl = cHl(i12, i13) * 8;
            int iYhA = yhA(iMin, i11, i12);
            if (iYhA != -1 && iYhA <= iCHl) {
                for (int i14 = i6; i14 <= jy; i14++) {
                    if (z6 && iYhA <= cHl(i12, i14) * 8) {
                        i13 = i14;
                    }
                }
                int iXpB = xpB(iMin, jGp(i12), bArr2, xpB(4, 4, bArr2, 0));
                for (int i15 = 0; i15 < i11; i15++) {
                    iXpB = xpB((spw(bArr3[i15 >>> 3]) >>> (7 - (i15 & 7))) & 1, 1, bArr2, iXpB);
                }
                if (iXpB != iYhA) {
                    throw new java.lang.AssertionError();
                }
                int iCHl2 = cHl(i12, i13) * 8;
                if (iXpB > iCHl2) {
                    throw new java.lang.AssertionError();
                }
                int i16 = iCHl2 - iXpB;
                if (i16 > 4) {
                    i16 = 4;
                }
                int iXpB2 = xpB(0, i16, bArr2, iXpB);
                int iXpB3 = xpB(0, (8 - (iXpB2 % 8)) % 8, bArr2, iXpB2);
                if (iXpB3 % 8 != 0) {
                    throw new java.lang.AssertionError();
                }
                int i17 = 236;
                while (iXpB3 < iCHl2) {
                    iXpB3 = xpB(i17, 8, bArr2, iXpB3);
                    i17 ^= 253;
                }
                Eyz(bArr2, i12, i13, bArr3);
                BE(i12, bArr2);
                y(bArr3, ylE(i12) / 8, bArr2);
                odq(bArr2, i12);
                BE(i12, bArr3);
                long j6 = Long.MAX_VALUE;
                int i18 = -1;
                for (int i19 = 0; i19 < 8; i19++) {
                    z(bArr3, bArr2, i19);
                    dpF(i13, i19, bArr2);
                    long jT = t(bArr2);
                    if (jT < j6) {
                        i18 = i19;
                        j6 = jT;
                    }
                    z(bArr3, bArr2, i19);
                }
                z(bArr3, bArr2, i18);
                dpF(i13, i18, bArr2);
                return bArr2;
            }
            if (i12 >= 40) {
                bArr2[0] = 0;
                return bArr2;
            }
            i12++;
        }
    }

    static boolean see(int i6, int i10) {
        if (((i6 >>> i10) & 1) != 0) {
            return true;
        }
        return $assertionsDisabled;
    }

    public static int spw(byte b6) {
        return b6 & 255;
    }

    static long t(byte[] bArr) {
        int i6;
        long j6;
        int iDxl = dxl(bArr);
        long jWG = 0;
        int i10 = 0;
        while (true) {
            i6 = 7;
            j6 = 1;
            if (i10 >= iDxl) {
                break;
            }
            boolean zFn = $assertionsDisabled;
            int i11 = 0;
            int[] iArr = new int[7];
            for (int i12 = 0; i12 < iDxl; i12++) {
                if (Fn(bArr, i12, i10) == zFn) {
                    i11++;
                    if (i11 == 5) {
                        jWG += 3;
                    } else if (i11 > 5) {
                        jWG++;
                    }
                } else {
                    crGw(i11, iArr, iDxl);
                    if (!zFn) {
                        jWG += ((long) A(iArr, iDxl)) * 40;
                    }
                    zFn = Fn(bArr, i12, i10);
                    i11 = 1;
                }
            }
            jWG += ((long) wG(zFn, i11, iArr, iDxl)) * 40;
            i10++;
        }
        int i13 = 0;
        while (i13 < iDxl) {
            boolean zFn2 = $assertionsDisabled;
            int i14 = 0;
            int[] iArr2 = new int[i6];
            int i15 = 0;
            while (i15 < iDxl) {
                if (Fn(bArr, i13, i15) == zFn2) {
                    i14++;
                    if (i14 == 5) {
                        jWG += 3;
                    } else if (i14 > 5) {
                        jWG += j6;
                    }
                } else {
                    crGw(i14, iArr2, iDxl);
                    if (!zFn2) {
                        jWG += ((long) A(iArr2, iDxl)) * 40;
                    }
                    zFn2 = Fn(bArr, i13, i15);
                    i14 = 1;
                }
                i15++;
                j6 = 1;
            }
            jWG += ((long) wG(zFn2, i14, iArr2, iDxl)) * 40;
            i13++;
            i6 = 7;
            j6 = 1;
        }
        for (int i16 = 0; i16 < iDxl - 1; i16++) {
            for (int i17 = 0; i17 < iDxl - 1; i17++) {
                boolean zFn3 = Fn(bArr, i17, i16);
                if (zFn3 == Fn(bArr, i17 + 1, i16) && zFn3 == Fn(bArr, i17, i16 + 1) && zFn3 == Fn(bArr, i17 + 1, i16 + 1)) {
                    jWG += 3;
                }
            }
        }
        int i18 = 0;
        for (int i19 = 0; i19 < iDxl; i19++) {
            for (int i20 = 0; i20 < iDxl; i20++) {
                if (Fn(bArr, i20, i19)) {
                    i18++;
                }
            }
        }
        int i21 = iDxl * iDxl;
        int iAbs = ((int) (((java.lang.Math.abs((((long) i18) * 20) - (((long) i21) * 10)) + ((long) i21)) - 1) / ((long) i21))) - 1;
        if (iAbs < 0 || iAbs > 9) {
            throw new java.lang.AssertionError();
        }
        long j10 = jWG + (((long) iAbs) * 10);
        if (0 > j10 || j10 > 2568888) {
            throw new java.lang.AssertionError();
        }
        return j10;
    }

    private static void vzh(int i6, int i10, int i11, int i12, byte[] bArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                lzI(bArr, i6 + i14, i10 + i13, true);
            }
        }
    }

    static int wG(boolean z6, int i6, int[] iArr, int i10) {
        if (z6) {
            crGw(i6, iArr, i10);
            i6 = 0;
        }
        crGw(i6 + i10, iArr, i10);
        return A(iArr, i10);
    }

    private static int wGg(int i6, int[] iArr) {
        if (i6 == 1) {
            return 0;
        }
        int i10 = (i6 / 7) + 2;
        int i11 = i6 == 32 ? 26 : ((((i6 * 4) + (i10 * 2)) + 1) / ((i10 * 2) - 2)) * 2;
        int i12 = i10 - 1;
        int i13 = (i6 * 4) + 10;
        while (i12 >= 1) {
            iArr[i12] = i13;
            i12--;
            i13 -= i11;
        }
        iArr[0] = 6;
        return i10;
    }

    private static byte wIr(byte b6, byte b10) {
        int iSpw = spw(b6);
        int iSpw2 = spw(b10);
        int i6 = 0;
        for (int i10 = 7; i10 >= 0; i10--) {
            i6 = ((i6 << 1) ^ ((i6 >>> 7) * 285)) ^ (((iSpw2 >>> i10) & 1) * iSpw);
        }
        return (byte) (i6 & 255);
    }

    private static int xpB(int i6, int i10, byte[] bArr, int i11) {
        int i12 = i10 - 1;
        while (i12 >= 0) {
            int i13 = i11 >>> 3;
            bArr[i13] = (byte) ((spw(bArr[i13]) | (((i6 >>> i12) & 1) << (7 - (i11 & 7)))) & 255);
            i12--;
            i11++;
        }
        return i11;
    }

    private static void y(byte[] bArr, int i6, byte[] bArr2) {
        int iDxl = dxl(bArr2);
        int i10 = 0;
        int i11 = iDxl - 1;
        while (i11 >= 1) {
            if (i11 == 6) {
                i11 = 5;
            }
            for (int i12 = 0; i12 < iDxl; i12++) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = i11 - i13;
                    int i15 = (2 & (i11 + 1)) == 0 ? true : $assertionsDisabled ? (iDxl - 1) - i12 : i12;
                    if (!Fn(bArr2, i14, i15) && i10 < i6 * 8) {
                        lzI(bArr2, i14, i15, see(bArr[i10 >>> 3], 7 - (i10 & 7)));
                        i10++;
                    }
                }
            }
            i11 -= 2;
        }
        if (i10 != i6 * 8) {
            throw new java.lang.AssertionError();
        }
    }

    private static int yhA(int i6, int i10, int i11) {
        if (i6 < 0 || i6 > 32767) {
            throw new java.lang.AssertionError();
        }
        if (i10 < 0 || i10 > 32767) {
            throw new java.lang.AssertionError();
        }
        int iJGp = jGp(i11);
        if (iJGp < 0 || iJGp > 16) {
            throw new java.lang.AssertionError();
        }
        if (i6 >= (1 << iJGp)) {
            return -1;
        }
        long j6 = 0 + ((long) iJGp) + 4 + ((long) i10);
        if (j6 > 32767) {
            return -1;
        }
        return (int) j6;
    }

    private static int ylE(int i6) {
        if (1 > i6 || i6 > 40) {
            throw new java.lang.AssertionError();
        }
        int i10 = (((i6 * 16) + 128) * i6) + 64;
        if (i6 >= 2) {
            int i11 = (i6 / 7) + 2;
            i10 -= (((i11 * 25) - 10) * i11) - 55;
            if (i6 >= 7) {
                i10 -= 36;
            }
        }
        if (208 > i10 || i10 > 29648) {
            throw new java.lang.AssertionError();
        }
        return i10;
    }

    static void z(byte[] bArr, byte[] bArr2, int i6) {
        if (i6 < 0 || i6 > 7) {
            throw new java.lang.AssertionError();
        }
        int iDxl = dxl(bArr2);
        for (int i10 = 0; i10 < iDxl; i10++) {
            for (int i11 = 0; i11 < iDxl; i11++) {
                if (!Fn(bArr, i11, i10)) {
                    boolean z6 = $assertionsDisabled;
                    switch (i6) {
                        case 0:
                            if ((i11 + i10) % 2 == 0) {
                                z6 = true;
                            }
                            break;
                        case 1:
                            if (i10 % 2 == 0) {
                                z6 = true;
                            }
                            break;
                        case 2:
                            if (i11 % 3 == 0) {
                                z6 = true;
                            }
                            break;
                        case 3:
                            if ((i11 + i10) % 3 == 0) {
                                z6 = true;
                            }
                            break;
                        case 4:
                            if (((i11 / 3) + (i10 / 2)) % 2 == 0) {
                                z6 = true;
                            }
                            break;
                        case 5:
                            if (((i11 * i10) % 2) + ((i11 * i10) % 3) == 0) {
                                z6 = true;
                            }
                            break;
                        case 6:
                            if ((((i11 * i10) % 2) + ((i11 * i10) % 3)) % 2 == 0) {
                                z6 = true;
                            }
                            break;
                        case 7:
                            if ((((i11 + i10) % 2) + ((i11 * i10) % 3)) % 2 == 0) {
                                z6 = true;
                            }
                            break;
                        default:
                            throw new java.lang.AssertionError();
                    }
                    lzI(bArr2, i11, i10, Fn(bArr2, i11, i10) ^ z6);
                }
            }
        }
    }
}
