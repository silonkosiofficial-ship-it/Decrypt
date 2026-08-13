package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends android.webkit.WebView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Handler f45085C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p055f4.C6552e0 f45086D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f45087E;

    public X(p055f4.Z z6, android.os.Handler handler, p055f4.C6552e0 c6552e0) {
        super(z6);
        this.f45087E = false;
        this.f45085C = handler;
        this.f45086D = c6552e0;
    }

    static /* bridge */ /* synthetic */ boolean f(p055f4.X x6, java.lang.String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void c() {
        final p055f4.C6552e0 c6552e0 = this.f45086D;
        j$.util.Objects.requireNonNull(c6552e0);
        this.f45085C.post(new java.lang.Runnable() { // from class: f4.U
            @Override // java.lang.Runnable
            public final void run() {
                c6552e0.c();
            }
        });
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        final java.lang.String str3 = str + "(" + str2 + ");";
        this.f45085C.post(new java.lang.Runnable() { // from class: f4.T
            @Override // java.lang.Runnable
            public final void run() {
                p055f4.AbstractC6587w0.a(this.f45080C, str3);
            }
        });
    }
}
