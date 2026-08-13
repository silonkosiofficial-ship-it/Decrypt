package B3;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4246kO f692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.Map f693i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.ArrayDeque f690f = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayDeque f691g = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f685a = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25323K6)).intValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f686b = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25334L6)).longValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f687c = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25378P6)).booleanValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f688d = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25367O6)).booleanValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Map f689e = j$.util.DesugarCollections.synchronizedMap(new B3.q0(this));

    public s0(com.google.android.gms.internal.ads.C4246kO c4246kO) {
        this.f692h = c4246kO;
    }

    private final synchronized void i(final com.google.android.gms.internal.ads.YN yn) {
        if (this.f687c) {
            java.util.ArrayDeque arrayDeque = this.f691g;
            final java.util.ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            java.util.ArrayDeque arrayDeque2 = this.f690f;
            final java.util.ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: B3.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f668C.e(yn, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void j(com.google.android.gms.internal.ads.YN yn, java.util.ArrayDeque arrayDeque, java.lang.String str) {
        android.util.Pair pair;
        while (!arrayDeque.isEmpty()) {
            android.util.Pair pair2 = (android.util.Pair) arrayDeque.poll();
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap(yn.b());
            this.f693i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f693i.put("e_r", str);
            this.f693i.put("e_id", (java.lang.String) pair2.first);
            if (this.f688d) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) pair2.second);
                    pair = new android.util.Pair(B3.AbstractC0797c.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (org.json.JSONException unused) {
                    pair = new android.util.Pair("", "");
                }
                l(this.f693i, "e_type", (java.lang.String) pair.first);
                l(this.f693i, "e_agent", (java.lang.String) pair.second);
            }
            this.f692h.g(this.f693i);
        }
    }

    private final synchronized void k() {
        try {
            long jA = p174r3.v.c().a();
            try {
                java.util.Iterator it = this.f689e.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (jA - ((B3.r0) entry.getValue()).f677a.longValue() <= this.f686b) {
                        break;
                    }
                    this.f691g.add(new android.util.Pair((java.lang.String) entry.getKey(), ((B3.r0) entry.getValue()).f678b));
                    it.remove();
                    throw th;
                }
            } catch (java.util.ConcurrentModificationException e6) {
                p174r3.v.s().x(e6, "QueryJsonMap.removeExpiredEntries");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private static final void l(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized java.lang.String b(java.lang.String str, com.google.android.gms.internal.ads.YN yn) {
        B3.r0 r0Var = (B3.r0) this.f689e.get(str);
        yn.b().put("request_id", str);
        if (r0Var == null) {
            yn.b().put("mhit", "false");
            return null;
        }
        yn.b().put("mhit", "true");
        return r0Var.f678b;
    }

    public final synchronized void d(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.YN yn) {
        this.f689e.put(str, new B3.r0(java.lang.Long.valueOf(p174r3.v.c().a()), str2, new java.util.HashSet()));
        k();
        i(yn);
    }

    final /* synthetic */ void e(com.google.android.gms.internal.ads.YN yn, java.util.ArrayDeque arrayDeque, java.util.ArrayDeque arrayDeque2) {
        j(yn, arrayDeque, "to");
        j(yn, arrayDeque2, "of");
    }

    public final synchronized void f(java.lang.String str) {
        this.f689e.remove(str);
    }

    public final synchronized boolean g(java.lang.String str, java.lang.String str2, int i6) {
        B3.r0 r0Var = (B3.r0) this.f689e.get(str);
        if (r0Var == null) {
            return false;
        }
        r0Var.f679c.add(str2);
        return r0Var.f679c.size() < i6;
    }

    public final synchronized boolean h(java.lang.String str, java.lang.String str2) {
        B3.r0 r0Var = (B3.r0) this.f689e.get(str);
        return r0Var != null && r0Var.f679c.contains(str2);
    }
}
