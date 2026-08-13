package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4368la implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f37185a;

    C4368la(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity) {
        this.f37185a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f37185a);
    }
}
