package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5988d1 extends com.google.android.gms.internal.measurement.C5997e1.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40826G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final /* synthetic */ java.lang.String f40827H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final /* synthetic */ android.content.Context f40828I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final /* synthetic */ android.os.Bundle f40829J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.C5997e1 f40830K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5988d1(com.google.android.gms.internal.measurement.C5997e1 c5997e1, java.lang.String str, java.lang.String str2, android.content.Context context, android.os.Bundle bundle) {
        super(c5997e1);
        this.f40826G = str;
        this.f40827H = str2;
        this.f40828I = context;
        this.f40829J = bundle;
        this.f40830K = c5997e1;
    }

    @Override // com.google.android.gms.internal.measurement.C5997e1.a
    public final void a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            if (this.f40830K.E(this.f40826G, this.f40827H)) {
                str3 = this.f40827H;
                str2 = this.f40826G;
                str = this.f40830K.f40859a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Q3.AbstractC1477p.l(this.f40828I);
            com.google.android.gms.internal.measurement.C5997e1 c5997e1 = this.f40830K;
            c5997e1.f40867i = c5997e1.d(this.f40828I, true);
            if (this.f40830K.f40867i == null) {
                java.lang.String unused = this.f40830K.f40859a;
                return;
            }
            int iA = com.google.android.gms.dynamite.DynamiteModule.a(this.f40828I, "com.google.android.gms.measurement.dynamite");
            int iC = com.google.android.gms.dynamite.DynamiteModule.c(this.f40828I, "com.google.android.gms.measurement.dynamite");
            ((com.google.android.gms.internal.measurement.P0) Q3.AbstractC1477p.l(this.f40830K.f40867i)).initialize(X3.b.c2(this.f40828I), new com.google.android.gms.internal.measurement.C5979c1(106000L, java.lang.Math.max(iA, iC), iC < iA, str, str2, str3, this.f40829J, p085i4.n.a(this.f40828I)), this.f40868C);
        } catch (java.lang.Exception e6) {
            this.f40830K.r(e6, true, false);
        }
    }
}
