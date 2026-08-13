package F7;

/* JADX INFO: loaded from: classes3.dex */
final class v implements java.lang.reflect.WildcardType, java.lang.reflect.Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F7.v.a f2811c = new F7.v.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final F7.v f2812d = new F7.v(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Type f2813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Type f2814b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final F7.v a() {
            return F7.v.f2812d;
        }
    }

    public v(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.f2813a = type;
        this.f2814b = type2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) obj;
            if (java.util.Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && java.util.Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.f2814b;
        return type == null ? new java.lang.reflect.Type[0] : new java.lang.reflect.Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        java.lang.StringBuilder sb;
        java.lang.reflect.Type type;
        if (this.f2814b != null) {
            sb = new java.lang.StringBuilder();
            sb.append("? super ");
            type = this.f2814b;
        } else {
            java.lang.reflect.Type type2 = this.f2813a;
            if (type2 == null || p247y7.AbstractC7350t.b(type2, java.lang.Object.class)) {
                return "?";
            }
            sb = new java.lang.StringBuilder();
            sb.append("? extends ");
            type = this.f2813a;
        }
        sb.append(F7.u.h(type));
        return sb.toString();
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        java.lang.reflect.Type type = this.f2813a;
        if (type == null) {
            type = java.lang.Object.class;
        }
        return new java.lang.reflect.Type[]{type};
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(getUpperBounds()) ^ java.util.Arrays.hashCode(getLowerBounds());
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
