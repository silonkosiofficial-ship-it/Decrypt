package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2386Gg0 extends com.google.android.gms.internal.ads.AbstractC2681Og0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC4271kg0 f27865H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2386Gg0(com.google.android.gms.internal.ads.C2423Hg0 c2423Hg0, com.google.android.gms.internal.ads.C2755Qg0 c2755Qg0, java.lang.CharSequence charSequence, com.google.android.gms.internal.ads.AbstractC4271kg0 abstractC4271kg0) {
        super(c2755Qg0, charSequence);
        this.f27865H = abstractC4271kg0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2681Og0
    final int c(int i6) {
        return i6 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2681Og0
    final int d(int i6) {
        java.lang.CharSequence charSequence = this.f30548E;
        int length = charSequence.length();
        com.google.android.gms.internal.ads.AbstractC2164Ag0.b(i6, length, "index");
        while (i6 < length) {
            if (this.f27865H.a(charSequence.charAt(i6))) {
                return i6;
            }
            i6++;
        }
        return -1;
    }
}
