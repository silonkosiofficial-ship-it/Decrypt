package p173r2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p243y2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p253z2.d f53809a;

    public a(p253z2.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "db");
        this.f53809a = dVar;
    }

    public final p253z2.d a() {
        return this.f53809a;
    }

    @Override // p243y2.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p173r2.e e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sql");
        return p173r2.e.f53823d.a(this.f53809a, str);
    }

    @Override // p243y2.b
    public void close() throws java.io.IOException {
        this.f53809a.close();
    }
}
