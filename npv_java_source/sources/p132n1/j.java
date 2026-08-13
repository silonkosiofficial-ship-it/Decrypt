package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p132n1.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p122m1.e eVar) {
        super(eVar);
        p247y7.AbstractC7350t.f(eVar, "widget");
        p132n1.l lVarK = eVar.K();
        p247y7.AbstractC7350t.c(lVarK);
        lVarK.f();
        p132n1.n nVarE0 = eVar.e0();
        p247y7.AbstractC7350t.c(nVarE0);
        nVarE0.f();
        C(((p122m1.h) eVar).b2());
    }

    private final void H(p132n1.f fVar) {
        q().d().add(fVar);
        fVar.g().add(q());
    }

    @Override // p132n1.p
    public boolean D() {
        return false;
    }

    @Override // p132n1.p, p132n1.d
    public void a(p132n1.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "node");
        if (q().h() && !q().i()) {
            java.lang.Object obj = q().g().get(0);
            p247y7.AbstractC7350t.e(obj, "get(...)");
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.d(eVarN, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            q().k((int) ((((p132n1.f) obj).j() * ((p122m1.h) eVarN).e2()) + 0.5f));
        }
    }

    @Override // p132n1.p
    public void d() {
        p132n1.f fVarQ;
        p132n1.p pVarE0;
        p132n1.f fVarQ2;
        p122m1.e eVarN = n();
        p247y7.AbstractC7350t.d(eVarN, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
        p122m1.h hVar = (p122m1.h) eVarN;
        int iC2 = hVar.c2();
        int iD2 = hVar.d2();
        hVar.e2();
        if (hVar.b2() == 1) {
            p132n1.f fVarQ3 = q();
            if (iC2 != -1) {
                java.util.ArrayList arrayListG = fVarQ3.g();
                p122m1.e eVarN2 = n();
                p247y7.AbstractC7350t.d(eVarN2, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                p122m1.e eVarO0 = ((p122m1.h) eVarN2).o0();
                p247y7.AbstractC7350t.c(eVarO0);
                p132n1.l lVarK = eVarO0.K();
                p247y7.AbstractC7350t.c(lVarK);
                arrayListG.add(lVarK.q());
                p122m1.e eVarN3 = n();
                p247y7.AbstractC7350t.d(eVarN3, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                p122m1.e eVarO1 = ((p122m1.h) eVarN3).o0();
                p247y7.AbstractC7350t.c(eVarO1);
                p132n1.l lVarK2 = eVarO1.K();
                p247y7.AbstractC7350t.c(lVarK2);
                lVarK2.q().d().add(q());
                fVarQ2 = q();
            } else {
                if (iD2 != -1) {
                    java.util.ArrayList arrayListG2 = fVarQ3.g();
                    p122m1.e eVarN4 = n();
                    p247y7.AbstractC7350t.d(eVarN4, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO2 = ((p122m1.h) eVarN4).o0();
                    p247y7.AbstractC7350t.c(eVarO2);
                    p132n1.l lVarK3 = eVarO2.K();
                    p247y7.AbstractC7350t.c(lVarK3);
                    arrayListG2.add(lVarK3.g());
                    p122m1.e eVarN5 = n();
                    p247y7.AbstractC7350t.d(eVarN5, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO3 = ((p122m1.h) eVarN5).o0();
                    p247y7.AbstractC7350t.c(eVarO3);
                    p132n1.l lVarK4 = eVarO3.K();
                    p247y7.AbstractC7350t.c(lVarK4);
                    lVarK4.g().d().add(q());
                    fVarQ2 = q();
                    iC2 = -iD2;
                } else {
                    fVarQ3.l(true);
                    java.util.ArrayList arrayListG3 = q().g();
                    p122m1.e eVarN6 = n();
                    p247y7.AbstractC7350t.d(eVarN6, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO4 = ((p122m1.h) eVarN6).o0();
                    p247y7.AbstractC7350t.c(eVarO4);
                    p132n1.l lVarK5 = eVarO4.K();
                    p247y7.AbstractC7350t.c(lVarK5);
                    arrayListG3.add(lVarK5.g());
                    p122m1.e eVarN7 = n();
                    p247y7.AbstractC7350t.d(eVarN7, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO5 = ((p122m1.h) eVarN7).o0();
                    p247y7.AbstractC7350t.c(eVarO5);
                    p132n1.l lVarK6 = eVarO5.K();
                    p247y7.AbstractC7350t.c(lVarK6);
                    lVarK6.g().d().add(q());
                }
                p122m1.e eVarN8 = n();
                p247y7.AbstractC7350t.d(eVarN8, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                p132n1.l lVarK7 = ((p122m1.h) eVarN8).K();
                p247y7.AbstractC7350t.c(lVarK7);
                H(lVarK7.q());
                p122m1.e eVarN9 = n();
                p247y7.AbstractC7350t.d(eVarN9, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                pVarE0 = ((p122m1.h) eVarN9).K();
            }
            fVarQ2.m(iC2);
            p122m1.e eVarN10 = n();
            p247y7.AbstractC7350t.d(eVarN10, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            p132n1.l lVarK8 = ((p122m1.h) eVarN10).K();
            p247y7.AbstractC7350t.c(lVarK8);
            H(lVarK8.q());
            p122m1.e eVarN11 = n();
            p247y7.AbstractC7350t.d(eVarN11, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            pVarE0 = ((p122m1.h) eVarN11).K();
        } else {
            p132n1.f fVarQ4 = q();
            if (iC2 != -1) {
                java.util.ArrayList arrayListG4 = fVarQ4.g();
                p122m1.e eVarN12 = n();
                p247y7.AbstractC7350t.d(eVarN12, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                p122m1.e eVarO6 = ((p122m1.h) eVarN12).o0();
                p247y7.AbstractC7350t.c(eVarO6);
                p132n1.n nVarE0 = eVarO6.e0();
                p247y7.AbstractC7350t.c(nVarE0);
                arrayListG4.add(nVarE0.q());
                p122m1.e eVarN13 = n();
                p247y7.AbstractC7350t.d(eVarN13, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                p122m1.e eVarO7 = ((p122m1.h) eVarN13).o0();
                p247y7.AbstractC7350t.c(eVarO7);
                p132n1.n nVarE1 = eVarO7.e0();
                p247y7.AbstractC7350t.c(nVarE1);
                nVarE1.q().d().add(q());
                fVarQ = q();
            } else {
                if (iD2 != -1) {
                    java.util.ArrayList arrayListG5 = fVarQ4.g();
                    p122m1.e eVarN14 = n();
                    p247y7.AbstractC7350t.d(eVarN14, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO8 = ((p122m1.h) eVarN14).o0();
                    p247y7.AbstractC7350t.c(eVarO8);
                    p132n1.n nVarE2 = eVarO8.e0();
                    p247y7.AbstractC7350t.c(nVarE2);
                    arrayListG5.add(nVarE2.g());
                    p122m1.e eVarN15 = n();
                    p247y7.AbstractC7350t.d(eVarN15, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO9 = ((p122m1.h) eVarN15).o0();
                    p247y7.AbstractC7350t.c(eVarO9);
                    p132n1.n nVarE3 = eVarO9.e0();
                    p247y7.AbstractC7350t.c(nVarE3);
                    nVarE3.g().d().add(q());
                    fVarQ = q();
                    iC2 = -iD2;
                } else {
                    fVarQ4.l(true);
                    java.util.ArrayList arrayListG6 = q().g();
                    p122m1.e eVarN16 = n();
                    p247y7.AbstractC7350t.d(eVarN16, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO10 = ((p122m1.h) eVarN16).o0();
                    p247y7.AbstractC7350t.c(eVarO10);
                    p132n1.n nVarE4 = eVarO10.e0();
                    p247y7.AbstractC7350t.c(nVarE4);
                    arrayListG6.add(nVarE4.g());
                    p122m1.e eVarN17 = n();
                    p247y7.AbstractC7350t.d(eVarN17, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                    p122m1.e eVarO11 = ((p122m1.h) eVarN17).o0();
                    p247y7.AbstractC7350t.c(eVarO11);
                    p132n1.n nVarE5 = eVarO11.e0();
                    p247y7.AbstractC7350t.c(nVarE5);
                    nVarE5.g().d().add(q());
                }
                p122m1.e eVarN18 = n();
                p247y7.AbstractC7350t.d(eVarN18, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                p132n1.n nVarE6 = ((p122m1.h) eVarN18).e0();
                p247y7.AbstractC7350t.c(nVarE6);
                H(nVarE6.q());
                p122m1.e eVarN19 = n();
                p247y7.AbstractC7350t.d(eVarN19, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
                pVarE0 = ((p122m1.h) eVarN19).e0();
            }
            fVarQ.m(iC2);
            p122m1.e eVarN110 = n();
            p247y7.AbstractC7350t.d(eVarN110, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            p132n1.n nVarE7 = ((p122m1.h) eVarN110).e0();
            p247y7.AbstractC7350t.c(nVarE7);
            H(nVarE7.q());
            p122m1.e eVarN111 = n();
            p247y7.AbstractC7350t.d(eVarN111, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            pVarE0 = ((p122m1.h) eVarN111).e0();
        }
        p247y7.AbstractC7350t.c(pVarE0);
        H(pVarE0.g());
    }

    @Override // p132n1.p
    public void e() {
        p122m1.e eVarN = n();
        p247y7.AbstractC7350t.d(eVarN, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
        if (((p122m1.h) eVarN).b2() == 1) {
            p122m1.e eVarN2 = n();
            p247y7.AbstractC7350t.d(eVarN2, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            ((p122m1.h) eVarN2).V1(q().j());
        } else {
            p122m1.e eVarN3 = n();
            p247y7.AbstractC7350t.d(eVarN3, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline");
            ((p122m1.h) eVarN3).W1(q().j());
        }
    }

    @Override // p132n1.p
    public void f() {
        q().c();
    }
}
