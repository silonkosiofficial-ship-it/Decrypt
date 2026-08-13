package Y2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract Y2.p a();

        public abstract Y2.p.a b(java.lang.String str);

        public abstract Y2.p.a c(byte[] bArr);

        public abstract Y2.p.a d(W2.e eVar);
    }

    public static Y2.p.a a() {
        return new Y2.d.b().d(W2.e.DEFAULT);
    }

    public abstract java.lang.String b();

    public abstract byte[] c();

    public abstract W2.e d();

    public boolean e() {
        return c() != null;
    }

    public Y2.p f(W2.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : android.util.Base64.encodeToString(c(), 2));
    }
}
