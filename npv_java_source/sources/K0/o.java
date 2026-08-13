package K0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.d.c f6004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F0.J f6006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K0.k f6007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private K0.o f6009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6010g;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ K0.h f6011D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K0.h hVar) {
            super(1);
            this.f6011D = hVar;
        }

        public final void a(K0.w wVar) {
            K0.u.X(wVar, this.f6011D.n());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6012D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.String str) {
            super(1);
            this.f6012D = str;
        }

        public final void a(K0.w wVar) {
            K0.u.O(wVar, this.f6012D);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((K0.w) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class c extends androidx.compose.ui.d.c implements F0.z0 {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ p237x7.l f6013P;

        c(p237x7.l lVar) {
            this.f6013P = lVar;
        }

        @Override // F0.z0
        public void M0(K0.w wVar) {
            this.f6013P.l(wVar);
        }

        @Override // F0.z0
        public /* synthetic */ boolean h0() {
            return F0.y0.a(this);
        }

        @Override // F0.z0
        public /* synthetic */ boolean k1() {
            return F0.y0.b(this);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K0.o.d f6014D = new K0.o.d();

        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.J j6) {
            K0.k kVarI = j6.I();
            boolean z6 = false;
            if (kVarI != null && kVarI.M()) {
                z6 = true;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K0.o.e f6015D = new K0.o.e();

        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.J j6) {
            K0.k kVarI = j6.I();
            boolean z6 = false;
            if (kVarI != null && kVarI.M()) {
                z6 = true;
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final K0.o.f f6016D = new K0.o.f();

        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.J j6) {
            return java.lang.Boolean.valueOf(j6.k0().q(F0.AbstractC0918f0.a(8)));
        }
    }

    public o(androidx.compose.ui.d.c cVar, boolean z6, F0.J j6, K0.k kVar) {
        this.f6004a = cVar;
        this.f6005b = z6;
        this.f6006c = j6;
        this.f6007d = kVar;
        this.f6010g = j6.q0();
    }

    private final void B(K0.k kVar) {
        if (this.f6007d.E()) {
            return;
        }
        java.util.List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i6 = 0; i6 < size; i6++) {
            K0.o oVar = (K0.o) listD.get(i6);
            if (!oVar.y()) {
                kVar.N(oVar.f6007d);
                oVar.B(kVar);
            }
        }
    }

    public static /* synthetic */ java.util.List D(K0.o oVar, boolean z6, boolean z10, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = false;
        }
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        return oVar.C(z6, z10);
    }

    private final void b(java.util.List list) {
        K0.h hVarH = K0.p.h(this);
        if (hVarH != null && this.f6007d.M() && (!list.isEmpty())) {
            list.add(c(hVarH, new K0.o.a(hVarH)));
        }
        K0.k kVar = this.f6007d;
        K0.r rVar = K0.r.f6030a;
        if (kVar.f(rVar.d()) && (!list.isEmpty()) && this.f6007d.M()) {
            java.util.List list2 = (java.util.List) K0.l.a(this.f6007d, rVar.d());
            java.lang.String str = list2 != null ? (java.lang.String) p097j7.AbstractC6879v.k0(list2) : null;
            if (str != null) {
                list.add(0, c(null, new K0.o.b(str)));
            }
        }
    }

    private final K0.o c(K0.h hVar, p237x7.l lVar) {
        K0.k kVar = new K0.k();
        kVar.P(false);
        kVar.O(false);
        lVar.l(kVar);
        K0.o oVar = new K0.o(new K0.o.c(lVar), false, new F0.J(true, hVar != null ? K0.p.i(this) : K0.p.e(this)), kVar);
        oVar.f6008e = true;
        oVar.f6009f = this;
        return oVar;
    }

    private final void d(F0.J j6, java.util.List list, boolean z6) {
        X.b bVarV0 = j6.v0();
        int iT = bVarV0.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVarV0.s();
            int i6 = 0;
            do {
                F0.J j10 = (F0.J) objArrS[i6];
                if (j10.K0() && (z6 || !j10.L0())) {
                    if (j10.k0().q(F0.AbstractC0918f0.a(8))) {
                        list.add(K0.p.a(j10, this.f6005b));
                    } else {
                        d(j10, list, z6);
                    }
                }
                i6++;
            } while (i6 < iT);
        }
    }

    private final java.util.List f(java.util.List list) {
        java.util.List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i6 = 0; i6 < size; i6++) {
            K0.o oVar = (K0.o) listD.get(i6);
            if (oVar.y()) {
                list.add(oVar);
            } else if (!oVar.f6007d.E()) {
                oVar.f(list);
            }
        }
        return list;
    }

    static /* synthetic */ java.util.List g(K0.o oVar, java.util.List list, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            list = new java.util.ArrayList();
        }
        return oVar.f(list);
    }

    public static /* synthetic */ java.util.List m(K0.o oVar, boolean z6, boolean z10, boolean z11, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = !oVar.f6005b;
        }
        if ((i6 & 2) != 0) {
            z10 = false;
        }
        if ((i6 & 4) != 0) {
            z11 = false;
        }
        return oVar.l(z6, z10, z11);
    }

    private final boolean y() {
        return this.f6005b && this.f6007d.M();
    }

    public final boolean A() {
        return !this.f6008e && t().isEmpty() && K0.p.f(this.f6006c, K0.o.d.f6014D) == null;
    }

    public final java.util.List C(boolean z6, boolean z10) {
        if (this.f6008e) {
            return p097j7.AbstractC6879v.m();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        d(this.f6006c, arrayList, z10);
        if (z6) {
            b(arrayList);
        }
        return arrayList;
    }

    public final K0.o a() {
        return new K0.o(this.f6004a, true, this.f6006c, this.f6007d);
    }

    public final F0.AbstractC0914d0 e() {
        if (this.f6008e) {
            K0.o oVarR = r();
            if (oVarR != null) {
                return oVarR.e();
            }
            return null;
        }
        F0.InterfaceC0924j interfaceC0924jG = K0.p.g(this.f6006c);
        if (interfaceC0924jG == null) {
            interfaceC0924jG = this.f6004a;
        }
        return F0.AbstractC0925k.h(interfaceC0924jG, F0.AbstractC0918f0.a(8));
    }

    public final p131n0.i h() {
        D0.InterfaceC0900t interfaceC0900tM1;
        K0.o oVarR = r();
        if (oVarR == null) {
            return p131n0.i.f51317e.a();
        }
        F0.AbstractC0914d0 abstractC0914d0E = e();
        if (abstractC0914d0E != null) {
            if (!abstractC0914d0E.K()) {
                abstractC0914d0E = null;
            }
            if (abstractC0914d0E != null && (interfaceC0900tM1 = abstractC0914d0E.m1()) != null) {
                return D0.AbstractC0899s.a(F0.AbstractC0925k.h(oVarR.f6004a, F0.AbstractC0918f0.a(8)), interfaceC0900tM1, false, 2, null);
            }
        }
        return p131n0.i.f51317e.a();
    }

    public final p131n0.i i() {
        p131n0.i iVarB;
        F0.AbstractC0914d0 abstractC0914d0E = e();
        if (abstractC0914d0E != null) {
            if (!abstractC0914d0E.K()) {
                abstractC0914d0E = null;
            }
            if (abstractC0914d0E != null && (iVarB = D0.AbstractC0901u.b(abstractC0914d0E)) != null) {
                return iVarB;
            }
        }
        return p131n0.i.f51317e.a();
    }

    public final p131n0.i j() {
        p131n0.i iVarC;
        F0.AbstractC0914d0 abstractC0914d0E = e();
        if (abstractC0914d0E != null) {
            if (!abstractC0914d0E.K()) {
                abstractC0914d0E = null;
            }
            if (abstractC0914d0E != null && (iVarC = D0.AbstractC0901u.c(abstractC0914d0E)) != null) {
                return iVarC;
            }
        }
        return p131n0.i.f51317e.a();
    }

    public final java.util.List k() {
        return m(this, false, false, false, 7, null);
    }

    public final java.util.List l(boolean z6, boolean z10, boolean z11) {
        if (z6 || !this.f6007d.E()) {
            return y() ? g(this, null, 1, null) : C(z10, z11);
        }
        return p097j7.AbstractC6879v.m();
    }

    public final K0.k n() {
        if (!y()) {
            return this.f6007d;
        }
        K0.k kVarO = this.f6007d.o();
        B(kVarO);
        return kVarO;
    }

    public final int o() {
        return this.f6010g;
    }

    public final D0.InterfaceC0904x p() {
        return this.f6006c;
    }

    public final F0.J q() {
        return this.f6006c;
    }

    public final K0.o r() {
        K0.o oVar = this.f6009f;
        if (oVar != null) {
            return oVar;
        }
        F0.J jF = this.f6005b ? K0.p.f(this.f6006c, K0.o.e.f6015D) : null;
        if (jF == null) {
            jF = K0.p.f(this.f6006c, K0.o.f.f6016D);
        }
        if (jF == null) {
            return null;
        }
        return K0.p.a(jF, this.f6005b);
    }

    public final long s() {
        F0.AbstractC0914d0 abstractC0914d0E = e();
        if (abstractC0914d0E != null) {
            if (!abstractC0914d0E.K()) {
                abstractC0914d0E = null;
            }
            if (abstractC0914d0E != null) {
                return D0.AbstractC0901u.e(abstractC0914d0E);
            }
        }
        return p131n0.g.f51312b.c();
    }

    public final java.util.List t() {
        return m(this, false, true, false, 4, null);
    }

    public final long u() {
        F0.AbstractC0914d0 abstractC0914d0E = e();
        return abstractC0914d0E != null ? abstractC0914d0E.a() : Y0.t.f16230b.a();
    }

    public final p131n0.i v() {
        F0.InterfaceC0924j interfaceC0924jG;
        if (!this.f6007d.M() || (interfaceC0924jG = K0.p.g(this.f6006c)) == null) {
            interfaceC0924jG = this.f6004a;
        }
        return F0.A0.c(interfaceC0924jG.E0(), F0.A0.a(this.f6007d));
    }

    public final K0.k w() {
        return this.f6007d;
    }

    public final boolean x() {
        return this.f6008e;
    }

    public final boolean z() {
        F0.AbstractC0914d0 abstractC0914d0E = e();
        if (abstractC0914d0E != null) {
            return abstractC0914d0E.A2();
        }
        return false;
    }
}
