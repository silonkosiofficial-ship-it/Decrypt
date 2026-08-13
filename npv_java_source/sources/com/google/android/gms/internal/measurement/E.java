package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.Map f40478a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.U f40479b = new com.google.android.gms.internal.measurement.U();

    public E() {
        b(new com.google.android.gms.internal.measurement.C6165y());
        b(new com.google.android.gms.internal.measurement.D());
        b(new com.google.android.gms.internal.measurement.F());
        b(new com.google.android.gms.internal.measurement.J());
        b(new com.google.android.gms.internal.measurement.L());
        b(new com.google.android.gms.internal.measurement.S());
        b(new com.google.android.gms.internal.measurement.X());
    }

    private final void b(com.google.android.gms.internal.measurement.A a6) {
        java.util.Iterator it = a6.f40431a.iterator();
        while (it.hasNext()) {
            this.f40478a.put(((com.google.android.gms.internal.measurement.Z) it.next()).toString(), a6);
        }
    }

    public final com.google.android.gms.internal.measurement.InterfaceC6117s a(com.google.android.gms.internal.measurement.C5963a3 c5963a3, com.google.android.gms.internal.measurement.InterfaceC6117s interfaceC6117s) {
        com.google.android.gms.internal.measurement.AbstractC6152w2.b(c5963a3);
        if (!(interfaceC6117s instanceof com.google.android.gms.internal.measurement.C6141v)) {
            return interfaceC6117s;
        }
        com.google.android.gms.internal.measurement.C6141v c6141v = (com.google.android.gms.internal.measurement.C6141v) interfaceC6117s;
        java.util.ArrayList arrayListB = c6141v.b();
        java.lang.String strA = c6141v.a();
        return (this.f40478a.containsKey(strA) ? (com.google.android.gms.internal.measurement.A) this.f40478a.get(strA) : this.f40479b).b(strA, c5963a3, arrayListB);
    }
}
