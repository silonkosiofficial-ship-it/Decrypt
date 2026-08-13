package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4397lo0 extends com.google.android.gms.internal.ads.AbstractC2831Sh0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Map f37235C;

    public C4397lo0(java.util.Map map) {
        this.f37235C = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2831Sh0, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return super.r(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2831Sh0, java.util.Map
    public final java.util.Set entrySet() {
        return com.google.android.gms.internal.ads.AbstractC3729fj0.c(this.f37235C.entrySet(), new com.google.android.gms.internal.ads.InterfaceC2201Bg0() { // from class: com.google.android.gms.internal.ads.kn0
            @Override // com.google.android.gms.internal.ads.InterfaceC2201Bg0
            public final boolean b(java.lang.Object obj) {
                return ((java.util.Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj != null && super.s(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (java.util.List) this.f37235C.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.q();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f37235C.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return com.google.android.gms.internal.ads.AbstractC3729fj0.c(this.f37235C.keySet(), new com.google.android.gms.internal.ads.InterfaceC2201Bg0() { // from class: com.google.android.gms.internal.ads.Kn0
            @Override // com.google.android.gms.internal.ads.InterfaceC2201Bg0
            public final boolean b(java.lang.Object obj) {
                return ((java.lang.String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2867Th0
    protected final /* synthetic */ java.lang.Object m() {
        return this.f37235C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2831Sh0
    protected final java.util.Map o() {
        return this.f37235C;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2831Sh0, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
