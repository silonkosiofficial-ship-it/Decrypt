package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class M0 extends p055f4.J0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final java.lang.Object[] f45058J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final p055f4.M0 f45059K;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final transient java.lang.Object[] f45060E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final transient int f45061F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final transient java.lang.Object[] f45062G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final transient int f45063H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final transient int f45064I;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f45058J = objArr;
        f45059K = new p055f4.M0(objArr, 0, objArr, 0, 0);
    }

    M0(java.lang.Object[] objArr, int i6, java.lang.Object[] objArr2, int i10, int i11) {
        this.f45060E = objArr;
        this.f45061F = i6;
        this.f45062G = objArr2;
        this.f45063H = i10;
        this.f45064I = i11;
    }

    @Override // p055f4.J0
    final boolean D() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.f45062G;
            if (objArr.length != 0) {
                int iA = p055f4.D0.a(obj.hashCode());
                while (true) {
                    int i6 = iA & this.f45063H;
                    java.lang.Object obj2 = objArr[i6];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i6 + 1;
                }
            }
        }
        return false;
    }

    @Override // p055f4.F0
    final int d(java.lang.Object[] objArr, int i6) {
        java.lang.System.arraycopy(this.f45060E, 0, objArr, 0, this.f45064I);
        return this.f45064I;
    }

    @Override // p055f4.F0
    final int e() {
        return this.f45064I;
    }

    @Override // p055f4.F0
    final int f() {
        return 0;
    }

    @Override // p055f4.F0
    final java.lang.Object[] g() {
        return this.f45060E;
    }

    @Override // p055f4.J0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f45061F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // p055f4.J0
    final p055f4.I0 s() {
        return p055f4.I0.o(this.f45060E, this.f45064I);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f45064I;
    }
}
