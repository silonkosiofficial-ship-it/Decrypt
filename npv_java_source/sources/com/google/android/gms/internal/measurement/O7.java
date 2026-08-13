package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class O7 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.X4 f40634E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Map f40635F;

    public O7(com.google.android.gms.internal.measurement.X4 x6) {
        super("require");
        this.f40635F = new java.util.HashMap();
        this.f40634E = x6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        com.google.android.gms.internal.measurement.AbstractC6152w2.g("require", 1, list);
        java.lang.String strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
        if (this.f40635F.containsKey(strE)) {
            return (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f40635F.get(strE);
        }
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = this.f40634E.a(strE);
        if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.AbstractC6076n) {
            this.f40635F.put(strE, (com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sA);
        }
        return interfaceC6117sA;
    }
}
