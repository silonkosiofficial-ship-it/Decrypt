package U7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.List f14579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f14580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f14581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Map f14582d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final U7.d.a f14583D = new U7.d.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.reflect.ParameterizedType l(java.lang.reflect.ParameterizedType parameterizedType) {
            p247y7.AbstractC7350t.f(parameterizedType, "it");
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof java.lang.reflect.ParameterizedType) {
                return (java.lang.reflect.ParameterizedType) ownerType;
            }
            return null;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final U7.d.b f14584D = new U7.d.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R8.h l(java.lang.reflect.ParameterizedType parameterizedType) {
            p247y7.AbstractC7350t.f(parameterizedType, "it");
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            p247y7.AbstractC7350t.e(actualTypeArguments, "getActualTypeArguments(...)");
            return p097j7.AbstractC6872n.O(actualTypeArguments);
        }
    }

    static {
        int i6 = 0;
        java.util.List listP = p097j7.AbstractC6879v.p(p247y7.P.b(java.lang.Boolean.TYPE), p247y7.P.b(java.lang.Byte.TYPE), p247y7.P.b(java.lang.Character.TYPE), p247y7.P.b(java.lang.Double.TYPE), p247y7.P.b(java.lang.Float.TYPE), p247y7.P.b(java.lang.Integer.TYPE), p247y7.P.b(java.lang.Long.TYPE), p247y7.P.b(java.lang.Short.TYPE));
        f14579a = listP;
        java.util.List<F7.c> list = listP;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
        for (F7.c cVar : list) {
            arrayList.add(p087i7.B.a(p227w7.a.c(cVar), p227w7.a.d(cVar)));
        }
        f14580b = p097j7.S.q(arrayList);
        java.util.List<F7.c> list2 = f14579a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
        for (F7.c cVar2 : list2) {
            arrayList2.add(p087i7.B.a(p227w7.a.d(cVar2), p227w7.a.c(cVar2)));
        }
        f14581c = p097j7.S.q(arrayList2);
        java.util.List listP2 = p097j7.AbstractC6879v.p(p237x7.a.class, p237x7.l.class, p237x7.p.class, p237x7.q.class, p237x7.r.class, p237x7.s.class, p237x7.t.class, p237x7.u.class, p237x7.v.class, p237x7.w.class, p237x7.b.class, p237x7.c.class, p237x7.d.class, p237x7.e.class, p237x7.f.class, p237x7.g.class, p237x7.h.class, p237x7.i.class, p237x7.j.class, p237x7.k.class, p237x7.m.class, p237x7.n.class, p237x7.o.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(listP2, 10));
        for (java.lang.Object obj : listP2) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            arrayList3.add(p087i7.B.a((java.lang.Class) obj, java.lang.Integer.valueOf(i6)));
            i6 = i10;
        }
        f14582d = p097j7.S.q(arrayList3);
    }

    public static final p138n8.b a(java.lang.Class cls) {
        p138n8.b bVarM;
        p138n8.b bVarA;
        p247y7.AbstractC7350t.f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            java.lang.String simpleName = cls.getSimpleName();
            p247y7.AbstractC7350t.e(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                java.lang.Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (bVarA = a(declaringClass)) == null || (bVarM = bVarA.d(p138n8.f.o(cls.getSimpleName()))) == null) {
                    bVarM = p138n8.b.m(new p138n8.c(cls.getName()));
                }
                p247y7.AbstractC7350t.c(bVarM);
                return bVarM;
            }
        }
        p138n8.c cVar = new p138n8.c(cls.getName());
        return new p138n8.b(cVar.e(), p138n8.c.k(cVar.g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String b(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                java.lang.String name = cls.getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                return S8.r.Q(name, '.', '/', false, 4, null);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('L');
            java.lang.String name2 = cls.getName();
            p247y7.AbstractC7350t.e(name2, "getName(...)");
            sb.append(S8.r.Q(name2, '.', '/', false, 4, null));
            sb.append(';');
            return sb.toString();
        }
        java.lang.String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final java.lang.Integer c(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        return (java.lang.Integer) f14582d.get(cls);
    }

    public static final java.util.List d(java.lang.reflect.Type type) {
        p247y7.AbstractC7350t.f(type, "<this>");
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            return p097j7.AbstractC6879v.m();
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return R8.k.M(R8.k.B(R8.k.n(type, U7.d.a.f14583D), U7.d.b.f14584D));
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        p247y7.AbstractC7350t.e(actualTypeArguments, "getActualTypeArguments(...)");
        return p097j7.AbstractC6872n.R0(actualTypeArguments);
    }

    public static final java.lang.Class e(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        return (java.lang.Class) f14580b.get(cls);
    }

    public static final java.lang.ClassLoader f(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        p247y7.AbstractC7350t.e(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final java.lang.Class g(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        return (java.lang.Class) f14581c.get(cls);
    }

    public static final boolean h(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        return java.lang.Enum.class.isAssignableFrom(cls);
    }
}
