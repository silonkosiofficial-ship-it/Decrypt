package B2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p243y2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f516b;

    public a(long j6) {
        this.f515a = j6;
    }

    @Override // p243y2.b
    public void close() {
        if (!this.f516b) {
            androidx.sqlite.driver.bundled.BundledSQLiteConnectionKt.nativeClose(this.f515a);
        }
        this.f516b = true;
    }

    @Override // p243y2.b
    public p243y2.e e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sql");
        if (this.f516b) {
            p243y2.a.b(21, "connection is closed");
            throw new p087i7.C6665k();
        }
        return new B2.c(this.f515a, androidx.sqlite.driver.bundled.BundledSQLiteConnectionKt.nativePrepare(this.f515a, str));
    }
}
