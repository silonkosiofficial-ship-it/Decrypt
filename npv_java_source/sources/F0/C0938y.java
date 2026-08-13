package F0;

/* JADX INFO: renamed from: F0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0938y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f2729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2730b;

    public C0938y(int i6) {
        this.f2729a = new int[i6];
    }

    private final boolean a(int i6, int i10) {
        int[] iArr = this.f2729a;
        int i11 = iArr[i6];
        int i12 = iArr[i10];
        if (i11 >= i12) {
            return i11 == i12 && iArr[i6 + 1] <= iArr[i10 + 1];
        }
        return true;
    }

    private final int e(int i6, int i10, int i11) {
        int i12 = i6 - i11;
        while (i6 < i10) {
            if (a(i6, i10)) {
                i12 += i11;
                k(i12, i6);
            }
            i6 += i11;
        }
        int i13 = i12 + i11;
        k(i13, i10);
        return i13;
    }

    private final void i(int i6, int i10, int i11) {
        if (i6 < i10) {
            int iE = e(i6, i10, i11);
            i(i6, iE - i11, i11);
            i(iE + i11, i10, i11);
        }
    }

    private final void k(int i6, int i10) {
        int[] iArr = this.f2729a;
        F0.Z.i(iArr, i6, i10);
        F0.Z.i(iArr, i6 + 1, i10 + 1);
        F0.Z.i(iArr, i6 + 2, i10 + 2);
    }

    public final int b(int i6) {
        return this.f2729a[i6];
    }

    public final int c() {
        return this.f2730b;
    }

    public final boolean d() {
        return this.f2730b != 0;
    }

    public final int f() {
        int[] iArr = this.f2729a;
        int i6 = this.f2730b - 1;
        this.f2730b = i6;
        return iArr[i6];
    }

    public final void g(int i6, int i10, int i11) {
        int i12 = this.f2730b;
        int i13 = i12 + 3;
        int[] iArr = this.f2729a;
        if (i13 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f2729a = iArrCopyOf;
        }
        int[] iArr2 = this.f2729a;
        iArr2[i12] = i6 + i11;
        iArr2[i12 + 1] = i10 + i11;
        iArr2[i12 + 2] = i11;
        this.f2730b = i13;
    }

    public final void h(int i6, int i10, int i11, int i12) {
        int i13 = this.f2730b;
        int i14 = i13 + 4;
        int[] iArr = this.f2729a;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f2729a = iArrCopyOf;
        }
        int[] iArr2 = this.f2729a;
        iArr2[i13] = i6;
        iArr2[i13 + 1] = i10;
        iArr2[i13 + 2] = i11;
        iArr2[i13 + 3] = i12;
        this.f2730b = i14;
    }

    public final void j() {
        int i6 = this.f2730b;
        if (!(i6 % 3 == 0)) {
            C0.a.b("Array size not a multiple of 3");
        }
        if (i6 > 3) {
            i(0, i6 - 3, 3);
        }
    }
}
