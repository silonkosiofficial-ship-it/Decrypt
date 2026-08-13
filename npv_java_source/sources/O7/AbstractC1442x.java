package O7;

/* JADX INFO: renamed from: O7.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1442x {

    /* JADX INFO: renamed from: O7.x$a */
    /* synthetic */ class a extends p247y7.AbstractC7347p implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final O7.AbstractC1442x.a f8200L = new O7.AbstractC1442x.a();

        a() {
            super(1);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "getOuterClassId";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(p138n8.b.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final p138n8.b l(p138n8.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "p0");
            return bVar.g();
        }
    }

    /* JADX INFO: renamed from: O7.x$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final O7.AbstractC1442x.b f8201D = new O7.AbstractC1442x.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(p138n8.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "it");
            return 0;
        }
    }

    public static final O7.InterfaceC1424e a(O7.G g6, p138n8.b bVar) {
        p247y7.AbstractC7350t.f(g6, "<this>");
        p247y7.AbstractC7350t.f(bVar, "classId");
        O7.InterfaceC1427h interfaceC1427hB = b(g6, bVar);
        if (interfaceC1427hB instanceof O7.InterfaceC1424e) {
            return (O7.InterfaceC1424e) interfaceC1427hB;
        }
        return null;
    }

    public static final O7.InterfaceC1427h b(O7.G g6, p138n8.b bVar) {
        O7.InterfaceC1427h interfaceC1427hG;
        p247y7.AbstractC7350t.f(g6, "<this>");
        p247y7.AbstractC7350t.f(bVar, "classId");
        O7.G gA = p178r8.o.a(g6);
        if (gA == null) {
            p138n8.c cVarH = bVar.h();
            p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
            O7.P pS0 = g6.s0(cVarH);
            java.util.List listF = bVar.i().f();
            p247y7.AbstractC7350t.e(listF, "pathSegments(...)");
            p248y8.h hVarU = pS0.u();
            java.lang.Object objI0 = p097j7.AbstractC6879v.i0(listF);
            p247y7.AbstractC7350t.e(objI0, "first(...)");
            interfaceC1427hG = hVarU.g((p138n8.f) objI0, W7.d.FROM_DESERIALIZATION);
            if (interfaceC1427hG == null) {
                return null;
            }
            for (p138n8.f fVar : listF.subList(1, listF.size())) {
                if (!(interfaceC1427hG instanceof O7.InterfaceC1424e)) {
                    return null;
                }
                p248y8.h hVarH0 = ((O7.InterfaceC1424e) interfaceC1427hG).H0();
                p247y7.AbstractC7350t.c(fVar);
                O7.InterfaceC1427h interfaceC1427hG2 = hVarH0.g(fVar, W7.d.FROM_DESERIALIZATION);
                interfaceC1427hG = interfaceC1427hG2 instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG2 : null;
                if (interfaceC1427hG == null) {
                    return null;
                }
            }
        } else {
            p138n8.c cVarH2 = bVar.h();
            p247y7.AbstractC7350t.e(cVarH2, "getPackageFqName(...)");
            O7.P pS1 = gA.s0(cVarH2);
            java.util.List listF2 = bVar.i().f();
            p247y7.AbstractC7350t.e(listF2, "pathSegments(...)");
            p248y8.h hVarU2 = pS1.u();
            java.lang.Object objI1 = p097j7.AbstractC6879v.i0(listF2);
            p247y7.AbstractC7350t.e(objI1, "first(...)");
            O7.InterfaceC1427h interfaceC1427hG3 = hVarU2.g((p138n8.f) objI1, W7.d.FROM_DESERIALIZATION);
            if (interfaceC1427hG3 == null) {
                interfaceC1427hG3 = null;
                break;
            }
            for (p138n8.f fVar2 : listF2.subList(1, listF2.size())) {
                if (interfaceC1427hG3 instanceof O7.InterfaceC1424e) {
                    p248y8.h hVarH1 = ((O7.InterfaceC1424e) interfaceC1427hG3).H0();
                    p247y7.AbstractC7350t.c(fVar2);
                    O7.InterfaceC1427h interfaceC1427hG4 = hVarH1.g(fVar2, W7.d.FROM_DESERIALIZATION);
                    interfaceC1427hG3 = interfaceC1427hG4 instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG4 : null;
                    if (interfaceC1427hG3 != null) {
                    }
                }
                interfaceC1427hG3 = null;
            }
            if (interfaceC1427hG3 != null) {
                return interfaceC1427hG3;
            }
            p138n8.c cVarH3 = bVar.h();
            p247y7.AbstractC7350t.e(cVarH3, "getPackageFqName(...)");
            O7.P pS2 = g6.s0(cVarH3);
            java.util.List listF3 = bVar.i().f();
            p247y7.AbstractC7350t.e(listF3, "pathSegments(...)");
            p248y8.h hVarU3 = pS2.u();
            java.lang.Object objI2 = p097j7.AbstractC6879v.i0(listF3);
            p247y7.AbstractC7350t.e(objI2, "first(...)");
            interfaceC1427hG = hVarU3.g((p138n8.f) objI2, W7.d.FROM_DESERIALIZATION);
            if (interfaceC1427hG == null) {
                return null;
            }
            for (p138n8.f fVar3 : listF3.subList(1, listF3.size())) {
                if (!(interfaceC1427hG instanceof O7.InterfaceC1424e)) {
                    return null;
                }
                p248y8.h hVarH2 = ((O7.InterfaceC1424e) interfaceC1427hG).H0();
                p247y7.AbstractC7350t.c(fVar3);
                O7.InterfaceC1427h interfaceC1427hG5 = hVarH2.g(fVar3, W7.d.FROM_DESERIALIZATION);
                interfaceC1427hG = interfaceC1427hG5 instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG5 : null;
                if (interfaceC1427hG == null) {
                    return null;
                }
            }
        }
        return interfaceC1427hG;
    }

    public static final O7.InterfaceC1424e c(O7.G g6, p138n8.b bVar, O7.J j6) {
        p247y7.AbstractC7350t.f(g6, "<this>");
        p247y7.AbstractC7350t.f(bVar, "classId");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        O7.InterfaceC1424e interfaceC1424eA = a(g6, bVar);
        return interfaceC1424eA != null ? interfaceC1424eA : j6.d(bVar, R8.k.M(R8.k.G(R8.k.n(bVar, O7.AbstractC1442x.a.f8200L), O7.AbstractC1442x.b.f8201D)));
    }

    public static final O7.e0 d(O7.G g6, p138n8.b bVar) {
        p247y7.AbstractC7350t.f(g6, "<this>");
        p247y7.AbstractC7350t.f(bVar, "classId");
        O7.InterfaceC1427h interfaceC1427hB = b(g6, bVar);
        if (interfaceC1427hB instanceof O7.e0) {
            return (O7.e0) interfaceC1427hB;
        }
        return null;
    }
}
