package L6;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Q6.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final D6.b f6234C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p237x7.a f6235D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Q6.c f6236E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final T6.InterfaceC1668p f6237F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p127m7.i f6238G;

    public d(D6.b bVar, p237x7.a aVar, Q6.c cVar, T6.InterfaceC1668p interfaceC1668p) {
        p247y7.AbstractC7350t.f(bVar, "call");
        p247y7.AbstractC7350t.f(aVar, "block");
        p247y7.AbstractC7350t.f(cVar, "origin");
        p247y7.AbstractC7350t.f(interfaceC1668p, "headers");
        this.f6234C = bVar;
        this.f6235D = aVar;
        this.f6236E = cVar;
        this.f6237F = interfaceC1668p;
        this.f6238G = cVar.getCoroutineContext();
    }

    @Override // Q6.c
    public D6.b H0() {
        return this.f6234C;
    }

    @Override // T6.InterfaceC1675x
    public T6.InterfaceC1668p a() {
        return this.f6237F;
    }

    @Override // Q6.c
    public io.ktor.utils.io.d b() {
        return (io.ktor.utils.io.d) this.f6235D.b();
    }

    @Override // Q6.c
    public Y6.b c() {
        return this.f6236E.c();
    }

    @Override // Q6.c
    public Y6.b d() {
        return this.f6236E.d();
    }

    @Override // Q6.c
    public T6.C e() {
        return this.f6236E.e();
    }

    @Override // Q6.c
    public T6.B f() {
        return this.f6236E.f();
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f6238G;
    }
}
