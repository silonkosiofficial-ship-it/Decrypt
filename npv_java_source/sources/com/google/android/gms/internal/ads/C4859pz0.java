package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4859pz0 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f38119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f38120b;

    static {
        com.google.android.gms.internal.ads.C3322bz0.a(java.util.Collections.emptySet());
    }

    /* synthetic */ C4859pz0(java.util.List list, java.util.List list2, com.google.android.gms.internal.ads.AbstractC4639nz0 abstractC4639nz0) {
        this.f38119a = list;
        this.f38120b = list2;
    }

    public static com.google.android.gms.internal.ads.C4749oz0 a(int i6, int i10) {
        return new com.google.android.gms.internal.ads.C4749oz0(i6, i10, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.util.Set b() {
        int size = this.f38119a.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f38120b.size());
        int size2 = this.f38120b.size();
        for (int i6 = 0; i6 < size2; i6++) {
            java.util.Collection collection = (java.util.Collection) ((com.google.android.gms.internal.ads.InterfaceC4309kz0) this.f38120b.get(i6)).b();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSetA = com.google.android.gms.internal.ads.Xy0.a(size);
        int size3 = this.f38119a.size();
        for (int i10 = 0; i10 < size3; i10++) {
            java.lang.Object objB = ((com.google.android.gms.internal.ads.InterfaceC4309kz0) this.f38119a.get(i10)).b();
            objB.getClass();
            hashSetA.add(objB);
        }
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            for (java.lang.Object obj : (java.util.Collection) arrayList.get(i11)) {
                obj.getClass();
                hashSetA.add(obj);
            }
        }
        return j$.util.DesugarCollections.unmodifiableSet(hashSetA);
    }
}
