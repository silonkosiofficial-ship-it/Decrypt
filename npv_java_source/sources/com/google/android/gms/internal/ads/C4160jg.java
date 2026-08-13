package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4160jg implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36715c;

    public C4160jg(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f36713a = interfaceC5078rz0;
        this.f36714b = interfaceC5078rz1;
        this.f36715c = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.C4051ig(((com.google.android.gms.internal.ads.C3204av) this.f36713a).a(), (java.util.concurrent.ScheduledExecutorService) this.f36714b.b(), com.google.android.gms.internal.ads.C4632nw.a(), (com.google.android.gms.internal.ads.Q90) this.f36715c.b());
    }
}
