package V5;

/* JADX INFO: loaded from: classes3.dex */
public class b implements p046e5.j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object c(java.lang.String str, p046e5.C6530c c6530c, p046e5.InterfaceC6532e interfaceC6532e) {
        try {
            V5.c.b(str);
            return c6530c.h().a(interfaceC6532e);
        } finally {
            V5.c.a();
        }
    }

    @Override // p046e5.j
    public java.util.List a(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final p046e5.C6530c c6530cT : componentRegistrar.getComponents()) {
            final java.lang.String strI = c6530cT.i();
            if (strI != null) {
                c6530cT = c6530cT.t(new p046e5.h() { // from class: V5.a
                    @Override // p046e5.h
                    public final java.lang.Object a(p046e5.InterfaceC6532e interfaceC6532e) {
                        return V5.b.c(strI, c6530cT, interfaceC6532e);
                    }
                });
            }
            arrayList.add(c6530cT);
        }
        return arrayList;
    }
}
