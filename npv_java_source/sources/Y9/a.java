package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f16574a = X9.d0.a("0123456789abcdef");

    public static final X9.C1836d.a a(X9.C1836d c1836d, X9.C1836d.a aVar) {
        p247y7.AbstractC7350t.f(c1836d, "<this>");
        p247y7.AbstractC7350t.f(aVar, "unsafeCursor");
        X9.C1836d.a aVarG = X9.AbstractC1834b.g(aVar);
        if (aVarG.f16140C != null) {
            throw new java.lang.IllegalStateException("already attached to a buffer".toString());
        }
        aVarG.f16140C = c1836d;
        aVarG.f16141D = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f16574a;
    }

    public static final java.lang.String c(X9.C1836d c1836d, long j6) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(c1836d, "<this>");
        if (j6 > 0) {
            long j10 = j6 - 1;
            if (c1836d.r0(j10) == 13) {
                java.lang.String strW = c1836d.w(j10);
                c1836d.skip(2L);
                return strW;
            }
        }
        java.lang.String strW2 = c1836d.w(j6);
        c1836d.skip(1L);
        return strW2;
    }

    public static final int d(X9.C1836d c1836d, X9.N n6, boolean z6) {
        int i6;
        int i10;
        X9.U u6;
        int i11;
        int i12;
        p247y7.AbstractC7350t.f(c1836d, "<this>");
        p247y7.AbstractC7350t.f(n6, "options");
        X9.U u10 = c1836d.f16138C;
        if (u10 == null) {
            return z6 ? -2 : -1;
        }
        byte[] bArr = u10.f16095a;
        int i13 = u10.f16096b;
        int i14 = u10.f16097c;
        int[] iArrC = n6.C();
        X9.U u11 = u10;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int i18 = iArrC[i16];
            int i19 = i16 + 2;
            int i20 = iArrC[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (u11 == null) {
                break;
            }
            if (i18 >= 0) {
                i6 = i13 + 1;
                int i21 = bArr[i13] & 255;
                int i22 = i19 + i18;
                while (i19 != i22) {
                    if (i21 == iArrC[i19]) {
                        i10 = iArrC[i19 + i18];
                        if (i6 == i14) {
                            u11 = u11.f16100f;
                            p247y7.AbstractC7350t.c(u11);
                            i6 = u11.f16096b;
                            bArr = u11.f16095a;
                            i14 = u11.f16097c;
                            if (u11 == u10) {
                                u11 = null;
                            }
                        }
                    } else {
                        i19++;
                    }
                }
                return i15;
            }
            int i23 = i19 + (i18 * (-1));
            while (true) {
                int i24 = i13 + 1;
                int i25 = i19 + 1;
                if ((bArr[i13] & 255) != iArrC[i19]) {
                    return i15;
                }
                boolean z10 = i25 == i23;
                if (i24 == i14) {
                    p247y7.AbstractC7350t.c(u11);
                    X9.U u12 = u11.f16100f;
                    p247y7.AbstractC7350t.c(u12);
                    i12 = u12.f16096b;
                    byte[] bArr2 = u12.f16095a;
                    i11 = u12.f16097c;
                    if (u12 != u10) {
                        u6 = u12;
                        bArr = bArr2;
                    } else {
                        if (!z10) {
                            break loop0;
                        }
                        bArr = bArr2;
                        u6 = null;
                    }
                } else {
                    u6 = u11;
                    i11 = i14;
                    i12 = i24;
                }
                if (z10) {
                    i10 = iArrC[i25];
                    i6 = i12;
                    i14 = i11;
                    u11 = u6;
                    break;
                }
                i13 = i12;
                i14 = i11;
                u11 = u6;
                i19 = i25;
            }
            if (i10 >= 0) {
                return i10;
            }
            i16 = -i10;
            i13 = i6;
        }
        if (z6) {
            return -2;
        }
        return i15;
    }

    public static /* synthetic */ int e(X9.C1836d c1836d, X9.N n6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        return d(c1836d, n6, z6);
    }
}
