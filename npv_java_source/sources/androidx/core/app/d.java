package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final java.lang.Class f21373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final java.lang.reflect.Field f21374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final java.lang.reflect.Field f21375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final java.lang.reflect.Method f21376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final java.lang.reflect.Method f21377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final java.lang.reflect.Method f21378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final android.os.Handler f21379g = new android.os.Handler(android.os.Looper.getMainLooper());

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.core.app.d.C0401d f21380C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f21381D;

        a(androidx.core.app.d.C0401d c0401d, java.lang.Object obj) {
            this.f21380C = c0401d;
            this.f21381D = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21380C.f21386C = this.f21381D;
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.app.Application f21382C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.core.app.d.C0401d f21383D;

        b(android.app.Application application, androidx.core.app.d.C0401d c0401d) {
            this.f21382C = application;
            this.f21383D = c0401d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21382C.unregisterActivityLifecycleCallbacks(this.f21383D);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f21384C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f21385D;

        c(java.lang.Object obj, java.lang.Object obj2) {
            this.f21384C = obj;
            this.f21385D = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.reflect.Method method = androidx.core.app.d.f21376d;
                if (method != null) {
                    method.invoke(this.f21384C, this.f21385D, java.lang.Boolean.FALSE, "AppCompat recreation");
                } else {
                    androidx.core.app.d.f21377e.invoke(this.f21384C, this.f21385D, java.lang.Boolean.FALSE);
                }
            } catch (java.lang.RuntimeException e6) {
                if (e6.getClass() == java.lang.RuntimeException.class && e6.getMessage() != null && e6.getMessage().startsWith("Unable to stop")) {
                    throw e6;
                }
            } catch (java.lang.Throwable th) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0401d implements android.app.Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.lang.Object f21386C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private android.app.Activity f21387D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f21388E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private boolean f21389F = false;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f21390G = false;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private boolean f21391H = false;

        C0401d(android.app.Activity activity) {
            this.f21387D = activity;
            this.f21388E = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            if (this.f21387D == activity) {
                this.f21387D = null;
                this.f21390G = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            if (!this.f21390G || this.f21391H || this.f21389F || !androidx.core.app.d.h(this.f21386C, this.f21388E, activity)) {
                return;
            }
            this.f21391H = true;
            this.f21386C = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            if (this.f21387D == activity) {
                this.f21389F = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
        }
    }

    static {
        java.lang.Class clsA = a();
        f21373a = clsA;
        f21374b = b();
        f21375c = f();
        f21376d = d(clsA);
        f21377e = c(clsA);
        f21378f = e(clsA);
    }

    private static java.lang.Class a() {
        try {
            return java.lang.Class.forName("android.app.ActivityThread");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Field b() {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method c(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("performStopActivity", android.os.IBinder.class, java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method d(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("performStopActivity", android.os.IBinder.class, java.lang.Boolean.TYPE, java.lang.String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method e(java.lang.Class cls) {
        if (g() && cls != null) {
            try {
                java.lang.Class<?> cls2 = java.lang.Boolean.TYPE;
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", android.os.IBinder.class, java.util.List.class, java.util.List.class, java.lang.Integer.TYPE, cls2, android.content.res.Configuration.class, android.content.res.Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    private static java.lang.reflect.Field f() {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i6 = android.os.Build.VERSION.SDK_INT;
        return i6 == 26 || i6 == 27;
    }

    protected static boolean h(java.lang.Object obj, int i6, android.app.Activity activity) {
        try {
            java.lang.Object obj2 = f21375c.get(activity);
            if (obj2 == obj && activity.hashCode() == i6) {
                f21379g.postAtFrontOfQueue(new androidx.core.app.d.c(f21374b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (java.lang.Throwable th) {
            return false;
        }
    }

    static boolean i(android.app.Activity activity) {
        java.lang.Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f21378f == null) {
            return false;
        }
        if (f21377e == null && f21376d == null) {
            return false;
        }
        try {
            java.lang.Object obj2 = f21375c.get(activity);
            if (obj2 == null || (obj = f21374b.get(activity)) == null) {
                return false;
            }
            android.app.Application application = activity.getApplication();
            androidx.core.app.d.C0401d c0401d = new androidx.core.app.d.C0401d(activity);
            application.registerActivityLifecycleCallbacks(c0401d);
            f21379g.post(new androidx.core.app.d.a(c0401d, obj2));
            try {
                if (g()) {
                    java.lang.reflect.Method method = f21378f;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f21379g.post(new androidx.core.app.d.b(application, c0401d));
            }
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
