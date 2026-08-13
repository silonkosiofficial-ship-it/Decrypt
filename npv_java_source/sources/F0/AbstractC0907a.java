package F0;

/* JADX INFO: renamed from: F0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0907a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.InterfaceC0909b f2537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F0.InterfaceC0909b f2544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.Map f2545i;

    /* JADX INFO: renamed from: F0.a$a, reason: collision with other inner class name */
    static final class C0059a extends p247y7.AbstractC7352v implements p237x7.l {
        C0059a() {
            super(1);
        }

        public final void a(F0.InterfaceC0909b interfaceC0909b) {
            if (!interfaceC0909b.k()) {
                return;
            }
            if (interfaceC0909b.f().g()) {
                interfaceC0909b.d0();
            }
            java.util.Map map = interfaceC0909b.f().f2545i;
            F0.AbstractC0907a abstractC0907a = F0.AbstractC0907a.this;
            for (java.util.Map.Entry entry : map.entrySet()) {
                abstractC0907a.c((D0.AbstractC0882a) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue(), interfaceC0909b.F());
            }
            F0.AbstractC0914d0 abstractC0914d0F = interfaceC0909b.F();
            while (true) {
                abstractC0914d0F = abstractC0914d0F.p2();
                p247y7.AbstractC7350t.c(abstractC0914d0F);
                if (p247y7.AbstractC7350t.b(abstractC0914d0F, F0.AbstractC0907a.this.f().F())) {
                    return;
                }
                java.util.Set<D0.AbstractC0882a> setKeySet = F0.AbstractC0907a.this.e(abstractC0914d0F).keySet();
                F0.AbstractC0907a abstractC0907a2 = F0.AbstractC0907a.this;
                for (D0.AbstractC0882a abstractC0882a : setKeySet) {
                    abstractC0907a2.c(abstractC0882a, abstractC0907a2.i(abstractC0914d0F, abstractC0882a), abstractC0914d0F);
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.InterfaceC0909b) obj);
            return p087i7.M.f46721a;
        }
    }

    private AbstractC0907a(F0.InterfaceC0909b interfaceC0909b) {
        this.f2537a = interfaceC0909b;
        this.f2538b = true;
        this.f2545i = new java.util.HashMap();
    }

    public /* synthetic */ AbstractC0907a(F0.InterfaceC0909b interfaceC0909b, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC0909b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(D0.AbstractC0882a abstractC0882a, int i6, F0.AbstractC0914d0 abstractC0914d0) {
        long jA;
        loop0: while (true) {
            float f6 = i6;
            jA = p131n0.h.a(f6, f6);
            do {
                jA = d(abstractC0914d0, jA);
                abstractC0914d0 = abstractC0914d0.p2();
                p247y7.AbstractC7350t.c(abstractC0914d0);
                if (p247y7.AbstractC7350t.b(abstractC0914d0, this.f2537a.F())) {
                    break loop0;
                }
            } while (!e(abstractC0914d0).containsKey(abstractC0882a));
            i6 = i(abstractC0914d0, abstractC0882a);
        }
        int iRound = java.lang.Math.round(abstractC0882a instanceof D0.C0894m ? p131n0.g.n(jA) : p131n0.g.m(jA));
        java.util.Map map = this.f2545i;
        if (map.containsKey(abstractC0882a)) {
            iRound = D0.AbstractC0883b.c(abstractC0882a, ((java.lang.Number) p097j7.S.i(this.f2545i, abstractC0882a)).intValue(), iRound);
        }
        map.put(abstractC0882a, java.lang.Integer.valueOf(iRound));
    }

    protected abstract long d(F0.AbstractC0914d0 abstractC0914d0, long j6);

    protected abstract java.util.Map e(F0.AbstractC0914d0 abstractC0914d0);

    public final F0.InterfaceC0909b f() {
        return this.f2537a;
    }

    public final boolean g() {
        return this.f2538b;
    }

    public final java.util.Map h() {
        return this.f2545i;
    }

    protected abstract int i(F0.AbstractC0914d0 abstractC0914d0, D0.AbstractC0882a abstractC0882a);

    public final boolean j() {
        return this.f2539c || this.f2541e || this.f2542f || this.f2543g;
    }

    public final boolean k() {
        o();
        return this.f2544h != null;
    }

    public final boolean l() {
        return this.f2540d;
    }

    public final void m() {
        this.f2538b = true;
        F0.InterfaceC0909b interfaceC0909bJ = this.f2537a.J();
        if (interfaceC0909bJ == null) {
            return;
        }
        if (this.f2539c) {
            interfaceC0909bJ.i0();
        } else if (this.f2541e || this.f2540d) {
            interfaceC0909bJ.requestLayout();
        }
        if (this.f2542f) {
            this.f2537a.i0();
        }
        if (this.f2543g) {
            this.f2537a.requestLayout();
        }
        interfaceC0909bJ.f().m();
    }

    public final void n() {
        this.f2545i.clear();
        this.f2537a.c0(new F0.AbstractC0907a.C0059a());
        this.f2545i.putAll(e(this.f2537a.F()));
        this.f2538b = false;
    }

    public final void o() {
        F0.InterfaceC0909b interfaceC0909b;
        F0.AbstractC0907a abstractC0907aF;
        F0.AbstractC0907a abstractC0907aF2;
        if (j()) {
            interfaceC0909b = this.f2537a;
        } else {
            F0.InterfaceC0909b interfaceC0909bJ = this.f2537a.J();
            if (interfaceC0909bJ == null) {
                return;
            }
            interfaceC0909b = interfaceC0909bJ.f().f2544h;
            if (interfaceC0909b == null || !interfaceC0909b.f().j()) {
                F0.InterfaceC0909b interfaceC0909b2 = this.f2544h;
                if (interfaceC0909b2 == null || interfaceC0909b2.f().j()) {
                    return;
                }
                F0.InterfaceC0909b interfaceC0909bJ2 = interfaceC0909b2.J();
                if (interfaceC0909bJ2 != null && (abstractC0907aF2 = interfaceC0909bJ2.f()) != null) {
                    abstractC0907aF2.o();
                }
                F0.InterfaceC0909b interfaceC0909bJ3 = interfaceC0909b2.J();
                interfaceC0909b = (interfaceC0909bJ3 == null || (abstractC0907aF = interfaceC0909bJ3.f()) == null) ? null : abstractC0907aF.f2544h;
            }
        }
        this.f2544h = interfaceC0909b;
    }

    public final void p() {
        this.f2538b = true;
        this.f2539c = false;
        this.f2541e = false;
        this.f2540d = false;
        this.f2542f = false;
        this.f2543g = false;
        this.f2544h = null;
    }

    public final void q(boolean z6) {
        this.f2541e = z6;
    }

    public final void r(boolean z6) {
        this.f2543g = z6;
    }

    public final void s(boolean z6) {
        this.f2542f = z6;
    }

    public final void t(boolean z6) {
        this.f2540d = z6;
    }

    public final void u(boolean z6) {
        this.f2539c = z6;
    }
}
