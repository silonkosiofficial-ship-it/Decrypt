package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4071iq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f36358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V3.f f36359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p214v3.InterfaceC7268s0 f36360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4840pq f36361d;

    /* synthetic */ C4071iq(com.google.android.gms.internal.ads.AbstractC4290kq abstractC4290kq) {
    }

    public final com.google.android.gms.internal.ads.C4071iq a(p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f36360c = interfaceC7268s0;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4071iq b(android.content.Context context) {
        context.getClass();
        this.f36358a = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4071iq c(V3.f fVar) {
        fVar.getClass();
        this.f36359b = fVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.C4071iq d(com.google.android.gms.internal.ads.C4840pq c4840pq) {
        this.f36361d = c4840pq;
        return this;
    }

    public final com.google.android.gms.internal.ads.AbstractC4950qq e() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f36358a, android.content.Context.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f36359b, V3.f.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f36360c, p214v3.InterfaceC7268s0.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f36361d, com.google.android.gms.internal.ads.C4840pq.class);
        return new com.google.android.gms.internal.ads.C4180jq(this.f36358a, this.f36359b, this.f36360c, this.f36361d, null);
    }
}
