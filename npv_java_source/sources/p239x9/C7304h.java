package p239x9;

/* JADX INFO: renamed from: x9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7304h extends p239x9.AbstractC7317n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f57000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57001b;

    public C7304h(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "bufferWithData");
        this.f57000a = bArr;
        this.f57001b = bArr.length;
        b(10);
    }

    @Override // p239x9.AbstractC7317n0
    public void b(int i6) {
        byte[] bArr = this.f57000a;
        if (bArr.length < i6) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, E7.j.d(i6, bArr.length * 2));
            p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
            this.f57000a = bArrCopyOf;
        }
    }

    @Override // p239x9.AbstractC7317n0
    public int d() {
        return this.f57001b;
    }

    public final void e(byte b6) {
        p239x9.AbstractC7317n0.c(this, 0, 1, null);
        byte[] bArr = this.f57000a;
        int iD = d();
        this.f57001b = iD + 1;
        bArr[iD] = b6;
    }

    @Override // p239x9.AbstractC7317n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(this.f57000a, d());
        p247y7.AbstractC7350t.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
