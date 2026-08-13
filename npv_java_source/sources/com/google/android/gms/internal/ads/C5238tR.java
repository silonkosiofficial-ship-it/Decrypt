package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5238tR implements com.google.android.gms.internal.ads.InterfaceC3571eE {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f38944C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4840pq f38945D;

    C5238tR(android.content.Context context, com.google.android.gms.internal.ads.C4840pq c4840pq) {
        this.f38944C = context;
        this.f38945D = c4840pq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void B(com.google.android.gms.internal.ads.C2730Po c2730Po) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3571eE
    public final void w0(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        if (android.text.TextUtils.isEmpty(c3558e70.f34899b.f34448b.f32117e)) {
            return;
        }
        this.f38945D.m(this.f38944C, c3558e70.f34898a.f34012a.f37511d);
        this.f38945D.i(this.f38944C, c3558e70.f34899b.f34448b.f32117e);
    }
}
