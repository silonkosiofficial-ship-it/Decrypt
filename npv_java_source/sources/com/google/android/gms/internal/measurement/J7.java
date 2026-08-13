package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class J7 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f40549E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f40550F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.G7 f40551G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7(com.google.android.gms.internal.measurement.G7 g10, boolean z6, boolean z10) {
        super("log");
        this.f40551G = g10;
        this.f40549E = z6;
        this.f40550F = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        java.util.List arrayList;
        com.google.android.gms.internal.measurement.K7 k10;
        com.google.android.gms.internal.measurement.AbstractC6152w2.k("log", 1, list);
        if (list.size() == 1) {
            this.f40551G.f40524E.a(com.google.android.gms.internal.measurement.H7.INFO, c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e(), java.util.Collections.emptyList(), this.f40549E, this.f40550F);
        } else {
            com.google.android.gms.internal.measurement.H7 h7E = com.google.android.gms.internal.measurement.H7.e(com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()));
            java.lang.String strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).e();
            if (list.size() == 2) {
                k10 = this.f40551G.f40524E;
                arrayList = java.util.Collections.emptyList();
            } else {
                arrayList = new java.util.ArrayList();
                for (int i6 = 2; i6 < java.lang.Math.min(list.size(), 5); i6++) {
                    arrayList.add(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(i6)).e());
                }
                k10 = this.f40551G.f40524E;
            }
            k10.a(h7E, strE, arrayList, this.f40549E, this.f40550F);
        }
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }
}
