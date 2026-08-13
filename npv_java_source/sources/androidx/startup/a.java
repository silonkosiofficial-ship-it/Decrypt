package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile androidx.startup.a f23516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.Object f23517e = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final android.content.Context f23520c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.Set f23519b = new java.util.HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.Map f23518a = new java.util.HashMap();

    a(android.content.Context context) {
        this.f23520c = context.getApplicationContext();
    }

    private java.lang.Object d(java.lang.Class cls, java.util.Set set) {
        java.lang.Object objB;
        if (E2.b.d()) {
            try {
                E2.b.a(cls.getSimpleName());
            } catch (java.lang.Throwable th) {
                E2.b.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f23518a.containsKey(cls)) {
            objB = this.f23518a.get(cls);
        } else {
            set.add(cls);
            try {
                D2.a aVar = (D2.a) cls.getDeclaredConstructor(null).newInstance(null);
                java.util.List<java.lang.Class> listA = aVar.a();
                if (!listA.isEmpty()) {
                    for (java.lang.Class cls2 : listA) {
                        if (!this.f23518a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = aVar.b(this.f23520c);
                set.remove(cls);
                this.f23518a.put(cls, objB);
            } catch (java.lang.Throwable th2) {
                throw new D2.c(th2);
            }
        }
        E2.b.b();
        return objB;
    }

    public static androidx.startup.a e(android.content.Context context) {
        if (f23516d == null) {
            synchronized (f23517e) {
                try {
                    if (f23516d == null) {
                        f23516d = new androidx.startup.a(context);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f23516d;
    }

    void a() {
        try {
            try {
                E2.b.a("Startup");
                b(this.f23520c.getPackageManager().getProviderInfo(new android.content.ComponentName(this.f23520c.getPackageName(), androidx.startup.InitializationProvider.class.getName()), 128).metaData);
                E2.b.b();
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                throw new D2.c(e6);
            }
        } catch (java.lang.Throwable th) {
            E2.b.b();
            throw th;
        }
    }

    void b(android.os.Bundle bundle) {
        java.lang.String string = this.f23520c.getString(D2.b.f1897a);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.lang.String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(str);
                        if (D2.a.class.isAssignableFrom(cls)) {
                            this.f23519b.add(cls);
                        }
                    }
                }
                java.util.Iterator it = this.f23519b.iterator();
                while (it.hasNext()) {
                    d((java.lang.Class) it.next(), hashSet);
                }
            } catch (java.lang.ClassNotFoundException e6) {
                throw new D2.c(e6);
            }
        }
    }

    java.lang.Object c(java.lang.Class cls) {
        java.lang.Object objD;
        synchronized (f23517e) {
            try {
                objD = this.f23518a.get(cls);
                if (objD == null) {
                    objD = d(cls, new java.util.HashSet());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public java.lang.Object f(java.lang.Class cls) {
        return c(cls);
    }

    public boolean g(java.lang.Class cls) {
        return this.f23519b.contains(cls);
    }
}
