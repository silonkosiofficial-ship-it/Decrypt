package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3028Xw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f33225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f33226b;

    C3028Xw(java.util.Map map, java.util.Map map2) {
        this.f33225a = map;
        this.f33226b = map2;
    }

    public final void a(com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        for (com.google.android.gms.internal.ads.C3230b70 c3230b70 : c3558e70.f34899b.f34449c) {
            if (this.f33225a.containsKey(c3230b70.f34233a) && c3230b70.f34234b != null) {
                ((com.google.android.gms.internal.ads.InterfaceC3318bx) this.f33225a.get(c3230b70.f34233a)).a(c3230b70.f34234b);
            } else if (this.f33226b.containsKey(c3230b70.f34233a) && c3230b70.f34234b != null) {
                com.google.android.gms.internal.ads.InterfaceC3208ax interfaceC3208ax = (com.google.android.gms.internal.ads.InterfaceC3208ax) this.f33226b.get(c3230b70.f34233a);
                org.json.JSONObject jSONObject = c3230b70.f34234b;
                java.util.HashMap map = new java.util.HashMap();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.lang.String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                interfaceC3208ax.a(map);
            }
        }
    }
}
