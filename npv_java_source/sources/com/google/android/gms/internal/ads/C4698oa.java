package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4698oa implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f37835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f37836b;

    C4698oa(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity, android.os.Bundle bundle) {
        this.f37835a = activity;
        this.f37836b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f37835a, this.f37836b);
    }
}
