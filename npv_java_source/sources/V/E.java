package V;

/* JADX INFO: loaded from: classes.dex */
public final class E extends V.O0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.F f14642b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final V.E.a f14643D = new V.E.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        public final java.lang.Object b() {
            V.AbstractC1741q.s("Unexpected call to default provider");
            throw new p087i7.C6665k();
        }
    }

    public E(p237x7.l lVar) {
        super(V.E.a.f14643D);
        this.f14642b = new V.F(lVar);
    }

    @Override // V.O0
    public V.P0 c(java.lang.Object obj) {
        return new V.P0(this, obj, obj == null, null, null, null, true);
    }

    @Override // V.AbstractC1752w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public V.F a() {
        return this.f14642b;
    }
}
