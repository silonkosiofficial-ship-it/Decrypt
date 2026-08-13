package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f56939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56940b;

    private G0(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "bufferWithData");
        this.f56939a = iArr;
        this.f56940b = p087i7.F.M(iArr);
        b(10);
    }

    public /* synthetic */ G0(int[] iArr, p247y7.AbstractC7342k abstractC7342k) {
        this(iArr);
    }

    @Override // p239x9.AbstractC7317n0
    public /* bridge */ /* synthetic */ java.lang.Object a() {
        return p087i7.F.d(f());
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        if (p087i7.F.M(this.f56939a) < i6) {
            int[] iArr = this.f56939a;
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, E7.j.d(i6, p087i7.F.M(iArr) * 2));
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f56939a = p087i7.F.f(iArrCopyOf);
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56940b;
    }

    public final void e(int i6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        int[] iArr = this.f56939a;
        int iD = d();
        this.f56940b = iD + 1;
        p087i7.F.Q(iArr, iD, i6);
    }

    public int[] f() {
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.f56939a, d());
        p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
        return p087i7.F.f(iArrCopyOf);
    }
}
