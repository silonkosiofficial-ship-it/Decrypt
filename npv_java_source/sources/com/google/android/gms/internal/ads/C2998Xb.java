package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2998Xb implements com.google.android.gms.internal.ads.InterfaceC3070Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f33151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f33152b;

    C2998Xb(com.google.android.gms.internal.ads.C3166ac c3166ac, android.app.Activity activity, android.os.Bundle bundle) {
        this.f33151a = activity;
        this.f33152b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3070Zb
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f33151a, this.f33152b);
    }
}
