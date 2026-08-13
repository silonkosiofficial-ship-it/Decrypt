package F8;

/* JADX INFO: loaded from: classes2.dex */
public interface Z {

    public static final class a {
        public static /* synthetic */ F8.a0 a(F8.Z z6, P7.g gVar, F8.e0 e0Var, O7.InterfaceC1432m interfaceC1432m, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i6 & 2) != 0) {
                e0Var = null;
            }
            if ((i6 & 4) != 0) {
                interfaceC1432m = null;
            }
            return z6.a(gVar, e0Var, interfaceC1432m);
        }
    }

    F8.a0 a(P7.g gVar, F8.e0 e0Var, O7.InterfaceC1432m interfaceC1432m);
}
