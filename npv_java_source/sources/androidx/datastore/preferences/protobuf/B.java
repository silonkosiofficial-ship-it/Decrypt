package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
class B implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.util.Iterator f21923C;

    public B(java.util.Iterator it) {
        this.f21923C = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map.Entry next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f21923C.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21923C.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f21923C.remove();
    }
}
