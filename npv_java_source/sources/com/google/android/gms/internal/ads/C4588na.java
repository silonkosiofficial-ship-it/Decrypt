package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4588na implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f37615a;

    C4588na(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity) {
        this.f37615a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f37615a);
    }
}
