package p126m5;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f51136a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51138c;

    public d(int i6, int i10) {
        this.f51137b = i6;
        this.f51138c = i10;
    }

    private java.lang.String b(java.lang.String str) {
        if (str != null) {
            return c(str, this.f51138c);
        }
        throw new java.lang.IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static java.lang.String c(java.lang.String str, int i6) {
        if (str == null) {
            return str;
        }
        java.lang.String strTrim = str.trim();
        return strTrim.length() > i6 ? strTrim.substring(0, i6) : strTrim;
    }

    public synchronized java.util.Map a() {
        return j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(this.f51136a));
    }

    public synchronized boolean d(java.lang.String str, java.lang.String str2) {
        java.lang.String strB = b(str);
        if (this.f51136a.size() >= this.f51137b && !this.f51136a.containsKey(strB)) {
            p076h5.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f51137b);
            return false;
        }
        java.lang.String strC = c(str2, this.f51138c);
        if (p106k5.AbstractC6898i.y((java.lang.String) this.f51136a.get(strB), strC)) {
            return false;
        }
        java.util.Map map = this.f51136a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(java.util.Map map) {
        try {
            int i6 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String strB = b((java.lang.String) entry.getKey());
                if (this.f51136a.size() < this.f51137b || this.f51136a.containsKey(strB)) {
                    java.lang.String str = (java.lang.String) entry.getValue();
                    this.f51136a.put(strB, str == null ? "" : c(str, this.f51138c));
                } else {
                    i6++;
                }
            }
            if (i6 > 0) {
                p076h5.g.f().k("Ignored " + i6 + " entries when adding custom keys. Maximum allowable: " + this.f51137b);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
