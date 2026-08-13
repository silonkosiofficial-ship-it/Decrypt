package W6;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    public static final class a {
        public static void a(W6.y yVar, p237x7.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "body");
            for (java.util.Map.Entry entry : yVar.a()) {
                pVar.u((java.lang.String) entry.getKey(), (java.util.List) entry.getValue());
            }
        }

        public static java.lang.String b(W6.y yVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "name");
            java.util.List listC = yVar.c(str);
            if (listC != null) {
                return (java.lang.String) p097j7.AbstractC6879v.k0(listC);
            }
            return null;
        }
    }

    java.util.Set a();

    boolean b();

    java.util.List c(java.lang.String str);

    java.lang.String d(java.lang.String str);

    void e(p237x7.p pVar);

    boolean isEmpty();

    java.util.Set names();
}
