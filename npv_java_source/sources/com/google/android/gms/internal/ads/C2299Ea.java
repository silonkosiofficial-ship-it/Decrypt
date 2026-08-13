package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2299Ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27078a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27079b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27080c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27081d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27082e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27083f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f27084g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27085h = -1;

    private static android.util.DisplayMetrics l(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (java.lang.NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean m(android.view.View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((android.view.ViewGroup) view).getChildAt(0);
            }
            java.lang.Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            java.lang.Integer num = (java.lang.Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            java.lang.String str = (java.lang.String) objInvoke.getClass().getMethod("adTypeToString", java.lang.Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (java.lang.ReflectiveOperationException | java.lang.SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.f27084g;
    }

    public final long b() {
        return this.f27082e;
    }

    public final long c() {
        return this.f27078a;
    }

    public final long d() {
        return this.f27080c;
    }

    public final long e() {
        return this.f27085h;
    }

    public final long f() {
        return this.f27083f;
    }

    public final long g() {
        return this.f27079b;
    }

    public final long h() {
        return this.f27081d;
    }

    public final void i() {
        this.f27085h = this.f27084g;
        this.f27084g = android.os.SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f27079b = this.f27078a;
        this.f27078a = android.os.SystemClock.uptimeMillis();
    }

    public final void k(android.content.Context context, android.view.View view) {
        this.f27081d = this.f27080c;
        this.f27080c = android.os.SystemClock.uptimeMillis();
        long j6 = this.f27082e;
        if (j6 != -1) {
            this.f27083f = j6;
        }
        android.util.DisplayMetrics displayMetricsL = l(context);
        int i6 = displayMetricsL.widthPixels * displayMetricsL.heightPixels;
        if (view != null) {
            int iMin = java.lang.Math.min(view.getWidth(), displayMetricsL.widthPixels) * java.lang.Math.min(view.getHeight(), displayMetricsL.heightPixels);
            if (iMin + iMin >= i6 || (iMin == 0 && m(view))) {
                this.f27082e = this.f27080c;
                return;
            }
        }
        this.f27082e = -1L;
    }
}
