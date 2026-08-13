package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f56941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56942b;

    public H(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "bufferWithData");
        this.f56941a = iArr;
        this.f56942b = iArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        int[] iArr = this.f56941a;
        if (iArr.length < i6) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, E7.j.d(i6, iArr.length * 2));
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f56941a = iArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56942b;
    }

    public final void e(int i6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        int[] iArr = this.f56941a;
        int iD = d();
        this.f56942b = iD + 1;
        iArr[iD] = i6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = java.util.Arrays.copyOf(this.f56941a, d());
        p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
