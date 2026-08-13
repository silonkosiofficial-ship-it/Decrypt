package V;

/* JADX INFO: loaded from: classes.dex */
final class C1 implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.C1718h1 f14635C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f14636D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V.W f14637E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final V.D1 f14638F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f14639G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f14640H;

    public C1(V.C1718h1 c1718h1, int i6, V.W w6, V.D1 d6) {
        this.f14635C = c1718h1;
        this.f14636D = i6;
        this.f14638F = d6;
        this.f14639G = c1718h1.R();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p061g0.b next() {
        java.lang.Object obj;
        java.util.ArrayList arrayListB = this.f14637E.b();
        if (arrayListB != null) {
            int i6 = this.f14640H;
            this.f14640H = i6 + 1;
            obj = arrayListB.get(i6);
        } else {
            obj = null;
        }
        if (obj instanceof V.C1704d) {
            return new V.C1721i1(this.f14635C, ((V.C1704d) obj).a(), this.f14639G);
        }
        if (obj instanceof V.W) {
            return new V.E1(this.f14635C, this.f14636D, (V.W) obj, new V.X0(this.f14638F, this.f14640H - 1));
        }
        V.AbstractC1741q.s("Unexpected group information structure");
        throw new p087i7.C6665k();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.util.ArrayList arrayListB = this.f14637E.b();
        return arrayListB != null && this.f14640H < arrayListB.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
