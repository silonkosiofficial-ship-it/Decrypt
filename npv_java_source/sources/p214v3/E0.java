package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.HandlerC2345Fe0 f55826l = new p214v3.HandlerC7266r0(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f55833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile java.lang.String f55834h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f55827a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f55828b = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f55829c = new java.util.concurrent.atomic.AtomicReference(new android.os.Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f55830d = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55831e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Object f55832f = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55835i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f55836j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.concurrent.Executor f55837k = java.util.concurrent.Executors.newSingleThreadExecutor();

    public static int A(int i6) {
        if (i6 >= 5000) {
            return i6;
        }
        if (i6 <= 0) {
            return 60000;
        }
        p224w3.p.g("HTTP timeout too low: " + i6 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static java.lang.String B(android.os.Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        java.lang.String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (android.text.TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean C(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            java.util.regex.Pattern patternCompile = (java.util.regex.Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = java.util.regex.Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void D(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void E(android.content.Context context, android.content.Intent intent) {
        try {
            context.startActivity(intent);
        } catch (java.lang.Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final java.lang.String F(final android.content.Context context, java.lang.String str) {
        java.lang.String strW;
        java.lang.Object objA;
        if (str == null) {
            return W();
        }
        try {
            p214v3.C7253k0 c7253k0A = p214v3.C7253k0.a();
            if (android.text.TextUtils.isEmpty(c7253k0A.f55895a)) {
                if (V3.e.a()) {
                    objA = p214v3.AbstractC7247h0.a(context, new java.util.concurrent.Callable() { // from class: v3.i0
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            android.content.Context context2 = context;
                            android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            java.lang.String string = sharedPreferences.getString("user_agent", "");
                            if (!android.text.TextUtils.isEmpty(string)) {
                                p214v3.AbstractC7265q0.k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            p214v3.AbstractC7265q0.k("User agent is not initialized on Google Play Services. Initializing.");
                            java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context2);
                            V3.q.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final android.content.Context contextC = N3.AbstractC1398k.c(context);
                    objA = p214v3.AbstractC7247h0.a(context, new java.util.concurrent.Callable() { // from class: v3.j0
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            android.content.SharedPreferences sharedPreferences;
                            android.content.Context context2 = contextC;
                            android.content.Context context3 = context;
                            boolean z6 = false;
                            if (context2 != null) {
                                p214v3.AbstractC7265q0.k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                p214v3.AbstractC7265q0.k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z6 = true;
                            }
                            java.lang.String string = sharedPreferences.getString("user_agent", "");
                            if (android.text.TextUtils.isEmpty(string)) {
                                p214v3.AbstractC7265q0.k("Reading user agent from WebSettings");
                                string = android.webkit.WebSettings.getDefaultUserAgent(context3);
                                if (z6) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    p214v3.AbstractC7265q0.k("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                c7253k0A.f55895a = (java.lang.String) objA;
            }
            strW = c7253k0A.f55895a;
        } catch (java.lang.Exception unused) {
            strW = null;
        }
        if (android.text.TextUtils.isEmpty(strW)) {
            strW = android.webkit.WebSettings.getDefaultUserAgent(context);
        }
        if (android.text.TextUtils.isEmpty(strW)) {
            strW = W();
        }
        java.lang.String str2 = strW + " (Mobile; " + str;
        try {
            if (W3.e.a(context).g()) {
                str2 = str2 + ";aia";
            }
        } catch (java.lang.Exception e6) {
            p174r3.v.s().x(e6, "AdUtil.getUserAgent");
        }
        return str2.concat(")");
    }

    public static java.util.List I() {
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25491a;
        java.util.List listB = p184s3.A.a().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listB.iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = com.google.android.gms.internal.ads.C2755Qg0.b(com.google.android.gms.internal.ads.AbstractC4271kg0.c(',')).d((java.lang.String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(java.lang.Long.valueOf((java.lang.String) it2.next()));
                } catch (java.lang.NumberFormatException unused) {
                    p214v3.AbstractC7265q0.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void M(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            runnable.run();
        } else {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean T(android.view.View view) {
        android.app.Activity activity;
        android.view.View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            android.content.Context context = rootView.getContext();
            if (context instanceof android.app.Activity) {
                activity = (android.app.Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        android.view.Window window = activity.getWindow();
        android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void U(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.os.Bundle extras = intent.getExtras() != null ? intent.getExtras() : new android.os.Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final java.lang.String V(android.content.Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return B(z(context));
    }

    static final java.lang.String W() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(java.util.Locale.getDefault());
        java.lang.String str2 = android.os.Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            java.lang.String str3 = android.os.Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final java.lang.String X() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final java.lang.Integer Y(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("display");
        if (systemService instanceof android.hardware.display.DisplayManager) {
            return java.lang.Integer.valueOf(((android.hardware.display.DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final android.util.DisplayMetrics Z(android.view.WindowManager windowManager) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final p214v3.U a(android.content.Context context) {
        try {
            java.lang.Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof android.os.IBinder)) {
                p224w3.p.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            android.os.IBinder iBinder = (android.os.IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof p214v3.U ? (p214v3.U) iInterfaceQueryLocalInterface : new p214v3.S(iBinder);
        } catch (java.lang.Exception e6) {
            p174r3.v.s().x(e6, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    protected static final int[] a0() {
        return new int[]{0, 0};
    }

    public static final boolean b(android.content.Context context, java.lang.String str) {
        android.content.Context contextA = com.google.android.gms.internal.ads.AbstractC3092Zo.a(context);
        return W3.e.a(contextA).b(str, contextA.getPackageName()) == 0;
    }

    public static final java.util.Map b0(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.util.HashSet hashSet = new java.util.HashSet();
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        java.lang.String strOptString = jSONArrayOptJSONArray.optString(i6);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (org.json.JSONException e6) {
            p174r3.v.s().x(e6, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    public static final boolean c(android.content.Context context) {
        try {
            return V3.j.b(context);
        } catch (java.lang.NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long c0(android.view.View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof android.view.View)) {
                break;
            }
            android.view.View view2 = (android.view.View) view;
            fMin = java.lang.Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return java.lang.Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final boolean d(java.lang.String str) {
        if (!p224w3.m.k()) {
            return false;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25475Y4)).booleanValue()) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25497a5);
        if (!str2.isEmpty()) {
            for (java.lang.String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        java.lang.String str4 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25486Z4);
        if (str4.isEmpty()) {
            return true;
        }
        for (java.lang.String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final android.webkit.WebResourceResponse d0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            java.util.HashMap map = new java.util.HashMap();
            map.put("User-Agent", p174r3.v.t().H(context, str));
            map.put("Cache-Control", "max-stale=3600");
            java.lang.String str3 = (java.lang.String) new p214v3.Q(context).b(0, str2, map, null).get(60L, java.util.concurrent.TimeUnit.SECONDS);
            if (str3 != null) {
                return new android.webkit.WebResourceResponse("application/javascript", "UTF-8", new java.io.ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (java.io.IOException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e6) {
            p224w3.p.h("Could not fetch MRAID JS.", e6);
        }
        return null;
    }

    public static final boolean e(android.content.Context context) {
        android.app.KeyguardManager keyguardManagerY;
        return (context == null || (keyguardManagerY = y(context)) == null || !keyguardManagerY.isKeyguardLocked()) ? false : true;
    }

    public static final java.lang.String e0() {
        android.content.res.Resources resourcesF = p174r3.v.s().f();
        return resourcesF != null ? resourcesF.getString(p154p3.d.f52750t) : "Test Ad";
    }

    public static final boolean f(android.content.Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (java.lang.ClassNotFoundException unused) {
            return true;
        } catch (java.lang.Throwable th) {
            p224w3.p.e("Error loading class.", th);
            p174r3.v.s().x(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean g() {
        int iMyUid = android.os.Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean h(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.os.PowerManager powerManager;
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (android.os.Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (android.os.PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static final boolean i(android.content.Context context) {
        try {
            android.os.Bundle bundleZ = z(context);
            return android.text.TextUtils.isEmpty(B(bundleZ)) && !android.text.TextUtils.isEmpty(bundleZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (android.os.RemoteException unused) {
        }
    }

    public static final boolean j(android.content.Context context) {
        android.view.Window window;
        if ((context instanceof android.app.Activity) && (window = ((android.app.Activity) context).getWindow()) != null && window.getDecorView() != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void k(android.view.View view, int i6, android.view.MotionEvent motionEvent) {
        java.lang.String strA;
        int i10;
        int iHeight;
        int iWidth;
        java.lang.String str;
        com.google.android.gms.internal.ads.R60 r60Q;
        com.google.android.gms.internal.ads.U60 u60H0;
        android.view.View childAt = view;
        int[] iArr = new int[2];
        android.graphics.Rect rect = new android.graphics.Rect();
        try {
            java.lang.String packageName = view.getContext().getPackageName();
            if (childAt instanceof com.google.android.gms.internal.ads.EM) {
                childAt = ((com.google.android.gms.internal.ads.EM) childAt).getChildAt(0);
            }
            if (childAt instanceof com.google.android.gms.ads.nativead.d) {
                strA = "NATIVE";
                i10 = 1;
            } else {
                strA = "UNKNOWN";
                i10 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            p174r3.v.t();
            long jC0 = c0(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            java.lang.String str2 = "none";
            if (!(childAt instanceof com.google.android.gms.internal.ads.InterfaceC5507vu) || (u60H0 = ((com.google.android.gms.internal.ads.InterfaceC5507vu) childAt).h0()) == null) {
                str = "none";
            } else {
                str = u60H0.f32114b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof com.google.android.gms.internal.ads.InterfaceC2366Ft) && (r60Q = ((com.google.android.gms.internal.ads.InterfaceC2366Ft) childAt).Q()) != null) {
                strA = com.google.android.gms.internal.ads.R60.a(r60Q.f31162b);
                i10 = r60Q.f31168e;
                str2 = r60Q.f31138E;
            }
            p224w3.p.f(java.lang.String.format(java.util.Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", java.lang.Integer.valueOf(childAt.hashCode()), packageName, str2, str, strA, java.lang.Integer.valueOf(i10), childAt.getClass().getName(), java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12), java.lang.Integer.valueOf(childAt.getWidth()), java.lang.Integer.valueOf(childAt.getHeight()), java.lang.Integer.valueOf(iWidth), java.lang.Integer.valueOf(iHeight), java.lang.Long.valueOf(jC0), java.lang.Integer.toString(i6, 2)));
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Failure getting view location.", e6);
        }
    }

    public static final android.app.AlertDialog.Builder l(android.content.Context context) {
        p174r3.v.u();
        return new android.app.AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void m(android.content.Context context, java.lang.String str, java.lang.String str2) {
        new p214v3.Z(context, str, str2, null, null).b();
    }

    public static final void n(android.content.Context context, java.lang.Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2570Lg.f29546b.e()).booleanValue()) {
                V3.h.a(context, th);
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public static final int o(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException e6) {
            p224w3.p.g("Could not parse value:".concat(e6.toString()));
            return 0;
        }
    }

    public static final java.util.Map p(android.net.Uri uri) {
        java.lang.String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25651p)).booleanValue()) {
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : uri.getQueryParameterNames()) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i6 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i6);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i6);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(android.net.Uri.decode(encodedQuery.substring(i6, iIndexOf2)), iIndexOf2 == length ? "" : android.net.Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i6 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] q(android.app.Activity activity) {
        android.view.View viewFindViewById;
        android.view.Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? a0() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] r(android.app.Activity activity) {
        android.view.View viewFindViewById;
        android.view.Window window = activity.getWindow();
        int[] iArrA0 = (window == null || (viewFindViewById = window.findViewById(android.R.id.content)) == null) ? a0() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{p184s3.C7147y.b().e(activity, iArrA0[0]), p184s3.C7147y.b().e(activity, iArrA0[1])};
    }

    public static final boolean s(android.view.View view, android.os.PowerManager powerManager, android.app.KeyguardManager keyguardManager) {
        boolean z6 = p174r3.v.t().f55831e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || T(view);
        long jC0 = c0(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z6)) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25703u1)).booleanValue() || view.getLocalVisibleRect(new android.graphics.Rect()) || view.getGlobalVisibleRect(new android.graphics.Rect())) {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.wa)).booleanValue()) {
                    return true;
                }
                if (jC0 >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ya)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void t(android.content.Context context, android.content.Intent intent) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ta)).booleanValue()) {
            E(context, intent);
            return;
        }
        try {
            E(context, intent);
        } catch (java.lang.SecurityException e6) {
            p224w3.p.h("", e6);
            p174r3.v.s().x(e6, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void u(android.content.Context context, android.net.Uri uri) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
            android.os.Bundle bundle = new android.os.Bundle();
            intent.putExtras(bundle);
            U(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            p224w3.p.b("Opening " + uri.toString() + " in a new browser.");
        } catch (android.content.ActivityNotFoundException e6) {
            p224w3.p.e("No browser is found.", e6);
        }
    }

    public static final int[] v(android.app.Activity activity) {
        int[] iArrQ = q(activity);
        return new int[]{p184s3.C7147y.b().e(activity, iArrQ[0]), p184s3.C7147y.b().e(activity, iArrQ[1])};
    }

    public static final boolean w(android.view.View view, android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return s(view, applicationContext != null ? (android.os.PowerManager) applicationContext.getSystemService("power") : null, y(context));
    }

    public static final void x(android.content.Context context, android.content.Intent intent, com.google.android.gms.internal.ads.C3588eO c3588eO, java.lang.String str) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Vc)).booleanValue() || !(context instanceof com.google.android.gms.internal.ads.C2588Lu)) {
            t(context, intent);
            return;
        }
        try {
            android.net.Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Xc))) {
                    ((com.google.android.gms.internal.ads.C2588Lu) context).c(intent, 236);
                    if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Wc)).booleanValue() || c3588eO == null) {
                        return;
                    }
                    com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
                    c3479dOA.b("action", "hila");
                    c3479dOA.b("gqi", com.google.android.gms.internal.ads.AbstractC2829Sg0.c(str));
                    c3479dOA.f();
                    return;
                }
            }
            t(context, intent);
        } catch (android.content.ActivityNotFoundException e6) {
            e = e6;
            p224w3.p.e("Error occurred while starting activity for result", e);
            p174r3.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        } catch (java.lang.SecurityException e10) {
            e = e10;
            p224w3.p.e("Error occurred while starting activity for result", e);
            p174r3.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        } catch (java.lang.Exception e11) {
            e = e11;
            p224w3.p.e("Error occurred while starting activity for result", e);
            p174r3.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        }
    }

    private static android.app.KeyguardManager y(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof android.app.KeyguardManager)) {
            return null;
        }
        return (android.app.KeyguardManager) systemService;
    }

    private static android.os.Bundle z(android.content.Context context) {
        try {
            return W3.e.a(context).c(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e6) {
            p214v3.AbstractC7265q0.l("Error getting metadata", e6);
            return null;
        }
    }

    public final P4.d G(final android.net.Uri uri) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.j(new java.util.concurrent.Callable() { // from class: v3.z0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
                p174r3.v.t();
                return p214v3.E0.p(uri);
            }
        }, this.f55837k);
    }

    public final java.lang.String H(android.content.Context context, java.lang.String str) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.fb)).booleanValue()) {
            if (this.f55834h != null) {
                return this.f55834h;
            }
            this.f55834h = F(context, str);
            return this.f55834h;
        }
        synchronized (this.f55832f) {
            try {
                java.lang.String str2 = this.f55833g;
                if (str2 != null) {
                    return str2;
                }
                java.lang.String strF = F(context, str);
                this.f55833g = strF;
                return strF;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void K(android.content.Context context, java.lang.String str, boolean z6, java.net.HttpURLConnection httpURLConnection, boolean z10, int i6) {
        int iA = A(i6);
        p224w3.p.f("HTTP timeout: " + iA + " milliseconds.");
        httpURLConnection.setConnectTimeout(iA);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iA);
        if (android.text.TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", H(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    final /* synthetic */ void L(android.content.Context context, java.lang.String str, android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
        this.f55829c.set(p214v3.AbstractC7240e.b(context, str));
    }

    public final void N(final android.content.Context context, final java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6) {
        p174r3.v.t();
        bundle.putString("device", X());
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25491a;
        bundle.putString("eids", android.text.TextUtils.join(",", p184s3.A.a().a()));
        if (bundle.isEmpty()) {
            p224w3.p.b("Empty or null bundle.");
        } else {
            final java.lang.String str3 = (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ua);
            if (!this.f55830d.getAndSet(true)) {
                this.f55829c.set(p214v3.AbstractC7240e.a(context, str3, new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: v3.y0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str4) {
                        this.f55989a.L(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((android.os.Bundle) this.f55829c.get());
        }
        p184s3.C7147y.b();
        p224w3.g.y(context, str, "gmob-apps", bundle, true, new p224w3.f() { // from class: v3.x0
            @Override // p224w3.f
            public final p224w3.u o(java.lang.String str4) {
                com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
                p174r3.v.t();
                p214v3.E0.m(context, str, str4);
                return p224w3.u.SUCCESS;
            }
        });
    }

    public final boolean O(java.lang.String str) {
        return C(str, this.f55827a, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25642o0));
    }

    public final boolean P(java.lang.String str) {
        return C(str, this.f55828b, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25652p0));
    }

    public final boolean Q(android.content.Context context) {
        if (this.f55836j) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        p214v3.D0 d6 = null;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sa)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new p214v3.B0(this, d6), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new p214v3.B0(this, d6), intentFilter, 4);
        }
        this.f55836j = true;
        return true;
    }

    public final boolean R(android.content.Context context) {
        if (this.f55835i) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        p214v3.D0 d6 = null;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sa)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new p214v3.C0(this, d6), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new p214v3.C0(this, d6), intentFilter, 4);
        }
        this.f55835i = true;
        return true;
    }

    public final int S(android.content.Context context, android.net.Uri uri) {
        if (context == null) {
            p214v3.AbstractC7265q0.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof android.app.Activity)) {
            D(context, uri);
            return 2;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25277G4)).booleanValue()) {
            androidx.browser.customtabs.d dVarA = new androidx.browser.customtabs.d.C0346d(p174r3.v.i().c()).a();
            dVarA.f18641a.setPackage(com.google.android.gms.internal.ads.AbstractC5188sz0.a(context));
            dVarA.a(context, uri);
            return 5;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25255E4)).booleanValue()) {
            D(context, uri);
            return 9;
        }
        com.google.android.gms.internal.ads.C3393cg c3393cg = new com.google.android.gms.internal.ads.C3393cg();
        c3393cg.e(new p214v3.A0(this, c3393cg, context, uri));
        c3393cg.b((android.app.Activity) context);
        return 5;
    }
}
