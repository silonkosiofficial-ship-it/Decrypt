package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5702xh0 implements com.google.android.gms.internal.ads.InterfaceC2168Ai0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private transient java.util.Set f39899C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient java.util.Collection f39900D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private transient java.util.Map f39901E;

    AbstractC5702xh0() {
    }

    abstract java.util.Collection b();

    abstract java.util.Iterator c();

    abstract java.util.Map e();

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.InterfaceC2168Ai0) {
            return u().equals(((com.google.android.gms.internal.ads.InterfaceC2168Ai0) obj).u());
        }
        return false;
    }

    abstract java.util.Set f();

    public final java.util.Set g() {
        java.util.Set set = this.f39899C;
        if (set != null) {
            return set;
        }
        java.util.Set setF = f();
        this.f39899C = setF;
        return setF;
    }

    public final int hashCode() {
        return u().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Ai0
    public final java.util.Collection t() {
        java.util.Collection collection = this.f39900D;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionB = b();
        this.f39900D = collectionB;
        return collectionB;
    }

    public final java.lang.String toString() {
        return u().toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2168Ai0
    public final java.util.Map u() {
        java.util.Map map = this.f39901E;
        if (map != null) {
            return map;
        }
        java.util.Map mapE = e();
        this.f39901E = mapE;
        return mapE;
    }
}
