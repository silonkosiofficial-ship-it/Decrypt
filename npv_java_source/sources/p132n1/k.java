package p132n1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p132n1.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p122m1.e eVar) {
        super(eVar);
        p247y7.AbstractC7350t.f(eVar, "widget");
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
        p122m1.e eVarN = n();
        p247y7.AbstractC7350t.d(eVarN, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Barrier");
        p122m1.a aVar = (p122m1.a) eVarN;
        int iH2 = aVar.h2();
        java.util.Iterator it = q().g().iterator();
        int i6 = 0;
        int i10 = -1;
        while (it.hasNext()) {
            int iJ = ((p132n1.f) it.next()).j();
            if (i10 == -1 || iJ < i10) {
                i10 = iJ;
            }
            if (i6 < iJ) {
                i6 = iJ;
            }
        }
        if (iH2 == 0 || iH2 == 2) {
            q().k(i10 + aVar.i2());
        } else {
            q().k(i6 + aVar.i2());
        }
    }

    @Override // p132n1.p
    public void d() {
        p132n1.p pVarK;
        if (n() instanceof p122m1.a) {
            q().l(true);
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.d(eVarN, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Barrier");
            p122m1.a aVar = (p122m1.a) eVarN;
            int iH2 = aVar.h2();
            boolean zG2 = aVar.g2();
            int i6 = 0;
            if (iH2 != 0) {
                if (iH2 != 1) {
                    if (iH2 == 2) {
                        q().p(n1.f.a.TOP);
                        while (i6 < aVar.e2()) {
                            p122m1.e eVar = aVar.d2()[i6];
                            p247y7.AbstractC7350t.c(eVar);
                            if (zG2 || eVar.A0() != 8) {
                                p132n1.n nVarE0 = eVar.e0();
                                p247y7.AbstractC7350t.c(nVarE0);
                                p132n1.f fVarQ = nVarE0.q();
                                fVarQ.d().add(q());
                                q().g().add(fVarQ);
                            }
                            i6++;
                        }
                    } else {
                        if (iH2 != 3) {
                            return;
                        }
                        q().p(n1.f.a.BOTTOM);
                        while (i6 < aVar.e2()) {
                            p122m1.e eVar2 = aVar.d2()[i6];
                            p247y7.AbstractC7350t.c(eVar2);
                            if (zG2 || eVar2.A0() != 8) {
                                p132n1.n nVarE1 = eVar2.e0();
                                p247y7.AbstractC7350t.c(nVarE1);
                                p132n1.f fVarG = nVarE1.g();
                                fVarG.d().add(q());
                                q().g().add(fVarG);
                            }
                            i6++;
                        }
                    }
                    p122m1.e eVarN2 = n();
                    p247y7.AbstractC7350t.c(eVarN2);
                    p132n1.n nVarE2 = eVarN2.e0();
                    p247y7.AbstractC7350t.c(nVarE2);
                    H(nVarE2.q());
                    p122m1.e eVarN3 = n();
                    p247y7.AbstractC7350t.c(eVarN3);
                    pVarK = eVarN3.e0();
                } else {
                    q().p(n1.f.a.RIGHT);
                    while (i6 < aVar.e2()) {
                        p122m1.e eVar3 = aVar.d2()[i6];
                        p247y7.AbstractC7350t.c(eVar3);
                        if (zG2 || eVar3.A0() != 8) {
                            p132n1.l lVarK = eVar3.K();
                            p247y7.AbstractC7350t.c(lVarK);
                            p132n1.f fVarG2 = lVarK.g();
                            fVarG2.d().add(q());
                            q().g().add(fVarG2);
                        }
                        i6++;
                    }
                }
                p247y7.AbstractC7350t.c(pVarK);
                H(pVarK.g());
            }
            q().p(n1.f.a.LEFT);
            while (i6 < aVar.e2()) {
                p122m1.e eVar4 = aVar.d2()[i6];
                p247y7.AbstractC7350t.c(eVar4);
                if (zG2 || eVar4.A0() != 8) {
                    p132n1.l lVarK2 = eVar4.K();
                    p247y7.AbstractC7350t.c(lVarK2);
                    p132n1.f fVarQ2 = lVarK2.q();
                    fVarQ2.d().add(q());
                    q().g().add(fVarQ2);
                }
                i6++;
            }
            p122m1.e eVarN4 = n();
            p247y7.AbstractC7350t.c(eVarN4);
            p132n1.l lVarK3 = eVarN4.K();
            p247y7.AbstractC7350t.c(lVarK3);
            H(lVarK3.q());
            p122m1.e eVarN5 = n();
            p247y7.AbstractC7350t.c(eVarN5);
            pVarK = eVarN5.K();
            p247y7.AbstractC7350t.c(pVarK);
            H(pVarK.g());
        }
    }

    @Override // p132n1.p
    public void e() {
        if (n() instanceof p122m1.a) {
            p122m1.e eVarN = n();
            p247y7.AbstractC7350t.d(eVarN, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Barrier");
            int iH2 = ((p122m1.a) eVarN).h2();
            if (iH2 == 0 || iH2 == 1) {
                p122m1.e eVarN2 = n();
                p247y7.AbstractC7350t.c(eVarN2);
                eVarN2.V1(q().j());
            } else {
                p122m1.e eVarN3 = n();
                p247y7.AbstractC7350t.c(eVarN3);
                eVarN3.W1(q().j());
            }
        }
    }

    @Override // p132n1.p
    public void f() {
        y(null);
        q().c();
    }
}
