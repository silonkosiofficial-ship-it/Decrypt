package Y7;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends Y7.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f16477h = {p247y7.P.j(new p247y7.G(p247y7.P.b(Y7.e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E8.i f16478g;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final Y7.e.a f16479D = new Y7.e.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            return p097j7.S.e(p087i7.B.a(Y7.c.f16468a.b(), new p198t8.u("Deprecated in Java")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p048e8.InterfaceC6535a interfaceC6535a, p008a8.g gVar) {
        super(gVar, interfaceC6535a, L7.j.a.f6413y);
        p247y7.AbstractC7350t.f(gVar, "c");
        this.f16478g = gVar.e().d(Y7.e.a.f16479D);
    }

    @Override // Y7.b, P7.c
    public java.util.Map a() {
        return (java.util.Map) E8.m.a(this.f16478g, this, f16477h[0]);
    }
}
