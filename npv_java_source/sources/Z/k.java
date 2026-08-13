package Z;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Z.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f16657E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.lang.Object[] f16658F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f16659G;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(java.lang.Object[] objArr, int i6, int i10, int i11) {
        super(i6, i10);
        this.f16657E = i11;
        java.lang.Object[] objArr2 = new java.lang.Object[i11];
        this.f16658F = objArr2;
        ?? r6 = i6 == i10 ? 1 : 0;
        this.f16659G = r6;
        objArr2[0] = objArr;
        l(i6 - r6, 1);
    }

    private final java.lang.Object k() {
        int iD = d() & 31;
        java.lang.Object obj = this.f16658F[this.f16657E - 1];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((java.lang.Object[]) obj)[iD];
    }

    private final void l(int i6, int i10) {
        int i11 = (this.f16657E - i10) * 5;
        while (i10 < this.f16657E) {
            java.lang.Object[] objArr = this.f16658F;
            java.lang.Object obj = objArr[i10 - 1];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i10] = ((java.lang.Object[]) obj)[Z.l.a(i6, i11)];
            i11 -= 5;
            i10++;
        }
    }

    private final void m(int i6) {
        int i10 = 0;
        while (Z.l.a(d(), i10) == i6) {
            i10 += 5;
        }
        if (i10 > 0) {
            l(d(), ((this.f16657E - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object objK = k();
        f(d() + 1);
        if (d() == e()) {
            this.f16659G = true;
            return objK;
        }
        m(0);
        return objK;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void o(java.lang.Object[] objArr, int i6, int i10, int i11) {
        f(i6);
        h(i10);
        this.f16657E = i11;
        if (this.f16658F.length < i11) {
            this.f16658F = new java.lang.Object[i11];
        }
        this.f16658F[0] = objArr;
        ?? r6 = i6 == i10 ? 1 : 0;
        this.f16659G = r6;
        l(i6 - r6, 1);
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        f(d() - 1);
        if (this.f16659G) {
            this.f16659G = false;
        } else {
            m(31);
        }
        return k();
    }
}
