package p170r;

/* JADX INFO: renamed from: r.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7027b implements java.util.Collection, java.util.Set, p256z7.b, p256z7.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f53367C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f53368D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f53369E;

    /* JADX INFO: renamed from: r.b$a */
    private final class a extends p170r.AbstractC7035j {
        public a() {
            super(p170r.C7027b.this.o());
        }

        @Override // p170r.AbstractC7035j
        protected java.lang.Object b(int i6) {
            return p170r.C7027b.this.M(i6);
        }

        @Override // p170r.AbstractC7035j
        protected void c(int i6) {
            p170r.C7027b.this.s(i6);
        }
    }

    public C7027b() {
        this(0, 1, null);
    }

    public C7027b(int i6) {
        this.f53367C = p180s.a.f54036a;
        this.f53368D = p180s.a.f54038c;
        if (i6 > 0) {
            p170r.AbstractC7029d.a(this, i6);
        }
    }

    public /* synthetic */ C7027b(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 0 : i6);
    }

    public final void C(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "<set-?>");
        this.f53368D = objArr;
    }

    public final void D(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<set-?>");
        this.f53367C = iArr;
    }

    public final void E(int i6) {
        this.f53369E = i6;
    }

    public final java.lang.Object M(int i6) {
        return e()[i6];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        int i6;
        int iC;
        int iO = o();
        if (obj == null) {
            iC = p170r.AbstractC7029d.d(this);
            i6 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i6 = iHashCode;
            iC = p170r.AbstractC7029d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i10 = ~iC;
        if (iO >= f().length) {
            int i11 = 8;
            if (iO >= 8) {
                i11 = (iO >> 1) + iO;
            } else if (iO < 4) {
                i11 = 4;
            }
            int[] iArrF = f();
            java.lang.Object[] objArrE = e();
            p170r.AbstractC7029d.a(this, i11);
            if (iO != o()) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!(f().length == 0)) {
                p097j7.AbstractC6872n.o(iArrF, f(), 0, 0, iArrF.length, 6, null);
                p097j7.AbstractC6872n.p(objArrE, e(), 0, 0, objArrE.length, 6, null);
            }
        }
        if (i10 < iO) {
            int i12 = i10 + 1;
            p097j7.AbstractC6872n.j(f(), f(), i12, i10, iO);
            p097j7.AbstractC6872n.l(e(), e(), i12, i10, iO);
        }
        if (iO != o() || i10 >= f().length) {
            throw new java.util.ConcurrentModificationException();
        }
        f()[i10] = i6;
        e()[i10] = obj;
        E(o() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        d(o() + collection.size());
        java.util.Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (o() != 0) {
            D(p180s.a.f54036a);
            C(p180s.a.f54038c);
            E(0);
        }
        if (o() != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i6) {
        int iO = o();
        if (f().length < i6) {
            int[] iArrF = f();
            java.lang.Object[] objArrE = e();
            p170r.AbstractC7029d.a(this, i6);
            if (o() > 0) {
                p097j7.AbstractC6872n.o(iArrF, f(), 0, 0, o(), 6, null);
                p097j7.AbstractC6872n.p(objArrE, e(), 0, 0, o(), 6, null);
            }
        }
        if (o() != iO) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final java.lang.Object[] e() {
        return this.f53368D;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof java.util.Set) && size() == ((java.util.Set) obj).size()) {
            try {
                int iO = o();
                for (int i6 = 0; i6 < iO; i6++) {
                    if (((java.util.Set) obj).contains(M(i6))) {
                    }
                }
                return true;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public final int[] f() {
        return this.f53367C;
    }

    public int g() {
        return this.f53369E;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrF = f();
        int iO = o();
        int i6 = 0;
        for (int i10 = 0; i10 < iO; i10++) {
            i6 += iArrF[i10];
        }
        return i6;
    }

    public final int indexOf(java.lang.Object obj) {
        return obj == null ? p170r.AbstractC7029d.d(this) : p170r.AbstractC7029d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return o() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new p170r.C7027b.a();
    }

    public final int o() {
        return this.f53369E;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        s(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "elements");
        boolean z6 = false;
        for (int iO = o() - 1; -1 < iO; iO--) {
            if (!p097j7.AbstractC6879v.Z(collection, e()[iO])) {
                s(iO);
                z6 = true;
            }
        }
        return z6;
    }

    public final java.lang.Object s(int i6) {
        int iO = o();
        java.lang.Object obj = e()[i6];
        if (iO <= 1) {
            clear();
        } else {
            int i10 = iO - 1;
            if (f().length <= 8 || o() >= f().length / 3) {
                if (i6 < i10) {
                    int i11 = i6 + 1;
                    p097j7.AbstractC6872n.j(f(), f(), i6, i11, iO);
                    p097j7.AbstractC6872n.l(e(), e(), i6, i11, iO);
                }
                e()[i10] = null;
            } else {
                int iO2 = o() > 8 ? o() + (o() >> 1) : 8;
                int[] iArrF = f();
                java.lang.Object[] objArrE = e();
                p170r.AbstractC7029d.a(this, iO2);
                if (i6 > 0) {
                    p097j7.AbstractC6872n.o(iArrF, f(), 0, 0, i6, 6, null);
                    p097j7.AbstractC6872n.p(objArrE, e(), 0, 0, i6, 6, null);
                }
                if (i6 < i10) {
                    int i12 = i6 + 1;
                    p097j7.AbstractC6872n.j(iArrF, f(), i6, i12, iO);
                    p097j7.AbstractC6872n.l(objArrE, e(), i6, i12, iO);
                }
            }
            if (iO != o()) {
                throw new java.util.ConcurrentModificationException();
            }
            E(i10);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        return p097j7.AbstractC6872n.r(this.f53368D, 0, this.f53369E);
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "array");
        java.lang.Object[] objArrA = p170r.AbstractC7028c.a(objArr, this.f53369E);
        p097j7.AbstractC6872n.l(this.f53368D, objArrA, 0, 0, this.f53369E);
        p247y7.AbstractC7350t.e(objArrA, "result");
        return objArrA;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(o() * 14);
        sb.append('{');
        int iO = o();
        for (int i6 = 0; i6 < iO; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            java.lang.Object objM = M(i6);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
