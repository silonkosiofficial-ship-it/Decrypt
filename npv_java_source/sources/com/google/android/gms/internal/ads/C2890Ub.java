package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2890Ub implements com.google.android.gms.internal.ads.InterfaceC3070Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f32237a;

    C2890Ub(com.google.android.gms.internal.ads.C3166ac c3166ac, android.app.Activity activity) {
        this.f32237a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3070Zb
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f32237a);
    }
}
