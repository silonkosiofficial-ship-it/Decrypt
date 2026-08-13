package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Class f21998a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.l0 f21999b = B(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.l0 f22000c = B(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.l0 f22001d = new androidx.datastore.preferences.protobuf.n0();

    private static java.lang.Class A() {
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static androidx.datastore.preferences.protobuf.l0 B(boolean z6) {
        try {
            java.lang.Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (androidx.datastore.preferences.protobuf.l0) clsC.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z6));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class C() {
        try {
            return java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static void D(androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.C2058s c2058sC = abstractC2056p.c(obj2);
        if (c2058sC.j()) {
            return;
        }
        abstractC2056p.d(obj).p(c2058sC);
    }

    static void E(androidx.datastore.preferences.protobuf.J j6, java.lang.Object obj, java.lang.Object obj2, long j10) {
        androidx.datastore.preferences.protobuf.p0.R(obj, j10, j6.a(androidx.datastore.preferences.protobuf.p0.C(obj, j10), androidx.datastore.preferences.protobuf.p0.C(obj2, j10)));
    }

    static void F(androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj, java.lang.Object obj2) {
        l0Var.p(obj, l0Var.k(l0Var.g(obj), l0Var.g(obj2)));
    }

    public static androidx.datastore.preferences.protobuf.l0 G() {
        return f21999b;
    }

    public static androidx.datastore.preferences.protobuf.l0 H() {
        return f22000c;
    }

    public static void I(java.lang.Class cls) {
        java.lang.Class cls2;
        if (!androidx.datastore.preferences.protobuf.AbstractC2062w.class.isAssignableFrom(cls) && (cls2 = f21998a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean J(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static java.lang.Object K(java.lang.Object obj, int i6, int i10, java.lang.Object obj2, androidx.datastore.preferences.protobuf.l0 l0Var) {
        if (obj2 == null) {
            obj2 = l0Var.f(obj);
        }
        l0Var.e(obj2, i6, i10);
        return obj2;
    }

    public static androidx.datastore.preferences.protobuf.l0 L() {
        return f22001d;
    }

    public static void M(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.A(i6, list, z6);
    }

    public static void N(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.N(i6, list);
    }

    public static void O(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.K(i6, list, z6);
    }

    public static void P(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i6, list, z6);
    }

    public static void Q(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i6, list, z6);
    }

    public static void R(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.u(i6, list, z6);
    }

    public static void S(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i6, list, z6);
    }

    public static void T(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, androidx.datastore.preferences.protobuf.e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.l(i6, list, e0Var);
    }

    public static void U(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.o(i6, list, z6);
    }

    public static void V(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i6, list, z6);
    }

    public static void W(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, androidx.datastore.preferences.protobuf.e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i6, list, e0Var);
    }

    public static void X(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.v(i6, list, z6);
    }

    public static void Y(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.f(i6, list, z6);
    }

    public static void Z(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i6, list, z6);
    }

    static int a(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) + androidx.datastore.preferences.protobuf.AbstractC2050j.y(size) : size * androidx.datastore.preferences.protobuf.AbstractC2050j.c(i6, true);
    }

    public static void a0(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.C(i6, list, z6);
    }

    static int b(java.util.List list) {
        return list.size();
    }

    public static void b0(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.k(i6, list);
    }

    static int c(int i6, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iO += androidx.datastore.preferences.protobuf.AbstractC2050j.g((androidx.datastore.preferences.protobuf.AbstractC2047g) list.get(i10));
        }
        return iO;
    }

    public static void c0(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.B(i6, list, z6);
    }

    static int d(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        return z6 ? iO + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iE) : iE + (size * iO);
    }

    public static void d0(int i6, java.util.List list, androidx.datastore.preferences.protobuf.s0 s0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i6, list, z6);
    }

    static int e(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iK += androidx.datastore.preferences.protobuf.AbstractC2050j.k(((java.lang.Integer) list.get(i6)).intValue());
        }
        return iK;
    }

    static int f(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) + androidx.datastore.preferences.protobuf.AbstractC2050j.y(size * 4) : size * androidx.datastore.preferences.protobuf.AbstractC2050j.l(i6, 0);
    }

    static int g(java.util.List list) {
        return list.size() * 4;
    }

    static int h(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) + androidx.datastore.preferences.protobuf.AbstractC2050j.y(size * 8) : size * androidx.datastore.preferences.protobuf.AbstractC2050j.n(i6, 0L);
    }

    static int i(java.util.List list) {
        return list.size() * 8;
    }

    static int j(int i6, java.util.List list, androidx.datastore.preferences.protobuf.e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iR += androidx.datastore.preferences.protobuf.AbstractC2050j.r(i6, (androidx.datastore.preferences.protobuf.O) list.get(i10), e0Var);
        }
        return iR;
    }

    static int k(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        return z6 ? iO + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iL) : iL + (size * iO);
    }

    static int l(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iV += androidx.datastore.preferences.protobuf.AbstractC2050j.v(((java.lang.Integer) list.get(i6)).intValue());
        }
        return iV;
    }

    static int m(int i6, java.util.List list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z6 ? androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iN) : iN + (list.size() * androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6));
    }

    static int n(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iX += androidx.datastore.preferences.protobuf.AbstractC2050j.x(((java.lang.Long) list.get(i6)).longValue());
        }
        return iX;
    }

    static int o(int i6, java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return androidx.datastore.preferences.protobuf.AbstractC2050j.z(i6, (androidx.datastore.preferences.protobuf.O) obj, e0Var);
    }

    static int p(int i6, java.util.List list, androidx.datastore.preferences.protobuf.e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) * size;
        for (int i10 = 0; i10 < size; i10++) {
            iO += androidx.datastore.preferences.protobuf.AbstractC2050j.B((androidx.datastore.preferences.protobuf.O) list.get(i10), e0Var);
        }
        return iO;
    }

    static int q(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        return z6 ? iO + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iR) : iR + (size * iO);
    }

    static int r(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iJ += androidx.datastore.preferences.protobuf.AbstractC2050j.J(((java.lang.Integer) list.get(i6)).intValue());
        }
        return iJ;
    }

    static int s(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        return z6 ? iO + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iT) : iT + (size * iO);
    }

    static int t(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iL = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iL += androidx.datastore.preferences.protobuf.AbstractC2050j.L(((java.lang.Long) list.get(i6)).longValue());
        }
        return iL;
    }

    static int u(int i6, java.util.List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6) * size;
        if (list instanceof androidx.datastore.preferences.protobuf.D) {
            androidx.datastore.preferences.protobuf.D d6 = (androidx.datastore.preferences.protobuf.D) list;
            while (i10 < size) {
                java.lang.Object objA = d6.A(i10);
                iO += objA instanceof androidx.datastore.preferences.protobuf.AbstractC2047g ? androidx.datastore.preferences.protobuf.AbstractC2050j.g((androidx.datastore.preferences.protobuf.AbstractC2047g) objA) : androidx.datastore.preferences.protobuf.AbstractC2050j.N((java.lang.String) objA);
                i10++;
            }
        } else {
            while (i10 < size) {
                java.lang.Object obj = list.get(i10);
                iO += obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g ? androidx.datastore.preferences.protobuf.AbstractC2050j.g((androidx.datastore.preferences.protobuf.AbstractC2047g) obj) : androidx.datastore.preferences.protobuf.AbstractC2050j.N((java.lang.String) obj);
                i10++;
            }
        }
        return iO;
    }

    static int v(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        return z6 ? iO + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iW) : iW + (size * iO);
    }

    static int w(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.AbstractC2063x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iQ = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iQ += androidx.datastore.preferences.protobuf.AbstractC2050j.Q(((java.lang.Integer) list.get(i6)).intValue());
        }
        return iQ;
    }

    static int x(int i6, java.util.List list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        int iO = androidx.datastore.preferences.protobuf.AbstractC2050j.O(i6);
        return z6 ? iO + androidx.datastore.preferences.protobuf.AbstractC2050j.y(iY) : iY + (size * iO);
    }

    static int y(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof androidx.datastore.preferences.protobuf.F) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iS = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iS += androidx.datastore.preferences.protobuf.AbstractC2050j.S(((java.lang.Long) list.get(i6)).longValue());
        }
        return iS;
    }

    static java.lang.Object z(java.lang.Object obj, int i6, java.util.List list, androidx.datastore.preferences.protobuf.AbstractC2064y.a aVar, java.lang.Object obj2, androidx.datastore.preferences.protobuf.l0 l0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                java.lang.Integer num = (java.lang.Integer) list.get(i11);
                int iIntValue = num.intValue();
                if (aVar.a(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = K(obj, i6, iIntValue, obj2, l0Var);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
                if (!aVar.a(iIntValue2)) {
                    obj2 = K(obj, i6, iIntValue2, obj2, l0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
