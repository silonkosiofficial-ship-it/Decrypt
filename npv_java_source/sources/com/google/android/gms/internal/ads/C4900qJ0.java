package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4900qJ0 implements android.media.Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.GJ0 f38246a;

    C4900qJ0(com.google.android.gms.internal.ads.C5779yJ0 c5779yJ0, com.google.android.gms.internal.ads.GJ0 gj0) {
        this.f38246a = gj0;
    }

    public final void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z6) {
        this.f38246a.u();
    }

    public final void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z6) {
        this.f38246a.u();
    }
}
