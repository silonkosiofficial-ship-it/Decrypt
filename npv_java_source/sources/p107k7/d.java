package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements java.util.Map, java.io.Serializable, p256z7.e {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final k7.d.a f49734P = new k7.d.a(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final p107k7.d f49735Q;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.lang.Object[] f49736C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f49737D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int[] f49738E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int[] f49739F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f49740G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f49741H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f49742I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f49743J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f49744K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private p107k7.f f49745L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p107k7.g f49746M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private p107k7.e f49747N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f49748O;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i6) {
            return java.lang.Integer.highestOneBit(E7.j.d(i6, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i6) {
            return java.lang.Integer.numberOfLeadingZeros(i6) + 1;
        }

        public final p107k7.d e() {
            return p107k7.d.f49735Q;
        }
    }

    public static final class b extends p107k7.d.C0625d implements java.util.Iterator, p256z7.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p107k7.d dVar) {
            super(dVar);
            p247y7.AbstractC7350t.f(dVar, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public k7.d.c next() {
            b();
            if (c() >= e().f49741H) {
                throw new java.util.NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            k(iC);
            k7.d.c cVar = new k7.d.c(e(), d());
            f();
            return cVar;
        }

        public final void m(java.lang.StringBuilder sb) {
            p247y7.AbstractC7350t.f(sb, "sb");
            if (c() >= e().f49741H) {
                throw new java.util.NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            k(iC);
            java.lang.Object obj = e().f49736C[d()];
            if (obj == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            java.lang.Object[] objArr = e().f49737D;
            p247y7.AbstractC7350t.c(objArr);
            java.lang.Object obj2 = objArr[d()];
            if (obj2 == e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            f();
        }

        public final int o() {
            if (c() >= e().f49741H) {
                throw new java.util.NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            k(iC);
            java.lang.Object obj = e().f49736C[d()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = e().f49737D;
            p247y7.AbstractC7350t.c(objArr);
            java.lang.Object obj2 = objArr[d()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    public static final class c implements java.util.Map.Entry, p256z7.a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p107k7.d f49749C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final int f49750D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f49751E;

        public c(p107k7.d dVar, int i6) {
            p247y7.AbstractC7350t.f(dVar, "map");
            this.f49749C = dVar;
            this.f49750D = i6;
            this.f49751E = dVar.f49743J;
        }

        private final void a() {
            if (this.f49749C.f49743J != this.f49751E) {
                throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (p247y7.AbstractC7350t.b(entry.getKey(), getKey()) && p247y7.AbstractC7350t.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getKey() {
            a();
            return this.f49749C.f49736C[this.f49750D];
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
            a();
            java.lang.Object[] objArr = this.f49749C.f49737D;
            p247y7.AbstractC7350t.c(objArr);
            return objArr[this.f49750D];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            java.lang.Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            java.lang.Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object obj) {
            a();
            this.f49749C.o();
            java.lang.Object[] objArrL = this.f49749C.l();
            int i6 = this.f49750D;
            java.lang.Object obj2 = objArrL[i6];
            objArrL[i6] = obj;
            return obj2;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: k7.d$d, reason: collision with other inner class name */
    public static class C0625d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final p107k7.d f49752C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f49753D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f49754E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f49755F;

        public C0625d(p107k7.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "map");
            this.f49752C = dVar;
            this.f49754E = -1;
            this.f49755F = dVar.f49743J;
            f();
        }

        public final void b() {
            if (this.f49752C.f49743J != this.f49755F) {
                throw new java.util.ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f49753D;
        }

        public final int d() {
            return this.f49754E;
        }

        public final p107k7.d e() {
            return this.f49752C;
        }

        public final void f() {
            while (this.f49753D < this.f49752C.f49741H) {
                int[] iArr = this.f49752C.f49738E;
                int i6 = this.f49753D;
                if (iArr[i6] >= 0) {
                    return;
                } else {
                    this.f49753D = i6 + 1;
                }
            }
        }

        public final void h(int i6) {
            this.f49753D = i6;
        }

        public final boolean hasNext() {
            return this.f49753D < this.f49752C.f49741H;
        }

        public final void k(int i6) {
            this.f49754E = i6;
        }

        public final void remove() {
            b();
            if (this.f49754E == -1) {
                throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f49752C.o();
            this.f49752C.Q(this.f49754E);
            this.f49754E = -1;
            this.f49755F = this.f49752C.f49743J;
        }
    }

    public static final class e extends p107k7.d.C0625d implements java.util.Iterator, p256z7.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p107k7.d dVar) {
            super(dVar);
            p247y7.AbstractC7350t.f(dVar, "map");
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            b();
            if (c() >= e().f49741H) {
                throw new java.util.NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            k(iC);
            java.lang.Object obj = e().f49736C[d()];
            f();
            return obj;
        }
    }

    public static final class f extends p107k7.d.C0625d implements java.util.Iterator, p256z7.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p107k7.d dVar) {
            super(dVar);
            p247y7.AbstractC7350t.f(dVar, "map");
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            b();
            if (c() >= e().f49741H) {
                throw new java.util.NoSuchElementException();
            }
            int iC = c();
            h(iC + 1);
            k(iC);
            java.lang.Object[] objArr = e().f49737D;
            p247y7.AbstractC7350t.c(objArr);
            java.lang.Object obj = objArr[d()];
            f();
            return obj;
        }
    }

    static {
        p107k7.d dVar = new p107k7.d(0);
        dVar.f49748O = true;
        f49735Q = dVar;
    }

    public d() {
        this(8);
    }

    public d(int i6) {
        this(p107k7.c.d(i6), null, new int[i6], new int[f49734P.c(i6)], 2, 0);
    }

    private d(java.lang.Object[] objArr, java.lang.Object[] objArr2, int[] iArr, int[] iArr2, int i6, int i10) {
        this.f49736C = objArr;
        this.f49737D = objArr2;
        this.f49738E = iArr;
        this.f49739F = iArr2;
        this.f49740G = i6;
        this.f49741H = i10;
        this.f49742I = f49734P.d(D());
    }

    private final int A(java.lang.Object obj) {
        int i6 = this.f49741H;
        while (true) {
            i6--;
            if (i6 < 0) {
                return -1;
            }
            if (this.f49738E[i6] >= 0) {
                java.lang.Object[] objArr = this.f49737D;
                p247y7.AbstractC7350t.c(objArr);
                if (p247y7.AbstractC7350t.b(objArr[i6], obj)) {
                    return i6;
                }
            }
        }
    }

    private final int D() {
        return this.f49739F.length;
    }

    private final int I(java.lang.Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f49742I;
    }

    private final boolean K(java.util.Collection collection) {
        boolean z6 = false;
        if (collection.isEmpty()) {
            return false;
        }
        u(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (L((java.util.Map.Entry) it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    private final boolean L(java.util.Map.Entry entry) {
        int iK = k(entry.getKey());
        java.lang.Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = entry.getValue();
            return true;
        }
        int i6 = (-iK) - 1;
        if (p247y7.AbstractC7350t.b(entry.getValue(), objArrL[i6])) {
            return false;
        }
        objArrL[i6] = entry.getValue();
        return true;
    }

    private final boolean M(int i6) {
        int I10 = I(this.f49736C[i6]);
        int i10 = this.f49740G;
        while (true) {
            int[] iArr = this.f49739F;
            if (iArr[I10] == 0) {
                iArr[I10] = i6 + 1;
                this.f49738E[i6] = I10;
                return true;
            }
            i10--;
            if (i10 < 0) {
                return false;
            }
            I10 = I10 == 0 ? D() - 1 : I10 - 1;
        }
    }

    private final void N() {
        this.f49743J++;
    }

    private final void O(int i6) {
        N();
        int i10 = 0;
        if (this.f49741H > size()) {
            p(false);
        }
        this.f49739F = new int[i6];
        this.f49742I = f49734P.d(i6);
        while (i10 < this.f49741H) {
            int i11 = i10 + 1;
            if (!M(i10)) {
                throw new java.lang.IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i6) {
        p107k7.c.f(this.f49736C, i6);
        java.lang.Object[] objArr = this.f49737D;
        if (objArr != null) {
            p107k7.c.f(objArr, i6);
        }
        R(this.f49738E[i6]);
        this.f49738E[i6] = -1;
        this.f49744K = size() - 1;
        N();
    }

    private final void R(int i6) {
        int iG = E7.j.g(this.f49740G * 2, D() / 2);
        int i10 = 0;
        int i11 = i6;
        do {
            i6 = i6 == 0 ? D() - 1 : i6 - 1;
            i10++;
            if (i10 > this.f49740G) {
                this.f49739F[i11] = 0;
                return;
            }
            int[] iArr = this.f49739F;
            int i12 = iArr[i6];
            if (i12 == 0) {
                iArr[i11] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                if (((I(this.f49736C[i13]) - i6) & (D() - 1)) >= i10) {
                    this.f49739F[i11] = i12;
                    this.f49738E[i13] = i11;
                }
                iG--;
            }
            i11 = i6;
            i10 = 0;
            iG--;
        } while (iG >= 0);
        this.f49739F[i11] = -1;
    }

    private final boolean U(int i6) {
        int iB = B();
        int i10 = this.f49741H;
        int i11 = iB - i10;
        int size = i10 - size();
        return i11 < i6 && i11 + size >= i6 && size >= B() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object[] l() {
        java.lang.Object[] objArr = this.f49737D;
        if (objArr != null) {
            return objArr;
        }
        java.lang.Object[] objArrD = p107k7.c.d(B());
        this.f49737D = objArrD;
        return objArrD;
    }

    private final void p(boolean z6) {
        int i6;
        java.lang.Object[] objArr = this.f49737D;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = this.f49741H;
            if (i10 >= i6) {
                break;
            }
            int[] iArr = this.f49738E;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                java.lang.Object[] objArr2 = this.f49736C;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z6) {
                    iArr[i11] = i12;
                    this.f49739F[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        p107k7.c.g(this.f49736C, i11, i6);
        if (objArr != null) {
            p107k7.c.g(objArr, i11, this.f49741H);
        }
        this.f49741H = i11;
    }

    private final boolean s(java.util.Map map) {
        return size() == map.size() && q(map.entrySet());
    }

    private final void t(int i6) {
        if (i6 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i6 > B()) {
            int iE = p097j7.AbstractC6862d.f49298C.e(B(), i6);
            this.f49736C = p107k7.c.e(this.f49736C, iE);
            java.lang.Object[] objArr = this.f49737D;
            this.f49737D = objArr != null ? p107k7.c.e(objArr, iE) : null;
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.f49738E, iE);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(...)");
            this.f49738E = iArrCopyOf;
            int iC = f49734P.c(iE);
            if (iC > D()) {
                O(iC);
            }
        }
    }

    private final void u(int i6) {
        if (U(i6)) {
            p(true);
        } else {
            t(this.f49741H + i6);
        }
    }

    private final int z(java.lang.Object obj) {
        int I10 = I(obj);
        int i6 = this.f49740G;
        while (true) {
            int i10 = this.f49739F[I10];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (p247y7.AbstractC7350t.b(this.f49736C[i11], obj)) {
                    return i11;
                }
            }
            i6--;
            if (i6 < 0) {
                return -1;
            }
            I10 = I10 == 0 ? D() - 1 : I10 - 1;
        }
    }

    public final int B() {
        return this.f49736C.length;
    }

    public java.util.Set C() {
        p107k7.e eVar = this.f49747N;
        if (eVar != null) {
            return eVar;
        }
        p107k7.e eVar2 = new p107k7.e(this);
        this.f49747N = eVar2;
        return eVar2;
    }

    public java.util.Set E() {
        p107k7.f fVar = this.f49745L;
        if (fVar != null) {
            return fVar;
        }
        p107k7.f fVar2 = new p107k7.f(this);
        this.f49745L = fVar2;
        return fVar2;
    }

    public int F() {
        return this.f49744K;
    }

    public java.util.Collection G() {
        p107k7.g gVar = this.f49746M;
        if (gVar != null) {
            return gVar;
        }
        p107k7.g gVar2 = new p107k7.g(this);
        this.f49746M = gVar2;
        return gVar2;
    }

    public final k7.d.e J() {
        return new k7.d.e(this);
    }

    public final boolean P(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "entry");
        o();
        int iZ = z(entry.getKey());
        if (iZ < 0) {
            return false;
        }
        java.lang.Object[] objArr = this.f49737D;
        p247y7.AbstractC7350t.c(objArr);
        if (!p247y7.AbstractC7350t.b(objArr[iZ], entry.getValue())) {
            return false;
        }
        Q(iZ);
        return true;
    }

    public final boolean S(java.lang.Object obj) {
        o();
        int iZ = z(obj);
        if (iZ < 0) {
            return false;
        }
        Q(iZ);
        return true;
    }

    public final boolean T(java.lang.Object obj) {
        o();
        int iA = A(obj);
        if (iA < 0) {
            return false;
        }
        Q(iA);
        return true;
    }

    public final k7.d.f V() {
        return new k7.d.f(this);
    }

    @Override // java.util.Map
    public void clear() {
        o();
        int i6 = this.f49741H - 1;
        if (i6 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f49738E;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f49739F[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i6) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        p107k7.c.g(this.f49736C, 0, this.f49741H);
        java.lang.Object[] objArr = this.f49737D;
        if (objArr != null) {
            p107k7.c.g(objArr, 0, this.f49741H);
        }
        this.f49744K = 0;
        this.f49741H = 0;
        N();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return z(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return A(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return C();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof java.util.Map) && s((java.util.Map) obj));
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        int iZ = z(obj);
        if (iZ < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.f49737D;
        p247y7.AbstractC7350t.c(objArr);
        return objArr[iZ];
    }

    @Override // java.util.Map
    public int hashCode() {
        k7.d.b bVarX = x();
        int iO = 0;
        while (bVarX.hasNext()) {
            iO += bVarX.o();
        }
        return iO;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(java.lang.Object obj) {
        o();
        while (true) {
            int I10 = I(obj);
            int iG = E7.j.g(this.f49740G * 2, D() / 2);
            int i6 = 0;
            while (true) {
                int i10 = this.f49739F[I10];
                if (i10 <= 0) {
                    if (this.f49741H >= B()) {
                        u(1);
                        break;
                    }
                    int i11 = this.f49741H;
                    int i12 = i11 + 1;
                    this.f49741H = i12;
                    this.f49736C[i11] = obj;
                    this.f49738E[i11] = I10;
                    this.f49739F[I10] = i12;
                    this.f49744K = size() + 1;
                    N();
                    if (i6 > this.f49740G) {
                        this.f49740G = i6;
                    }
                    return i11;
                }
                if (p247y7.AbstractC7350t.b(this.f49736C[i10 - 1], obj)) {
                    return -i10;
                }
                i6++;
                if (i6 > iG) {
                    O(D() * 2);
                    break;
                }
                I10 = I10 == 0 ? D() - 1 : I10 - 1;
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return E();
    }

    public final java.util.Map m() {
        o();
        this.f49748O = true;
        if (size() > 0) {
            return this;
        }
        p107k7.d dVar = f49735Q;
        p247y7.AbstractC7350t.d(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void o() {
        if (this.f49748O) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        o();
        int iK = k(obj);
        java.lang.Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = obj2;
            return null;
        }
        int i6 = (-iK) - 1;
        java.lang.Object obj3 = objArrL[i6];
        objArrL[i6] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "from");
        o();
        K(map.entrySet());
    }

    public final boolean q(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "m");
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                try {
                    if (!r((java.util.Map.Entry) obj)) {
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean r(java.util.Map.Entry entry) {
        p247y7.AbstractC7350t.f(entry, "entry");
        int iZ = z(entry.getKey());
        if (iZ < 0) {
            return false;
        }
        java.lang.Object[] objArr = this.f49737D;
        p247y7.AbstractC7350t.c(objArr);
        return p247y7.AbstractC7350t.b(objArr[iZ], entry.getValue());
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        o();
        int iZ = z(obj);
        if (iZ < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.f49737D;
        p247y7.AbstractC7350t.c(objArr);
        java.lang.Object obj2 = objArr[iZ];
        Q(iZ);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return F();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((size() * 3) + 2);
        sb.append("{");
        k7.d.b bVarX = x();
        int i6 = 0;
        while (bVarX.hasNext()) {
            if (i6 > 0) {
                sb.append(", ");
            }
            bVarX.m(sb);
            i6++;
        }
        sb.append("}");
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return G();
    }

    public final k7.d.b x() {
        return new k7.d.b(this);
    }
}
