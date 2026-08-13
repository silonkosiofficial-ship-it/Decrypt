package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f44902b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V.N1[] f44903c = new V.N1[16];

    private final int b(java.lang.Object obj, int i6) {
        int i10 = this.f44901a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = this.f44902b[i12];
            if (i13 < i6) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i6) {
                    V.N1 n6 = this.f44903c[i12];
                    return obj == (n6 != null ? n6.get() : null) ? i12 : c(i12, obj, i6);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    private final int c(int i6, java.lang.Object obj, int i10) {
        int i11 = i6 - 1;
        while (true) {
            if (-1 >= i11 || this.f44902b[i11] != i10) {
                break;
            }
            V.N1 n6 = this.f44903c[i11];
            if ((n6 != null ? n6.get() : null) == obj) {
                return i11;
            }
            i11--;
        }
        int i12 = i6 + 1;
        int i13 = this.f44901a;
        while (i12 < i13) {
            if (this.f44902b[i12] != i10) {
                return -(i12 + 1);
            }
            V.N1 n10 = this.f44903c[i12];
            if ((n10 != null ? n10.get() : null) == obj) {
                return i12;
            }
            i12++;
        }
        i12 = this.f44901a;
        return -(i12 + 1);
    }

    public final boolean a(java.lang.Object obj) {
        int iB;
        int i6 = this.f44901a;
        int iC = V.AbstractC1701c.c(obj);
        if (i6 > 0) {
            iB = b(obj, iC);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i10 = -(iB + 1);
        V.N1[] n1Arr = this.f44903c;
        int length = n1Arr.length;
        if (i6 == length) {
            int i11 = length * 2;
            V.N1[] n1Arr2 = new V.N1[i11];
            int[] iArr = new int[i11];
            int i12 = i10 + 1;
            p097j7.AbstractC6872n.l(n1Arr, n1Arr2, i12, i10, i6);
            p097j7.AbstractC6872n.p(this.f44903c, n1Arr2, 0, 0, i10, 6, null);
            p097j7.AbstractC6872n.j(this.f44902b, iArr, i12, i10, i6);
            p097j7.AbstractC6872n.o(this.f44902b, iArr, 0, 0, i10, 6, null);
            this.f44903c = n1Arr2;
            this.f44902b = iArr;
        } else {
            int i13 = i10 + 1;
            p097j7.AbstractC6872n.l(n1Arr, n1Arr, i13, i10, i6);
            int[] iArr2 = this.f44902b;
            p097j7.AbstractC6872n.j(iArr2, iArr2, i13, i10, i6);
        }
        this.f44903c[i10] = new V.N1(obj);
        this.f44902b[i10] = iC;
        this.f44901a++;
        return true;
    }

    public final int[] d() {
        return this.f44902b;
    }

    public final int e() {
        return this.f44901a;
    }

    public final V.N1[] f() {
        return this.f44903c;
    }

    public final void g(int i6) {
        this.f44901a = i6;
    }
}
