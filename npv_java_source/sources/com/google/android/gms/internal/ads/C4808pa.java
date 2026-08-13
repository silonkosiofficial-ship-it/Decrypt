package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4808pa implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f38025a;

    C4808pa(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity) {
        this.f38025a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f38025a);
    }
}
