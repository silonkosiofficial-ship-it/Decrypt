package p126m5;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p126m5.f f51180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p116l5.f f51181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f51182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m5.n.a f51183d = new m5.n.a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m5.n.a f51184e = new m5.n.a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p126m5.j f51185f = new p126m5.j(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicMarkableReference f51186g = new java.util.concurrent.atomic.AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicMarkableReference f51187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicReference f51188b = new java.util.concurrent.atomic.AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f51189c;

        public a(boolean z6) {
            this.f51189c = z6;
            this.f51187a = new java.util.concurrent.atomic.AtomicMarkableReference(new p126m5.d(64, z6 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() throws java.lang.Throwable {
            this.f51188b.set(null);
            e();
        }

        private void d() {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: m5.m
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f51179C.c();
                }
            };
            if (p200u.AbstractC7162c0.a(this.f51188b, null, runnable)) {
                p126m5.n.this.f51181b.f50063b.g(runnable);
            }
        }

        private void e() throws java.lang.Throwable {
            java.util.Map mapA;
            synchronized (this) {
                try {
                    if (this.f51187a.isMarked()) {
                        mapA = ((p126m5.d) this.f51187a.getReference()).a();
                        java.util.concurrent.atomic.AtomicMarkableReference atomicMarkableReference = this.f51187a;
                        atomicMarkableReference.set((p126m5.d) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                p126m5.n.this.f51180a.r(p126m5.n.this.f51182c, mapA, this.f51189c);
            }
        }

        public java.util.Map b() {
            return ((p126m5.d) this.f51187a.getReference()).a();
        }

        public boolean f(java.lang.String str, java.lang.String str2) {
            synchronized (this) {
                try {
                    if (!((p126m5.d) this.f51187a.getReference()).d(str, str2)) {
                        return false;
                    }
                    java.util.concurrent.atomic.AtomicMarkableReference atomicMarkableReference = this.f51187a;
                    atomicMarkableReference.set((p126m5.d) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public n(java.lang.String str, p166q5.g gVar, p116l5.f fVar) {
        this.f51182c = str;
        this.f51180a = new p126m5.f(gVar);
        this.f51181b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(java.lang.String str, java.util.Map map, java.util.List list) throws java.lang.Throwable {
        if (i() != null) {
            this.f51180a.t(str, i());
        }
        if (!map.isEmpty()) {
            this.f51180a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f51180a.s(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(java.util.List list) throws java.lang.Throwable {
        this.f51180a.s(this.f51182c, list);
    }

    public static p126m5.n l(java.lang.String str, p166q5.g gVar, p116l5.f fVar) {
        p126m5.f fVar2 = new p126m5.f(gVar);
        p126m5.n nVar = new p126m5.n(str, gVar, fVar);
        ((p126m5.d) nVar.f51183d.f51187a.getReference()).e(fVar2.i(str, false));
        ((p126m5.d) nVar.f51184e.f51187a.getReference()).e(fVar2.i(str, true));
        nVar.f51186g.set(fVar2.k(str), false);
        nVar.f51185f.c(fVar2.j(str));
        return nVar;
    }

    public static java.lang.String m(java.lang.String str, p166q5.g gVar) {
        return new p126m5.f(gVar).k(str);
    }

    public java.util.Map f() {
        return this.f51183d.b();
    }

    public java.util.Map g() {
        return this.f51184e.b();
    }

    public java.util.List h() {
        return this.f51185f.a();
    }

    public java.lang.String i() {
        return (java.lang.String) this.f51186g.getReference();
    }

    public boolean n(java.lang.String str, java.lang.String str2) {
        return this.f51184e.f(str, str2);
    }

    public void o(final java.lang.String str) {
        synchronized (this.f51182c) {
            this.f51182c = str;
            final java.util.Map mapB = this.f51183d.b();
            final java.util.List listB = this.f51185f.b();
            this.f51181b.f50063b.g(new java.lang.Runnable() { // from class: m5.k
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    this.f51173C.j(str, mapB, listB);
                }
            });
        }
    }

    public boolean p(java.util.List list) {
        synchronized (this.f51185f) {
            try {
                if (!this.f51185f.c(list)) {
                    return false;
                }
                final java.util.List listB = this.f51185f.b();
                this.f51181b.f50063b.g(new java.lang.Runnable() { // from class: m5.l
                    @Override // java.lang.Runnable
                    public final void run() throws java.lang.Throwable {
                        this.f51177C.k(listB);
                    }
                });
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
