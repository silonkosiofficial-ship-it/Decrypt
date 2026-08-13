package N4;

/* JADX INFO: renamed from: N4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C1409i extends java.util.AbstractMap implements java.io.Serializable {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final java.lang.Object f7730L = new java.lang.Object();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient java.lang.Object f7731C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    transient int[] f7732D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    transient java.lang.Object[] f7733E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    transient java.lang.Object[] f7734F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private transient int f7735G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private transient int f7736H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private transient java.util.Set f7737I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private transient java.util.Set f7738J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private transient java.util.Collection f7739K;

    /* JADX INFO: renamed from: N4.i$a */
    class a extends N4.C1409i.e {
        a() {
            super(N4.C1409i.this, null);
        }

        @Override // N4.C1409i.e
        java.lang.Object c(int i6) {
            return N4.C1409i.this.J(i6);
        }
    }

    /* JADX INFO: renamed from: N4.i$b */
    class b extends N4.C1409i.e {
        b() {
            super(N4.C1409i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // N4.C1409i.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.util.Map.Entry c(int i6) {
            return N4.C1409i.this.new g(i6);
        }
    }

    /* JADX INFO: renamed from: N4.i$c */
    class c extends N4.C1409i.e {
        c() {
            super(N4.C1409i.this, null);
        }

        @Override // N4.C1409i.e
        java.lang.Object c(int i6) {
            return N4.C1409i.this.Z(i6);
        }
    }

    /* JADX INFO: renamed from: N4.i$d */
    class d extends java.util.AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            N4.C1409i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            java.util.Map mapZ = N4.C1409i.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().contains(obj);
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int iG = N4.C1409i.this.G(entry.getKey());
            return iG != -1 && M4.f.a(N4.C1409i.this.Z(iG), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return N4.C1409i.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map mapZ = N4.C1409i.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().remove(obj);
            }
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (N4.C1409i.this.M()) {
                return false;
            }
            int iE = N4.C1409i.this.E();
            int iF = N4.AbstractC1410j.f(entry.getKey(), entry.getValue(), iE, N4.C1409i.this.Q(), N4.C1409i.this.O(), N4.C1409i.this.P(), N4.C1409i.this.R());
            if (iF == -1) {
                return false;
            }
            N4.C1409i.this.L(iF, iE);
            N4.C1409i.e(N4.C1409i.this);
            N4.C1409i.this.F();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return N4.C1409i.this.size();
        }
    }

    /* JADX INFO: renamed from: N4.i$e */
    private abstract class e implements java.util.Iterator {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f7744C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f7745D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f7746E;

        private e() {
            this.f7744C = N4.C1409i.this.f7735G;
            this.f7745D = N4.C1409i.this.C();
            this.f7746E = -1;
        }

        /* synthetic */ e(N4.C1409i c1409i, N4.C1409i.a aVar) {
            this();
        }

        private void b() {
            if (N4.C1409i.this.f7735G != this.f7744C) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        abstract java.lang.Object c(int i6);

        void d() {
            this.f7744C += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7745D >= 0;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            b();
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            int i6 = this.f7745D;
            this.f7746E = i6;
            java.lang.Object objC = c(i6);
            this.f7745D = N4.C1409i.this.D(this.f7745D);
            return objC;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            N4.AbstractC1407g.c(this.f7746E >= 0);
            d();
            N4.C1409i c1409i = N4.C1409i.this;
            c1409i.remove(c1409i.J(this.f7746E));
            this.f7745D = N4.C1409i.this.q(this.f7745D, this.f7746E);
            this.f7746E = -1;
        }
    }

    /* JADX INFO: renamed from: N4.i$f */
    class f extends java.util.AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            N4.C1409i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return N4.C1409i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
            return N4.C1409i.this.K();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            java.util.Map mapZ = N4.C1409i.this.z();
            if (mapZ != null) {
                return mapZ.keySet().remove(obj);
            }
            return N4.C1409i.this.N(obj) != N4.C1409i.f7730L;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return N4.C1409i.this.size();
        }
    }

    /* JADX INFO: renamed from: N4.i$g */
    final class g extends N4.AbstractC1403c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final java.lang.Object f7749C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f7750D;

        g(int i6) {
            this.f7749C = N4.C1409i.this.J(i6);
            this.f7750D = i6;
        }

        private void a() {
            int i6 = this.f7750D;
            if (i6 == -1 || i6 >= N4.C1409i.this.size() || !M4.f.a(this.f7749C, N4.C1409i.this.J(this.f7750D))) {
                this.f7750D = N4.C1409i.this.G(this.f7749C);
            }
        }

        @Override // N4.AbstractC1403c, java.util.Map.Entry
        public java.lang.Object getKey() {
            return this.f7749C;
        }

        @Override // N4.AbstractC1403c, java.util.Map.Entry
        public java.lang.Object getValue() {
            java.util.Map mapZ = N4.C1409i.this.z();
            if (mapZ != null) {
                return N4.E.a(mapZ.get(this.f7749C));
            }
            a();
            int i6 = this.f7750D;
            return i6 == -1 ? N4.E.b() : N4.C1409i.this.Z(i6);
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            java.util.Map mapZ = N4.C1409i.this.z();
            if (mapZ != null) {
                return N4.E.a(mapZ.put(this.f7749C, obj));
            }
            a();
            int i6 = this.f7750D;
            if (i6 == -1) {
                N4.C1409i.this.put(this.f7749C, obj);
                return N4.E.b();
            }
            java.lang.Object objZ = N4.C1409i.this.Z(i6);
            N4.C1409i.this.Y(this.f7750D, obj);
            return objZ;
        }
    }

    /* JADX INFO: renamed from: N4.i$h */
    class h extends java.util.AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            N4.C1409i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            return N4.C1409i.this.a0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return N4.C1409i.this.size();
        }
    }

    C1409i() {
        H(3);
    }

    private int A(int i6) {
        return O()[i6];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        return (1 << (this.f7735G & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G(java.lang.Object obj) {
        if (M()) {
            return -1;
        }
        int iC = N4.AbstractC1413m.c(obj);
        int iE = E();
        int iH = N4.AbstractC1410j.h(Q(), iC & iE);
        if (iH == 0) {
            return -1;
        }
        int iB = N4.AbstractC1410j.b(iC, iE);
        do {
            int i6 = iH - 1;
            int iA = A(i6);
            if (N4.AbstractC1410j.b(iA, iE) == iB && M4.f.a(obj, J(i6))) {
                return i6;
            }
            iH = N4.AbstractC1410j.c(iA, iE);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object J(int i6) {
        return P()[i6];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object N(java.lang.Object obj) {
        if (M()) {
            return f7730L;
        }
        int iE = E();
        int iF = N4.AbstractC1410j.f(obj, null, iE, Q(), O(), P(), null);
        if (iF == -1) {
            return f7730L;
        }
        java.lang.Object objZ = Z(iF);
        L(iF, iE);
        this.f7736H--;
        F();
        return objZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] O() {
        int[] iArr = this.f7732D;
        j$.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] P() {
        java.lang.Object[] objArr = this.f7733E;
        j$.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object Q() {
        java.lang.Object obj = this.f7731C;
        j$.util.Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] R() {
        java.lang.Object[] objArr = this.f7734F;
        j$.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    private void T(int i6) {
        int iMin;
        int length = O().length;
        if (i6 <= length || (iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        S(iMin);
    }

    private int U(int i6, int i10, int i11, int i12) {
        java.lang.Object objA = N4.AbstractC1410j.a(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            N4.AbstractC1410j.i(objA, i11 & i13, i12 + 1);
        }
        java.lang.Object objQ = Q();
        int[] iArrO = O();
        for (int i14 = 0; i14 <= i6; i14++) {
            int iH = N4.AbstractC1410j.h(objQ, i14);
            while (iH != 0) {
                int i15 = iH - 1;
                int i16 = iArrO[i15];
                int iB = N4.AbstractC1410j.b(i16, i6) | i14;
                int i17 = iB & i13;
                int iH2 = N4.AbstractC1410j.h(objA, i17);
                N4.AbstractC1410j.i(objA, i17, iH);
                iArrO[i15] = N4.AbstractC1410j.d(iB, iH2, i13);
                iH = N4.AbstractC1410j.c(i16, i6);
            }
        }
        this.f7731C = objA;
        W(i13);
        return i13;
    }

    private void V(int i6, int i10) {
        O()[i6] = i10;
    }

    private void W(int i6) {
        this.f7735G = N4.AbstractC1410j.d(this.f7735G, 32 - java.lang.Integer.numberOfLeadingZeros(i6), 31);
    }

    private void X(int i6, java.lang.Object obj) {
        P()[i6] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i6, java.lang.Object obj) {
        R()[i6] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object Z(int i6) {
        return R()[i6];
    }

    static /* synthetic */ int e(N4.C1409i c1409i) {
        int i6 = c1409i.f7736H;
        c1409i.f7736H = i6 - 1;
        return i6;
    }

    public static N4.C1409i t() {
        return new N4.C1409i();
    }

    java.util.Iterator B() {
        java.util.Map mapZ = z();
        return mapZ != null ? mapZ.entrySet().iterator() : new N4.C1409i.b();
    }

    int C() {
        return isEmpty() ? -1 : 0;
    }

    int D(int i6) {
        int i10 = i6 + 1;
        if (i10 < this.f7736H) {
            return i10;
        }
        return -1;
    }

    void F() {
        this.f7735G += 32;
    }

    void H(int i6) {
        M4.h.e(i6 >= 0, "Expected size must be >= 0");
        this.f7735G = O4.a.a(i6, 1, 1073741823);
    }

    void I(int i6, java.lang.Object obj, java.lang.Object obj2, int i10, int i11) {
        V(i6, N4.AbstractC1410j.d(i10, 0, i11));
        X(i6, obj);
        Y(i6, obj2);
    }

    java.util.Iterator K() {
        java.util.Map mapZ = z();
        return mapZ != null ? mapZ.keySet().iterator() : new N4.C1409i.a();
    }

    void L(int i6, int i10) {
        java.lang.Object objQ = Q();
        int[] iArrO = O();
        java.lang.Object[] objArrP = P();
        java.lang.Object[] objArrR = R();
        int size = size();
        int i11 = size - 1;
        if (i6 >= i11) {
            objArrP[i6] = null;
            objArrR[i6] = null;
            iArrO[i6] = 0;
            return;
        }
        java.lang.Object obj = objArrP[i11];
        objArrP[i6] = obj;
        objArrR[i6] = objArrR[i11];
        objArrP[i11] = null;
        objArrR[i11] = null;
        iArrO[i6] = iArrO[i11];
        iArrO[i11] = 0;
        int iC = N4.AbstractC1413m.c(obj) & i10;
        int iH = N4.AbstractC1410j.h(objQ, iC);
        if (iH == size) {
            N4.AbstractC1410j.i(objQ, iC, i6 + 1);
            return;
        }
        while (true) {
            int i12 = iH - 1;
            int i13 = iArrO[i12];
            int iC2 = N4.AbstractC1410j.c(i13, i10);
            if (iC2 == size) {
                iArrO[i12] = N4.AbstractC1410j.d(i13, i6 + 1, i10);
                return;
            }
            iH = iC2;
        }
    }

    boolean M() {
        return this.f7731C == null;
    }

    void S(int i6) {
        this.f7732D = java.util.Arrays.copyOf(O(), i6);
        this.f7733E = java.util.Arrays.copyOf(P(), i6);
        this.f7734F = java.util.Arrays.copyOf(R(), i6);
    }

    java.util.Iterator a0() {
        java.util.Map mapZ = z();
        return mapZ != null ? mapZ.values().iterator() : new N4.C1409i.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (M()) {
            return;
        }
        F();
        java.util.Map mapZ = z();
        if (mapZ != null) {
            this.f7735G = O4.a.a(size(), 3, 1073741823);
            mapZ.clear();
            this.f7731C = null;
        } else {
            java.util.Arrays.fill(P(), 0, this.f7736H, (java.lang.Object) null);
            java.util.Arrays.fill(R(), 0, this.f7736H, (java.lang.Object) null);
            N4.AbstractC1410j.g(Q());
            java.util.Arrays.fill(O(), 0, this.f7736H, 0);
        }
        this.f7736H = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.util.Map mapZ = z();
        if (mapZ != null) {
            return mapZ.containsKey(obj);
        }
        return G(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Map mapZ = z();
        if (mapZ != null) {
            return mapZ.containsValue(obj);
        }
        for (int i6 = 0; i6 < this.f7736H; i6++) {
            if (M4.f.a(obj, Z(i6))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        java.util.Set set = this.f7738J;
        if (set != null) {
            return set;
        }
        java.util.Set setU = u();
        this.f7738J = setU;
        return setU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.util.Map mapZ = z();
        if (mapZ != null) {
            return mapZ.get(obj);
        }
        int iG = G(obj);
        if (iG == -1) {
            return null;
        }
        p(iG);
        return Z(iG);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set set = this.f7737I;
        if (set != null) {
            return set;
        }
        java.util.Set setX = x();
        this.f7737I = setX;
        return setX;
    }

    void p(int i6) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int iU;
        if (M()) {
            r();
        }
        java.util.Map mapZ = z();
        if (mapZ != null) {
            return mapZ.put(obj, obj2);
        }
        int[] iArrO = O();
        java.lang.Object[] objArrP = P();
        java.lang.Object[] objArrR = R();
        int i6 = this.f7736H;
        int i10 = i6 + 1;
        int iC = N4.AbstractC1413m.c(obj);
        int iE = E();
        int i11 = iC & iE;
        int iH = N4.AbstractC1410j.h(Q(), i11);
        if (iH != 0) {
            int iB = N4.AbstractC1410j.b(iC, iE);
            int i12 = 0;
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrO[i13];
                if (N4.AbstractC1410j.b(i14, iE) == iB && M4.f.a(obj, objArrP[i13])) {
                    java.lang.Object obj3 = objArrR[i13];
                    objArrR[i13] = obj2;
                    p(i13);
                    return obj3;
                }
                int iC2 = N4.AbstractC1410j.c(i14, iE);
                i12++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i12 >= 9) {
                        return s().put(obj, obj2);
                    }
                    if (i10 > iE) {
                        iU = U(iE, N4.AbstractC1410j.e(iE), iC, i6);
                    } else {
                        iArrO[i13] = N4.AbstractC1410j.d(i14, i10, iE);
                        iU = iE;
                    }
                }
            }
        } else if (i10 > iE) {
            iU = U(iE, N4.AbstractC1410j.e(iE), iC, i6);
        } else {
            N4.AbstractC1410j.i(Q(), i11, i10);
            iU = iE;
        }
        T(i10);
        I(i6, obj, obj2, iC, iU);
        this.f7736H = i10;
        F();
        return null;
    }

    int q(int i6, int i10) {
        return i6 - 1;
    }

    int r() {
        M4.h.o(M(), "Arrays already allocated");
        int i6 = this.f7735G;
        int iJ = N4.AbstractC1410j.j(i6);
        this.f7731C = N4.AbstractC1410j.a(iJ);
        W(iJ - 1);
        this.f7732D = new int[i6];
        this.f7733E = new java.lang.Object[i6];
        this.f7734F = new java.lang.Object[i6];
        return i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        java.util.Map mapZ = z();
        if (mapZ != null) {
            return mapZ.remove(obj);
        }
        java.lang.Object objN = N(obj);
        if (objN == f7730L) {
            return null;
        }
        return objN;
    }

    java.util.Map s() {
        java.util.Map mapV = v(E() + 1);
        int iC = C();
        while (iC >= 0) {
            mapV.put(J(iC), Z(iC));
            iC = D(iC);
        }
        this.f7731C = mapV;
        this.f7732D = null;
        this.f7733E = null;
        this.f7734F = null;
        F();
        return mapV;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        java.util.Map mapZ = z();
        return mapZ != null ? mapZ.size() : this.f7736H;
    }

    java.util.Set u() {
        return new N4.C1409i.d();
    }

    java.util.Map v(int i6) {
        return new java.util.LinkedHashMap(i6, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection values() {
        java.util.Collection collection = this.f7739K;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionY = y();
        this.f7739K = collectionY;
        return collectionY;
    }

    java.util.Set x() {
        return new N4.C1409i.f();
    }

    java.util.Collection y() {
        return new N4.C1409i.h();
    }

    java.util.Map z() {
        java.lang.Object obj = this.f7731C;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }
}
