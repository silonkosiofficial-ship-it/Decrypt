package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2051k implements androidx.datastore.preferences.protobuf.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.AbstractC2050j f22061a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22062a;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.r0.b.values().length];
            f22062a = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.r0.b.f22121L.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22120K.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22118I.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22128S.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22130U.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22126Q.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22119J.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22116G.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22129T.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22131V.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22117H.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                f22062a[androidx.datastore.preferences.protobuf.r0.b.f22122M.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private C2051k(androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j) {
        androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j2 = (androidx.datastore.preferences.protobuf.AbstractC2050j) androidx.datastore.preferences.protobuf.AbstractC2064y.b(abstractC2050j, "output");
        this.f22061a = abstractC2050j2;
        abstractC2050j2.f22053a = this;
    }

    public static androidx.datastore.preferences.protobuf.C2051k P(androidx.datastore.preferences.protobuf.AbstractC2050j abstractC2050j) {
        androidx.datastore.preferences.protobuf.C2051k c2051k = abstractC2050j.f22053a;
        return c2051k != null ? c2051k : new androidx.datastore.preferences.protobuf.C2051k(abstractC2050j);
    }

    private void Q(int i6, boolean z6, java.lang.Object obj, androidx.datastore.preferences.protobuf.H.a aVar) {
        this.f22061a.M0(i6, 2);
        this.f22061a.O0(androidx.datastore.preferences.protobuf.H.b(aVar, java.lang.Boolean.valueOf(z6), obj));
        androidx.datastore.preferences.protobuf.H.e(this.f22061a, aVar, java.lang.Boolean.valueOf(z6), obj);
    }

    private void R(int i6, androidx.datastore.preferences.protobuf.H.a aVar, java.util.Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((java.lang.Integer) it.next()).intValue();
            i10++;
        }
        java.util.Arrays.sort(iArr);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            java.lang.Object obj = map.get(java.lang.Integer.valueOf(i12));
            this.f22061a.M0(i6, 2);
            this.f22061a.O0(androidx.datastore.preferences.protobuf.H.b(aVar, java.lang.Integer.valueOf(i12), obj));
            androidx.datastore.preferences.protobuf.H.e(this.f22061a, aVar, java.lang.Integer.valueOf(i12), obj);
        }
    }

    private void S(int i6, androidx.datastore.preferences.protobuf.H.a aVar, java.util.Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        java.util.Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((java.lang.Long) it.next()).longValue();
            i10++;
        }
        java.util.Arrays.sort(jArr);
        for (int i11 = 0; i11 < size; i11++) {
            long j6 = jArr[i11];
            java.lang.Object obj = map.get(java.lang.Long.valueOf(j6));
            this.f22061a.M0(i6, 2);
            this.f22061a.O0(androidx.datastore.preferences.protobuf.H.b(aVar, java.lang.Long.valueOf(j6), obj));
            androidx.datastore.preferences.protobuf.H.e(this.f22061a, aVar, java.lang.Long.valueOf(j6), obj);
        }
    }

    private void T(int i6, androidx.datastore.preferences.protobuf.H.a aVar, java.util.Map map) {
        switch (androidx.datastore.preferences.protobuf.C2051k.a.f22062a[aVar.f21936a.ordinal()]) {
            case 1:
                java.lang.Object obj = map.get(java.lang.Boolean.FALSE);
                if (obj != null) {
                    Q(i6, false, obj, aVar);
                }
                java.lang.Object obj2 = map.get(java.lang.Boolean.TRUE);
                if (obj2 != null) {
                    Q(i6, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i6, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i6, aVar, map);
                return;
            case 12:
                U(i6, aVar, map);
                return;
            default:
                throw new java.lang.IllegalArgumentException("does not support key type: " + aVar.f21936a);
        }
    }

    private void U(int i6, androidx.datastore.preferences.protobuf.H.a aVar, java.util.Map map) {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = (java.lang.String) it.next();
            i10++;
        }
        java.util.Arrays.sort(strArr);
        for (int i11 = 0; i11 < size; i11++) {
            java.lang.String str = strArr[i11];
            java.lang.Object obj = map.get(str);
            this.f22061a.M0(i6, 2);
            this.f22061a.O0(androidx.datastore.preferences.protobuf.H.b(aVar, str, obj));
            androidx.datastore.preferences.protobuf.H.e(this.f22061a, aVar, str, obj);
        }
    }

    private void V(int i6, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            this.f22061a.K0(i6, (java.lang.String) obj);
        } else {
            this.f22061a.e0(i6, (androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void A(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.a0(i6, ((java.lang.Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iD = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iD += androidx.datastore.preferences.protobuf.AbstractC2050j.d(((java.lang.Boolean) list.get(i11)).booleanValue());
        }
        this.f22061a.O0(iD);
        while (i10 < list.size()) {
            this.f22061a.b0(((java.lang.Boolean) list.get(i10)).booleanValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void B(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.N0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iQ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iQ += androidx.datastore.preferences.protobuf.AbstractC2050j.Q(((java.lang.Integer) list.get(i11)).intValue());
        }
        this.f22061a.O0(iQ);
        while (i10 < list.size()) {
            this.f22061a.O0(((java.lang.Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void C(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.I0(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iL = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iL += androidx.datastore.preferences.protobuf.AbstractC2050j.L(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f22061a.O0(iL);
        while (i10 < list.size()) {
            this.f22061a.J0(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void D(int i6, long j6) {
        this.f22061a.I0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void E(int i6, float f6) {
        this.f22061a.o0(i6, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void F(int i6) {
        this.f22061a.M0(i6, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void G(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.G0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iJ += androidx.datastore.preferences.protobuf.AbstractC2050j.J(((java.lang.Integer) list.get(i11)).intValue());
        }
        this.f22061a.O0(iJ);
        while (i10 < list.size()) {
            this.f22061a.H0(((java.lang.Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void H(int i6, int i10) {
        this.f22061a.i0(i6, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void I(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.w0(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iX = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX += androidx.datastore.preferences.protobuf.AbstractC2050j.x(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f22061a.O0(iX);
        while (i10 < list.size()) {
            this.f22061a.x0(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void J(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.i0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iK = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iK += androidx.datastore.preferences.protobuf.AbstractC2050j.k(((java.lang.Integer) list.get(i11)).intValue());
        }
        this.f22061a.O0(iK);
        while (i10 < list.size()) {
            this.f22061a.j0(((java.lang.Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void K(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.g0(i6, ((java.lang.Double) list.get(i10)).doubleValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += androidx.datastore.preferences.protobuf.AbstractC2050j.i(((java.lang.Double) list.get(i12)).doubleValue());
        }
        this.f22061a.O0(i11);
        while (i10 < list.size()) {
            this.f22061a.h0(((java.lang.Double) list.get(i10)).doubleValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void L(int i6, androidx.datastore.preferences.protobuf.H.a aVar, java.util.Map map) {
        if (this.f22061a.X()) {
            T(i6, aVar, map);
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f22061a.M0(i6, 2);
            this.f22061a.O0(androidx.datastore.preferences.protobuf.H.b(aVar, entry.getKey(), entry.getValue()));
            androidx.datastore.preferences.protobuf.H.e(this.f22061a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void M(int i6, int i10) {
        this.f22061a.G0(i6, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void N(int i6, java.util.List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f22061a.e0(i6, (androidx.datastore.preferences.protobuf.AbstractC2047g) list.get(i10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void O(int i6, java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var) {
        this.f22061a.r0(i6, (androidx.datastore.preferences.protobuf.O) obj, e0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.o0(i6, ((java.lang.Float) list.get(i10)).floatValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iQ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iQ += androidx.datastore.preferences.protobuf.AbstractC2050j.q(((java.lang.Float) list.get(i11)).floatValue());
        }
        this.f22061a.O0(iQ);
        while (i10 < list.size()) {
            this.f22061a.p0(((java.lang.Float) list.get(i10)).floatValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i6, int i10) {
        this.f22061a.N0(i6, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void c(int i6, java.lang.Object obj) {
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC2047g) {
            this.f22061a.B0(i6, (androidx.datastore.preferences.protobuf.AbstractC2047g) obj);
        } else {
            this.f22061a.A0(i6, (androidx.datastore.preferences.protobuf.O) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i6, int i10) {
        this.f22061a.k0(i6, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i6, double d6) {
        this.f22061a.g0(i6, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.E0(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iH = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iH += androidx.datastore.preferences.protobuf.AbstractC2050j.H(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f22061a.O0(iH);
        while (i10 < list.size()) {
            this.f22061a.F0(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void g(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.P0(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iS = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iS += androidx.datastore.preferences.protobuf.AbstractC2050j.S(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f22061a.O0(iS);
        while (i10 < list.size()) {
            this.f22061a.Q0(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void h(int i6, long j6) {
        this.f22061a.m0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public androidx.datastore.preferences.protobuf.s0.a i() {
        return androidx.datastore.preferences.protobuf.s0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void j(int i6, java.util.List list, androidx.datastore.preferences.protobuf.e0 e0Var) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            z(i6, list.get(i10), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void k(int i6, java.util.List list) {
        int i10 = 0;
        if (!(list instanceof androidx.datastore.preferences.protobuf.D)) {
            while (i10 < list.size()) {
                this.f22061a.K0(i6, (java.lang.String) list.get(i10));
                i10++;
            }
        } else {
            androidx.datastore.preferences.protobuf.D d6 = (androidx.datastore.preferences.protobuf.D) list;
            while (i10 < list.size()) {
                V(i6, d6.A(i10));
                i10++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void l(int i6, java.util.List list, androidx.datastore.preferences.protobuf.e0 e0Var) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            O(i6, list.get(i10), e0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void m(int i6, java.lang.String str) {
        this.f22061a.K0(i6, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void n(int i6, long j6) {
        this.f22061a.P0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void o(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.u0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iV = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iV += androidx.datastore.preferences.protobuf.AbstractC2050j.v(((java.lang.Integer) list.get(i11)).intValue());
        }
        this.f22061a.O0(iV);
        while (i10 < list.size()) {
            this.f22061a.v0(((java.lang.Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void p(int i6, long j6) {
        this.f22061a.w0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void q(int i6, boolean z6) {
        this.f22061a.a0(i6, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void r(int i6, int i10) {
        this.f22061a.C0(i6, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void s(int i6) {
        this.f22061a.M0(i6, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void t(int i6, int i10) {
        this.f22061a.u0(i6, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void u(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.m0(i6, ((java.lang.Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iO = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iO += androidx.datastore.preferences.protobuf.AbstractC2050j.o(((java.lang.Long) list.get(i11)).longValue());
        }
        this.f22061a.O0(iO);
        while (i10 < list.size()) {
            this.f22061a.n0(((java.lang.Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void v(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.C0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iF = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iF += androidx.datastore.preferences.protobuf.AbstractC2050j.F(((java.lang.Integer) list.get(i11)).intValue());
        }
        this.f22061a.O0(iF);
        while (i10 < list.size()) {
            this.f22061a.D0(((java.lang.Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void w(int i6, androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047g) {
        this.f22061a.e0(i6, abstractC2047g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void x(int i6, long j6) {
        this.f22061a.E0(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void y(int i6, java.util.List list, boolean z6) {
        int i10 = 0;
        if (!z6) {
            while (i10 < list.size()) {
                this.f22061a.k0(i6, ((java.lang.Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f22061a.M0(i6, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM += androidx.datastore.preferences.protobuf.AbstractC2050j.m(((java.lang.Integer) list.get(i11)).intValue());
        }
        this.f22061a.O0(iM);
        while (i10 < list.size()) {
            this.f22061a.l0(((java.lang.Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void z(int i6, java.lang.Object obj, androidx.datastore.preferences.protobuf.e0 e0Var) {
        this.f22061a.y0(i6, (androidx.datastore.preferences.protobuf.O) obj, e0Var);
    }
}
