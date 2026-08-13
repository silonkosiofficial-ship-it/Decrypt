package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends com.google.android.gms.internal.measurement.A {
    public D() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.EQUALS);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.GREATER_THAN);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.GREATER_THAN_EQUALS);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.IDENTITY_EQUALS);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.IDENTITY_NOT_EQUALS);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.LESS_THAN);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.LESS_THAN_EQUALS);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.NOT_EQUALS);
    }

    private static boolean c(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2) {
        com.google.android.gms.internal.measurement.InterfaceC6117s c6049k;
        com.google.android.gms.internal.measurement.InterfaceC6117s c6049k2;
        while (!interfaceC6117s.getClass().equals(interfaceC6117s2.getClass())) {
            if (((interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6173z) || (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6102q)) && ((interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6173z) || (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6102q))) {
                return true;
            }
            boolean z6 = interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6049k;
            if (z6 && (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6133u)) {
                c6049k2 = new com.google.android.gms.internal.measurement.C6049k(interfaceC6117s2.d());
            } else {
                boolean z10 = interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6133u;
                if (z10 && (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6049k)) {
                    c6049k = new com.google.android.gms.internal.measurement.C6049k(interfaceC6117s.d());
                } else if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6022h) {
                    c6049k = new com.google.android.gms.internal.measurement.C6049k(interfaceC6117s.d());
                } else if (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6022h) {
                    c6049k2 = new com.google.android.gms.internal.measurement.C6049k(interfaceC6117s2.d());
                } else if ((z10 || z6) && (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.InterfaceC6067m)) {
                    c6049k2 = new com.google.android.gms.internal.measurement.C6133u(interfaceC6117s2.e());
                } else {
                    if (!(interfaceC6117s instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) || (!(interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6133u) && !(interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6049k))) {
                        return false;
                    }
                    c6049k = new com.google.android.gms.internal.measurement.C6133u(interfaceC6117s.e());
                }
                interfaceC6117s = c6049k;
            }
            interfaceC6117s2 = c6049k2;
        }
        if ((interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6173z) || (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6102q)) {
            return true;
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6049k) {
            return (java.lang.Double.isNaN(interfaceC6117s.d().doubleValue()) || java.lang.Double.isNaN(interfaceC6117s2.d().doubleValue()) || interfaceC6117s.d().doubleValue() != interfaceC6117s2.d().doubleValue()) ? false : true;
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6133u) {
            return interfaceC6117s.e().equals(interfaceC6117s2.e());
        }
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6022h) {
            return interfaceC6117s.f().equals(interfaceC6117s2.f());
        }
        return interfaceC6117s == interfaceC6117s2;
    }

    private static boolean d(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2) {
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
            interfaceC6117s = new com.google.android.gms.internal.measurement.C6133u(interfaceC6117s.e());
        }
        if (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
            interfaceC6117s2 = new com.google.android.gms.internal.measurement.C6133u(interfaceC6117s2.e());
        }
        if ((interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6133u) && (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6133u)) {
            return interfaceC6117s.e().compareTo(interfaceC6117s2.e()) < 0;
        }
        double dDoubleValue = interfaceC6117s.d().doubleValue();
        double dDoubleValue2 = interfaceC6117s2.d().doubleValue();
        return (java.lang.Double.isNaN(dDoubleValue) || java.lang.Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || java.lang.Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s2) {
        if (interfaceC6117s instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
            interfaceC6117s = new com.google.android.gms.internal.measurement.C6133u(interfaceC6117s.e());
        }
        if (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
            interfaceC6117s2 = new com.google.android.gms.internal.measurement.C6133u(interfaceC6117s2.e());
        }
        return (((interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6133u) && (interfaceC6117s2 instanceof com.google.android.gms.internal.measurement.C6133u)) || !(java.lang.Double.isNaN(interfaceC6117s.d().doubleValue()) || java.lang.Double.isNaN(interfaceC6117s2.d().doubleValue()))) && !d(interfaceC6117s2, interfaceC6117s);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        boolean zC;
        boolean zH;
        com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.AbstractC6152w2.c(str), 2, list);
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0));
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB2 = c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1));
        switch (com.google.android.gms.internal.measurement.G.f40508a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()]) {
            case 1:
                zC = c(interfaceC6117sB, interfaceC6117sB2);
                return zC ? com.google.android.gms.internal.measurement.InterfaceC6117s.f41179t : com.google.android.gms.internal.measurement.InterfaceC6117s.f41180u;
            case 2:
                zC = d(interfaceC6117sB2, interfaceC6117sB);
                if (zC) {
                }
            case 3:
                zC = e(interfaceC6117sB2, interfaceC6117sB);
                if (zC) {
                }
            case 4:
                zC = com.google.android.gms.internal.measurement.AbstractC6152w2.h(interfaceC6117sB, interfaceC6117sB2);
                if (zC) {
                }
            case 5:
                zH = com.google.android.gms.internal.measurement.AbstractC6152w2.h(interfaceC6117sB, interfaceC6117sB2);
                zC = !zH;
                if (zC) {
                }
            case 6:
                zC = d(interfaceC6117sB, interfaceC6117sB2);
                if (zC) {
                }
            case 7:
                zC = e(interfaceC6117sB, interfaceC6117sB2);
                if (zC) {
                }
            case 8:
                zH = c(interfaceC6117sB, interfaceC6117sB2);
                zC = !zH;
                if (zC) {
                }
            default:
                return super.a(str);
        }
    }
}
