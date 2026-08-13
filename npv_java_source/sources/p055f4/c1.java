package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements L4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p055f4.C6575q f45102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p055f4.p1 f45103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p055f4.P f45104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f45105d = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Object f45106e = new java.lang.Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45107f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45108g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private L4.d f45109h = new L4.d.a().a();

    public c1(p055f4.C6575q c6575q, p055f4.p1 p1Var, p055f4.P p6) {
        this.f45102a = c6575q;
        this.f45103b = p1Var;
        this.f45104c = p6;
    }

    @Override // L4.c
    public final L4.c.EnumC0153c a() {
        return !g() ? L4.c.EnumC0153c.UNKNOWN : this.f45102a.b();
    }

    @Override // L4.c
    public final boolean b() {
        if (!this.f45102a.j()) {
            int iA = !g() ? 0 : this.f45102a.a();
            if (iA != 1 && iA != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // L4.c
    public final void c(android.app.Activity activity, L4.d dVar, L4.c.b bVar, L4.c.a aVar) {
        synchronized (this.f45105d) {
            this.f45107f = true;
        }
        this.f45109h = dVar;
        this.f45103b.c(activity, dVar, bVar, aVar);
    }

    public final boolean d() {
        return this.f45104c.f();
    }

    public final void e(android.app.Activity activity) {
        if (g() && !h()) {
            f(true);
            this.f45103b.c(activity, this.f45109h, new L4.c.b() { // from class: f4.a1
                @Override // L4.c.b
                public final void a() {
                    this.f45095a.f(false);
                }
            }, new L4.c.a() { // from class: f4.b1
                @Override // L4.c.a
                public final void a(L4.e eVar) {
                    this.f45100a.f(false);
                }
            });
            return;
        }
        java.lang.String str = "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + g() + ", retryRequestIsInProgress=" + h();
    }

    public final void f(boolean z6) {
        synchronized (this.f45106e) {
            this.f45108g = z6;
        }
    }

    public final boolean g() {
        boolean z6;
        synchronized (this.f45105d) {
            z6 = this.f45107f;
        }
        return z6;
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f45106e) {
            z6 = this.f45108g;
        }
        return z6;
    }
}
