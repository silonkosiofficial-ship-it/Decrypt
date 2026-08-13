package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f56921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56922b;

    public A(float[] fArr) {
        p247y7.AbstractC7350t.f(fArr, "bufferWithData");
        this.f56921a = fArr;
        this.f56922b = fArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        float[] fArr = this.f56921a;
        if (fArr.length < i6) {
            float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, E7.j.d(i6, fArr.length * 2));
            p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(...)");
            this.f56921a = fArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56922b;
    }

    public final void e(float f6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        float[] fArr = this.f56921a;
        int iD = d();
        this.f56922b = iD + 1;
        fArr[iD] = f6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = java.util.Arrays.copyOf(this.f56921a, d());
        p247y7.AbstractC7350t.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
