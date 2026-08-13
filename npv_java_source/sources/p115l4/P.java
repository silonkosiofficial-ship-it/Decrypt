package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class P extends p115l4.AbstractC6931l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f50017a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p115l4.L f50018b = new p115l4.L();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f50020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Object f50021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Exception f50022f;

    P() {
    }

    private final void w() {
        Q3.AbstractC1477p.p(this.f50019c, "Task is not yet complete");
    }

    private final void x() {
        if (this.f50020d) {
            throw new java.util.concurrent.CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        if (this.f50019c) {
            throw p115l4.C6923d.a(this);
        }
    }

    private final void z() {
        synchronized (this.f50017a) {
            try {
                if (this.f50019c) {
                    this.f50018b.b(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l a(java.util.concurrent.Executor executor, p115l4.InterfaceC6924e interfaceC6924e) {
        this.f50018b.a(new p115l4.B(executor, interfaceC6924e));
        z();
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l b(java.util.concurrent.Executor executor, p115l4.InterfaceC6925f interfaceC6925f) {
        this.f50018b.a(new p115l4.D(executor, interfaceC6925f));
        z();
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l c(p115l4.InterfaceC6925f interfaceC6925f) {
        this.f50018b.a(new p115l4.D(p115l4.AbstractC6933n.f50027a, interfaceC6925f));
        z();
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l d(java.util.concurrent.Executor executor, p115l4.InterfaceC6926g interfaceC6926g) {
        this.f50018b.a(new p115l4.F(executor, interfaceC6926g));
        z();
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l e(p115l4.InterfaceC6926g interfaceC6926g) {
        d(p115l4.AbstractC6933n.f50027a, interfaceC6926g);
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l f(java.util.concurrent.Executor executor, p115l4.InterfaceC6927h interfaceC6927h) {
        this.f50018b.a(new p115l4.H(executor, interfaceC6927h));
        z();
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l g(p115l4.InterfaceC6927h interfaceC6927h) {
        f(p115l4.AbstractC6933n.f50027a, interfaceC6927h);
        return this;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l h(java.util.concurrent.Executor executor, p115l4.InterfaceC6922c interfaceC6922c) {
        p115l4.P p6 = new p115l4.P();
        this.f50018b.a(new p115l4.x(executor, interfaceC6922c, p6));
        z();
        return p6;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l i(java.util.concurrent.Executor executor, p115l4.InterfaceC6922c interfaceC6922c) {
        p115l4.P p6 = new p115l4.P();
        this.f50018b.a(new p115l4.z(executor, interfaceC6922c, p6));
        z();
        return p6;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l j(p115l4.InterfaceC6922c interfaceC6922c) {
        return i(p115l4.AbstractC6933n.f50027a, interfaceC6922c);
    }

    @Override // p115l4.AbstractC6931l
    public final java.lang.Exception k() {
        java.lang.Exception exc;
        synchronized (this.f50017a) {
            exc = this.f50022f;
        }
        return exc;
    }

    @Override // p115l4.AbstractC6931l
    public final java.lang.Object l() {
        java.lang.Object obj;
        synchronized (this.f50017a) {
            try {
                w();
                x();
                java.lang.Exception exc = this.f50022f;
                if (exc != null) {
                    throw new p115l4.C6929j(exc);
                }
                obj = this.f50021e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // p115l4.AbstractC6931l
    public final boolean m() {
        return this.f50020d;
    }

    @Override // p115l4.AbstractC6931l
    public final boolean n() {
        boolean z6;
        synchronized (this.f50017a) {
            z6 = this.f50019c;
        }
        return z6;
    }

    @Override // p115l4.AbstractC6931l
    public final boolean o() {
        boolean z6;
        synchronized (this.f50017a) {
            try {
                z6 = false;
                if (this.f50019c && !this.f50020d && this.f50022f == null) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l p(java.util.concurrent.Executor executor, p115l4.InterfaceC6930k interfaceC6930k) {
        p115l4.P p6 = new p115l4.P();
        this.f50018b.a(new p115l4.J(executor, interfaceC6930k, p6));
        z();
        return p6;
    }

    @Override // p115l4.AbstractC6931l
    public final p115l4.AbstractC6931l q(p115l4.InterfaceC6930k interfaceC6930k) {
        java.util.concurrent.Executor executor = p115l4.AbstractC6933n.f50027a;
        p115l4.P p6 = new p115l4.P();
        this.f50018b.a(new p115l4.J(executor, interfaceC6930k, p6));
        z();
        return p6;
    }

    public final void r(java.lang.Exception exc) {
        Q3.AbstractC1477p.m(exc, "Exception must not be null");
        synchronized (this.f50017a) {
            y();
            this.f50019c = true;
            this.f50022f = exc;
        }
        this.f50018b.b(this);
    }

    public final void s(java.lang.Object obj) {
        synchronized (this.f50017a) {
            y();
            this.f50019c = true;
            this.f50021e = obj;
        }
        this.f50018b.b(this);
    }

    public final boolean t() {
        synchronized (this.f50017a) {
            try {
                if (this.f50019c) {
                    return false;
                }
                this.f50019c = true;
                this.f50020d = true;
                this.f50018b.b(this);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(java.lang.Exception exc) {
        Q3.AbstractC1477p.m(exc, "Exception must not be null");
        synchronized (this.f50017a) {
            try {
                if (this.f50019c) {
                    return false;
                }
                this.f50019c = true;
                this.f50022f = exc;
                this.f50018b.b(this);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v(java.lang.Object obj) {
        synchronized (this.f50017a) {
            try {
                if (this.f50019c) {
                    return false;
                }
                this.f50019c = true;
                this.f50021e = obj;
                this.f50018b.b(this);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
