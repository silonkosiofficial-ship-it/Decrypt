package X;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.RandomAccess {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f15549F = 8;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f15550C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.List f15551D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f15552E;

    private static final class a implements java.util.List, p256z7.d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final X.b f15553C;

        public a(X.b bVar) {
            this.f15553C = bVar;
        }

        @Override // java.util.List
        public void add(int i6, java.lang.Object obj) {
            this.f15553C.a(i6, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(java.lang.Object obj) {
            return this.f15553C.d(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i6, java.util.Collection collection) {
            return this.f15553C.f(i6, collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            return this.f15553C.h(collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f15553C.j();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return this.f15553C.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            return this.f15553C.n(collection);
        }

        public int d() {
            return this.f15553C.t();
        }

        public java.lang.Object e(int i6) {
            X.c.c(this, i6);
            return this.f15553C.D(i6);
        }

        @Override // java.util.List
        public java.lang.Object get(int i6) {
            X.c.c(this, i6);
            return this.f15553C.s()[i6];
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object obj) {
            return this.f15553C.v(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f15553C.w();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return new X.b.c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            return this.f15553C.z(obj);
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator() {
            return new X.b.c(this, 0);
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator(int i6) {
            return new X.b.c(this, i6);
        }

        @Override // java.util.List
        public final /* bridge */ java.lang.Object remove(int i6) {
            return e(i6);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            return this.f15553C.A(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            return this.f15553C.C(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            return this.f15553C.H(collection);
        }

        @Override // java.util.List
        public java.lang.Object set(int i6, java.lang.Object obj) {
            X.c.c(this, i6);
            return this.f15553C.J(i6, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public java.util.List subList(int i6, int i10) {
            X.c.d(this, i6, i10);
            return new X.b.C0295b(this, i6, i10);
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
            return p247y7.AbstractC7341j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            return p247y7.AbstractC7341j.b(this, objArr);
        }
    }

    /* JADX INFO: renamed from: X.b$b, reason: collision with other inner class name */
    private static final class C0295b implements java.util.List, p256z7.d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.List f15554C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f15555D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f15556E;

        public C0295b(java.util.List list, int i6, int i10) {
            this.f15554C = list;
            this.f15555D = i6;
            this.f15556E = i10;
        }

        @Override // java.util.List
        public void add(int i6, java.lang.Object obj) {
            this.f15554C.add(i6 + this.f15555D, obj);
            this.f15556E++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(java.lang.Object obj) {
            java.util.List list = this.f15554C;
            int i6 = this.f15556E;
            this.f15556E = i6 + 1;
            list.add(i6, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i6, java.util.Collection collection) {
            this.f15554C.addAll(i6 + this.f15555D, collection);
            this.f15556E += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            this.f15554C.addAll(this.f15556E, collection);
            this.f15556E += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i6 = this.f15556E - 1;
            int i10 = this.f15555D;
            if (i10 <= i6) {
                while (true) {
                    this.f15554C.remove(i6);
                    if (i6 == i10) {
                        break;
                    } else {
                        i6--;
                    }
                }
            }
            this.f15556E = this.f15555D;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            int i6 = this.f15556E;
            for (int i10 = this.f15555D; i10 < i6; i10++) {
                if (p247y7.AbstractC7350t.b(this.f15554C.get(i10), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return this.f15556E - this.f15555D;
        }

        public java.lang.Object e(int i6) {
            X.c.c(this, i6);
            java.lang.Object objRemove = this.f15554C.remove(i6 + this.f15555D);
            this.f15556E--;
            return objRemove;
        }

        @Override // java.util.List
        public java.lang.Object get(int i6) {
            X.c.c(this, i6);
            return this.f15554C.get(i6 + this.f15555D);
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object obj) {
            int i6 = this.f15556E;
            for (int i10 = this.f15555D; i10 < i6; i10++) {
                if (p247y7.AbstractC7350t.b(this.f15554C.get(i10), obj)) {
                    return i10 - this.f15555D;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f15556E == this.f15555D;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return new X.b.c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object obj) {
            int i6 = this.f15556E - 1;
            int i10 = this.f15555D;
            if (i10 > i6) {
                return -1;
            }
            while (!p247y7.AbstractC7350t.b(this.f15554C.get(i6), obj)) {
                if (i6 == i10) {
                    return -1;
                }
                i6--;
            }
            return i6 - this.f15555D;
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator() {
            return new X.b.c(this, 0);
        }

        @Override // java.util.List
        public java.util.ListIterator listIterator(int i6) {
            return new X.b.c(this, i6);
        }

        @Override // java.util.List
        public final /* bridge */ java.lang.Object remove(int i6) {
            return e(i6);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            int i6 = this.f15556E;
            for (int i10 = this.f15555D; i10 < i6; i10++) {
                if (p247y7.AbstractC7350t.b(this.f15554C.get(i10), obj)) {
                    this.f15554C.remove(i10);
                    this.f15556E--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            int i6 = this.f15556E;
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i6 != this.f15556E;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            int i6 = this.f15556E;
            int i10 = i6 - 1;
            int i11 = this.f15555D;
            if (i11 <= i10) {
                while (true) {
                    if (!collection.contains(this.f15554C.get(i10))) {
                        this.f15554C.remove(i10);
                        this.f15556E--;
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            return i6 != this.f15556E;
        }

        @Override // java.util.List
        public java.lang.Object set(int i6, java.lang.Object obj) {
            X.c.c(this, i6);
            return this.f15554C.set(i6 + this.f15555D, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.List
        public java.util.List subList(int i6, int i10) {
            X.c.d(this, i6, i10);
            return new X.b.C0295b(this, i6, i10);
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray() {
            return p247y7.AbstractC7341j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            return p247y7.AbstractC7341j.b(this, objArr);
        }
    }

    private static final class c implements java.util.ListIterator, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.util.List f15557C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f15558D;

        public c(java.util.List list, int i6) {
            this.f15557C = list;
            this.f15558D = i6;
        }

        @Override // java.util.ListIterator
        public void add(java.lang.Object obj) {
            this.f15557C.add(this.f15558D, obj);
            this.f15558D++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f15558D < this.f15557C.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f15558D > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public java.lang.Object next() {
            java.util.List list = this.f15557C;
            int i6 = this.f15558D;
            this.f15558D = i6 + 1;
            return list.get(i6);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f15558D;
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
            int i6 = this.f15558D - 1;
            this.f15558D = i6;
            return this.f15557C.get(i6);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f15558D - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i6 = this.f15558D - 1;
            this.f15558D = i6;
            this.f15557C.remove(i6);
        }

        @Override // java.util.ListIterator
        public void set(java.lang.Object obj) {
            this.f15557C.set(this.f15558D, obj);
        }
    }

    public b(java.lang.Object[] objArr, int i6) {
        this.f15550C = objArr;
        this.f15552E = i6;
    }

    public final boolean A(java.lang.Object obj) {
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        D(iV);
        return true;
    }

    public final boolean C(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i6 = this.f15552E;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            A(it.next());
        }
        return i6 != this.f15552E;
    }

    public final java.lang.Object D(int i6) {
        java.lang.Object[] objArr = this.f15550C;
        java.lang.Object obj = objArr[i6];
        if (i6 != t() - 1) {
            p097j7.AbstractC6872n.l(objArr, objArr, i6, i6 + 1, this.f15552E);
        }
        int i10 = this.f15552E - 1;
        this.f15552E = i10;
        objArr[i10] = null;
        return obj;
    }

    public final void E(int i6, int i10) {
        if (i10 > i6) {
            int i11 = this.f15552E;
            if (i10 < i11) {
                java.lang.Object[] objArr = this.f15550C;
                p097j7.AbstractC6872n.l(objArr, objArr, i6, i10, i11);
            }
            int i12 = this.f15552E - (i10 - i6);
            int iT = t() - 1;
            if (i12 <= iT) {
                int i13 = i12;
                while (true) {
                    this.f15550C[i13] = null;
                    if (i13 == iT) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f15552E = i12;
        }
    }

    public final boolean H(java.util.Collection collection) {
        int i6 = this.f15552E;
        for (int iT = t() - 1; -1 < iT; iT--) {
            if (!collection.contains(s()[iT])) {
                D(iT);
            }
        }
        return i6 != this.f15552E;
    }

    public final java.lang.Object J(int i6, java.lang.Object obj) {
        java.lang.Object[] objArr = this.f15550C;
        java.lang.Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final void M(int i6) {
        this.f15552E = i6;
    }

    public final void N(java.util.Comparator comparator) {
        p097j7.AbstractC6872n.L(this.f15550C, comparator, 0, this.f15552E);
    }

    public final void a(int i6, java.lang.Object obj) {
        o(this.f15552E + 1);
        java.lang.Object[] objArr = this.f15550C;
        int i10 = this.f15552E;
        if (i6 != i10) {
            p097j7.AbstractC6872n.l(objArr, objArr, i6 + 1, i6, i10);
        }
        objArr[i6] = obj;
        this.f15552E++;
    }

    public final boolean d(java.lang.Object obj) {
        o(this.f15552E + 1);
        java.lang.Object[] objArr = this.f15550C;
        int i6 = this.f15552E;
        objArr[i6] = obj;
        this.f15552E = i6 + 1;
        return true;
    }

    public final boolean e(int i6, X.b bVar) {
        if (bVar.w()) {
            return false;
        }
        o(this.f15552E + bVar.f15552E);
        java.lang.Object[] objArr = this.f15550C;
        int i10 = this.f15552E;
        if (i6 != i10) {
            p097j7.AbstractC6872n.l(objArr, objArr, bVar.f15552E + i6, i6, i10);
        }
        p097j7.AbstractC6872n.l(bVar.f15550C, objArr, i6, 0, bVar.f15552E);
        this.f15552E += bVar.f15552E;
        return true;
    }

    public final boolean f(int i6, java.util.Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        o(this.f15552E + collection.size());
        java.lang.Object[] objArr = this.f15550C;
        if (i6 != this.f15552E) {
            p097j7.AbstractC6872n.l(objArr, objArr, collection.size() + i6, i6, this.f15552E);
        }
        for (java.lang.Object obj : collection) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p097j7.AbstractC6879v.w();
            }
            objArr[i10 + i6] = obj;
            i10 = i11;
        }
        this.f15552E += collection.size();
        return true;
    }

    public final boolean g(int i6, java.util.List list) {
        if (list.isEmpty()) {
            return false;
        }
        o(this.f15552E + list.size());
        java.lang.Object[] objArr = this.f15550C;
        if (i6 != this.f15552E) {
            p097j7.AbstractC6872n.l(objArr, objArr, list.size() + i6, i6, this.f15552E);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i6 + i10] = list.get(i10);
        }
        this.f15552E += list.size();
        return true;
    }

    public final boolean h(java.util.Collection collection) {
        return f(this.f15552E, collection);
    }

    public final java.util.List i() {
        java.util.List list = this.f15551D;
        if (list != null) {
            return list;
        }
        X.b.a aVar = new X.b.a(this);
        this.f15551D = aVar;
        return aVar;
    }

    public final void j() {
        java.lang.Object[] objArr = this.f15550C;
        int iT = t();
        while (true) {
            iT--;
            if (-1 >= iT) {
                this.f15552E = 0;
                return;
            }
            objArr[iT] = null;
        }
    }

    public final boolean l(java.lang.Object obj) {
        int iT = t() - 1;
        if (iT >= 0) {
            for (int i6 = 0; !p247y7.AbstractC7350t.b(s()[i6], obj); i6++) {
                if (i6 != iT) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean n(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void o(int i6) {
        java.lang.Object[] objArr = this.f15550C;
        if (objArr.length < i6) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, java.lang.Math.max(i6, objArr.length * 2));
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15550C = objArrCopyOf;
        }
    }

    public final java.lang.Object p() {
        if (w()) {
            throw new java.util.NoSuchElementException("MutableVector is empty.");
        }
        return s()[0];
    }

    public final java.lang.Object[] s() {
        return this.f15550C;
    }

    public final int t() {
        return this.f15552E;
    }

    public final int v(java.lang.Object obj) {
        int i6 = this.f15552E;
        if (i6 <= 0) {
            return -1;
        }
        java.lang.Object[] objArr = this.f15550C;
        int i10 = 0;
        while (!p247y7.AbstractC7350t.b(obj, objArr[i10])) {
            i10++;
            if (i10 >= i6) {
                return -1;
            }
        }
        return i10;
    }

    public final boolean w() {
        return this.f15552E == 0;
    }

    public final boolean x() {
        return this.f15552E != 0;
    }

    public final java.lang.Object y() {
        if (w()) {
            throw new java.util.NoSuchElementException("MutableVector is empty.");
        }
        return s()[t() - 1];
    }

    public final int z(java.lang.Object obj) {
        int i6 = this.f15552E;
        if (i6 <= 0) {
            return -1;
        }
        int i10 = i6 - 1;
        java.lang.Object[] objArr = this.f15550C;
        while (!p247y7.AbstractC7350t.b(obj, objArr[i10])) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
        }
        return i10;
    }
}
