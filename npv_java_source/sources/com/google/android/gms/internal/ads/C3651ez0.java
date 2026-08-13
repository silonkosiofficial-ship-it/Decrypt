package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ez0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3651ez0 extends com.google.android.gms.internal.ads.Wy0 {
    static {
        com.google.android.gms.internal.ads.C3322bz0.a(java.util.Collections.emptyMap());
    }

    /* synthetic */ C3651ez0(java.util.Map map, com.google.android.gms.internal.ads.AbstractC3432cz0 abstractC3432cz0) {
        super(map);
    }

    public static com.google.android.gms.internal.ads.C3541dz0 c(int i6) {
        return new com.google.android.gms.internal.ads.C3541dz0(i6, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.util.Map b() {
        java.util.LinkedHashMap linkedHashMapB = com.google.android.gms.internal.ads.Xy0.b(a().size());
        for (java.util.Map.Entry entry : a().entrySet()) {
            linkedHashMapB.put(entry.getKey(), ((com.google.android.gms.internal.ads.InterfaceC4309kz0) entry.getValue()).b());
        }
        return j$.util.DesugarCollections.unmodifiableMap(linkedHashMapB);
    }
}
