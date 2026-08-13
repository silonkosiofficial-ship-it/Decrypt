package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class u implements p115l4.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f50032a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p115l4.P f50034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.Exception f50038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50039h;

    public u(int i6, p115l4.P p6) {
        this.f50033b = i6;
        this.f50034c = p6;
    }

    private final void c() {
        if (this.f50035d + this.f50036e + this.f50037f == this.f50033b) {
            if (this.f50038g == null) {
                if (this.f50039h) {
                    this.f50034c.t();
                    return;
                } else {
                    this.f50034c.s(null);
                    return;
                }
            }
            this.f50034c.r(new java.util.concurrent.ExecutionException(this.f50036e + " out of " + this.f50033b + " underlying tasks failed", this.f50038g));
        }
    }

    @Override // p115l4.InterfaceC6927h
    public final void a(java.lang.Object obj) {
        synchronized (this.f50032a) {
            this.f50035d++;
            c();
        }
    }

    @Override // p115l4.InterfaceC6924e
    public final void b() {
        synchronized (this.f50032a) {
            this.f50037f++;
            this.f50039h = true;
            c();
        }
    }

    @Override // p115l4.InterfaceC6926g
    public final void d(java.lang.Exception exc) {
        synchronized (this.f50032a) {
            this.f50036e++;
            this.f50038g = exc;
            c();
        }
    }
}
