package M8;

/* JADX INFO: loaded from: classes2.dex */
public interface f {

    public static final class a {
        public static java.lang.String a(M8.f fVar, O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            if (fVar.a(interfaceC1443y)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    boolean a(O7.InterfaceC1443y interfaceC1443y);

    java.lang.String b(O7.InterfaceC1443y interfaceC1443y);

    java.lang.String getDescription();
}
