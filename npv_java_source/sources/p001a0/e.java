package p001a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p001a0.u[] f17000C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f17001D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f17002E = true;

    public e(p001a0.t tVar, p001a0.u[] uVarArr) {
        this.f17000C = uVarArr;
        uVarArr[0].m(tVar.p(), tVar.m() * 2);
        this.f17001D = 0;
        d();
    }

    private final void b() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
    }

    private final void d() {
        if (this.f17000C[this.f17001D].f()) {
            return;
        }
        for (int i6 = this.f17001D; -1 < i6; i6--) {
            int iF = f(i6);
            if (iF == -1 && this.f17000C[i6].h()) {
                this.f17000C[i6].l();
                iF = f(i6);
            }
            if (iF != -1) {
                this.f17001D = iF;
                return;
            }
            if (i6 > 0) {
                this.f17000C[i6 - 1].l();
            }
            this.f17000C[i6].m(p001a0.t.f17020e.a().p(), 0);
        }
        this.f17002E = false;
    }

    private final int f(int i6) {
        if (this.f17000C[i6].f()) {
            return i6;
        }
        if (!this.f17000C[i6].h()) {
            return -1;
        }
        p001a0.t tVarC = this.f17000C[i6].c();
        if (i6 == 6) {
            this.f17000C[i6 + 1].m(tVarC.p(), tVarC.p().length);
        } else {
            this.f17000C[i6 + 1].m(tVarC.p(), tVarC.m() * 2);
        }
        return f(i6 + 1);
    }

    protected final java.lang.Object c() {
        b();
        return this.f17000C[this.f17001D].b();
    }

    protected final p001a0.u[] e() {
        return this.f17000C;
    }

    protected final void h(int i6) {
        this.f17001D = i6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17002E;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        java.lang.Object next = this.f17000C[this.f17001D].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
