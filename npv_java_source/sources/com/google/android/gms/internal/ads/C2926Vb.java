package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2926Vb implements com.google.android.gms.internal.ads.InterfaceC3070Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f32522a;

    C2926Vb(com.google.android.gms.internal.ads.C3166ac c3166ac, android.app.Activity activity) {
        this.f32522a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3070Zb
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f32522a);
    }
}
