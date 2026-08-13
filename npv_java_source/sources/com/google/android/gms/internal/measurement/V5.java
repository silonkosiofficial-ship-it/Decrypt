package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class V5 extends com.google.android.gms.internal.measurement.r {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5986d f40694D;

    public V5(com.google.android.gms.internal.measurement.C5986d c5986d) {
        this.f40694D = c5986d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("getEventName", 0, list);
                return new com.google.android.gms.internal.measurement.C6133u(this.f40694D.d().e());
            case "getTimestamp":
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("getTimestamp", 0, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(this.f40694D.d().a()));
            case "getParamValue":
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("getParamValue", 1, list);
                return com.google.android.gms.internal.measurement.AbstractC5973b4.b(this.f40694D.d().b(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()));
            case "getParams":
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("getParams", 0, list);
                java.util.Map mapG = this.f40694D.d().g();
                com.google.android.gms.internal.measurement.r rVar = new com.google.android.gms.internal.measurement.r();
                for (java.lang.String str2 : mapG.keySet()) {
                    rVar.s(str2, com.google.android.gms.internal.measurement.AbstractC5973b4.b(mapG.get(str2)));
                }
                return rVar;
            case "setParamValue":
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("setParamValue", 2, list);
                java.lang.String strE = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e();
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                this.f40694D.d().d(strE, com.google.android.gms.internal.measurement.AbstractC6152w2.d(interfaceC6117sB));
                return interfaceC6117sB;
            case "setEventName":
                com.google.android.gms.internal.measurement.AbstractC6152w2.g("setEventName", 1, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                if (com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o.equals(interfaceC6117sB2) || com.google.android.gms.internal.measurement.InterfaceC6117s.f41175p.equals(interfaceC6117sB2)) {
                    throw new java.lang.IllegalArgumentException("Illegal event name");
                }
                this.f40694D.d().f(interfaceC6117sB2.e());
                return new com.google.android.gms.internal.measurement.C6133u(interfaceC6117sB2.e());
            default:
                return super.n(str, c5963a3, list);
        }
    }
}
