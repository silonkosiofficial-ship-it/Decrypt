package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class A4 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5986d f40442E;

    public A4(com.google.android.gms.internal.measurement.C5986d c5986d) {
        super("internal.eventLogger");
        this.f40442E = c5986d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        com.google.android.gms.internal.measurement.AbstractC6152w2.g(this.f41044C, 3, list);
        java.lang.String strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
        long jA = (long) com.google.android.gms.internal.measurement.AbstractC6152w2.a(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue());
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(2));
        this.f40442E.c(strE, jA, interfaceC6117sB instanceof com.google.android.gms.internal.measurement.r ? com.google.android.gms.internal.measurement.AbstractC6152w2.e((com.google.android.gms.internal.measurement.r) interfaceC6117sB) : new java.util.HashMap());
        return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }
}
