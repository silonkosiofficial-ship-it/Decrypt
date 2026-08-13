package p087i7;

/* JADX INFO: loaded from: classes3.dex */
final class y implements p087i7.InterfaceC6668n, java.io.Serializable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final i7.y.a f46754F = new i7.y.a(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f46755G = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p087i7.y.class, java.lang.Object.class, "D");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private volatile p237x7.a f46756C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile java.lang.Object f46757D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f46758E;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public y(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "initializer");
        this.f46756C = aVar;
        p087i7.I i6 = p087i7.I.f46715a;
        this.f46757D = i6;
        this.f46758E = i6;
    }

    @Override // p087i7.InterfaceC6668n
    public boolean d() {
        return this.f46757D != p087i7.I.f46715a;
    }

    @Override // p087i7.InterfaceC6668n
    public java.lang.Object getValue() {
        java.lang.Object obj = this.f46757D;
        p087i7.I i6 = p087i7.I.f46715a;
        if (obj != i6) {
            return obj;
        }
        p237x7.a aVar = this.f46756C;
        if (aVar != null) {
            java.lang.Object objB = aVar.b();
            if (androidx.concurrent.futures.b.a(f46755G, this, i6, objB)) {
                this.f46756C = null;
                return objB;
            }
        }
        return this.f46757D;
    }

    public java.lang.String toString() {
        return d() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
