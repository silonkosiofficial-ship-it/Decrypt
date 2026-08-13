package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2854Tb implements com.google.android.gms.internal.ads.InterfaceC3070Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f31962a;

    C2854Tb(com.google.android.gms.internal.ads.C3166ac c3166ac, android.app.Activity activity) {
        this.f31962a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3070Zb
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f31962a);
    }
}
