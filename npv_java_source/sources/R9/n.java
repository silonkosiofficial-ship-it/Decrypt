package R9;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends R9.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final R9.n.a f9812j = new R9.n.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Class f9813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.Class f9814i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ R9.m b(R9.n.a aVar, java.lang.String str, int i6, java.lang.Object obj) {
            if ((i6 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final R9.m a(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "packageName");
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str + ".OpenSSLSocketImpl");
                p247y7.AbstractC7350t.d(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                java.lang.Class<?> cls2 = java.lang.Class.forName(str + ".OpenSSLSocketFactoryImpl");
                p247y7.AbstractC7350t.d(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                java.lang.Class<?> cls3 = java.lang.Class.forName(str + ".SSLParametersImpl");
                p247y7.AbstractC7350t.e(cls3, "paramsClass");
                return new R9.n(cls, cls2, cls3);
            } catch (java.lang.Exception e6) {
                Q9.k.f9149a.g().j("unable to load android socket classes", 5, e6);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3) {
        super(cls);
        p247y7.AbstractC7350t.f(cls, "sslSocketClass");
        p247y7.AbstractC7350t.f(cls2, "sslSocketFactoryClass");
        p247y7.AbstractC7350t.f(cls3, "paramClass");
        this.f9813h = cls2;
        this.f9814i = cls3;
    }
}
