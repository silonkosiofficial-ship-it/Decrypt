package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4655o7 implements com.google.android.gms.internal.ads.InterfaceC3338c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f37723a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.P6 f37724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f37725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.U6 f37726d;

    C4655o7(com.google.android.gms.internal.ads.P6 p6, java.util.concurrent.BlockingQueue blockingQueue, com.google.android.gms.internal.ads.U6 u6) {
        this.f37726d = u6;
        this.f37724b = p6;
        this.f37725c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3338c7
    public final synchronized void a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) {
        try {
            java.util.Map map = this.f37723a;
            java.lang.String strS = abstractC3448d7.s();
            java.util.List list = (java.util.List) map.remove(strS);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b) {
                com.google.android.gms.internal.ads.AbstractC4545n7.d("%d waiting requests for cacheKey=%s; resend to network", java.lang.Integer.valueOf(list.size()), strS);
            }
            com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d8 = (com.google.android.gms.internal.ads.AbstractC3448d7) list.remove(0);
            this.f37723a.put(strS, list);
            abstractC3448d8.D(this);
            try {
                this.f37725c.put(abstractC3448d8);
            } catch (java.lang.InterruptedException e6) {
                com.google.android.gms.internal.ads.AbstractC4545n7.b("Couldn't add request to queue. %s", e6.toString());
                java.lang.Thread.currentThread().interrupt();
                this.f37724b.b();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3338c7
    public final void b(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, com.google.android.gms.internal.ads.C3887h7 c3887h7) {
        java.util.List list;
        com.google.android.gms.internal.ads.M6 m6 = c3887h7.f36007b;
        if (m6 == null || m6.a(java.lang.System.currentTimeMillis())) {
            a(abstractC3448d7);
            return;
        }
        java.lang.String strS = abstractC3448d7.s();
        synchronized (this) {
            list = (java.util.List) this.f37723a.remove(strS);
        }
        if (list != null) {
            if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b) {
                com.google.android.gms.internal.ads.AbstractC4545n7.d("Releasing %d waiting requests for cacheKey=%s.", java.lang.Integer.valueOf(list.size()), strS);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f37726d.b((com.google.android.gms.internal.ads.AbstractC3448d7) it.next(), c3887h7, null);
            }
        }
    }

    final synchronized boolean c(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) {
        try {
            java.util.Map map = this.f37723a;
            java.lang.String strS = abstractC3448d7.s();
            if (!map.containsKey(strS)) {
                this.f37723a.put(strS, null);
                abstractC3448d7.D(this);
                if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b) {
                    com.google.android.gms.internal.ads.AbstractC4545n7.a("new request, sending to network %s", strS);
                }
                return false;
            }
            java.util.List arrayList = (java.util.List) this.f37723a.get(strS);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            abstractC3448d7.v("waiting-for-response");
            arrayList.add(abstractC3448d7);
            this.f37723a.put(strS, arrayList);
            if (com.google.android.gms.internal.ads.AbstractC4545n7.f37506b) {
                com.google.android.gms.internal.ads.AbstractC4545n7.a("Request for cacheKey=%s is in flight, putting on hold.", strS);
            }
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
