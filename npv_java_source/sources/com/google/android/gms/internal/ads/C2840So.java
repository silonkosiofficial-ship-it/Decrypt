package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2840So {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f31754A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final java.lang.String f31755B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f31756C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f31763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f31765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f31766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f31769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private java.lang.String f31771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.lang.String f31772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f31773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f31774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final java.lang.String f31775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f31776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f31777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f31778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final java.lang.String f31779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final java.lang.String f31780x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f31781y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f31782z;

    /* JADX WARN: Code duplicated, block: B:12:0x0061  */
    public C2840So(android.content.Context context) {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        android.util.DisplayMetrics displayMetrics;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        c(context);
        e(context);
        d(context);
        java.util.Locale locale = java.util.Locale.getDefault();
        this.f31773q = b(packageManager, "geo:0,0?q=donuts") != null;
        this.f31774r = b(packageManager, "http://www.google.com") != null;
        this.f31775s = locale.getCountry();
        p174r3.v.t();
        p184s3.C7147y.b();
        this.f31776t = p224w3.g.t();
        this.f31777u = V3.j.c(context);
        this.f31778v = V3.j.d(context);
        this.f31779w = locale.getLanguage();
        android.content.pm.ResolveInfo resolveInfoB = b(packageManager, "market://details?id=com.google.android.gms.ads");
        java.lang.String str2 = null;
        if (resolveInfoB == null || (activityInfo = resolveInfoB.activityInfo) == null) {
            str = null;
        } else {
            try {
                android.content.pm.PackageInfo packageInfoF = W3.e.a(context).f(activityInfo.packageName, 0);
                if (packageInfoF != null) {
                    str = packageInfoF.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        this.f31780x = str;
        try {
            android.content.pm.PackageInfo packageInfoF2 = W3.e.a(context).f("com.android.vending", 128);
            if (packageInfoF2 != null) {
                str2 = packageInfoF2.versionCode + "." + packageInfoF2.packageName;
            }
        } catch (java.lang.Exception unused2) {
        }
        this.f31755B = str2;
        android.content.res.Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f31781y = displayMetrics.density;
        this.f31782z = displayMetrics.widthPixels;
        this.f31754A = displayMetrics.heightPixels;
    }

    public C2840So(android.content.Context context, com.google.android.gms.internal.ads.C2876To c2876To) {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        c(context);
        e(context);
        d(context);
        this.f31771o = android.os.Build.FINGERPRINT;
        this.f31772p = android.os.Build.DEVICE;
        this.f31756C = com.google.android.gms.internal.ads.C3393cg.g(context);
        this.f31773q = c2876To.f31988a;
        this.f31774r = c2876To.f31989b;
        this.f31775s = c2876To.f31990c;
        this.f31776t = c2876To.f31991d;
        this.f31777u = c2876To.f31992e;
        this.f31778v = c2876To.f31993f;
        this.f31779w = c2876To.f31994g;
        this.f31780x = c2876To.f31995h;
        this.f31755B = c2876To.f31996i;
        this.f31781y = c2876To.f31999l;
        this.f31782z = c2876To.f32000m;
        this.f31754A = c2876To.f32001n;
    }

    private static android.content.pm.ResolveInfo b(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            return packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 65536);
        } catch (java.lang.Throwable th) {
            p174r3.v.s().x(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f31757a = audioManager.getMode();
                this.f31758b = audioManager.isMusicActive();
                this.f31759c = audioManager.isSpeakerphoneOn();
                this.f31760d = audioManager.getStreamVolume(3);
                this.f31761e = audioManager.getRingerMode();
                this.f31762f = audioManager.getStreamVolume(2);
                return;
            } catch (java.lang.Throwable th) {
                p174r3.v.s().x(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f31757a = -2;
        this.f31758b = false;
        this.f31759c = false;
        this.f31760d = 0;
        this.f31761e = 2;
        this.f31762f = 0;
    }

    private final void d(android.content.Context context) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        android.content.Intent intentRegisterReceiver = (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sa)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.f31769m = -1.0d;
            this.f31770n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f31769m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f31770n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    private final void e(android.content.Context context) {
        int networkType;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.f31763g = telephonyManager.getNetworkOperator();
        if (V3.n.k()) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25759z8)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.f31765i = networkType;
        this.f31766j = telephonyManager.getPhoneType();
        this.f31764h = -2;
        this.f31767k = false;
        this.f31768l = -1;
        p174r3.v.t();
        if (p214v3.E0.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f31764h = activeNetworkInfo.getType();
                this.f31768l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f31764h = -1;
            }
            this.f31767k = connectivityManager.isActiveNetworkMetered();
        }
    }

    public final com.google.android.gms.internal.ads.C2876To a() {
        return new com.google.android.gms.internal.ads.C2876To(this.f31757a, this.f31773q, this.f31774r, this.f31763g, this.f31775s, this.f31776t, this.f31777u, this.f31778v, this.f31758b, this.f31759c, this.f31779w, this.f31780x, this.f31755B, this.f31760d, this.f31764h, this.f31765i, this.f31766j, this.f31761e, this.f31762f, this.f31781y, this.f31782z, this.f31754A, this.f31769m, this.f31770n, this.f31767k, this.f31768l, this.f31771o, this.f31756C, this.f31772p);
    }
}
