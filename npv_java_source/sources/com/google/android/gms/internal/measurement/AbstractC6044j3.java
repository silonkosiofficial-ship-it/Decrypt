package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6044j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile M4.g f40991a = M4.g.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f40992b = new java.lang.Object();

    private static boolean a(android.content.Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean b(android.content.Context context, android.net.Uri uri) {
        java.lang.String authority = uri.getAuthority();
        boolean z6 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            java.lang.String str = authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.";
            return false;
        }
        if (!f40991a.c()) {
            synchronized (f40992b) {
                try {
                    if (f40991a.c()) {
                        return ((java.lang.Boolean) f40991a.b()).booleanValue();
                    }
                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                        android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", android.os.Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                        if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                        }
                        f40991a = M4.g.d(java.lang.Boolean.valueOf(z6));
                    }
                    if (a(context)) {
                        z6 = true;
                    }
                    f40991a = M4.g.d(java.lang.Boolean.valueOf(z6));
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return ((java.lang.Boolean) f40991a.b()).booleanValue();
    }
}
