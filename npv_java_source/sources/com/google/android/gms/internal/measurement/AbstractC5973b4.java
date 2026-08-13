package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5973b4 {
    public static com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.D2 d6) {
        if (d6 == null) {
            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
        }
        int i6 = com.google.android.gms.internal.measurement.B3.f40452a[d6.G().ordinal()];
        if (i6 == 1) {
            return d6.O() ? new com.google.android.gms.internal.measurement.C6133u(d6.J()) : com.google.android.gms.internal.measurement.InterfaceC6117s.f41181v;
        }
        if (i6 == 2) {
            return d6.N() ? new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(d6.F())) : new com.google.android.gms.internal.measurement.C6049k(null);
        }
        if (i6 == 3) {
            return d6.M() ? new com.google.android.gms.internal.measurement.C6022h(java.lang.Boolean.valueOf(d6.L())) : new com.google.android.gms.internal.measurement.C6022h(null);
        }
        if (i6 != 4) {
            if (i6 == 5) {
                throw new java.lang.IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new java.lang.IllegalStateException("Invalid entity: " + java.lang.String.valueOf(d6));
        }
        java.util.List listK = d6.K();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(a((com.google.android.gms.internal.measurement.D2) it.next()));
        }
        return new com.google.android.gms.internal.measurement.C6141v(d6.I(), arrayList);
    }

    public static com.google.android.gms.internal.measurement.InterfaceC6117s b(java.lang.Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.InterfaceC6117s.f41175p;
        }
        if (obj instanceof java.lang.String) {
            return new com.google.android.gms.internal.measurement.C6133u((java.lang.String) obj);
        }
        if (obj instanceof java.lang.Double) {
            return new com.google.android.gms.internal.measurement.C6049k((java.lang.Double) obj);
        }
        if (obj instanceof java.lang.Long) {
            return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(((java.lang.Long) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Integer) {
            return new com.google.android.gms.internal.measurement.C6049k(java.lang.Double.valueOf(((java.lang.Integer) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Boolean) {
            return new com.google.android.gms.internal.measurement.C6022h((java.lang.Boolean) obj);
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.C6013g c6013g = new com.google.android.gms.internal.measurement.C6013g();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                c6013g.M(b(it.next()));
            }
            return c6013g;
        }
        com.google.android.gms.internal.measurement.r rVar = new com.google.android.gms.internal.measurement.r();
        java.util.Map map = (java.util.Map) obj;
        for (java.lang.Object string : map.keySet()) {
            com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof java.lang.String)) {
                    string = string.toString();
                }
                rVar.s((java.lang.String) string, interfaceC6117sB);
            }
        }
        return rVar;
    }
}
