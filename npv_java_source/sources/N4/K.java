package N4;

/* JADX INFO: loaded from: classes3.dex */
final class K extends N4.r {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final java.lang.Object[] f7703J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final N4.K f7704K;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object[] f7705E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient int f7706F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient java.lang.Object[] f7707G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f7708H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final transient int f7709I;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f7703J = objArr;
        f7704K = new N4.K(objArr, 0, objArr, 0, 0);
    }

    K(java.lang.Object[] objArr, int i6, java.lang.Object[] objArr2, int i10, int i11) {
        this.f7705E = objArr;
        this.f7706F = i6;
        this.f7707G = objArr2;
        this.f7708H = i10;
        this.f7709I = i11;
    }

    @Override // N4.r
    N4.AbstractC1415o D() {
        return N4.AbstractC1415o.s(this.f7705E, this.f7709I);
    }

    @Override // N4.r
    boolean E() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public N4.S iterator() {
        return o().iterator();
    }

    @Override // N4.AbstractC1414n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f7707G;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = N4.AbstractC1413m.c(obj);
        while (true) {
            int i6 = iC & this.f7708H;
            java.lang.Object obj2 = objArr[i6];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i6 + 1;
        }
    }

    @Override // N4.AbstractC1414n
    int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f7705E, 0, objArr, i6, this.f7709I);
        return i6 + this.f7709I;
    }

    @Override // N4.AbstractC1414n
    java.lang.Object[] e() {
        return this.f7705E;
    }

    @Override // N4.AbstractC1414n
    int f() {
        return this.f7709I;
    }

    @Override // N4.AbstractC1414n
    int g() {
        return 0;
    }

    @Override // N4.r, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7706F;
    }

    @Override // N4.AbstractC1414n
    boolean n() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7709I;
    }
}
