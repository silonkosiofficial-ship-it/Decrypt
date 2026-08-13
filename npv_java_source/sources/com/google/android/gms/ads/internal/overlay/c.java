package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: loaded from: classes.dex */
final class c implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24744a;

    c(long j6) {
        this.f24744a = j6;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.f24709b0.remove(java.lang.Long.valueOf(this.f24744a)) == null) {
            return null;
        }
        p174r3.v.s().x(new java.lang.Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
