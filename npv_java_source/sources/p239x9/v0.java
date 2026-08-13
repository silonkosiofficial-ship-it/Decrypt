package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f57053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57054b;

    public v0(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "bufferWithData");
        this.f57053a = sArr;
        this.f57054b = sArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        short[] sArr = this.f57053a;
        if (sArr.length < i6) {
            short[] sArrCopyOf = java.util.Arrays.copyOf(sArr, E7.j.d(i6, sArr.length * 2));
            p247y7.AbstractC7350t.e(sArrCopyOf, "copyOf(...)");
            this.f57053a = sArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f57054b;
    }

    public final void e(short s6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        short[] sArr = this.f57053a;
        int iD = d();
        this.f57054b = iD + 1;
        sArr[iD] = s6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = java.util.Arrays.copyOf(this.f57053a, d());
        p247y7.AbstractC7350t.e(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
