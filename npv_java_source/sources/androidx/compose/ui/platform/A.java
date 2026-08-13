package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.A.a f19811D = new androidx.compose.ui.platform.A.a();

        a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(F0.J j6) {
            boolean z6;
            K0.k kVarI = j6.I();
            if (kVarI != null) {
                z6 = kVarI.M() && kVarI.f(K0.r.f6030a.g());
            }
            return java.lang.Boolean.valueOf(z6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(K0.a aVar, java.lang.Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof K0.a)) {
            return false;
        }
        K0.a aVar2 = (K0.a) obj;
        if (!p247y7.AbstractC7350t.b(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(K0.o oVar) {
        return !oVar.n().f(K0.r.f6030a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(K0.o oVar) {
        K0.k kVarW = oVar.w();
        K0.r rVar = K0.r.f6030a;
        if (kVarW.f(rVar.g()) && !p247y7.AbstractC7350t.b(K0.l.a(oVar.w(), rVar.i()), java.lang.Boolean.TRUE)) {
            return true;
        }
        F0.J j6 = j(oVar.q(), androidx.compose.ui.platform.A.a.f19811D);
        if (j6 != null) {
            K0.k kVarI = j6.I();
            if (!(kVarI != null ? p247y7.AbstractC7350t.b(K0.l.a(kVarI, rVar.i()), java.lang.Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F0.J j(F0.J j6, p237x7.l lVar) {
        do {
            j6 = j6.o0();
            if (j6 == null) {
                return null;
            }
        } while (!((java.lang.Boolean) lVar.l(j6)).booleanValue());
        return j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(K0.o oVar) {
        return oVar.p().getLayoutDirection() == Y0.v.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(K0.o oVar, K0.k kVar) {
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            if (!oVar.n().f((K0.v) ((java.util.Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }
}
