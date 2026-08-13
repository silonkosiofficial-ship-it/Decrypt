package N3;

/* JADX INFO: renamed from: N3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1395h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7660a = N3.AbstractC1398k.f7664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final N3.C1395h f7661b = new N3.C1395h();

    C1395h() {
    }

    public static N3.C1395h f() {
        return f7661b;
    }

    public int a(android.content.Context context) {
        return N3.AbstractC1398k.a(context);
    }

    public android.content.Intent b(android.content.Context context, int i6, java.lang.String str) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return null;
            }
            android.net.Uri uriFromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && V3.j.g(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("gcore_");
        sb.append(f7660a);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(W3.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String string = sb.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder builderAppendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public android.app.PendingIntent c(android.content.Context context, int i6, int i10) {
        return d(context, i6, i10, null);
    }

    public android.app.PendingIntent d(android.content.Context context, int i6, int i10, java.lang.String str) {
        android.content.Intent intentB = b(context, i6, str);
        if (intentB == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, i10, intentB, p045e4.d.f44671a | 134217728);
    }

    public java.lang.String e(int i6) {
        return N3.AbstractC1398k.b(i6);
    }

    public int g(android.content.Context context) {
        return h(context, f7660a);
    }

    public int h(android.content.Context context, int i6) {
        int iF = N3.AbstractC1398k.f(context, i6);
        if (N3.AbstractC1398k.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(android.content.Context context, java.lang.String str) {
        return N3.AbstractC1398k.k(context, str);
    }

    public boolean j(int i6) {
        return N3.AbstractC1398k.i(i6);
    }
}
