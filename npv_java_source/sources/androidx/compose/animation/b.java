package androidx.compose.animation;

/* JADX INFO: loaded from: classes.dex */
final class b implements D0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.animation.e f18711a;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X[] f18712D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.b f18713E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f18714F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f18715G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X[] xArr, androidx.compose.animation.b bVar, int i6, int i10) {
            super(1);
            this.f18712D = xArr;
            this.f18713E = bVar;
            this.f18714F = i6;
            this.f18715G = i10;
        }

        public final void a(D0.X.a aVar) {
            D0.X[] xArr = this.f18712D;
            androidx.compose.animation.b bVar = this.f18713E;
            int i6 = this.f18714F;
            int i10 = this.f18715G;
            for (D0.X x6 : xArr) {
                if (x6 != null) {
                    long jA = bVar.d().h().a(Y0.u.a(x6.I0(), x6.w0()), Y0.u.a(i6, i10), Y0.v.Ltr);
                    D0.X.a.h(aVar, x6, Y0.p.h(jA), Y0.p.i(jA), 0.0f, 4, null);
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public b(androidx.compose.animation.e eVar) {
        this.f18711a = eVar;
    }

    @Override // D0.I
    public int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).T(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).T(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9 A[SYNTHETIC] */
    @Override // D0.I
    public D0.K b(D0.M m6, java.util.List list, long j6) {
        D0.X x6;
        D0.X x10;
        int i6;
        int iI0;
        int iE0;
        int iW0;
        p097j7.O it;
        D0.X x11;
        int iW1;
        int i10;
        int size = list.size();
        D0.X[] xArr = new D0.X[size];
        long jA = Y0.t.f16230b.a();
        int size2 = list.size();
        int iW2 = 0;
        int i11 = 0;
        while (true) {
            x6 = null;
            if (i11 >= size2) {
                break;
            }
            D0.G g6 = (D0.G) list.get(i11);
            java.lang.Object objZ = g6.Z();
            androidx.compose.animation.e.a aVar = objZ instanceof androidx.compose.animation.e.a ? (androidx.compose.animation.e.a) objZ : null;
            if (aVar != null && aVar.g()) {
                D0.X xU = g6.U(j6);
                long jA2 = Y0.u.a(xU.I0(), xU.w0());
                p087i7.M m10 = p087i7.M.f46721a;
                xArr[i11] = xU;
                jA = jA2;
            }
            i11++;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            D0.G g10 = (D0.G) list.get(i12);
            if (xArr[i12] == null) {
                xArr[i12] = g10.U(j6);
            }
        }
        if (!m6.A0()) {
            if (size == 0) {
                x10 = null;
            } else {
                x10 = xArr[0];
                int iE1 = p097j7.AbstractC6872n.e0(xArr);
                if (iE1 != 0) {
                    int iI1 = x10 != null ? x10.I0() : 0;
                    p097j7.O it2 = new E7.i(1, iE1).iterator();
                    while (it2.hasNext()) {
                        D0.X x12 = xArr[it2.b()];
                        int iI2 = x12 != null ? x12.I0() : 0;
                        if (iI1 < iI2) {
                            x10 = x12;
                            iI1 = iI2;
                        }
                    }
                }
            }
            if (x10 != null) {
                iI0 = x10.I0();
            } else {
                i6 = 0;
            }
            if (m6.A0()) {
                iW2 = Y0.t.f(jA);
            } else {
                if (size != 0) {
                    x6 = xArr[0];
                    iE0 = p097j7.AbstractC6872n.e0(xArr);
                    if (iE0 != 0) {
                        if (x6 != null) {
                            iW0 = x6.w0();
                        } else {
                            iW0 = 0;
                        }
                        it = new E7.i(1, iE0).iterator();
                        while (it.hasNext()) {
                            x11 = xArr[it.b()];
                            if (x11 != null) {
                                iW1 = x11.w0();
                            } else {
                                iW1 = 0;
                            }
                            if (iW0 < iW1) {
                                x6 = x11;
                                iW0 = iW1;
                            }
                        }
                    }
                }
                if (x6 != null) {
                    iW2 = x6.w0();
                }
            }
            i10 = iW2;
            if (!m6.A0()) {
                this.f18711a.m(Y0.u.a(i6, i10));
            }
            return D0.L.b(m6, i6, i10, null, new androidx.compose.animation.b.a(xArr, this, i6, i10), 4, null);
        }
        iI0 = Y0.t.g(jA);
        i6 = iI0;
        if (m6.A0()) {
            iW2 = Y0.t.f(jA);
        } else {
            if (size != 0) {
                x6 = xArr[0];
                iE0 = p097j7.AbstractC6872n.e0(xArr);
                if (iE0 != 0) {
                    if (x6 != null) {
                        iW0 = x6.w0();
                    } else {
                        iW0 = 0;
                    }
                    it = new E7.i(1, iE0).iterator();
                    while (it.hasNext()) {
                        x11 = xArr[it.b()];
                        if (x11 != null) {
                            iW1 = x11.w0();
                        } else {
                            iW1 = 0;
                        }
                        if (iW0 < iW1) {
                            x6 = x11;
                            iW0 = iW1;
                        }
                    }
                }
            }
            if (x6 != null) {
                iW2 = x6.w0();
            }
        }
        i10 = iW2;
        if (!m6.A0()) {
            this.f18711a.m(Y0.u.a(i6, i10));
        }
        return D0.L.b(m6, i6, i10, null, new androidx.compose.animation.b.a(xArr, this, i6, i10), 4, null);
    }

    @Override // D0.I
    public int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).S(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).S(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final androidx.compose.animation.e d() {
        return this.f18711a;
    }

    @Override // D0.I
    public int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).n0(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).n0(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // D0.I
    public int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(0)).t(i6));
            int iO = p097j7.AbstractC6879v.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((D0.InterfaceC0895n) list.get(i10)).t(i6));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
