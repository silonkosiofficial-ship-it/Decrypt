package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ P8.g f54033D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(P8.g gVar) {
            super(1);
            this.f54033D = gVar;
        }

        public final void a(java.lang.Object obj) {
            P8.g gVar = this.f54033D;
            p247y7.AbstractC7350t.c(obj);
            gVar.add(obj);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    public static final java.util.Collection a(java.util.Collection collection, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(collection, "<this>");
        p247y7.AbstractC7350t.f(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(collection);
        P8.g gVarA = P8.g.f8491E.a();
        while (!linkedList.isEmpty()) {
            java.lang.Object objI0 = p097j7.AbstractC6879v.i0(linkedList);
            P8.g gVarA2 = P8.g.f8491E.a();
            java.util.Collection collectionQ = p178r8.l.q(objI0, linkedList, lVar, new r8.n.a(gVarA2));
            p247y7.AbstractC7350t.e(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && gVarA2.isEmpty()) {
                java.lang.Object objF0 = p097j7.AbstractC6879v.F0(collectionQ);
                p247y7.AbstractC7350t.e(objF0, "single(...)");
                gVarA.add(objF0);
            } else {
                java.lang.Object objL = p178r8.l.L(collectionQ, lVar);
                p247y7.AbstractC7350t.e(objL, "selectMostSpecificMember(...)");
                O7.InterfaceC1420a interfaceC1420a = (O7.InterfaceC1420a) lVar.l(objL);
                for (java.lang.Object obj : collectionQ) {
                    p247y7.AbstractC7350t.c(obj);
                    if (!p178r8.l.B(interfaceC1420a, (O7.InterfaceC1420a) lVar.l(obj))) {
                        gVarA2.add(obj);
                    }
                }
                if (!gVarA2.isEmpty()) {
                    gVarA.addAll(gVarA2);
                }
                gVarA.add(objL);
            }
        }
        return gVarA;
    }
}
