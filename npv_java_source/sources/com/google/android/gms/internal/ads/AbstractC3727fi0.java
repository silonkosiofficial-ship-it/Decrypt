package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3727fi0 implements java.util.Map, java.io.Serializable, j$.util.Map {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient com.google.android.gms.internal.ads.AbstractC3947hi0 f35390C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient com.google.android.gms.internal.ads.AbstractC3947hi0 f35391D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private transient com.google.android.gms.internal.ads.AbstractC3011Xh0 f35392E;

    AbstractC3727fi0() {
    }

    public static com.google.android.gms.internal.ads.AbstractC3727fi0 c(java.util.Map map) {
        java.util.Set setEntrySet = map.entrySet();
        com.google.android.gms.internal.ads.C3617ei0 c3617ei0 = new com.google.android.gms.internal.ads.C3617ei0(setEntrySet instanceof java.util.Collection ? setEntrySet.size() : 4);
        c3617ei0.b(setEntrySet);
        return c3617ei0.c();
    }

    public static com.google.android.gms.internal.ads.AbstractC3727fi0 d() {
        return com.google.android.gms.internal.ads.C2905Ui0.f32256I;
    }

    public static com.google.android.gms.internal.ads.AbstractC3727fi0 e(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.AbstractC5812yh0.b("dialog_not_shown_reason", obj2);
        return com.google.android.gms.internal.ads.C2905Ui0.k(1, new java.lang.Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    abstract com.google.android.gms.internal.ads.AbstractC3011Xh0 a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC3011Xh0 values() {
        com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0 = this.f35392E;
        if (abstractC3011Xh0 != null) {
            return abstractC3011Xh0;
        }
        com.google.android.gms.internal.ads.AbstractC3011Xh0 abstractC3011Xh0A = a();
        this.f35392E = abstractC3011Xh0A;
        return abstractC3011Xh0A;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.internal.ads.AbstractC5924zi0.b(this, obj);
    }

    abstract com.google.android.gms.internal.ads.AbstractC3947hi0 f();

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    abstract com.google.android.gms.internal.ads.AbstractC3947hi0 g();

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC3947hi0 entrySet() {
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0 = this.f35390C;
        if (abstractC3947hi0 != null) {
            return abstractC3947hi0;
        }
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0F = f();
        this.f35390C = abstractC3947hi0F;
        return abstractC3947hi0F;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return com.google.android.gms.internal.ads.AbstractC3729fj0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC3947hi0 keySet() {
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0 = this.f35391D;
        if (abstractC3947hi0 != null) {
            return abstractC3947hi0;
        }
        com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0G = g();
        this.f35391D = abstractC3947hi0G;
        return abstractC3947hi0G;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    public final java.lang.String toString() {
        int size = size();
        com.google.android.gms.internal.ads.AbstractC5812yh0.a(size, "size");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (java.util.Map.Entry entry : entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
