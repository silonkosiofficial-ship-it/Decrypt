package p111l0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Y0.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p111l0.b f49945C = p111l0.i.f49952C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p111l0.h f49946D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p161q0.c f49947E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p237x7.a f49948F;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f49949D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar) {
            super(1);
            this.f49949D = lVar;
        }

        public final void a(p161q0.c cVar) {
            this.f49949D.l(cVar);
            cVar.l1();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    @Override // Y0.e
    public /* synthetic */ float B0(float f6) {
        return Y0.d.g(this, f6);
    }

    public final void C(p111l0.h hVar) {
        this.f49946D = hVar;
    }

    public final void F(p237x7.a aVar) {
        this.f49948F = aVar;
    }

    @Override // Y0.e
    public /* synthetic */ int K0(long j6) {
        return Y0.d.a(this, j6);
    }

    @Override // Y0.n
    public /* synthetic */ long O(float f6) {
        return Y0.m.b(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ long P(long j6) {
        return Y0.d.e(this, j6);
    }

    @Override // Y0.e
    public /* synthetic */ int S0(float f6) {
        return Y0.d.b(this, f6);
    }

    @Override // Y0.n
    public /* synthetic */ float X(long j6) {
        return Y0.m.a(this, j6);
    }

    @Override // Y0.e
    public /* synthetic */ long b1(long j6) {
        return Y0.d.h(this, j6);
    }

    public final p111l0.h f() {
        return this.f49946D;
    }

    @Override // Y0.e
    public /* synthetic */ float g1(long j6) {
        return Y0.d.f(this, j6);
    }

    @Override // Y0.e
    public float getDensity() {
        return this.f49945C.getDensity().getDensity();
    }

    public final Y0.v getLayoutDirection() {
        return this.f49945C.getLayoutDirection();
    }

    public final long i() {
        return this.f49945C.i();
    }

    public final p111l0.h k(p237x7.l lVar) {
        return s(new l0.d.a(lVar));
    }

    @Override // Y0.e
    public /* synthetic */ long k0(float f6) {
        return Y0.d.i(this, f6);
    }

    @Override // Y0.e
    public /* synthetic */ float o0(int i6) {
        return Y0.d.d(this, i6);
    }

    @Override // Y0.e
    public /* synthetic */ float q0(float f6) {
        return Y0.d.c(this, f6);
    }

    public final p111l0.h s(p237x7.l lVar) {
        p111l0.h hVar = new p111l0.h(lVar);
        this.f49946D = hVar;
        return hVar;
    }

    public final void t(p111l0.b bVar) {
        this.f49945C = bVar;
    }

    @Override // Y0.n
    public float v0() {
        return this.f49945C.getDensity().v0();
    }

    public final void y(p161q0.c cVar) {
        this.f49947E = cVar;
    }
}
