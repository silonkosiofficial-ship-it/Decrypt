package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4176jo implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler f36736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4396lo f36737b;

    C4176jo(com.google.android.gms.internal.ads.C4396lo c4396lo, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f36736a = uncaughtExceptionHandler;
        this.f36737b = c4396lo;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            try {
                this.f36737b.i(thread, th);
            } finally {
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f36736a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (java.lang.Throwable unused) {
            p224w3.p.d("AdMob exception reporter failed reporting the exception.");
        }
        if (this.f36736a != null) {
        }
    }
}
