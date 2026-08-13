package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5155sj {
    public static final android.content.Intent a(android.net.Uri uri, android.content.Context context, com.google.android.gms.internal.ads.Z9 z10, android.view.View view, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        if (uri == null) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final android.content.Intent b(android.content.Intent intent, android.content.pm.ResolveInfo resolveInfo, android.content.Context context, com.google.android.gms.internal.ads.Z9 z10, android.view.View view, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        android.content.Intent intent2 = new android.content.Intent(intent);
        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final android.content.pm.ResolveInfo c(android.content.Intent intent, android.content.Context context, com.google.android.gms.internal.ads.Z9 z10, android.view.View view, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        return d(intent, new java.util.ArrayList(), context, z10, view, c4985r70);
    }

    public static final android.content.pm.ResolveInfo d(android.content.Intent intent, java.util.ArrayList arrayList, android.content.Context context, com.google.android.gms.internal.ads.Z9 z10, android.view.View view, com.google.android.gms.internal.ads.C4985r70 c4985r70) {
        android.content.pm.ResolveInfo resolveInfo = null;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i6 = 0; i6 < listQueryIntentActivities.size(); i6++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i6).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
        } catch (java.lang.Throwable th) {
            p174r3.v.s().x(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        return resolveInfo;
    }
}
