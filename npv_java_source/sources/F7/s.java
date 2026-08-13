package F7;

/* JADX INFO: loaded from: classes3.dex */
final class s implements java.lang.reflect.ParameterizedType, java.lang.reflect.Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f2804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Type f2805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.reflect.Type[] f2806c;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final F7.s.a f2807L = new F7.s.a();

        a() {
            super(1, F7.u.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.String l(java.lang.reflect.Type type) {
            p247y7.AbstractC7350t.f(type, "p0");
            return F7.u.h(type);
        }
    }

    public s(java.lang.Class cls, java.lang.reflect.Type type, java.util.List list) {
        p247y7.AbstractC7350t.f(cls, "rawType");
        p247y7.AbstractC7350t.f(list, "typeArguments");
        this.f2804a = cls;
        this.f2805b = type;
        this.f2806c = (java.lang.reflect.Type[]) list.toArray(new java.lang.reflect.Type[0]);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) obj;
            if (p247y7.AbstractC7350t.b(this.f2804a, parameterizedType.getRawType()) && p247y7.AbstractC7350t.b(this.f2805b, parameterizedType.getOwnerType()) && java.util.Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return this.f2806c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.f2805b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.f2804a;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() throws java.io.IOException {
        java.lang.String strH;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.reflect.Type type = this.f2805b;
        if (type != null) {
            sb.append(F7.u.h(type));
            sb.append("$");
            strH = this.f2804a.getSimpleName();
        } else {
            strH = F7.u.h(this.f2804a);
        }
        sb.append(strH);
        java.lang.reflect.Type[] typeArr = this.f2806c;
        if (!(typeArr.length == 0)) {
            p097j7.AbstractC6876s.p0(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : F7.s.a.f2807L);
        }
        return sb.toString();
    }

    public int hashCode() {
        int iHashCode = this.f2804a.hashCode();
        java.lang.reflect.Type type = this.f2805b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ java.util.Arrays.hashCode(getActualTypeArguments());
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
