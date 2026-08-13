package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class PackageManagerOnChecksumsReadyListenerC4879q9 implements android.content.pm.PackageManager$OnChecksumsReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.internal.ads.C4062il0 f38190a = com.google.android.gms.internal.ads.C4062il0.D();

    public final void onChecksumsReady(java.util.List list) {
        if (list != null) {
            try {
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    android.content.pm.ApkChecksum apkChecksumA = com.google.android.gms.internal.ads.AbstractC4549n9.a(list.get(i6));
                    if (apkChecksumA.getType() == 8) {
                        com.google.android.gms.internal.ads.C4062il0 c4062il0 = this.f38190a;
                        com.google.android.gms.internal.ads.AbstractC5156sj0 abstractC5156sj0E = com.google.android.gms.internal.ads.AbstractC5156sj0.g().e();
                        byte[] value = apkChecksumA.getValue();
                        c4062il0.f(abstractC5156sj0E.h(value, 0, value.length));
                        return;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        this.f38190a.f("");
    }
}
