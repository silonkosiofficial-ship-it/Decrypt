package Z;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Z.b implements Y.f {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object[] f16633D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object[] f16634E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f16635F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f16636G;

    public e(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i6, int i10) {
        this.f16633D = objArr;
        this.f16634E = objArr2;
        this.f16635F = i6;
        this.f16636G = i10;
        if (!(size() > 32)) {
            V.I0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        p021c0.a.a(size() - Z.l.d(size()) <= E7.j.g(objArr2.length, 32));
    }

    private final java.lang.Object[] C(java.lang.Object[] objArr, int i6, int i10, java.lang.Object obj, Z.d dVar) {
        java.lang.Object[] objArrCopyOf;
        int iA = Z.l.a(i10, i6);
        if (i6 == 0) {
            if (iA == 0) {
                objArrCopyOf = new java.lang.Object[32];
            } else {
                objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
                p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            }
            p097j7.AbstractC6872n.l(objArr, objArrCopyOf, iA + 1, iA, 31);
            dVar.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(this, newSize)");
        int i11 = i6 - 5;
        java.lang.Object obj2 = objArr[iA];
        java.lang.String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = C((java.lang.Object[]) obj2, i11, i10, obj, dVar);
        int i12 = iA + 1;
        while (i12 < 32 && objArrCopyOf2[i12] != null) {
            java.lang.Object obj3 = objArr[i12];
            p247y7.AbstractC7350t.d(obj3, str);
            java.lang.Object[] objArr2 = objArrCopyOf2;
            objArr2[i12] = C((java.lang.Object[]) obj3, i11, 0, dVar.a(), dVar);
            i12++;
            objArrCopyOf2 = objArr2;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final Z.e D(java.lang.Object[] objArr, int i6, java.lang.Object obj) {
        int size = size() - R();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16634E, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            p097j7.AbstractC6872n.l(this.f16634E, objArrCopyOf, i6 + 1, i6, size);
            objArrCopyOf[i6] = obj;
            return new Z.e(objArr, objArrCopyOf, size() + 1, this.f16636G);
        }
        java.lang.Object[] objArr2 = this.f16634E;
        java.lang.Object obj2 = objArr2[31];
        p097j7.AbstractC6872n.l(objArr2, objArrCopyOf, i6 + 1, i6, size - 1);
        objArrCopyOf[i6] = obj;
        return N(objArr, objArrCopyOf, Z.l.c(obj2));
    }

    private final java.lang.Object[] E(java.lang.Object[] objArr, int i6, int i10, Z.d dVar) {
        java.lang.Object[] objArrE;
        int iA = Z.l.a(i10, i6);
        if (i6 == 5) {
            dVar.b(objArr[iA]);
            objArrE = null;
        } else {
            java.lang.Object obj = objArr[iA];
            p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrE = E((java.lang.Object[]) obj, i6 - 5, i10, dVar);
        }
        if (objArrE == null && iA == 0) {
            return null;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrE;
        return objArrCopyOf;
    }

    private final Y.f M(java.lang.Object[] objArr, int i6, int i10) {
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = java.util.Arrays.copyOf(objArr, 32);
                p247y7.AbstractC7350t.e(objArr, "copyOf(this, newSize)");
            }
            return new Z.j(objArr);
        }
        Z.d dVar = new Z.d(null);
        java.lang.Object[] objArrE = E(objArr, i10, i6 - 1, dVar);
        p247y7.AbstractC7350t.c(objArrE);
        java.lang.Object objA = dVar.a();
        p247y7.AbstractC7350t.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr2 = (java.lang.Object[]) objA;
        if (objArrE[1] != null) {
            return new Z.e(objArrE, objArr2, i6, i10);
        }
        java.lang.Object obj = objArrE[0];
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new Z.e((java.lang.Object[]) obj, objArr2, i6, i10 - 5);
    }

    private final Z.e N(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int size = size() >> 5;
        int i6 = this.f16636G;
        if (size <= (1 << i6)) {
            return new Z.e(O(objArr, i6, objArr2), objArr3, size() + 1, this.f16636G);
        }
        java.lang.Object[] objArrC = Z.l.c(objArr);
        int i10 = this.f16636G + 5;
        return new Z.e(O(objArrC, i10, objArr2), objArr3, size() + 1, i10);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private final java.lang.Object[] O(java.lang.Object[] objArr, int i6, java.lang.Object[] objArr2) {
        java.lang.Object[] objArrCopyOf;
        int iA = Z.l.a(size() - 1, i6);
        if (objArr != null) {
            objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new java.lang.Object[32];
            }
        } else {
            objArrCopyOf = new java.lang.Object[32];
        }
        if (i6 == 5) {
            objArrCopyOf[iA] = objArr2;
        } else {
            objArrCopyOf[iA] = O((java.lang.Object[]) objArrCopyOf[iA], i6 - 5, objArr2);
        }
        return objArrCopyOf;
    }

    private final java.lang.Object[] P(java.lang.Object[] objArr, int i6, int i10, Z.d dVar) {
        java.lang.Object[] objArrCopyOf;
        int iA = Z.l.a(i10, i6);
        if (i6 == 0) {
            if (iA == 0) {
                objArrCopyOf = new java.lang.Object[32];
            } else {
                objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
                p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            }
            p097j7.AbstractC6872n.l(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = dVar.a();
            dVar.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? Z.l.a(R() - 1, i6) : 31;
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(this, newSize)");
        int i11 = i6 - 5;
        int i12 = iA + 1;
        if (i12 <= iA2) {
            while (true) {
                java.lang.Object obj = objArrCopyOf2[iA2];
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = P((java.lang.Object[]) obj, i11, 0, dVar);
                if (iA2 == i12) {
                    break;
                }
                iA2--;
            }
        }
        java.lang.Object obj2 = objArrCopyOf2[iA];
        p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = P((java.lang.Object[]) obj2, i11, i10, dVar);
        return objArrCopyOf2;
    }

    private final Y.f Q(java.lang.Object[] objArr, int i6, int i10, int i11) {
        int size = size() - i6;
        p021c0.a.a(i11 < size);
        if (size == 1) {
            return M(objArr, i6, i10);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16634E, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        int i12 = size - 1;
        if (i11 < i12) {
            p097j7.AbstractC6872n.l(this.f16634E, objArrCopyOf, i11, i11 + 1, size);
        }
        objArrCopyOf[i12] = null;
        return new Z.e(objArr, objArrCopyOf, (i6 + size) - 1, i10);
    }

    private final int R() {
        return Z.l.d(size());
    }

    private final java.lang.Object[] S(java.lang.Object[] objArr, int i6, int i10, java.lang.Object obj) {
        int iA = Z.l.a(i10, i6);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        if (i6 == 0) {
            objArrCopyOf[iA] = obj;
        } else {
            java.lang.Object obj2 = objArrCopyOf[iA];
            p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iA] = S((java.lang.Object[]) obj2, i6 - 5, i10, obj);
        }
        return objArrCopyOf;
    }

    private final java.lang.Object[] o(int i6) {
        if (R() <= i6) {
            return this.f16634E;
        }
        java.lang.Object[] objArr = this.f16633D;
        for (int i10 = this.f16636G; i10 > 0; i10 -= 5) {
            java.lang.Object[] objArr2 = objArr[Z.l.a(i6, i10)];
            p247y7.AbstractC7350t.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // java.util.List, Y.f
    public Y.f add(int i6, java.lang.Object obj) {
        p021c0.d.b(i6, size());
        if (i6 == size()) {
            return add(obj);
        }
        int iR = R();
        if (i6 >= iR) {
            return D(this.f16633D, i6 - iR, obj);
        }
        Z.d dVar = new Z.d(null);
        return D(C(this.f16633D, this.f16636G, i6, obj, dVar), 0, dVar.a());
    }

    @Override // java.util.Collection, java.util.List, Y.f
    public Y.f add(java.lang.Object obj) {
        int size = size() - R();
        if (size >= 32) {
            return N(this.f16633D, this.f16634E, Z.l.c(obj));
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16634E, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = obj;
        return new Z.e(this.f16633D, objArrCopyOf, size() + 1, this.f16636G);
    }

    @Override // p097j7.AbstractC6860b
    public int e() {
        return this.f16635F;
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public java.lang.Object get(int i6) {
        p021c0.d.a(i6, size());
        return o(i6)[i6 & 31];
    }

    @Override // p097j7.AbstractC6862d, java.util.List
    public java.util.ListIterator listIterator(int i6) {
        p021c0.d.b(i6, size());
        return new Z.g(this.f16633D, this.f16634E, i6, size(), (this.f16636G / 5) + 1);
    }

    @Override // Y.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Z.f builder() {
        return new Z.f(this, this.f16633D, this.f16634E, this.f16636G);
    }

    @Override // p097j7.AbstractC6862d, java.util.List, Y.f
    public Y.f set(int i6, java.lang.Object obj) {
        p021c0.d.a(i6, size());
        if (R() > i6) {
            return new Z.e(S(this.f16633D, this.f16636G, i6, obj), this.f16634E, size(), this.f16636G);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f16634E, 32);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i6 & 31] = obj;
        return new Z.e(this.f16633D, objArrCopyOf, size(), this.f16636G);
    }

    @Override // Y.f
    public Y.f v(p237x7.l lVar) {
        Z.f fVarBuilder = builder();
        fVarBuilder.f0(lVar);
        return fVarBuilder.i();
    }

    @Override // Y.f
    public Y.f y(int i6) {
        p021c0.d.a(i6, size());
        int iR = R();
        java.lang.Object[] objArr = this.f16633D;
        int i10 = this.f16636G;
        return i6 >= iR ? Q(objArr, iR, i10, i6 - iR) : Q(P(objArr, i10, i6, new Z.d(this.f16634E[0])), iR, this.f16636G, 0);
    }
}
