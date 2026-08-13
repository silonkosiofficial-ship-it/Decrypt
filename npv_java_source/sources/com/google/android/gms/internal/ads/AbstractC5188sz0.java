package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5188sz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f38832a;

    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    public static java.lang.String a(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2 = f38832a;
        if (str2 != null) {
            return str2;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.example.com"));
        android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        java.lang.String str3 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentActivities) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f38832a = null;
        } else {
            if (arrayList.size() == 1) {
                str = (java.lang.String) arrayList.get(0);
            } else if (android.text.TextUtils.isEmpty(str3)) {
                str = "com.android.chrome";
                if (!arrayList.contains("com.android.chrome")) {
                    str = "com.chrome.beta";
                    if (!arrayList.contains("com.chrome.beta")) {
                        str = "com.chrome.dev";
                        if (arrayList.contains("com.chrome.dev")) {
                        }
                    }
                }
            } else {
                try {
                    java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                        java.util.Iterator<android.content.pm.ResolveInfo> it = listQueryIntentActivities2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                android.content.pm.ResolveInfo next = it.next();
                                android.content.IntentFilter intentFilter = next.filter;
                                if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                                }
                            } else if (arrayList.contains(str3)) {
                                f38832a = str3;
                            }
                            str = "com.android.chrome";
                            if (!arrayList.contains("com.android.chrome")) {
                                str = "com.chrome.beta";
                                if (!arrayList.contains("com.chrome.beta")) {
                                    str = "com.chrome.dev";
                                    if (arrayList.contains("com.chrome.dev")) {
                                    }
                                }
                            }
                        }
                    } else if (arrayList.contains(str3)) {
                        f38832a = str3;
                    } else {
                        str = "com.android.chrome";
                        if (!arrayList.contains("com.android.chrome")) {
                            str = "com.chrome.beta";
                            if (!arrayList.contains("com.chrome.beta")) {
                                str = "com.chrome.dev";
                                if (arrayList.contains("com.chrome.dev")) {
                                }
                            }
                        }
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            f38832a = str;
        }
        return f38832a;
    }
}
