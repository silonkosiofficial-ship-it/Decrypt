package D6;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements O6.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ O6.b f1935C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final D6.e f1936D;

    public f(D6.e eVar, O6.b bVar) {
        p247y7.AbstractC7350t.f(eVar, "call");
        p247y7.AbstractC7350t.f(bVar, "origin");
        this.f1935C = bVar;
        this.f1936D = eVar;
    }

    @Override // T6.InterfaceC1675x
    public T6.InterfaceC1668p a() {
        return this.f1935C.a();
    }

    @Override // O6.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public D6.e H0() {
        return this.f1936D;
    }

    @Override // O6.b, W8.N
    public p127m7.i getCoroutineContext() {
        return this.f1935C.getCoroutineContext();
    }

    @Override // O6.b
    public T6.g0 r() {
        return this.f1935C.r();
    }

    @Override // O6.b
    public T6.A u0() {
        return this.f1935C.u0();
    }

    @Override // O6.b
    public W6.InterfaceC1768b x0() {
        return this.f1935C.x0();
    }
}
