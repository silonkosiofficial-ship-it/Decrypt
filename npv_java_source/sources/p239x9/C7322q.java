package p239x9;

/* JADX INFO: renamed from: x9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7322q extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f57029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57030b;

    public C7322q(double[] dArr) {
        p247y7.AbstractC7350t.f(dArr, "bufferWithData");
        this.f57029a = dArr;
        this.f57030b = dArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        double[] dArr = this.f57029a;
        if (dArr.length < i6) {
            double[] dArrCopyOf = java.util.Arrays.copyOf(dArr, E7.j.d(i6, dArr.length * 2));
            p247y7.AbstractC7350t.e(dArrCopyOf, "copyOf(...)");
            this.f57029a = dArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f57030b;
    }

    public final void e(double d6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        double[] dArr = this.f57029a;
        int iD = d();
        this.f57030b = iD + 1;
        dArr[iD] = d6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = java.util.Arrays.copyOf(this.f57029a, d());
        p247y7.AbstractC7350t.e(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
