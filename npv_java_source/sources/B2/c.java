package B2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p243y2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final B2.c.a f518d = new B2.c.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f521c;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public c(long j6, long j10) {
        this.f519a = j6;
        this.f520b = j10;
    }

    private final void b() {
        if (this.f521c) {
            p243y2.a.b(21, "statement is closed");
            throw new p087i7.C6665k();
        }
    }

    @Override // p243y2.e
    public void a() {
        b();
        androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeReset(this.f520b);
    }

    @Override // p243y2.e
    public void close() {
        if (!this.f521c) {
            androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeClose(this.f520b);
        }
        this.f521c = true;
    }

    @Override // p243y2.e
    public int getColumnCount() {
        b();
        return androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeGetColumnCount(this.f520b);
    }

    @Override // p243y2.e
    public java.lang.String getColumnName(int i6) {
        b();
        return androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeGetColumnName(this.f520b, i6);
    }

    @Override // p243y2.e
    public /* synthetic */ int getInt(int i6) {
        return p243y2.d.b(this, i6);
    }

    @Override // p243y2.e
    public long getLong(int i6) {
        b();
        return androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeGetLong(this.f520b, i6);
    }

    @Override // p243y2.e
    public boolean isNull(int i6) {
        b();
        return androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeGetColumnType(this.f520b, i6) == 5;
    }

    @Override // p243y2.e
    public void l(int i6, long j6) {
        b();
        androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeBindLong(this.f520b, i6, j6);
    }

    @Override // p243y2.e
    public /* synthetic */ boolean m(int i6) {
        return p243y2.d.a(this, i6);
    }

    @Override // p243y2.e
    public void n(int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        b();
        androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeBindText(this.f520b, i6, str);
    }

    @Override // p243y2.e
    public java.lang.String o(int i6) {
        b();
        return androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeGetText(this.f520b, i6);
    }

    @Override // p243y2.e
    public boolean p() {
        b();
        return androidx.sqlite.driver.bundled.BundledSQLiteStatementKt.nativeStep(this.f520b);
    }
}
