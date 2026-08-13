package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static final android.graphics.Shader a(long j6, long j10, java.util.List list, java.util.List list2, int i6) {
        g(list, list2);
        int iD = d(list);
        return new android.graphics.LinearGradient(p131n0.g.m(j6), p131n0.g.n(j6), p131n0.g.m(j10), p131n0.g.n(j10), e(list, iD), f(list2, list, iD), p141o0.AbstractC6945a0.a(i6));
    }

    public static final android.graphics.Shader b(long j6, float f6, java.util.List list, java.util.List list2, int i6) {
        g(list, list2);
        int iD = d(list);
        return new android.graphics.RadialGradient(p131n0.g.m(j6), p131n0.g.n(j6), f6, e(list, iD), f(list2, list, iD), p141o0.AbstractC6945a0.a(i6));
    }

    public static final android.graphics.Shader c(long j6, java.util.List list, java.util.List list2) {
        g(list, list2);
        int iD = d(list);
        return new android.graphics.SweepGradient(p131n0.g.m(j6), p131n0.g.n(j6), e(list, iD), f(list2, list, iD));
    }

    public static final int d(java.util.List list) {
        int i6 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iO = p097j7.AbstractC6879v.o(list);
        for (int i10 = 1; i10 < iO; i10++) {
            if (p141o0.C7016y0.p(((p141o0.C7016y0) list.get(i10)).w()) == 0.0f) {
                i6++;
            }
        }
        return i6;
    }

    public static final int[] e(java.util.List list, int i6) {
        int i10;
        int i11 = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = p141o0.A0.k(((p141o0.C7016y0) list.get(i11)).w());
                i11++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i6];
        int iO = p097j7.AbstractC6879v.o(list);
        int size2 = list.size();
        int i12 = 0;
        while (i11 < size2) {
            long jW = ((p141o0.C7016y0) list.get(i11)).w();
            if (p141o0.C7016y0.p(jW) == 0.0f) {
                if (i11 == 0) {
                    i10 = i12 + 1;
                    iArr2[i12] = p141o0.A0.k(p141o0.C7016y0.m(((p141o0.C7016y0) list.get(1)).w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i11 == iO) {
                    i10 = i12 + 1;
                    iArr2[i12] = p141o0.A0.k(p141o0.C7016y0.m(((p141o0.C7016y0) list.get(i11 - 1)).w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i13 = i12 + 1;
                    iArr2[i12] = p141o0.A0.k(p141o0.C7016y0.m(((p141o0.C7016y0) list.get(i11 - 1)).w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i12 += 2;
                    iArr2[i13] = p141o0.A0.k(p141o0.C7016y0.m(((p141o0.C7016y0) list.get(i11 + 1)).w(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i12 = i10;
            } else {
                iArr2[i12] = p141o0.A0.k(jW);
                i12++;
            }
            i11++;
        }
        return iArr2;
    }

    public static final float[] f(java.util.List list, java.util.List list2, int i6) {
        if (i6 == 0) {
            if (list != null) {
                return p097j7.AbstractC6879v.Q0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i6];
        fArr[0] = list != null ? ((java.lang.Number) list.get(0)).floatValue() : 0.0f;
        int iO = p097j7.AbstractC6879v.o(list2);
        int i10 = 1;
        for (int i11 = 1; i11 < iO; i11++) {
            long jW = ((p141o0.C7016y0) list2.get(i11)).w();
            float fFloatValue = list != null ? ((java.lang.Number) list.get(i11)).floatValue() : i11 / p097j7.AbstractC6879v.o(list2);
            int i12 = i10 + 1;
            fArr[i10] = fFloatValue;
            if (p141o0.C7016y0.p(jW) == 0.0f) {
                i10 += 2;
                fArr[i12] = fFloatValue;
            } else {
                i10 = i12;
            }
        }
        fArr[i10] = list != null ? ((java.lang.Number) list.get(p097j7.AbstractC6879v.o(list2))).floatValue() : 1.0f;
        return fArr;
    }

    private static final void g(java.util.List list, java.util.List list2) {
        int size = list.size();
        if (list2 == null) {
            if (size < 2) {
                throw new java.lang.IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (size != list2.size()) {
            throw new java.lang.IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
