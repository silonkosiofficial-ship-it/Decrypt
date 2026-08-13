package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4840pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38079a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f38080b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f38081c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f38082d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f38083e = new java.util.concurrent.atomic.AtomicInteger(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38084f = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f38085g = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentMap f38086h = new j$.util.concurrent.ConcurrentHashMap(9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.Object f38087i;

    public C4840pq() {
        new java.util.concurrent.atomic.AtomicReference(null);
        new java.util.concurrent.ArrayBlockingQueue(20);
        this.f38087i = new java.lang.Object();
    }

    public static final android.os.Bundle q(java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                try {
                    if (j$.util.Objects.equals(str, "value")) {
                        bundle.putDouble(str, java.lang.Double.parseDouble((java.lang.String) map.get(str)));
                    } else {
                        bundle.putString(str, (java.lang.String) map.get(str));
                    }
                } catch (java.lang.NullPointerException | java.lang.NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean r(android.content.Context context) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25712v0)).booleanValue()) {
            return false;
        }
        if (com.google.android.gms.dynamite.DynamiteModule.a(context, "com.google.android.gms.ads.dynamite") < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25722w0)).intValue()) {
            return false;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25732x0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (java.lang.ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final java.lang.Object s(java.lang.String str, android.content.Context context) {
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", this.f38084f, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(this.f38084f.get(), null);
        } catch (java.lang.Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final java.lang.reflect.Method t(android.content.Context context, java.lang.String str) {
        java.lang.reflect.Method method = (java.lang.reflect.Method) this.f38086h.get(str);
        if (method != null) {
            return method;
        }
        try {
            java.lang.reflect.Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.f38086h.put(str, declaredMethod);
            return declaredMethod;
        } catch (java.lang.Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final void u(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f38084f, true)) {
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) this.f38086h.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, java.lang.String.class);
                    this.f38086h.put(str2, declaredMethod);
                } catch (java.lang.Exception unused) {
                    w(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f38084f.get(), str);
                p214v3.AbstractC7265q0.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (java.lang.Exception unused2) {
                w(str2, false);
            }
        }
    }

    private final void v(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (p(context)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            try {
                bundle2.putLong("_aeid", java.lang.Long.parseLong(str2));
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException e6) {
                p224w3.p.e("Invalid event ID: ".concat(java.lang.String.valueOf(str2)), e6);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f38084f, true)) {
                java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) this.f38086h.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", java.lang.String.class, java.lang.String.class, android.os.Bundle.class);
                        this.f38086h.put("logEventInternal", declaredMethod);
                    } catch (java.lang.Exception unused) {
                        w("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f38084f.get(), "am", str, bundle2);
                } catch (java.lang.Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final void w(java.lang.String str, boolean z6) {
        if (this.f38082d.get()) {
            return;
        }
        p224w3.p.g("Invoke Firebase method " + str + " error.");
        if (z6) {
            p224w3.p.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f38082d.set(true);
        }
    }

    private final boolean x(android.content.Context context, java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference, boolean z6) {
        if (atomicReference.get() == null) {
            try {
                com.google.android.gms.internal.ads.AbstractC4510mq.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", android.content.Context.class).invoke(null, context));
            } catch (java.lang.Exception unused) {
                w("getInstance", z6);
                return false;
            }
        }
        return true;
    }

    public final java.lang.String a(android.content.Context context) {
        java.lang.Object objS;
        if (p(context) && (objS = s("generateEventId", context)) != null) {
            return objS.toString();
        }
        return null;
    }

    public final java.lang.String b(final android.content.Context context) {
        java.util.concurrent.ExecutorService threadPoolExecutor;
        if (!p(context)) {
            return null;
        }
        long jLongValue = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25692t0)).longValue();
        if (jLongValue < 0) {
            return (java.lang.String) s("getAppInstanceId", context);
        }
        if (this.f38079a.get() == null) {
            if (V3.e.a()) {
                threadPoolExecutor = com.google.android.gms.internal.ads.AbstractC2308Ee0.a().a(((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25702u0)).intValue(), new com.google.android.gms.internal.ads.ThreadFactoryC4730oq(this), 2);
            } else {
                com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25702u0;
                threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue(), ((java.lang.Integer) p184s3.A.c().a(abstractC5037rf)).intValue(), 1L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.ThreadFactoryC4730oq(this));
            }
            com.google.android.gms.internal.ads.AbstractC4510mq.a(this.f38079a, null, threadPoolExecutor);
        }
        try {
            return (java.lang.String) ((java.util.concurrent.ExecutorService) this.f38079a.get()).submit(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.nq
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f37680a.e(context);
                }
            }).get(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.TimeoutException unused) {
            return "TIME_OUT";
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public final java.lang.String c(android.content.Context context) {
        if (p(context) && x(context, "com.google.android.gms.measurement.AppMeasurement", this.f38084f, true)) {
            try {
                java.lang.String str = (java.lang.String) t(context, "getCurrentScreenName").invoke(this.f38084f.get(), null);
                if (str == null) {
                    str = (java.lang.String) t(context, "getCurrentScreenClass").invoke(this.f38084f.get(), null);
                }
                return str == null ? "" : str;
            } catch (java.lang.Exception unused) {
                w("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final java.lang.String d(android.content.Context context) {
        if (!p(context)) {
            return null;
        }
        synchronized (this.f38080b) {
            try {
                java.lang.String str = this.f38081c;
                if (str != null) {
                    return str;
                }
                java.lang.String str2 = (java.lang.String) s("getGmpAppId", context);
                this.f38081c = str2;
                return str2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ java.lang.String e(android.content.Context context) {
        return (java.lang.String) s("getAppInstanceId", context);
    }

    public final void f(android.content.Context context, java.lang.String str) {
        if (p(context)) {
            u(context, str, "beginAdUnitExposure");
        }
    }

    public final void g(android.content.Context context, java.lang.String str) {
        if (p(context)) {
            u(context, str, "endAdUnitExposure");
        }
    }

    public final void h(android.content.Context context, java.lang.String str) {
        v(context, "_aa", str, null);
    }

    public final void i(android.content.Context context, java.lang.String str) {
        v(context, "_aq", str, null);
    }

    public final void j(android.content.Context context, java.lang.String str, java.util.Map map) {
        v(context, "_ac", str, q(map));
    }

    public final void k(android.content.Context context, java.lang.String str, java.util.Map map) {
        v(context, "_ai", str, q(map));
    }

    public final void l(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i6) {
        if (p(context)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i6);
            v(context, "_ar", str, bundle);
            p214v3.AbstractC7265q0.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i6);
        }
    }

    public final void m(android.content.Context context, p184s3.X1 x6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25209A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f38087i) {
            }
        }
    }

    public final void n(android.content.Context context, p184s3.K1 k6) {
        com.google.android.gms.internal.ads.AbstractC4950qq.d(context).b().c(k6);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25209A0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.f38087i) {
            }
        }
    }

    public final void o(android.content.Context context, java.lang.String str) {
        if (p(context) && (context instanceof android.app.Activity) && x(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f38085g, false)) {
            java.lang.reflect.Method declaredMethod = (java.lang.reflect.Method) this.f38086h.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", android.app.Activity.class, java.lang.String.class, java.lang.String.class);
                    this.f38086h.put("setCurrentScreen", declaredMethod);
                } catch (java.lang.Exception unused) {
                    w("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f38085g.get(), (android.app.Activity) context, str, context.getPackageName());
            } catch (java.lang.Exception unused2) {
                w("setCurrentScreen", false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean p(android.content.Context context) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25632n0)).booleanValue() && !this.f38082d.get()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25742y0)).booleanValue()) {
                return true;
            }
            if (this.f38083e.get() == -1) {
                p184s3.C7147y.b();
                if (p224w3.g.u(context, 12451000)) {
                    this.f38083e.set(1);
                } else {
                    p184s3.C7147y.b();
                    if (p224w3.g.v(context)) {
                        p224w3.p.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f38083e.set(0);
                    } else {
                        this.f38083e.set(1);
                    }
                }
            }
            if (this.f38083e.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
