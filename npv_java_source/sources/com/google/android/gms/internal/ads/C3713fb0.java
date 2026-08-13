package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3713fb0 extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3823gb0 f35362a;

    C3713fb0(com.google.android.gms.internal.ads.C3823gb0 c3823gb0) {
        this.f35362a = c3823gb0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.f35362a.s(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.f35362a.s(false);
    }
}
