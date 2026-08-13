package p097j7;

/* JADX INFO: renamed from: j7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6871m extends p097j7.AbstractC6866h {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final p097j7.C6871m.a f49310F = new p097j7.C6871m.a(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.lang.Object[] f49311G = new java.lang.Object[0];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f49312C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f49313D = f49311G;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f49314E;

    /* JADX INFO: renamed from: j7.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private final int C(int i6) {
        return i6 == 0 ? p097j7.AbstractC6872n.e0(this.f49313D) : i6 - 1;
    }

    private final void D(int i6) {
        if (i6 < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.f49313D;
        if (i6 <= objArr.length) {
            return;
        }
        if (objArr == f49311G) {
            this.f49313D = new java.lang.Object[E7.j.d(i6, 10)];
        } else {
            s(p097j7.AbstractC6862d.f49298C.e(objArr.length, i6));
        }
    }

    private final int E(int i6) {
        if (i6 == p097j7.AbstractC6872n.e0(this.f49313D)) {
            return 0;
        }
        return i6 + 1;
    }

    private final int N(int i6) {
        return i6 < 0 ? i6 + this.f49313D.length : i6;
    }

    private final void O(int i6, int i10) {
        java.lang.Object[] objArr = this.f49313D;
        if (i6 < i10) {
            p097j7.AbstractC6872n.w(objArr, null, i6, i10);
        } else {
            p097j7.AbstractC6872n.w(objArr, null, i6, objArr.length);
            p097j7.AbstractC6872n.w(this.f49313D, null, 0, i10);
        }
    }

    private final int P(int i6) {
        java.lang.Object[] objArr = this.f49313D;
        return i6 >= objArr.length ? i6 - objArr.length : i6;
    }

    private final void Q() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void V(int i6, int i10) {
        int iP = P(this.f49312C + (i6 - 1));
        int iP2 = P(this.f49312C + (i10 - 1));
        while (i6 > 0) {
            int i11 = iP + 1;
            int iMin = java.lang.Math.min(i6, java.lang.Math.min(i11, iP2 + 1));
            java.lang.Object[] objArr = this.f49313D;
            int i12 = iP2 - iMin;
            int i13 = iP - iMin;
            p097j7.AbstractC6872n.l(objArr, objArr, i12 + 1, i13 + 1, i11);
            iP = N(i13);
            iP2 = N(i12);
            i6 -= iMin;
        }
    }

    private final void W(int i6, int i10) {
        int iP = P(this.f49312C + i10);
        int iP2 = P(this.f49312C + i6);
        int size = size();
        while (true) {
            size -= i10;
            if (size <= 0) {
                return;
            }
            java.lang.Object[] objArr = this.f49313D;
            i10 = java.lang.Math.min(size, java.lang.Math.min(objArr.length - iP, objArr.length - iP2));
            java.lang.Object[] objArr2 = this.f49313D;
            int i11 = iP + i10;
            p097j7.AbstractC6872n.l(objArr2, objArr2, iP2, iP, i11);
            iP = P(i11);
            iP2 = P(iP2 + i10);
        }
    }

    private final void o(int i6, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.f49313D.length;
        while (i6 < length && it.hasNext()) {
            this.f49313D[i6] = it.next();
            i6++;
        }
        int i10 = this.f49312C;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f49313D[i11] = it.next();
        }
        this.f49314E = size() + collection.size();
    }

    private final void s(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[i6];
        java.lang.Object[] objArr2 = this.f49313D;
        p097j7.AbstractC6872n.l(objArr2, objArr, 0, this.f49312C, objArr2.length);
        java.lang.Object[] objArr3 = this.f49313D;
        int length = objArr3.length;
        int i10 = this.f49312C;
        p097j7.AbstractC6872n.l(objArr3, objArr, length - i10, 0, i10);
        this.f49312C = 0;
        this.f49313D = objArr;
    }

    public final java.lang.Object M() {
        if (isEmpty()) {
            return null;
        }
        return this.f49313D[P(this.f49312C + p097j7.AbstractC6879v.o(this))];
    }

    public final java.lang.Object R() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        Q();
        java.lang.Object[] objArr = this.f49313D;
        int i6 = this.f49312C;
        java.lang.Object obj = objArr[i6];
        objArr[i6] = null;
        this.f49312C = E(i6);
        this.f49314E = size() - 1;
        return obj;
    }

    public final java.lang.Object S() {
        if (isEmpty()) {
            return null;
        }
        return R();
    }

    public final java.lang.Object T() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        Q();
        int iP = P(this.f49312C + p097j7.AbstractC6879v.o(this));
        java.lang.Object[] objArr = this.f49313D;
        java.lang.Object obj = objArr[iP];
        objArr[iP] = null;
        this.f49314E = size() - 1;
        return obj;
    }

    public final java.lang.Object U() {
        if (isEmpty()) {
            return null;
        }
        return T();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, java.lang.Object obj) {
        p097j7.AbstractC6862d.f49298C.c(i6, size());
        if (i6 == size()) {
            g(obj);
            return;
        }
        if (i6 == 0) {
            f(obj);
            return;
        }
        Q();
        D(size() + 1);
        int iP = P(this.f49312C + i6);
        if (i6 < ((size() + 1) >> 1)) {
            int iC = C(iP);
            int iC2 = C(this.f49312C);
            int i10 = this.f49312C;
            if (iC >= i10) {
                java.lang.Object[] objArr = this.f49313D;
                objArr[iC2] = objArr[i10];
                p097j7.AbstractC6872n.l(objArr, objArr, i10, i10 + 1, iC + 1);
            } else {
                java.lang.Object[] objArr2 = this.f49313D;
                p097j7.AbstractC6872n.l(objArr2, objArr2, i10 - 1, i10, objArr2.length);
                java.lang.Object[] objArr3 = this.f49313D;
                objArr3[objArr3.length - 1] = objArr3[0];
                p097j7.AbstractC6872n.l(objArr3, objArr3, 0, 1, iC + 1);
            }
            this.f49313D[iC] = obj;
            this.f49312C = iC2;
        } else {
            int iP2 = P(this.f49312C + size());
            java.lang.Object[] objArr4 = this.f49313D;
            if (iP < iP2) {
                p097j7.AbstractC6872n.l(objArr4, objArr4, iP + 1, iP, iP2);
            } else {
                p097j7.AbstractC6872n.l(objArr4, objArr4, 1, 0, iP2);
                java.lang.Object[] objArr5 = this.f49313D;
                objArr5[0] = objArr5[objArr5.length - 1];
                p097j7.AbstractC6872n.l(objArr5, objArr5, iP + 1, iP, objArr5.length - 1);
            }
            this.f49313D[iP] = obj;
        }
        this.f49314E = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        g(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        p097j7.AbstractC6862d.f49298C.c(i6, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i6 == size()) {
            return addAll(collection);
        }
        Q();
        D(size() + collection.size());
        int iP = P(this.f49312C + size());
        int iP2 = P(this.f49312C + i6);
        int size = collection.size();
        if (i6 < ((size() + 1) >> 1)) {
            int i10 = this.f49312C;
            int length = i10 - size;
            if (iP2 < i10) {
                java.lang.Object[] objArr = this.f49313D;
                p097j7.AbstractC6872n.l(objArr, objArr, length, i10, objArr.length);
                java.lang.Object[] objArr2 = this.f49313D;
                if (size >= iP2) {
                    p097j7.AbstractC6872n.l(objArr2, objArr2, objArr2.length - size, 0, iP2);
                } else {
                    p097j7.AbstractC6872n.l(objArr2, objArr2, objArr2.length - size, 0, size);
                    java.lang.Object[] objArr3 = this.f49313D;
                    p097j7.AbstractC6872n.l(objArr3, objArr3, 0, size, iP2);
                }
            } else if (length >= 0) {
                java.lang.Object[] objArr4 = this.f49313D;
                p097j7.AbstractC6872n.l(objArr4, objArr4, length, i10, iP2);
            } else {
                java.lang.Object[] objArr5 = this.f49313D;
                length += objArr5.length;
                int i11 = iP2 - i10;
                int length2 = objArr5.length - length;
                if (length2 >= i11) {
                    p097j7.AbstractC6872n.l(objArr5, objArr5, length, i10, iP2);
                } else {
                    p097j7.AbstractC6872n.l(objArr5, objArr5, length, i10, i10 + length2);
                    java.lang.Object[] objArr6 = this.f49313D;
                    p097j7.AbstractC6872n.l(objArr6, objArr6, 0, this.f49312C + length2, iP2);
                }
            }
            this.f49312C = length;
            o(N(iP2 - size), collection);
        } else {
            int length3 = iP2 + size;
            if (iP2 < iP) {
                int i12 = size + iP;
                java.lang.Object[] objArr7 = this.f49313D;
                if (i12 <= objArr7.length) {
                    p097j7.AbstractC6872n.l(objArr7, objArr7, length3, iP2, iP);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    p097j7.AbstractC6872n.l(objArr7, objArr7, length3, iP2, iP);
                } else {
                    int length4 = iP - (i12 - objArr7.length);
                    p097j7.AbstractC6872n.l(objArr7, objArr7, 0, length4, iP);
                    java.lang.Object[] objArr8 = this.f49313D;
                    p097j7.AbstractC6872n.l(objArr8, objArr8, length3, iP2, length4);
                }
            } else {
                java.lang.Object[] objArr9 = this.f49313D;
                p097j7.AbstractC6872n.l(objArr9, objArr9, size, 0, iP);
                java.lang.Object[] objArr10 = this.f49313D;
                if (length3 >= objArr10.length) {
                    p097j7.AbstractC6872n.l(objArr10, objArr10, length3 - objArr10.length, iP2, objArr10.length);
                } else {
                    p097j7.AbstractC6872n.l(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    java.lang.Object[] objArr11 = this.f49313D;
                    p097j7.AbstractC6872n.l(objArr11, objArr11, length3, iP2, objArr11.length - size);
                }
            }
            o(iP2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        Q();
        D(size() + collection.size());
        o(P(this.f49312C + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            Q();
            O(this.f49312C, P(this.f49312C + size()));
        }
        this.f49312C = 0;
        this.f49314E = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p097j7.AbstractC6866h
    public int d() {
        return this.f49314E;
    }

    @Override // p097j7.AbstractC6866h
    public java.lang.Object e(int i6) {
        p097j7.AbstractC6862d.f49298C.b(i6, size());
        if (i6 == p097j7.AbstractC6879v.o(this)) {
            return T();
        }
        if (i6 == 0) {
            return R();
        }
        Q();
        int iP = P(this.f49312C + i6);
        java.lang.Object obj = this.f49313D[iP];
        if (i6 < (size() >> 1)) {
            int i10 = this.f49312C;
            if (iP >= i10) {
                java.lang.Object[] objArr = this.f49313D;
                p097j7.AbstractC6872n.l(objArr, objArr, i10 + 1, i10, iP);
            } else {
                java.lang.Object[] objArr2 = this.f49313D;
                p097j7.AbstractC6872n.l(objArr2, objArr2, 1, 0, iP);
                java.lang.Object[] objArr3 = this.f49313D;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i11 = this.f49312C;
                p097j7.AbstractC6872n.l(objArr3, objArr3, i11 + 1, i11, objArr3.length - 1);
            }
            java.lang.Object[] objArr4 = this.f49313D;
            int i12 = this.f49312C;
            objArr4[i12] = null;
            this.f49312C = E(i12);
        } else {
            int iP2 = P(this.f49312C + p097j7.AbstractC6879v.o(this));
            java.lang.Object[] objArr5 = this.f49313D;
            if (iP <= iP2) {
                p097j7.AbstractC6872n.l(objArr5, objArr5, iP, iP + 1, iP2 + 1);
            } else {
                p097j7.AbstractC6872n.l(objArr5, objArr5, iP, iP + 1, objArr5.length);
                java.lang.Object[] objArr6 = this.f49313D;
                objArr6[objArr6.length - 1] = objArr6[0];
                p097j7.AbstractC6872n.l(objArr6, objArr6, 0, 1, iP2 + 1);
            }
            this.f49313D[iP2] = null;
        }
        this.f49314E = size() - 1;
        return obj;
    }

    public final void f(java.lang.Object obj) {
        Q();
        D(size() + 1);
        int iC = C(this.f49312C);
        this.f49312C = iC;
        this.f49313D[iC] = obj;
        this.f49314E = size() + 1;
    }

    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f49313D[this.f49312C];
    }

    public final void g(java.lang.Object obj) {
        Q();
        D(size() + 1);
        this.f49313D[P(this.f49312C + size())] = obj;
        this.f49314E = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i6) {
        p097j7.AbstractC6862d.f49298C.b(i6, size());
        return this.f49313D[P(this.f49312C + i6)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        int iP = P(this.f49312C + size());
        int length = this.f49312C;
        if (length < iP) {
            while (length < iP) {
                if (!p247y7.AbstractC7350t.b(obj, this.f49313D[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.f49313D.length;
        while (length < length2) {
            if (!p247y7.AbstractC7350t.b(obj, this.f49313D[length])) {
                length++;
            }
        }
        for (int i6 = 0; i6 < iP; i6++) {
            if (p247y7.AbstractC7350t.b(obj, this.f49313D[i6])) {
                length = i6 + this.f49313D.length;
            }
        }
        return -1;
        return length - this.f49312C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f49313D[P(this.f49312C + p097j7.AbstractC6879v.o(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int iE0;
        int iP = P(this.f49312C + size());
        int i6 = this.f49312C;
        if (i6 < iP) {
            iE0 = iP - 1;
            if (i6 <= iE0) {
                while (!p247y7.AbstractC7350t.b(obj, this.f49313D[iE0])) {
                    if (iE0 != i6) {
                        iE0--;
                    }
                }
                return iE0 - this.f49312C;
            }
            return -1;
        }
        if (i6 > iP) {
            for (int i10 = iP - 1; -1 < i10; i10--) {
                if (p247y7.AbstractC7350t.b(obj, this.f49313D[i10])) {
                    iE0 = i10 + this.f49313D.length;
                    return iE0 - this.f49312C;
                }
            }
            iE0 = p097j7.AbstractC6872n.e0(this.f49313D);
            int i11 = this.f49312C;
            if (i11 <= iE0) {
                while (!p247y7.AbstractC7350t.b(obj, this.f49313D[iE0])) {
                    if (iE0 != i11) {
                        iE0--;
                    }
                }
                return iE0 - this.f49312C;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        int iP;
        p247y7.AbstractC7350t.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f49313D.length != 0) {
            int iP2 = P(this.f49312C + size());
            int i6 = this.f49312C;
            if (i6 < iP2) {
                iP = i6;
                while (i6 < iP2) {
                    java.lang.Object obj = this.f49313D[i6];
                    if (!collection.contains(obj)) {
                        this.f49313D[iP] = obj;
                        iP++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                p097j7.AbstractC6872n.w(this.f49313D, null, iP, iP2);
            } else {
                int length = this.f49313D.length;
                boolean z10 = false;
                int i10 = i6;
                while (i6 < length) {
                    java.lang.Object[] objArr = this.f49313D;
                    java.lang.Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (!collection.contains(obj2)) {
                        this.f49313D[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i6++;
                }
                iP = P(i10);
                for (int i11 = 0; i11 < iP2; i11++) {
                    java.lang.Object[] objArr2 = this.f49313D;
                    java.lang.Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!collection.contains(obj3)) {
                        this.f49313D[iP] = obj3;
                        iP = E(iP);
                    } else {
                        z10 = true;
                    }
                }
                z6 = z10;
            }
            if (z6) {
                Q();
                this.f49314E = N(iP - this.f49312C);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i6, int i10) {
        p097j7.AbstractC6862d.f49298C.d(i6, i10, size());
        int i11 = i10 - i6;
        if (i11 == 0) {
            return;
        }
        if (i11 == size()) {
            clear();
            return;
        }
        if (i11 == 1) {
            remove(i6);
            return;
        }
        Q();
        if (i6 < size() - i10) {
            V(i6, i10);
            int iP = P(this.f49312C + i11);
            O(this.f49312C, iP);
            this.f49312C = iP;
        } else {
            W(i6, i10);
            int iP2 = P(this.f49312C + size());
            O(N(iP2 - i11), iP2);
        }
        this.f49314E = size() - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection collection) {
        int iP;
        p247y7.AbstractC7350t.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f49313D.length != 0) {
            int iP2 = P(this.f49312C + size());
            int i6 = this.f49312C;
            if (i6 < iP2) {
                iP = i6;
                while (i6 < iP2) {
                    java.lang.Object obj = this.f49313D[i6];
                    if (collection.contains(obj)) {
                        this.f49313D[iP] = obj;
                        iP++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                p097j7.AbstractC6872n.w(this.f49313D, null, iP, iP2);
            } else {
                int length = this.f49313D.length;
                boolean z10 = false;
                int i10 = i6;
                while (i6 < length) {
                    java.lang.Object[] objArr = this.f49313D;
                    java.lang.Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (collection.contains(obj2)) {
                        this.f49313D[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i6++;
                }
                iP = P(i10);
                for (int i11 = 0; i11 < iP2; i11++) {
                    java.lang.Object[] objArr2 = this.f49313D;
                    java.lang.Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f49313D[iP] = obj3;
                        iP = E(iP);
                    } else {
                        z10 = true;
                    }
                }
                z6 = z10;
            }
            if (z6) {
                Q();
                this.f49314E = N(iP - this.f49312C);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        p097j7.AbstractC6862d.f49298C.b(i6, size());
        int iP = P(this.f49312C + i6);
        java.lang.Object[] objArr = this.f49313D;
        java.lang.Object obj2 = objArr[iP];
        objArr[iP] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        if (objArr.length < size()) {
            objArr = p097j7.AbstractC6873o.a(objArr, size());
        }
        int iP = P(this.f49312C + size());
        int i6 = this.f49312C;
        if (i6 < iP) {
            p097j7.AbstractC6872n.p(this.f49313D, objArr, 0, i6, iP, 2, null);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.f49313D;
            p097j7.AbstractC6872n.l(objArr2, objArr, 0, this.f49312C, objArr2.length);
            java.lang.Object[] objArr3 = this.f49313D;
            p097j7.AbstractC6872n.l(objArr3, objArr, objArr3.length - this.f49312C, 0, iP);
        }
        return p097j7.AbstractC6879v.f(size(), objArr);
    }
}
