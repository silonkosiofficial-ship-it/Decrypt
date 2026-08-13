package p008a8;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements P7.g {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p008a8.g f17125C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p048e8.InterfaceC6538d f17126D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f17127E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final E8.h f17128F;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P7.c l(p048e8.InterfaceC6535a interfaceC6535a) {
            p247y7.AbstractC7350t.f(interfaceC6535a, "annotation");
            return Y7.c.f16468a.e(interfaceC6535a, p008a8.d.this.f17125C, p008a8.d.this.f17127E);
        }
    }

    public d(p008a8.g gVar, p048e8.InterfaceC6538d interfaceC6538d, boolean z6) {
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(interfaceC6538d, "annotationOwner");
        this.f17125C = gVar;
        this.f17126D = interfaceC6538d;
        this.f17127E = z6;
        this.f17128F = gVar.a().u().h(new a8.d.a());
    }

    public /* synthetic */ d(p008a8.g gVar, p048e8.InterfaceC6538d interfaceC6538d, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, interfaceC6538d, (i6 & 4) != 0 ? false : z6);
    }

    @Override // P7.g
    public boolean H(p138n8.c cVar) {
        return P7.g.b.b(this, cVar);
    }

    @Override // P7.g
    public boolean isEmpty() {
        return this.f17126D.k().isEmpty() && !this.f17126D.o();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return R8.k.y(R8.k.J(R8.k.G(p097j7.AbstractC6879v.Y(this.f17126D.k()), this.f17128F), Y7.c.f16468a.a(L7.j.a.f6413y, this.f17126D, this.f17125C))).iterator();
    }

    @Override // P7.g
    public P7.c j(p138n8.c cVar) {
        P7.c cVar2;
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p048e8.InterfaceC6535a interfaceC6535aJ = this.f17126D.j(cVar);
        return (interfaceC6535aJ == null || (cVar2 = (P7.c) this.f17128F.l(interfaceC6535aJ)) == null) ? Y7.c.f16468a.a(cVar, this.f17126D, this.f17125C) : cVar2;
    }
}
