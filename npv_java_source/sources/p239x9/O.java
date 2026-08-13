package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f56960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56961b;

    public O(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "bufferWithData");
        this.f56960a = jArr;
        this.f56961b = jArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        long[] jArr = this.f56960a;
        if (jArr.length < i6) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, E7.j.d(i6, jArr.length * 2));
            p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(...)");
            this.f56960a = jArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56961b;
    }

    public final void e(long j6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        long[] jArr = this.f56960a;
        int iD = d();
        this.f56961b = iD + 1;
        jArr[iD] = j6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = java.util.Arrays.copyOf(this.f56960a, d());
        p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
