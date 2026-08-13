package F0;

/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f2314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f2315g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2309a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f2310b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f2316h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f2317i = androidx.compose.ui.graphics.f.f19784b.a();

    public final void a(F0.A a6) {
        this.f2309a = a6.f2309a;
        this.f2310b = a6.f2310b;
        this.f2311c = a6.f2311c;
        this.f2312d = a6.f2312d;
        this.f2313e = a6.f2313e;
        this.f2314f = a6.f2314f;
        this.f2315g = a6.f2315g;
        this.f2316h = a6.f2316h;
        this.f2317i = a6.f2317i;
    }

    public final void b(androidx.compose.ui.graphics.c cVar) {
        this.f2309a = cVar.o();
        this.f2310b = cVar.E();
        this.f2311c = cVar.z();
        this.f2312d = cVar.v();
        this.f2313e = cVar.B();
        this.f2314f = cVar.r();
        this.f2315g = cVar.u();
        this.f2316h = cVar.x();
        this.f2317i = cVar.N0();
    }

    public final boolean c(F0.A a6) {
        return this.f2309a == a6.f2309a && this.f2310b == a6.f2310b && this.f2311c == a6.f2311c && this.f2312d == a6.f2312d && this.f2313e == a6.f2313e && this.f2314f == a6.f2314f && this.f2315g == a6.f2315g && this.f2316h == a6.f2316h && androidx.compose.ui.graphics.f.e(this.f2317i, a6.f2317i);
    }
}
