package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends I7.x implements F7.n, F7.g {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5477S;

    public static final class a extends I7.y.d implements F7.g.a, p237x7.q {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final I7.r f5478L;

        public a(I7.r rVar) {
            p247y7.AbstractC7350t.f(rVar, "property");
            this.f5478L = rVar;
        }

        @Override // F7.k.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public I7.r a() {
            return this.f5478L;
        }

        public void J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws G7.a {
            a().O(obj, obj2, obj3);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws G7.a {
            J(obj, obj2, obj3);
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        super(abstractC1278n, u6);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        this.f5477S = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.s(this));
    }

    @Override // F7.g
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public I7.r.a i() {
        return (I7.r.a) this.f5477S.getValue();
    }

    public void O(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws G7.a {
        i().z(obj, obj2, obj3);
    }
}
