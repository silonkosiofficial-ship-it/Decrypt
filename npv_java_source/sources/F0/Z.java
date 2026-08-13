package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    private static final void b(F0.C0938y c0938y, F0.InterfaceC0930p interfaceC0930p) {
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < c0938y.c()) {
            int i12 = i6 + 2;
            int iB = c0938y.b(i6) - c0938y.b(i12);
            int iB2 = c0938y.b(i6 + 1) - c0938y.b(i12);
            int iB3 = c0938y.b(i12);
            i6 += 3;
            while (i10 < iB) {
                interfaceC0930p.a(i11, i10);
                i10++;
            }
            while (i11 < iB2) {
                interfaceC0930p.d(i11);
                i11++;
            }
            while (true) {
                int i13 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC0930p.c(i10, i11);
                    i10++;
                    i11++;
                    iB3 = i13;
                }
            }
        }
    }

    private static final boolean c(int i6, int i10, int i11, int i12, F0.InterfaceC0930p interfaceC0930p, int[] iArr, int[] iArr2, int i13, int[] iArr3) {
        int iB;
        int i14;
        int i15;
        int i16 = (i10 - i6) - (i12 - i11);
        boolean z6 = i16 % 2 == 0;
        int i17 = -i13;
        for (int i18 = i17; i18 <= i13; i18 += 2) {
            if (i18 == i17 || (i18 != i13 && F0.AbstractC0917f.b(iArr2, i18 + 1) < F0.AbstractC0917f.b(iArr2, i18 - 1))) {
                iB = F0.AbstractC0917f.b(iArr2, i18 + 1);
                i14 = iB;
            } else {
                iB = F0.AbstractC0917f.b(iArr2, i18 - 1);
                i14 = iB - 1;
            }
            int i19 = i12 - ((i10 - i14) - i18);
            int i20 = (i13 == 0 || i14 != iB) ? i19 : i19 + 1;
            while (true) {
                if (i14 <= i6 || i19 <= i11) {
                    break;
                }
                if (!interfaceC0930p.b(i14 - 1, i19 - 1)) {
                    break;
                }
                i14--;
                i19--;
            }
            F0.AbstractC0917f.d(iArr2, i18, i14);
            if (z6 && (i15 = i16 - i18) >= i17 && i15 <= i13) {
                if (F0.AbstractC0917f.b(iArr, i15) >= i14) {
                    f(i14, i19, iB, i20, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final F0.C0938y d(int i6, int i10, F0.InterfaceC0930p interfaceC0930p) {
        int i11 = ((i6 + i10) + 1) / 2;
        F0.C0938y c0938y = new F0.C0938y(i11 * 3);
        F0.C0938y c0938y2 = new F0.C0938y(i11 * 4);
        c0938y2.h(0, i6, 0, i10);
        int i12 = (i11 * 2) + 1;
        int[] iArrA = F0.AbstractC0917f.a(new int[i12]);
        int[] iArrA2 = F0.AbstractC0917f.a(new int[i12]);
        int[] iArrB = F0.B0.b(new int[5]);
        while (c0938y2.d()) {
            int iF = c0938y2.f();
            int iF2 = c0938y2.f();
            int iF3 = c0938y2.f();
            int iF4 = c0938y2.f();
            int[] iArr = iArrA;
            int[] iArr2 = iArrA2;
            if (h(iF4, iF3, iF2, iF, interfaceC0930p, iArrA, iArrA2, iArrB)) {
                if (F0.B0.c(iArrB) > 0) {
                    F0.B0.a(iArrB, c0938y);
                }
                c0938y2.h(iF4, F0.B0.h(iArrB), iF2, F0.B0.i(iArrB));
                c0938y2.h(F0.B0.d(iArrB), iF3, F0.B0.e(iArrB), iF);
            }
            iArrA = iArr;
            iArrA2 = iArr2;
        }
        c0938y.j();
        c0938y.g(i6, i10, 0);
        return c0938y;
    }

    public static final void e(int i6, int i10, F0.InterfaceC0930p interfaceC0930p) {
        b(d(i6, i10, interfaceC0930p), interfaceC0930p);
    }

    public static final void f(int i6, int i10, int i11, int i12, boolean z6, int[] iArr) {
        iArr[0] = i6;
        iArr[1] = i10;
        iArr[2] = i11;
        iArr[3] = i12;
        iArr[4] = z6 ? 1 : 0;
    }

    private static final boolean g(int i6, int i10, int i11, int i12, F0.InterfaceC0930p interfaceC0930p, int[] iArr, int[] iArr2, int i13, int[] iArr3) {
        int iB;
        int i14;
        int i15;
        int i16 = (i10 - i6) - (i12 - i11);
        boolean z6 = java.lang.Math.abs(i16) % 2 == 1;
        int i17 = -i13;
        for (int i18 = i17; i18 <= i13; i18 += 2) {
            if (i18 == i17 || (i18 != i13 && F0.AbstractC0917f.b(iArr, i18 + 1) > F0.AbstractC0917f.b(iArr, i18 - 1))) {
                iB = F0.AbstractC0917f.b(iArr, i18 + 1);
                i14 = iB;
            } else {
                iB = F0.AbstractC0917f.b(iArr, i18 - 1);
                i14 = iB + 1;
            }
            int i19 = (i11 + (i14 - i6)) - i18;
            int i20 = (i13 == 0 || i14 != iB) ? i19 : i19 - 1;
            while (true) {
                if (i14 >= i10 || i19 >= i12) {
                    break;
                }
                if (!interfaceC0930p.b(i14, i19)) {
                    break;
                }
                i14++;
                i19++;
            }
            F0.AbstractC0917f.d(iArr, i18, i14);
            if (z6 && (i15 = i16 - i18) >= i17 + 1 && i15 <= i13 - 1) {
                if (F0.AbstractC0917f.b(iArr2, i15) <= i14) {
                    f(iB, i20, i14, i19, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int i6, int i10, int i11, int i12, F0.InterfaceC0930p interfaceC0930p, int[] iArr, int[] iArr2, int[] iArr3) {
        int i13 = i10 - i6;
        int i14 = i12 - i11;
        if (i13 >= 1 && i14 >= 1) {
            int i15 = ((i13 + i14) + 1) / 2;
            F0.AbstractC0917f.d(iArr, 1, i6);
            F0.AbstractC0917f.d(iArr2, 1, i10);
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16;
                if (g(i6, i10, i11, i12, interfaceC0930p, iArr, iArr2, i16, iArr3) || c(i6, i10, i11, i12, interfaceC0930p, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i16 = i17 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i6, int i10) {
        int i11 = iArr[i6];
        iArr[i6] = iArr[i10];
        iArr[i10] = i11;
    }
}
