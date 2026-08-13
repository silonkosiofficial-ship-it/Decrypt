package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Q6.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final D6.b f9078C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p127m7.i f9079D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final T6.C f9080E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final T6.B f9081F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Y6.b f9082G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Y6.b f9083H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final io.ktor.utils.io.d f9084I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final T6.InterfaceC1668p f9085J;

    public a(D6.b bVar, O6.h hVar) {
        p247y7.AbstractC7350t.f(bVar, "call");
        p247y7.AbstractC7350t.f(hVar, "responseData");
        this.f9078C = bVar;
        this.f9079D = hVar.b();
        this.f9080E = hVar.f();
        this.f9081F = hVar.g();
        this.f9082G = hVar.d();
        this.f9083H = hVar.e();
        java.lang.Object objA = hVar.a();
        io.ktor.utils.io.d dVar = objA instanceof io.ktor.utils.io.d ? (io.ktor.utils.io.d) objA : null;
        this.f9084I = dVar == null ? io.ktor.utils.io.d.f47628a.a() : dVar;
        this.f9085J = hVar.c();
    }

    @Override // Q6.c
    public D6.b H0() {
        return this.f9078C;
    }

    @Override // T6.InterfaceC1675x
    public T6.InterfaceC1668p a() {
        return this.f9085J;
    }

    @Override // Q6.c
    public io.ktor.utils.io.d b() {
        return this.f9084I;
    }

    @Override // Q6.c
    public Y6.b c() {
        return this.f9082G;
    }

    @Override // Q6.c
    public Y6.b d() {
        return this.f9083H;
    }

    @Override // Q6.c
    public T6.C e() {
        return this.f9080E;
    }

    @Override // Q6.c
    public T6.B f() {
        return this.f9081F;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f9079D;
    }
}
