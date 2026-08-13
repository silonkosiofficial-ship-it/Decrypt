package N4;

/* JADX INFO: loaded from: classes3.dex */
class I extends N4.AbstractC1415o {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final N4.AbstractC1415o f7686G = new N4.I(new java.lang.Object[0], 0);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object[] f7687E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient int f7688F;

    I(java.lang.Object[] objArr, int i6) {
        this.f7687E = objArr;
        this.f7688F = i6;
    }

    @Override // N4.AbstractC1415o, N4.AbstractC1414n
    int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f7687E, 0, objArr, i6, this.f7688F);
        return i6 + this.f7688F;
    }

    @Override // N4.AbstractC1414n
    java.lang.Object[] e() {
        return this.f7687E;
    }

    @Override // N4.AbstractC1414n
    int f() {
        return this.f7688F;
    }

    @Override // N4.AbstractC1414n
    int g() {
        return 0;
    }

    @Override // java.util.List
    public java.lang.Object get(int i6) {
        M4.h.g(i6, this.f7688F);
        java.lang.Object obj = this.f7687E[i6];
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    @Override // N4.AbstractC1414n
    boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7688F;
    }
}
