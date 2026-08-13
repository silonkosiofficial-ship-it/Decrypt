package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0.t.a f17020e = new a0.t.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17021f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p001a0.t f17022g = new p001a0.t(0, 0, new java.lang.Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p021c0.e f17025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object[] f17026d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p001a0.t a() {
            return p001a0.t.f17022g;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p001a0.t f17027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17028b;

        public b(p001a0.t tVar, int i6) {
            this.f17027a = tVar;
            this.f17028b = i6;
        }

        public final p001a0.t a() {
            return this.f17027a;
        }

        public final int b() {
            return this.f17028b;
        }

        public final void c(p001a0.t tVar) {
            this.f17027a = tVar;
        }
    }

    public t(int i6, int i10, java.lang.Object[] objArr) {
        this(i6, i10, objArr, null);
    }

    public t(int i6, int i10, java.lang.Object[] objArr, p021c0.e eVar) {
        this.f17023a = i6;
        this.f17024b = i10;
        this.f17025c = eVar;
        this.f17026d = objArr;
    }

    private final p001a0.t A(int i6, p001a0.f fVar) {
        fVar.o(fVar.size() - 1);
        fVar.l(W(i6));
        if (this.f17026d.length == 2) {
            return null;
        }
        if (this.f17025c != fVar.h()) {
            return new p001a0.t(0, 0, p001a0.x.h(this.f17026d, i6), fVar.h());
        }
        this.f17026d = p001a0.x.h(this.f17026d, i6);
        return this;
    }

    private final p001a0.t B(int i6, java.lang.Object obj, java.lang.Object obj2, p021c0.e eVar) {
        int iN = n(i6);
        if (this.f17025c != eVar) {
            return new p001a0.t(i6 | this.f17023a, this.f17024b, p001a0.x.g(this.f17026d, iN, obj, obj2), eVar);
        }
        this.f17026d = p001a0.x.g(this.f17026d, iN, obj, obj2);
        this.f17023a = i6 | this.f17023a;
        return this;
    }

    private final p001a0.t C(int i6, int i10, int i11, java.lang.Object obj, java.lang.Object obj2, int i12, p021c0.e eVar) {
        p021c0.e eVar2 = this.f17025c;
        java.lang.Object[] objArrD = d(i6, i10, i11, obj, obj2, i12, eVar);
        if (eVar2 != eVar) {
            return new p001a0.t(this.f17023a ^ i10, i10 | this.f17024b, objArrD, eVar);
        }
        this.f17026d = objArrD;
        this.f17023a ^= i10;
        this.f17024b |= i10;
        return this;
    }

    private final p001a0.t F(p001a0.t tVar, int i6, int i10, p021c0.b bVar, p001a0.f fVar) {
        if (r(i6)) {
            p001a0.t tVarN = N(O(i6));
            if (tVar.r(i6)) {
                return tVarN.E(tVar.N(tVar.O(i6)), i10 + 5, bVar, fVar);
            }
            if (!tVar.q(i6)) {
                return tVarN;
            }
            int iN = tVar.n(i6);
            java.lang.Object objT = tVar.t(iN);
            java.lang.Object objW = tVar.W(iN);
            int size = fVar.size();
            p001a0.t tVarD = tVarN.D(objT != null ? objT.hashCode() : 0, objT, objW, i10 + 5, fVar);
            if (fVar.size() != size) {
                return tVarD;
            }
            bVar.c(bVar.a() + 1);
            return tVarD;
        }
        if (!tVar.r(i6)) {
            int iN2 = n(i6);
            java.lang.Object objT2 = t(iN2);
            java.lang.Object objW2 = W(iN2);
            int iN3 = tVar.n(i6);
            java.lang.Object objT3 = tVar.t(iN3);
            return u(objT2 != null ? objT2.hashCode() : 0, objT2, objW2, objT3 != null ? objT3.hashCode() : 0, objT3, tVar.W(iN3), i10 + 5, fVar.h());
        }
        p001a0.t tVarN2 = tVar.N(tVar.O(i6));
        if (q(i6)) {
            int iN4 = n(i6);
            java.lang.Object objT4 = t(iN4);
            int i11 = i10 + 5;
            if (!tVarN2.k(objT4 != null ? objT4.hashCode() : 0, objT4, i11)) {
                return tVarN2.D(objT4 != null ? objT4.hashCode() : 0, objT4, W(iN4), i11, fVar);
            }
            bVar.c(bVar.a() + 1);
        }
        return tVarN2;
    }

    private final p001a0.t I(int i6, int i10, p001a0.f fVar) {
        fVar.o(fVar.size() - 1);
        fVar.l(W(i6));
        if (this.f17026d.length == 2) {
            return null;
        }
        if (this.f17025c != fVar.h()) {
            return new p001a0.t(i10 ^ this.f17023a, this.f17024b, p001a0.x.h(this.f17026d, i6), fVar.h());
        }
        this.f17026d = p001a0.x.h(this.f17026d, i6);
        this.f17023a ^= i10;
        return this;
    }

    private final p001a0.t J(int i6, int i10, p021c0.e eVar) {
        java.lang.Object[] objArr = this.f17026d;
        if (objArr.length == 1) {
            return null;
        }
        p021c0.e eVar2 = this.f17025c;
        java.lang.Object[] objArrI = p001a0.x.i(objArr, i6);
        if (eVar2 != eVar) {
            return new p001a0.t(this.f17023a, i10 ^ this.f17024b, objArrI, eVar);
        }
        this.f17026d = objArrI;
        this.f17024b ^= i10;
        return this;
    }

    private final p001a0.t K(p001a0.t tVar, p001a0.t tVar2, int i6, int i10, p021c0.e eVar) {
        if (tVar2 == null) {
            return J(i6, i10, eVar);
        }
        return (this.f17025c == eVar || tVar != tVar2) ? L(i6, tVar2, eVar) : this;
    }

    private final p001a0.t L(int i6, p001a0.t tVar, p021c0.e eVar) {
        java.lang.Object[] objArr = this.f17026d;
        if (objArr.length == 1 && tVar.f17026d.length == 2 && tVar.f17024b == 0) {
            tVar.f17023a = this.f17024b;
            return tVar;
        }
        if (this.f17025c == eVar) {
            objArr[i6] = tVar;
            return this;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i6] = tVar;
        return new p001a0.t(this.f17023a, this.f17024b, objArrCopyOf, eVar);
    }

    private final p001a0.t M(int i6, java.lang.Object obj, p001a0.f fVar) {
        if (this.f17025c == fVar.h()) {
            this.f17026d[i6 + 1] = obj;
            return this;
        }
        fVar.k(fVar.f() + 1);
        java.lang.Object[] objArr = this.f17026d;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i6 + 1] = obj;
        return new p001a0.t(this.f17023a, this.f17024b, objArrCopyOf, fVar.h());
    }

    private final p001a0.t R(int i6, int i10) {
        java.lang.Object[] objArr = this.f17026d;
        if (objArr.length == 2) {
            return null;
        }
        return new p001a0.t(i10 ^ this.f17023a, this.f17024b, p001a0.x.h(objArr, i6));
    }

    private final p001a0.t S(int i6, int i10) {
        java.lang.Object[] objArr = this.f17026d;
        if (objArr.length == 1) {
            return null;
        }
        return new p001a0.t(this.f17023a, i10 ^ this.f17024b, p001a0.x.i(objArr, i6));
    }

    private final p001a0.t T(p001a0.t tVar, p001a0.t tVar2, int i6, int i10) {
        if (tVar2 == null) {
            return S(i6, i10);
        }
        return tVar != tVar2 ? U(i6, i10, tVar2) : this;
    }

    private final p001a0.t U(int i6, int i10, p001a0.t tVar) {
        java.lang.Object[] objArr = tVar.f17026d;
        if (objArr.length != 2 || tVar.f17024b != 0) {
            java.lang.Object[] objArr2 = this.f17026d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i6] = tVar;
            return new p001a0.t(this.f17023a, this.f17024b, objArrCopyOf);
        }
        if (this.f17026d.length == 1) {
            tVar.f17023a = this.f17024b;
            return tVar;
        }
        return new p001a0.t(this.f17023a ^ i10, i10 ^ this.f17024b, p001a0.x.k(this.f17026d, i6, n(i10), objArr[0], objArr[1]));
    }

    private final p001a0.t V(int i6, java.lang.Object obj) {
        java.lang.Object[] objArr = this.f17026d;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i6 + 1] = obj;
        return new p001a0.t(this.f17023a, this.f17024b, objArrCopyOf);
    }

    private final java.lang.Object W(int i6) {
        return this.f17026d[i6 + 1];
    }

    private final a0.t.b b() {
        return new a0.t.b(this, 1);
    }

    private final a0.t.b c() {
        return new a0.t.b(this, 0);
    }

    private final java.lang.Object[] d(int i6, int i10, int i11, java.lang.Object obj, java.lang.Object obj2, int i12, p021c0.e eVar) {
        java.lang.Object objT = t(i6);
        return p001a0.x.j(this.f17026d, i6, O(i10) + 1, u(objT != null ? objT.hashCode() : 0, objT, W(i6), i11, obj, obj2, i12 + 5, eVar));
    }

    private final int e() {
        if (this.f17024b == 0) {
            return this.f17026d.length / 2;
        }
        int iBitCount = java.lang.Integer.bitCount(this.f17023a);
        int length = this.f17026d.length;
        for (int i6 = iBitCount * 2; i6 < length; i6++) {
            iBitCount += N(i6).e();
        }
        return iBitCount;
    }

    private final boolean f(java.lang.Object obj) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (!p247y7.AbstractC7350t.b(obj, this.f17026d[iF])) {
                if (iF != iG) {
                    iF += iO;
                }
            }
            return true;
        }
        return false;
    }

    private final java.lang.Object g(java.lang.Object obj) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO <= 0 || iF > iG) && (iO >= 0 || iG > iF)) {
            return null;
        }
        while (!p247y7.AbstractC7350t.b(obj, t(iF))) {
            if (iF == iG) {
                return null;
            }
            iF += iO;
        }
        return W(iF);
    }

    private final a0.t.b h(java.lang.Object obj, java.lang.Object obj2) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (!p247y7.AbstractC7350t.b(obj, t(iF))) {
                if (iF != iG) {
                    iF += iO;
                }
            }
            if (obj2 == W(iF)) {
                return null;
            }
            java.lang.Object[] objArr = this.f17026d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iF + 1] = obj2;
            return new p001a0.t(0, 0, objArrCopyOf).c();
        }
        return new p001a0.t(0, 0, p001a0.x.g(this.f17026d, 0, obj, obj2)).b();
    }

    private final p001a0.t i(java.lang.Object obj) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (!p247y7.AbstractC7350t.b(obj, t(iF))) {
                if (iF != iG) {
                    iF += iO;
                }
            }
            return j(iF);
        }
        return this;
    }

    private final p001a0.t j(int i6) {
        java.lang.Object[] objArr = this.f17026d;
        if (objArr.length == 2) {
            return null;
        }
        return new p001a0.t(0, 0, p001a0.x.h(objArr, i6));
    }

    private final boolean l(p001a0.t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f17024b != tVar.f17024b || this.f17023a != tVar.f17023a) {
            return false;
        }
        int length = this.f17026d.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (this.f17026d[i6] != tVar.f17026d[i6]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i6) {
        return (i6 & this.f17024b) != 0;
    }

    private final p001a0.t s(int i6, java.lang.Object obj, java.lang.Object obj2) {
        return new p001a0.t(i6 | this.f17023a, this.f17024b, p001a0.x.g(this.f17026d, n(i6), obj, obj2));
    }

    private final java.lang.Object t(int i6) {
        return this.f17026d[i6];
    }

    private final p001a0.t u(int i6, java.lang.Object obj, java.lang.Object obj2, int i10, java.lang.Object obj3, java.lang.Object obj4, int i11, p021c0.e eVar) {
        if (i11 > 30) {
            return new p001a0.t(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iF = p001a0.x.f(i6, i11);
        int iF2 = p001a0.x.f(i10, i11);
        if (iF == iF2) {
            return new p001a0.t(0, 1 << iF, new java.lang.Object[]{u(i6, obj, obj2, i10, obj3, obj4, i11 + 5, eVar)}, eVar);
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        if (iF < iF2) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new p001a0.t((1 << iF) | (1 << iF2), 0, objArr, eVar);
    }

    private final p001a0.t v(int i6, int i10, int i11, java.lang.Object obj, java.lang.Object obj2, int i12) {
        return new p001a0.t(this.f17023a ^ i10, i10 | this.f17024b, d(i6, i10, i11, obj, obj2, i12, null));
    }

    private final p001a0.t w(java.lang.Object obj, java.lang.Object obj2, p001a0.f fVar) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (!p247y7.AbstractC7350t.b(obj, t(iF))) {
                if (iF != iG) {
                    iF += iO;
                }
            }
            fVar.l(W(iF));
            if (this.f17025c == fVar.h()) {
                this.f17026d[iF + 1] = obj2;
                return this;
            }
            fVar.k(fVar.f() + 1);
            java.lang.Object[] objArr = this.f17026d;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iF + 1] = obj2;
            return new p001a0.t(0, 0, objArrCopyOf, fVar.h());
        }
        fVar.o(fVar.size() + 1);
        return new p001a0.t(0, 0, p001a0.x.g(this.f17026d, 0, obj, obj2), fVar.h());
    }

    private final p001a0.t x(p001a0.t tVar, p021c0.b bVar, p021c0.e eVar) {
        p021c0.a.a(this.f17024b == 0);
        p021c0.a.a(this.f17023a == 0);
        p021c0.a.a(tVar.f17024b == 0);
        p021c0.a.a(tVar.f17023a == 0);
        java.lang.Object[] objArr = this.f17026d;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length + tVar.f17026d.length);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f17026d.length;
        E7.g gVarP = E7.j.p(E7.j.q(0, tVar.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (true) {
                if (f(tVar.f17026d[iF])) {
                    bVar.c(bVar.a() + 1);
                } else {
                    java.lang.Object[] objArr2 = tVar.f17026d;
                    objArrCopyOf[length] = objArr2[iF];
                    objArrCopyOf[length + 1] = objArr2[iF + 1];
                    length += 2;
                }
                if (iF == iG) {
                    break;
                }
                iF += iO;
            }
        }
        if (length == this.f17026d.length) {
            return this;
        }
        if (length == tVar.f17026d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new p001a0.t(0, 0, objArrCopyOf, eVar);
        }
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, length);
        p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(this, newSize)");
        return new p001a0.t(0, 0, objArrCopyOf2, eVar);
    }

    private final p001a0.t y(java.lang.Object obj, p001a0.f fVar) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (!p247y7.AbstractC7350t.b(obj, t(iF))) {
                if (iF != iG) {
                    iF += iO;
                }
            }
            return A(iF, fVar);
        }
        return this;
    }

    private final p001a0.t z(java.lang.Object obj, java.lang.Object obj2, p001a0.f fVar) {
        E7.g gVarP = E7.j.p(E7.j.q(0, this.f17026d.length), 2);
        int iF = gVarP.f();
        int iG = gVarP.g();
        int iO = gVarP.o();
        if ((iO > 0 && iF <= iG) || (iO < 0 && iG <= iF)) {
            while (true) {
                if (p247y7.AbstractC7350t.b(obj, t(iF)) && p247y7.AbstractC7350t.b(obj2, W(iF))) {
                    return A(iF, fVar);
                }
                if (iF != iG) {
                    iF += iO;
                }
            }
        }
        return this;
    }

    public final p001a0.t D(int i6, java.lang.Object obj, java.lang.Object obj2, int i10, p001a0.f fVar) {
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            int iN = n(iF);
            if (p247y7.AbstractC7350t.b(obj, t(iN))) {
                fVar.l(W(iN));
                return W(iN) == obj2 ? this : M(iN, obj2, fVar);
            }
            fVar.o(fVar.size() + 1);
            return C(iN, iF, i6, obj, obj2, i10, fVar.h());
        }
        if (!r(iF)) {
            fVar.o(fVar.size() + 1);
            return B(iF, obj, obj2, fVar.h());
        }
        int iO = O(iF);
        p001a0.t tVarN = N(iO);
        p001a0.t tVarW = i10 == 30 ? tVarN.w(obj, obj2, fVar) : tVarN.D(i6, obj, obj2, i10 + 5, fVar);
        return tVarN == tVarW ? this : L(iO, tVarW, fVar.h());
    }

    public final p001a0.t E(p001a0.t tVar, int i6, p021c0.b bVar, p001a0.f fVar) {
        if (this == tVar) {
            bVar.b(e());
            return this;
        }
        if (i6 > 30) {
            return x(tVar, bVar, fVar.h());
        }
        int i10 = this.f17024b | tVar.f17024b;
        int i11 = this.f17023a;
        int i12 = tVar.f17023a;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int iLowestOneBit = java.lang.Integer.lowestOneBit(i14);
            if (p247y7.AbstractC7350t.b(t(n(iLowestOneBit)), tVar.t(tVar.n(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i10 |= iLowestOneBit;
            }
            i14 ^= iLowestOneBit;
        }
        int i16 = 0;
        if (!((i10 & i15) == 0)) {
            V.I0.b("Check failed.");
        }
        p001a0.t tVar2 = (p247y7.AbstractC7350t.b(this.f17025c, fVar.h()) && this.f17023a == i15 && this.f17024b == i10) ? this : new p001a0.t(i15, i10, new java.lang.Object[(java.lang.Integer.bitCount(i15) * 2) + java.lang.Integer.bitCount(i10)]);
        int i17 = i10;
        int i18 = 0;
        while (i17 != 0) {
            int iLowestOneBit2 = java.lang.Integer.lowestOneBit(i17);
            java.lang.Object[] objArr = tVar2.f17026d;
            objArr[(objArr.length - 1) - i18] = F(tVar, iLowestOneBit2, i6, bVar, fVar);
            i18++;
            i17 ^= iLowestOneBit2;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = java.lang.Integer.lowestOneBit(i15);
            int i19 = i16 * 2;
            if (tVar.q(iLowestOneBit3)) {
                int iN = tVar.n(iLowestOneBit3);
                tVar2.f17026d[i19] = tVar.t(iN);
                tVar2.f17026d[i19 + 1] = tVar.W(iN);
                if (q(iLowestOneBit3)) {
                    bVar.c(bVar.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                tVar2.f17026d[i19] = t(iN2);
                tVar2.f17026d[i19 + 1] = W(iN2);
            }
            i16++;
            i15 ^= iLowestOneBit3;
        }
        if (l(tVar2)) {
            return this;
        }
        return tVar.l(tVar2) ? tVar : tVar2;
    }

    public final p001a0.t G(int i6, java.lang.Object obj, int i10, p001a0.f fVar) {
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            int iN = n(iF);
            return p247y7.AbstractC7350t.b(obj, t(iN)) ? I(iN, iF, fVar) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        p001a0.t tVarN = N(iO);
        return K(tVarN, i10 == 30 ? tVarN.y(obj, fVar) : tVarN.G(i6, obj, i10 + 5, fVar), iO, iF, fVar.h());
    }

    public final p001a0.t H(int i6, java.lang.Object obj, java.lang.Object obj2, int i10, p001a0.f fVar) {
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            int iN = n(iF);
            return (p247y7.AbstractC7350t.b(obj, t(iN)) && p247y7.AbstractC7350t.b(obj2, W(iN))) ? I(iN, iF, fVar) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        p001a0.t tVarN = N(iO);
        return K(tVarN, i10 == 30 ? tVarN.z(obj, obj2, fVar) : tVarN.H(i6, obj, obj2, i10 + 5, fVar), iO, iF, fVar.h());
    }

    public final p001a0.t N(int i6) {
        java.lang.Object obj = this.f17026d[i6];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (p001a0.t) obj;
    }

    public final int O(int i6) {
        return (this.f17026d.length - 1) - java.lang.Integer.bitCount((i6 - 1) & this.f17024b);
    }

    public final a0.t.b P(int i6, java.lang.Object obj, java.lang.Object obj2, int i10) {
        a0.t.b bVarP;
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            int iN = n(iF);
            if (!p247y7.AbstractC7350t.b(obj, t(iN))) {
                return v(iN, iF, i6, obj, obj2, i10).b();
            }
            if (W(iN) == obj2) {
                return null;
            }
            return V(iN, obj2).c();
        }
        if (!r(iF)) {
            return s(iF, obj, obj2).b();
        }
        int iO = O(iF);
        p001a0.t tVarN = N(iO);
        if (i10 == 30) {
            bVarP = tVarN.h(obj, obj2);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = tVarN.P(i6, obj, obj2, i10 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final p001a0.t Q(int i6, java.lang.Object obj, int i10) {
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            int iN = n(iF);
            return p247y7.AbstractC7350t.b(obj, t(iN)) ? R(iN, iF) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        p001a0.t tVarN = N(iO);
        return T(tVarN, i10 == 30 ? tVarN.i(obj) : tVarN.Q(i6, obj, i10 + 5), iO, iF);
    }

    public final boolean k(int i6, java.lang.Object obj, int i10) {
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            return p247y7.AbstractC7350t.b(obj, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        p001a0.t tVarN = N(O(iF));
        return i10 == 30 ? tVarN.f(obj) : tVarN.k(i6, obj, i10 + 5);
    }

    public final int m() {
        return java.lang.Integer.bitCount(this.f17023a);
    }

    public final int n(int i6) {
        return java.lang.Integer.bitCount((i6 - 1) & this.f17023a) * 2;
    }

    public final java.lang.Object o(int i6, java.lang.Object obj, int i10) {
        int iF = 1 << p001a0.x.f(i6, i10);
        if (q(iF)) {
            int iN = n(iF);
            if (p247y7.AbstractC7350t.b(obj, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        p001a0.t tVarN = N(O(iF));
        return i10 == 30 ? tVarN.g(obj) : tVarN.o(i6, obj, i10 + 5);
    }

    public final java.lang.Object[] p() {
        return this.f17026d;
    }

    public final boolean q(int i6) {
        return (i6 & this.f17023a) != 0;
    }
}
