package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class X10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.pm.ApplicationInfo f32970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.pm.PackageInfo f32971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f32972c;

    X10(android.content.pm.ApplicationInfo applicationInfo, android.content.pm.PackageInfo packageInfo, android.content.Context context) {
        this.f32970a = applicationInfo;
        this.f32971b = packageInfo;
        this.f32972c = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 29;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        java.lang.String strValueOf;
        java.lang.String installingPackageName;
        java.lang.String str;
        android.content.pm.PackageManager.NameNotFoundException e6;
        java.lang.String initiatingPackageName;
        java.lang.String str2 = this.f32970a.packageName;
        android.content.pm.PackageInfo packageInfo = this.f32971b;
        java.lang.Integer numValueOf = packageInfo == null ? null : java.lang.Integer.valueOf(packageInfo.versionCode);
        android.content.pm.PackageInfo packageInfo2 = this.f32971b;
        java.lang.String str3 = packageInfo2 == null ? null : packageInfo2.versionName;
        try {
            android.content.Context context = this.f32972c;
            com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
            strValueOf = java.lang.String.valueOf(W3.e.a(context).d(str2));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ec)).booleanValue()) {
                try {
                    android.content.pm.InstallSourceInfo installSourceInfo = this.f32972c.getPackageManager().getInstallSourceInfo(str2);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (android.text.TextUtils.isEmpty(installingPackageName)) {
                                p214v3.AbstractC7265q0.k("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (android.text.TextUtils.isEmpty(initiatingPackageName)) {
                                    p214v3.AbstractC7265q0.k("No initiating package name found");
                                    str = null;
                                } else {
                                    str = initiatingPackageName;
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException e10) {
                                e6 = e10;
                                p174r3.v.s().x(e6, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e11) {
                            e6 = e11;
                            initiatingPackageName = null;
                        }
                    } else {
                        installingPackageName = null;
                        str = null;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException e12) {
                    installingPackageName = null;
                    e6 = e12;
                    initiatingPackageName = null;
                }
            } else {
                installingPackageName = null;
                str = null;
            }
        } else {
            installingPackageName = null;
            str = null;
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.Y10(str2, numValueOf, str3, strValueOf, installingPackageName, str));
    }
}
