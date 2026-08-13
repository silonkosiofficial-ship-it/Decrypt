package T6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L {
    private static final void a(T6.H h6, java.lang.String str, int i6, int i10, int i11, boolean z6) {
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        java.lang.String strSubstring3;
        if (i10 == -1) {
            int iF = f(i6, i11, str);
            int iE = e(iF, i11, str);
            if (iE > iF) {
                if (z6) {
                    strSubstring3 = T6.AbstractC1658f.k(str, iF, iE, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iF, iE);
                    p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                }
                h6.d(strSubstring3, p097j7.AbstractC6879v.m());
                return;
            }
            return;
        }
        int iF2 = f(i6, i10, str);
        int iE2 = e(iF2, i10, str);
        if (iE2 > iF2) {
            if (z6) {
                strSubstring = T6.AbstractC1658f.k(str, iF2, iE2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iF2, iE2);
                p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
            }
            int iF3 = f(i10 + 1, i11, str);
            int iE3 = e(iF3, i11, str);
            if (z6) {
                strSubstring2 = T6.AbstractC1658f.k(str, iF3, iE3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iF3, iE3);
                p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
            }
            h6.e(strSubstring, strSubstring2);
        }
    }

    private static final void b(T6.H h6, java.lang.String str, int i6, int i10, boolean z6) {
        int i11;
        int i12;
        int iJ0 = S8.r.j0(str);
        int i13 = 0;
        if (i6 <= iJ0) {
            int i14 = 0;
            int i15 = -1;
            int i16 = i6;
            int i17 = i16;
            while (i14 != i10) {
                char cCharAt = str.charAt(i16);
                if (cCharAt == '&') {
                    a(h6, str, i17, i15, i16, z6);
                    i14++;
                    i15 = -1;
                    i17 = i16 + 1;
                } else if (cCharAt == '=' && i15 == -1) {
                    i15 = i16;
                }
                if (i16 != iJ0) {
                    i16++;
                } else {
                    i12 = i17;
                    i11 = i15;
                    i13 = i14;
                }
            }
            return;
        }
        i11 = -1;
        i12 = i6;
        if (i13 == i10) {
            return;
        }
        a(h6, str, i12, i11, str.length(), z6);
    }

    public static final T6.G c(java.lang.String str, int i6, int i10, boolean z6) {
        p247y7.AbstractC7350t.f(str, "query");
        if (i6 > S8.r.j0(str)) {
            return T6.G.f13056b.a();
        }
        T6.G.a aVar = T6.G.f13056b;
        T6.H hB = T6.K.b(0, 1, null);
        b(hB, str, i6, i10, z6);
        return hB.i();
    }

    public static /* synthetic */ T6.G d(java.lang.String str, int i6, int i10, boolean z6, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = 1000;
        }
        if ((i11 & 8) != 0) {
            z6 = true;
        }
        return c(str, i6, i10, z6);
    }

    private static final int e(int i6, int i10, java.lang.CharSequence charSequence) {
        while (i10 > i6 && S8.AbstractC1628a.c(charSequence.charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    private static final int f(int i6, int i10, java.lang.CharSequence charSequence) {
        while (i6 < i10 && S8.AbstractC1628a.c(charSequence.charAt(i6))) {
            i6++;
        }
        return i6;
    }
}
