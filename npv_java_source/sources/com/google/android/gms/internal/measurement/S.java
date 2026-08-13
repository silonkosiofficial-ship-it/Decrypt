package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends com.google.android.gms.internal.measurement.A {
    protected S() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.ADD);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.DIVIDE);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.MODULUS);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.MULTIPLY);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.NEGATE);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.POST_DECREMENT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.POST_INCREMENT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.PRE_DECREMENT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.PRE_INCREMENT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        switch (com.google.android.gms.internal.measurement.V.f40684a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()]) {
            case 1:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.ADD, 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                if (!(interfaceC6117sB instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) && !(interfaceC6117sB instanceof com.google.android.gms.internal.measurement.C6133u) && !(interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) && !(interfaceC6117sB2 instanceof com.google.android.gms.internal.measurement.C6133u)) {
                    return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(interfaceC6117sB.d().doubleValue() + interfaceC6117sB2.d().doubleValue()));
                }
                return new com.google.android.gms.internal.measurement.C6133u(interfaceC6117sB.e() + interfaceC6117sB2.e());
            case 2:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.DIVIDE, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue() / c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()));
            case 3:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.MODULUS, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue() % c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()));
            case 4:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.MULTIPLY, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue() * c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()));
            case 5:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.NEGATE, 1, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str, 2, list);
                com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB3 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
                c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
                return interfaceC6117sB3;
            case 8:
            case 9:
                com.google.android.gms.internal.measurement.AbstractC6152w2.g(str, 1, list);
                return c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
            case 10:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.SUBTRACT, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue() + new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue() * (-1.0d))).d().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
