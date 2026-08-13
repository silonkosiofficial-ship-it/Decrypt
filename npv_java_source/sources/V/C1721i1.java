package V;

/* JADX INFO: renamed from: V.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1721i1 implements p061g0.b, java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.C1718h1 f14893C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f14894D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f14895E;

    public C1721i1(V.C1718h1 c1718h1, int i6, int i10) {
        this.f14893C = c1718h1;
        this.f14894D = i6;
        this.f14895E = i10;
    }

    private final void d() {
        if (this.f14893C.R() != this.f14895E) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        d();
        this.f14893C.Y(this.f14894D);
        V.C1718h1 c1718h1 = this.f14893C;
        int i6 = this.f14894D;
        return new V.U(c1718h1, i6 + 1, i6 + V.AbstractC1724j1.I(c1718h1.M(), this.f14894D));
    }
}
