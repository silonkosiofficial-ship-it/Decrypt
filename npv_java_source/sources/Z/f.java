package Z;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p097j7.AbstractC6866h implements Y.f.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Y.f f16637C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f16638D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Object[] f16639E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f16640F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p021c0.e f16641G = new p021c0.e();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.lang.Object[] f16642H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.Object[] f16643I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f16644J;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.Collection f16645D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.Collection collection) {
            super(1);
            this.f16645D = collection;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(this.f16645D.contains(obj));
        }
    }

    public f(Y.f fVar, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6) {
        this.f16637C = fVar;
        this.f16638D = objArr;
        this.f16639E = objArr2;
        this.f16640F = i6;
        this.f16642H = this.f16638D;
        this.f16643I = this.f16639E;
        this.f16644J = this.f16637C.size();
    }

    private final void E(java.util.Collection collection, int i6, int i10, java.lang.Object[][] objArr, int i11, java.lang.Object[] objArr2) {
        if (this.f16642H == null) {
            throw new java.lang.IllegalStateException("root is null".toString());
        }
        int i12 = i6 >> 5;
        java.lang.Object[] objArrL0 = l0(i12, i10, objArr, i11, objArr2);
        int iJ0 = i11 - (((j0() >> 5) - 1) - i12);
        if (iJ0 < i11) {
            objArr2 = objArr[iJ0];
            p247y7.AbstractC7350t.c(objArr2);
        }
        m0(collection, i6, objArrL0, 32, objArr, iJ0, objArr2);
    }

    private final java.lang.Object[] M(java.lang.Object[] objArr, int i6, int i10, java.lang.Object obj, Z.d dVar) {
        java.lang.Object obj2;
        int iA = Z.l.a(i10, i6);
        if (i6 == 0) {
            dVar.b(objArr[31]);
            java.lang.Object[] objArrL = p097j7.AbstractC6872n.l(objArr, Q(objArr), iA + 1, iA, 31);
            objArrL[iA] = obj;
            return objArrL;
        }
        java.lang.Object[] objArrQ = Q(objArr);
        int i11 = i6 - 5;
        java.lang.Object obj3 = objArrQ[iA];
        p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrQ[iA] = M((java.lang.Object[]) obj3, i11, i10, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrQ[iA]) == null) {
                break;
            }
            p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ[iA] = M((java.lang.Object[]) obj2, i11, 0, dVar.a(), dVar);
        }
        return objArrQ;
    }

    private final void N(java.lang.Object[] objArr, int i6, java.lang.Object obj) {
        int iN0 = n0();
        java.lang.Object[] objArrQ = Q(this.f16643I);
        if (iN0 < 32) {
            p097j7.AbstractC6872n.l(this.f16643I, objArrQ, i6 + 1, i6, iN0);
            objArrQ[i6] = obj;
            this.f16642H = objArr;
            this.f16643I = objArrQ;
            this.f16644J = size() + 1;
            return;
        }
        java.lang.Object[] objArr2 = this.f16643I;
        java.lang.Object obj2 = objArr2[31];
        p097j7.AbstractC6872n.l(objArr2, objArrQ, i6 + 1, i6, 31);
        objArrQ[i6] = obj;
        Z(objArr, objArrQ, T(obj2));
    }

    private final boolean O(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f16641G;
    }

    private final java.util.ListIterator P(int i6) {
        java.lang.Object[] objArr = this.f16642H;
        if (objArr == null) {
            throw new java.lang.IllegalStateException("Invalid root".toString());
        }
        int iJ0 = j0() >> 5;
        p021c0.d.b(i6, iJ0);
        int i10 = this.f16640F;
        return i10 == 0 ? new Z.i(objArr, i6) : new Z.k(objArr, i6, iJ0, i10 / 5);
    }

    private final java.lang.Object[] Q(java.lang.Object[] objArr) {
        if (objArr == null) {
            return S();
        }
        return O(objArr) ? objArr : p097j7.AbstractC6872n.p(objArr, S(), 0, 0, E7.j.g(objArr.length, 32), 6, null);
    }

    private final java.lang.Object[] R(java.lang.Object[] objArr, int i6) {
        return O(objArr) ? p097j7.AbstractC6872n.l(objArr, objArr, i6, 0, 32 - i6) : p097j7.AbstractC6872n.l(objArr, S(), i6, 0, 32 - i6);
    }

    private final java.lang.Object[] S() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.f16641G;
        return objArr;
    }

    private final java.lang.Object[] T(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.f16641G;
        return objArr;
    }

    private final java.lang.Object[] U(java.lang.Object[] objArr, int i6, int i10) {
        if (!(i10 >= 0)) {
            V.I0.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int iA = Z.l.a(i6, i10);
        java.lang.Object obj = objArr[iA];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object objU = U((java.lang.Object[]) obj, i6, i10 - 5);
        if (iA < 31) {
            int i11 = iA + 1;
            if (objArr[i11] != null) {
                if (O(objArr)) {
                    p097j7.AbstractC6872n.w(objArr, null, i11, 32);
                }
                objArr = p097j7.AbstractC6872n.l(objArr, S(), 0, 0, i11);
            }
        }
        if (objU == objArr[iA]) {
            return objArr;
        }
        java.lang.Object[] objArrQ = Q(objArr);
        objArrQ[iA] = objU;
        return objArrQ;
    }

    private final java.lang.Object[] V(java.lang.Object[] objArr, int i6, int i10, Z.d dVar) {
        java.lang.Object[] objArrV;
        int iA = Z.l.a(i10 - 1, i6);
        if (i6 == 5) {
            dVar.b(objArr[iA]);
            objArrV = null;
        } else {
            java.lang.Object obj = objArr[iA];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrV = V((java.lang.Object[]) obj, i6 - 5, i10, dVar);
        }
        if (objArrV == null && iA == 0) {
            return null;
        }
        java.lang.Object[] objArrQ = Q(objArr);
        objArrQ[iA] = objArrV;
        return objArrQ;
    }

    private final void W(java.lang.Object[] objArr, int i6, int i10) {
        if (i10 == 0) {
            this.f16642H = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.f16643I = objArr;
            this.f16644J = i6;
            this.f16640F = i10;
            return;
        }
        Z.d dVar = new Z.d(null);
        p247y7.AbstractC7350t.c(objArr);
        java.lang.Object[] objArrV = V(objArr, i10, i6, dVar);
        p247y7.AbstractC7350t.c(objArrV);
        java.lang.Object objA = dVar.a();
        p247y7.AbstractC7350t.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f16643I = (java.lang.Object[]) objA;
        this.f16644J = i6;
        if (objArrV[1] == null) {
            this.f16642H = (java.lang.Object[]) objArrV[0];
            i10 -= 5;
        } else {
            this.f16642H = objArrV;
        }
        this.f16640F = i10;
    }

    private final java.lang.Object[] X(java.lang.Object[] objArr, int i6, int i10, java.util.Iterator it) {
        if (!it.hasNext()) {
            V.I0.a("invalid buffersIterator");
        }
        if (!(i10 >= 0)) {
            V.I0.a("negative shift");
        }
        if (i10 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] objArrQ = Q(objArr);
        int iA = Z.l.a(i6, i10);
        int i11 = i10 - 5;
        objArrQ[iA] = X((java.lang.Object[]) objArrQ[iA], i6, i11, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iA] = X((java.lang.Object[]) objArrQ[iA], 0, i11, it);
        }
        return objArrQ;
    }

    private final java.lang.Object[] Y(java.lang.Object[] objArr, int i6, java.lang.Object[][] objArr2) {
        java.util.Iterator itA = p247y7.AbstractC7334c.a(objArr2);
        int i10 = i6 >> 5;
        int i11 = this.f16640F;
        java.lang.Object[] objArrX = i10 < (1 << i11) ? X(objArr, i6, i11, itA) : Q(objArr);
        while (itA.hasNext()) {
            this.f16640F += 5;
            objArrX = T(objArrX);
            int i12 = this.f16640F;
            X(objArrX, 1 << i12, i12, itA);
        }
        return objArrX;
    }

    private final void Z(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int size = size() >> 5;
        int i6 = this.f16640F;
        if (size > (1 << i6)) {
            this.f16642H = a0(T(objArr), objArr2, this.f16640F + 5);
            this.f16643I = objArr3;
            this.f16640F += 5;
        } else {
            if (objArr == null) {
                this.f16642H = objArr2;
            } else {
                this.f16642H = a0(objArr, objArr2, i6);
            }
            this.f16643I = objArr3;
        }
        this.f16644J = size() + 1;
    }

    private final java.lang.Object[] a0(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6) {
        int iA = Z.l.a(size() - 1, i6);
        java.lang.Object[] objArrQ = Q(objArr);
        if (i6 == 5) {
            objArrQ[iA] = objArr2;
        } else {
            objArrQ[iA] = a0((java.lang.Object[]) objArrQ[iA], objArr2, i6 - 5);
        }
        return objArrQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int b0(p237x7.l lVar, java.lang.Object[] objArr, int i6, int i10, Z.d dVar, java.util.List list, java.util.List list2) {
        if (O(objArr)) {
            list.add(objArr);
        }
        java.lang.Object objA = dVar.a();
        p247y7.AbstractC7350t.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr2 = (java.lang.Object[]) objA;
        java.lang.Object[] objArrS = objArr2;
        for (int i11 = 0; i11 < i6; i11++) {
            java.lang.Object obj = objArr[i11];
            if (!((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                if (i10 == 32) {
                    objArrS = list.isEmpty() ^ true ? (java.lang.Object[]) list.remove(list.size() - 1) : S();
                    i10 = 0;
                }
                objArrS[i10] = obj;
                i10++;
            }
        }
        dVar.b(objArrS);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i10;
    }

    private final int c0(p237x7.l lVar, java.lang.Object[] objArr, int i6, Z.d dVar) {
        java.lang.Object[] objArrQ = objArr;
        int i10 = i6;
        boolean z6 = false;
        for (int i11 = 0; i11 < i6; i11++) {
            java.lang.Object obj = objArr[i11];
            if (((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                if (!z6) {
                    objArrQ = Q(objArr);
                    z6 = true;
                    i10 = i11;
                }
            } else if (z6) {
                objArrQ[i10] = obj;
                i10++;
            }
        }
        dVar.b(objArrQ);
        return i10;
    }

    private final boolean d0(p237x7.l lVar) {
        java.lang.Object[] objArrX;
        int iN0 = n0();
        Z.d dVar = new Z.d(null);
        if (this.f16642H == null) {
            return e0(lVar, iN0, dVar) != iN0;
        }
        java.util.ListIterator listIteratorP = P(0);
        int iC0 = 32;
        while (iC0 == 32 && listIteratorP.hasNext()) {
            iC0 = c0(lVar, (java.lang.Object[]) listIteratorP.next(), 32, dVar);
        }
        if (iC0 == 32) {
            p021c0.a.a(!listIteratorP.hasNext());
            int iE0 = e0(lVar, iN0, dVar);
            if (iE0 == 0) {
                W(this.f16642H, size(), this.f16640F);
            }
            return iE0 != iN0;
        }
        int iPreviousIndex = listIteratorP.previousIndex() << 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int iB0 = iC0;
        while (listIteratorP.hasNext()) {
            iB0 = b0(lVar, (java.lang.Object[]) listIteratorP.next(), 32, iB0, dVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i6 = iPreviousIndex;
        int iB1 = b0(lVar, this.f16643I, iN0, iB0, dVar, arrayList2, arrayList);
        java.lang.Object objA = dVar.a();
        p247y7.AbstractC7350t.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr = (java.lang.Object[]) objA;
        p097j7.AbstractC6872n.w(objArr, null, iB1, 32);
        if (arrayList.isEmpty()) {
            objArrX = this.f16642H;
            p247y7.AbstractC7350t.c(objArrX);
        } else {
            objArrX = X(this.f16642H, i6, this.f16640F, arrayList.iterator());
        }
        int size = i6 + (arrayList.size() << 5);
        this.f16642H = i0(objArrX, size);
        this.f16643I = objArr;
        this.f16644J = size + iB1;
        return true;
    }

    private final int e0(p237x7.l lVar, int i6, Z.d dVar) {
        int iC0 = c0(lVar, this.f16643I, i6, dVar);
        if (iC0 == i6) {
            p021c0.a.a(dVar.a() == this.f16643I);
            return i6;
        }
        java.lang.Object objA = dVar.a();
        p247y7.AbstractC7350t.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr = (java.lang.Object[]) objA;
        p097j7.AbstractC6872n.w(objArr, null, iC0, i6);
        this.f16643I = objArr;
        this.f16644J = size() - (i6 - iC0);
        return iC0;
    }

    private final java.lang.Object[] f(int i6) {
        if (j0() <= i6) {
            return this.f16643I;
        }
        java.lang.Object[] objArr = this.f16642H;
        p247y7.AbstractC7350t.c(objArr);
        for (int i10 = this.f16640F; i10 > 0; i10 -= 5) {
            java.lang.Object[] objArr2 = objArr[Z.l.a(i6, i10)];
            p247y7.AbstractC7350t.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final java.lang.Object[] g(java.lang.Object[] objArr, int i6, java.util.Iterator it) {
        while (i6 < 32 && it.hasNext()) {
            objArr[i6] = it.next();
            i6++;
        }
        return objArr;
    }

    private final java.lang.Object[] g0(java.lang.Object[] objArr, int i6, int i10, Z.d dVar) {
        int iA = Z.l.a(i10, i6);
        if (i6 == 0) {
            java.lang.Object obj = objArr[iA];
            java.lang.Object[] objArrL = p097j7.AbstractC6872n.l(objArr, Q(objArr), iA, iA + 1, 32);
            objArrL[31] = dVar.a();
            dVar.b(obj);
            return objArrL;
        }
        int iA2 = objArr[31] == null ? Z.l.a(j0() - 1, i6) : 31;
        java.lang.Object[] objArrQ = Q(objArr);
        int i11 = i6 - 5;
        int i12 = iA + 1;
        if (i12 <= iA2) {
            while (true) {
                java.lang.Object obj2 = objArrQ[iA2];
                p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrQ[iA2] = g0((java.lang.Object[]) obj2, i11, 0, dVar);
                if (iA2 == i12) {
                    break;
                }
                iA2--;
            }
        }
        java.lang.Object obj3 = objArrQ[iA];
        p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrQ[iA] = g0((java.lang.Object[]) obj3, i11, i10, dVar);
        return objArrQ;
    }

    private final java.lang.Object h0(java.lang.Object[] objArr, int i6, int i10, int i11) {
        int size = size() - i6;
        p021c0.a.a(i11 < size);
        if (size == 1) {
            java.lang.Object obj = this.f16643I[0];
            W(objArr, i6, i10);
            return obj;
        }
        java.lang.Object[] objArr2 = this.f16643I;
        java.lang.Object obj2 = objArr2[i11];
        java.lang.Object[] objArrL = p097j7.AbstractC6872n.l(objArr2, Q(objArr2), i11, i11 + 1, size);
        objArrL[size - 1] = null;
        this.f16642H = objArr;
        this.f16643I = objArrL;
        this.f16644J = (i6 + size) - 1;
        this.f16640F = i10;
        return obj2;
    }

    private final java.lang.Object[] i0(java.lang.Object[] objArr, int i6) {
        if (!((i6 & 31) == 0)) {
            V.I0.a("invalid size");
        }
        if (i6 == 0) {
            this.f16640F = 0;
            return null;
        }
        int i10 = i6 - 1;
        while (true) {
            int i11 = this.f16640F;
            if ((i10 >> i11) != 0) {
                return U(objArr, i10, i11);
            }
            this.f16640F = i11 - 5;
            java.lang.Object[] objArr2 = objArr[0];
            p247y7.AbstractC7350t.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int j0() {
        if (size() <= 32) {
            return 0;
        }
        return Z.l.d(size());
    }

    private final java.lang.Object[] k0(java.lang.Object[] objArr, int i6, int i10, java.lang.Object obj, Z.d dVar) {
        int iA = Z.l.a(i10, i6);
        java.lang.Object[] objArrQ = Q(objArr);
        if (i6 != 0) {
            java.lang.Object obj2 = objArrQ[iA];
            p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ[iA] = k0((java.lang.Object[]) obj2, i6 - 5, i10, obj, dVar);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((java.util.AbstractList) this).modCount++;
        }
        dVar.b(objArrQ[iA]);
        objArrQ[iA] = obj;
        return objArrQ;
    }

    private final java.lang.Object[] l0(int i6, int i10, java.lang.Object[][] objArr, int i11, java.lang.Object[] objArr2) {
        if (this.f16642H == null) {
            throw new java.lang.IllegalStateException("root is null".toString());
        }
        java.util.ListIterator listIteratorP = P(j0() >> 5);
        while (listIteratorP.previousIndex() != i6) {
            java.lang.Object[] objArr3 = (java.lang.Object[]) listIteratorP.previous();
            p097j7.AbstractC6872n.l(objArr3, objArr2, 0, 32 - i10, 32);
            objArr2 = R(objArr3, i10);
            i11--;
            objArr[i11] = objArr2;
        }
        return (java.lang.Object[]) listIteratorP.previous();
    }

    private final void m0(java.util.Collection collection, int i6, java.lang.Object[] objArr, int i10, java.lang.Object[][] objArr2, int i11, java.lang.Object[] objArr3) {
        java.lang.Object[] objArrS;
        if (!(i11 >= 1)) {
            V.I0.a("requires at least one nullBuffer");
        }
        java.lang.Object[] objArrQ = Q(objArr);
        objArr2[0] = objArrQ;
        int i12 = i6 & 31;
        int size = ((i6 + collection.size()) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            p097j7.AbstractC6872n.l(objArrQ, objArr3, size + 1, i12, i10);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = S();
                i11--;
                objArr2[i11] = objArrS;
            }
            int i15 = i10 - i14;
            p097j7.AbstractC6872n.l(objArrQ, objArr3, 0, i15, i10);
            p097j7.AbstractC6872n.l(objArrQ, objArrS, size + 1, i12, i15);
            objArr3 = objArrS;
        }
        java.util.Iterator it = collection.iterator();
        g(objArrQ, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            objArr2[i16] = g(S(), 0, it);
        }
        g(objArr3, 0, it);
    }

    private final int n0() {
        return o0(size());
    }

    private final int o0(int i6) {
        return i6 <= 32 ? i6 : i6 - Z.l.d(i6);
    }

    public final int C() {
        return this.f16640F;
    }

    public final java.lang.Object[] D() {
        return this.f16643I;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i6, java.lang.Object obj) {
        p021c0.d.b(i6, size());
        if (i6 == size()) {
            add(obj);
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        int iJ0 = j0();
        if (i6 >= iJ0) {
            N(this.f16642H, i6 - iJ0, obj);
            return;
        }
        Z.d dVar = new Z.d(null);
        java.lang.Object[] objArr = this.f16642H;
        p247y7.AbstractC7350t.c(objArr);
        N(M(objArr, this.f16640F, i6, obj, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        int iN0 = n0();
        if (iN0 < 32) {
            java.lang.Object[] objArrQ = Q(this.f16643I);
            objArrQ[iN0] = obj;
            this.f16643I = objArrQ;
            this.f16644J = size() + 1;
        } else {
            Z(this.f16642H, this.f16643I, T(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i6, java.util.Collection collection) {
        java.lang.Object[] objArrL;
        p021c0.d.b(i6, size());
        if (i6 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int i10 = (i6 >> 5) << 5;
        int size = (((size() - i10) + collection.size()) - 1) / 32;
        if (size == 0) {
            p021c0.a.a(i6 >= j0());
            int i11 = i6 & 31;
            int size2 = ((i6 + collection.size()) - 1) & 31;
            java.lang.Object[] objArr = this.f16643I;
            java.lang.Object[] objArrL2 = p097j7.AbstractC6872n.l(objArr, Q(objArr), size2 + 1, i11, n0());
            g(objArrL2, i11, collection.iterator());
            this.f16643I = objArrL2;
        } else {
            java.lang.Object[][] objArr2 = new java.lang.Object[size][];
            int iN0 = n0();
            int iO0 = o0(size() + collection.size());
            if (i6 >= j0()) {
                objArrL = S();
                m0(collection, i6, this.f16643I, iN0, objArr2, size, objArrL);
            } else if (iO0 > iN0) {
                int i12 = iO0 - iN0;
                objArrL = R(this.f16643I, i12);
                E(collection, i6, i12, objArr2, size, objArrL);
            } else {
                int i13 = iN0 - iO0;
                objArrL = p097j7.AbstractC6872n.l(this.f16643I, S(), 0, i13, iN0);
                int i14 = 32 - i13;
                java.lang.Object[] objArrR = R(this.f16643I, i14);
                int i15 = size - 1;
                objArr2[i15] = objArrR;
                E(collection, i6, i14, objArr2, i15, objArrR);
            }
            this.f16642H = Y(this.f16642H, i10, objArr2);
            this.f16643I = objArrL;
        }
        this.f16644J = size() + collection.size();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int iN0 = n0();
        java.util.Iterator it = collection.iterator();
        if (32 - iN0 >= collection.size()) {
            this.f16643I = g(Q(this.f16643I), iN0, it);
        } else {
            int size = ((collection.size() + iN0) - 1) / 32;
            java.lang.Object[][] objArr = new java.lang.Object[size][];
            objArr[0] = g(Q(this.f16643I), iN0, it);
            for (int i6 = 1; i6 < size; i6++) {
                objArr[i6] = g(S(), 0, it);
            }
            this.f16642H = Y(this.f16642H, j0(), objArr);
            this.f16643I = g(S(), 0, it);
        }
        this.f16644J = size() + collection.size();
        return true;
    }

    @Override // p097j7.AbstractC6866h
    public int d() {
        return this.f16644J;
    }

    @Override // p097j7.AbstractC6866h
    public java.lang.Object e(int i6) {
        p021c0.d.a(i6, size());
        ((java.util.AbstractList) this).modCount++;
        int iJ0 = j0();
        if (i6 >= iJ0) {
            return h0(this.f16642H, iJ0, this.f16640F, i6 - iJ0);
        }
        Z.d dVar = new Z.d(this.f16643I[0]);
        java.lang.Object[] objArr = this.f16642H;
        p247y7.AbstractC7350t.c(objArr);
        h0(g0(objArr, this.f16640F, i6, dVar), iJ0, this.f16640F, 0);
        return dVar.a();
    }

    public final boolean f0(p237x7.l lVar) {
        boolean zD0 = d0(lVar);
        if (zD0) {
            ((java.util.AbstractList) this).modCount++;
        }
        return zD0;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i6) {
        p021c0.d.a(i6, size());
        return f(i6)[i6 & 31];
    }

    @Override // Y.f.a
    public Y.f i() {
        Y.f eVar;
        if (this.f16642H == this.f16638D && this.f16643I == this.f16639E) {
            eVar = this.f16637C;
        } else {
            this.f16641G = new p021c0.e();
            java.lang.Object[] objArr = this.f16642H;
            this.f16638D = objArr;
            java.lang.Object[] objArr2 = this.f16643I;
            this.f16639E = objArr2;
            if (objArr != null) {
                java.lang.Object[] objArr3 = this.f16642H;
                p247y7.AbstractC7350t.c(objArr3);
                eVar = new Z.e(objArr3, this.f16643I, size(), this.f16640F);
            } else if (objArr2.length == 0) {
                eVar = Z.l.b();
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16643I, size());
                p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new Z.j(objArrCopyOf);
            }
        }
        this.f16637C = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        p021c0.d.b(i6, size());
        return new Z.h(this, i6);
    }

    public final int o() {
        return ((java.util.AbstractList) this).modCount;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        return f0(new Z.f.a(collection));
    }

    public final java.lang.Object[] s() {
        return this.f16642H;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i6, java.lang.Object obj) {
        p021c0.d.a(i6, size());
        if (j0() > i6) {
            Z.d dVar = new Z.d(null);
            java.lang.Object[] objArr = this.f16642H;
            p247y7.AbstractC7350t.c(objArr);
            this.f16642H = k0(objArr, this.f16640F, i6, obj, dVar);
            return dVar.a();
        }
        java.lang.Object[] objArrQ = Q(this.f16643I);
        if (objArrQ != this.f16643I) {
            ((java.util.AbstractList) this).modCount++;
        }
        int i10 = i6 & 31;
        java.lang.Object obj2 = objArrQ[i10];
        objArrQ[i10] = obj;
        this.f16643I = objArrQ;
        return obj2;
    }
}
