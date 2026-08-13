package R7;

/* JADX INFO: loaded from: classes2.dex */
public class r extends R7.AbstractC1504j implements O7.P {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f9697J = {p247y7.P.j(new p247y7.G(p247y7.P.b(R7.r.class), "fragments", "getFragments()Ljava/util/List;")), p247y7.P.j(new p247y7.G(p247y7.P.b(R7.r.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final R7.x f9698E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p138n8.c f9699F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final E8.i f9700G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final E8.i f9701H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p248y8.h f9702I;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.valueOf(O7.N.b(R7.r.this.E0().Z0(), R7.r.this.e()));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return O7.N.c(R7.r.this.E0().Z0(), R7.r.this.e());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p248y8.h b() {
            if (R7.r.this.isEmpty()) {
                return y8.h.b.f57356b;
            }
            java.util.List listN = R7.r.this.N();
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listN, 10));
            java.util.Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add(((O7.K) it.next()).u());
            }
            java.util.List listD0 = p097j7.AbstractC6879v.D0(arrayList, new R7.H(R7.r.this.E0(), R7.r.this.e()));
            return p248y8.b.f57309d.a("package view scope for " + R7.r.this.e() + " in " + R7.r.this.E0().getName(), listD0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(R7.x xVar, p138n8.c cVar, E8.n nVar) {
        super(P7.g.f8385d.b(), cVar.h());
        p247y7.AbstractC7350t.f(xVar, "module");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        this.f9698E = xVar;
        this.f9699F = cVar;
        this.f9700G = nVar.d(new R7.r.b());
        this.f9701H = nVar.d(new R7.r.a());
        this.f9702I = new p248y8.g(nVar, new R7.r.c());
    }

    @Override // O7.InterfaceC1432m
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public O7.P b() {
        if (e().d()) {
            return null;
        }
        R7.x xVarE0 = E0();
        p138n8.c cVarE = e().e();
        p247y7.AbstractC7350t.e(cVarE, "parent(...)");
        return xVarE0.s0(cVarE);
    }

    @Override // O7.P
    public java.util.List N() {
        return (java.util.List) E8.m.a(this.f9700G, this, f9697J[0]);
    }

    protected final boolean O0() {
        return ((java.lang.Boolean) E8.m.a(this.f9701H, this, f9697J[1])).booleanValue();
    }

    @Override // O7.P
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public R7.x E0() {
        return this.f9698E;
    }

    @Override // O7.P
    public p138n8.c e() {
        return this.f9699F;
    }

    public boolean equals(java.lang.Object obj) {
        O7.P p6 = obj instanceof O7.P ? (O7.P) obj : null;
        return p6 != null && p247y7.AbstractC7350t.b(e(), p6.e()) && p247y7.AbstractC7350t.b(E0(), p6.E0());
    }

    public int hashCode() {
        return (E0().hashCode() * 31) + e().hashCode();
    }

    @Override // O7.P
    public boolean isEmpty() {
        return O0();
    }

    @Override // O7.InterfaceC1432m
    public java.lang.Object r0(O7.InterfaceC1434o interfaceC1434o, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(interfaceC1434o, "visitor");
        return interfaceC1434o.k(this, obj);
    }

    @Override // O7.P
    public p248y8.h u() {
        return this.f9702I;
    }
}
