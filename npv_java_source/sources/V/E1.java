package V;

/* JADX INFO: loaded from: classes.dex */
final class E1 implements p061g0.b, java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.C1718h1 f14651C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f14652D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V.W f14653E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final V.D1 f14654F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final java.lang.Object f14655G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.lang.Iterable f14656H = this;

    public E1(V.C1718h1 c1718h1, int i6, V.W w6, V.D1 d6) {
        this.f14651C = c1718h1;
        this.f14652D = i6;
        this.f14654F = d6;
        this.f14655G = java.lang.Integer.valueOf(w6.c());
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new V.C1(this.f14651C, this.f14652D, this.f14653E, this.f14654F);
    }
}
