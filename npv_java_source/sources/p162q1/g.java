package p162q1;

/* JADX INFO: loaded from: classes.dex */
class g implements p162q1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f52979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52980b;

    g(int i6) {
        if (i6 <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
        }
        this.f52979a = new java.lang.Object[i6];
    }

    @Override // p162q1.f
    public boolean a(java.lang.Object obj) {
        int i6 = this.f52980b;
        java.lang.Object[] objArr = this.f52979a;
        if (i6 >= objArr.length) {
            return false;
        }
        objArr[i6] = obj;
        this.f52980b = i6 + 1;
        return true;
    }

    @Override // p162q1.f
    public java.lang.Object b() {
        int i6 = this.f52980b;
        if (i6 <= 0) {
            return null;
        }
        int i10 = i6 - 1;
        java.lang.Object[] objArr = this.f52979a;
        java.lang.Object obj = objArr[i10];
        objArr[i10] = null;
        this.f52980b = i6 - 1;
        return obj;
    }

    @Override // p162q1.f
    public void c(java.lang.Object[] objArr, int i6) {
        if (i6 > objArr.length) {
            i6 = objArr.length;
        }
        for (int i10 = 0; i10 < i6; i10++) {
            java.lang.Object obj = objArr[i10];
            int i11 = this.f52980b;
            java.lang.Object[] objArr2 = this.f52979a;
            if (i11 < objArr2.length) {
                objArr2[i11] = obj;
                this.f52980b = i11 + 1;
            }
        }
    }
}
