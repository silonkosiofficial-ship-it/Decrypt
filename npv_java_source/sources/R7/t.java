package R7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t implements O7.InterfaceC1424e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final R7.t.a f9714C = new R7.t.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p248y8.h a(O7.InterfaceC1424e interfaceC1424e, F8.l0 l0Var, G8.g gVar) {
            p248y8.h hVarM;
            p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
            p247y7.AbstractC7350t.f(l0Var, "typeSubstitution");
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            R7.t tVar = interfaceC1424e instanceof R7.t ? (R7.t) interfaceC1424e : null;
            if (tVar != null && (hVarM = tVar.M(l0Var, gVar)) != null) {
                return hVarM;
            }
            p248y8.h hVarF0 = interfaceC1424e.f0(l0Var);
            p247y7.AbstractC7350t.e(hVarF0, "getMemberScope(...)");
            return hVarF0;
        }

        public final p248y8.h b(O7.InterfaceC1424e interfaceC1424e, G8.g gVar) {
            p248y8.h hVarQ;
            p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
            R7.t tVar = interfaceC1424e instanceof R7.t ? (R7.t) interfaceC1424e : null;
            if (tVar != null && (hVarQ = tVar.Q(gVar)) != null) {
                return hVarQ;
            }
            p248y8.h hVarM0 = interfaceC1424e.M0();
            p247y7.AbstractC7350t.e(hVarM0, "getUnsubstitutedMemberScope(...)");
            return hVarM0;
        }
    }

    protected abstract p248y8.h M(F8.l0 l0Var, G8.g gVar);

    protected abstract p248y8.h Q(G8.g gVar);
}
