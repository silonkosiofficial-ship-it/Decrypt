package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4702oc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.security.MessageDigest f37840b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final java.lang.Object f37841a = new java.lang.Object();

    protected final java.security.MessageDigest a() {
        synchronized (this.f37841a) {
            java.security.MessageDigest messageDigest = f37840b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i6 = 0; i6 < 2; i6++) {
                try {
                    f37840b = java.security.MessageDigest.getInstance("MD5");
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return f37840b;
        }
    }

    abstract byte[] b(java.lang.String str);
}
