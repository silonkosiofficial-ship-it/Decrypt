package Y7;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends Y7.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f16485h = {p247y7.P.j(new p247y7.G(p247y7.P.b(Y7.i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E8.i f16486g;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        /* JADX WARN: Code duplicated, block: B:13:0x0042  */
        /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            p198t8.g gVarC;
            Y7.d dVar;
            java.util.List listE;
            java.util.Map mapE;
            p048e8.InterfaceC6536b interfaceC6536bB = Y7.i.this.b();
            if (!(interfaceC6536bB instanceof p048e8.e)) {
                if (interfaceC6536bB instanceof p048e8.m) {
                    dVar = Y7.d.f16473a;
                    listE = p097j7.AbstractC6879v.e(Y7.i.this.b());
                } else {
                    gVarC = null;
                }
                mapE = gVarC != null ? p097j7.S.e(p087i7.B.a(Y7.c.f16468a.d(), gVarC)) : null;
                if (mapE == null) {
                    return p097j7.S.h();
                }
                return mapE;
            }
            dVar = Y7.d.f16473a;
            listE = ((p048e8.e) Y7.i.this.b()).e();
            gVarC = dVar.c(listE);
            if (gVarC != null) {
            }
            if (mapE == null) {
                return p097j7.S.h();
            }
            return mapE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p048e8.InterfaceC6535a interfaceC6535a, p008a8.g gVar) {
        super(gVar, interfaceC6535a, L7.j.a.f6341H);
        p247y7.AbstractC7350t.f(interfaceC6535a, "annotation");
        p247y7.AbstractC7350t.f(gVar, "c");
        this.f16486g = gVar.e().d(new Y7.i.a());
    }

    @Override // Y7.b, P7.c
    public java.util.Map a() {
        return (java.util.Map) E8.m.a(this.f16486g, this, f16485h[0]);
    }
}
