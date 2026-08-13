package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3393cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f34553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f34554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f34555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3284bg f34556d;

    public static boolean g(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i6 = 0; i6 < listQueryIntentActivities.size(); i6++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i6).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(com.google.android.gms.internal.ads.AbstractC5188sz0.a(context));
                    }
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.f a() {
        androidx.browser.customtabs.c cVar = this.f34554b;
        if (cVar == null) {
            this.f34553a = null;
        } else if (this.f34553a == null) {
            this.f34553a = cVar.e(null);
        }
        return this.f34553a;
    }

    public final void b(android.app.Activity activity) {
        java.lang.String strA;
        if (this.f34554b == null && (strA = com.google.android.gms.internal.ads.AbstractC5188sz0.a(activity)) != null) {
            com.google.android.gms.internal.ads.C5298tz0 c5298tz0 = new com.google.android.gms.internal.ads.C5298tz0(this);
            this.f34555c = c5298tz0;
            androidx.browser.customtabs.c.a(activity, strA, c5298tz0);
        }
    }

    public final void c(androidx.browser.customtabs.c cVar) {
        this.f34554b = cVar;
        cVar.g(0L);
        com.google.android.gms.internal.ads.InterfaceC3284bg interfaceC3284bg = this.f34556d;
        if (interfaceC3284bg != null) {
            interfaceC3284bg.a();
        }
    }

    public final void d() {
        this.f34554b = null;
        this.f34553a = null;
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC3284bg interfaceC3284bg) {
        this.f34556d = interfaceC3284bg;
    }

    public final void f(android.app.Activity activity) {
        androidx.browser.customtabs.e eVar = this.f34555c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f34554b = null;
        this.f34553a = null;
        this.f34555c = null;
    }
}
