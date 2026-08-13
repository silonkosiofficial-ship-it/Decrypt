package J6;

/* JADX INFO: loaded from: classes3.dex */
final class e implements J6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.a f5733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f5734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W6.C1767a f5735c;

    public e(java.lang.String str, p237x7.a aVar, p237x7.l lVar) {
        F7.o oVarQ;
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(aVar, "createConfiguration");
        p247y7.AbstractC7350t.f(lVar, "body");
        this.f5733a = aVar;
        this.f5734b = lVar;
        F7.c cVarB = p247y7.P.b(J6.g.class);
        try {
            F7.q.a aVar2 = F7.q.f2794c;
            F7.p pVarS = p247y7.P.s(p247y7.P.b(J6.e.class), "PluginConfigT", F7.r.INVARIANT, false);
            p247y7.P.n(pVarS, p247y7.P.p(java.lang.Object.class));
            oVarQ = p247y7.P.q(J6.g.class, aVar2.d(p247y7.P.o(pVarS)));
        } catch (java.lang.Throwable unused) {
            oVarQ = null;
        }
        this.f5735c = new W6.C1767a(str, new p017b7.a(cVarB, oVarQ));
    }

    @Override // I6.r
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(J6.g gVar, C6.c cVar) {
        p247y7.AbstractC7350t.f(gVar, "plugin");
        p247y7.AbstractC7350t.f(cVar, "scope");
        gVar.A0(cVar);
    }

    @Override // I6.r
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public J6.g a(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "block");
        java.lang.Object objB = this.f5733a.b();
        lVar.l(objB);
        return new J6.g(getKey(), objB, this.f5734b);
    }

    @Override // I6.r
    public W6.C1767a getKey() {
        return this.f5735c;
    }
}
