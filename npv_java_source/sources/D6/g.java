package D6;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Q6.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final D6.e f1937C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final byte[] f1938D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final T6.C f1939E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final T6.B f1940F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Y6.b f1941G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Y6.b f1942H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final T6.InterfaceC1668p f1943I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p127m7.i f1944J;

    public g(D6.e eVar, byte[] bArr, Q6.c cVar) {
        p247y7.AbstractC7350t.f(eVar, "call");
        p247y7.AbstractC7350t.f(bArr, "body");
        p247y7.AbstractC7350t.f(cVar, "origin");
        this.f1937C = eVar;
        this.f1938D = bArr;
        this.f1939E = cVar.e();
        this.f1940F = cVar.f();
        this.f1941G = cVar.c();
        this.f1942H = cVar.d();
        this.f1943I = cVar.a();
        this.f1944J = cVar.getCoroutineContext();
    }

    @Override // T6.InterfaceC1675x
    public T6.InterfaceC1668p a() {
        return this.f1943I;
    }

    @Override // Q6.c
    public io.ktor.utils.io.d b() {
        return io.ktor.utils.io.b.c(this.f1938D, 0, 0, 6, null);
    }

    @Override // Q6.c
    public Y6.b c() {
        return this.f1941G;
    }

    @Override // Q6.c
    public Y6.b d() {
        return this.f1942H;
    }

    @Override // Q6.c
    public T6.C e() {
        return this.f1939E;
    }

    @Override // Q6.c
    public T6.B f() {
        return this.f1940F;
    }

    @Override // Q6.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public D6.e H0() {
        return this.f1937C;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f1944J;
    }
}
