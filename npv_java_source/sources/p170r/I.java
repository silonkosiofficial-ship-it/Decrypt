package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p170r.P {
    public I(int i6) {
        super(i6, null);
    }

    public /* synthetic */ I(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 16 : i6);
    }

    public final boolean g(java.lang.Object obj) {
        i(this.f53323b + 1);
        java.lang.Object[] objArr = this.f53322a;
        int i6 = this.f53323b;
        objArr[i6] = obj;
        this.f53323b = i6 + 1;
        return true;
    }

    public final void h() {
        p097j7.AbstractC6872n.w(this.f53322a, null, 0, this.f53323b);
        this.f53323b = 0;
    }

    public final void i(int i6) {
        java.lang.Object[] objArr = this.f53322a;
        if (objArr.length < i6) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, java.lang.Math.max(i6, (objArr.length * 3) / 2));
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53322a = objArrCopyOf;
        }
    }
}
