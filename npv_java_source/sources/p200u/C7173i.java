package p200u;

/* JADX INFO: renamed from: u.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7173i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.x0 f54934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f54935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.a f54937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p200u.r f54939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54941h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54942i;

    public C7173i(java.lang.Object obj, p200u.x0 x0Var, p200u.r rVar, long j6, java.lang.Object obj2, long j10, boolean z6, p237x7.a aVar) {
        this.f54934a = x0Var;
        this.f54935b = obj2;
        this.f54936c = j10;
        this.f54937d = aVar;
        this.f54938e = V.A1.d(obj, null, 2, null);
        this.f54939f = p200u.AbstractC7191s.e(rVar);
        this.f54940g = j6;
        this.f54942i = V.A1.d(java.lang.Boolean.valueOf(z6), null, 2, null);
    }

    public final void a() {
        k(false);
        this.f54937d.b();
    }

    public final long b() {
        return this.f54941h;
    }

    public final long c() {
        return this.f54940g;
    }

    public final long d() {
        return this.f54936c;
    }

    public final java.lang.Object e() {
        return this.f54938e.getValue();
    }

    public final java.lang.Object f() {
        return this.f54934a.b().l(this.f54939f);
    }

    public final p200u.r g() {
        return this.f54939f;
    }

    public final boolean h() {
        return ((java.lang.Boolean) this.f54942i.getValue()).booleanValue();
    }

    public final void i(long j6) {
        this.f54941h = j6;
    }

    public final void j(long j6) {
        this.f54940g = j6;
    }

    public final void k(boolean z6) {
        this.f54942i.setValue(java.lang.Boolean.valueOf(z6));
    }

    public final void l(java.lang.Object obj) {
        this.f54938e.setValue(obj);
    }

    public final void m(p200u.r rVar) {
        this.f54939f = rVar;
    }
}
