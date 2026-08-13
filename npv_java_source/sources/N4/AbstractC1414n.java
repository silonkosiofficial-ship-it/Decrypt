package N4;

/* JADX INFO: renamed from: N4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1414n extends java.util.AbstractCollection implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final java.lang.Object[] f7755C = new java.lang.Object[0];

    /* JADX INFO: renamed from: N4.n$a */
    static abstract class a extends N4.AbstractC1414n.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.Object[] f7756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7758c;

        a(int i6) {
            N4.AbstractC1407g.b(i6, "initialCapacity");
            this.f7756a = new java.lang.Object[i6];
            this.f7757b = 0;
        }

        private void d(int i6) {
            java.lang.Object[] objArr = this.f7756a;
            if (objArr.length < i6) {
                this.f7756a = java.util.Arrays.copyOf(objArr, N4.AbstractC1414n.b.a(objArr.length, i6));
            } else if (!this.f7758c) {
                return;
            } else {
                this.f7756a = (java.lang.Object[]) objArr.clone();
            }
            this.f7758c = false;
        }

        public N4.AbstractC1414n.b b(java.lang.Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        final void c(java.lang.Object[] objArr, int i6) {
            N4.F.c(objArr, i6);
            d(this.f7757b + i6);
            java.lang.System.arraycopy(objArr, 0, this.f7756a, this.f7757b, i6);
            this.f7757b += i6;
        }
    }

    /* JADX INFO: renamed from: N4.n$b */
    public static abstract class b {
        b() {
        }

        static int a(int i6, int i10) {
            if (i10 < 0) {
                throw new java.lang.AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i6 + (i6 >> 1) + 1;
            if (iHighestOneBit < i10) {
                iHighestOneBit = java.lang.Integer.highestOneBit(i10 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    AbstractC1414n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(java.lang.Object obj);

    abstract int d(java.lang.Object[] objArr, int i6);

    java.lang.Object[] e() {
        return null;
    }

    int f() {
        throw new java.lang.UnsupportedOperationException();
    }

    int g() {
        throw new java.lang.UnsupportedOperationException();
    }

    abstract boolean n();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(f7755C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        M4.h.i(objArr);
        int size = size();
        if (objArr.length < size) {
            java.lang.Object[] objArrE = e();
            if (objArrE != null) {
                return N4.H.a(objArrE, g(), f(), objArr);
            }
            objArr = N4.F.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
