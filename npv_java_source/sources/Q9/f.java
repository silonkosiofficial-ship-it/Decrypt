package Q9;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Q9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q9.f.b f9135i = new Q9.f.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.reflect.Method f9136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.reflect.Method f9137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.reflect.Method f9138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Class f9139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.Class f9140h;

    private static final class a implements java.lang.reflect.InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f9141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f9143c;

        public a(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "protocols");
            this.f9141a = list;
        }

        public final java.lang.String a() {
            return this.f9143c;
        }

        public final boolean b() {
            return this.f9142b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(obj, "proxy");
            p247y7.AbstractC7350t.f(method, "method");
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            java.lang.String name = method.getName();
            java.lang.Class<?> returnType = method.getReturnType();
            if (p247y7.AbstractC7350t.b(name, "supports") && p247y7.AbstractC7350t.b(java.lang.Boolean.TYPE, returnType)) {
                return java.lang.Boolean.TRUE;
            }
            if (p247y7.AbstractC7350t.b(name, "unsupported") && p247y7.AbstractC7350t.b(java.lang.Void.TYPE, returnType)) {
                this.f9142b = true;
                return null;
            }
            if (p247y7.AbstractC7350t.b(name, "protocols") && objArr.length == 0) {
                return this.f9141a;
            }
            if ((p247y7.AbstractC7350t.b(name, "selectProtocol") || p247y7.AbstractC7350t.b(name, "select")) && p247y7.AbstractC7350t.b(java.lang.String.class, returnType) && objArr.length == 1) {
                java.lang.Object obj2 = objArr[0];
                if (obj2 instanceof java.util.List) {
                    p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    java.util.List list = (java.util.List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i6 = 0;
                        while (true) {
                            java.lang.Object obj3 = list.get(i6);
                            p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str = (java.lang.String) obj3;
                            if (this.f9141a.contains(str)) {
                                this.f9143c = str;
                                return str;
                            }
                            if (i6 != size) {
                                i6++;
                            }
                        }
                    }
                    java.lang.String str2 = (java.lang.String) this.f9141a.get(0);
                    this.f9143c = str2;
                    return str2;
                }
            }
            if ((!p247y7.AbstractC7350t.b(name, "protocolSelected") && !p247y7.AbstractC7350t.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, java.util.Arrays.copyOf(objArr, objArr.length));
            }
            java.lang.Object obj4 = objArr[0];
            p247y7.AbstractC7350t.d(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f9143c = (java.lang.String) obj4;
            return null;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final Q9.k a() {
            java.lang.String property = java.lang.System.getProperty("java.specification.version", "unknown");
            try {
                p247y7.AbstractC7350t.e(property, "jvmVersion");
                if (java.lang.Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (java.lang.NumberFormatException unused) {
            }
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                java.lang.Class<?> cls2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                java.lang.Class<?> cls3 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                java.lang.Class<?> cls4 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                java.lang.reflect.Method method = cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2);
                java.lang.reflect.Method method2 = cls.getMethod("get", javax.net.ssl.SSLSocket.class);
                java.lang.reflect.Method method3 = cls.getMethod("remove", javax.net.ssl.SSLSocket.class);
                p247y7.AbstractC7350t.e(method, "putMethod");
                p247y7.AbstractC7350t.e(method2, "getMethod");
                p247y7.AbstractC7350t.e(method3, "removeMethod");
                p247y7.AbstractC7350t.e(cls3, "clientProviderClass");
                p247y7.AbstractC7350t.e(cls4, "serverProviderClass");
                return new Q9.f(method, method2, method3, cls3, cls4);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public f(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2) {
        p247y7.AbstractC7350t.f(method, "putMethod");
        p247y7.AbstractC7350t.f(method2, "getMethod");
        p247y7.AbstractC7350t.f(method3, "removeMethod");
        p247y7.AbstractC7350t.f(cls, "clientProviderClass");
        p247y7.AbstractC7350t.f(cls2, "serverProviderClass");
        this.f9136d = method;
        this.f9137e = method2;
        this.f9138f = method3;
        this.f9139g = cls;
        this.f9140h = cls2;
    }

    @Override // Q9.k
    public void b(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        try {
            this.f9138f.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("failed to remove ALPN", e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            throw new java.lang.AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // Q9.k
    public void e(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        p247y7.AbstractC7350t.f(list, "protocols");
        try {
            this.f9136d.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(Q9.k.class.getClassLoader(), new java.lang.Class[]{this.f9139g, this.f9140h}, new Q9.f.a(Q9.k.f9149a.b(list))));
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("failed to set ALPN", e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            throw new java.lang.AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // Q9.k
    public java.lang.String g(javax.net.ssl.SSLSocket sSLSocket) {
        p247y7.AbstractC7350t.f(sSLSocket, "sslSocket");
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(this.f9137e.invoke(null, sSLSocket));
            p247y7.AbstractC7350t.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            Q9.f.a aVar = (Q9.f.a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                Q9.k.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
