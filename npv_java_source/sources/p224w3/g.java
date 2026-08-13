package p224w3;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f56228b = new com.google.android.gms.internal.ads.HandlerC2345Fe0(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f56229c = p104k3.i.class.getName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f56230d = p234x3.a.class.getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f56231e = p114l3.a.class.getName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String f56232f = p114l3.b.class.getName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.String f56233g = G3.b.class.getName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.String f56234h = p104k3.C6889f.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f56235a = -1.0f;

    public static final java.lang.String A(android.content.Context context) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String string = contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || t()) {
            string = "emulator";
        }
        return B(string, "MD5");
    }

    private static java.lang.String B(java.lang.String str, java.lang.String str2) {
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigest.digest()));
            } catch (java.lang.ArithmeticException unused) {
                return null;
            } catch (java.security.NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final org.json.JSONArray a(java.util.Collection collection) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void b(org.json.JSONArray jSONArray, java.lang.Object obj) throws org.json.JSONException {
        java.lang.Object objJ;
        if (obj instanceof android.os.Bundle) {
            objJ = k((android.os.Bundle) obj);
        } else if (obj instanceof java.util.Map) {
            objJ = l((java.util.Map) obj);
        } else if (obj instanceof java.util.Collection) {
            objJ = a((java.util.Collection) obj);
        } else {
            if (!(obj instanceof java.lang.Object[])) {
                jSONArray.put(obj);
                return;
            }
            objJ = j((java.lang.Object[]) obj);
        }
        jSONArray.put(objJ);
    }

    private final void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) throws org.json.JSONException {
        java.lang.Boolean[] boolArr;
        java.lang.Object objJ;
        java.lang.Long[] lArr;
        java.lang.Double[] dArr;
        java.lang.Integer[] numArr;
        java.util.Collection collectionAsList;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25641o)).booleanValue()) {
            str = java.lang.String.valueOf(str);
        }
        if (obj instanceof android.os.Bundle) {
            objJ = k((android.os.Bundle) obj);
        } else if (obj instanceof java.util.Map) {
            objJ = l((java.util.Map) obj);
        } else {
            if (obj instanceof java.util.Collection) {
                str = java.lang.String.valueOf(str);
                collectionAsList = (java.util.Collection) obj;
            } else if (obj instanceof java.lang.Object[]) {
                collectionAsList = java.util.Arrays.asList((java.lang.Object[]) obj);
            } else {
                int i6 = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new java.lang.Integer[0];
                    } else {
                        int length = iArr.length;
                        java.lang.Integer[] numArr2 = new java.lang.Integer[length];
                        while (i6 < length) {
                            numArr2[i6] = java.lang.Integer.valueOf(iArr[i6]);
                            i6++;
                        }
                        numArr = numArr2;
                    }
                    objJ = j(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new java.lang.Double[0];
                    } else {
                        int length2 = dArr2.length;
                        java.lang.Double[] dArr3 = new java.lang.Double[length2];
                        while (i6 < length2) {
                            dArr3[i6] = java.lang.Double.valueOf(dArr2[i6]);
                            i6++;
                        }
                        dArr = dArr3;
                    }
                    objJ = j(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new java.lang.Long[0];
                    } else {
                        int length3 = jArr.length;
                        java.lang.Long[] lArr2 = new java.lang.Long[length3];
                        while (i6 < length3) {
                            lArr2[i6] = java.lang.Long.valueOf(jArr[i6]);
                            i6++;
                        }
                        lArr = lArr2;
                    }
                    objJ = j(lArr);
                } else {
                    if (!(obj instanceof boolean[])) {
                        jSONObject.put(str, obj);
                        return;
                    }
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new java.lang.Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        java.lang.Boolean[] boolArr2 = new java.lang.Boolean[length4];
                        while (i6 < length4) {
                            boolArr2[i6] = java.lang.Boolean.valueOf(zArr[i6]);
                            i6++;
                        }
                        boolArr = boolArr2;
                    }
                    objJ = j(boolArr);
                }
            }
            objJ = a(collectionAsList);
        }
        jSONObject.put(str, objJ);
    }

    private static final void d(android.view.ViewGroup viewGroup, p184s3.c2 c2Var, java.lang.String str, int i6, int i10) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        android.content.Context context = viewGroup.getContext();
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i6);
        textView.setBackgroundColor(i10);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setBackgroundColor(i6);
        int iZ = z(context, 3);
        frameLayout.addView(textView, new android.widget.FrameLayout.LayoutParams(c2Var.f54203H - iZ, c2Var.f54200E - iZ, 17));
        viewGroup.addView(frameLayout, c2Var.f54203H, c2Var.f54200E);
    }

    public static android.app.ActivityManager.MemoryInfo f(android.content.Context context) {
        android.app.ActivityManager activityManager;
        if (context == null || (activityManager = (android.app.ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (java.lang.NullPointerException unused) {
            p224w3.p.g("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static java.lang.String g() {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        byte[] byteArray = java.math.BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = java.math.BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        java.lang.String string = new java.math.BigInteger(1, byteArray).toString();
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                java.lang.System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new java.math.BigInteger(1, bArr).toString();
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static java.lang.String h(java.lang.String str) {
        return B(str, "MD5");
    }

    public static java.lang.String i(java.lang.String str) {
        return B(str, "SHA-256");
    }

    public static boolean q(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((java.lang.String) com.google.android.gms.internal.ads.AbstractC2570Lg.f29548d.e());
    }

    public static final int r(android.util.DisplayMetrics displayMetrics, int i6) {
        return (int) android.util.TypedValue.applyDimension(1, i6, displayMetrics);
    }

    public static final java.lang.String s(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        java.lang.String className;
        int i6 = 0;
        while (true) {
            int i10 = i6 + 1;
            if (i10 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i6];
            java.lang.String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f56229c.equalsIgnoreCase(className2) || f56230d.equalsIgnoreCase(className2) || f56231e.equalsIgnoreCase(className2) || f56232f.equalsIgnoreCase(className2) || f56233g.equalsIgnoreCase(className2) || f56234h.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i10].getClassName();
                break;
            }
            i6 = i10;
        }
        if (str != null) {
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i11 = 2; i11 > 0 && stringTokenizer.hasMoreElements(); i11--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean t() {
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.nb)).booleanValue();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return android.os.Build.DEVICE.startsWith("generic");
        }
        java.lang.String str = android.os.Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && android.os.Build.HARDWARE.contains("ranchu");
    }

    public static final boolean u(android.content.Context context, int i6) {
        return N3.C1395h.f().h(context, i6) == 0;
    }

    public static final boolean v(android.content.Context context) {
        int iH = N3.C1395h.f().h(context, 12451000);
        return iH == 0 || iH == 2;
    }

    public static final boolean w() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static final int x(android.util.DisplayMetrics displayMetrics, int i6) {
        return java.lang.Math.round(i6 / displayMetrics.density);
    }

    public static final void y(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6, p224w3.f fVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", android.os.Build.VERSION.RELEASE);
        bundle.putString("api", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = N3.C1395h.f().a(context) + ".244410000";
        }
        bundle.putString("js", str);
        android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (java.lang.String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        fVar.o(builderAppendQueryParameter.toString());
    }

    public static final int z(android.content.Context context, int i6) {
        return r(context.getResources().getDisplayMetrics(), i6);
    }

    public final int e(android.content.Context context, int i6) {
        if (this.f56235a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f56235a < 0.0f) {
                        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f56235a = displayMetrics.density;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return java.lang.Math.round(i6 / this.f56235a);
    }

    final org.json.JSONArray j(java.lang.Object[] objArr) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final org.json.JSONObject k(android.os.Bundle bundle) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final org.json.JSONObject l(java.util.Map map) throws org.json.JSONException {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (java.lang.ClassCastException e6) {
            throw new org.json.JSONException("Could not convert map to JSON: ".concat(java.lang.String.valueOf(e6.getMessage())));
        }
    }

    public final org.json.JSONObject m(android.os.Bundle bundle, org.json.JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return k(bundle);
        } catch (org.json.JSONException e6) {
            p224w3.p.e("Error converting Bundle to JSON", e6);
            return null;
        }
    }

    public final void n(android.view.ViewGroup viewGroup, p184s3.c2 c2Var, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            p224w3.p.g(str2);
        }
        d(viewGroup, c2Var, str, -65536, -16777216);
    }

    public final void o(android.view.ViewGroup viewGroup, p184s3.c2 c2Var, java.lang.String str) {
        d(viewGroup, c2Var, "Ads by Google", -16777216, -1);
    }

    public final void p(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z6) {
        y(context, str, "gmob-apps", bundle, true, new p224w3.f() { // from class: w3.d
            @Override // p224w3.f
            public final p224w3.u o(java.lang.String str3) {
                new p224w3.e(this.f56226a, str3).start();
                return p224w3.u.SUCCESS;
            }
        });
    }
}
