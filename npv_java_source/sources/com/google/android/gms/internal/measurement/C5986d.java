package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5986d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C5995e f40823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.C5995e f40824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.List f40825c;

    public C5986d() {
        this.f40823a = new com.google.android.gms.internal.measurement.C5995e("", 0L, null);
        this.f40824b = new com.google.android.gms.internal.measurement.C5995e("", 0L, null);
        this.f40825c = new java.util.ArrayList();
    }

    private C5986d(com.google.android.gms.internal.measurement.C5995e c5995e) {
        this.f40823a = c5995e;
        this.f40824b = (com.google.android.gms.internal.measurement.C5995e) c5995e.clone();
        this.f40825c = new java.util.ArrayList();
    }

    public final com.google.android.gms.internal.measurement.C5995e a() {
        return this.f40823a;
    }

    public final void b(com.google.android.gms.internal.measurement.C5995e c5995e) {
        this.f40823a = c5995e;
        this.f40824b = (com.google.android.gms.internal.measurement.C5995e) c5995e.clone();
        this.f40825c.clear();
    }

    public final void c(java.lang.String str, long j6, java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.lang.String str2 : map.keySet()) {
            map2.put(str2, com.google.android.gms.internal.measurement.C5995e.c(str2, this.f40823a.b(str2), map.get(str2)));
        }
        this.f40825c.add(new com.google.android.gms.internal.measurement.C5995e(str, j6, map2));
    }

    public final /* synthetic */ java.lang.Object clone() {
        com.google.android.gms.internal.measurement.C5986d c5986d = new com.google.android.gms.internal.measurement.C5986d((com.google.android.gms.internal.measurement.C5995e) this.f40823a.clone());
        java.util.Iterator it = this.f40825c.iterator();
        while (it.hasNext()) {
            c5986d.f40825c.add((com.google.android.gms.internal.measurement.C5995e) ((com.google.android.gms.internal.measurement.C5995e) it.next()).clone());
        }
        return c5986d;
    }

    public final com.google.android.gms.internal.measurement.C5995e d() {
        return this.f40824b;
    }

    public final void e(com.google.android.gms.internal.measurement.C5995e c5995e) {
        this.f40824b = c5995e;
    }

    public final java.util.List f() {
        return this.f40825c;
    }
}
