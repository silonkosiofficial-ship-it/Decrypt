package Y7;

/* JADX INFO: loaded from: classes2.dex */
public class b implements P7.c, Z7.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f16460f = {p247y7.P.j(new p247y7.G(p247y7.P.b(Y7.b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.c f16461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.a0 f16462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8.i f16463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p048e8.InterfaceC6536b f16464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16465e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p008a8.g f16466D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ Y7.b f16467E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p008a8.g gVar, Y7.b bVar) {
            super(0);
            this.f16466D = gVar;
            this.f16467E = bVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M b() {
            F8.M mW = this.f16466D.d().t().o(this.f16467E.e()).w();
            p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
            return mW;
        }
    }

    public b(p008a8.g gVar, p048e8.InterfaceC6535a interfaceC6535a, p138n8.c cVar) {
        O7.a0 a0VarA;
        java.util.Collection collectionA;
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        this.f16461a = cVar;
        if (interfaceC6535a == null || (a0VarA = gVar.a().t().a(interfaceC6535a)) == null) {
            a0VarA = O7.a0.f8143a;
            p247y7.AbstractC7350t.e(a0VarA, "NO_SOURCE");
        }
        this.f16462b = a0VarA;
        this.f16463c = gVar.e().d(new Y7.b.a(gVar, this));
        this.f16464d = (interfaceC6535a == null || (collectionA = interfaceC6535a.a()) == null) ? null : (p048e8.InterfaceC6536b) p097j7.AbstractC6879v.j0(collectionA);
        boolean z6 = false;
        if (interfaceC6535a != null && interfaceC6535a.d()) {
            z6 = true;
        }
        this.f16465e = z6;
    }

    @Override // P7.c
    public java.util.Map a() {
        return p097j7.S.h();
    }

    protected final p048e8.InterfaceC6536b b() {
        return this.f16464d;
    }

    @Override // P7.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public F8.M getType() {
        return (F8.M) E8.m.a(this.f16463c, this, f16460f[0]);
    }

    @Override // Z7.g
    public boolean d() {
        return this.f16465e;
    }

    @Override // P7.c
    public p138n8.c e() {
        return this.f16461a;
    }

    @Override // P7.c
    public O7.a0 o() {
        return this.f16462b;
    }
}
