package p048e8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    private static final boolean a(p048e8.r rVar) {
        p138n8.c cVarE;
        p048e8.B b6 = (p048e8.B) p097j7.AbstractC6879v.I0(rVar.n());
        p048e8.x type = b6 != null ? b6.getType() : null;
        p048e8.j jVar = type instanceof p048e8.j ? (p048e8.j) type : null;
        if (jVar == null) {
            return false;
        }
        p048e8.i iVarB = jVar.b();
        return (iVarB instanceof p048e8.g) && (cVarE = ((p048e8.g) iVarB).e()) != null && p247y7.AbstractC7350t.b(cVarE.b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r3.n().isEmpty();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean b(p048e8.r r3) {
        /*
            n8.f r0 = r3.getName()
            java.lang.String r0 = r0.g()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.n()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p048e8.p.b(e8.r):boolean");
    }

    public static final boolean c(p048e8.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        return qVar.V().M() && (qVar instanceof p048e8.r) && b((p048e8.r) qVar);
    }
}
