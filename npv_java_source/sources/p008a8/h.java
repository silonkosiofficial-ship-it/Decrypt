package p008a8;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements p008a8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p008a8.g f17139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.InterfaceC1432m f17140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f17142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.h f17143e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p018b8.n l(p048e8.y yVar) {
            p247y7.AbstractC7350t.f(yVar, "typeParameter");
            java.lang.Integer num = (java.lang.Integer) p008a8.h.this.f17142d.get(yVar);
            if (num == null) {
                return null;
            }
            p008a8.h hVar = p008a8.h.this;
            return new p018b8.n(p008a8.a.h(p008a8.a.b(hVar.f17139a, hVar), hVar.f17140b.k()), yVar, hVar.f17141c + num.intValue(), hVar.f17140b);
        }
    }

    public h(p008a8.g gVar, O7.InterfaceC1432m interfaceC1432m, p048e8.z zVar, int i6) {
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(zVar, "typeParameterOwner");
        this.f17139a = gVar;
        this.f17140b = interfaceC1432m;
        this.f17141c = i6;
        this.f17142d = P8.a.d(zVar.g());
        this.f17143e = gVar.e().h(new a8.h.a());
    }

    @Override // p008a8.k
    public O7.f0 a(p048e8.y yVar) {
        p247y7.AbstractC7350t.f(yVar, "javaTypeParameter");
        p018b8.n nVar = (p018b8.n) this.f17143e.l(yVar);
        return nVar != null ? nVar : this.f17139a.f().a(yVar);
    }
}
