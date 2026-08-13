package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4435m7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f37286c = com.google.android.gms.internal.ads.AbstractC4545n7.f37506b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f37287a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37288b = false;

    C4435m7() {
    }

    public final synchronized void a(java.lang.String str, long j6) {
        if (this.f37288b) {
            throw new java.lang.IllegalStateException("Marker added to finished log");
        }
        this.f37287a.add(new com.google.android.gms.internal.ads.C4325l7(str, j6, android.os.SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(java.lang.String str) {
        long j6;
        this.f37288b = true;
        if (this.f37287a.size() == 0) {
            j6 = 0;
        } else {
            long j10 = ((com.google.android.gms.internal.ads.C4325l7) this.f37287a.get(0)).f37071c;
            java.util.List list = this.f37287a;
            j6 = ((com.google.android.gms.internal.ads.C4325l7) list.get(list.size() - 1)).f37071c - j10;
        }
        if (j6 > 0) {
            long j11 = ((com.google.android.gms.internal.ads.C4325l7) this.f37287a.get(0)).f37071c;
            com.google.android.gms.internal.ads.AbstractC4545n7.a("(%-4d ms) %s", java.lang.Long.valueOf(j6), str);
            for (com.google.android.gms.internal.ads.C4325l7 c4325l7 : this.f37287a) {
                long j12 = c4325l7.f37071c;
                com.google.android.gms.internal.ads.AbstractC4545n7.a("(+%-4d) [%2d] %s", java.lang.Long.valueOf(j12 - j11), java.lang.Long.valueOf(c4325l7.f37070b), c4325l7.f37069a);
                j11 = j12;
            }
        }
    }

    protected final void finalize() {
        if (this.f37288b) {
            return;
        }
        b("Request on the loose");
        com.google.android.gms.internal.ads.AbstractC4545n7.b("Marker log finalized without finish() - uncaught exit point for request", new java.lang.Object[0]);
    }
}
