package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public interface N {

    public static final class a {
        public static p099j9.a a(p089i9.N n6) {
            java.lang.Integer numQ = n6.q();
            if (numQ != null) {
                return new p099j9.a(numQ.intValue(), 9);
            }
            return null;
        }

        public static void b(p089i9.N n6, p099j9.a aVar) {
            n6.j(aVar != null ? java.lang.Integer.valueOf(aVar.g(9)) : null);
        }
    }

    java.lang.Integer A();

    void C(java.lang.Integer num);

    java.lang.Integer a();

    java.lang.Integer b();

    void d(p099j9.a aVar);

    p089i9.EnumC6676g f();

    void g(p089i9.EnumC6676g enumC6676g);

    void i(java.lang.Integer num);

    void j(java.lang.Integer num);

    void m(java.lang.Integer num);

    p099j9.a p();

    java.lang.Integer q();

    java.lang.Integer r();

    void x(java.lang.Integer num);
}
