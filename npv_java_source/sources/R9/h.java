package R9;

/* JADX INFO: loaded from: classes2.dex */
public class h implements R9.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final R9.h.a f9794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final R9.l.a f9795g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f9796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Method f9797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.reflect.Method f9798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.reflect.Method f9799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.reflect.Method f9800e;

    public static final class a {

        /* JADX INFO: renamed from: R9.h$a$a, reason: collision with other inner class name */
        public static final class C0223a implements R9.l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f9801a;

            C0223a(java.lang.String str) {
                this.f9801a = str;
            }

            @Override // R9.l.a
            public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
                p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
                java.lang.String name = sSLSocket.getClass().getName();
                p247y7.AbstractC7350t.e(name, "sslSocket.javaClass.name");
                return S8.r.V(name, this.f9801a + '.', false, 2, null);
            }

            @Override // R9.l.a
            public R9.m c(javax.net.ssl.SSLSocket sSLSocket) {
                p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
                return R9.h.f9794f.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final R9.h b(java.lang.Class cls) {
            java.lang.Class superclass = cls;
            while (superclass != null && !p247y7.AbstractC7350t.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new java.lang.AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            p247y7.AbstractC7350t.c(superclass);
            return new R9.h(superclass);
        }

        public final R9.l.a c(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "packageName");
            return new R9.h.a.C0223a(str);
        }

        public final R9.l.a d() {
            return R9.h.f9795g;
        }
    }

    static {
        R9.h.a aVar = new R9.h.a(null);
        f9794f = aVar;
        f9795g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        p247y7.AbstractC7350t.f(cls, "sslSocketClass");
        this.f9796a = cls;
        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", java.lang.Boolean.TYPE);
        p247y7.AbstractC7350t.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f9797b = declaredMethod;
        this.f9798c = cls.getMethod("setHostname", java.lang.String.class);
        this.f9799d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f9800e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // R9.m
    public boolean a() {
        return Q9.c.f9122f.b();
    }

    @Override // R9.m
    public boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        return this.f9796a.isInstance(sSLSocket);
    }

    @Override // R9.m
    public java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        if (!b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f9799d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new java.lang.String(bArr, S8.C1631d.f12624b);
            }
            return null;
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError(e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            java.lang.Throwable cause = e10.getCause();
            if ((cause instanceof java.lang.NullPointerException) && p247y7.AbstractC7350t.b(((java.lang.NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new java.lang.AssertionError(e10);
        }
    }

    @Override // R9.m
    public void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        if (b(sSLSocket)) {
            try {
                this.f9797b.invoke(sSLSocket, java.lang.Boolean.TRUE);
                if (str != null) {
                    this.f9798c.invoke(sSLSocket, str);
                }
                this.f9800e.invoke(sSLSocket, Q9.k.f9149a.c(list));
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.AssertionError(e6);
            } catch (java.lang.reflect.InvocationTargetException e10) {
                throw new java.lang.AssertionError(e10);
            }
        }
    }
}
