package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5653xB0 extends com.google.android.gms.internal.ads.AbstractC5775yH0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2764Ql f39799c;

    C5653xB0(com.google.android.gms.internal.ads.C5763yB0 c5763yB0, com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        super(abstractC4942qm);
        this.f39799c = new com.google.android.gms.internal.ads.C2764Ql();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5775yH0, com.google.android.gms.internal.ads.AbstractC4942qm
    public final com.google.android.gms.internal.ads.C4830pl d(int i6, com.google.android.gms.internal.ads.C4830pl c4830pl, boolean z6) {
        com.google.android.gms.internal.ads.C4830pl c4830plD = this.f40027b.d(i6, c4830pl, z6);
        if (this.f40027b.e(c4830plD.f38060c, this.f39799c, 0L).b()) {
            c4830plD.i(c4830pl.f38058a, c4830pl.f38059b, c4830pl.f38060c, c4830pl.f38061d, 0L, com.google.android.gms.internal.ads.C2229Cc.f26255e, true);
        } else {
            c4830plD.f38063f = true;
        }
        return c4830plD;
    }
}
