package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3942hg implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36108d;

    public C3942hg(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f36105a = interfaceC5078rz0;
        this.f36106b = interfaceC5078rz1;
        this.f36107c = interfaceC5078rz2;
        this.f36108d = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C3832gg b() {
        return new com.google.android.gms.internal.ads.C3832gg((java.util.concurrent.ScheduledExecutorService) this.f36105a.b(), (B3.l0) this.f36106b.b(), (B3.c0) this.f36107c.b(), (com.google.android.gms.internal.ads.C4246kO) this.f36108d.b());
    }
}
