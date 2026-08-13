package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends com.google.android.gms.internal.measurement.A {
    protected J() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.AND);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.NOT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        int i6 = com.google.android.gms.internal.measurement.M.f40571a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()];
        if (i6 == 1) {
            com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.AND, 2, list);
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
            if (!interfaceC6117sB.f().booleanValue()) {
                return interfaceC6117sB;
            }
        } else {
            if (i6 == 2) {
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.NOT, 1, list);
                return new com.google.android.gms.internal.measurement.C6022h(java.lang.Boolean.valueOf(!c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).f().booleanValue()));
            }
            if (i6 != 3) {
                return super.a(str);
            }
            com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.OR, 2, list);
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
            if (interfaceC6117sB2.f().booleanValue()) {
                return interfaceC6117sB2;
            }
        }
        return c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
    }
}
