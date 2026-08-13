package p239x9;

/* JADX INFO: renamed from: x9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7298e extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f56993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f56994b;

    public C7298e(boolean[] zArr) {
        p247y7.AbstractC7350t.f(zArr, "bufferWithData");
        this.f56993a = zArr;
        this.f56994b = zArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        boolean[] zArr = this.f56993a;
        if (zArr.length < i6) {
            boolean[] zArrCopyOf = java.util.Arrays.copyOf(zArr, E7.j.d(i6, zArr.length * 2));
            p247y7.AbstractC7350t.e(zArrCopyOf, "copyOf(...)");
            this.f56993a = zArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f56994b;
    }

    public final void e(boolean z6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        boolean[] zArr = this.f56993a;
        int iD = d();
        this.f56994b = iD + 1;
        zArr[iD] = z6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = java.util.Arrays.copyOf(this.f56993a, d());
        p247y7.AbstractC7350t.e(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
