package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p170r.AbstractC7037l {
    public B(int i6) {
        super(i6, null);
    }

    public /* synthetic */ B(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 16 : i6);
    }

    public final void f(int i6, int i10) {
        int i11;
        if (i6 < 0 || i6 > (i11 = this.f53391b)) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i6 + " must be in 0.." + this.f53391b);
        }
        i(i11 + 1);
        int[] iArr = this.f53390a;
        int i12 = this.f53391b;
        if (i6 != i12) {
            p097j7.AbstractC6872n.j(iArr, iArr, i6 + 1, i6, i12);
        }
        iArr[i6] = i10;
        this.f53391b++;
    }

    public final boolean g(int i6) {
        i(this.f53391b + 1);
        int[] iArr = this.f53390a;
        int i10 = this.f53391b;
        iArr[i10] = i6;
        this.f53391b = i10 + 1;
        return true;
    }

    public final boolean h(int i6, int[] iArr) {
        int i10;
        p247y7.AbstractC7350t.f(iArr, "elements");
        if (i6 < 0 || i6 > (i10 = this.f53391b)) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i6 + " must be in 0.." + this.f53391b);
        }
        if (iArr.length == 0) {
            return false;
        }
        i(i10 + iArr.length);
        int[] iArr2 = this.f53390a;
        int i11 = this.f53391b;
        if (i6 != i11) {
            p097j7.AbstractC6872n.j(iArr2, iArr2, iArr.length + i6, i6, i11);
        }
        p097j7.AbstractC6872n.o(iArr, iArr2, i6, 0, 0, 12, null);
        this.f53391b += iArr.length;
        return true;
    }

    public final void i(int i6) {
        int[] iArr = this.f53390a;
        if (iArr.length < i6) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, java.lang.Math.max(i6, (iArr.length * 3) / 2));
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53390a = iArrCopyOf;
        }
    }

    public final void j(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "elements");
        h(this.f53391b, iArr);
    }

    public final boolean k(int i6) {
        int iC = c(i6);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final int l(int i6) {
        int i10;
        if (i6 < 0 || i6 >= (i10 = this.f53391b)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Index ");
            sb.append(i6);
            sb.append(" must be in 0..");
            sb.append(this.f53391b - 1);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int[] iArr = this.f53390a;
        int i11 = iArr[i6];
        if (i6 != i10 - 1) {
            p097j7.AbstractC6872n.j(iArr, iArr, i6, i6 + 1, i10);
        }
        this.f53391b--;
        return i11;
    }

    public final int m(int i6, int i10) {
        if (i6 >= 0 && i6 < this.f53391b) {
            int[] iArr = this.f53390a;
            int i11 = iArr[i6];
            iArr[i6] = i10;
            return i11;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("set index ");
        sb.append(i6);
        sb.append(" must be between 0 .. ");
        sb.append(this.f53391b - 1);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final void n() {
        int i6 = this.f53391b;
        if (i6 == 0) {
            return;
        }
        p097j7.AbstractC6872n.H(this.f53390a, 0, i6);
    }
}
