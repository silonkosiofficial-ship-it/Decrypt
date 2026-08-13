package p011b0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p097j7.AbstractC6869k implements Y.g {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final b0.b.a f23997G = new b0.b.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f23998H = 8;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final p011b0.b f23999I;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f24000D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f24001E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p001a0.d f24002F;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Y.g a() {
            return p011b0.b.f23999I;
        }
    }

    static {
        p021c0.c cVar = p021c0.c.f24402a;
        f23999I = new p011b0.b(cVar, cVar, p001a0.d.f16995F.a());
    }

    public b(java.lang.Object obj, java.lang.Object obj2, p001a0.d dVar) {
        this.f24000D = obj;
        this.f24001E = obj2;
        this.f24002F = dVar;
    }

    @Override // java.util.Collection, java.util.Set, Y.g
    public Y.g add(java.lang.Object obj) {
        if (this.f24002F.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new p011b0.b(obj, obj, this.f24002F.t(obj, new p011b0.a()));
        }
        java.lang.Object obj2 = this.f24001E;
        java.lang.Object obj3 = this.f24002F.get(obj2);
        p247y7.AbstractC7350t.c(obj3);
        return new p011b0.b(this.f24000D, obj, this.f24002F.t(obj2, ((p011b0.a) obj3).e(obj)).t(obj, new p011b0.a(obj2)));
    }

    @Override // p097j7.AbstractC6860b, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.f24002F.containsKey(obj);
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f24002F.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new p011b0.c(this.f24000D, this.f24002F);
    }

    @Override // java.util.Collection, java.util.Set, Y.g
    public Y.g remove(java.lang.Object obj) {
        p011b0.a aVar = (p011b0.a) this.f24002F.get(obj);
        if (aVar == null) {
            return this;
        }
        p001a0.d dVarU = this.f24002F.u(obj);
        if (aVar.b()) {
            java.lang.Object obj2 = dVarU.get(aVar.d());
            p247y7.AbstractC7350t.c(obj2);
            dVarU = dVarU.t(aVar.d(), ((p011b0.a) obj2).e(aVar.c()));
        }
        if (aVar.a()) {
            java.lang.Object obj3 = dVarU.get(aVar.c());
            p247y7.AbstractC7350t.c(obj3);
            dVarU = dVarU.t(aVar.c(), ((p011b0.a) obj3).f(aVar.d()));
        }
        return new p011b0.b(!aVar.b() ? aVar.c() : this.f24000D, !aVar.a() ? aVar.d() : this.f24001E, dVarU);
    }
}
