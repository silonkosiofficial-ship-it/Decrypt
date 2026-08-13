package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: f8.a$a, reason: collision with other inner class name */
    private static final class C0505a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J8.i f45293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final X7.y f45294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final J8.n f45295c;

        public C0505a(J8.i iVar, X7.y yVar, J8.n nVar) {
            this.f45293a = iVar;
            this.f45294b = yVar;
            this.f45295c = nVar;
        }

        public final X7.y a() {
            return this.f45294b;
        }

        public final J8.i b() {
            return this.f45293a;
        }

        public final J8.n c() {
            return this.f45295c;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p058f8.q f45296D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p058f8.e[] f45297E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p058f8.q qVar, p058f8.e[] eVarArr) {
            super(1);
            this.f45296D = qVar;
            this.f45297E = eVarArr;
        }

        public final p058f8.e a(int i6) {
            java.util.Map mapA;
            p058f8.e eVar;
            p058f8.q qVar = this.f45296D;
            if (qVar != null && (mapA = qVar.a()) != null && (eVar = (p058f8.e) mapA.get(java.lang.Integer.valueOf(i6))) != null) {
                return eVar;
            }
            p058f8.e[] eVarArr = this.f45297E;
            return (i6 < 0 || i6 > p097j7.AbstractC6872n.e0(eVarArr)) ? p058f8.e.f45310e.a() : eVarArr[i6];
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p058f8.a.C0505a f45299E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p058f8.a.C0505a c0505a) {
            super(1);
            this.f45299E = c0505a;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            p247y7.AbstractC7350t.f(obj, "$this$extractNullability");
            return java.lang.Boolean.valueOf(p058f8.a.this.h(obj, this.f45299E.b()));
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ J8.o f45301E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(J8.o oVar) {
            super(1);
            this.f45301E = oVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Iterable l(p058f8.a.C0505a c0505a) {
            J8.i iVarB;
            J8.m mVarU0;
            java.util.List listS;
            p058f8.a.C0505a c0505a2;
            J8.i iVarB2;
            p247y7.AbstractC7350t.f(c0505a, "it");
            if ((p058f8.a.this.u() && (iVarB2 = c0505a.b()) != null && this.f45301E.v0(iVarB2)) || (iVarB = c0505a.b()) == null || (mVarU0 = this.f45301E.u0(iVarB)) == null || (listS = this.f45301E.s(mVarU0)) == null) {
                return null;
            }
            java.util.List list = listS;
            java.util.List listR = this.f45301E.R(c0505a.b());
            J8.o oVar = this.f45301E;
            p058f8.a aVar = p058f8.a.this;
            java.util.Iterator it = list.iterator();
            java.util.Iterator it2 = listR.iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(p097j7.AbstractC6879v.x(list, 10), p097j7.AbstractC6879v.x(listR, 10)));
            while (it.hasNext() && it2.hasNext()) {
                java.lang.Object next = it.next();
                J8.l lVar = (J8.l) it2.next();
                J8.n nVar = (J8.n) next;
                if (oVar.E0(lVar)) {
                    c0505a2 = new p058f8.a.C0505a(null, c0505a.a(), nVar);
                } else {
                    J8.i iVarN0 = oVar.n0(lVar);
                    c0505a2 = new p058f8.a.C0505a(iVarN0, aVar.c(iVarN0, c0505a.a()), nVar);
                }
                arrayList.add(c0505a2);
            }
            return arrayList;
        }
    }

    private final p058f8.i B(p058f8.i iVar, p058f8.i iVar2) {
        if (iVar == null) {
            return iVar2;
        }
        if (iVar2 == null) {
            return iVar;
        }
        if (iVar.d() && !iVar2.d()) {
            return iVar2;
        }
        if (iVar.d() || !iVar2.d()) {
            return (iVar.c().compareTo(iVar2.c()) >= 0 && iVar.c().compareTo(iVar2.c()) > 0) ? iVar : iVar2;
        }
        return iVar;
    }

    private final java.util.List C(J8.i iVar) {
        return f(new p058f8.a.C0505a(iVar, c(iVar, n()), null), new f8.a.d(v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final X7.y c(J8.i iVar, X7.y yVar) {
        return i().c(yVar, j(iVar));
    }

    private final p058f8.e d(J8.i iVar) {
        p058f8.h hVarT;
        p058f8.h hVarT2 = t(iVar);
        p058f8.f fVar = null;
        if (hVarT2 == null) {
            J8.i iVarQ = q(iVar);
            hVarT = iVarQ != null ? t(iVarQ) : null;
        } else {
            hVarT = hVarT2;
        }
        J8.o oVarV = v();
        N7.c cVar = N7.c.f7820a;
        if (cVar.l(s(oVarV.z(iVar)))) {
            fVar = p058f8.f.READ_ONLY;
        } else if (cVar.k(s(oVarV.G(iVar)))) {
            fVar = p058f8.f.MUTABLE;
        }
        return new p058f8.e(hVarT, fVar, v().x0(iVar) || A(iVar), hVarT != hVarT2);
    }

    private final p058f8.e e(p058f8.a.C0505a c0505a) {
        java.util.List listM;
        p058f8.i iVarD;
        p058f8.i iVarK;
        java.util.List listA0;
        J8.i iVarB;
        J8.m mVarU0;
        if (c0505a.b() == null) {
            J8.o oVarV = v();
            J8.n nVarC = c0505a.c();
            if ((nVarC != null ? oVarV.d0(nVarC) : null) == J8.s.IN) {
                return p058f8.e.f45310e.a();
            }
        }
        boolean z6 = false;
        boolean z10 = c0505a.c() == null;
        J8.i iVarB2 = c0505a.b();
        if (iVarB2 == null || (listM = j(iVarB2)) == null) {
            listM = p097j7.AbstractC6879v.m();
        }
        J8.o oVarV2 = v();
        J8.i iVarB3 = c0505a.b();
        J8.n nVarI0 = (iVarB3 == null || (mVarU0 = oVarV2.u0(iVarB3)) == null) ? null : oVarV2.i0(mVarU0);
        boolean z11 = m() == X7.EnumC1824b.TYPE_PARAMETER_BOUNDS;
        if (z10) {
            if (z11 || !p() || (iVarB = c0505a.b()) == null || !w(iVarB)) {
                listA0 = p097j7.AbstractC6879v.A0(l(), listM);
            } else {
                java.lang.Iterable iterableL = l();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : iterableL) {
                    if (!i().m(obj)) {
                        arrayList.add(obj);
                    }
                }
                listA0 = p097j7.AbstractC6879v.C0(arrayList, listM);
            }
            listM = listA0;
        }
        p058f8.f fVarE = i().e(listM);
        p058f8.i iVarF = i().f(listM, new f8.a.c(c0505a));
        if (iVarF != null) {
            p058f8.h hVarC = iVarF.c();
            if (iVarF.c() == p058f8.h.NOT_NULL && nVarI0 != null) {
                z6 = true;
            }
            return new p058f8.e(hVarC, fVarE, z6, iVarF.d());
        }
        X7.EnumC1824b enumC1824bM = (z10 || z11) ? m() : X7.EnumC1824b.TYPE_USE;
        X7.y yVarA = c0505a.a();
        X7.r rVarA = yVarA != null ? yVarA.a(enumC1824bM) : null;
        p058f8.i iVarK2 = nVarI0 != null ? k(nVarI0) : null;
        if (iVarK2 == null || (iVarD = p058f8.i.b(iVarK2, p058f8.h.NOT_NULL, false, 2, null)) == null) {
            iVarD = rVarA != null ? rVarA.d() : null;
        }
        boolean z12 = (iVarK2 != null ? iVarK2.c() : null) == p058f8.h.NOT_NULL || !(nVarI0 == null || rVarA == null || !rVarA.c());
        J8.n nVarC2 = c0505a.c();
        if (nVarC2 == null || (iVarK = k(nVarC2)) == null) {
            iVarK = null;
        } else if (iVarK.c() == p058f8.h.NULLABLE) {
            iVarK = p058f8.i.b(iVarK, p058f8.h.FORCE_FLEXIBILITY, false, 2, null);
        }
        p058f8.i iVarB4 = B(iVarK, iVarD);
        p058f8.h hVarC2 = iVarB4 != null ? iVarB4.c() : null;
        if (iVarB4 != null && iVarB4.d()) {
            z6 = true;
        }
        return new p058f8.e(hVarC2, fVarE, z12, z6);
    }

    private final java.util.List f(java.lang.Object obj, p237x7.l lVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        g(obj, arrayList, lVar);
        return arrayList;
    }

    private final void g(java.lang.Object obj, java.util.List list, p237x7.l lVar) {
        list.add(obj);
        java.lang.Iterable iterable = (java.lang.Iterable) lVar.l(obj);
        if (iterable != null) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next(), list, lVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:3: B:46:0x00b3->B:72:?, LOOP_END, SYNTHETIC] */
    private final p058f8.i k(J8.n nVar) {
        java.util.List arrayList;
        java.util.List list;
        java.util.Iterator it;
        p058f8.h hVar;
        boolean z6;
        J8.o oVarV = v();
        if (!z(nVar)) {
            return null;
        }
        java.util.List listX = oVarV.x(nVar);
        java.util.List list2 = listX;
        boolean z10 = list2 instanceof java.util.Collection;
        if (!z10 || !list2.isEmpty()) {
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!oVarV.Q((J8.i) it2.next())) {
                    if (!z10 || !list2.isEmpty()) {
                        java.util.Iterator it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (t((J8.i) it3.next()) != null) {
                                    arrayList = listX;
                                }
                            }
                            list = arrayList;
                            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                                hVar = p058f8.h.NULLABLE;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    hVar = p058f8.h.NULLABLE;
                                    break;
                                }
                                if (!oVarV.p((J8.i) it.next())) {
                                    hVar = p058f8.h.NOT_NULL;
                                    break;
                                }
                            }
                            if (arrayList != listX) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            return new p058f8.i(hVar, z6);
                        }
                    }
                    if (!z10 || !list2.isEmpty()) {
                        java.util.Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (q((J8.i) it4.next()) != null) {
                                arrayList = new java.util.ArrayList();
                                java.util.Iterator it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    J8.i iVarQ = q((J8.i) it5.next());
                                    if (iVarQ != null) {
                                        arrayList.add(iVarQ);
                                    }
                                }
                                list = arrayList;
                                if (list instanceof java.util.Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            hVar = p058f8.h.NULLABLE;
                                            break;
                                        }
                                        if (!oVarV.p((J8.i) it.next())) {
                                            hVar = p058f8.h.NOT_NULL;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            hVar = p058f8.h.NULLABLE;
                                            break;
                                        }
                                        if (!oVarV.p((J8.i) it.next())) {
                                            hVar = p058f8.h.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != listX) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                return new p058f8.i(hVar, z6);
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return null;
    }

    private final p058f8.h t(J8.i iVar) {
        J8.o oVarV = v();
        if (oVarV.C0(oVarV.z(iVar))) {
            return p058f8.h.NULLABLE;
        }
        if (oVarV.C0(oVarV.G(iVar))) {
            return null;
        }
        return p058f8.h.NOT_NULL;
    }

    public abstract boolean A(J8.i iVar);

    public final p237x7.l b(J8.i iVar, java.lang.Iterable iterable, p058f8.q qVar, boolean z6) {
        int size;
        J8.i iVarB;
        p247y7.AbstractC7350t.f(iVar, "<this>");
        p247y7.AbstractC7350t.f(iterable, "overrides");
        java.util.List listC = C(iVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(C((J8.i) it.next()));
        }
        if (r()) {
            size = 1;
        } else {
            if (x() && (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty())) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!y(iVar, (J8.i) it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listC.size();
        }
        p058f8.e[] eVarArr = new p058f8.e[size];
        int i6 = 0;
        while (i6 < size) {
            p058f8.e eVarE = e((p058f8.a.C0505a) listC.get(i6));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p058f8.a.C0505a c0505a = (p058f8.a.C0505a) p097j7.AbstractC6879v.l0((java.util.List) it3.next(), i6);
                p058f8.e eVarD = (c0505a == null || (iVarB = c0505a.b()) == null) ? null : d(iVarB);
                if (eVarD != null) {
                    arrayList2.add(eVarD);
                }
            }
            eVarArr[i6] = p058f8.s.a(eVarE, arrayList2, i6 == 0 && x(), i6 == 0 && o(), z6);
            i6++;
        }
        return new f8.a.b(qVar, eVarArr);
    }

    public abstract boolean h(java.lang.Object obj, J8.i iVar);

    public abstract X7.AbstractC1823a i();

    public abstract java.lang.Iterable j(J8.i iVar);

    public abstract java.lang.Iterable l();

    public abstract X7.EnumC1824b m();

    public abstract X7.y n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract J8.i q(J8.i iVar);

    public boolean r() {
        return false;
    }

    public abstract p138n8.d s(J8.i iVar);

    public abstract boolean u();

    public abstract J8.o v();

    public abstract boolean w(J8.i iVar);

    public abstract boolean x();

    public abstract boolean y(J8.i iVar, J8.i iVar2);

    public abstract boolean z(J8.n nVar);
}
