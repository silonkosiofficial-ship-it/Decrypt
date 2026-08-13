package p143o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p143o2.n f52525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f52526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f52527c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p253z2.h b() {
            return p143o2.w.this.d();
        }
    }

    public w(p143o2.n nVar) {
        p247y7.AbstractC7350t.f(nVar, "database");
        this.f52525a = nVar;
        this.f52526b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f52527c = p087i7.AbstractC6669o.b(new o2.w.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p253z2.h d() {
        return this.f52525a.h(e());
    }

    private final p253z2.h f() {
        return (p253z2.h) this.f52527c.getValue();
    }

    private final p253z2.h g(boolean z6) {
        return z6 ? f() : d();
    }

    public p253z2.h b() {
        c();
        return g(this.f52526b.compareAndSet(false, true));
    }

    protected void c() {
        this.f52525a.e();
    }

    protected abstract java.lang.String e();

    public void h(p253z2.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "statement");
        if (hVar == f()) {
            this.f52526b.set(false);
        }
    }
}
