package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final m9.n.a f51258D = new m9.n.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(p129m9.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "it");
            return "position " + iVar.b() + ": '" + ((java.lang.String) iVar.a().b()) + '\'';
        }
    }

    public static final p129m9.q b(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "<this>");
        p129m9.q qVar = new p129m9.q(p097j7.AbstractC6879v.m(), p097j7.AbstractC6879v.m());
        if (!list.isEmpty()) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                qVar = c((p129m9.q) listIterator.previous(), qVar);
            }
        }
        return d(qVar, p097j7.AbstractC6879v.m());
    }

    private static final p129m9.q c(p129m9.q qVar, p129m9.q qVar2) {
        if (qVar.a().isEmpty()) {
            return new p129m9.q(p097j7.AbstractC6879v.C0(qVar.b(), qVar2.b()), qVar2.a());
        }
        java.util.List listB = qVar.b();
        java.util.List listA = qVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listA, 10));
        java.util.Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((p129m9.q) it.next(), qVar2));
        }
        return new p129m9.q(listB, arrayList);
    }

    private static final p129m9.q d(p129m9.q qVar, java.util.List list) {
        p129m9.q qVar2;
        java.util.List listE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listW0 = p097j7.AbstractC6879v.W0(list);
        java.util.List listW1 = null;
        for (p129m9.o oVar : qVar.b()) {
            if (oVar instanceof p129m9.h) {
                p129m9.h hVar = (p129m9.h) oVar;
                if (listW1 != null) {
                    listW1.addAll(hVar.c());
                } else {
                    listW1 = p097j7.AbstractC6879v.W0(hVar.c());
                }
            } else if (oVar instanceof p129m9.v) {
                listW0.add(oVar);
            } else {
                if (listW1 != null) {
                    arrayList.add(new p129m9.h(listW1));
                    listW1 = null;
                }
                arrayList.add(oVar);
            }
        }
        java.util.List listA = qVar.a();
        java.util.List arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = listA.iterator();
        while (it.hasNext()) {
            p129m9.q qVarD = d((p129m9.q) it.next(), listW0);
            if (qVarD.b().isEmpty()) {
                java.util.List listA2 = qVarD.a();
                if (listA2.isEmpty()) {
                    listA2 = p097j7.AbstractC6879v.e(qVarD);
                }
                listE = listA2;
            } else {
                listE = p097j7.AbstractC6879v.e(qVarD);
            }
            p097j7.AbstractC6879v.C(arrayList2, listE);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = p097j7.AbstractC6879v.e(new p129m9.q(listW0, p097j7.AbstractC6879v.m()));
        }
        java.util.List list2 = arrayList2;
        if (listW1 == null) {
            return new p129m9.q(arrayList, list2);
        }
        java.util.List<p129m9.q> list3 = list2;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                p129m9.o oVar2 = (p129m9.o) p097j7.AbstractC6879v.k0(((p129m9.q) it2.next()).b());
                if (oVar2 != null && (oVar2 instanceof p129m9.h)) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
                    for (p129m9.q qVar3 : list3) {
                        p129m9.o oVar3 = (p129m9.o) p097j7.AbstractC6879v.k0(qVar3.b());
                        if (oVar3 instanceof p129m9.h) {
                            qVar2 = new p129m9.q(p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.e(new p129m9.h(p097j7.AbstractC6879v.C0(listW1, ((p129m9.h) oVar3).c()))), p097j7.AbstractC6879v.c0(qVar3.b(), 1)), qVar3.a());
                        } else {
                            qVar2 = oVar3 == null ? new p129m9.q(p097j7.AbstractC6879v.e(new p129m9.h(listW1)), qVar3.a()) : new p129m9.q(p097j7.AbstractC6879v.C0(p097j7.AbstractC6879v.e(new p129m9.h(listW1)), qVar3.b()), qVar3.a());
                        }
                        arrayList3.add(qVar2);
                    }
                    return new p129m9.q(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new p129m9.h(listW1));
        return new p129m9.q(arrayList, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String e(java.util.List list) {
        if (list.size() != 1) {
            java.lang.String string = ((java.lang.StringBuilder) p097j7.G.o0(list, new java.lang.StringBuilder(list.size() * 33), (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "Errors: ", (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : m9.n.a.f51258D)).toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return string;
        }
        return "Position " + ((p129m9.i) list.get(0)).b() + ": " + ((java.lang.String) ((p129m9.i) list.get(0)).a().b());
    }
}
