package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ai0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3179ai0 extends com.google.android.gms.internal.ads.AbstractC3177ah0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f34127E;

    C3179ai0(com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0, int i6) {
        super(abstractC3398ci0.size(), i6);
        this.f34127E = abstractC3398ci0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3177ah0
    protected final java.lang.Object b(int i6) {
        return this.f34127E.get(i6);
    }
}
