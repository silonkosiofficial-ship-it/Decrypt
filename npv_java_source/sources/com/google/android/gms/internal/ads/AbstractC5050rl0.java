package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5050rl0 {
    public static java.lang.Object a(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z6 = true;
            } catch (java.lang.Throwable th) {
                if (z6) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }
}
