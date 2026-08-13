package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class h extends V4.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q4.f f16365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F5.b f16366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f16367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f16368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y4.p f16369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y4.q f16370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.Executor f16371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.Executor f16372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.Executor f16373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p115l4.AbstractC6931l f16374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Z4.a f16375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private V4.b f16376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private V4.a f16377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private V4.c f16378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p115l4.AbstractC6931l f16379o;

    public h(Q4.f fVar, F5.b bVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        Q3.AbstractC1477p.l(fVar);
        Q3.AbstractC1477p.l(bVar);
        this.f16365a = fVar;
        this.f16366b = bVar;
        this.f16367c = new java.util.ArrayList();
        this.f16368d = new java.util.ArrayList();
        this.f16369e = new Y4.p(fVar.k(), fVar.o());
        this.f16370f = new Y4.q(fVar.k(), this, executor2, scheduledExecutorService);
        this.f16371g = executor;
        this.f16372h = executor2;
        this.f16373i = executor3;
        this.f16374j = q(executor3);
        this.f16375k = new Z4.a.C0312a();
    }

    private boolean k() {
        V4.c cVar = this.f16378n;
        return cVar != null && cVar.a() - this.f16375k.a() > 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l m(V4.c cVar) {
        s(cVar);
        java.util.Iterator it = this.f16368d.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.D.a(it.next());
            throw null;
        }
        Y4.c.a(cVar);
        java.util.Iterator it2 = this.f16367c.iterator();
        if (!it2.hasNext()) {
            return p115l4.AbstractC6934o.e(cVar);
        }
        androidx.appcompat.app.D.a(it2.next());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p115l4.AbstractC6931l n(boolean z6, p115l4.AbstractC6931l abstractC6931l) {
        if (!z6 && k()) {
            return p115l4.AbstractC6934o.e(this.f16378n);
        }
        if (this.f16377m == null) {
            return p115l4.AbstractC6934o.d(new Q4.m("No AppCheckProvider installed."));
        }
        p115l4.AbstractC6931l abstractC6931l2 = this.f16379o;
        if (abstractC6931l2 == null || abstractC6931l2.n() || this.f16379o.m()) {
            this.f16379o = i();
        }
        return this.f16379o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(p115l4.C6932m c6932m) {
        V4.c cVarD = this.f16369e.d();
        if (cVarD != null) {
            r(cVarD);
        }
        c6932m.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(V4.c cVar) {
        this.f16369e.e(cVar);
    }

    private p115l4.AbstractC6931l q(java.util.concurrent.Executor executor) {
        final p115l4.C6932m c6932m = new p115l4.C6932m();
        executor.execute(new java.lang.Runnable() { // from class: Y4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f16358C.o(c6932m);
            }
        });
        return c6932m.a();
    }

    private void s(final V4.c cVar) {
        this.f16373i.execute(new java.lang.Runnable() { // from class: Y4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f16361C.p(cVar);
            }
        });
        r(cVar);
        this.f16370f.d(cVar);
    }

    @Override // V4.e
    public p115l4.AbstractC6931l a(final boolean z6) {
        return this.f16374j.i(this.f16372h, new p115l4.InterfaceC6922c() { // from class: Y4.g
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return this.f16363a.n(z6, abstractC6931l);
            }
        });
    }

    @Override // V4.e
    public void d(V4.b bVar) {
        l(bVar, this.f16365a.t());
    }

    p115l4.AbstractC6931l i() {
        return this.f16377m.a().p(this.f16371g, new p115l4.InterfaceC6930k() { // from class: Y4.e
            @Override // p115l4.InterfaceC6930k
            public final p115l4.AbstractC6931l a(java.lang.Object obj) {
                return this.f16360a.m((V4.c) obj);
            }
        });
    }

    F5.b j() {
        return this.f16366b;
    }

    public void l(V4.b bVar, boolean z6) {
        Q3.AbstractC1477p.l(bVar);
        this.f16376l = bVar;
        this.f16377m = bVar.a(this.f16365a);
        this.f16370f.e(z6);
    }

    void r(V4.c cVar) {
        this.f16378n = cVar;
    }
}
