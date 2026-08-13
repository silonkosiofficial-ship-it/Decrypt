package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends androidx.datastore.preferences.protobuf.AbstractC2043c implements java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final androidx.datastore.preferences.protobuf.b0 f21977F;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f21978D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f21979E;

    static {
        androidx.datastore.preferences.protobuf.b0 b0Var = new androidx.datastore.preferences.protobuf.b0(new java.lang.Object[0], 0);
        f21977F = b0Var;
        b0Var.q();
    }

    private b0(java.lang.Object[] objArr, int i6) {
        this.f21978D = objArr;
        this.f21979E = i6;
    }

    private static java.lang.Object[] e(int i6) {
        return new java.lang.Object[i6];
    }

    public static androidx.datastore.preferences.protobuf.b0 f() {
        return f21977F;
    }

    private void g(int i6) {
        if (i6 < 0 || i6 >= this.f21979E) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
    }

    private java.lang.String n(int i6) {
        return "Index:" + i6 + ", Size:" + this.f21979E;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, java.lang.Object obj) {
        int i10;
        d();
        if (i6 < 0 || i6 > (i10 = this.f21979E)) {
            throw new java.lang.IndexOutOfBoundsException(n(i6));
        }
        java.lang.Object[] objArr = this.f21978D;
        if (i10 < objArr.length) {
            java.lang.System.arraycopy(objArr, i6, objArr, i6 + 1, i10 - i6);
        } else {
            java.lang.Object[] objArrE = e(((i10 * 3) / 2) + 1);
            java.lang.System.arraycopy(this.f21978D, 0, objArrE, 0, i6);
            java.lang.System.arraycopy(this.f21978D, i6, objArrE, i6 + 1, this.f21979E - i6);
            this.f21978D = objArrE;
        }
        this.f21978D[i6] = obj;
        this.f21979E++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        d();
        int i6 = this.f21979E;
        java.lang.Object[] objArr = this.f21978D;
        if (i6 == objArr.length) {
            this.f21978D = java.util.Arrays.copyOf(objArr, ((i6 * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.f21978D;
        int i10 = this.f21979E;
        this.f21979E = i10 + 1;
        objArr2[i10] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i6) {
        g(i6);
        return this.f21978D[i6];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2064y.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.preferences.protobuf.b0 u(int i6) {
        if (i6 >= this.f21979E) {
            return new androidx.datastore.preferences.protobuf.b0(java.util.Arrays.copyOf(this.f21978D, i6), this.f21979E);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2043c, java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i6) {
        d();
        g(i6);
        java.lang.Object[] objArr = this.f21978D;
        java.lang.Object obj = objArr[i6];
        int i10 = this.f21979E;
        if (i6 < i10 - 1) {
            java.lang.System.arraycopy(objArr, i6 + 1, objArr, i6, (i10 - i6) - 1);
        }
        this.f21979E--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        d();
        g(i6);
        java.lang.Object[] objArr = this.f21978D;
        java.lang.Object obj2 = objArr[i6];
        objArr[i6] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f21979E;
    }
}
