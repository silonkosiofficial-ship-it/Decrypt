package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class L7 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C5968b f40570E;

    public L7(com.google.android.gms.internal.measurement.C5968b c5968b) {
        super("internal.registerCallback");
        this.f40570E = c5968b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        com.google.android.gms.internal.measurement.AbstractC6152w2.g(this.f41044C, 3, list);
        java.lang.String strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
        if (!(interfaceC6117sB instanceof com.google.android.gms.internal.measurement.C6125t)) {
            throw new java.lang.IllegalArgumentException("Invalid callback type");
        }
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2));
        if (!(interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.r)) {
            throw new java.lang.IllegalArgumentException("Invalid callback params");
        }
        com.google.android.gms.internal.measurement.r rVar = (com.google.android.gms.internal.measurement.r) interfaceC6117sB2;
        if (!rVar.E("type")) {
            throw new java.lang.IllegalArgumentException("Undefined rule type");
        }
        this.f40570E.c(strE, rVar.E("priority") ? com.google.android.gms.internal.measurement.AbstractC6152w2.i(rVar.o("priority").d().doubleValue()) : 1000, (com.google.android.gms.internal.measurement.C6125t) interfaceC6117sB, rVar.o("type").e());
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }
}
