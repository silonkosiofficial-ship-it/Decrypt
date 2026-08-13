package p109k9;

/* JADX INFO: renamed from: k9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6916b extends p129m9.a {

    /* JADX INFO: renamed from: k9.b$a */
    public static final class a {
        public static java.lang.Object a(p109k9.InterfaceC6916b interfaceC6916b, java.lang.Object obj) {
            java.lang.Object objA = interfaceC6916b.a(obj);
            if (objA != null) {
                return objA;
            }
            throw new java.lang.IllegalStateException("Field " + interfaceC6916b.getName() + " is not set");
        }
    }

    java.lang.Object a(java.lang.Object obj);

    java.lang.Object b(java.lang.Object obj);
}
