package p153p2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.a f52716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V8.c f52717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V8.a f52718c;

    public a(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "closeAction");
        this.f52716a = aVar;
        this.f52717b = V8.b.c(0);
        this.f52718c = V8.b.a(false);
    }

    private final boolean b() {
        return this.f52718c.c();
    }

    public final boolean a() {
        synchronized (this) {
            if (b()) {
                return false;
            }
            this.f52717b.d();
            return true;
        }
    }

    public final void c() {
        synchronized (this) {
            this.f52717b.b();
            if (this.f52717b.c() < 0) {
                throw new java.lang.IllegalStateException("Unbalanced call to unblock() detected.".toString());
            }
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }
}
