package S8;

/* JADX INFO: renamed from: S8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1633f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f12640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f12641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f12642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f12643d;

    static {
        int[] iArr = new int[256];
        int i6 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f12640a = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        f12641b = iArr2;
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        f12642c = iArr3;
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i6 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i6)] = i20;
            i6++;
            i20++;
        }
        f12643d = jArr;
    }

    private static final int a(long j6) {
        if (0 <= j6 && j6 <= 2147483647L) {
            return (int) j6;
        }
        throw new java.lang.IllegalArgumentException("The resulting string length is too big: " + ((java.lang.Object) p087i7.G.o(p087i7.G.g(j6))));
    }

    private static final void b(java.lang.String str, int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if (i12 < 1) {
            k(str, i6, i10, "at least", 1);
        } else if (i12 > i11) {
            d(str, i6, (i12 + i6) - i11);
        }
    }

    private static final void c(java.lang.String str, int i6, int i10, java.lang.String str2, java.lang.String str3, boolean z6, int i11) {
        if ((i10 - i6) - str2.length() <= str3.length()) {
            l(str, i6, i10, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (!S8.AbstractC1630c.d(str2.charAt(i12), str.charAt(i6 + i12), z6)) {
                    m(str, i6, i10, str2, "prefix");
                }
            }
            i6 += str2.length();
        }
        int length2 = i10 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!S8.AbstractC1630c.d(str3.charAt(i13), str.charAt(length2 + i13), z6)) {
                    m(str, length2, i10, str3, "suffix");
                }
            }
        }
        b(str, i6, length2, i11);
    }

    private static final void d(java.lang.String str, int i6, int i10) {
        while (i6 < i10) {
            if (str.charAt(i6) != '0') {
                throw new java.lang.NumberFormatException("Expected the hexadecimal digit '0' at index " + i6 + ", but was '" + str.charAt(i6) + "'.\nThe result won't fit the type being parsed.");
            }
            i6++;
        }
    }

    public static final int[] e() {
        return f12640a;
    }

    public static final long f(java.lang.String str, int i6, int i10, S8.C1634g c1634g) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(c1634g, "format");
        return h(str, i6, i10, c1634g, 16);
    }

    public static /* synthetic */ long g(java.lang.String str, int i6, int i10, S8.C1634g c1634g, int i11, java.lang.Object obj) {
        if ((i11 & 1) != 0) {
            i6 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            c1634g = S8.C1634g.f12644d.a();
        }
        return f(str, i6, i10, c1634g);
    }

    private static final long h(java.lang.String str, int i6, int i10, S8.C1634g c1634g, int i11) {
        p097j7.AbstractC6862d.f49298C.a(i6, i10, str.length());
        S8.C1634g.c cVarB = c1634g.b();
        if (cVarB.h()) {
            b(str, i6, i10, i11);
        } else {
            java.lang.String strE = cVarB.e();
            java.lang.String strG = cVarB.g();
            c(str, i6, i10, strE, strG, cVarB.c(), i11);
            i6 += strE.length();
            i10 -= strG.length();
        }
        return i(str, i6, i10);
    }

    private static final long i(java.lang.String str, int i6, int i10) {
        long j6 = 0;
        while (i6 < i10) {
            long j10 = j6 << 4;
            char cCharAt = str.charAt(i6);
            if ((cCharAt >>> '\b') == 0) {
                long j11 = f12643d[cCharAt];
                if (j11 >= 0) {
                    j6 = j10 | j11;
                    i6++;
                }
            }
            j(str, i6);
            throw new p087i7.C6665k();
        }
        return j6;
    }

    private static final java.lang.Void j(java.lang.String str, int i6) {
        throw new java.lang.NumberFormatException("Expected a hexadecimal digit at index " + i6 + ", but was " + str.charAt(i6));
    }

    private static final void k(java.lang.String str, int i6, int i10, java.lang.String str2, int i11) {
        p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i6, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        throw new java.lang.NumberFormatException("Expected " + str2 + ' ' + i11 + " hexadecimal digits at index " + i6 + ", but was \"" + strSubstring + "\" of length " + (i10 - i6));
    }

    private static final void l(java.lang.String str, int i6, int i10, java.lang.String str2, java.lang.String str3) {
        p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i6, i10);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        throw new java.lang.NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void m(java.lang.String str, int i6, int i10, java.lang.String str2, java.lang.String str3) {
        int iG = E7.j.g(str2.length() + i6, i10);
        p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = str.substring(i6, iG);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        throw new java.lang.NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i6 + ", but was " + strSubstring);
    }

    private static final int n(java.lang.String str, char[] cArr, int i6) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i6);
            } else {
                cArr[i6] = str.charAt(0);
            }
        }
        return i6 + str.length();
    }

    public static final java.lang.String o(int i6, S8.C1634g c1634g) {
        p247y7.AbstractC7350t.f(c1634g, "format");
        java.lang.String str = c1634g.c() ? "0123456789ABCDEF" : "0123456789abcdef";
        S8.C1634g.c cVarB = c1634g.b();
        if (!cVarB.i()) {
            return q(i6, cVarB, str, 32);
        }
        char[] cArr = {str.charAt((i6 >> 28) & 15), str.charAt((i6 >> 24) & 15), str.charAt((i6 >> 20) & 15), str.charAt((i6 >> 16) & 15), str.charAt((i6 >> 12) & 15), str.charAt((i6 >> 8) & 15), str.charAt((i6 >> 4) & 15), str.charAt(i6 & 15)};
        return cVarB.f() ? S8.D.B(cArr, E7.j.g(java.lang.Integer.numberOfLeadingZeros(i6) >> 2, 7), 0, 2, null) : S8.r.z(cArr);
    }

    public static /* synthetic */ java.lang.String p(int i6, S8.C1634g c1634g, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            c1634g = S8.C1634g.f12644d.a();
        }
        return o(i6, c1634g);
    }

    private static final java.lang.String q(long j6, S8.C1634g.c cVar, java.lang.String str, int i6) {
        if ((i6 & 3) != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = i6 >> 2;
        int iD = cVar.d();
        int iD2 = E7.j.d(iD - i10, 0);
        java.lang.String strE = cVar.e();
        java.lang.String strG = cVar.g();
        boolean zF = cVar.f();
        int iA = a(((long) strE.length()) + ((long) iD2) + ((long) i10) + ((long) strG.length()));
        char[] cArr = new char[iA];
        int iN = n(strE, cArr, 0);
        if (iD2 > 0) {
            int i11 = iD2 + iN;
            p097j7.AbstractC6872n.s(cArr, str.charAt(0), iN, i11);
            iN = i11;
        }
        int i12 = i6;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 -= 4;
            int i14 = (int) ((j6 >> i12) & 15);
            zF = zF && i14 == 0 && (i12 >> 2) >= iD;
            if (!zF) {
                cArr[iN] = str.charAt(i14);
                iN++;
            }
        }
        int iN2 = n(strG, cArr, iN);
        return iN2 == iA ? S8.r.z(cArr) : S8.D.B(cArr, 0, iN2, 1, null);
    }
}
