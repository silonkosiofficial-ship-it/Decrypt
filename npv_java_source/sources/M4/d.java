package M4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f7011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final M4.d.b.a f7012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private M4.d.b.a f7013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7015e;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            java.lang.String f7016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            java.lang.Object f7017b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            M4.d.b.a f7018c;

            private a() {
            }
        }

        private b(java.lang.String str) {
            M4.d.b.a aVar = new M4.d.b.a();
            this.f7012b = aVar;
            this.f7013c = aVar;
            this.f7014d = false;
            this.f7015e = false;
            this.f7011a = (java.lang.String) M4.h.i(str);
        }

        private M4.d.b.a a() {
            M4.d.b.a aVar = new M4.d.b.a();
            this.f7013c.f7018c = aVar;
            this.f7013c = aVar;
            return aVar;
        }

        private M4.d.b b(java.lang.Object obj) {
            a().f7017b = obj;
            return this;
        }

        private static boolean d(java.lang.Object obj) {
            if (obj instanceof java.lang.CharSequence) {
                return ((java.lang.CharSequence) obj).length() == 0;
            }
            if (obj instanceof java.util.Collection) {
                return ((java.util.Collection) obj).isEmpty();
            }
            if (obj instanceof java.util.Map) {
                return ((java.util.Map) obj).isEmpty();
            }
            if (obj instanceof M4.g) {
                return !((M4.g) obj).c();
            }
            return obj.getClass().isArray() && java.lang.reflect.Array.getLength(obj) == 0;
        }

        public M4.d.b c(java.lang.Object obj) {
            return b(obj);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002d  */
        /* JADX WARN: Code duplicated, block: B:13:0x0034  */
        /* JADX WARN: Code duplicated, block: B:18:0x005a  */
        public java.lang.String toString() {
            java.lang.String str;
            boolean z6 = this.f7014d;
            boolean z10 = this.f7015e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            sb.append(this.f7011a);
            sb.append('{');
            java.lang.String str2 = "";
            for (M4.d.b.a aVar = this.f7012b.f7018c; aVar != null; aVar = aVar.f7018c) {
                java.lang.Object obj = aVar.f7017b;
                if (obj == null) {
                    if (!z6) {
                        sb.append(str2);
                        str = aVar.f7016a;
                        if (str != null) {
                            sb.append(str);
                            sb.append('=');
                        }
                        if (obj == null && obj.getClass().isArray()) {
                            java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                            sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        } else {
                            sb.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z10 || !d(obj)) {
                    sb.append(str2);
                    str = aVar.f7016a;
                    if (str != null) {
                        sb.append(str);
                        sb.append('=');
                    }
                    if (obj == null) {
                        sb.append(obj);
                    } else {
                        sb.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static M4.d.b a(java.lang.Object obj) {
        return new M4.d.b(obj.getClass().getSimpleName());
    }
}
