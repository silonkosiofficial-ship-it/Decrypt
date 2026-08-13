package p163q2;

/* JADX INFO: loaded from: classes.dex */
final class a implements m7.i.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p163q2.a.C0686a f53026D = new p163q2.a.C0686a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p163q2.i f53027C;

    /* JADX INFO: renamed from: q2.a$a, reason: collision with other inner class name */
    public static final class C0686a implements m7.i.c {
        private C0686a() {
        }

        public /* synthetic */ C0686a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public a(p163q2.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "connectionWrapper");
        this.f53027C = iVar;
    }

    @Override // p127m7.i
    public java.lang.Object D(java.lang.Object obj, p237x7.p pVar) {
        return m7.i.b.a.a(this, obj, pVar);
    }

    public final p163q2.i a() {
        return this.f53027C;
    }

    @Override // m7.i.b
    public m7.i.c getKey() {
        return f53026D;
    }

    @Override // m7.i.b, p127m7.i
    public m7.i.b i(m7.i.c cVar) {
        return m7.i.b.a.b(this, cVar);
    }

    @Override // p127m7.i
    public p127m7.i o0(p127m7.i iVar) {
        return m7.i.b.a.d(this, iVar);
    }

    @Override // p127m7.i
    public p127m7.i y0(m7.i.c cVar) {
        return m7.i.b.a.c(this, cVar);
    }
}
