package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class M0 extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f56955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56956b;

    private M0(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "bufferWithData");
        this.f56955a = sArr;
        this.f56956b = p087i7.K.M(sArr);
        b(10);
    }

    public /* synthetic */ M0(short[] sArr, p247y7.AbstractC7342k abstractC7342k) {
        this(sArr);
    }

    @Override // p239x9.AbstractC7317n0
    public /* bridge */ /* synthetic */ java.lang.Object a() {
        return p087i7.K.d(f());
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        if (p087i7.K.M(this.f56955a) < i6) {
            short[] sArr = this.f56955a;
            short[] sArrCopyOf = java.util.Arrays.copyOf(sArr, E7.j.d(i6, p087i7.K.M(sArr) * 2));
            p247y7.AbstractC7350t.e(sArrCopyOf, "copyOf(...)");
            this.f56955a = p087i7.K.f(sArrCopyOf);
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56956b;
    }

    public final void e(short s6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        short[] sArr = this.f56955a;
        int iD = d();
        this.f56956b = iD + 1;
        p087i7.K.Q(sArr, iD, s6);
    }

    public short[] f() {
        short[] sArrCopyOf = java.util.Arrays.copyOf(this.f56955a, d());
        p247y7.AbstractC7350t.e(sArrCopyOf, "copyOf(...)");
        return p087i7.K.f(sArrCopyOf);
    }
}
