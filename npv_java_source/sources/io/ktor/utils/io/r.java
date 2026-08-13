package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements io.ktor.utils.io.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p149o9.q f47670b;
    private volatile io.ktor.utils.io.n closed;

    public r(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "source");
        this.f47670b = qVar;
    }

    @Override // io.ktor.utils.io.d
    public java.lang.Throwable a() {
        io.ktor.utils.io.n nVar = this.closed;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.d
    public p149o9.q d() throws java.lang.Throwable {
        java.lang.Throwable thA = a();
        if (thA == null) {
            return this.f47670b;
        }
        throw thA;
    }

    @Override // io.ktor.utils.io.d
    public java.lang.Object f(int i6, p127m7.e eVar) throws java.lang.Throwable {
        java.lang.Throwable thA = a();
        if (thA == null) {
            return p147o7.b.a(p037d7.d.d(this.f47670b) >= ((long) i6));
        }
        throw thA;
    }

    @Override // io.ktor.utils.io.d
    public boolean h() {
        return this.f47670b.j();
    }

    @Override // io.ktor.utils.io.d
    public void k(java.lang.Throwable th) {
        java.lang.String message;
        if (this.closed != null) {
            return;
        }
        this.f47670b.close();
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new io.ktor.utils.io.n(new java.io.IOException(message, th));
    }
}
