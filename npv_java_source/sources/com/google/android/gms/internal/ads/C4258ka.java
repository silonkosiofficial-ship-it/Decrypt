package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4258ka implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f36981a;

    C4258ka(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity) {
        this.f36981a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f36981a);
    }
}
