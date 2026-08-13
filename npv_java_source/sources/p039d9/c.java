package p039d9;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p039d9.f {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final p039d9.c f44330K = new p039d9.c();

    private c() {
        super(p039d9.j.f44342c, p039d9.j.f44343d, p039d9.j.f44344e, p039d9.j.f44340a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // W8.J
    public java.lang.String toString() {
        return "Dispatchers.Default";
    }

    @Override // W8.J
    public W8.J x1(int i6, java.lang.String str) {
        p019b9.AbstractC2125l.a(i6);
        return i6 >= p039d9.j.f44342c ? p019b9.AbstractC2125l.b(this, str) : super.x1(i6, str);
    }
}
