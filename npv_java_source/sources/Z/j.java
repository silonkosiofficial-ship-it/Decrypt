package Z;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Z.b implements Y.d {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Z.j.a f16653E = new Z.j.a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f16654F = 8;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final Z.j f16655G = new Z.j(new java.lang.Object[0]);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object[] f16656D;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Z.j a() {
            return Z.j.f16655G;
        }
    }

    public j(java.lang.Object[] objArr) {
        this.f16656D = objArr;
        p021c0.a.a(objArr.length <= 32);
    }

    private final java.lang.Object[] s(int i6) {
        return new java.lang.Object[i6];
    }

    @Override // java.util.List, Y.f
    public Y.f add(int i6, java.lang.Object obj) {
        p021c0.d.b(i6, size());
        if (i6 == size()) {
            return add(obj);
        }
        if (size() < 32) {
            java.lang.Object[] objArrS = s(size() + 1);
            p097j7.AbstractC6872n.p(this.f16656D, objArrS, 0, 0, i6, 6, null);
            p097j7.AbstractC6872n.l(this.f16656D, objArrS, i6 + 1, i6, size());
            objArrS[i6] = obj;
            return new Z.j(objArrS);
        }
        java.lang.Object[] objArr = this.f16656D;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
        p097j7.AbstractC6872n.l(this.f16656D, objArrCopyOf, i6 + 1, i6, size() - 1);
        objArrCopyOf[i6] = obj;
        return new Z.e(objArrCopyOf, Z.l.c(this.f16656D[31]), size() + 1, 0);
    }

    @Override // java.util.Collection, java.util.List, Y.f
    public Y.f add(java.lang.Object obj) {
        if (size() >= 32) {
            return new Z.e(this.f16656D, Z.l.c(obj), size() + 1, 0);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16656D, size() + 1);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = obj;
        return new Z.j(objArrCopyOf);
    }

    @Override // Z.b, java.util.Collection, java.util.List, Y.f
    public Y.f addAll(java.util.Collection collection) {
        if (size() + collection.size() > 32) {
            Y.f.a aVarBuilder = builder();
            aVarBuilder.addAll(collection);
            return aVarBuilder.i();
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16656D, size() + collection.size());
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new Z.j(objArrCopyOf);
    }

    @Override // Y.f
    public Y.f.a builder() {
        return new Z.f(this, null, this.f16656D, 0);
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f16656D.length;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public java.lang.Object get(int i6) {
        p021c0.d.a(i6, size());
        return this.f16656D[i6];
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public int indexOf(java.lang.Object obj) {
        return p097j7.AbstractC6872n.l0(this.f16656D, obj);
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return p097j7.AbstractC6872n.z0(this.f16656D, obj);
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        p021c0.d.b(i6, size());
        return new Z.c(this.f16656D, i6, size());
    }

    @Override // p097j7.AbstractC6862d, java.util.List, Y.f
    public Y.f set(int i6, java.lang.Object obj) {
        p021c0.d.a(i6, size());
        java.lang.Object[] objArr = this.f16656D;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i6] = obj;
        return new Z.j(objArrCopyOf);
    }

    @Override // Y.f
    public Y.f v(p237x7.l lVar) {
        java.lang.Object[] objArrCopyOf = this.f16656D;
        int size = size();
        int size2 = size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size2; i6++) {
            java.lang.Object obj = this.f16656D[i6];
            if (((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                if (!z6) {
                    java.lang.Object[] objArr = this.f16656D;
                    objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                    p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
                    z6 = true;
                    size = i6;
                }
            } else if (z6) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f16655G : new Z.j(p097j7.AbstractC6872n.r(objArrCopyOf, 0, size));
    }

    @Override // Y.f
    public Y.f y(int i6) {
        p021c0.d.a(i6, size());
        if (size() == 1) {
            return f16655G;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16656D, size() - 1);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        p097j7.AbstractC6872n.l(this.f16656D, objArrCopyOf, i6, i6 + 1, size());
        return new Z.j(objArrCopyOf);
    }
}
