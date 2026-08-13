package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3060Ys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f33411a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33412b;

    C3060Ys() {
    }

    final long a() {
        java.util.Iterator it = this.f33411a.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.C4619np0) it.next()).d().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((java.lang.String) entry.getKey())) {
                        this.f33412b = java.lang.Math.max(this.f33412b, java.lang.Long.parseLong((java.lang.String) ((java.util.List) entry.getValue()).get(0)));
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f33412b;
    }

    final void b(com.google.android.gms.internal.ads.C4619np0 c4619np0) {
        this.f33411a.add(c4619np0);
    }
}
