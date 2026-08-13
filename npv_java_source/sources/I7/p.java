package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends I7.v implements F7.h {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5471S;

    public static final class a extends I7.y.d implements F7.h.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final I7.p f5472L;

        public a(I7.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "property");
            this.f5472L = pVar;
        }

        @Override // F7.k.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public I7.p a() {
            return this.f5472L;
        }

        public void J(java.lang.Object obj) throws G7.a {
            a().O(obj);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) throws G7.a {
            J(obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.p.a b() {
            return new I7.p.a(I7.p.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        super(abstractC1278n, u6);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        this.f5471S = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.p.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(abstractC1278n, str, str2, obj);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        this.f5471S = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.p.b());
    }

    @Override // F7.h, F7.g
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public I7.p.a i() {
        return (I7.p.a) this.f5471S.getValue();
    }

    public void O(java.lang.Object obj) throws G7.a {
        i().z(obj);
    }
}
