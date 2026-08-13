package F6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements F6.b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2767F = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(F6.f.class, "closed");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f2768C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f2769D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f2770E;
    private volatile /* synthetic */ int closed;

    public f(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "engineName");
        this.f2768C = str;
        this.closed = 0;
        this.f2769D = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: F6.d
            @Override // p237x7.a
            public final java.lang.Object b() {
                return F6.f.i(this.f2765C);
            }
        });
        this.f2770E = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: F6.e
            @Override // p237x7.a
            public final java.lang.Object b() {
                return F6.f.g(this.f2766C);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p127m7.i g(F6.f fVar) {
        return W6.q.b(null, 1, null).o0(fVar.o()).o0(new W8.M(fVar.f2768C + "-context"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W8.J i(F6.f fVar) {
        W8.J jA = fVar.Q().a();
        return jA == null ? F6.g.a() : jA;
    }

    @Override // F6.b
    public void A0(C6.c cVar) {
        F6.b.a.h(this, cVar);
    }

    @Override // F6.b
    public java.util.Set W() {
        return F6.b.a.g(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f2767F.compareAndSet(this, 0, 1)) {
            m7.i.b bVarI = getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
            W8.InterfaceC1819y interfaceC1819y = bVarI instanceof W8.InterfaceC1819y ? (W8.InterfaceC1819y) bVarI : null;
            if (interfaceC1819y == null) {
                return;
            }
            interfaceC1819y.K0();
        }
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return (p127m7.i) this.f2770E.getValue();
    }

    public W8.J o() {
        return (W8.J) this.f2769D.getValue();
    }
}
