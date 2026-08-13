package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aa.InterfaceC1888b f17314a = new aa.o.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V.O0 f17315b = V.AbstractC1756y.f(aa.o.b.f17317D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static F7.f f17316c = aa.o.e.f17318L;

    public static final class a implements aa.InterfaceC1888b {
        a() {
        }

        @Override // aa.InterfaceC1888b
        public aa.n a(V.InterfaceC1734n interfaceC1734n, int i6) {
            interfaceC1734n.T(1808039825);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(1808039825, i6, -1, "org.jetbrains.compose.resources.DefaultComposeEnvironment.<no name provided>.rememberEnvironment (ResourceEnvironment.kt:44)");
            }
            T0.g gVarA = T0.g.f12887b.a();
            boolean zA = p210v.AbstractC7219m.a(interfaceC1734n, 0);
            Y0.e eVar = (Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e());
            interfaceC1734n.T(1697238779);
            boolean zS = interfaceC1734n.S(gVarA) | interfaceC1734n.d(zA) | interfaceC1734n.S(eVar);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new aa.n(new aa.i(gVarA.a()), new aa.l(gVarA.c()), aa.C.f17241C.a(zA), aa.EnumC1889c.f17259D.a(eVar.getDensity()));
                interfaceC1734n.K(objG);
            }
            aa.n nVar = (aa.n) objG;
            interfaceC1734n.J();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return nVar;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.o.b f17317D = new aa.o.b();

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final aa.InterfaceC1888b b() {
            return aa.o.d();
        }
    }

    public static final class c implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(((aa.EnumC1889c) obj).g()), java.lang.Integer.valueOf(((aa.EnumC1889c) obj2).g()));
        }
    }

    public static final class d implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(java.lang.Integer.valueOf(((aa.EnumC1889c) obj2).g()), java.lang.Integer.valueOf(((aa.EnumC1889c) obj).g()));
        }
    }

    /* synthetic */ class e extends p247y7.C7348q implements p237x7.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final aa.o.e f17318L = new aa.o.e();

        e() {
            super(0, aa.p.class, "getSystemEnvironment", "getSystemEnvironment()Lorg/jetbrains/compose/resources/ResourceEnvironment;", 1);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final aa.n b() {
            return aa.p.a();
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final aa.o.f f17319D = new aa.o.f();

        f() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(aa.q qVar) {
            p247y7.AbstractC7350t.f(qVar, "it");
            return qVar.b();
        }
    }

    private static final java.util.List a(java.util.List list, aa.k kVar) {
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            java.util.Set setC = ((aa.q) obj).c();
            if (!(setC instanceof java.util.Collection) || !setC.isEmpty()) {
                java.util.Iterator it = setC.iterator();
                while (it.hasNext()) {
                    if (p247y7.AbstractC7350t.b((aa.k) it.next(), kVar)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            java.util.Set setC2 = ((aa.q) obj2).c();
            if (!(setC2 instanceof java.util.Collection) || !setC2.isEmpty()) {
                java.util.Iterator it2 = setC2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (((aa.k) it2.next()).getClass() != kVar.getClass());
            }
            arrayList2.add(obj2);
        }
        return arrayList2;
    }

    private static final java.util.List b(java.util.List list, aa.EnumC1889c enumC1889c) {
        java.util.List listM = p097j7.AbstractC6879v.m();
        p157p7.a aVarI = aa.EnumC1889c.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : aVarI) {
            if (((aa.EnumC1889c) obj).g() >= enumC1889c.g()) {
                arrayList.add(obj);
            }
        }
        for (aa.EnumC1889c enumC1889c2 : p097j7.AbstractC6879v.L0(arrayList, new aa.o.c())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                java.util.Set setC = ((aa.q) obj2).c();
                if (!(setC instanceof java.util.Collection) || !setC.isEmpty()) {
                    java.util.Iterator it = setC.iterator();
                    while (it.hasNext()) {
                        if (((aa.k) it.next()) == enumC1889c2) {
                            arrayList2.add(obj2);
                            break;
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                listM = arrayList2;
                break;
            }
            listM = arrayList2;
        }
        if (!listM.isEmpty()) {
            return listM;
        }
        java.util.List listZ0 = p097j7.AbstractC6879v.z0(aa.EnumC1889c.i(), aa.EnumC1889c.LDPI);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : listZ0) {
            if (((aa.EnumC1889c) obj3).g() < enumC1889c.g()) {
                arrayList3.add(obj3);
            }
        }
        for (aa.EnumC1889c enumC1889c3 : p097j7.AbstractC6879v.L0(arrayList3, new aa.o.d())) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                java.util.Set setC2 = ((aa.q) obj4).c();
                if (!(setC2 instanceof java.util.Collection) || !setC2.isEmpty()) {
                    java.util.Iterator it2 = setC2.iterator();
                    while (it2.hasNext()) {
                        if (((aa.k) it2.next()) == enumC1889c3) {
                            arrayList4.add(obj4);
                            break;
                        }
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                listM = arrayList4;
                break;
            }
            listM = arrayList4;
        }
        if (!listM.isEmpty()) {
            return listM;
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj5 : list2) {
            java.util.Set setC3 = ((aa.q) obj5).c();
            if (!(setC3 instanceof java.util.Collection) || !setC3.isEmpty()) {
                java.util.Iterator it3 = setC3.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (!(((aa.k) it3.next()) instanceof aa.EnumC1889c));
            }
            arrayList5.add(obj5);
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj6 : list2) {
            java.util.Set setC4 = ((aa.q) obj6).c();
            if (!(setC4 instanceof java.util.Collection) || !setC4.isEmpty()) {
                java.util.Iterator it4 = setC4.iterator();
                while (it4.hasNext()) {
                    if (((aa.k) it4.next()) == aa.EnumC1889c.LDPI) {
                        arrayList6.add(obj6);
                        break;
                    }
                }
            }
        }
        return arrayList6;
    }

    private static final java.util.List c(java.util.List list, aa.i iVar, aa.l lVar) {
        aa.k kVar;
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            java.util.Set setC = ((aa.q) obj).c();
            if (!(setC instanceof java.util.Collection) || !setC.isEmpty()) {
                java.util.Iterator it = setC.iterator();
                while (it.hasNext()) {
                    if (p247y7.AbstractC7350t.b((aa.k) it.next(), iVar)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            java.util.Set setC2 = ((aa.q) obj2).c();
            if (!(setC2 instanceof java.util.Collection) || !setC2.isEmpty()) {
                java.util.Iterator it2 = setC2.iterator();
                while (it2.hasNext()) {
                    if (p247y7.AbstractC7350t.b((aa.k) it2.next(), lVar)) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            java.util.Set setC3 = ((aa.q) obj3).c();
            if (!(setC3 instanceof java.util.Collection) || !setC3.isEmpty()) {
                java.util.Iterator it3 = setC3.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (!(((aa.k) it3.next()) instanceof aa.l));
            }
            arrayList3.add(obj3);
        }
        if (!arrayList3.isEmpty()) {
            return arrayList3;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list2) {
            java.util.Set setC4 = ((aa.q) obj4).c();
            if (!(setC4 instanceof java.util.Collection) || !setC4.isEmpty()) {
                java.util.Iterator it4 = setC4.iterator();
                do {
                    if (it4.hasNext()) {
                        kVar = (aa.k) it4.next();
                        if (kVar instanceof aa.i) {
                            break;
                        }
                    }
                } while (!(kVar instanceof aa.l));
            }
            arrayList4.add(obj4);
        }
        return arrayList4;
    }

    public static final aa.InterfaceC1888b d() {
        return f17314a;
    }

    public static final V.O0 e() {
        return f17315b;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0027 A[PHI: r0
  0x0027: PHI (r0v11 java.util.List) = (r0v5 java.util.List), (r0v6 java.util.List) binds: [B:3:0x0025, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final aa.q f(aa.m mVar, aa.n nVar) {
        java.lang.Object objI0;
        p247y7.AbstractC7350t.f(mVar, "<this>");
        p247y7.AbstractC7350t.f(nVar, "environment");
        java.util.List listC = c(p097j7.AbstractC6879v.T0(mVar.b()), nVar.b(), nVar.c());
        if (listC.size() == 1) {
            objI0 = p097j7.AbstractC6879v.i0(listC);
        } else {
            listC = a(listC, nVar.d());
            if (listC.size() == 1) {
                objI0 = p097j7.AbstractC6879v.i0(listC);
            } else {
                java.util.List listB = b(listC, nVar.a());
                if (listB.size() != 1) {
                    if (listB.isEmpty()) {
                        throw new java.lang.IllegalStateException(("Resource with ID='" + mVar.a() + "' not found").toString());
                    }
                    throw new java.lang.IllegalStateException(("Resource with ID='" + mVar.a() + "' has more than one file: " + p097j7.AbstractC6879v.r0(listB, null, null, null, 0, null, aa.o.f.f17319D, 31, null)).toString());
                }
                objI0 = p097j7.AbstractC6879v.i0(listB);
            }
        }
        return (aa.q) objI0;
    }

    public static final aa.n g() {
        return (aa.n) ((p237x7.a) f17316c).b();
    }

    public static final aa.n h(V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.T(707674437);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(707674437, i6, -1, "org.jetbrains.compose.resources.rememberResourceEnvironment (ResourceEnvironment.kt:73)");
        }
        aa.n nVarA = ((aa.InterfaceC1888b) interfaceC1734n.n(f17315b)).a(interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return nVarA;
    }
}
