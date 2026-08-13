package B8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G {
    public static final O7.h0 a(p088i8.c cVar, p108k8.c cVar2, p108k8.g gVar, p237x7.l lVar, p237x7.l lVar2) {
        J8.j jVar;
        java.util.List listS0;
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(cVar2, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p247y7.AbstractC7350t.f(lVar, "typeDeserializer");
        p247y7.AbstractC7350t.f(lVar2, "typeOfPublicProperty");
        if (cVar.M0() <= 0) {
            if (!cVar.o1()) {
                return null;
            }
            p138n8.f fVarB = B8.y.b(cVar2, cVar.J0());
            p088i8.q qVarI = p108k8.f.i(cVar, gVar);
            if ((qVarI != null && (jVar = (J8.j) lVar.l(qVarI)) != null) || (jVar = (J8.j) lVar2.l(fVarB)) != null) {
                return new O7.C1444z(fVarB, jVar);
            }
            throw new java.lang.IllegalStateException(("cannot determine underlying type for value class " + B8.y.b(cVar2, cVar.F0()) + " with property " + fVarB).toString());
        }
        java.util.List listN0 = cVar.N0();
        p247y7.AbstractC7350t.e(listN0, "getMultiFieldValueClassUnderlyingNameList(...)");
        java.util.List<java.lang.Integer> list = listN0;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        for (java.lang.Integer num : list) {
            p247y7.AbstractC7350t.c(num);
            arrayList.add(B8.y.b(cVar2, num.intValue()));
        }
        p087i7.u uVarA = p087i7.B.a(java.lang.Integer.valueOf(cVar.Q0()), java.lang.Integer.valueOf(cVar.P0()));
        if (p247y7.AbstractC7350t.b(uVarA, p087i7.B.a(java.lang.Integer.valueOf(arrayList.size()), 0))) {
            java.util.List listR0 = cVar.R0();
            p247y7.AbstractC7350t.e(listR0, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            java.util.List<java.lang.Integer> list2 = listR0;
            listS0 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
            for (java.lang.Integer num2 : list2) {
                p247y7.AbstractC7350t.c(num2);
                listS0.add(gVar.a(num2.intValue()));
            }
        } else {
            if (!p247y7.AbstractC7350t.b(uVarA, p087i7.B.a(0, java.lang.Integer.valueOf(arrayList.size())))) {
                throw new java.lang.IllegalStateException(("class " + B8.y.b(cVar2, cVar.F0()) + " has illegal multi-field value class representation").toString());
            }
            listS0 = cVar.S0();
        }
        p247y7.AbstractC7350t.c(listS0);
        java.util.List list3 = listS0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
        java.util.Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(lVar.l(it.next()));
        }
        return new O7.H(p097j7.AbstractC6879v.c1(arrayList, arrayList2));
    }
}
