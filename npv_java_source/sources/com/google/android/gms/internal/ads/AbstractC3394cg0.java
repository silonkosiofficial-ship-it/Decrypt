package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3394cg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3175ag0 f34557a = new com.google.android.gms.internal.ads.C3175ag0("PhoneskyVerificationUtils");

    public static boolean a(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f34557a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (android.content.pm.Signature signature : signatureArr) {
                            java.lang.String strA = com.google.android.gms.internal.ads.AbstractC3285bg0.a(signature.toByteArray());
                            arrayList.add(strA);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                                java.lang.String str = android.os.Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                                }
                            }
                            return true;
                        }
                        com.google.android.gms.internal.ads.C3175ag0 c3175ag0 = f34557a;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.util.Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((java.lang.CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((java.lang.CharSequence) ", ");
                            }
                        }
                        c3175ag0.d(java.lang.String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new java.lang.Object[0]);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    f34557a.d("Play Store package is not found.", new java.lang.Object[0]);
                }
            } else {
                f34557a.d("Play Store package is disabled.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            f34557a.d("Play Store package is not found.", new java.lang.Object[0]);
        }
        return false;
    }
}
