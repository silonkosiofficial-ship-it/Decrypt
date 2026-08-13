package D8;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends R7.AbstractC1496b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final B8.m f2079M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p088i8.s f2080N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final D8.a f2081O;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return p097j7.AbstractC6879v.T0(D8.m.this.f2079M.c().d().a(D8.m.this.X0(), D8.m.this.f2079M.g()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(B8.m mVar, p088i8.s sVar, int i6) {
        p247y7.AbstractC7350t.f(mVar, "c");
        p247y7.AbstractC7350t.f(sVar, "proto");
        E8.n nVarH = mVar.h();
        O7.InterfaceC1432m interfaceC1432mE = mVar.e();
        P7.g gVarB = P7.g.f8385d.b();
        p138n8.f fVarB = B8.y.b(mVar.g(), sVar.N());
        B8.B b6 = B8.B.f820a;
        i8.s.c cVarT = sVar.T();
        p247y7.AbstractC7350t.e(cVarT, "getVariance(...)");
        super(nVarH, interfaceC1432mE, gVarB, fVarB, b6.d(cVarT), sVar.O(), i6, O7.a0.f8143a, O7.d0.a.f8153a);
        this.f2079M = mVar;
        this.f2080N = sVar;
        this.f2081O = new D8.a(mVar.h(), new D8.m.a());
    }

    @Override // R7.AbstractC1499e
    protected java.util.List U0() {
        java.util.List listS = p108k8.f.s(this.f2080N, this.f2079M.j());
        if (listS.isEmpty()) {
            return p097j7.AbstractC6879v.e(p218v8.c.j(this).y());
        }
        java.util.List list = listS;
        B8.E eI = this.f2079M.i();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(eI.q((p088i8.q) it.next()));
        }
        return arrayList;
    }

    @Override // P7.b, P7.a
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public D8.a k() {
        return this.f2081O;
    }

    public final p088i8.s X0() {
        return this.f2080N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R7.AbstractC1499e
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public java.lang.Void T0(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
        throw new java.lang.IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
