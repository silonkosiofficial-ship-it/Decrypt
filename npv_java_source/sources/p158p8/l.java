package p158p8;

/* JADX INFO: loaded from: classes2.dex */
class l implements java.util.Iterator {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private java.util.Iterator f52824C;

    public l(java.util.Iterator it) {
        this.f52824C = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map.Entry next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f52824C.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52824C.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f52824C.remove();
    }
}
