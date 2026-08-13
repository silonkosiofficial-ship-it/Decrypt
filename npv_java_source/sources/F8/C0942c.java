package F8;

/* JADX INFO: renamed from: F8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0942c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.C0942c f2874a = new F8.C0942c();

    private C0942c() {
    }

    private final boolean c(F8.d0 d0Var, J8.j jVar, J8.m mVar) {
        J8.o oVarJ = d0Var.j();
        if (oVarJ.g0(jVar)) {
            return true;
        }
        if (oVarJ.C0(jVar)) {
            return false;
        }
        if (d0Var.n() && oVarJ.H(jVar)) {
            return true;
        }
        return oVarJ.h0(oVarJ.e(jVar), mVar);
    }

    private final boolean e(F8.d0 d0Var, J8.j jVar, J8.j jVar2) {
        J8.o oVarJ = d0Var.j();
        if (F8.C0944e.f2896b) {
            if (!oVarJ.f(jVar) && !oVarJ.T(oVarJ.e(jVar))) {
                d0Var.l(jVar);
            }
            if (!oVarJ.f(jVar2)) {
                d0Var.l(jVar2);
            }
        }
        if (oVarJ.C0(jVar2) || oVarJ.x0(jVar) || oVarJ.D0(jVar)) {
            return true;
        }
        if ((jVar instanceof J8.d) && oVarJ.S((J8.d) jVar)) {
            return true;
        }
        F8.C0942c c0942c = f2874a;
        if (c0942c.a(d0Var, jVar, F8.d0.c.b.f2892a)) {
            return true;
        }
        if (oVarJ.x0(jVar2) || c0942c.a(d0Var, jVar2, F8.d0.c.d.f2894a) || oVarJ.O(jVar)) {
            return false;
        }
        return c0942c.b(d0Var, jVar, oVarJ.e(jVar2));
    }

    public final boolean a(F8.d0 d0Var, J8.j jVar, F8.d0.c cVar) {
        p247y7.AbstractC7350t.f(d0Var, "<this>");
        p247y7.AbstractC7350t.f(jVar, "type");
        p247y7.AbstractC7350t.f(cVar, "supertypesPolicy");
        J8.o oVarJ = d0Var.j();
        if ((oVarJ.O(jVar) && !oVarJ.C0(jVar)) || oVarJ.x0(jVar)) {
            return true;
        }
        d0Var.k();
        java.util.ArrayDeque arrayDequeH = d0Var.h();
        p247y7.AbstractC7350t.c(arrayDequeH);
        java.util.Set setI = d0Var.i();
        p247y7.AbstractC7350t.c(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + p097j7.AbstractC6879v.r0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            J8.j jVar2 = (J8.j) arrayDequeH.pop();
            p247y7.AbstractC7350t.c(jVar2);
            if (setI.add(jVar2)) {
                F8.d0.c cVar2 = oVarJ.C0(jVar2) ? F8.d0.c.C0067c.f2893a : cVar;
                if (!(!p247y7.AbstractC7350t.b(cVar2, F8.d0.c.C0067c.f2893a))) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    J8.o oVarJ2 = d0Var.j();
                    java.util.Iterator it = oVarJ2.J(oVarJ2.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        J8.j jVarA = cVar2.a(d0Var, (J8.i) it.next());
                        if ((oVarJ.O(jVarA) && !oVarJ.C0(jVarA)) || oVarJ.x0(jVarA)) {
                            d0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    public final boolean b(F8.d0 d0Var, J8.j jVar, J8.m mVar) {
        p247y7.AbstractC7350t.f(d0Var, "state");
        p247y7.AbstractC7350t.f(jVar, "start");
        p247y7.AbstractC7350t.f(mVar, "end");
        J8.o oVarJ = d0Var.j();
        if (f2874a.c(d0Var, jVar, mVar)) {
            return true;
        }
        d0Var.k();
        java.util.ArrayDeque arrayDequeH = d0Var.h();
        p247y7.AbstractC7350t.c(arrayDequeH);
        java.util.Set setI = d0Var.i();
        p247y7.AbstractC7350t.c(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            if (setI.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + p097j7.AbstractC6879v.r0(setI, null, null, null, 0, null, null, 63, null)).toString());
            }
            J8.j jVar2 = (J8.j) arrayDequeH.pop();
            p247y7.AbstractC7350t.c(jVar2);
            if (setI.add(jVar2)) {
                F8.d0.c cVar = oVarJ.C0(jVar2) ? F8.d0.c.C0067c.f2893a : F8.d0.c.b.f2892a;
                if (!(!p247y7.AbstractC7350t.b(cVar, F8.d0.c.C0067c.f2893a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    J8.o oVarJ2 = d0Var.j();
                    java.util.Iterator it = oVarJ2.J(oVarJ2.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        J8.j jVarA = cVar.a(d0Var, (J8.i) it.next());
                        if (f2874a.c(d0Var, jVarA, mVar)) {
                            d0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        d0Var.e();
        return false;
    }

    public final boolean d(F8.d0 d0Var, J8.j jVar, J8.j jVar2) {
        p247y7.AbstractC7350t.f(d0Var, "state");
        p247y7.AbstractC7350t.f(jVar, "subType");
        p247y7.AbstractC7350t.f(jVar2, "superType");
        return e(d0Var, jVar, jVar2);
    }
}
