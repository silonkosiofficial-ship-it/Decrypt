package V;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f14815a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14816b;

    public final void a() {
        this.f14816b = 0;
    }

    public final int b() {
        return this.f14816b;
    }

    public final int c(int i6) {
        int i10 = this.f14816b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14815a[i11] == i6) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.f14816b == 0;
    }

    public final int e() {
        return this.f14815a[this.f14816b - 1];
    }

    public final int f(int i6) {
        return this.f14815a[i6];
    }

    public final int g() {
        return this.f14815a[this.f14816b - 2];
    }

    public final int h(int i6) {
        return this.f14816b > 0 ? e() : i6;
    }

    public final int i() {
        int[] iArr = this.f14815a;
        int i6 = this.f14816b - 1;
        this.f14816b = i6;
        return iArr[i6];
    }

    public final void j(int i6) {
        int i10 = this.f14816b;
        int[] iArr = this.f14815a;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f14815a = iArrCopyOf;
        }
        int[] iArr2 = this.f14815a;
        int i11 = this.f14816b;
        this.f14816b = i11 + 1;
        iArr2[i11] = i6;
    }
}
