package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ub0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5360ub0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f39179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p224w3.a f39180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f39181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.ClientApi f39182d = new com.google.android.gms.ads.internal.ClientApi();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2945Vl f39183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V3.f f39184f;

    C5360ub0(android.content.Context context, p224w3.a aVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, V3.f fVar) {
        this.f39179a = context;
        this.f39180b = aVar;
        this.f39181c = scheduledExecutorService;
        this.f39184f = fVar;
    }

    private static com.google.android.gms.internal.ads.C2780Ra0 c() {
        return new com.google.android.gms.internal.ads.C2780Ra0(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25721w)).longValue(), 2.0d, ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25731x)).longValue(), 0.2d);
    }

    public final com.google.android.gms.internal.ads.AbstractC5250tb0 a(p184s3.I1 i6, p184s3.InterfaceC7083c0 interfaceC7083c0) {
        p104k3.EnumC6886c enumC6886cE = p104k3.EnumC6886c.e(i6.f54131D);
        if (enumC6886cE == null) {
            return null;
        }
        int iOrdinal = enumC6886cE.ordinal();
        if (iOrdinal == 1) {
            return new com.google.android.gms.internal.ads.C2853Ta0(this.f39182d, this.f39179a, this.f39180b.f56219E, this.f39183e, i6, interfaceC7083c0, this.f39181c, c(), this.f39184f);
        }
        if (iOrdinal == 2) {
            return new com.google.android.gms.internal.ads.C5690xb0(this.f39182d, this.f39179a, this.f39180b.f56219E, this.f39183e, i6, interfaceC7083c0, this.f39181c, c(), this.f39184f);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new com.google.android.gms.internal.ads.C2743Qa0(this.f39182d, this.f39179a, this.f39180b.f56219E, this.f39183e, i6, interfaceC7083c0, this.f39181c, c(), this.f39184f);
    }

    public final void b(com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        this.f39183e = interfaceC2945Vl;
    }
}
