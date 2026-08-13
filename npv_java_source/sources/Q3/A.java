package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p170r.Y f8851a = new p170r.Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.util.Locale f8852b;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            return W3.e.a(context).d(packageName).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String b(android.content.Context context, int i6) {
        int i10;
        android.content.res.Resources resources = context.getResources();
        if (i6 == 1) {
            i10 = M3.b.f6998d;
        } else if (i6 != 2) {
            i10 = i6 != 3 ? android.R.string.ok : M3.b.f6995a;
        } else {
            i10 = M3.b.f7004j;
        }
        return resources.getString(i10);
    }

    public static java.lang.String c(android.content.Context context, int i6) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strA = a(context);
        if (i6 == 1) {
            return resources.getString(M3.b.f6999e, strA);
        }
        if (i6 == 2) {
            return V3.j.g(context) ? resources.getString(M3.b.f7008n) : resources.getString(M3.b.f7005k, strA);
        }
        if (i6 == 3) {
            return resources.getString(M3.b.f6996b, strA);
        }
        if (i6 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i6 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i6 == 9) {
            return resources.getString(M3.b.f7003i, strA);
        }
        if (i6 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i6) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(M3.b.f7007m, strA);
            default:
                return resources.getString(N3.AbstractC1400m.f7672a, strA);
        }
    }

    public static java.lang.String d(android.content.Context context, int i6) {
        return (i6 == 6 || i6 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i6);
    }

    public static java.lang.String e(android.content.Context context, int i6) {
        java.lang.String strH = i6 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i6);
        return strH == null ? context.getResources().getString(M3.b.f7002h) : strH;
    }

    public static java.lang.String f(android.content.Context context, int i6) {
        android.content.res.Resources resources = context.getResources();
        switch (i6) {
            case 1:
                return resources.getString(M3.b.f7000f);
            case 2:
                return resources.getString(M3.b.f7006l);
            case 3:
                return resources.getString(M3.b.f6997c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                java.lang.String str = "Unexpected error code " + i6;
                return null;
            case 16:
                return null;
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static java.lang.String g(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(N3.AbstractC1400m.f7672a);
        }
        return java.lang.String.format(resources.getConfiguration().locale, strH, str2);
    }

    private static java.lang.String h(android.content.Context context, java.lang.String str) {
        p170r.Y y6 = f8851a;
        synchronized (y6) {
            try {
                java.util.Locale localeD = androidx.core.os.f.a(context.getResources().getConfiguration()).d(0);
                if (!localeD.equals(f8852b)) {
                    y6.clear();
                    f8852b = localeD;
                }
                java.lang.String str2 = (java.lang.String) y6.get(str);
                if (str2 != null) {
                    return str2;
                }
                android.content.res.Resources resourcesD = N3.AbstractC1397j.d(context);
                if (resourcesD == null) {
                    return null;
                }
                int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    java.lang.String str3 = "Missing resource: " + str;
                    return null;
                }
                java.lang.String string = resourcesD.getString(identifier);
                if (!android.text.TextUtils.isEmpty(string)) {
                    y6.put(str, string);
                    return string;
                }
                java.lang.String str4 = "Got empty resource: " + str;
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
