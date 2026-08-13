package A;

/* JADX INFO: renamed from: A.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A.C0789x f165a = new A.C0789x();

    private C0789x() {
    }

    public final int a(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * i10, i6);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i11);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            if (fE == 0.0f) {
                int iMin2 = java.lang.Math.min(interfaceC0895n.T(Integer.MAX_VALUE), i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i6 - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, interfaceC0895n.t(iMin2));
            } else if (fE > 0.0f) {
                f6 += fE;
            }
        }
        int iRound = f6 == 0.0f ? 0 : i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i6 - iMin, 0) / f6);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            D0.InterfaceC0895n interfaceC0895n2 = (D0.InterfaceC0895n) list.get(i12);
            float fE2 = A.D.e(A.D.c(interfaceC0895n2));
            if (fE2 > 0.0f) {
                iMax = java.lang.Math.max(iMax, interfaceC0895n2.t(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f6 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i12);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            int iT = interfaceC0895n.T(i6);
            if (fE == 0.0f) {
                i11 += iT;
            } else if (fE > 0.0f) {
                f6 += fE;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iT / fE));
            }
        }
        return java.lang.Math.round(iMax * f6) + i11 + ((list.size() - 1) * i10);
    }

    public final int c(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * i10, i6);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i11);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            if (fE == 0.0f) {
                int iMin2 = java.lang.Math.min(interfaceC0895n.T(Integer.MAX_VALUE), i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i6 - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, interfaceC0895n.n0(iMin2));
            } else if (fE > 0.0f) {
                f6 += fE;
            }
        }
        int iRound = f6 == 0.0f ? 0 : i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i6 - iMin, 0) / f6);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            D0.InterfaceC0895n interfaceC0895n2 = (D0.InterfaceC0895n) list.get(i12);
            float fE2 = A.D.e(A.D.c(interfaceC0895n2));
            if (fE2 > 0.0f) {
                iMax = java.lang.Math.max(iMax, interfaceC0895n2.n0(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f6 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i12);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            int iS = interfaceC0895n.S(i6);
            if (fE == 0.0f) {
                i11 += iS;
            } else if (fE > 0.0f) {
                f6 += fE;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iS / fE));
            }
        }
        return java.lang.Math.round(iMax * f6) + i11 + ((list.size() - 1) * i10);
    }

    public final int e(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f6 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i12);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            int iT = interfaceC0895n.t(i6);
            if (fE == 0.0f) {
                i11 += iT;
            } else if (fE > 0.0f) {
                f6 += fE;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iT / fE));
            }
        }
        return java.lang.Math.round(iMax * f6) + i11 + ((list.size() - 1) * i10);
    }

    public final int f(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * i10, i6);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i11);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            if (fE == 0.0f) {
                int iMin2 = java.lang.Math.min(interfaceC0895n.t(Integer.MAX_VALUE), i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i6 - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, interfaceC0895n.T(iMin2));
            } else if (fE > 0.0f) {
                f6 += fE;
            }
        }
        int iRound = f6 == 0.0f ? 0 : i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i6 - iMin, 0) / f6);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            D0.InterfaceC0895n interfaceC0895n2 = (D0.InterfaceC0895n) list.get(i12);
            float fE2 = A.D.e(A.D.c(interfaceC0895n2));
            if (fE2 > 0.0f) {
                iMax = java.lang.Math.max(iMax, interfaceC0895n2.T(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f6 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i12);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            int iN0 = interfaceC0895n.n0(i6);
            if (fE == 0.0f) {
                i11 += iN0;
            } else if (fE > 0.0f) {
                f6 += fE;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iN0 / fE));
            }
        }
        return java.lang.Math.round(iMax * f6) + i11 + ((list.size() - 1) * i10);
    }

    public final int h(java.util.List list, int i6, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * i10, i6);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            D0.InterfaceC0895n interfaceC0895n = (D0.InterfaceC0895n) list.get(i11);
            float fE = A.D.e(A.D.c(interfaceC0895n));
            if (fE == 0.0f) {
                int iMin2 = java.lang.Math.min(interfaceC0895n.t(Integer.MAX_VALUE), i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i6 - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, interfaceC0895n.S(iMin2));
            } else if (fE > 0.0f) {
                f6 += fE;
            }
        }
        int iRound = f6 == 0.0f ? 0 : i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i6 - iMin, 0) / f6);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            D0.InterfaceC0895n interfaceC0895n2 = (D0.InterfaceC0895n) list.get(i12);
            float fE2 = A.D.e(A.D.c(interfaceC0895n2));
            if (fE2 > 0.0f) {
                iMax = java.lang.Math.max(iMax, interfaceC0895n2.S(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
