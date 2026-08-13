package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class A implements p200u.InterfaceC7165e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.D0 f54658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p200u.x0 f54659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f54660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p200u.r f54661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p200u.r f54662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p200u.r f54663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Object f54664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f54665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f54666i;

    public A(p200u.B b6, p200u.x0 x0Var, java.lang.Object obj, p200u.r rVar) {
        this(b6.a(x0Var), x0Var, obj, rVar);
    }

    public A(p200u.D0 d6, p200u.x0 x0Var, java.lang.Object obj, p200u.r rVar) {
        this.f54658a = d6;
        this.f54659b = x0Var;
        this.f54660c = obj;
        p200u.r rVar2 = (p200u.r) c().a().l(obj);
        this.f54661d = rVar2;
        this.f54662e = p200u.AbstractC7191s.e(rVar);
        this.f54664g = c().b().l(d6.b(rVar2, rVar));
        this.f54665h = d6.d(rVar2, rVar);
        p200u.r rVarE = p200u.AbstractC7191s.e(d6.e(b(), rVar2, rVar));
        this.f54663f = rVarE;
        int iB = rVarE.b();
        for (int i6 = 0; i6 < iB; i6++) {
            p200u.r rVar3 = this.f54663f;
            rVar3.e(i6, E7.j.j(rVar3.a(i6), -this.f54658a.a(), this.f54658a.a()));
        }
    }

    @Override // p200u.InterfaceC7165e
    public boolean a() {
        return this.f54666i;
    }

    @Override // p200u.InterfaceC7165e
    public long b() {
        return this.f54665h;
    }

    @Override // p200u.InterfaceC7165e
    public p200u.x0 c() {
        return this.f54659b;
    }

    @Override // p200u.InterfaceC7165e
    public p200u.r d(long j6) {
        return !e(j6) ? this.f54658a.e(j6, this.f54661d, this.f54662e) : this.f54663f;
    }

    @Override // p200u.InterfaceC7165e
    public /* synthetic */ boolean e(long j6) {
        return p200u.AbstractC7163d.a(this, j6);
    }

    @Override // p200u.InterfaceC7165e
    public java.lang.Object f(long j6) {
        return !e(j6) ? c().b().l(this.f54658a.c(j6, this.f54661d, this.f54662e)) : g();
    }

    @Override // p200u.InterfaceC7165e
    public java.lang.Object g() {
        return this.f54664g;
    }
}
