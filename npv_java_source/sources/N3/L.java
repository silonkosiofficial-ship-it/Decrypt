package N3;

/* JADX INFO: loaded from: classes.dex */
class L {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final N3.L f7638e = new N3.L(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f7639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.String f7640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.lang.Throwable f7641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f7642d;

    private L(boolean z6, int i6, int i10, java.lang.String str, java.lang.Throwable th) {
        this.f7639a = z6;
        this.f7642d = i6;
        this.f7640b = str;
        this.f7641c = th;
    }

    static N3.L b() {
        return f7638e;
    }

    static N3.L c(java.lang.String str) {
        return new N3.L(false, 1, 5, str, null);
    }

    static N3.L d(java.lang.String str, java.lang.Throwable th) {
        return new N3.L(false, 1, 5, str, th);
    }

    static N3.L f(int i6) {
        return new N3.L(true, i6, 1, null, null);
    }

    static N3.L g(int i6, int i10, java.lang.String str, java.lang.Throwable th) {
        return new N3.L(false, i6, i10, str, th);
    }

    java.lang.String a() {
        return this.f7640b;
    }

    final void e() {
        if (this.f7639a || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f7641c == null) {
            a();
        } else {
            a();
            java.lang.Throwable th = this.f7641c;
        }
    }
}
