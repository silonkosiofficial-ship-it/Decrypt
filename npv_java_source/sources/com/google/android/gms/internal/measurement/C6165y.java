package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6165y extends com.google.android.gms.internal.measurement.A {
    public C6165y() {
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_AND);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_LEFT_SHIFT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_NOT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_OR);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_RIGHT_SHIFT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f40431a.add(com.google.android.gms.internal.measurement.Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        switch (com.google.android.gms.internal.measurement.B.f40447a[com.google.android.gms.internal.measurement.AbstractC6152w2.c(str).ordinal()]) {
            case 1:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_AND, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()) & com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue())));
            case 2:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_LEFT_SHIFT, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()) << ((int) (com.google.android.gms.internal.measurement.AbstractC6152w2.m(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()) & 31))));
            case 3:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_NOT, 1, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(~com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue())));
            case 4:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_OR, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()) | com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue())));
            case 5:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()) >> ((int) (com.google.android.gms.internal.measurement.AbstractC6152w2.m(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()) & 31))));
            case 6:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.AbstractC6152w2.m(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()) >>> ((int) (com.google.android.gms.internal.measurement.AbstractC6152w2.m(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue()) & 31))));
            case 7:
                com.google.android.gms.internal.measurement.AbstractC6152w2.f(com.google.android.gms.internal.measurement.Z.BITWISE_XOR, 2, list);
                return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(0)).d().doubleValue()) ^ com.google.android.gms.internal.measurement.AbstractC6152w2.i(c5963a3.b((com.google.android.gms.internal.measurement.InterfaceC6117s) list.get(1)).d().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
