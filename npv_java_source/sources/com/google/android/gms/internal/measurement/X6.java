package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class X6 extends com.google.android.gms.internal.measurement.AbstractC6076n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.InterfaceC6156w6 f40707E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X6(com.google.android.gms.internal.measurement.C6147v5 c6147v5, java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6156w6 interfaceC6156w6) {
        super(str);
        this.f40707E = interfaceC6156w6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6076n
    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        com.google.android.gms.internal.measurement.AbstractC6152w2.g("getValue", 2, list);
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
        java.lang.String strO = this.f40707E.o(interfaceC6117sB.e());
        return strO != null ? new com.google.android.gms.internal.measurement.C6133u(strO) : interfaceC6117sB2;
    }
}
