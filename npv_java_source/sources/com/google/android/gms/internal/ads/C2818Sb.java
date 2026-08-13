package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2818Sb implements com.google.android.gms.internal.ads.InterfaceC3070Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f31718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f31719b;

    C2818Sb(com.google.android.gms.internal.ads.C3166ac c3166ac, android.app.Activity activity, android.os.Bundle bundle) {
        this.f31718a = activity;
        this.f31719b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3070Zb
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f31718a, this.f31719b);
    }
}
