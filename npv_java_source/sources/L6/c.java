package L6;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements O6.b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ O6.b f6232C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final D6.b f6233D;

    public c(D6.b bVar, O6.b bVar2) {
        p247y7.AbstractC7350t.f(bVar, "call");
        p247y7.AbstractC7350t.f(bVar2, "origin");
        this.f6232C = bVar2;
        this.f6233D = bVar;
    }

    @Override // O6.b
    public D6.b H0() {
        return this.f6233D;
    }

    @Override // T6.InterfaceC1675x
    public T6.InterfaceC1668p a() {
        return this.f6232C.a();
    }

    @Override // O6.b, W8.N
    public p127m7.i getCoroutineContext() {
        return this.f6232C.getCoroutineContext();
    }

    @Override // O6.b
    public T6.g0 r() {
        return this.f6232C.r();
    }

    @Override // O6.b
    public T6.A u0() {
        return this.f6232C.u0();
    }

    @Override // O6.b
    public W6.InterfaceC1768b x0() {
        return this.f6232C.x0();
    }
}
