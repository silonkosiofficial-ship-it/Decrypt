package p180s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashMap f54039a;

    public c(int i6, float f6) {
        this.f54039a = new java.util.LinkedHashMap(i6, f6, true);
    }

    public final java.lang.Object a(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "key");
        return this.f54039a.get(obj);
    }

    public final java.util.Set b() {
        java.util.Set setEntrySet = this.f54039a.entrySet();
        p247y7.AbstractC7350t.e(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f54039a.isEmpty();
    }

    public final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(obj, "key");
        p247y7.AbstractC7350t.f(obj2, "value");
        return this.f54039a.put(obj, obj2);
    }

    public final java.lang.Object e(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "key");
        return this.f54039a.remove(obj);
    }
}
