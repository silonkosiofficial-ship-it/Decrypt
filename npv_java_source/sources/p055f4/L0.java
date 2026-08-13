package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class L0 extends p055f4.I0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final p055f4.I0 f45054H = new p055f4.L0(new java.lang.Object[0], 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final transient java.lang.Object[] f45055F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final transient int f45056G;

    L0(java.lang.Object[] objArr, int i6) {
        this.f45055F = objArr;
        this.f45056G = i6;
    }

    @Override // p055f4.I0, p055f4.F0
    final int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f45055F, 0, objArr, 0, this.f45056G);
        return this.f45056G;
    }

    @Override // p055f4.F0
    final int e() {
        return this.f45056G;
    }

    @Override // p055f4.F0
    final int f() {
        return 0;
    }

    @Override // p055f4.F0
    final java.lang.Object[] g() {
        return this.f45055F;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i6) {
        p055f4.A0.a(i6, this.f45056G, "index");
        java.lang.Object obj = this.f45055F[i6];
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45056G;
    }
}
