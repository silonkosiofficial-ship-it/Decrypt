package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class G4 implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.util.Iterator f40511C;

    public G4(java.util.Iterator it) {
        this.f40511C = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40511C.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f40511C.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40511C.remove();
    }
}
