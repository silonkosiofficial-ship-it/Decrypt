package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public class r implements com.google.android.gms.internal.measurement.InterfaceC6067m, com.google.android.gms.internal.measurement.InterfaceC6117s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f41161C = new java.util.HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final boolean E(java.lang.String str) {
        return this.f41161C.containsKey(str);
    }

    public final java.util.List a() {
        return new java.util.ArrayList(this.f41161C.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        java.util.Map map;
        java.lang.String str;
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sC;
        com.google.android.gms.internal.measurement.r rVar = new com.google.android.gms.internal.measurement.r();
        for (java.util.Map.Entry entry : this.f41161C.entrySet()) {
            if (entry.getValue() instanceof com.google.android.gms.internal.measurement.InterfaceC6067m) {
                map = rVar.f41161C;
                str = (java.lang.String) entry.getKey();
                interfaceC6117sC = (com.google.android.gms.internal.measurement.InterfaceC6117s) entry.getValue();
            } else {
                map = rVar.f41161C;
                str = (java.lang.String) entry.getKey();
                interfaceC6117sC = ((com.google.android.gms.internal.measurement.InterfaceC6117s) entry.getValue()).c();
            }
            map.put(str, interfaceC6117sC);
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        return "[object Object]";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.r) {
            return this.f41161C.equals(((com.google.android.gms.internal.measurement.r) obj).f41161C);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return com.google.android.gms.internal.measurement.AbstractC6094p.b(this.f41161C);
    }

    public int hashCode() {
        return this.f41161C.hashCode();
    }

    public com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        return "toString".equals(str) ? new com.google.android.gms.internal.measurement.C6133u(toString()) : com.google.android.gms.internal.measurement.AbstractC6094p.a(this, new com.google.android.gms.internal.measurement.C6133u(str), c5963a3, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final com.google.android.gms.internal.measurement.InterfaceC6117s o(java.lang.String str) {
        return this.f41161C.containsKey(str) ? (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f41161C.get(str) : com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final void s(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (interfaceC6117s == null) {
            this.f41161C.remove(str);
        } else {
            this.f41161C.put(str, interfaceC6117s);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        if (!this.f41161C.isEmpty()) {
            for (java.lang.String str : this.f41161C.keySet()) {
                sb.append(java.lang.String.format("%s: %s,", str, this.f41161C.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
