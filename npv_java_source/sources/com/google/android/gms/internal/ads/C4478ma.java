package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4478ma implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f37363a;

    C4478ma(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity) {
        this.f37363a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f37363a);
    }
}
