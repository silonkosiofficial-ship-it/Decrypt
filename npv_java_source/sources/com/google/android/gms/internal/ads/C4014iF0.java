package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4014iF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f36244a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36246c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4232kF0 f36249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ZE0 f36250g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4450mE0 f36245b = com.google.android.gms.internal.ads.C4450mE0.f37299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3684fF0 f36247d = com.google.android.gms.internal.ads.InterfaceC3684fF0.f35306a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3794gF0 f36248e = com.google.android.gms.internal.ads.InterfaceC3794gF0.f35574a;

    public C4014iF0(android.content.Context context) {
        this.f36244a = context;
    }

    public final com.google.android.gms.internal.ads.EF0 d() {
        com.google.android.gms.internal.ads.LC.f(!this.f36246c);
        this.f36246c = true;
        if (this.f36249f == null) {
            this.f36249f = new com.google.android.gms.internal.ads.C4232kF0(new com.google.android.gms.internal.ads.InterfaceC2954Vu[0]);
        }
        if (this.f36250g == null) {
            this.f36250g = new com.google.android.gms.internal.ads.ZE0(this.f36244a);
        }
        return new com.google.android.gms.internal.ads.EF0(this, null);
    }
}
