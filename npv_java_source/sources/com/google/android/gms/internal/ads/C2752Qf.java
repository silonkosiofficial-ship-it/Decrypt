package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2752Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f31025a = new java.util.LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f31026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f31027c;

    public C2752Qf(boolean z6, java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f31026b = linkedHashMap;
        this.f31027c = new java.lang.Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final com.google.android.gms.internal.ads.C2604Mf f() {
        return new com.google.android.gms.internal.ads.C2604Mf(p174r3.v.c().c(), null, null);
    }

    public final com.google.android.gms.internal.ads.C2678Of a() {
        com.google.android.gms.internal.ads.C2678Of c2678Of;
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.HashMap map = new java.util.HashMap();
        synchronized (this.f31027c) {
            try {
                for (com.google.android.gms.internal.ads.C2604Mf c2604Mf : this.f31025a) {
                    long jA = c2604Mf.a();
                    java.lang.String strC = c2604Mf.c();
                    com.google.android.gms.internal.ads.C2604Mf c2604MfB = c2604Mf.b();
                    if (c2604MfB != null && jA > 0) {
                        long jA2 = jA - c2604MfB.a();
                        sb.append(strC);
                        sb.append('.');
                        sb.append(jA2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(java.lang.Long.valueOf(c2604MfB.a()))) {
                                java.lang.StringBuilder sb2 = (java.lang.StringBuilder) map.get(java.lang.Long.valueOf(c2604MfB.a()));
                                sb2.append('+');
                                sb2.append(strC);
                            } else {
                                map.put(java.lang.Long.valueOf(c2604MfB.a()), new java.lang.StringBuilder(strC));
                            }
                        }
                    }
                }
                this.f31025a.clear();
                java.lang.String string = null;
                if (!android.text.TextUtils.isEmpty(null)) {
                    sb.append((java.lang.String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                if (zBooleanValue) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        sb3.append((java.lang.CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(p174r3.v.c().a() + (((java.lang.Long) entry.getKey()).longValue() - p174r3.v.c().c()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                c2678Of = new com.google.android.gms.internal.ads.C2678Of(sb.toString(), string);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c2678Of;
    }

    public final java.util.Map b() {
        java.util.Map map;
        synchronized (this.f31027c) {
            p174r3.v.s().h();
            map = this.f31026b;
        }
        return map;
    }

    public final void c(com.google.android.gms.internal.ads.C2752Qf c2752Qf) {
        synchronized (this.f31027c) {
        }
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.C2346Ff c2346FfH;
        if (android.text.TextUtils.isEmpty(str2) || (c2346FfH = p174r3.v.s().h()) == null) {
            return;
        }
        synchronized (this.f31027c) {
            com.google.android.gms.internal.ads.AbstractC2568Lf abstractC2568LfA = c2346FfH.a(str);
            java.util.Map map = this.f31026b;
            map.put(str, abstractC2568LfA.a((java.lang.String) map.get(str), str2));
        }
    }

    public final boolean e(com.google.android.gms.internal.ads.C2604Mf c2604Mf, long j6, java.lang.String... strArr) {
        synchronized (this.f31027c) {
            this.f31025a.add(new com.google.android.gms.internal.ads.C2604Mf(j6, strArr[0], c2604Mf));
        }
        return true;
    }
}
