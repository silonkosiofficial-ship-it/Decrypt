package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4797pP f27355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PM f27356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f27357c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f27358d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27359e;

    FP(com.google.android.gms.internal.ads.C4797pP c4797pP, com.google.android.gms.internal.ads.PM pm) {
        this.f27355a = c4797pP;
        this.f27356b = pm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(java.util.List list) {
        com.google.android.gms.internal.ads.OM omA;
        com.google.android.gms.internal.ads.OM omA2;
        com.google.android.gms.internal.ads.C3956hn c3956hn;
        synchronized (this.f27357c) {
            try {
                if (this.f27359e) {
                    return;
                }
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.ads.C3182ak c3182ak = (com.google.android.gms.internal.ads.C3182ak) it.next();
                    java.lang.String string = (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25610k9)).booleanValue() || (omA2 = this.f27356b.a(c3182ak.f34128C)) == null || (c3956hn = omA2.f30491c) == null) ? "" : c3956hn.toString();
                    boolean z6 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25620l9)).booleanValue() && (omA = this.f27356b.a(c3182ak.f34128C)) != null && omA.f30492d;
                    java.util.List list2 = this.f27358d;
                    java.lang.String str = c3182ak.f34128C;
                    list2.add(new com.google.android.gms.internal.ads.EP(str, string, this.f27356b.b(str), c3182ak.f34129D ? 1 : 0, c3182ak.f34131F, c3182ak.f34130E, z6));
                }
                this.f27359e = true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: all -> 0x001e, LOOP:0: B:15:0x002b->B:17:0x0031, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:11:0x0020, B:12:0x0023, B:14:0x0025, B:15:0x002b, B:17:0x0031), top: B:21:0x0008 }] */
    public final org.json.JSONArray a() {
        java.util.Iterator it;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (this.f27357c) {
            try {
                if (this.f27359e) {
                    it = this.f27358d.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((com.google.android.gms.internal.ads.EP) it.next()).a());
                    }
                } else if (this.f27355a.t()) {
                    d(this.f27355a.g());
                    it = this.f27358d.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((com.google.android.gms.internal.ads.EP) it.next()).a());
                    }
                } else {
                    c();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    public final void c() {
        this.f27355a.s(new com.google.android.gms.internal.ads.DP(this));
    }
}
