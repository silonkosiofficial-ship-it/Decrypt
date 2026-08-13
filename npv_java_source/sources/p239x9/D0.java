package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f56932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56933b;

    private D0(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "bufferWithData");
        this.f56932a = bArr;
        this.f56933b = p087i7.D.N(bArr);
        b(10);
    }

    public /* synthetic */ D0(byte[] bArr, p247y7.AbstractC7342k abstractC7342k) {
        this(bArr);
    }

    @Override // p239x9.AbstractC7317n0
    public /* bridge */ /* synthetic */ java.lang.Object a() {
        return p087i7.D.d(f());
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        if (p087i7.D.N(this.f56932a) < i6) {
            byte[] bArr = this.f56932a;
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, E7.j.d(i6, p087i7.D.N(bArr) * 2));
            p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
            this.f56932a = p087i7.D.f(bArrCopyOf);
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56933b;
    }

    public final void e(byte b6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        byte[] bArr = this.f56932a;
        int iD = d();
        this.f56933b = iD + 1;
        p087i7.D.R(bArr, iD, b6);
    }

    public byte[] f() {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(this.f56932a, d());
        p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
        return p087i7.D.f(bArrCopyOf);
    }
}
