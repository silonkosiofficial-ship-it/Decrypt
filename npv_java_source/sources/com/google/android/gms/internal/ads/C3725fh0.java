package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3725fh0 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final java.util.Iterator f35387C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    java.util.Collection f35388D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3835gh0 f35389E;

    C3725fh0(com.google.android.gms.internal.ads.C3835gh0 c3835gh0) {
        this.f35389E = c3835gh0;
        this.f35387C = c3835gh0.f35665E.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35387C.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f35387C.next();
        this.f35388D = (java.util.Collection) entry.getValue();
        return this.f35389E.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.AbstractC2164Ag0.m(this.f35388D != null, "no calls to next() since the last call to remove()");
        this.f35387C.remove();
        this.f35389E.f35666F.f39208G -= this.f35388D.size();
        this.f35388D.clear();
        this.f35388D = null;
    }
}
