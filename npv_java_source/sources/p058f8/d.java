package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p008a8.c f45304a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F8.E f45305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45306b;

        public a(F8.E e6, int i6) {
            this.f45305a = e6;
            this.f45306b = i6;
        }

        public final int a() {
            return this.f45306b;
        }

        public final F8.E b() {
            return this.f45305a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F8.M f45307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f45308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f45309c;

        public b(F8.M m6, int i6, boolean z6) {
            this.f45307a = m6;
            this.f45308b = i6;
            this.f45309c = z6;
        }

        public final boolean a() {
            return this.f45309c;
        }

        public final int b() {
            return this.f45308b;
        }

        public final F8.M c() {
            return this.f45307a;
        }
    }

    public d(p008a8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "javaResolverSettings");
        this.f45304a = cVar;
    }

    private final f8.d.b b(F8.M m6, p237x7.l lVar, int i6, p058f8.o oVar, boolean z6, boolean z10) {
        O7.InterfaceC1427h interfaceC1427hW;
        F8.e0 e0VarW0;
        boolean z11;
        f8.d.a aVar;
        F8.i0 i0VarS;
        F8.E type;
        p237x7.l lVar2 = lVar;
        boolean zA = p058f8.p.a(oVar);
        boolean z12 = (z10 && z6) ? false : true;
        F8.E e6 = null;
        if ((zA || !m6.U0().isEmpty()) && (interfaceC1427hW = m6.W0().w()) != null) {
            p058f8.e eVar = (p058f8.e) lVar2.l(java.lang.Integer.valueOf(i6));
            O7.InterfaceC1427h interfaceC1427hF = p058f8.r.f(interfaceC1427hW, eVar, oVar);
            java.lang.Boolean boolH = p058f8.r.h(eVar, oVar);
            if (interfaceC1427hF == null || (e0VarW0 = interfaceC1427hF.p()) == null) {
                e0VarW0 = m6.W0();
            }
            F8.e0 e0Var = e0VarW0;
            p247y7.AbstractC7350t.c(e0Var);
            int iA = i6 + 1;
            java.util.List listU0 = m6.U0();
            java.util.List listX = e0Var.x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            java.util.List list = listX;
            java.util.Iterator it = listU0.iterator();
            java.util.Iterator it2 = list.iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(p097j7.AbstractC6879v.x(listU0, 10), p097j7.AbstractC6879v.x(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                java.lang.Object next = it.next();
                O7.f0 f0Var = (O7.f0) it2.next();
                F8.i0 i0Var = (F8.i0) next;
                if (z12) {
                    z11 = z12;
                    if (!i0Var.b()) {
                        aVar = d(i0Var.getType().Z0(), lVar2, iA, z10);
                    } else if (((p058f8.e) lVar2.l(java.lang.Integer.valueOf(iA))).d() == p058f8.h.FORCE_FLEXIBILITY) {
                        F8.t0 t0VarZ0 = i0Var.getType().Z0();
                        aVar = new f8.d.a(F8.F.d(F8.B.c(t0VarZ0).a1(false), F8.B.d(t0VarZ0).a1(true)), 1);
                    } else {
                        aVar = new f8.d.a(null, 1);
                    }
                } else {
                    z11 = z12;
                    aVar = new f8.d.a(e6, 0);
                }
                iA += aVar.a();
                if (aVar.b() != null) {
                    type = aVar.b();
                } else {
                    if (interfaceC1427hF == null || i0Var.b()) {
                        i0VarS = interfaceC1427hF != null ? F8.q0.s(f0Var) : null;
                    } else {
                        type = i0Var.getType();
                        p247y7.AbstractC7350t.e(type, "getType(...)");
                    }
                    arrayList.add(i0VarS);
                    lVar2 = lVar;
                    z12 = z11;
                    e6 = null;
                }
                F8.u0 u0VarA = i0Var.a();
                p247y7.AbstractC7350t.e(u0VarA, "getProjectionKind(...)");
                i0VarS = K8.a.f(type, u0VarA, f0Var);
                arrayList.add(i0VarS);
                lVar2 = lVar;
                z12 = z11;
                e6 = null;
            }
            int i10 = iA - i6;
            if (interfaceC1427hF == null && boolH == null) {
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (((F8.i0) it3.next()) == null);
                }
                return new f8.d.b(null, i10, false);
            }
            P7.g gVarK = m6.k();
            p058f8.c cVar = p058f8.r.f45393b;
            if (interfaceC1427hF == null) {
                cVar = null;
            }
            boolean z13 = false;
            F8.a0 a0VarB = F8.b0.b(p058f8.r.e(p097j7.AbstractC6879v.r(gVarK, cVar, boolH != null ? p058f8.r.g() : null)));
            java.util.List listU1 = m6.U0();
            java.util.Iterator it4 = arrayList.iterator();
            java.util.Iterator it5 = listU1.iterator();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(p097j7.AbstractC6879v.x(arrayList, 10), p097j7.AbstractC6879v.x(listU1, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                java.lang.Object next2 = it4.next();
                F8.i0 i0Var2 = (F8.i0) it5.next();
                F8.i0 i0Var3 = (F8.i0) next2;
                if (i0Var3 != null) {
                    i0Var2 = i0Var3;
                }
                arrayList2.add(i0Var2);
            }
            F8.M mL = F8.F.l(a0VarB, e0Var, arrayList2, boolH != null ? boolH.booleanValue() : m6.X0(), null, 16, null);
            if (eVar.b()) {
                mL = e(mL);
            }
            if (boolH != null && eVar.e()) {
                z13 = true;
            }
            return new f8.d.b(mL, i10, z13);
        }
        return new f8.d.b(null, 1, false);
    }

    static /* synthetic */ f8.d.b c(p058f8.d dVar, F8.M m6, p237x7.l lVar, int i6, p058f8.o oVar, boolean z6, boolean z10, int i10, java.lang.Object obj) {
        return dVar.b(m6, lVar, i6, oVar, (i10 & 8) != 0 ? false : z6, (i10 & 16) != 0 ? false : z10);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    private final f8.d.a d(F8.t0 t0Var, p237x7.l lVar, int i6, boolean z6) {
        F8.E eC;
        F8.E eD = null;
        if (F8.G.a(t0Var)) {
            return new f8.d.a(null, 1);
        }
        if (!(t0Var instanceof F8.AbstractC0963y)) {
            if (!(t0Var instanceof F8.M)) {
                throw new p087i7.s();
            }
            f8.d.b bVarC = c(this, (F8.M) t0Var, lVar, i6, p058f8.o.INFLEXIBLE, false, z6, 8, null);
            return new f8.d.a(bVarC.a() ? F8.s0.d(t0Var, bVarC.c()) : bVarC.c(), bVarC.b());
        }
        boolean z10 = t0Var instanceof F8.L;
        F8.AbstractC0963y abstractC0963y = (F8.AbstractC0963y) t0Var;
        f8.d.b bVarB = b(abstractC0963y.e1(), lVar, i6, p058f8.o.FLEXIBLE_LOWER, z10, z6);
        f8.d.b bVarB2 = b(abstractC0963y.f1(), lVar, i6, p058f8.o.FLEXIBLE_UPPER, z10, z6);
        bVarB.b();
        bVarB2.b();
        if (bVarB.c() != null || bVarB2.c() != null) {
            if (bVarB.a() || bVarB2.a()) {
                F8.M mC = bVarB2.c();
                if (mC == null) {
                    eC = bVarB.c();
                    p247y7.AbstractC7350t.c(eC);
                } else {
                    F8.M mC2 = bVarB.c();
                    if (mC2 == null) {
                        mC2 = mC;
                    }
                    eC = F8.F.d(mC2, mC);
                    if (eC == null) {
                        eC = bVarB.c();
                        p247y7.AbstractC7350t.c(eC);
                    }
                }
                eD = F8.s0.d(t0Var, eC);
            } else if (z10) {
                F8.M mC3 = bVarB.c();
                if (mC3 == null) {
                    mC3 = abstractC0963y.e1();
                }
                F8.M mC4 = bVarB2.c();
                if (mC4 == null) {
                    mC4 = abstractC0963y.f1();
                }
                eD = new p028c8.h(mC3, mC4);
            } else {
                F8.M mC5 = bVarB.c();
                if (mC5 == null) {
                    mC5 = abstractC0963y.e1();
                }
                F8.M mC6 = bVarB2.c();
                if (mC6 == null) {
                    mC6 = abstractC0963y.f1();
                }
                eD = F8.F.d(mC5, mC6);
            }
        }
        return new f8.d.a(eD, bVarB.b());
    }

    private final F8.M e(F8.M m6) {
        return this.f45304a.a() ? F8.Q.h(m6, true) : new p058f8.g(m6);
    }

    public final F8.E a(F8.E e6, p237x7.l lVar, boolean z6) {
        p247y7.AbstractC7350t.f(e6, "<this>");
        p247y7.AbstractC7350t.f(lVar, "qualifiers");
        return d(e6.Z0(), lVar, 0, z6).b();
    }
}
