package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f56949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56950b;

    private J0(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "bufferWithData");
        this.f56949a = jArr;
        this.f56950b = p087i7.H.M(jArr);
        b(10);
    }

    public /* synthetic */ J0(long[] jArr, p247y7.AbstractC7342k abstractC7342k) {
        this(jArr);
    }

    @Override // p239x9.AbstractC7317n0
    public /* bridge */ /* synthetic */ java.lang.Object a() {
        return p087i7.H.d(f());
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        if (p087i7.H.M(this.f56949a) < i6) {
            long[] jArr = this.f56949a;
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, E7.j.d(i6, p087i7.H.M(jArr) * 2));
            p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(...)");
            this.f56949a = p087i7.H.f(jArrCopyOf);
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56950b;
    }

    public final void e(long j6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        long[] jArr = this.f56949a;
        int iD = d();
        this.f56950b = iD + 1;
        p087i7.H.Q(jArr, iD, j6);
    }

    public long[] f() {
        long[] jArrCopyOf = java.util.Arrays.copyOf(this.f56949a, d());
        p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(...)");
        return p087i7.H.f(jArrCopyOf);
    }
}
