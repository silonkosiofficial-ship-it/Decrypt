package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4180jq extends com.google.android.gms.internal.ads.AbstractC4950qq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V3.f f36740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4309kz0 f36748j;

    /* synthetic */ C4180jq(android.content.Context context, V3.f fVar, p214v3.InterfaceC7268s0 interfaceC7268s0, com.google.android.gms.internal.ads.C4840pq c4840pq, com.google.android.gms.internal.ads.AbstractC4290kq abstractC4290kq) {
        this.f36740b = fVar;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A = com.google.android.gms.internal.ads.C3322bz0.a(context);
        this.f36741c = interfaceC3213az0A;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A2 = com.google.android.gms.internal.ads.C3322bz0.a(interfaceC7268s0);
        this.f36742d = interfaceC3213az0A2;
        this.f36743e = com.google.android.gms.internal.ads.Zy0.c(new com.google.android.gms.internal.ads.C3413cq(interfaceC3213az0A, interfaceC3213az0A2));
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A3 = com.google.android.gms.internal.ads.C3322bz0.a(fVar);
        this.f36744f = interfaceC3213az0A3;
        com.google.android.gms.internal.ads.InterfaceC3213az0 interfaceC3213az0A4 = com.google.android.gms.internal.ads.C3322bz0.a(c4840pq);
        this.f36745g = interfaceC3213az0A4;
        com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0C = com.google.android.gms.internal.ads.Zy0.c(new com.google.android.gms.internal.ads.C3632eq(interfaceC3213az0A3, interfaceC3213az0A2, interfaceC3213az0A4));
        this.f36746h = interfaceC4309kz0C;
        com.google.android.gms.internal.ads.C3962hq c3962hq = new com.google.android.gms.internal.ads.C3962hq(interfaceC3213az0A3, interfaceC4309kz0C);
        this.f36747i = c3962hq;
        this.f36748j = com.google.android.gms.internal.ads.Zy0.c(new com.google.android.gms.internal.ads.C5499vq(interfaceC3213az0A, c3962hq));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4950qq
    final com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3304bq a() {
        return (com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3304bq) this.f36743e.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4950qq
    final com.google.android.gms.internal.ads.C3742fq b() {
        return new com.google.android.gms.internal.ads.C3742fq(this.f36740b, (com.google.android.gms.internal.ads.C3522dq) this.f36746h.b());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4950qq
    final com.google.android.gms.internal.ads.C5389uq c() {
        return (com.google.android.gms.internal.ads.C5389uq) this.f36748j.b();
    }
}
