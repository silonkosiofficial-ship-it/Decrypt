package F8;

/* JADX INFO: renamed from: F8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0944e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.C0944e f2895a = new F8.C0944e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2896b;

    /* JADX INFO: renamed from: F8.e$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2898b;

        static {
            int[] iArr = new int[J8.s.values().length];
            try {
                iArr[J8.s.INV.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[J8.s.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[J8.s.IN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f2897a = iArr;
            int[] iArr2 = new int[F8.d0.b.values().length];
            try {
                iArr2[F8.d0.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[F8.d0.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[F8.d0.b.SKIP_LOWER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            f2898b = iArr2;
        }
    }

    /* JADX INFO: renamed from: F8.e$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f2899D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ F8.d0 f2900E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ J8.o f2901F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ J8.j f2902G;

        /* JADX INFO: renamed from: F8.e$b$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ F8.d0 f2903D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ J8.o f2904E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ J8.j f2905F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ J8.j f2906G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(F8.d0 d0Var, J8.o oVar, J8.j jVar, J8.j jVar2) {
                super(0);
                this.f2903D = d0Var;
                this.f2904E = oVar;
                this.f2905F = jVar;
                this.f2906G = jVar2;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean b() {
                return java.lang.Boolean.valueOf(F8.C0944e.f2895a.q(this.f2903D, this.f2904E.j(this.f2905F), this.f2906G));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.List list, F8.d0 d0Var, J8.o oVar, J8.j jVar) {
            super(1);
            this.f2899D = list;
            this.f2900E = d0Var;
            this.f2901F = oVar;
            this.f2902G = jVar;
        }

        public final void a(F8.d0.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "$this$runForkingPoint");
            java.util.Iterator it = this.f2899D.iterator();
            while (it.hasNext()) {
                aVar.a(new F8.C0944e.b.a(this.f2900E, this.f2901F, (J8.j) it.next(), this.f2902G));
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F8.d0.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private C0944e() {
    }

    private final java.lang.Boolean a(F8.d0 d0Var, J8.j jVar, J8.j jVar2) {
        J8.o oVarJ = d0Var.j();
        if (!oVarJ.o0(jVar) && !oVarJ.o0(jVar2)) {
            return null;
        }
        if (d(oVarJ, jVar) && d(oVarJ, jVar2)) {
            return java.lang.Boolean.TRUE;
        }
        if (oVarJ.o0(jVar)) {
            if (e(oVarJ, d0Var, jVar, jVar2, false)) {
                return java.lang.Boolean.TRUE;
            }
        } else if (oVarJ.o0(jVar2) && (c(oVarJ, jVar) || e(oVarJ, d0Var, jVar2, jVar, true))) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }

    private static final boolean b(J8.o oVar, J8.j jVar) {
        if (!(jVar instanceof J8.d)) {
            return false;
        }
        J8.l lVarB = oVar.B(oVar.q0((J8.d) jVar));
        return !oVar.E0(lVarB) && oVar.o0(oVar.G(oVar.n0(lVarB)));
    }

    private static final boolean c(J8.o oVar, J8.j jVar) {
        J8.m mVarE = oVar.e(jVar);
        if (mVarE instanceof J8.h) {
            java.util.Collection collectionJ = oVar.J(mVarE);
            if (!(collectionJ instanceof java.util.Collection) || !collectionJ.isEmpty()) {
                java.util.Iterator it = collectionJ.iterator();
                while (it.hasNext()) {
                    J8.j jVarB = oVar.b((J8.i) it.next());
                    if (jVarB != null && oVar.o0(jVarB)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean d(J8.o oVar, J8.j jVar) {
        return oVar.o0(jVar) || b(oVar, jVar);
    }

    private static final boolean e(J8.o oVar, F8.d0 d0Var, J8.j jVar, J8.j jVar2, boolean z6) {
        java.util.Collection<J8.i> collectionW = oVar.w(jVar);
        if ((collectionW instanceof java.util.Collection) && collectionW.isEmpty()) {
            return false;
        }
        for (J8.i iVar : collectionW) {
            if (p247y7.AbstractC7350t.b(oVar.u0(iVar), oVar.e(jVar2)) || (z6 && t(f2895a, d0Var, jVar2, iVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    private final java.lang.Boolean f(F8.d0 d0Var, J8.j jVar, J8.j jVar2) {
        boolean zB;
        J8.j jVarY0;
        J8.n nVarM;
        J8.o oVarJ = d0Var.j();
        boolean z6 = false;
        if (oVarJ.Q(jVar) || oVarJ.Q(jVar2)) {
            if (d0Var.m()) {
                return java.lang.Boolean.TRUE;
            }
            if (oVarJ.C0(jVar) && !oVarJ.C0(jVar2)) {
                return java.lang.Boolean.FALSE;
            }
            zB = F8.C0943d.f2875a.b(oVarJ, oVarJ.g(jVar, false), oVarJ.g(jVar2, false));
        } else {
            if (oVarJ.v(jVar) && oVarJ.v(jVar2)) {
                return java.lang.Boolean.valueOf(f2895a.p(oVarJ, jVar, jVar2) || d0Var.n());
            }
            if (!oVarJ.H(jVar) && !oVarJ.H(jVar2)) {
                J8.e eVarT = oVarJ.t(jVar2);
                if (eVarT == null || (jVarY0 = oVarJ.y0(eVarT)) == null) {
                    jVarY0 = jVar2;
                }
                J8.d dVarD = oVarJ.d(jVarY0);
                J8.i iVarN = dVarD != null ? oVarJ.n(dVarD) : null;
                if (dVarD != null && iVarN != null) {
                    if (oVarJ.C0(jVar2)) {
                        iVarN = oVarJ.M(iVarN, true);
                    } else if (oVarJ.x0(jVar2)) {
                        iVarN = oVarJ.m0(iVarN);
                    }
                    J8.i iVar = iVarN;
                    int i6 = F8.C0944e.a.f2898b[d0Var.g(jVar, dVarD).ordinal()];
                    if (i6 == 1) {
                        zB = t(f2895a, d0Var, jVar, iVar, false, 8, null);
                    } else if (i6 == 2 && t(f2895a, d0Var, jVar, iVar, false, 8, null)) {
                        return java.lang.Boolean.TRUE;
                    }
                }
                J8.m mVarE = oVarJ.e(jVar2);
                if (oVarJ.T(mVarE)) {
                    oVarJ.C0(jVar2);
                    java.util.Collection collectionJ = oVarJ.J(mVarE);
                    if ((collectionJ instanceof java.util.Collection) && collectionJ.isEmpty()) {
                        z6 = true;
                    } else {
                        java.util.Iterator it = collectionJ.iterator();
                        while (it.hasNext()) {
                            if (!t(f2895a, d0Var, jVar, (J8.i) it.next(), false, 8, null)) {
                            }
                        }
                        z6 = true;
                    }
                    return java.lang.Boolean.valueOf(z6);
                }
                J8.m mVarE2 = oVarJ.e(jVar);
                if (jVar instanceof J8.d) {
                    nVarM = f2895a.m(d0Var.j(), jVar2, jVar);
                    if (nVarM != null && oVarJ.F(nVarM, oVarJ.e(jVar2))) {
                        return java.lang.Boolean.TRUE;
                    }
                } else if (oVarJ.T(mVarE2)) {
                    java.util.Collection collectionJ2 = oVarJ.J(mVarE2);
                    if ((collectionJ2 instanceof java.util.Collection) && collectionJ2.isEmpty()) {
                        nVarM = f2895a.m(d0Var.j(), jVar2, jVar);
                        if (nVarM != null) {
                            return java.lang.Boolean.TRUE;
                        }
                    } else {
                        java.util.Iterator it2 = collectionJ2.iterator();
                        while (it2.hasNext()) {
                            if (!(((J8.i) it2.next()) instanceof J8.d)) {
                            }
                        }
                        nVarM = f2895a.m(d0Var.j(), jVar2, jVar);
                        if (nVarM != null) {
                            return java.lang.Boolean.TRUE;
                        }
                    }
                }
                return null;
            }
            zB = d0Var.n();
        }
        return java.lang.Boolean.valueOf(zB);
    }

    private final java.util.List g(F8.d0 d0Var, J8.j jVar, J8.m mVar) {
        F8.d0.c cVarL0;
        J8.j jVar2 = jVar;
        J8.o oVarJ = d0Var.j();
        java.util.List listL = oVarJ.L(jVar2, mVar);
        if (listL != null) {
            return listL;
        }
        if (!oVarJ.X(mVar) && oVarJ.O(jVar2)) {
            return p097j7.AbstractC6879v.m();
        }
        if (oVarJ.V(mVar)) {
            if (!oVarJ.h0(oVarJ.e(jVar2), mVar)) {
                return p097j7.AbstractC6879v.m();
            }
            J8.j jVarJ0 = oVarJ.j0(jVar2, J8.b.FOR_SUBTYPING);
            if (jVarJ0 != null) {
                jVar2 = jVarJ0;
            }
            return p097j7.AbstractC6879v.e(jVar2);
        }
        P8.f fVar = new P8.f();
        d0Var.k();
        java.util.ArrayDeque arrayDequeH = d0Var.h();
        p247y7.AbstractC7350t.c(arrayDequeH);
        java.util.Set setI = d0Var.i();
        p247y7.AbstractC7350t.c(setI);
        arrayDequeH.push(jVar2);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + jVar2 + ". Supertypes = " + p097j7.AbstractC6879v.r0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            J8.j jVar3 = (J8.j) arrayDequeH.pop();
            p247y7.AbstractC7350t.c(jVar3);
            if (setI.add(jVar3)) {
                J8.j jVarJ1 = oVarJ.j0(jVar3, J8.b.FOR_SUBTYPING);
                if (jVarJ1 == null) {
                    jVarJ1 = jVar3;
                }
                if (oVarJ.h0(oVarJ.e(jVarJ1), mVar)) {
                    fVar.add(jVarJ1);
                    cVarL0 = F8.d0.c.C0067c.f2893a;
                } else {
                    cVarL0 = oVarJ.h(jVarJ1) == 0 ? F8.d0.c.b.f2892a : d0Var.j().l0(jVarJ1);
                }
                if (!(!p247y7.AbstractC7350t.b(cVarL0, F8.d0.c.C0067c.f2893a))) {
                    cVarL0 = null;
                }
                if (cVarL0 != null) {
                    J8.o oVarJ2 = d0Var.j();
                    java.util.Iterator it = oVarJ2.J(oVarJ2.e(jVar3)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarL0.a(d0Var, (J8.i) it.next()));
                    }
                }
            }
        }
        d0Var.e();
        return fVar;
    }

    private final java.util.List h(F8.d0 d0Var, J8.j jVar, J8.m mVar) {
        return w(d0Var, g(d0Var, jVar, mVar));
    }

    private final boolean i(F8.d0 d0Var, J8.i iVar, J8.i iVar2, boolean z6) {
        J8.o oVarJ = d0Var.j();
        J8.i iVarO = d0Var.o(d0Var.p(iVar));
        J8.i iVarO2 = d0Var.o(d0Var.p(iVar2));
        F8.C0944e c0944e = f2895a;
        java.lang.Boolean boolF = c0944e.f(d0Var, oVarJ.z(iVarO), oVarJ.G(iVarO2));
        if (boolF == null) {
            java.lang.Boolean boolC = d0Var.c(iVarO, iVarO2, z6);
            return boolC != null ? boolC.booleanValue() : c0944e.u(d0Var, oVarJ.z(iVarO), oVarJ.G(iVarO2));
        }
        boolean zBooleanValue = boolF.booleanValue();
        d0Var.c(iVarO, iVarO2, z6);
        return zBooleanValue;
    }

    private final J8.n m(J8.o oVar, J8.i iVar, J8.i iVar2) {
        J8.i iVarN0;
        int iH = oVar.h(iVar);
        int i6 = 0;
        while (true) {
            if (i6 >= iH) {
                return null;
            }
            J8.l lVarC0 = oVar.c0(iVar, i6);
            J8.l lVar = oVar.E0(lVarC0) ^ true ? lVarC0 : null;
            if (lVar != null && (iVarN0 = oVar.n0(lVar)) != null) {
                boolean z6 = oVar.p0(oVar.i(oVar.z(iVarN0))) && oVar.p0(oVar.i(oVar.z(iVar2)));
                if (p247y7.AbstractC7350t.b(iVarN0, iVar2) || (z6 && p247y7.AbstractC7350t.b(oVar.u0(iVarN0), oVar.u0(iVar2)))) {
                    return oVar.A0(oVar.u0(iVar), i6);
                }
                J8.n nVarM = m(oVar, iVarN0, iVar2);
                if (nVarM != null) {
                    return nVarM;
                }
            }
            i6++;
        }
    }

    private final boolean n(F8.d0 d0Var, J8.j jVar) {
        J8.o oVarJ = d0Var.j();
        J8.m mVarE = oVarJ.e(jVar);
        if (oVarJ.X(mVarE)) {
            return oVarJ.k0(mVarE);
        }
        if (oVarJ.k0(oVarJ.e(jVar))) {
            return true;
        }
        d0Var.k();
        java.util.ArrayDeque arrayDequeH = d0Var.h();
        p247y7.AbstractC7350t.c(arrayDequeH);
        java.util.Set setI = d0Var.i();
        p247y7.AbstractC7350t.c(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + p097j7.AbstractC6879v.r0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            J8.j jVar2 = (J8.j) arrayDequeH.pop();
            p247y7.AbstractC7350t.c(jVar2);
            if (setI.add(jVar2)) {
                F8.d0.c cVar = oVarJ.O(jVar2) ? F8.d0.c.C0067c.f2893a : F8.d0.c.b.f2892a;
                if (!(!p247y7.AbstractC7350t.b(cVar, F8.d0.c.C0067c.f2893a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    J8.o oVarJ2 = d0Var.j();
                    java.util.Iterator it = oVarJ2.J(oVarJ2.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        J8.j jVarA = cVar.a(d0Var, (J8.i) it.next());
                        if (oVarJ.k0(oVarJ.e(jVarA))) {
                            d0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    private final boolean o(J8.o oVar, J8.i iVar) {
        return (!oVar.E(oVar.u0(iVar)) || oVar.k(iVar) || oVar.x0(iVar) || oVar.D0(iVar) || !p247y7.AbstractC7350t.b(oVar.e(oVar.z(iVar)), oVar.e(oVar.G(iVar)))) ? false : true;
    }

    private final boolean p(J8.o oVar, J8.j jVar, J8.j jVar2) {
        J8.j jVarY0;
        J8.j jVarY1;
        J8.e eVarT = oVar.t(jVar);
        if (eVarT == null || (jVarY0 = oVar.y0(eVarT)) == null) {
            jVarY0 = jVar;
        }
        J8.e eVarT2 = oVar.t(jVar2);
        if (eVarT2 == null || (jVarY1 = oVar.y0(eVarT2)) == null) {
            jVarY1 = jVar2;
        }
        if (oVar.e(jVarY0) != oVar.e(jVarY1)) {
            return false;
        }
        if (oVar.x0(jVar) || !oVar.x0(jVar2)) {
            return !oVar.C0(jVar) || oVar.C0(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean t(F8.C0944e c0944e, F8.d0 d0Var, J8.i iVar, J8.i iVar2, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            z6 = false;
        }
        return c0944e.s(d0Var, iVar, iVar2, z6);
    }

    private final boolean u(F8.d0 d0Var, J8.j jVar, J8.j jVar2) {
        J8.i iVarN0;
        J8.o oVarJ = d0Var.j();
        if (f2896b) {
            if (!oVarJ.f(jVar) && !oVarJ.T(oVarJ.e(jVar))) {
                d0Var.l(jVar);
            }
            if (!oVarJ.f(jVar2)) {
                d0Var.l(jVar2);
            }
        }
        boolean z6 = false;
        if (!F8.C0942c.f2874a.d(d0Var, jVar, jVar2)) {
            return false;
        }
        F8.C0944e c0944e = f2895a;
        java.lang.Boolean boolA = c0944e.a(d0Var, oVarJ.z(jVar), oVarJ.G(jVar2));
        if (boolA != null) {
            boolean zBooleanValue = boolA.booleanValue();
            F8.d0.d(d0Var, jVar, jVar2, false, 4, null);
            return zBooleanValue;
        }
        J8.m mVarE = oVarJ.e(jVar2);
        boolean z10 = true;
        if ((oVarJ.h0(oVarJ.e(jVar), mVarE) && oVarJ.A(mVarE) == 0) || oVarJ.B0(oVarJ.e(jVar2))) {
            return true;
        }
        java.util.List<J8.j> listL = c0944e.l(d0Var, jVar, mVarE);
        int i6 = 10;
        java.util.ArrayList<J8.j> arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listL, 10));
        for (J8.j jVar3 : listL) {
            J8.j jVarB = oVarJ.b(d0Var.o(jVar3));
            if (jVarB != null) {
                jVar3 = jVarB;
            }
            arrayList.add(jVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f2895a.n(d0Var, jVar);
        }
        if (size == 1) {
            return f2895a.q(d0Var, oVarJ.j((J8.j) p097j7.AbstractC6879v.i0(arrayList)), jVar2);
        }
        J8.a aVar = new J8.a(oVarJ.A(mVarE));
        int iA = oVarJ.A(mVarE);
        int i10 = 0;
        boolean z11 = false;
        while (i10 < iA) {
            z11 = (z11 || oVarJ.d0(oVarJ.A0(mVarE, i10)) != J8.s.OUT) ? z10 : z6;
            if (!z11) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList, i6));
                for (J8.j jVar4 : arrayList) {
                    J8.l lVarZ = oVarJ.Z(jVar4, i10);
                    if (lVarZ != null) {
                        if (oVarJ.u(lVarZ) != J8.s.INV) {
                            lVarZ = null;
                        }
                        if (lVarZ != null && (iVarN0 = oVarJ.n0(lVarZ)) != null) {
                            arrayList2.add(iVarN0);
                        }
                    }
                    throw new java.lang.IllegalStateException(("Incorrect type: " + jVar4 + ", subType: " + jVar + ", superType: " + jVar2).toString());
                }
                aVar.add(oVarJ.y(oVarJ.I(arrayList2)));
            }
            i10++;
            z6 = false;
            z10 = true;
            i6 = 10;
        }
        if (z11 || !f2895a.q(d0Var, aVar, jVar2)) {
            return d0Var.q(new F8.C0944e.b(arrayList, d0Var, oVarJ, jVar2));
        }
        return true;
    }

    private final boolean v(J8.o oVar, J8.i iVar, J8.i iVar2, J8.m mVar) {
        J8.j jVarB = oVar.b(iVar);
        if (jVarB instanceof J8.d) {
            J8.d dVar = (J8.d) jVarB;
            if (oVar.Y(dVar) || !oVar.E0(oVar.B(oVar.q0(dVar))) || oVar.m(dVar) != J8.b.FOR_SUBTYPING) {
                return false;
            }
            oVar.u0(iVar2);
        }
        return false;
    }

    private final java.util.List w(F8.d0 d0Var, java.util.List list) {
        J8.o oVarJ = d0Var.j();
        if (list.size() < 2) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            J8.k kVarJ = oVarJ.j((J8.j) obj);
            int iS0 = oVarJ.s0(kVarJ);
            int i6 = 0;
            while (true) {
                if (i6 >= iS0) {
                    arrayList.add(obj);
                    break;
                }
                if (oVarJ.t0(oVarJ.n0(oVarJ.a0(kVarJ, i6))) != null) {
                    break;
                }
                i6++;
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    public final J8.s j(J8.s sVar, J8.s sVar2) {
        p247y7.AbstractC7350t.f(sVar, "declared");
        p247y7.AbstractC7350t.f(sVar2, "useSite");
        J8.s sVar3 = J8.s.INV;
        if (sVar == sVar3) {
            return sVar2;
        }
        if (sVar2 == sVar3 || sVar == sVar2) {
            return sVar;
        }
        return null;
    }

    public final boolean k(F8.d0 d0Var, J8.i iVar, J8.i iVar2) {
        p247y7.AbstractC7350t.f(d0Var, "state");
        p247y7.AbstractC7350t.f(iVar, "a");
        p247y7.AbstractC7350t.f(iVar2, "b");
        J8.o oVarJ = d0Var.j();
        if (iVar == iVar2) {
            return true;
        }
        F8.C0944e c0944e = f2895a;
        if (c0944e.o(oVarJ, iVar) && c0944e.o(oVarJ, iVar2)) {
            J8.i iVarO = d0Var.o(d0Var.p(iVar));
            J8.i iVarO2 = d0Var.o(d0Var.p(iVar2));
            J8.j jVarZ = oVarJ.z(iVarO);
            if (!oVarJ.h0(oVarJ.u0(iVarO), oVarJ.u0(iVarO2))) {
                return false;
            }
            if (oVarJ.h(jVarZ) == 0) {
                return oVarJ.z0(iVarO) || oVarJ.z0(iVarO2) || oVarJ.C0(jVarZ) == oVarJ.C0(oVarJ.z(iVarO2));
            }
        }
        return t(c0944e, d0Var, iVar, iVar2, false, 8, null) && t(c0944e, d0Var, iVar2, iVar, false, 8, null);
    }

    public final java.util.List l(F8.d0 d0Var, J8.j jVar, J8.m mVar) {
        F8.d0.c cVar;
        p247y7.AbstractC7350t.f(d0Var, "state");
        p247y7.AbstractC7350t.f(jVar, "subType");
        p247y7.AbstractC7350t.f(mVar, "superConstructor");
        J8.o oVarJ = d0Var.j();
        if (oVarJ.O(jVar)) {
            return f2895a.h(d0Var, jVar, mVar);
        }
        if (!oVarJ.X(mVar) && !oVarJ.f0(mVar)) {
            return f2895a.g(d0Var, jVar, mVar);
        }
        P8.f<J8.j> fVar = new P8.f();
        d0Var.k();
        java.util.ArrayDeque arrayDequeH = d0Var.h();
        p247y7.AbstractC7350t.c(arrayDequeH);
        java.util.Set setI = d0Var.i();
        p247y7.AbstractC7350t.c(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + p097j7.AbstractC6879v.r0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            J8.j jVar2 = (J8.j) arrayDequeH.pop();
            p247y7.AbstractC7350t.c(jVar2);
            if (setI.add(jVar2)) {
                if (oVarJ.O(jVar2)) {
                    fVar.add(jVar2);
                    cVar = F8.d0.c.C0067c.f2893a;
                } else {
                    cVar = F8.d0.c.b.f2892a;
                }
                if (!(!p247y7.AbstractC7350t.b(cVar, F8.d0.c.C0067c.f2893a))) {
                    cVar = null;
                }
                if (cVar != null) {
                    J8.o oVarJ2 = d0Var.j();
                    java.util.Iterator it = oVarJ2.J(oVarJ2.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(d0Var, (J8.i) it.next()));
                    }
                }
            }
        }
        d0Var.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (J8.j jVar3 : fVar) {
            F8.C0944e c0944e = f2895a;
            p247y7.AbstractC7350t.c(jVar3);
            p097j7.AbstractC6879v.C(arrayList, c0944e.h(d0Var, jVar3, mVar));
        }
        return arrayList;
    }

    public final boolean q(F8.d0 d0Var, J8.k kVar, J8.j jVar) {
        boolean zK;
        int i6;
        java.lang.Object obj;
        boolean z6;
        J8.i iVar;
        p247y7.AbstractC7350t.f(d0Var, "<this>");
        p247y7.AbstractC7350t.f(kVar, "capturedSubArguments");
        p247y7.AbstractC7350t.f(jVar, "superType");
        J8.o oVarJ = d0Var.j();
        J8.m mVarE = oVarJ.e(jVar);
        int iS0 = oVarJ.s0(kVar);
        int iA = oVarJ.A(mVarE);
        if (iS0 != iA || iS0 != oVarJ.h(jVar)) {
            return false;
        }
        for (int i10 = 0; i10 < iA; i10++) {
            J8.l lVarC0 = oVarJ.c0(jVar, i10);
            if (!oVarJ.E0(lVarC0)) {
                J8.i iVarN0 = oVarJ.n0(lVarC0);
                J8.l lVarA0 = oVarJ.a0(kVar, i10);
                oVarJ.u(lVarA0);
                J8.s sVar = J8.s.INV;
                J8.i iVarN1 = oVarJ.n0(lVarA0);
                F8.C0944e c0944e = f2895a;
                J8.s sVarJ = c0944e.j(oVarJ.d0(oVarJ.A0(mVarE, i10)), oVarJ.u(lVarC0));
                if (sVarJ == null) {
                    return d0Var.m();
                }
                if (sVarJ != sVar || (!c0944e.v(oVarJ, iVarN1, iVarN0, mVarE) && !c0944e.v(oVarJ, iVarN0, iVarN1, mVarE))) {
                    if (d0Var.f2882g > 100) {
                        throw new java.lang.IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarN1).toString());
                    }
                    d0Var.f2882g++;
                    int i11 = F8.C0944e.a.f2897a[sVarJ.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            i6 = 8;
                            obj = null;
                            z6 = false;
                            iVar = iVarN1;
                        } else {
                            if (i11 != 3) {
                                throw new p087i7.s();
                            }
                            i6 = 8;
                            obj = null;
                            z6 = false;
                            iVar = iVarN0;
                            iVarN0 = iVarN1;
                        }
                        zK = t(c0944e, d0Var, iVar, iVarN0, z6, i6, obj);
                    } else {
                        zK = c0944e.k(d0Var, iVarN1, iVarN0);
                    }
                    d0Var.f2882g--;
                    if (!zK) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean r(F8.d0 d0Var, J8.i iVar, J8.i iVar2) {
        p247y7.AbstractC7350t.f(d0Var, "state");
        p247y7.AbstractC7350t.f(iVar, "subType");
        p247y7.AbstractC7350t.f(iVar2, "superType");
        return t(this, d0Var, iVar, iVar2, false, 8, null);
    }

    public final boolean s(F8.d0 d0Var, J8.i iVar, J8.i iVar2, boolean z6) {
        p247y7.AbstractC7350t.f(d0Var, "state");
        p247y7.AbstractC7350t.f(iVar, "subType");
        p247y7.AbstractC7350t.f(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (d0Var.f(iVar, iVar2)) {
            return i(d0Var, iVar, iVar2, z6);
        }
        return false;
    }
}
