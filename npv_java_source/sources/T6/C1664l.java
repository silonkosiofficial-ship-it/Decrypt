package T6;

/* JADX INFO: renamed from: T6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f13179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f13180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f13181c;

    public C1664l(java.lang.String str, java.util.List list) {
        java.lang.Double d6;
        java.lang.Object next;
        java.lang.String strB;
        java.lang.Double dS;
        p247y7.AbstractC7350t.f(str, "value");
        p247y7.AbstractC7350t.f(list, "params");
        this.f13179a = str;
        this.f13180b = list;
        java.util.Iterator it = list.iterator();
        do {
            d6 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p247y7.AbstractC7350t.b(((T6.C1665m) next).a(), "q"));
        T6.C1665m c1665m = (T6.C1665m) next;
        double dDoubleValue = 1.0d;
        if (c1665m != null && (strB = c1665m.b()) != null && (dS = S8.r.s(strB)) != null) {
            double dDoubleValue2 = dS.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d6 = dS;
            }
            if (d6 != null) {
                dDoubleValue = d6.doubleValue();
            }
        }
        this.f13181c = dDoubleValue;
    }

    public final java.util.List a() {
        return this.f13180b;
    }

    public final java.lang.String b() {
        return this.f13179a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T6.C1664l)) {
            return false;
        }
        T6.C1664l c1664l = (T6.C1664l) obj;
        return p247y7.AbstractC7350t.b(this.f13179a, c1664l.f13179a) && p247y7.AbstractC7350t.b(this.f13180b, c1664l.f13180b);
    }

    public int hashCode() {
        return (this.f13179a.hashCode() * 31) + this.f13180b.hashCode();
    }

    public java.lang.String toString() {
        return "HeaderValue(value=" + this.f13179a + ", params=" + this.f13180b + ')';
    }
}
