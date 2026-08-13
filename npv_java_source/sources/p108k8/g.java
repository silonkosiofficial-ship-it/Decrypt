package p108k8;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f49816a;

    public g(p088i8.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "typeTable");
        java.util.List listA = tVar.A();
        if (tVar.B()) {
            int iX = tVar.x();
            java.util.List listA2 = tVar.A();
            p247y7.AbstractC7350t.e(listA2, "getTypeList(...)");
            java.util.List list = listA2;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
            int i6 = 0;
            for (java.lang.Object obj : list) {
                int i10 = i6 + 1;
                if (i6 < 0) {
                    p097j7.AbstractC6879v.w();
                }
                p088i8.q qVarU = (p088i8.q) obj;
                if (i6 >= iX) {
                    qVarU = qVarU.e().L(true).i();
                }
                arrayList.add(qVarU);
                i6 = i10;
            }
            listA = arrayList;
        }
        p247y7.AbstractC7350t.e(listA, "run(...)");
        this.f49816a = listA;
    }

    public final p088i8.q a(int i6) {
        return (p088i8.q) this.f49816a.get(i6);
    }
}
