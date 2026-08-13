package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements M4.c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final N4.z.a f7788C = new N4.z.a.C0188a("KEY", 0);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final N4.z.a f7789D = new N4.z.a.b("VALUE", 1);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ N4.z.a[] f7790E = e();

        /* JADX INFO: renamed from: N4.z$a$a, reason: collision with other inner class name */
        final enum C0188a extends N4.z.a {
            C0188a(java.lang.String str, int i6) {
                super(str, i6, null);
            }

            @Override // M4.c
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public java.lang.Object apply(java.util.Map.Entry entry) {
                return entry.getKey();
            }
        }

        final enum b extends N4.z.a {
            b(java.lang.String str, int i6) {
                super(str, i6, null);
            }

            @Override // M4.c
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public java.lang.Object apply(java.util.Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(java.lang.String str, int i6) {
            super(str, i6);
        }

        /* synthetic */ a(java.lang.String str, int i6, N4.y yVar) {
            this(str, i6);
        }

        private static /* synthetic */ N4.z.a[] e() {
            return new N4.z.a[]{f7788C, f7789D};
        }

        public static N4.z.a valueOf(java.lang.String str) {
            return (N4.z.a) java.lang.Enum.valueOf(N4.z.a.class, str);
        }

        public static N4.z.a[] values() {
            return (N4.z.a[]) f7790E.clone();
        }
    }

    static boolean a(java.util.Map map, java.lang.Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    static M4.c b() {
        return N4.z.a.f7788C;
    }

    static java.lang.String c(java.util.Map map) {
        java.lang.StringBuilder sbA = N4.AbstractC1408h.a(map.size());
        sbA.append('{');
        boolean z6 = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (!z6) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z6 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static M4.c d() {
        return N4.z.a.f7789D;
    }
}
