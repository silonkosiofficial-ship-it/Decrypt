package p127m7;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements p127m7.e, p147o7.e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final m7.k.a f51199D = new m7.k.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f51200E = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p127m7.k.class, java.lang.Object.class, "result");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.e f51201C;
    private volatile java.lang.Object result;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(p127m7.e eVar) {
        this(eVar, p137n7.a.UNDECIDED);
        p247y7.AbstractC7350t.f(eVar, "delegate");
    }

    public k(p127m7.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(eVar, "delegate");
        this.f51201C = eVar;
        this.result = obj;
    }

    public final java.lang.Object a() throws java.lang.Throwable {
        java.lang.Object obj = this.result;
        p137n7.a aVar = p137n7.a.UNDECIDED;
        if (obj == aVar) {
            if (androidx.concurrent.futures.b.a(f51200E, this, aVar, p137n7.b.g())) {
                return p137n7.b.g();
            }
            obj = this.result;
        }
        if (obj == p137n7.a.RESUMED) {
            return p137n7.b.g();
        }
        if (obj instanceof i7.w.b) {
            throw ((i7.w.b) obj).f46753C;
        }
        return obj;
    }

    @Override // p147o7.e
    public p147o7.e e() {
        p127m7.e eVar = this.f51201C;
        if (eVar instanceof p147o7.e) {
            return (p147o7.e) eVar;
        }
        return null;
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        return this.f51201C.getContext();
    }

    @Override // p127m7.e
    public void t(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            p137n7.a aVar = p137n7.a.UNDECIDED;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.b.a(f51200E, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != p137n7.b.g()) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f51200E, this, p137n7.b.g(), p137n7.a.RESUMED)) {
                    this.f51201C.t(obj);
                    return;
                }
            }
        }
    }

    public java.lang.String toString() {
        return "SafeContinuation for " + this.f51201C;
    }
}
