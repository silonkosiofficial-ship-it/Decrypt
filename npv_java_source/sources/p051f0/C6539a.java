package p051f0;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6539a extends p051f0.C6541c {

    /* JADX INFO: renamed from: f0.a$a, reason: collision with other inner class name */
    static final class C0500a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f44796D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0500a(java.util.List list) {
            super(1);
            this.f44796D = list;
        }

        public final void a(java.lang.Object obj) {
            java.util.List list = this.f44796D;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((p237x7.l) list.get(i6)).l(obj);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: f0.a$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44797D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44798E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.l lVar, p237x7.l lVar2) {
            super(1);
            this.f44797D = lVar;
            this.f44798E = lVar2;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p051f0.C6541c l(p051f0.n nVar) {
            int i6;
            synchronized (p051f0.p.I()) {
                i6 = p051f0.p.f44850e;
                p051f0.p.f44850e = i6 + 1;
            }
            return new p051f0.C6541c(i6, nVar, this.f44797D, this.f44798E);
        }
    }

    /* JADX INFO: renamed from: f0.a$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f44799D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p237x7.l lVar) {
            super(1);
            this.f44799D = lVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p051f0.h l(p051f0.n nVar) {
            int i6;
            synchronized (p051f0.p.I()) {
                i6 = p051f0.p.f44850e;
                p051f0.p.f44850e = i6 + 1;
            }
            return new p051f0.h(i6, nVar, this.f44799D);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6539a(int i6, p051f0.n nVar) {
        p237x7.l c0500a;
        synchronized (p051f0.p.I()) {
            java.util.List list = p051f0.p.f44854i;
            c0500a = (p237x7.l) p097j7.AbstractC6879v.I0(list);
            c0500a = c0500a == null ? new p051f0.C6539a.C0500a(list) : c0500a;
        }
        super(i6, nVar, null, c0500a);
    }

    @Override // p051f0.C6541c
    public p051f0.l C() {
        throw new java.lang.IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // p051f0.C6541c
    public p051f0.C6541c Q(p237x7.l lVar, p237x7.l lVar2) {
        return (p051f0.C6541c) p051f0.p.b0(new p051f0.C6539a.b(lVar, lVar2));
    }

    @Override // p051f0.C6541c, p051f0.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public java.lang.Void m(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.C6541c, p051f0.k
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public java.lang.Void n(p051f0.k kVar) {
        p051f0.t.a();
        throw new p087i7.C6665k();
    }

    @Override // p051f0.C6541c, p051f0.k
    public void d() {
        synchronized (p051f0.p.I()) {
            q();
            p087i7.M m6 = p087i7.M.f46721a;
        }
    }

    @Override // p051f0.C6541c, p051f0.k
    public void o() {
        p051f0.p.B();
    }

    @Override // p051f0.C6541c, p051f0.k
    public p051f0.k x(p237x7.l lVar) {
        return p051f0.p.b0(new p051f0.C6539a.c(lVar));
    }
}
