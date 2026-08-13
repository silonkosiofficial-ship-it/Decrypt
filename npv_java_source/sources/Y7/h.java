package Y7;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends Y7.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f16482h = {p247y7.P.j(new p247y7.G(p247y7.P.b(Y7.h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E8.i f16483g;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            p198t8.g gVarA = Y7.d.f16473a.a(Y7.h.this.b());
            java.util.Map mapE = gVarA != null ? p097j7.S.e(p087i7.B.a(Y7.c.f16468a.c(), gVarA)) : null;
            return mapE == null ? p097j7.S.h() : mapE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p048e8.InterfaceC6535a interfaceC6535a, p008a8.g gVar) {
        super(gVar, interfaceC6535a, L7.j.a.f6349L);
        p247y7.AbstractC7350t.f(interfaceC6535a, "annotation");
        p247y7.AbstractC7350t.f(gVar, "c");
        this.f16483g = gVar.e().d(new Y7.h.a());
    }

    @Override // Y7.b, P7.c
    public java.util.Map a() {
        return (java.util.Map) E8.m.a(this.f16483g, this, f16482h[0]);
    }
}
