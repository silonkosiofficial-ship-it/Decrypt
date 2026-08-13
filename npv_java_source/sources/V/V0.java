package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f14812a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f14813b = new java.lang.Object();

    public static final java.lang.Object a(java.util.Map map, java.lang.Object obj) {
        java.util.List list = (java.util.List) map.get(obj);
        if (list == null) {
            return null;
        }
        java.lang.Object objJ = p097j7.AbstractC6879v.J(list);
        if (!list.isEmpty()) {
            return objJ;
        }
        map.remove(obj);
        return objJ;
    }
}
