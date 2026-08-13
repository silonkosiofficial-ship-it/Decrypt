package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4148ja implements com.google.android.gms.internal.ads.InterfaceC4918qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.app.Activity f36695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f36696b;

    C4148ja(com.google.android.gms.internal.ads.C5027ra c5027ra, android.app.Activity activity, android.os.Bundle bundle) {
        this.f36695a = activity;
        this.f36696b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4918qa
    public final void a(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f36695a, this.f36696b);
    }
}
