package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6266o0 implements com.google.android.gms.internal.play_billing.InterfaceC6313w0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Iterator f41599C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f41600D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.lang.Object f41601E;

    public C6266o0(java.util.Iterator it) {
        it.getClass();
        this.f41599C = it;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6313w0
    public final java.lang.Object a() {
        if (!this.f41600D) {
            this.f41601E = this.f41599C.next();
            this.f41600D = true;
        }
        return this.f41601E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41600D || this.f41599C.hasNext();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6313w0, java.util.Iterator
    public final java.lang.Object next() {
        if (!this.f41600D) {
            return this.f41599C.next();
        }
        java.lang.Object obj = this.f41601E;
        this.f41600D = false;
        this.f41601E = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(!this.f41600D)) {
            throw new java.lang.IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f41599C.remove();
    }
}
