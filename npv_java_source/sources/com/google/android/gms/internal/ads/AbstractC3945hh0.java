package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3945hh0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Iterator f36110C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    java.util.Collection f36111D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    java.util.Iterator f36112E = com.google.android.gms.internal.ads.EnumC4275ki0.INSTANCE;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC5372uh0 f36113F;

    AbstractC3945hh0(com.google.android.gms.internal.ads.AbstractC5372uh0 abstractC5372uh0) {
        this.f36113F = abstractC5372uh0;
        this.f36110C = abstractC5372uh0.f39207F.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36110C.hasNext() || this.f36112E.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f36112E.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.f36110C.next();
            entry.getKey();
            java.util.Collection collection = (java.util.Collection) entry.getValue();
            this.f36111D = collection;
            this.f36112E = collection.iterator();
        }
        return this.f36112E.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f36112E.remove();
        java.util.Collection collection = this.f36111D;
        j$.util.Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f36110C.remove();
        }
        this.f36113F.f39208G--;
    }
}
