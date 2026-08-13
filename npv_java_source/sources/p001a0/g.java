package p001a0;

/* JADX INFO: loaded from: classes.dex */
public class g extends p001a0.e implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p001a0.f f17009F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.lang.Object f17010G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f17011H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f17012I;

    public g(p001a0.f fVar, p001a0.u[] uVarArr) {
        super(fVar.g(), uVarArr);
        this.f17009F = fVar;
        this.f17012I = fVar.f();
    }

    private final void k() {
        if (this.f17009F.f() != this.f17012I) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void l() {
        if (!this.f17011H) {
            throw new java.lang.IllegalStateException();
        }
    }

    private final void m(int i6, p001a0.t tVar, java.lang.Object obj, int i10) {
        int i11 = i10 * 5;
        if (i11 > 30) {
            e()[i10].o(tVar.p(), tVar.p().length, 0);
            while (!p247y7.AbstractC7350t.b(e()[i10].b(), obj)) {
                e()[i10].k();
            }
            h(i10);
            return;
        }
        int iF = 1 << p001a0.x.f(i6, i11);
        if (tVar.q(iF)) {
            e()[i10].o(tVar.p(), tVar.m() * 2, tVar.n(iF));
            h(i10);
        } else {
            int iO = tVar.O(iF);
            p001a0.t tVarN = tVar.N(iO);
            e()[i10].o(tVar.p(), tVar.m() * 2, iO);
            m(i6, tVarN, obj, i10 + 1);
        }
    }

    @Override // p001a0.e, java.util.Iterator
    public java.lang.Object next() {
        k();
        this.f17010G = c();
        this.f17011H = true;
        return super.next();
    }

    public final void o(java.lang.Object obj, java.lang.Object obj2) {
        if (this.f17009F.containsKey(obj)) {
            if (hasNext()) {
                java.lang.Object objC = c();
                this.f17009F.put(obj, obj2);
                m(objC != null ? objC.hashCode() : 0, this.f17009F.g(), objC, 0);
            } else {
                this.f17009F.put(obj, obj2);
            }
            this.f17012I = this.f17009F.f();
        }
    }

    @Override // p001a0.e, java.util.Iterator
    public void remove() {
        l();
        if (hasNext()) {
            java.lang.Object objC = c();
            p247y7.W.d(this.f17009F).remove(this.f17010G);
            m(objC != null ? objC.hashCode() : 0, this.f17009F.g(), objC, 0);
        } else {
            p247y7.W.d(this.f17009F).remove(this.f17010G);
        }
        this.f17010G = null;
        this.f17011H = false;
        this.f17012I = this.f17009F.f();
    }
}
