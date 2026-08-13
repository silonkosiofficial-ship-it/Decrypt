package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3870gz implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3030Xy f35959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f35960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f35961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f35962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f35963e;

    public C3870gz(com.google.android.gms.internal.ads.C3030Xy c3030Xy, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f35959a = c3030Xy;
        this.f35960b = interfaceC5078rz0;
        this.f35961c = interfaceC5078rz1;
        this.f35962d = interfaceC5078rz2;
        this.f35963e = interfaceC5078rz3;
    }

    public static com.google.android.gms.internal.ads.EG a(com.google.android.gms.internal.ads.C3030Xy c3030Xy, final android.content.Context context, final p224w3.a aVar, final com.google.android.gms.internal.ads.R60 r60, final com.google.android.gms.internal.ads.C4546n70 c4546n70) {
        return new com.google.android.gms.internal.ads.EG(new com.google.android.gms.internal.ads.InterfaceC5326uD() { // from class: com.google.android.gms.internal.ads.Vy
            @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
            public final void u() {
                p214v3.C7280z c7280zW = p174r3.v.w();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.C4546n70 c4546n71 = c4546n70;
                c7280zW.n(context2, aVar.f56217C, r60.f31136C.toString(), c4546n71.f37513f);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return a(this.f35959a, (android.content.Context) this.f35960b.b(), ((com.google.android.gms.internal.ads.C4740ov) this.f35961c).a(), ((com.google.android.gms.internal.ads.C5650xA) this.f35962d).a(), ((com.google.android.gms.internal.ads.C5434vC) this.f35963e).a());
    }
}
