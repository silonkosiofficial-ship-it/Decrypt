package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p248y8.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f57357f = {p247y7.P.j(new p247y7.G(p247y7.P.b(p248y8.l.class), "functions", "getFunctions()Ljava/util/List;")), p247y7.P.j(new p247y7.G(p247y7.P.b(p248y8.l.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.InterfaceC1424e f57358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.i f57360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.i f57361e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return p097j7.AbstractC6879v.p(p178r8.e.g(p248y8.l.this.f57358b), p178r8.e.h(p248y8.l.this.f57358b));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            return p248y8.l.this.f57359c ? p097j7.AbstractC6879v.q(p178r8.e.f(p248y8.l.this.f57358b)) : p097j7.AbstractC6879v.m();
        }
    }

    public l(E8.n nVar, O7.InterfaceC1424e interfaceC1424e, boolean z6) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(interfaceC1424e, "containingClass");
        this.f57358b = interfaceC1424e;
        this.f57359c = z6;
        interfaceC1424e.j();
        O7.EnumC1425f enumC1425f = O7.EnumC1425f.CLASS;
        this.f57360d = nVar.d(new y8.l.a());
        this.f57361e = nVar.d(new y8.l.b());
    }

    private final java.util.List m() {
        return (java.util.List) E8.m.a(this.f57360d, this, f57357f[0]);
    }

    private final java.util.List n() {
        return (java.util.List) E8.m.a(this.f57361e, this, f57357f[1]);
    }

    @Override // p248y8.i, p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        java.util.List listN = n();
        P8.f fVar2 = new P8.f();
        for (java.lang.Object obj : listN) {
            if (p247y7.AbstractC7350t.b(((O7.U) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }

    @Override // p248y8.i, p248y8.k
    public /* bridge */ /* synthetic */ O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        return (O7.InterfaceC1427h) j(fVar, bVar);
    }

    public java.lang.Void j(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return null;
    }

    @Override // p248y8.i, p248y8.k
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public java.util.List e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return p097j7.AbstractC6879v.C0(m(), n());
    }

    @Override // p248y8.i, p248y8.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public P8.f b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        java.util.List listM = m();
        P8.f fVar2 = new P8.f();
        for (java.lang.Object obj : listM) {
            if (p247y7.AbstractC7350t.b(((O7.Z) obj).getName(), fVar)) {
                fVar2.add(obj);
            }
        }
        return fVar2;
    }
}
