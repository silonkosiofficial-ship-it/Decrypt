package I7;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends I7.w implements F7.i {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5474S;

    public static final class a extends I7.y.d implements F7.i.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final I7.q f5475L;

        public a(I7.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "property");
            this.f5475L = qVar;
        }

        @Override // F7.k.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public I7.q a() {
            return this.f5475L;
        }

        public void J(java.lang.Object obj, java.lang.Object obj2) throws G7.a {
            a().r(obj, obj2);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) throws G7.a {
            J(obj, obj2);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.q.a b() {
            return new I7.q.a(I7.q.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(I7.AbstractC1278n abstractC1278n, O7.U u6) {
        super(abstractC1278n, u6);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(u6, "descriptor");
        this.f5474S = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.q.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(I7.AbstractC1278n abstractC1278n, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(abstractC1278n, str, str2, obj);
        p247y7.AbstractC7350t.f(abstractC1278n, "container");
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "signature");
        this.f5474S = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new I7.q.b());
    }

    @Override // F7.i, F7.g
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public I7.q.a i() {
        return (I7.q.a) this.f5474S.getValue();
    }

    @Override // F7.i
    public void r(java.lang.Object obj, java.lang.Object obj2) throws G7.a {
        i().z(obj, obj2);
    }
}
