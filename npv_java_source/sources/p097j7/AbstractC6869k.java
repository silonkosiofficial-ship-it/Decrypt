package p097j7;

/* JADX INFO: renamed from: j7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6869k extends p097j7.AbstractC6860b implements java.util.Set, p256z7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p097j7.AbstractC6869k.a f49307C = new p097j7.AbstractC6869k.a(null);

    /* JADX INFO: renamed from: j7.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final boolean a(java.util.Set set, java.util.Set set2) {
            p247y7.AbstractC7350t.f(set, "c");
            p247y7.AbstractC7350t.f(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "c");
            java.util.Iterator it = collection.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }
    }

    protected AbstractC6869k() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            return f49307C.a(this, (java.util.Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f49307C.b(this);
    }
}
