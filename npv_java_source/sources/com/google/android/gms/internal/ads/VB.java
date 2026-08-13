package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class VB implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32439c;

    public VB(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f32437a = interfaceC5078rz0;
        this.f32438b = interfaceC5078rz1;
        this.f32439c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        final android.content.Context context = (android.content.Context) this.f32437a.b();
        final p224w3.a aVarA = ((com.google.android.gms.internal.ads.C4740ov) this.f32438b).a();
        final com.google.android.gms.internal.ads.C4546n70 c4546n70A = ((com.google.android.gms.internal.ads.C5434vC) this.f32439c).a();
        return new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.UB
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.R60 r60 = (com.google.android.gms.internal.ads.R60) obj;
                p214v3.C7273v c7273v = new p214v3.C7273v(context);
                c7273v.p(r60.f31135B);
                c7273v.q(r60.f31136C.toString());
                c7273v.o(aVarA.f56217C);
                c7273v.n(c4546n70A.f37513f);
                return c7273v;
            }
        };
    }
}
