package p132n1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1.i.a f51397a = new n1.i.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final p132n1.o b(java.util.ArrayList arrayList, int i6) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                java.lang.Object obj = arrayList.get(i10);
                p247y7.AbstractC7350t.e(obj, "get(...)");
                p132n1.o oVar = (p132n1.o) obj;
                if (i6 == oVar.c()) {
                    return oVar;
                }
            }
            return null;
        }

        public final p132n1.o a(p122m1.e eVar, int i6, java.util.ArrayList arrayList, p132n1.o oVar) {
            p122m1.d dVarG;
            int iC2;
            p247y7.AbstractC7350t.f(eVar, "constraintWidget");
            p247y7.AbstractC7350t.f(arrayList, "list");
            int iB = i6 == 0 ? eVar.B() : eVar.z0();
            if (iB != -1 && (oVar == null || iB != oVar.c())) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    java.lang.Object obj = arrayList.get(i10);
                    p247y7.AbstractC7350t.e(obj, "get(...)");
                    p132n1.o oVar2 = (p132n1.o) obj;
                    if (oVar2.c() == iB) {
                        if (oVar != null) {
                            oVar.g(i6, oVar2);
                            arrayList.remove(oVar);
                        }
                        oVar = oVar2;
                        break;
                    }
                }
            } else if (iB != -1) {
                return oVar;
            }
            if (oVar == null) {
                if ((eVar instanceof p122m1.j) && (iC2 = ((p122m1.j) eVar).c2(i6)) != -1) {
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        java.lang.Object obj2 = arrayList.get(i11);
                        p247y7.AbstractC7350t.e(obj2, "get(...)");
                        p132n1.o oVar3 = (p132n1.o) obj2;
                        if (oVar3.c() == iC2) {
                            oVar = oVar3;
                            break;
                        }
                    }
                }
                if (oVar == null) {
                    oVar = new p132n1.o(i6);
                }
                arrayList.add(oVar);
            }
            if (oVar.a(eVar)) {
                if (eVar instanceof p122m1.h) {
                    p122m1.h hVar = (p122m1.h) eVar;
                    hVar.a2().c(hVar.b2() == 0 ? 1 : 0, arrayList, oVar);
                }
                int iC = oVar.c();
                if (i6 == 0) {
                    eVar.s1(iC);
                    eVar.L().c(i6, arrayList, oVar);
                    dVarG = eVar.b0();
                } else {
                    eVar.Q1(iC);
                    eVar.c0().c(i6, arrayList, oVar);
                    eVar.F().c(i6, arrayList, oVar);
                    dVarG = eVar.G();
                }
                dVarG.c(i6, arrayList, oVar);
                eVar.H().c(i6, arrayList, oVar);
            }
            return oVar;
        }

        /* JADX WARN: Code duplicated, block: B:171:0x03ee  */
        public final boolean c(p122m1.f fVar, n1.b.c cVar) {
            p132n1.o oVar;
            boolean z6;
            boolean z10;
            p132n1.o oVar2;
            p247y7.AbstractC7350t.f(fVar, "layout");
            java.util.ArrayList arrayListC2 = fVar.c2();
            int size = arrayListC2.size();
            int i6 = 0;
            while (true) {
                java.lang.String str = "get(...)";
                if (i6 >= size) {
                    fVar.z2();
                    int i10 = 0;
                    java.util.ArrayList arrayList = null;
                    java.util.ArrayList arrayList2 = null;
                    java.util.ArrayList<p122m1.e> arrayList3 = null;
                    java.util.ArrayList arrayList4 = null;
                    java.util.ArrayList arrayList5 = null;
                    java.util.ArrayList arrayList6 = null;
                    while (i10 < size) {
                        java.lang.Object obj = arrayListC2.get(i10);
                        p247y7.AbstractC7350t.e(obj, str);
                        p122m1.e eVar = (p122m1.e) obj;
                        java.lang.String str2 = str;
                        if (!d(fVar.A(), fVar.y0(), eVar.A(), eVar.y0())) {
                            p122m1.f.f50371h1.a(0, eVar, cVar, fVar.y2(), p132n1.b.C0649b.f51342k.a());
                        }
                        boolean z11 = eVar instanceof p122m1.h;
                        if (z11) {
                            p122m1.h hVar = (p122m1.h) eVar;
                            if (hVar.b2() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new java.util.ArrayList();
                                }
                                arrayList3.add(hVar);
                            }
                            if (hVar.b2() == 1) {
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(hVar);
                            }
                        }
                        if (eVar instanceof p122m1.j) {
                            if (eVar instanceof p122m1.a) {
                                p122m1.a aVar = (p122m1.a) eVar;
                                if (aVar.j2() == 0) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new java.util.ArrayList();
                                    }
                                    arrayList2.add(aVar);
                                }
                                if (aVar.j2() == 1) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new java.util.ArrayList();
                                    }
                                    arrayList4.add(aVar);
                                }
                            } else {
                                if (arrayList2 == null) {
                                    arrayList2 = new java.util.ArrayList();
                                }
                                arrayList2.add(eVar);
                                if (arrayList4 == null) {
                                    arrayList4 = new java.util.ArrayList();
                                }
                                arrayList4.add(eVar);
                            }
                        }
                        if (eVar.L().i() == null && eVar.b0().i() == null && !z11 && !(eVar instanceof p122m1.a)) {
                            if (arrayList5 == null) {
                                arrayList5 = new java.util.ArrayList();
                            }
                            arrayList5.add(eVar);
                        }
                        if (eVar.c0().i() == null && eVar.G().i() == null && eVar.F().i() == null && !z11 && !(eVar instanceof p122m1.a)) {
                            if (arrayList6 == null) {
                                arrayList6 = new java.util.ArrayList();
                            }
                            arrayList6.add(eVar);
                        }
                        i10++;
                        str = str2;
                    }
                    java.lang.String str3 = str;
                    java.util.ArrayList<p132n1.o> arrayList7 = new java.util.ArrayList();
                    if (arrayList != null) {
                        for (java.lang.Object obj2 : arrayList) {
                            p247y7.AbstractC7350t.e(obj2, "next(...)");
                            a((p122m1.h) obj2, 0, arrayList7, null);
                        }
                    }
                    if (arrayList2 != null) {
                        for (java.lang.Object obj3 : arrayList2) {
                            p247y7.AbstractC7350t.e(obj3, "next(...)");
                            p122m1.j jVar = (p122m1.j) obj3;
                            p132n1.o oVarA = a(jVar, 0, arrayList7, null);
                            jVar.b2(arrayList7, 0, oVarA);
                            p247y7.AbstractC7350t.c(oVarA);
                            oVarA.b(arrayList7);
                        }
                    }
                    p122m1.d dVarL = fVar.l(m1.d.b.LEFT);
                    p247y7.AbstractC7350t.c(dVarL);
                    if (dVarL.d() != null) {
                        java.util.HashSet hashSetD = dVarL.d();
                        p247y7.AbstractC7350t.c(hashSetD);
                        for (java.lang.Object obj4 : hashSetD) {
                            p247y7.AbstractC7350t.e(obj4, "next(...)");
                            a(((p122m1.d) obj4).g(), 0, arrayList7, null);
                        }
                    }
                    p122m1.d dVarL2 = fVar.l(m1.d.b.RIGHT);
                    p247y7.AbstractC7350t.c(dVarL2);
                    if (dVarL2.d() != null) {
                        java.util.HashSet hashSetD2 = dVarL2.d();
                        p247y7.AbstractC7350t.c(hashSetD2);
                        for (java.lang.Object obj5 : hashSetD2) {
                            p247y7.AbstractC7350t.e(obj5, "next(...)");
                            a(((p122m1.d) obj5).g(), 0, arrayList7, null);
                        }
                    }
                    p122m1.d dVarL3 = fVar.l(m1.d.b.CENTER);
                    p247y7.AbstractC7350t.c(dVarL3);
                    if (dVarL3.d() != null) {
                        java.util.HashSet hashSetD3 = dVarL3.d();
                        p247y7.AbstractC7350t.c(hashSetD3);
                        for (java.lang.Object obj6 : hashSetD3) {
                            p247y7.AbstractC7350t.e(obj6, "next(...)");
                            a(((p122m1.d) obj6).g(), 0, arrayList7, null);
                        }
                    }
                    if (arrayList5 != null) {
                        for (java.lang.Object obj7 : arrayList5) {
                            p247y7.AbstractC7350t.e(obj7, "next(...)");
                            a((p122m1.e) obj7, 0, arrayList7, null);
                        }
                    }
                    if (arrayList3 != null) {
                        for (p122m1.e eVar2 : arrayList3) {
                            p247y7.AbstractC7350t.c(eVar2);
                            a(eVar2, 1, arrayList7, null);
                        }
                    }
                    if (arrayList4 != null) {
                        for (java.lang.Object obj8 : arrayList4) {
                            p247y7.AbstractC7350t.e(obj8, "next(...)");
                            p122m1.j jVar2 = (p122m1.j) obj8;
                            p132n1.o oVarA2 = a(jVar2, 1, arrayList7, null);
                            jVar2.b2(arrayList7, 1, oVarA2);
                            p247y7.AbstractC7350t.c(oVarA2);
                            oVarA2.b(arrayList7);
                        }
                    }
                    p122m1.d dVarL4 = fVar.l(m1.d.b.TOP);
                    p247y7.AbstractC7350t.c(dVarL4);
                    if (dVarL4.d() != null) {
                        java.util.HashSet hashSetD4 = dVarL4.d();
                        p247y7.AbstractC7350t.c(hashSetD4);
                        for (java.lang.Object obj9 : hashSetD4) {
                            p247y7.AbstractC7350t.e(obj9, "next(...)");
                            a(((p122m1.d) obj9).g(), 1, arrayList7, null);
                        }
                    }
                    p122m1.d dVarL5 = fVar.l(m1.d.b.BASELINE);
                    p247y7.AbstractC7350t.c(dVarL5);
                    if (dVarL5.d() != null) {
                        java.util.HashSet hashSetD5 = dVarL5.d();
                        p247y7.AbstractC7350t.c(hashSetD5);
                        for (java.lang.Object obj10 : hashSetD5) {
                            p247y7.AbstractC7350t.e(obj10, "next(...)");
                            a(((p122m1.d) obj10).g(), 1, arrayList7, null);
                        }
                    }
                    p122m1.d dVarL6 = fVar.l(m1.d.b.BOTTOM);
                    p247y7.AbstractC7350t.c(dVarL6);
                    if (dVarL6.d() != null) {
                        java.util.HashSet hashSetD6 = dVarL6.d();
                        p247y7.AbstractC7350t.c(hashSetD6);
                        for (java.lang.Object obj11 : hashSetD6) {
                            p247y7.AbstractC7350t.e(obj11, "next(...)");
                            a(((p122m1.d) obj11).g(), 1, arrayList7, null);
                        }
                    }
                    p122m1.d dVarL7 = fVar.l(m1.d.b.CENTER);
                    p247y7.AbstractC7350t.c(dVarL7);
                    if (dVarL7.d() != null) {
                        java.util.HashSet hashSetD7 = dVarL7.d();
                        p247y7.AbstractC7350t.c(hashSetD7);
                        for (java.lang.Object obj12 : hashSetD7) {
                            p247y7.AbstractC7350t.e(obj12, "next(...)");
                            a(((p122m1.d) obj12).g(), 1, arrayList7, null);
                        }
                    }
                    if (arrayList6 != null) {
                        for (java.lang.Object obj13 : arrayList6) {
                            p247y7.AbstractC7350t.e(obj13, "next(...)");
                            a((p122m1.e) obj13, 1, arrayList7, null);
                        }
                    }
                    int i11 = 0;
                    while (i11 < size) {
                        java.lang.Object obj14 = arrayListC2.get(i11);
                        java.lang.String str4 = str3;
                        p247y7.AbstractC7350t.e(obj14, str4);
                        p122m1.e eVar3 = (p122m1.e) obj14;
                        if (eVar3.V0()) {
                            p132n1.o oVarB = b(arrayList7, eVar3.B());
                            p132n1.o oVarB2 = b(arrayList7, eVar3.z0());
                            if (oVarB != null && oVarB2 != null) {
                                oVarB.g(0, oVarB2);
                                oVarB2.i(2);
                                arrayList7.remove(oVarB);
                            }
                        }
                        i11++;
                        str3 = str4;
                    }
                    if (arrayList7.size() <= 1) {
                        return false;
                    }
                    if (fVar.A() == m1.e.b.WRAP_CONTENT) {
                        oVar = null;
                        int i12 = 0;
                        for (p132n1.o oVar3 : arrayList7) {
                            p247y7.AbstractC7350t.c(oVar3);
                            if (oVar3.d() != 1) {
                                oVar3.h(false);
                                int iF = oVar3.f(fVar.G2(), 0);
                                if (iF > i12) {
                                    oVar = oVar3;
                                    i12 = iF;
                                }
                            }
                        }
                        if (oVar != null) {
                            fVar.r1(m1.e.b.FIXED);
                            fVar.U1(i12);
                            oVar.h(true);
                        } else {
                            oVar = null;
                        }
                    } else {
                        oVar = null;
                    }
                    if (fVar.y0() == m1.e.b.WRAP_CONTENT) {
                        p132n1.o oVar4 = null;
                        int i13 = 0;
                        for (p132n1.o oVar5 : arrayList7) {
                            p247y7.AbstractC7350t.c(oVar5);
                            if (oVar5.d() != 0) {
                                oVar5.h(false);
                                int iF2 = oVar5.f(fVar.G2(), 1);
                                if (iF2 > i13) {
                                    oVar4 = oVar5;
                                    i13 = iF2;
                                }
                            }
                        }
                        z6 = false;
                        z10 = true;
                        if (oVar4 != null) {
                            fVar.P1(m1.e.b.FIXED);
                            fVar.m1(i13);
                            oVar4.h(true);
                            oVar2 = oVar4;
                        }
                        return (oVar == null || oVar2 != null) ? z10 : z6;
                    }
                    z6 = false;
                    z10 = true;
                    oVar2 = null;
                    if (oVar == null) {
                    }
                }
                java.lang.Object obj15 = arrayListC2.get(i6);
                p247y7.AbstractC7350t.e(obj15, "get(...)");
                p122m1.e eVar4 = (p122m1.e) obj15;
                if (!d(fVar.A(), fVar.y0(), eVar4.A(), eVar4.y0()) || (eVar4 instanceof p122m1.g)) {
                    return false;
                }
                i6++;
            }
        }

        public final boolean d(m1.e.b bVar, m1.e.b bVar2, m1.e.b bVar3, m1.e.b bVar4) {
            m1.e.b bVar5;
            m1.e.b bVar6;
            p247y7.AbstractC7350t.f(bVar, "layoutHorizontal");
            p247y7.AbstractC7350t.f(bVar2, "layoutVertical");
            p247y7.AbstractC7350t.f(bVar3, "widgetHorizontal");
            p247y7.AbstractC7350t.f(bVar4, "widgetVertical");
            m1.e.b bVar7 = m1.e.b.FIXED;
            return (bVar3 == bVar7 || bVar3 == (bVar6 = m1.e.b.WRAP_CONTENT) || (bVar3 == m1.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = m1.e.b.WRAP_CONTENT) || (bVar4 == m1.e.b.MATCH_PARENT && bVar2 != bVar5));
        }
    }
}
