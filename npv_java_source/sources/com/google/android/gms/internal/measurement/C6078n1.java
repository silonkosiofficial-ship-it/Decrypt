package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6078n1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f41046G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f41047H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6078n1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str) {
        super(c5997e1);
        this.f41046G = str;
        this.f41047H = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    final void a() {
        ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f41047H.f40867i)).endAdUnitExposure(this.f41046G, this.f40869D);
    }
}
