package p239x9;

/* JADX INFO: renamed from: x9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7312l extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f57020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57021b;

    public C7312l(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "bufferWithData");
        this.f57020a = cArr;
        this.f57021b = cArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        char[] cArr = this.f57020a;
        if (cArr.length < i6) {
            char[] cArrCopyOf = java.util.Arrays.copyOf(cArr, E7.j.d(i6, cArr.length * 2));
            p247y7.AbstractC7350t.e(cArrCopyOf, "copyOf(...)");
            this.f57020a = cArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f57021b;
    }

    public final void e(char c6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        char[] cArr = this.f57020a;
        int iD = d();
        this.f57021b = iD + 1;
        cArr[iD] = c6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = java.util.Arrays.copyOf(this.f57020a, d());
        p247y7.AbstractC7350t.e(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
