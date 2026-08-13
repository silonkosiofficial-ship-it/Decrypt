package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList f57258a;

    public U(int i6) {
        this.f57258a = new java.util.ArrayList(i6);
    }

    public void a(java.lang.Object obj) {
        this.f57258a.add(obj);
    }

    public void b(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length > 0) {
                java.util.ArrayList arrayList = this.f57258a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                java.util.Collections.addAll(this.f57258a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof java.util.Collection) {
            this.f57258a.addAll((java.util.Collection) obj);
            return;
        }
        if (obj instanceof java.lang.Iterable) {
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f57258a.add(it.next());
            }
            return;
        }
        if (obj instanceof java.util.Iterator) {
            java.util.Iterator it2 = (java.util.Iterator) obj;
            while (it2.hasNext()) {
                this.f57258a.add(it2.next());
            }
        } else {
            throw new java.lang.UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f57258a.size();
    }

    public java.lang.Object[] d(java.lang.Object[] objArr) {
        return this.f57258a.toArray(objArr);
    }
}
