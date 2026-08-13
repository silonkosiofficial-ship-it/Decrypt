package p042e1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p042e1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Object[] f44576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44577b;

    public g(int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
        }
        this.f44576a = new java.lang.Object[i6];
    }

    @Override // p042e1.f
    public boolean a(java.lang.Object obj) {
        int i6 = this.f44577b;
        java.lang.Object[] objArr = this.f44576a;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f44577b = i6 + 1;
        return true;
    }

    @Override // p042e1.f
    public java.lang.Object b() {
        int i6 = this.f44577b;
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        java.lang.Object[] objArr = this.f44576a;
        java.lang.Object obj = objArr[i10];
        objArr[i10] = null;
        this.f44577b = i6 - 1;
        return obj;
    }

    @Override // p042e1.f
    public void c(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "variables");
        if (i6 > objArr.length) {
            i6 = objArr.length;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            java.lang.Object obj = objArr[i10];
            int i11 = this.f44577b;
            java.lang.Object[] objArr2 = this.f44576a;
            if (i11 < objArr2.length) {
                objArr2[i11] = obj;
                this.f44577b = i11 + 1;
            }
        }
    }
}
