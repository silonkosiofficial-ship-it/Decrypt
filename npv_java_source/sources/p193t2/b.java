package p193t2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p073h2.L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p143o2.u f54614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p143o2.n f54615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p193t2.a f54616d;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.q {
        a(java.lang.Object obj) {
            super(3, obj, p193t2.b.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return s((p143o2.u) obj, ((java.lang.Number) obj2).intValue(), (p127m7.e) obj3);
        }

        public final java.lang.Object s(p143o2.u uVar, int i6, p127m7.e eVar) {
            return ((p193t2.b) this.f57287D).i(uVar, i6, eVar);
        }
    }

    public b(p143o2.u uVar, p143o2.n nVar, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(uVar, "sourceQuery");
        p247y7.AbstractC7350t.f(nVar, "db");
        p247y7.AbstractC7350t.f(strArr, "tables");
        this.f54614b = uVar;
        this.f54615c = nVar;
        this.f54616d = new p193t2.a(strArr, this, new t2.b.a(this));
    }

    static /* synthetic */ java.lang.Object m(p193t2.b bVar, h2.L.a aVar, p127m7.e eVar) {
        return bVar.f54616d.j(aVar, eVar);
    }

    @Override // p073h2.L
    public boolean b() {
        return true;
    }

    @Override // p073h2.L
    public java.lang.Object f(h2.L.a aVar, p127m7.e eVar) {
        return m(this, aVar, eVar);
    }

    protected abstract java.lang.Object i(p143o2.u uVar, int i6, p127m7.e eVar);

    public final p143o2.n j() {
        return this.f54615c;
    }

    @Override // p073h2.L
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer d(p073h2.M m6) {
        p247y7.AbstractC7350t.f(m6, "state");
        return p203u2.a.a(m6);
    }

    public final p143o2.u l() {
        return this.f54614b;
    }
}
