package com.google.firebase;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String e(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? java.lang.String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String f(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || android.os.Build.VERSION.SDK_INT < 24) ? "" : java.lang.String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String g(android.content.Context context) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i6 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String h(android.content.Context context) {
        java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static java.lang.String i(java.lang.String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(M5.c.c());
        arrayList.add(E5.f.f());
        arrayList.add(M5.h.b("fire-android", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)));
        arrayList.add(M5.h.b("fire-core", "21.0.0"));
        arrayList.add(M5.h.b("device-name", i(android.os.Build.PRODUCT)));
        arrayList.add(M5.h.b("device-model", i(android.os.Build.DEVICE)));
        arrayList.add(M5.h.b("device-brand", i(android.os.Build.BRAND)));
        arrayList.add(M5.h.c("android-target-sdk", new M5.h.a() { // from class: Q4.i
            @Override // M5.h.a
            public final java.lang.String a(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.e((android.content.Context) obj);
            }
        }));
        arrayList.add(M5.h.c("android-min-sdk", new M5.h.a() { // from class: Q4.j
            @Override // M5.h.a
            public final java.lang.String a(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.f((android.content.Context) obj);
            }
        }));
        arrayList.add(M5.h.c("android-platform", new M5.h.a() { // from class: Q4.k
            @Override // M5.h.a
            public final java.lang.String a(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.g((android.content.Context) obj);
            }
        }));
        arrayList.add(M5.h.c("android-installer", new M5.h.a() { // from class: Q4.l
            @Override // M5.h.a
            public final java.lang.String a(java.lang.Object obj) {
                return com.google.firebase.FirebaseCommonRegistrar.h((android.content.Context) obj);
            }
        }));
        java.lang.String strA = M5.e.a();
        if (strA != null) {
            arrayList.add(M5.h.b("kotlin", strA));
        }
        return arrayList;
    }
}
