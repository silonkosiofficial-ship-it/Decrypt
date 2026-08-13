package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3615eh0 extends com.google.android.gms.internal.ads.AbstractC5484vi0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3835gh0 f35036C;

    C3615eh0(com.google.android.gms.internal.ads.C3835gh0 c3835gh0) {
        this.f35036C = c3835gh0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5484vi0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return com.google.android.gms.internal.ads.AbstractC2166Ah0.a(this.f35036C.f35665E.entrySet(), obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5484vi0
    final java.util.Map d() {
        return this.f35036C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.C3725fh0(this.f35036C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        j$.util.Objects.requireNonNull(entry);
        com.google.android.gms.internal.ads.C3835gh0 c3835gh0 = this.f35036C;
        com.google.android.gms.internal.ads.AbstractC5372uh0.r(c3835gh0.f35666F, entry.getKey());
        return true;
    }
}
