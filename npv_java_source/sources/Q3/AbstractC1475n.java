package Q3;

/* JADX INFO: renamed from: Q3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1475n {

    /* JADX INFO: renamed from: Q3.n$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f8992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Object f8993b;

        /* synthetic */ a(java.lang.Object obj, Q3.Z z6) {
            Q3.AbstractC1477p.l(obj);
            this.f8993b = obj;
            this.f8992a = new java.util.ArrayList();
        }

        public Q3.AbstractC1475n.a a(java.lang.String str, java.lang.Object obj) {
            Q3.AbstractC1477p.l(str);
            this.f8992a.add(str + "=" + java.lang.String.valueOf(obj));
            return this;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
            sb.append(this.f8993b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f8992a.size();
            for (int i6 = 0; i6 < size; i6++) {
                sb.append((java.lang.String) this.f8992a.get(i6));
                if (i6 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static Q3.AbstractC1475n.a c(java.lang.Object obj) {
        return new Q3.AbstractC1475n.a(obj, null);
    }
}
