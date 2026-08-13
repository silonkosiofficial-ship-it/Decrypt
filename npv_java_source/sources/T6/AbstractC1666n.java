package T6;

/* JADX INFO: renamed from: T6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1666n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T6.AbstractC1666n.a f13185c = new T6.AbstractC1666n.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f13186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f13187b;

    /* JADX INFO: renamed from: T6.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public AbstractC1666n(java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "content");
        p247y7.AbstractC7350t.f(list, "parameters");
        this.f13186a = str;
        this.f13187b = list;
    }

    protected final java.lang.String a() {
        return this.f13186a;
    }

    public final java.util.List b() {
        return this.f13187b;
    }

    public final java.lang.String c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        int iO = p097j7.AbstractC6879v.o(this.f13187b);
        if (iO < 0) {
            return null;
        }
        int i6 = 0;
        while (true) {
            T6.C1665m c1665m = (T6.C1665m) this.f13187b.get(i6);
            if (S8.r.K(c1665m.a(), str, true)) {
                return c1665m.b();
            }
            if (i6 == iO) {
                return null;
            }
            i6++;
        }
    }

    public java.lang.String toString() {
        if (this.f13187b.isEmpty()) {
            return this.f13186a;
        }
        int length = this.f13186a.length();
        int i6 = 0;
        int length2 = 0;
        for (T6.C1665m c1665m : this.f13187b) {
            length2 += c1665m.a().length() + c1665m.b().length() + 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length2);
        sb.append(this.f13186a);
        int iO = p097j7.AbstractC6879v.o(this.f13187b);
        if (iO >= 0) {
            while (true) {
                T6.C1665m c1665m2 = (T6.C1665m) this.f13187b.get(i6);
                sb.append("; ");
                sb.append(c1665m2.a());
                sb.append("=");
                java.lang.String strB = c1665m2.b();
                if (T6.AbstractC1667o.d(strB)) {
                    strB = T6.AbstractC1667o.e(strB);
                }
                sb.append(strB);
                if (i6 == iO) {
                    break;
                }
                i6++;
            }
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.c(string);
        return string;
    }
}
