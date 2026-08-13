package fa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile int f45427a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile ia.b f45431e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ha.m f45428b = new ha.m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final ha.h f45429c = new ha.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f45430d = ha.o.a("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String[] f45432f = {"2.0"};

    private static final void b() {
        try {
            java.util.List listH = h();
            w(listH);
            if (listH == null || listH.isEmpty()) {
                f45427a = 4;
                ha.j.i("No SLF4J providers were found.");
                ha.j.i("Defaulting to no-operation (NOP) logger implementation");
                ha.j.i("See https://www.slf4j.org/codes.html#noProviders for further details.");
                v(g());
            } else {
                f45431e = (ia.b) listH.get(0);
                f45431e.a();
                f45427a = 3;
                u(listH);
            }
            r();
        } catch (java.lang.Exception e6) {
            f(e6);
            throw new java.lang.IllegalStateException("Unexpected initialization failure", e6);
        }
    }

    private static void c(ga.d dVar, int i6) {
        if (dVar.c().k()) {
            d(i6);
        } else {
            if (dVar.c().l()) {
                return;
            }
            e();
        }
    }

    private static void d(int i6) {
        ha.j.i("A number (" + i6 + ") of logging calls during the initialization phase have been intercepted and are");
        ha.j.i("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        ha.j.i("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void e() {
        ha.j.i("The following set of substitute loggers may have been accessed");
        ha.j.i("during the initialization phase. Logging calls during this");
        ha.j.i("phase were not honored. However, subsequent logging calls to these");
        ha.j.i("loggers will work as normally expected.");
        ha.j.i("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static void f(java.lang.Throwable th) {
        f45427a = 2;
        ha.j.c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    static java.util.Set g() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        try {
            java.lang.ClassLoader classLoader = fa.f.class.getClassLoader();
            java.util.Enumeration<java.net.URL> systemResources = classLoader == null ? java.lang.ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (java.io.IOException e6) {
            ha.j.c("Error getting resources from path", e6);
        }
        return linkedHashSet;
    }

    static java.util.List h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ClassLoader classLoader = fa.f.class.getClassLoader();
        ia.b bVarP = p(classLoader);
        if (bVarP != null) {
            arrayList.add(bVarP);
            return arrayList;
        }
        java.util.Iterator it = m(classLoader).iterator();
        while (it.hasNext()) {
            x(arrayList, it);
        }
        return arrayList;
    }

    private static void i() {
        ha.m mVar = f45428b;
        synchronized (mVar) {
            try {
                mVar.d().e();
                for (ha.k kVar : mVar.d().d()) {
                    kVar.o(k(kVar.j()));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static fa.a j() {
        return l().b();
    }

    public static fa.d k(java.lang.String str) {
        return j().a(str);
    }

    static ia.b l() {
        if (f45427a == 0) {
            synchronized (fa.f.class) {
                try {
                    if (f45427a == 0) {
                        f45427a = 1;
                        q();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        int i6 = f45427a;
        if (i6 == 1) {
            return f45428b;
        }
        if (i6 == 2) {
            throw new java.lang.IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i6 == 3) {
            return f45431e;
        }
        if (i6 == 4) {
            return f45429c;
        }
        throw new java.lang.IllegalStateException("Unreachable code");
    }

    private static java.util.ServiceLoader m(final java.lang.ClassLoader classLoader) {
        return java.lang.System.getSecurityManager() == null ? java.util.ServiceLoader.load(ia.b.class, classLoader) : (java.util.ServiceLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: fa.e
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                return fa.f.o(classLoader);
            }
        });
    }

    private static boolean n(java.util.List list) {
        return list.size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.ServiceLoader o(java.lang.ClassLoader classLoader) {
        return java.util.ServiceLoader.load(ia.b.class, classLoader);
    }

    static ia.b p(java.lang.ClassLoader classLoader) {
        java.lang.String str;
        java.lang.String property = java.lang.System.getProperty("slf4j.provider");
        if (property == null || property.isEmpty()) {
            return null;
        }
        try {
            ha.j.f(java.lang.String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
            return (ia.b) classLoader.loadClass(property).getConstructor(null).newInstance(null);
        } catch (java.lang.ClassCastException e6) {
            e = e6;
            str = java.lang.String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property);
            ha.j.c(str, e);
            return null;
        } catch (java.lang.ClassNotFoundException e10) {
            e = e10;
            str = java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property);
            ha.j.c(str, e);
            return null;
        } catch (java.lang.IllegalAccessException e11) {
            e = e11;
            str = java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property);
            ha.j.c(str, e);
            return null;
        } catch (java.lang.InstantiationException e12) {
            e = e12;
            str = java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property);
            ha.j.c(str, e);
            return null;
        } catch (java.lang.NoSuchMethodException e13) {
            e = e13;
            str = java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property);
            ha.j.c(str, e);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e14) {
            e = e14;
            str = java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property);
            ha.j.c(str, e);
            return null;
        }
    }

    private static final void q() {
        b();
        if (f45427a == 3) {
            y();
        }
    }

    private static void r() {
        i();
        s();
        f45428b.d().b();
    }

    private static void s() {
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueueC = f45428b.d().c();
        int size = linkedBlockingQueueC.size();
        java.util.ArrayList<ga.d> arrayList = new java.util.ArrayList(128);
        int i6 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (ga.d dVar : arrayList) {
                t(dVar);
                int i10 = i6 + 1;
                if (i6 == 0) {
                    c(dVar, size);
                }
                i6 = i10;
            }
            arrayList.clear();
        }
    }

    private static void t(ga.d dVar) {
        if (dVar == null) {
            return;
        }
        ha.k kVarC = dVar.c();
        java.lang.String strJ = kVarC.j();
        if (kVarC.m()) {
            throw new java.lang.IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (kVarC.l()) {
            return;
        }
        if (!kVarC.k()) {
            ha.j.i(strJ);
        } else if (kVarC.d(dVar.b())) {
            kVarC.n(dVar);
        }
    }

    private static void u(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (n(list)) {
            ha.j.f("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        ha.j.a("Connected with provider of type [" + ((ia.b) list.get(0)).getClass().getName() + "]");
    }

    private static void v(java.util.Set set) {
        if (set.isEmpty()) {
            return;
        }
        ha.j.i("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ha.j.i("Ignoring binding found at [" + ((java.net.URL) it.next()) + "]");
        }
        ha.j.i("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void w(java.util.List list) {
        if (n(list)) {
            ha.j.i("Class path contains multiple SLF4J providers.");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ha.j.i("Found provider [" + ((ia.b) it.next()) + "]");
            }
            ha.j.i("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void x(java.util.List list, java.util.Iterator it) {
        try {
            list.add((ia.b) it.next());
        } catch (java.util.ServiceConfigurationError e6) {
            ha.j.b("A service provider failed to instantiate:\n" + e6.getMessage());
        }
    }

    private static final void y() {
        try {
            java.lang.String strC = f45431e.c();
            boolean z6 = false;
            for (java.lang.String str : f45432f) {
                if (strC.startsWith(str)) {
                    z6 = true;
                }
            }
            if (z6) {
                return;
            }
            ha.j.i("The requested version " + strC + " by your slf4j provider is not compatible with " + java.util.Arrays.asList(f45432f).toString());
            ha.j.i("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (java.lang.Throwable th) {
            ha.j.c("Unexpected problem occurred during version sanity check", th);
        }
    }
}
