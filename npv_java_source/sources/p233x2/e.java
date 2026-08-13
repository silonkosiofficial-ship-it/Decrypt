package p233x2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x2.e.a f56909d = new x2.e.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p233x2.f f56910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p233x2.d f56911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56912c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p233x2.e a(p233x2.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "owner");
            return new p233x2.e(fVar, null);
        }
    }

    private e(p233x2.f fVar) {
        this.f56910a = fVar;
        this.f56911b = new p233x2.d();
    }

    public /* synthetic */ e(p233x2.f fVar, p247y7.AbstractC7342k abstractC7342k) {
        this(fVar);
    }

    public static final p233x2.e a(p233x2.f fVar) {
        return f56909d.a(fVar);
    }

    public final p233x2.d b() {
        return this.f56911b;
    }

    public final void c() {
        androidx.lifecycle.AbstractC2079k abstractC2079kU = this.f56910a.u();
        if (abstractC2079kU.b() != androidx.lifecycle.AbstractC2079k.b.INITIALIZED) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        abstractC2079kU.a(new p233x2.b(this.f56910a));
        this.f56911b.e(abstractC2079kU);
        this.f56912c = true;
    }

    public final void d(android.os.Bundle bundle) {
        if (!this.f56912c) {
            c();
        }
        androidx.lifecycle.AbstractC2079k abstractC2079kU = this.f56910a.u();
        if (!abstractC2079kU.b().g(androidx.lifecycle.AbstractC2079k.b.STARTED)) {
            this.f56911b.f(bundle);
            return;
        }
        throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + abstractC2079kU.b()).toString());
    }

    public final void e(android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(bundle, "outBundle");
        this.f56911b.g(bundle);
    }
}
