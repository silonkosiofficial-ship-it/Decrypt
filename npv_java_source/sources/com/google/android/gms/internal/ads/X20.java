package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class X20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f33035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f33036b;

    public X20(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f33035a = yk0;
        this.f33036b = context;
    }

    private static android.content.pm.ResolveInfo d(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f33035a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.W20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f32655a.c();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x013a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0145  */
    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    final /* synthetic */ com.google.android.gms.internal.ads.V20 c() {
        android.content.pm.ActivityInfo activityInfo;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean zEquals;
        boolean z6;
        java.lang.String string;
        boolean z10;
        boolean z11;
        android.os.Bundle bundle;
        android.content.pm.PackageManager packageManager = this.f33036b.getPackageManager();
        java.util.Locale locale = java.util.Locale.getDefault();
        android.content.pm.ResolveInfo resolveInfoD = d(packageManager, "geo:0,0?q=donuts");
        android.content.pm.ResolveInfo resolveInfoD2 = d(packageManager, "http://www.google.com");
        java.lang.String country = locale.getCountry();
        p174r3.v.t();
        p184s3.C7147y.b();
        boolean zT = p224w3.g.t();
        android.content.Context context = this.f33036b;
        boolean zC = V3.j.c(context);
        boolean zD = V3.j.d(context);
        java.lang.String language = locale.getLanguage();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.os.LocaleList localeList = android.os.LocaleList.getDefault();
            for (int i6 = 0; i6 < localeList.size(); i6++) {
                arrayList.add(localeList.get(i6).getLanguage());
            }
        }
        android.content.Context context2 = this.f33036b;
        android.content.pm.ResolveInfo resolveInfoD3 = d(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoD3 == null || (activityInfo = resolveInfoD3.activityInfo) == null) {
            str = null;
        } else {
            try {
                android.content.pm.PackageInfo packageInfoF = W3.e.a(context2).f(activityInfo.packageName, 0);
                if (packageInfoF != null) {
                    str = packageInfoF.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            android.content.pm.PackageInfo packageInfoF2 = W3.e.a(this.f33036b).f("com.android.vending", 128);
            str2 = packageInfoF2 != null ? packageInfoF2.versionCode + "." + packageInfoF2.packageName : null;
        } catch (java.lang.Exception unused2) {
        }
        android.content.Context context3 = this.f33036b;
        java.lang.String str4 = android.os.Build.FINGERPRINT;
        if (packageManager != null) {
            str3 = str2;
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 < listQueryIntentActivities.size()) {
                        java.util.List<android.content.pm.ResolveInfo> list = listQueryIntentActivities;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(com.google.android.gms.internal.ads.AbstractC5188sz0.a(context3));
                            break;
                        }
                        i10++;
                        listQueryIntentActivities = list;
                    }
                }
            }
            p174r3.v.t();
            long availableBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.kb)).booleanValue()) {
                p174r3.v.t();
                if (p214v3.E0.c(this.f33036b)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ob)).booleanValue()) {
                android.content.Context context4 = this.f33036b;
                try {
                    bundle = W3.e.a(context4).c(context4.getPackageName(), 128).metaData;
                    if (bundle == null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                        string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                    } else {
                        string = null;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                }
            } else {
                string = "";
            }
            if (resolveInfoD2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (resolveInfoD != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new com.google.android.gms.internal.ads.V20(z11, z10, country, zT, zC, zD, language, arrayList, str, str3, str4, zEquals, android.os.Build.MODEL, availableBytes, z6, string, android.os.Build.VERSION.SDK_INT);
        }
        str3 = str2;
        zEquals = false;
        p174r3.v.t();
        long availableBytes2 = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.kb)).booleanValue()) {
            p174r3.v.t();
            if (p214v3.E0.c(this.f33036b)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ob)).booleanValue()) {
            android.content.Context context5 = this.f33036b;
            bundle = W3.e.a(context5).c(context5.getPackageName(), 128).metaData;
            if (bundle == null) {
                string = null;
            } else {
                string = null;
            }
        } else {
            string = "";
        }
        if (resolveInfoD2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (resolveInfoD != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new com.google.android.gms.internal.ads.V20(z11, z10, country, zT, zC, zD, language, arrayList, str, str3, str4, zEquals, android.os.Build.MODEL, availableBytes2, z6, string, android.os.Build.VERSION.SDK_INT);
    }
}
