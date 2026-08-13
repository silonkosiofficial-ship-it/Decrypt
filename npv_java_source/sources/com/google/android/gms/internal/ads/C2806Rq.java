package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2806Rq extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2914Uq f31368a;

    C2806Rq(com.google.android.gms.internal.ads.C2914Uq c2914Uq) {
        this.f31368a = c2914Uq;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.f31368a.f32287o.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.f31368a.f32287o.set(false);
    }
}
