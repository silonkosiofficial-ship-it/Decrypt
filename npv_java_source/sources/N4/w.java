package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    class a extends N4.S {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f7786C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f7787D;

        a(java.lang.Object obj) {
            this.f7787D = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f7786C;
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
            if (this.f7786C) {
                throw new java.util.NoSuchElementException();
            }
            this.f7786C = true;
            return this.f7787D;
        }
    }

    public static boolean a(java.util.Collection collection, java.util.Iterator it) {
        M4.h.i(collection);
        M4.h.i(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(java.util.Iterator it, java.util.Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !M4.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static N4.S c(java.lang.Object obj) {
        return new N4.w.a(obj);
    }
}
