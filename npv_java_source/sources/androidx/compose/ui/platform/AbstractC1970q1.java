package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1970q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p131n0.i f20215a = new p131n0.i(0.0f, 0.0f, 10.0f, 10.0f);

    public static final androidx.compose.ui.platform.C1961n1 a(java.util.List list, int i6) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((androidx.compose.ui.platform.C1961n1) list.get(i10)).d() == i6) {
                return (androidx.compose.ui.platform.C1961n1) list.get(i10);
            }
        }
        return null;
    }

    public static final p170r.AbstractC7039n b(K0.q qVar) {
        K0.o oVarA = qVar.a();
        p170r.C cB = p170r.AbstractC7040o.b();
        if (oVarA.q().k() && oVarA.q().K0()) {
            p131n0.i iVarI = oVarA.i();
            c(new android.graphics.Region(java.lang.Math.round(iVarI.i()), java.lang.Math.round(iVarI.l()), java.lang.Math.round(iVarI.j()), java.lang.Math.round(iVarI.e())), oVarA, cB, oVarA, new android.graphics.Region());
        }
        return cB;
    }

    private static final void c(android.graphics.Region region, K0.o oVar, p170r.C c6, K0.o oVar2, android.graphics.Region region2) {
        D0.InterfaceC0904x interfaceC0904xP;
        boolean z6 = (oVar2.q().k() && oVar2.q().K0()) ? false : true;
        if (!region.isEmpty() || oVar2.o() == oVar.o()) {
            if (!z6 || oVar2.x()) {
                p131n0.i iVarV = oVar2.v();
                int iRound = java.lang.Math.round(iVarV.i());
                int iRound2 = java.lang.Math.round(iVarV.l());
                int iRound3 = java.lang.Math.round(iVarV.j());
                int iRound4 = java.lang.Math.round(iVarV.e());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int iO = oVar2.o() == oVar.o() ? -1 : oVar2.o();
                if (!region2.op(region, android.graphics.Region.Op.INTERSECT)) {
                    if (oVar2.x()) {
                        K0.o oVarR = oVar2.r();
                        p131n0.i iVarI = (oVarR == null || (interfaceC0904xP = oVarR.p()) == null || !interfaceC0904xP.k()) ? f20215a : oVarR.i();
                        c6.s(iO, new androidx.compose.ui.platform.C1967p1(oVar2, new android.graphics.Rect(java.lang.Math.round(iVarI.i()), java.lang.Math.round(iVarI.l()), java.lang.Math.round(iVarI.j()), java.lang.Math.round(iVarI.e()))));
                        return;
                    } else {
                        if (iO == -1) {
                            c6.s(iO, new androidx.compose.ui.platform.C1967p1(oVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c6.s(iO, new androidx.compose.ui.platform.C1967p1(oVar2, region2.getBounds()));
                java.util.List listT = oVar2.t();
                for (int size = listT.size() - 1; -1 < size; size--) {
                    c(region, oVar, c6, (K0.o) listT.get(size), region2);
                }
                if (f(oVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, android.graphics.Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final java.lang.Float d(K0.k kVar) {
        p237x7.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        K0.a aVar = (K0.a) K0.l.a(kVar, K0.j.f5973a.h());
        if (aVar == null || (lVar = (p237x7.l) aVar.a()) == null || !((java.lang.Boolean) lVar.l(arrayList)).booleanValue()) {
            return null;
        }
        return (java.lang.Float) arrayList.get(0);
    }

    public static final M0.K e(K0.k kVar) {
        p237x7.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        K0.a aVar = (K0.a) K0.l.a(kVar, K0.j.f5973a.i());
        if (aVar == null || (lVar = (p237x7.l) aVar.a()) == null || !((java.lang.Boolean) lVar.l(arrayList)).booleanValue()) {
            return null;
        }
        return (M0.K) arrayList.get(0);
    }

    public static final boolean f(K0.o oVar) {
        return g(oVar) && (oVar.w().M() || oVar.w().g());
    }

    public static final boolean g(K0.o oVar) {
        return (oVar.z() || oVar.w().f(K0.r.f6030a.n())) ? false : true;
    }

    public static final android.view.View h(androidx.compose.ui.platform.C1936f0 c1936f0, int i6) {
        java.lang.Object next;
        java.util.Iterator<T> it = c1936f0.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((F0.J) ((java.util.Map.Entry) next).getKey()).q0() != i6);
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.c) entry.getValue();
        }
        return null;
    }

    public static final java.lang.String i(int i6) {
        K0.h.a aVar = K0.h.f5956b;
        if (K0.h.k(i6, aVar.a())) {
            return "android.widget.Button";
        }
        if (K0.h.k(i6, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (K0.h.k(i6, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (K0.h.k(i6, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (K0.h.k(i6, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
