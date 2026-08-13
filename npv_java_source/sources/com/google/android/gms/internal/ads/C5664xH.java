package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5664xH implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39819d;

    public C5664xH(com.google.android.gms.internal.ads.C4785pH c4785pH, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f39816a = interfaceC5078rz0;
        this.f39817b = interfaceC5078rz1;
        this.f39818c = interfaceC5078rz2;
        this.f39819d = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        final android.content.Context context = (android.content.Context) this.f39816a.b();
        final p224w3.a aVarA = ((com.google.android.gms.internal.ads.C4740ov) this.f39817b).a();
        final com.google.android.gms.internal.ads.R60 r60A = ((com.google.android.gms.internal.ads.C5650xA) this.f39818c).a();
        final com.google.android.gms.internal.ads.C4546n70 c4546n70A = ((com.google.android.gms.internal.ads.C5434vC) this.f39819d).a();
        return new com.google.android.gms.internal.ads.EG(new com.google.android.gms.internal.ads.InterfaceC5326uD() { // from class: com.google.android.gms.internal.ads.nH
            @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
            public final void u() {
                p214v3.C7280z c7280zW = p174r3.v.w();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.C4546n70 c4546n70 = c4546n70A;
                c7280zW.n(context2, aVarA.f56217C, r60A.f31136C.toString(), c4546n70.f37513f);
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
    }
}
