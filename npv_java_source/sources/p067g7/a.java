package p067g7;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f45548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f45549b;

    /* JADX INFO: renamed from: g7.a$a, reason: collision with other inner class name */
    public enum EnumC0512a {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);


        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final java.util.Map f45551E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final p067g7.a.EnumC0512a f45552F;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final short f45567C;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f45566T = p157p7.b.a(e());

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p067g7.a.EnumC0512a.C0513a f45550D = new p067g7.a.EnumC0512a.C0513a(null);

        /* JADX INFO: renamed from: g7.a$a$a, reason: collision with other inner class name */
        public static final class C0513a {
            private C0513a() {
            }

            public /* synthetic */ C0513a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final p067g7.a.EnumC0512a a(short s6) {
                return (p067g7.a.EnumC0512a) p067g7.a.EnumC0512a.f45551E.get(java.lang.Short.valueOf(s6));
            }
        }

        static {
            p157p7.a aVarM = m();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(aVarM, 10)), 16));
            for (java.lang.Object obj : aVarM) {
                linkedHashMap.put(java.lang.Short.valueOf(((p067g7.a.EnumC0512a) obj).f45567C), obj);
            }
            f45551E = linkedHashMap;
            f45552F = INTERNAL_ERROR;
        }

        EnumC0512a(short s6) {
            this.f45567C = s6;
        }

        public static p157p7.a m() {
            return f45566T;
        }

        public final short i() {
            return this.f45567C;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(p067g7.a.EnumC0512a enumC0512a, java.lang.String str) {
        this(enumC0512a.i(), str);
        p247y7.AbstractC7350t.f(enumC0512a, "code");
        p247y7.AbstractC7350t.f(str, "message");
    }

    public a(short s6, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "message");
        this.f45548a = s6;
        this.f45549b = str;
    }

    public final short a() {
        return this.f45548a;
    }

    public final p067g7.a.EnumC0512a b() {
        return p067g7.a.EnumC0512a.f45550D.a(this.f45548a);
    }

    public final java.lang.String c() {
        return this.f45549b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p067g7.a)) {
            return false;
        }
        p067g7.a aVar = (p067g7.a) obj;
        return this.f45548a == aVar.f45548a && p247y7.AbstractC7350t.b(this.f45549b, aVar.f45549b);
    }

    public int hashCode() {
        return (this.f45548a * 31) + this.f45549b.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CloseReason(reason=");
        java.lang.Object objB = b();
        if (objB == null) {
            objB = java.lang.Short.valueOf(this.f45548a);
        }
        sb.append(objB);
        sb.append(", message=");
        sb.append(this.f45549b);
        sb.append(')');
        return sb.toString();
    }
}
