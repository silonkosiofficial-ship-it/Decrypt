package p001a0;

/* JADX INFO: loaded from: classes.dex */
public final class i implements java.util.Iterator, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p001a0.g f17014C;

    public i(p001a0.f fVar) {
        p001a0.u[] uVarArr = new p001a0.u[8];
        for (int i6 = 0; i6 < 8; i6++) {
            uVarArr[i6] = new p001a0.y(this);
        }
        this.f17014C = new p001a0.g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map.Entry next() {
        return (java.util.Map.Entry) this.f17014C.next();
    }

    public final void c(java.lang.Object obj, java.lang.Object obj2) {
        this.f17014C.o(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17014C.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f17014C.remove();
    }
}
