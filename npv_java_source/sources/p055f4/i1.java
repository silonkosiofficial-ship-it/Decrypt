package p055f4;

/* JADX INFO: loaded from: classes3.dex */
final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p055f4.e1 f45158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.app.Activity f45159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.a f45160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.d f45161d;

    /* synthetic */ i1(p055f4.e1 e1Var, android.app.Activity activity, L4.a aVar, L4.d dVar, p055f4.f1 f1Var) {
        this.f45158a = e1Var;
        this.f45159b = activity;
        this.f45160c = aVar;
        this.f45161d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    static /* bridge */ /* synthetic */ p055f4.C6568m0 a(p055f4.i1 i1Var) throws p055f4.Z0 {
        android.os.Bundle bundle;
        java.util.List arrayList;
        p055f4.EnumC6558h0 enumC6558h0;
        java.util.List listEmptyList;
        android.content.pm.PackageInfo packageInfo;
        p055f4.C6568m0 c6568m0 = new p055f4.C6568m0();
        java.lang.String strC = i1Var.f45161d.c();
        if (android.text.TextUtils.isEmpty(strC)) {
            try {
                bundle = i1Var.f45158a.f45125a.getPackageManager().getApplicationInfo(i1Var.f45158a.f45125a.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strC = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (android.text.TextUtils.isEmpty(strC)) {
                throw new p055f4.Z0(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        c6568m0.f45184a = strC;
        if (i1Var.f45160c.b()) {
            arrayList = new java.util.ArrayList();
            int iA = i1Var.f45160c.a();
            if (iA != 1) {
                if (iA == 2) {
                    enumC6558h0 = p055f4.EnumC6558h0.GEO_OVERRIDE_NON_EEA;
                }
                arrayList.add(p055f4.EnumC6558h0.PREVIEWING_DEBUG_MESSAGES);
            } else {
                enumC6558h0 = p055f4.EnumC6558h0.GEO_OVERRIDE_EEA;
            }
            arrayList.add(enumC6558h0);
            arrayList.add(p055f4.EnumC6558h0.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = java.util.Collections.emptyList();
        }
        c6568m0.f45192i = arrayList;
        c6568m0.f45188e = i1Var.f45158a.f45126b.c();
        c6568m0.f45187d = java.lang.Boolean.valueOf(i1Var.f45161d.b());
        c6568m0.f45186c = java.util.Locale.getDefault().toLanguageTag();
        p055f4.C6560i0 c6560i0 = new p055f4.C6560i0();
        int i6 = android.os.Build.VERSION.SDK_INT;
        c6560i0.f45156b = java.lang.Integer.valueOf(i6);
        c6560i0.f45155a = android.os.Build.MODEL;
        c6560i0.f45157c = 2;
        c6568m0.f45185b = c6560i0;
        android.content.res.Configuration configuration = i1Var.f45158a.f45125a.getResources().getConfiguration();
        i1Var.f45158a.f45125a.getResources().getConfiguration();
        p055f4.C6564k0 c6564k0 = new p055f4.C6564k0();
        c6564k0.f45169a = java.lang.Integer.valueOf(configuration.screenWidthDp);
        c6564k0.f45170b = java.lang.Integer.valueOf(configuration.screenHeightDp);
        c6564k0.f45171c = java.lang.Double.valueOf(i1Var.f45158a.f45125a.getResources().getDisplayMetrics().density);
        if (i6 >= 28) {
            android.app.Activity activity = i1Var.f45159b;
            android.view.Window window = activity == null ? null : activity.getWindow();
            android.view.View decorView = window == null ? null : window.getDecorView();
            android.view.WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            android.view.DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList = java.util.Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        p055f4.C6562j0 c6562j0 = new p055f4.C6562j0();
                        c6562j0.f45164b = java.lang.Integer.valueOf(rect.left);
                        c6562j0.f45165c = java.lang.Integer.valueOf(rect.right);
                        c6562j0.f45163a = java.lang.Integer.valueOf(rect.top);
                        c6562j0.f45166d = java.lang.Integer.valueOf(rect.bottom);
                        arrayList2.add(c6562j0);
                    }
                }
                listEmptyList = arrayList2;
            }
        } else {
            listEmptyList = java.util.Collections.emptyList();
        }
        c6564k0.f45172d = listEmptyList;
        c6568m0.f45189f = c6564k0;
        p055f4.e1 e1Var = i1Var.f45158a;
        android.app.Application application = e1Var.f45125a;
        try {
            packageInfo = e1Var.f45125a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        p055f4.C6556g0 c6556g0 = new p055f4.C6556g0();
        c6556g0.f45134a = application.getPackageName();
        java.lang.CharSequence applicationLabel = i1Var.f45158a.f45125a.getPackageManager().getApplicationLabel(i1Var.f45158a.f45125a.getApplicationInfo());
        c6556g0.f45135b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            c6556g0.f45136c = java.lang.Long.toString(android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        c6568m0.f45190g = c6556g0;
        p055f4.C6566l0 c6566l0 = new p055f4.C6566l0();
        c6566l0.f45178a = "3.0.0";
        c6568m0.f45191h = c6566l0;
        return c6568m0;
    }
}
