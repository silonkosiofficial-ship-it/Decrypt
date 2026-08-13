package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3600ea extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3710fa f35005a;

    C3600ea(com.google.android.gms.internal.ads.C3710fa c3710fa) {
        this.f35005a = c3710fa;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        synchronized (com.google.android.gms.internal.ads.C3710fa.class) {
            this.f35005a.f35361a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        synchronized (com.google.android.gms.internal.ads.C3710fa.class) {
            this.f35005a.f35361a = null;
        }
    }
}
