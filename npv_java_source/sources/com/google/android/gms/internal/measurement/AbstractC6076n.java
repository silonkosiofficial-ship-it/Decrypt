package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6076n implements com.google.android.gms.internal.measurement.InterfaceC6067m, com.google.android.gms.internal.measurement.InterfaceC6117s {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final java.lang.String f41044C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final java.util.Map f41045D = new java.util.HashMap();

    public AbstractC6076n(java.lang.String str) {
        this.f41044C = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final boolean E(java.lang.String str) {
        return this.f41045D.containsKey(str);
    }

    public abstract com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list);

    public final java.lang.String b() {
        return this.f41044C;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public com.google.android.gms.internal.measurement.InterfaceC6117s c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Double d() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.String e() {
        return this.f41044C;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.AbstractC6076n)) {
            return false;
        }
        com.google.android.gms.internal.measurement.AbstractC6076n abstractC6076n = (com.google.android.gms.internal.measurement.AbstractC6076n) obj;
        java.lang.String str = this.f41044C;
        if (str != null) {
            return str.equals(abstractC6076n.f41044C);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.lang.Boolean f() {
        return java.lang.Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final java.util.Iterator g() {
        return com.google.android.gms.internal.measurement.AbstractC6094p.b(this.f41045D);
    }

    public int hashCode() {
        java.lang.String str = this.f41044C;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6117s
    public final com.google.android.gms.internal.measurement.InterfaceC6117s n(java.lang.String str, com.google.android.gms.internal.measurement.C5963a3 c5963a3, java.util.List list) {
        return "toString".equals(str) ? new com.google.android.gms.internal.measurement.C6133u(this.f41044C) : com.google.android.gms.internal.measurement.AbstractC6094p.a(this, new com.google.android.gms.internal.measurement.C6133u(str), c5963a3, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final com.google.android.gms.internal.measurement.InterfaceC6117s o(java.lang.String str) {
        return this.f41045D.containsKey(str) ? (com.google.android.gms.internal.measurement.InterfaceC6117s) this.f41045D.get(str) : com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6067m
    public final void s(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (interfaceC6117s == null) {
            this.f41045D.remove(str);
        } else {
            this.f41045D.put(str, interfaceC6117s);
        }
    }
}
