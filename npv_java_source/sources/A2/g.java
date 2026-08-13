package A2;

/* JADX INFO: loaded from: classes.dex */
public class g implements p253z2.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.database.sqlite.SQLiteProgram f251C;

    public g(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        p247y7.AbstractC7350t.f(sQLiteProgram, "delegate");
        this.f251C = sQLiteProgram;
    }

    @Override // p253z2.f
    public void C(int i6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f251C.bindString(i6, str);
    }

    @Override // p253z2.f
    public void M0(int i6) {
        this.f251C.bindNull(i6);
    }

    @Override // p253z2.f
    public void P(int i6, double d6) {
        this.f251C.bindDouble(i6, d6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f251C.close();
    }

    @Override // p253z2.f
    public void l(int i6, long j6) {
        this.f251C.bindLong(i6, j6);
    }

    @Override // p253z2.f
    public void p0(int i6, byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "value");
        this.f251C.bindBlob(i6, bArr);
    }
}
