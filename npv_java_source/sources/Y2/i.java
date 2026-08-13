package Y2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static abstract class a {
        public final Y2.i.a a(java.lang.String str, int i6) {
            e().put(str, java.lang.String.valueOf(i6));
            return this;
        }

        public final Y2.i.a b(java.lang.String str, long j6) {
            e().put(str, java.lang.String.valueOf(j6));
            return this;
        }

        public final Y2.i.a c(java.lang.String str, java.lang.String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract Y2.i d();

        protected abstract java.util.Map e();

        protected abstract Y2.i.a f(java.util.Map map);

        public abstract Y2.i.a g(java.lang.Integer num);

        public abstract Y2.i.a h(Y2.h hVar);

        public abstract Y2.i.a i(long j6);

        public abstract Y2.i.a j(byte[] bArr);

        public abstract Y2.i.a k(byte[] bArr);

        public abstract Y2.i.a l(java.lang.Integer num);

        public abstract Y2.i.a m(java.lang.String str);

        public abstract Y2.i.a n(java.lang.String str);

        public abstract Y2.i.a o(long j6);
    }

    public static Y2.i.a a() {
        return new Y2.b.C0307b().f(new java.util.HashMap());
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) c().get(str);
        return str2 == null ? "" : str2;
    }

    protected abstract java.util.Map c();

    public abstract java.lang.Integer d();

    public abstract Y2.h e();

    public abstract long f();

    public abstract byte[] g();

    public abstract byte[] h();

    public final int i(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) c().get(str);
        if (str2 == null) {
            return 0;
        }
        return java.lang.Integer.valueOf(str2).intValue();
    }

    public final long j(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return java.lang.Long.valueOf(str2).longValue();
    }

    public final java.util.Map k() {
        return j$.util.DesugarCollections.unmodifiableMap(c());
    }

    public abstract java.lang.Integer l();

    public abstract java.lang.String m();

    public abstract java.lang.String n();

    public abstract long o();

    public Y2.i.a p() {
        return new Y2.b.C0307b().n(n()).g(d()).l(l()).m(m()).j(g()).k(h()).h(e()).i(f()).o(o()).f(new java.util.HashMap(c()));
    }
}
