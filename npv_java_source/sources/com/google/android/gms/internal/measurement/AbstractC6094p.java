package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC6094p {
    public static com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.InterfaceC6067m interfaceC6067m, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        if (interfaceC6067m.E(interfaceC6117s.e())) {
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sO = interfaceC6067m.o(interfaceC6117s.e());
            if (interfaceC6117sO instanceof com.google.android.gms.internal.measurement.AbstractC6076n) {
                return ((com.google.android.gms.internal.measurement.AbstractC6076n) interfaceC6117sO).a(c5963a3, list);
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a function", interfaceC6117s.e()));
        }
        if (!"hasOwnProperty".equals(interfaceC6117s.e())) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Object has no function %s", interfaceC6117s.e()));
        }
        com.google.android.gms.internal.measurement.AbstractC6152w2.g("hasOwnProperty", 1, list);
        return interfaceC6067m.E(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).e()) ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t : com.google.android.gms.internal.measurement.InterfaceC6117s.f41180u;
    }

    public static java.util.Iterator b(java.util.Map map) {
        return new com.google.android.gms.internal.measurement.C6085o(map.keySet().iterator());
    }
}
