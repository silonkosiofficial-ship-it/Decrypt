package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3710fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.net.NetworkCapabilities f35361a;

    C3710fa(android.net.ConnectivityManager connectivityManager) {
        if (connectivityManager == null || android.os.Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.C3600ea(this));
        } catch (java.lang.RuntimeException unused) {
            synchronized (com.google.android.gms.internal.ads.C3710fa.class) {
                this.f35361a = null;
            }
        }
    }

    public static com.google.android.gms.internal.ads.C3710fa c(android.content.Context context) {
        if (context != null) {
            return new com.google.android.gms.internal.ads.C3710fa((android.net.ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (com.google.android.gms.internal.ads.C3710fa.class) {
            try {
                android.net.NetworkCapabilities networkCapabilities = this.f35361a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f35361a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f35361a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final android.net.NetworkCapabilities b() {
        return this.f35361a;
    }
}
