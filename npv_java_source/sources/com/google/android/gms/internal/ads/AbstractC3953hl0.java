package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3953hl0 {
    static void a(java.lang.Throwable th) {
        if (th instanceof java.lang.InterruptedException) {
            java.lang.Thread.currentThread().interrupt();
        }
    }
}
