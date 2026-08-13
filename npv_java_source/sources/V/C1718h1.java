package V;

/* JADX INFO: renamed from: V.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1718h1 implements p061g0.a, java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f14874D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f14876F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f14877G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f14878H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f14879I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.util.HashMap f14881K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private p170r.C f14882L;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f14873C = new int[0];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Object[] f14875E = new java.lang.Object[0];

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.util.ArrayList f14880J = new java.util.ArrayList();

    private final V.C1704d Z(int i6) {
        int i10;
        if (!(!this.f14878H)) {
            V.AbstractC1741q.r("use active SlotWriter to crate an anchor for location instead");
        }
        if (i6 < 0 || i6 >= (i10 = this.f14874D)) {
            return null;
        }
        return V.AbstractC1724j1.G(this.f14880J, i6, i10);
    }

    public final boolean C() {
        return this.f14874D > 0 && V.AbstractC1724j1.D(this.f14873C, 0);
    }

    public final java.util.ArrayList D() {
        return this.f14880J;
    }

    public final p170r.C E() {
        return this.f14882L;
    }

    public final int[] M() {
        return this.f14873C;
    }

    public final int N() {
        return this.f14874D;
    }

    public final java.lang.Object[] O() {
        return this.f14875E;
    }

    public final int P() {
        return this.f14876F;
    }

    public final java.util.HashMap Q() {
        return this.f14881K;
    }

    public final int R() {
        return this.f14879I;
    }

    public final boolean S() {
        return this.f14878H;
    }

    public final boolean T(int i6, V.C1704d c1704d) {
        if (!(!this.f14878H)) {
            V.AbstractC1741q.r("Writer is active");
        }
        if (!(i6 >= 0 && i6 < this.f14874D)) {
            V.AbstractC1741q.r("Invalid group index");
        }
        if (W(c1704d)) {
            int I10 = V.AbstractC1724j1.I(this.f14873C, i6) + i6;
            int iA = c1704d.a();
            if (i6 <= iA && iA < I10) {
                return true;
            }
        }
        return false;
    }

    public final V.C1715g1 U() {
        if (this.f14878H) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f14877G++;
        return new V.C1715g1(this);
    }

    public final V.C1727k1 V() {
        if (!(!this.f14878H)) {
            V.AbstractC1741q.r("Cannot start a writer when another writer is pending");
        }
        if (!(this.f14877G <= 0)) {
            V.AbstractC1741q.r("Cannot start a writer when a reader is pending");
        }
        this.f14878H = true;
        this.f14879I++;
        return new V.C1727k1(this);
    }

    public final boolean W(V.C1704d c1704d) {
        int iU;
        return c1704d.b() && (iU = V.AbstractC1724j1.U(this.f14880J, c1704d.a(), this.f14874D)) >= 0 && p247y7.AbstractC7350t.b(this.f14880J.get(iU), c1704d);
    }

    public final void X(int[] iArr, int i6, java.lang.Object[] objArr, int i10, java.util.ArrayList arrayList, java.util.HashMap map, p170r.C c6) {
        this.f14873C = iArr;
        this.f14874D = i6;
        this.f14875E = objArr;
        this.f14876F = i10;
        this.f14880J = arrayList;
        this.f14881K = map;
        this.f14882L = c6;
    }

    public final V.W Y(int i6) {
        V.C1704d c1704dZ;
        java.util.HashMap map = this.f14881K;
        if (map == null || (c1704dZ = Z(i6)) == null) {
            return null;
        }
        return (V.W) map.get(c1704dZ);
    }

    public final V.C1704d d(int i6) {
        if (!(!this.f14878H)) {
            V.AbstractC1741q.r("use active SlotWriter to create an anchor location instead");
        }
        boolean z6 = false;
        if (i6 >= 0 && i6 < this.f14874D) {
            z6 = true;
        }
        if (!z6) {
            V.I0.a("Parameter index is out of range");
        }
        java.util.ArrayList arrayList = this.f14880J;
        int iU = V.AbstractC1724j1.U(arrayList, i6, this.f14874D);
        if (iU >= 0) {
            return (V.C1704d) arrayList.get(iU);
        }
        V.C1704d c1704d = new V.C1704d(i6);
        arrayList.add(-(iU + 1), c1704d);
        return c1704d;
    }

    public final int e(V.C1704d c1704d) {
        if (!(!this.f14878H)) {
            V.AbstractC1741q.r("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1704d.b()) {
            V.I0.a("Anchor refers to a group that was removed");
        }
        return c1704d.a();
    }

    public final void f(V.C1715g1 c1715g1, java.util.HashMap map) {
        if (!(c1715g1.y() == this && this.f14877G > 0)) {
            V.AbstractC1741q.r("Unexpected reader close()");
        }
        this.f14877G--;
        if (map != null) {
            synchronized (this) {
                try {
                    java.util.HashMap map2 = this.f14881K;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f14881K = map;
                    }
                    p087i7.M m6 = p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(V.C1727k1 c1727k1, int[] iArr, int i6, java.lang.Object[] objArr, int i10, java.util.ArrayList arrayList, java.util.HashMap map, p170r.C c6) {
        if (!(c1727k1.f0() == this && this.f14878H)) {
            V.I0.a("Unexpected writer close()");
        }
        this.f14878H = false;
        X(iArr, i6, objArr, i10, arrayList, map, c6);
    }

    public boolean isEmpty() {
        return this.f14874D == 0;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new V.U(this, 0, this.f14874D);
    }

    public final void o() {
        this.f14882L = new p170r.C(0, 1, null);
    }

    public final void s() {
        this.f14881K = new java.util.HashMap();
    }
}
