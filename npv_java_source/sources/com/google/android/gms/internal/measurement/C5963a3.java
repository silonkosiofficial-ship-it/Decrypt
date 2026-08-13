package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5963a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5963a3 f40786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.E f40787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.Map f40788c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.util.Map f40789d = new java.util.HashMap();

    public C5963a3(com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.E e6) {
        this.f40786a = c5963a3;
        this.f40787b = e6;
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C6013g c6013g) {
        com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117sA = com.google.android.gms.internal.measurement.InterfaceC6117s.f41174o;
        java.util.Iterator itS = c6013g.S();
        while (itS.hasNext()) {
            interfaceC6117sA = this.f40787b.a(this, c6013g.C(((java.lang.Integer) itS.next()).intValue()));
            if (interfaceC6117sA instanceof com.google.android.gms.internal.measurement.C6058l) {
                break;
            }
        }
        return interfaceC6117sA;
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s b(com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        return this.f40787b.a(this, interfaceC6117s);
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s c(java.lang.String str) {
        com.google.android.gms.internal.measurement.C5963a3 c5963a3 = this;
        while (!c5963a3.f40788c.containsKey(str)) {
            c5963a3 = c5963a3.f40786a;
            if (c5963a3 == null) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not defined", str));
            }
        }
        return (com.google.android.gms.internal.measurement.InterfaceC6117s) c5963a3.f40788c.get(str);
    }

    public final com.google.android.gms.internal.measurement.C5963a3 d() {
        return new com.google.android.gms.internal.measurement.C5963a3(this, this.f40787b);
    }

    public final void e(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        if (this.f40789d.containsKey(str)) {
            return;
        }
        if (interfaceC6117s == null) {
            this.f40788c.remove(str);
        } else {
            this.f40788c.put(str, interfaceC6117s);
        }
    }

    public final void f(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        e(str, interfaceC6117s);
        this.f40789d.put(str, java.lang.Boolean.TRUE);
    }

    public final boolean g(java.lang.String str) {
        com.google.android.gms.internal.measurement.C5963a3 c5963a3 = this;
        while (!c5963a3.f40788c.containsKey(str)) {
            c5963a3 = c5963a3.f40786a;
            if (c5963a3 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        com.google.android.gms.internal.measurement.C5963a3 c5963a3;
        com.google.android.gms.internal.measurement.C5963a3 c5963a4 = this;
        while (!c5963a4.f40788c.containsKey(str) && (c5963a3 = c5963a4.f40786a) != null && c5963a3.g(str)) {
            c5963a4 = c5963a4.f40786a;
        }
        if (c5963a4.f40789d.containsKey(str)) {
            return;
        }
        if (interfaceC6117s == null) {
            c5963a4.f40788c.remove(str);
        } else {
            c5963a4.f40788c.put(str, interfaceC6117s);
        }
    }
}
