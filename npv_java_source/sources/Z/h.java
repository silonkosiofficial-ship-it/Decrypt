package Z;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Z.a implements java.util.ListIterator, p256z7.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Z.f f16648E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f16649F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Z.k f16650G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f16651H;

    public h(Z.f fVar, int i6) {
        super(i6, fVar.size());
        this.f16648E = fVar;
        this.f16649F = fVar.o();
        this.f16651H = -1;
        o();
    }

    private final void k() {
        if (this.f16649F != this.f16648E.o()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void l() {
        if (this.f16651H == -1) {
            throw new java.lang.IllegalStateException();
        }
    }

    private final void m() {
        h(this.f16648E.size());
        this.f16649F = this.f16648E.o();
        this.f16651H = -1;
        o();
    }

    private final void o() {
        java.lang.Object[] objArrS = this.f16648E.s();
        if (objArrS == null) {
            this.f16650G = null;
            return;
        }
        int iD = Z.l.d(this.f16648E.size());
        int iG = E7.j.g(d(), iD);
        int iC = (this.f16648E.C() / 5) + 1;
        Z.k kVar = this.f16650G;
        if (kVar == null) {
            this.f16650G = new Z.k(objArrS, iG, iD, iC);
        } else {
            p247y7.AbstractC7350t.c(kVar);
            kVar.o(objArrS, iG, iD, iC);
        }
    }

    @Override // Z.a, java.util.ListIterator
    public void add(java.lang.Object obj) {
        k();
        this.f16648E.add(d(), obj);
        f(d() + 1);
        m();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        k();
        b();
        this.f16651H = d();
        Z.k kVar = this.f16650G;
        if (kVar == null) {
            java.lang.Object[] objArrD = this.f16648E.D();
            int iD = d();
            f(iD + 1);
            return objArrD[iD];
        }
        if (kVar.hasNext()) {
            f(d() + 1);
            return kVar.next();
        }
        java.lang.Object[] objArrD2 = this.f16648E.D();
        int iD2 = d();
        f(iD2 + 1);
        return objArrD2[iD2 - kVar.e()];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        k();
        c();
        this.f16651H = d() - 1;
        Z.k kVar = this.f16650G;
        if (kVar == null) {
            java.lang.Object[] objArrD = this.f16648E.D();
            f(d() - 1);
            return objArrD[d()];
        }
        if (d() <= kVar.e()) {
            f(d() - 1);
            return kVar.previous();
        }
        java.lang.Object[] objArrD2 = this.f16648E.D();
        f(d() - 1);
        return objArrD2[d() - kVar.e()];
    }

    @Override // Z.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        k();
        l();
        this.f16648E.remove(this.f16651H);
        if (this.f16651H < d()) {
            f(this.f16651H);
        }
        m();
    }

    @Override // Z.a, java.util.ListIterator
    public void set(java.lang.Object obj) {
        k();
        l();
        this.f16648E.set(this.f16651H, obj);
        this.f16649F = this.f16648E.o();
        o();
    }
}
