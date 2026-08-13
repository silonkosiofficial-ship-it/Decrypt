package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6115r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.F5 f41171a = new com.google.android.gms.internal.measurement.H5();

    static int A(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.measurement.AbstractC5982c4.P(i6, 0L);
    }

    static int B(java.util.List list) {
        return list.size() << 3;
    }

    public static void C(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.G(i6, list, z6);
    }

    static int D(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int E(java.util.List list) {
        int iG0;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.C6154w4) {
            com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
            iG0 = 0;
            while (i6 < size) {
                iG0 += com.google.android.gms.internal.measurement.AbstractC5982c4.g0(c6154w4.e(i6));
                i6++;
            }
        } else {
            iG0 = 0;
            while (i6 < size) {
                iG0 += com.google.android.gms.internal.measurement.AbstractC5982c4.g0(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iG0;
    }

    public static void F(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.D(i6, list, z6);
    }

    static int G(int i6, java.util.List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int H(java.util.List list) {
        int iA0;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.K4) {
            com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
            iA0 = 0;
            while (i6 < size) {
                iA0 += com.google.android.gms.internal.measurement.AbstractC5982c4.a0(k6.B(i6));
                i6++;
            }
        } else {
            iA0 = 0;
            while (i6 < size) {
                iA0 += com.google.android.gms.internal.measurement.AbstractC5982c4.a0(((java.lang.Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return iA0;
    }

    public static void I(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.M(i6, list, z6);
    }

    static int J(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int K(java.util.List list) {
        int iO0;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.C6154w4) {
            com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
            iO0 = 0;
            while (i6 < size) {
                iO0 += com.google.android.gms.internal.measurement.AbstractC5982c4.o0(c6154w4.e(i6));
                i6++;
            }
        } else {
            iO0 = 0;
            while (i6 < size) {
                iO0 += com.google.android.gms.internal.measurement.AbstractC5982c4.o0(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iO0;
    }

    public static void L(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.h(i6, list, z6);
    }

    static int M(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int N(java.util.List list) {
        int iJ0;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.K4) {
            com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
            iJ0 = 0;
            while (i6 < size) {
                iJ0 += com.google.android.gms.internal.measurement.AbstractC5982c4.j0(k6.B(i6));
                i6++;
            }
        } else {
            iJ0 = 0;
            while (i6 < size) {
                iJ0 += com.google.android.gms.internal.measurement.AbstractC5982c4.j0(((java.lang.Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return iJ0;
    }

    public static void O(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.s(i6, list, z6);
    }

    static int P(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int Q(java.util.List list) {
        int iV0;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.C6154w4) {
            com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
            iV0 = 0;
            while (i6 < size) {
                iV0 += com.google.android.gms.internal.measurement.AbstractC5982c4.v0(c6154w4.e(i6));
                i6++;
            }
        } else {
            iV0 = 0;
            while (i6 < size) {
                iV0 += com.google.android.gms.internal.measurement.AbstractC5982c4.v0(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iV0;
    }

    public static void R(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.k(i6, list, z6);
    }

    static int S(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int T(java.util.List list) {
        int iN0;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.K4) {
            com.google.android.gms.internal.measurement.K4 k6 = (com.google.android.gms.internal.measurement.K4) list;
            iN0 = 0;
            while (i6 < size) {
                iN0 += com.google.android.gms.internal.measurement.AbstractC5982c4.n0(k6.B(i6));
                i6++;
            }
        } else {
            iN0 = 0;
            while (i6 < size) {
                iN0 += com.google.android.gms.internal.measurement.AbstractC5982c4.n0(((java.lang.Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return iN0;
    }

    public static void U(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.d(i6, list, z6);
    }

    public static void V(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.y(i6, list, z6);
    }

    public static void W(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.c(i6, list, z6);
    }

    public static void X(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.I(i6, list, z6);
    }

    public static void Y(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.g(i6, list, z6);
    }

    static int a(int i6, java.lang.Object obj, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        return com.google.android.gms.internal.measurement.AbstractC5982c4.R(i6, (com.google.android.gms.internal.measurement.InterfaceC5965a5) obj, interfaceC6100p5);
    }

    static int b(int i6, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iS0 += com.google.android.gms.internal.measurement.AbstractC5982c4.A((com.google.android.gms.internal.measurement.L3) list.get(i10));
        }
        return iS0;
    }

    static int c(int i6, java.util.List list, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += com.google.android.gms.internal.measurement.AbstractC5982c4.x(i6, (com.google.android.gms.internal.measurement.InterfaceC5965a5) list.get(i10), interfaceC6100p5);
        }
        return iX;
    }

    static int d(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.measurement.AbstractC5982c4.z(i6, true);
    }

    static int e(java.util.List list) {
        return list.size();
    }

    public static com.google.android.gms.internal.measurement.F5 f() {
        return f41171a;
    }

    static java.lang.Object g(java.lang.Object obj, int i6, int i10, java.lang.Object obj2, com.google.android.gms.internal.measurement.F5 f6) {
        if (obj2 == null) {
            obj2 = f6.i(obj);
        }
        f6.f(obj2, i6, i10);
        return obj2;
    }

    static java.lang.Object h(java.lang.Object obj, int i6, java.util.List list, com.google.android.gms.internal.measurement.InterfaceC6162x4 interfaceC6162x4, java.lang.Object obj2, com.google.android.gms.internal.measurement.F5 f6) {
        if (interfaceC6162x4 == null) {
            return obj2;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                java.lang.Integer num = (java.lang.Integer) list.get(i11);
                int iIntValue = num.intValue();
                if (interfaceC6162x4.r(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = g(obj, i6, iIntValue, obj2, f6);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
                if (!interfaceC6162x4.r(iIntValue2)) {
                    obj2 = g(obj, i6, iIntValue2, obj2, f6);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.O(i6, list);
    }

    public static void j(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.t(i6, list, interfaceC6100p5);
    }

    public static void k(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.p(i6, list, z6);
    }

    static void l(com.google.android.gms.internal.measurement.AbstractC6036i4 abstractC6036i4, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.C6072m4 c6072m4B = abstractC6036i4.b(obj2);
        if (c6072m4B.f41036a.isEmpty()) {
            return;
        }
        abstractC6036i4.e(obj).f(c6072m4B);
    }

    static void m(com.google.android.gms.internal.measurement.S4 s6, java.lang.Object obj, java.lang.Object obj2, long j6) {
        com.google.android.gms.internal.measurement.G5.j(obj, j6, s6.f(com.google.android.gms.internal.measurement.G5.B(obj, j6), com.google.android.gms.internal.measurement.G5.B(obj2, j6)));
    }

    static void n(com.google.android.gms.internal.measurement.F5 f6, java.lang.Object obj, java.lang.Object obj2) {
        f6.j(obj, f6.b(f6.k(obj), f6.k(obj2)));
    }

    public static void o(java.lang.Class cls) {
        com.google.android.gms.internal.measurement.AbstractC6130t4.class.isAssignableFrom(cls);
    }

    static boolean p(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i6, java.util.List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iS0 = com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6) * size;
        if (list instanceof com.google.android.gms.internal.measurement.H4) {
            com.google.android.gms.internal.measurement.H4 h6 = (com.google.android.gms.internal.measurement.H4) list;
            while (i10 < size) {
                java.lang.Object objR = h6.r(i10);
                iS0 += objR instanceof com.google.android.gms.internal.measurement.L3 ? com.google.android.gms.internal.measurement.AbstractC5982c4.A((com.google.android.gms.internal.measurement.L3) objR) : com.google.android.gms.internal.measurement.AbstractC5982c4.C((java.lang.String) objR);
                i10++;
            }
        } else {
            while (i10 < size) {
                java.lang.Object obj = list.get(i10);
                iS0 += obj instanceof com.google.android.gms.internal.measurement.L3 ? com.google.android.gms.internal.measurement.AbstractC5982c4.A((com.google.android.gms.internal.measurement.L3) obj) : com.google.android.gms.internal.measurement.AbstractC5982c4.C((java.lang.String) obj);
                i10++;
            }
        }
        return iS0;
    }

    static int r(int i6, java.util.List list, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS0 = com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6) * size;
        for (int i10 = 0; i10 < size; i10++) {
            iS0 += com.google.android.gms.internal.measurement.AbstractC5982c4.g((com.google.android.gms.internal.measurement.InterfaceC5965a5) list.get(i10), interfaceC6100p5);
        }
        return iS0;
    }

    static int s(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * com.google.android.gms.internal.measurement.AbstractC5982c4.s0(i6));
    }

    static int t(java.util.List list) {
        int iX;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.C6154w4) {
            com.google.android.gms.internal.measurement.C6154w4 c6154w4 = (com.google.android.gms.internal.measurement.C6154w4) list;
            iX = 0;
            while (i6 < size) {
                iX += com.google.android.gms.internal.measurement.AbstractC5982c4.X(c6154w4.e(i6));
                i6++;
            }
        } else {
            iX = 0;
            while (i6 < size) {
                iX += com.google.android.gms.internal.measurement.AbstractC5982c4.X(((java.lang.Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return iX;
    }

    public static void u(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.J(i6, list);
    }

    public static void v(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, com.google.android.gms.internal.measurement.InterfaceC6100p5 interfaceC6100p5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.l(i6, list, interfaceC6100p5);
    }

    public static void w(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.x(i6, list, z6);
    }

    static int x(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.measurement.AbstractC5982c4.h0(i6, 0);
    }

    static int y(java.util.List list) {
        return list.size() << 2;
    }

    public static void z(int i6, java.util.List list, com.google.android.gms.internal.measurement.X5 x6, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x6.b(i6, list, z6);
    }
}
