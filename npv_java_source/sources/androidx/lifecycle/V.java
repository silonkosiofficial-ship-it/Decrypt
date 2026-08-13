package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.lifecycle.V.b f22790b = new androidx.lifecycle.V.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2.a.b f22791c = e2.g.a.f44644a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p023c2.g f22792a;

    public static class a extends androidx.lifecycle.V.d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static androidx.lifecycle.V.a f22794f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final android.app.Application f22796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final androidx.lifecycle.V.a.b f22793e = new androidx.lifecycle.V.a.b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c2.a.b f22795g = new androidx.lifecycle.V.a.C0427a();

        /* JADX INFO: renamed from: androidx.lifecycle.V$a$a, reason: collision with other inner class name */
        public static final class C0427a implements c2.a.b {
            C0427a() {
            }
        }

        public static final class b {
            private b() {
            }

            public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final androidx.lifecycle.V.a a(android.app.Application application) {
                p247y7.AbstractC7350t.f(application, "application");
                if (androidx.lifecycle.V.a.f22794f == null) {
                    androidx.lifecycle.V.a.f22794f = new androidx.lifecycle.V.a(application);
                }
                androidx.lifecycle.V.a aVar = androidx.lifecycle.V.a.f22794f;
                p247y7.AbstractC7350t.c(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(android.app.Application application) {
            this(application, 0);
            p247y7.AbstractC7350t.f(application, "application");
        }

        private a(android.app.Application application, int i6) {
            this.f22796d = application;
        }

        private final androidx.lifecycle.T h(java.lang.Class cls, android.app.Application application) {
            if (!androidx.lifecycle.AbstractC2069a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                androidx.lifecycle.T t6 = (androidx.lifecycle.T) cls.getConstructor(android.app.Application.class).newInstance(application);
                p247y7.AbstractC7350t.e(t6, "{\n                try {\n…          }\n            }");
                return t6;
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (java.lang.InstantiationException e10) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (java.lang.NoSuchMethodException e11) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (java.lang.reflect.InvocationTargetException e12) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        @Override // androidx.lifecycle.V.d, androidx.lifecycle.V.c
        public androidx.lifecycle.T a(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "modelClass");
            android.app.Application application = this.f22796d;
            if (application != null) {
                return h(cls, application);
            }
            throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.V.d, androidx.lifecycle.V.c
        public androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(cls, "modelClass");
            p247y7.AbstractC7350t.f(aVar, "extras");
            if (this.f22796d != null) {
                return a(cls);
            }
            android.app.Application application = (android.app.Application) aVar.a(f22795g);
            if (application != null) {
                return h(cls, application);
            }
            if (androidx.lifecycle.AbstractC2069a.class.isAssignableFrom(cls)) {
                throw new java.lang.IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ androidx.lifecycle.V c(androidx.lifecycle.V.b bVar, androidx.lifecycle.X x6, androidx.lifecycle.V.c cVar, p023c2.a aVar, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                cVar = p043e2.c.f44637a;
            }
            if ((i6 & 4) != 0) {
                aVar = p023c2.a.C0466a.f24405b;
            }
            return bVar.a(x6, cVar, aVar);
        }

        public static /* synthetic */ androidx.lifecycle.V d(androidx.lifecycle.V.b bVar, androidx.lifecycle.Y y6, androidx.lifecycle.V.c cVar, p023c2.a aVar, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                cVar = p043e2.g.f44643a.d(y6);
            }
            if ((i6 & 4) != 0) {
                aVar = p043e2.g.f44643a.c(y6);
            }
            return bVar.b(y6, cVar, aVar);
        }

        public final androidx.lifecycle.V a(androidx.lifecycle.X x6, androidx.lifecycle.V.c cVar, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(x6, "store");
            p247y7.AbstractC7350t.f(cVar, "factory");
            p247y7.AbstractC7350t.f(aVar, "extras");
            return new androidx.lifecycle.V(x6, cVar, aVar);
        }

        public final androidx.lifecycle.V b(androidx.lifecycle.Y y6, androidx.lifecycle.V.c cVar, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(y6, "owner");
            p247y7.AbstractC7350t.f(cVar, "factory");
            p247y7.AbstractC7350t.f(aVar, "extras");
            return new androidx.lifecycle.V(y6.n(), cVar, aVar);
        }
    }

    public interface c {
        androidx.lifecycle.T a(java.lang.Class cls);

        androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar);

        androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar);
    }

    public static class d implements androidx.lifecycle.V.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static androidx.lifecycle.V.d f22798b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.lifecycle.V.d.a f22797a = new androidx.lifecycle.V.d.a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c2.a.b f22799c = e2.g.a.f44644a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final androidx.lifecycle.V.d a() {
                if (androidx.lifecycle.V.d.f22798b == null) {
                    androidx.lifecycle.V.d.f22798b = new androidx.lifecycle.V.d();
                }
                androidx.lifecycle.V.d dVar = androidx.lifecycle.V.d.f22798b;
                p247y7.AbstractC7350t.c(dVar);
                return dVar;
            }
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.T a(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "modelClass");
            return p043e2.d.f44638a.a(cls);
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(cVar, "modelClass");
            p247y7.AbstractC7350t.f(aVar, "extras");
            return c(p227w7.a.b(cVar), aVar);
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(cls, "modelClass");
            p247y7.AbstractC7350t.f(aVar, "extras");
            return a(cls);
        }
    }

    public static class e {
        public abstract void d(androidx.lifecycle.T t6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(androidx.lifecycle.X x6, androidx.lifecycle.V.c cVar) {
        this(x6, cVar, null, 4, null);
        p247y7.AbstractC7350t.f(x6, "store");
        p247y7.AbstractC7350t.f(cVar, "factory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(androidx.lifecycle.X x6, androidx.lifecycle.V.c cVar, p023c2.a aVar) {
        this(new p023c2.g(x6, cVar, aVar));
        p247y7.AbstractC7350t.f(x6, "store");
        p247y7.AbstractC7350t.f(cVar, "factory");
        p247y7.AbstractC7350t.f(aVar, "defaultCreationExtras");
    }

    public /* synthetic */ V(androidx.lifecycle.X x6, androidx.lifecycle.V.c cVar, p023c2.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(x6, cVar, (i6 & 4) != 0 ? p023c2.a.C0466a.f24405b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(androidx.lifecycle.Y y6, androidx.lifecycle.V.c cVar) {
        this(y6.n(), cVar, p043e2.g.f44643a.c(y6));
        p247y7.AbstractC7350t.f(y6, "owner");
        p247y7.AbstractC7350t.f(cVar, "factory");
    }

    private V(p023c2.g gVar) {
        this.f22792a = gVar;
    }

    public final androidx.lifecycle.T a(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        return p023c2.g.b(this.f22792a, cVar, null, 2, null);
    }

    public androidx.lifecycle.T b(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        return a(p227w7.a.e(cls));
    }

    public final androidx.lifecycle.T c(java.lang.String str, F7.c cVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        return this.f22792a.a(cVar, str);
    }

    public androidx.lifecycle.T d(java.lang.String str, java.lang.Class cls) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(cls, "modelClass");
        return this.f22792a.a(p227w7.a.e(cls), str);
    }
}
