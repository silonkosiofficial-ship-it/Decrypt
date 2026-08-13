package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f44830b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f44831c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f44832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44833e;

    public m() {
        int[] iArr = new int[16];
        int i6 = 0;
        while (i6 < 16) {
            int i10 = i6 + 1;
            iArr[i6] = i10;
            i6 = i10;
        }
        this.f44832d = iArr;
    }

    private final int b() {
        int length = this.f44832d.length;
        if (this.f44833e >= length) {
            int i6 = length * 2;
            int[] iArr = new int[i6];
            int i10 = 0;
            while (i10 < i6) {
                int i11 = i10 + 1;
                iArr[i10] = i11;
                i10 = i11;
            }
            p097j7.AbstractC6872n.o(this.f44832d, iArr, 0, 0, 0, 14, null);
            this.f44832d = iArr;
        }
        int i12 = this.f44833e;
        this.f44833e = this.f44832d[i12];
        return i12;
    }

    private final void c(int i6) {
        int[] iArr = this.f44830b;
        int length = iArr.length;
        if (i6 <= length) {
            return;
        }
        int i10 = length * 2;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        p097j7.AbstractC6872n.o(iArr, iArr2, 0, 0, 0, 14, null);
        p097j7.AbstractC6872n.o(this.f44831c, iArr3, 0, 0, 0, 14, null);
        this.f44830b = iArr2;
        this.f44831c = iArr3;
    }

    private final void d(int i6) {
        this.f44832d[i6] = this.f44833e;
        this.f44833e = i6;
    }

    private final void g(int i6) {
        int i10;
        int[] iArr = this.f44830b;
        int i11 = this.f44829a >> 1;
        while (i6 < i11) {
            int i12 = (i6 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 >= this.f44829a || (i10 = iArr[i12]) >= iArr[i13]) {
                if (iArr[i13] >= iArr[i6]) {
                    return;
                }
                i(i13, i6);
                i6 = i13;
            } else {
                if (i10 >= iArr[i6]) {
                    return;
                }
                i(i12, i6);
                i6 = i12;
            }
        }
    }

    private final void h(int i6) {
        int[] iArr = this.f44830b;
        int i10 = iArr[i6];
        while (i6 > 0) {
            int i11 = ((i6 + 1) >> 1) - 1;
            if (iArr[i11] <= i10) {
                return;
            }
            i(i11, i6);
            i6 = i11;
        }
    }

    private final void i(int i6, int i10) {
        int[] iArr = this.f44830b;
        int[] iArr2 = this.f44831c;
        int[] iArr3 = this.f44832d;
        int i11 = iArr[i6];
        iArr[i6] = iArr[i10];
        iArr[i10] = i11;
        int i12 = iArr2[i6];
        iArr2[i6] = iArr2[i10];
        iArr2[i10] = i12;
        iArr3[iArr2[i6]] = i6;
        iArr3[iArr2[i10]] = i10;
    }

    public final int a(int i6) {
        c(this.f44829a + 1);
        int i10 = this.f44829a;
        this.f44829a = i10 + 1;
        int iB = b();
        this.f44830b[i10] = i6;
        this.f44831c[i10] = iB;
        this.f44832d[iB] = i10;
        h(i10);
        return iB;
    }

    public final int e(int i6) {
        return this.f44829a > 0 ? this.f44830b[0] : i6;
    }

    public final void f(int i6) {
        int i10 = this.f44832d[i6];
        i(i10, this.f44829a - 1);
        this.f44829a--;
        h(i10);
        g(i10);
        d(i6);
    }
}
