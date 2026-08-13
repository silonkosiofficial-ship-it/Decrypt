package Y2;

/* JADX INFO: loaded from: classes.dex */
abstract class o {

    public static abstract class a {
        public abstract Y2.o a();

        abstract Y2.o.a b(W2.b bVar);

        abstract Y2.o.a c(W2.c cVar);

        abstract Y2.o.a d(W2.g gVar);

        public abstract Y2.o.a e(Y2.p pVar);

        public abstract Y2.o.a f(java.lang.String str);
    }

    o() {
    }

    public static Y2.o.a a() {
        return new Y2.c.b();
    }

    public abstract W2.b b();

    abstract W2.c c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    abstract W2.g e();

    public abstract Y2.p f();

    public abstract java.lang.String g();
}
