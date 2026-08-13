package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ig0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2460Ig0 extends com.google.android.gms.internal.ads.AbstractC2681Og0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC4381lg0 f28492H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2460Ig0(com.google.android.gms.internal.ads.C2497Jg0 c2497Jg0, com.google.android.gms.internal.ads.C2755Qg0 c2755Qg0, java.lang.CharSequence charSequence, com.google.android.gms.internal.ads.AbstractC4381lg0 abstractC4381lg0) {
        super(c2755Qg0, charSequence);
        this.f28492H = abstractC4381lg0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2681Og0
    public final int c(int i6) {
        return ((com.google.android.gms.internal.ads.C4931qg0) this.f28492H).f38299a.end();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2681Og0
    public final int d(int i6) {
        if (((com.google.android.gms.internal.ads.C4931qg0) this.f28492H).f38299a.find(i6)) {
            return ((com.google.android.gms.internal.ads.C4931qg0) this.f28492H).f38299a.start();
        }
        return -1;
    }
}
