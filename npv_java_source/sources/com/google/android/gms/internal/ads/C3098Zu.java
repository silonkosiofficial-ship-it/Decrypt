package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3098Zu implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f33711a;

    public C3098Zu(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f33711a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.pm.ApplicationInfo applicationInfo = ((com.google.android.gms.internal.ads.C3204av) this.f33711a).a().getApplicationInfo();
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(applicationInfo);
        return applicationInfo;
    }
}
