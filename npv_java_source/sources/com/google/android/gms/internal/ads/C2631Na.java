package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2631Na {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String[] f30328e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f30329a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30330b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f30331c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30332d = false;

    C2631Na(android.content.Context context, java.util.concurrent.Executor executor, java.lang.String[] strArr) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((android.app.AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new com.google.android.gms.internal.ads.C2558La(this));
        } catch (java.lang.IllegalArgumentException | java.lang.NoSuchMethodError unused) {
        }
    }

    public static com.google.android.gms.internal.ads.C2631Na d(android.content.Context context, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.C2631Na(context, executor, f30328e);
    }

    public final long b() {
        long j6 = this.f30331c;
        this.f30331c = -1L;
        return j6;
    }

    public final long c() {
        if (this.f30332d) {
            return this.f30330b - this.f30329a;
        }
        return -1L;
    }

    public final void h() {
        if (this.f30332d) {
            this.f30330b = java.lang.System.currentTimeMillis();
        }
    }
}
