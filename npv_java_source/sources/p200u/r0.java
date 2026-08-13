package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements p200u.InterfaceC7165e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.B0 f55007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.x0 f55008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f55009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f55010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p200u.r f55011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p200u.r f55012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p200u.r f55013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f55014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p200u.r f55015i;

    public r0(p200u.B0 b6, p200u.x0 x0Var, java.lang.Object obj, java.lang.Object obj2, p200u.r rVar) {
        p200u.r rVarE;
        this.f55007a = b6;
        this.f55008b = x0Var;
        this.f55009c = obj2;
        this.f55010d = obj;
        this.f55011e = (p200u.r) c().a().l(obj);
        this.f55012f = (p200u.r) c().a().l(obj2);
        this.f55013g = (rVar == null || (rVarE = p200u.AbstractC7191s.e(rVar)) == null) ? p200u.AbstractC7191s.g((p200u.r) c().a().l(obj)) : rVarE;
        this.f55014h = -1L;
    }

    public r0(p200u.InterfaceC7175j interfaceC7175j, p200u.x0 x0Var, java.lang.Object obj, java.lang.Object obj2, p200u.r rVar) {
        this(interfaceC7175j.a(x0Var), x0Var, obj, obj2, rVar);
    }

    public /* synthetic */ r0(p200u.InterfaceC7175j interfaceC7175j, p200u.x0 x0Var, java.lang.Object obj, java.lang.Object obj2, p200u.r rVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC7175j, x0Var, obj, obj2, (i6 & 16) != 0 ? null : rVar);
    }

    private final p200u.r h() {
        p200u.r rVar = this.f55015i;
        if (rVar != null) {
            return rVar;
        }
        p200u.r rVarG = this.f55007a.g(this.f55011e, this.f55012f, this.f55013g);
        this.f55015i = rVarG;
        return rVarG;
    }

    @Override // p200u.InterfaceC7165e
    public boolean a() {
        return this.f55007a.a();
    }

    @Override // p200u.InterfaceC7165e
    public long b() {
        if (this.f55014h < 0) {
            this.f55014h = this.f55007a.e(this.f55011e, this.f55012f, this.f55013g);
        }
        return this.f55014h;
    }

    @Override // p200u.InterfaceC7165e
    public p200u.x0 c() {
        return this.f55008b;
    }

    @Override // p200u.InterfaceC7165e
    public p200u.r d(long j6) {
        return !e(j6) ? this.f55007a.b(j6, this.f55011e, this.f55012f, this.f55013g) : h();
    }

    @Override // p200u.InterfaceC7165e
    public /* synthetic */ boolean e(long j6) {
        return p200u.AbstractC7163d.a(this, j6);
    }

    @Override // p200u.InterfaceC7165e
    public java.lang.Object f(long j6) {
        if (e(j6)) {
            return g();
        }
        p200u.r rVarC = this.f55007a.c(j6, this.f55011e, this.f55012f, this.f55013g);
        int iB = rVarC.b();
        for (int i6 = 0; i6 < iB; i6++) {
            if (!(!java.lang.Float.isNaN(rVarC.a(i6)))) {
                p200u.AbstractC7166e0.b("AnimationVector cannot contain a NaN. " + rVarC + ". Animation: " + this + ", playTimeNanos: " + j6);
            }
        }
        return c().b().l(rVarC);
    }

    @Override // p200u.InterfaceC7165e
    public java.lang.Object g() {
        return this.f55009c;
    }

    public final java.lang.Object i() {
        return this.f55010d;
    }

    public final void j(java.lang.Object obj) {
        if (p247y7.AbstractC7350t.b(obj, this.f55010d)) {
            return;
        }
        this.f55010d = obj;
        this.f55011e = (p200u.r) c().a().l(obj);
        this.f55015i = null;
        this.f55014h = -1L;
    }

    public final void k(java.lang.Object obj) {
        if (p247y7.AbstractC7350t.b(this.f55009c, obj)) {
            return;
        }
        this.f55009c = obj;
        this.f55012f = (p200u.r) c().a().l(obj);
        this.f55015i = null;
        this.f55014h = -1L;
    }

    public java.lang.String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.f55013g + ", duration: " + p200u.AbstractC7169g.b(this) + " ms,animationSpec: " + this.f55007a;
    }
}
