package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4396lo implements com.google.android.gms.internal.ads.InterfaceC4616no {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.lang.Object f37220k = new java.lang.Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static com.google.android.gms.internal.ads.InterfaceC4616no f37221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static com.google.android.gms.internal.ads.InterfaceC4616no f37222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static com.google.android.gms.internal.ads.InterfaceC4616no f37223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static java.lang.Boolean f37224o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f37225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f37226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.WeakHashMap f37227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f37228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p224w3.a f37229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.content.pm.PackageInfo f37230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f37231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f37232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f37233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37234j;

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    protected C4396lo(android.content.Context context, p224w3.a aVar) {
        android.content.pm.PackageInfo packageInfoF;
        this.f37225a = new java.lang.Object();
        this.f37227c = new java.util.WeakHashMap();
        com.google.android.gms.internal.ads.AbstractC2308Ee0.a();
        this.f37228d = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool());
        this.f37233i = new java.util.concurrent.atomic.AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f37226b = context;
        this.f37229e = aVar;
        java.lang.String string = null;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25280G7)).booleanValue()) {
            android.os.Handler handler = p224w3.g.f56228b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoF = null;
            } else {
                try {
                    packageInfoF = W3.e.a(context).f(context.getApplicationInfo().packageName, 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    packageInfoF = null;
                }
            }
        } else {
            packageInfoF = null;
        }
        this.f37230f = packageInfoF;
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25258E7;
        this.f37231g = ((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() ? java.util.Locale.getDefault().getCountry() : "unknown";
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue()) {
            android.content.Context context2 = this.f37226b;
            android.os.Handler handler2 = p224w3.g.f56228b;
            if (context2 != null) {
                try {
                    android.content.pm.PackageInfo packageInfoF2 = W3.e.a(context2).f("com.android.vending", 128);
                    if (packageInfoF2 != null) {
                        string = java.lang.Integer.toString(packageInfoF2.versionCode);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.f37232h = string;
    }

    protected C4396lo(android.content.Context context, p224w3.a aVar, boolean z6) {
        this(context, aVar);
        this.f37234j = true;
    }

    public static com.google.android.gms.internal.ads.InterfaceC4616no c(android.content.Context context) {
        synchronized (f37220k) {
            try {
                if (f37221l == null) {
                    if (l(context)) {
                        f37221l = new com.google.android.gms.internal.ads.C4396lo(context, p224w3.a.e());
                    } else {
                        f37221l = new com.google.android.gms.internal.ads.C4506mo();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f37221l;
    }

    public static com.google.android.gms.internal.ads.InterfaceC4616no d(android.content.Context context, p224w3.a aVar) {
        com.google.android.gms.internal.ads.C4396lo c4396lo;
        synchronized (f37220k) {
            try {
                if (f37223n == null) {
                    boolean z6 = false;
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39196c.e()).booleanValue()) {
                        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25758z7)).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39194a.e()).booleanValue()) {
                            z6 = true;
                        }
                    }
                    if (l(context)) {
                        c4396lo = new com.google.android.gms.internal.ads.C4396lo(context, aVar);
                        c4396lo.k();
                        c4396lo.j();
                    } else if (!z6 || context == null) {
                        f37223n = new com.google.android.gms.internal.ads.C4506mo();
                    } else {
                        c4396lo = new com.google.android.gms.internal.ads.C4396lo(context, aVar, true);
                        c4396lo.k();
                        c4396lo.j();
                    }
                    f37223n = c4396lo;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f37223n;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    public static com.google.android.gms.internal.ads.InterfaceC4616no e(android.content.Context context) {
        synchronized (f37220k) {
            try {
                if (f37222m == null) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25215A7)).booleanValue()) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25758z7)).booleanValue()) {
                            f37222m = new com.google.android.gms.internal.ads.C4506mo();
                        } else {
                            f37222m = new com.google.android.gms.internal.ads.C4396lo(context, p224w3.a.e());
                        }
                    } else {
                        f37222m = new com.google.android.gms.internal.ads.C4506mo();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f37222m;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    public static com.google.android.gms.internal.ads.InterfaceC4616no f(android.content.Context context, p224w3.a aVar) {
        synchronized (f37220k) {
            try {
                if (f37222m == null) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25215A7)).booleanValue()) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25758z7)).booleanValue()) {
                            f37222m = new com.google.android.gms.internal.ads.C4506mo();
                        } else {
                            f37222m = new com.google.android.gms.internal.ads.C4396lo(context, aVar);
                        }
                    } else {
                        f37222m = new com.google.android.gms.internal.ads.C4506mo();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f37222m;
    }

    public static java.lang.String g(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static java.lang.String h(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.AbstractC2829Sg0.c(p224w3.g.i(g(th)));
    }

    private final void j() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.google.android.gms.internal.ads.C4176jo(this, java.lang.Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void k() {
        java.lang.Thread thread = android.os.Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f37225a) {
            this.f37227c.put(thread, java.lang.Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new com.google.android.gms.internal.ads.C4286ko(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean l(android.content.Context context) {
        if (context == null) {
            return false;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Fc)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2570Lg.f29549e.e()).booleanValue()) {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25758z7)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (f37220k) {
            try {
                if (f37224o == null) {
                    f37224o = java.lang.Boolean.valueOf(p184s3.C7147y.e().nextInt(100) < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Cc)).intValue());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (f37224o.booleanValue()) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25758z7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4616no
    public final void a(java.lang.Throwable th, java.lang.String str) {
        if (this.f37234j) {
            return;
        }
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4616no
    public final void b(java.lang.Throwable th, java.lang.String str, float f6) {
        java.lang.Throwable th2;
        java.lang.String packageName;
        android.content.pm.PackageInfo packageInfoF;
        android.app.ActivityManager.MemoryInfo memoryInfoF;
        if (this.f37234j) {
            return;
        }
        android.os.Handler handler = p224w3.g.f56228b;
        boolean zG = false;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2570Lg.f29550f.e()).booleanValue()) {
            th2 = th;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                java.lang.Throwable th3 = (java.lang.Throwable) linkedList.pop();
                java.lang.StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z6 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25684s2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && p224w3.g.q(th3.getClass().getName());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new java.lang.StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                    if (p224w3.g.q(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z6 = true;
                    } else {
                        java.lang.String className = stackTraceElement.getClassName();
                        if (!android.text.TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new java.lang.StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z6) {
                    th2 = th2 == null ? new java.lang.Throwable(th3.getMessage()) : new java.lang.Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            java.lang.String name = th.getClass().getName();
            java.lang.String strG = g(th);
            java.lang.String strH = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25314J8)).booleanValue() ? h(th) : "";
            double d6 = f6;
            double dRandom = java.lang.Math.random();
            int i6 = f6 > 0.0f ? (int) (1.0f / f6) : 1;
            if (dRandom < d6) {
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
                try {
                    zG = W3.e.a(this.f37226b).g();
                } catch (java.lang.Throwable th4) {
                    p224w3.p.e("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.f37226b.getPackageName();
                } catch (java.lang.Throwable unused) {
                    p224w3.p.g("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", java.lang.Boolean.toString(zG)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE);
                int i10 = android.os.Build.VERSION.SDK_INT;
                android.net.Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", java.lang.String.valueOf(i10));
                java.lang.String str2 = android.os.Build.MANUFACTURER;
                java.lang.String str3 = android.os.Build.MODEL;
                if (!str3.startsWith(str2)) {
                    str3 = str2 + " " + str3;
                }
                android.net.Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", str3).appendQueryParameter("js", this.f37229e.f56217C).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strG).appendQueryParameter("eids", android.text.TextUtils.join(",", p184s3.A.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "697668803").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", java.lang.Integer.toString(i6)).appendQueryParameter("pb_tm", java.lang.String.valueOf(com.google.android.gms.internal.ads.AbstractC2570Lg.f29547c.e())).appendQueryParameter("gmscv", java.lang.String.valueOf(N3.C1395h.f().a(this.f37226b))).appendQueryParameter("lite", true != this.f37229e.f56221G ? "0" : "1");
                if (!android.text.TextUtils.isEmpty(strH)) {
                    builderAppendQueryParameter3.appendQueryParameter("hash", strH);
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25269F7)).booleanValue() && (memoryInfoF = p224w3.g.f(this.f37226b)) != null) {
                    builderAppendQueryParameter3.appendQueryParameter("available_memory", java.lang.Long.toString(memoryInfoF.availMem));
                    builderAppendQueryParameter3.appendQueryParameter("total_memory", java.lang.Long.toString(memoryInfoF.totalMem));
                    builderAppendQueryParameter3.appendQueryParameter("is_low_memory", true != memoryInfoF.lowMemory ? "0" : "1");
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25258E7)).booleanValue()) {
                    if (!android.text.TextUtils.isEmpty(this.f37231g)) {
                        builderAppendQueryParameter3.appendQueryParameter("countrycode", this.f37231g);
                    }
                    if (!android.text.TextUtils.isEmpty(this.f37232h)) {
                        builderAppendQueryParameter3.appendQueryParameter("psv", this.f37232h);
                    }
                    android.content.Context context = this.f37226b;
                    if (i10 >= 26) {
                        packageInfoF = android.webkit.WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoF = null;
                    } else {
                        try {
                            packageInfoF = W3.e.a(context).f("com.android.webview", 128);
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            packageInfoF = null;
                        }
                    }
                    if (packageInfoF != null) {
                        builderAppendQueryParameter3.appendQueryParameter("wvvc", java.lang.Integer.toString(packageInfoF.versionCode));
                        builderAppendQueryParameter3.appendQueryParameter("wvvn", packageInfoF.versionName);
                        builderAppendQueryParameter3.appendQueryParameter("wvpn", packageInfoF.packageName);
                    }
                }
                android.content.pm.PackageInfo packageInfo = this.f37230f;
                if (packageInfo != null) {
                    builderAppendQueryParameter3.appendQueryParameter("appvc", java.lang.String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter3.appendQueryParameter("appvn", this.f37230f.versionName);
                }
                arrayList2.add(builderAppendQueryParameter3.toString());
                for (final java.lang.String str4 : arrayList2) {
                    final p224w3.v vVar = new p224w3.v(null);
                    this.f37228d.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.io
                        @Override // java.lang.Runnable
                        public final void run() {
                            vVar.o(str4);
                        }
                    });
                }
            }
        }
    }

    protected final void i(java.lang.Thread thread, java.lang.Throwable th) {
        if (th != null) {
            boolean zQ = false;
            boolean zEquals = false;
            for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (java.lang.StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zQ |= p224w3.g.q(stackTraceElement.getClassName());
                    zEquals |= com.google.android.gms.internal.ads.C4396lo.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zQ || zEquals) {
                return;
            }
            if (!this.f37234j) {
                a(th, "");
            }
            if (this.f37233i.getAndSet(true) || !((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39196c.e()).booleanValue()) {
                return;
            }
            com.google.android.gms.internal.ads.AbstractC4158jf.c(this.f37226b);
        }
    }
}
