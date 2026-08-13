package J7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.Map f5779D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.util.Map map) {
            super(0);
            this.f5779D = map;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer b() {
            int iHashCode;
            int iHashCode2 = 0;
            for (java.util.Map.Entry entry : this.f5779D.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    iHashCode = java.util.Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    iHashCode = java.util.Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    iHashCode = java.util.Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    iHashCode = java.util.Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    iHashCode = java.util.Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    iHashCode = java.util.Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    iHashCode = java.util.Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    iHashCode = java.util.Arrays.hashCode((double[]) value);
                } else {
                    iHashCode = value instanceof java.lang.Object[] ? java.util.Arrays.hashCode((java.lang.Object[]) value) : value.hashCode();
                }
                iHashCode2 += iHashCode ^ (str.hashCode() * com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION);
            }
            return java.lang.Integer.valueOf(iHashCode2);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.lang.Class f5780D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.Map f5781E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final J7.c.b.a f5782D = new J7.c.b.a();

            a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence l(java.util.Map.Entry entry) {
                java.lang.String string;
                p247y7.AbstractC7350t.f(entry, "entry");
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = java.util.Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    string = java.util.Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    string = java.util.Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    string = java.util.Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    string = java.util.Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    string = java.util.Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    string = java.util.Arrays.toString((long[]) value);
                } else {
                    if (!(value instanceof double[])) {
                        if (value instanceof java.lang.Object[]) {
                            string = java.util.Arrays.toString((java.lang.Object[]) value);
                        } else {
                            string = value.toString();
                        }
                        return str + '=' + string;
                    }
                    string = java.util.Arrays.toString((double[]) value);
                }
                p247y7.AbstractC7350t.e(string, "toString(...)");
                return str + '=' + string;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Class cls, java.util.Map map) {
            super(0);
            this.f5780D = cls;
            this.f5781E = map;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.String b() throws java.io.IOException {
            java.lang.Class cls = this.f5780D;
            java.util.Map map = this.f5781E;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            p097j7.G.o0(map.entrySet(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : J7.c.b.a.f5782D);
            java.lang.String string = sb.toString();
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return string;
        }
    }

    public static final java.lang.Object d(java.lang.Class cls, java.util.Map map, java.util.List list) {
        p247y7.AbstractC7350t.f(cls, "annotationClass");
        p247y7.AbstractC7350t.f(map, "values");
        p247y7.AbstractC7350t.f(list, "methods");
        p087i7.InterfaceC6668n interfaceC6668nB = p087i7.AbstractC6669o.b(new J7.c.a(map));
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, new J7.b(cls, map, p087i7.AbstractC6669o.b(new J7.c.b(cls, map)), interfaceC6668nB, list));
        p247y7.AbstractC7350t.d(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ java.lang.Object e(java.lang.Class cls, java.util.Map map, java.util.List list, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(setKeySet, 10));
            java.util.Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), null));
            }
            list = arrayList;
        }
        return d(cls, map, list);
    }

    private static final boolean f(java.lang.Class cls, java.util.List list, java.util.Map map, java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        boolean zB;
        boolean z6;
        F7.c cVarA;
        java.lang.annotation.Annotation annotation = obj instanceof java.lang.annotation.Annotation ? (java.lang.annotation.Annotation) obj : null;
        if (!p247y7.AbstractC7350t.b((annotation == null || (cVarA = p227w7.a.a(annotation)) == null) ? null : p227w7.a.b(cVarA), cls)) {
            return false;
        }
        java.util.List<java.lang.reflect.Method> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            z6 = true;
        } else {
            for (java.lang.reflect.Method method : list2) {
                java.lang.Object obj2 = map.get(method.getName());
                java.lang.Object objInvoke = method.invoke(obj, null);
                if (obj2 instanceof boolean[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zB = java.util.Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zB = java.util.Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zB = java.util.Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zB = java.util.Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zB = java.util.Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zB = java.util.Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zB = java.util.Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zB = java.util.Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof java.lang.Object[]) {
                    p247y7.AbstractC7350t.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zB = java.util.Arrays.equals((java.lang.Object[]) obj2, (java.lang.Object[]) objInvoke);
                } else {
                    zB = p247y7.AbstractC7350t.b(obj2, objInvoke);
                }
                if (!zB) {
                    z6 = false;
                }
            }
            z6 = true;
        }
        return z6;
    }

    private static final int g(p087i7.InterfaceC6668n interfaceC6668n) {
        return ((java.lang.Number) interfaceC6668n.getValue()).intValue();
    }

    private static final java.lang.String h(p087i7.InterfaceC6668n interfaceC6668n) {
        return (java.lang.String) interfaceC6668n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object i(java.lang.Class cls, java.util.Map map, p087i7.InterfaceC6668n interfaceC6668n, p087i7.InterfaceC6668n interfaceC6668n2, java.util.List list, java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(cls, "$annotationClass");
        p247y7.AbstractC7350t.f(map, "$values");
        p247y7.AbstractC7350t.f(interfaceC6668n, "$toString$delegate");
        p247y7.AbstractC7350t.f(interfaceC6668n2, "$hashCode$delegate");
        p247y7.AbstractC7350t.f(list, "$methods");
        java.lang.String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return java.lang.Integer.valueOf(g(interfaceC6668n2));
                }
            } else if (name.equals("toString")) {
                return h(interfaceC6668n);
            }
        }
        if (p247y7.AbstractC7350t.b(name, "equals") && objArr != null && objArr.length == 1) {
            p247y7.AbstractC7350t.c(objArr);
            return java.lang.Boolean.valueOf(f(cls, list, map, p097j7.AbstractC6872n.F0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        sb.append(p097j7.AbstractC6872n.R0(objArr));
        sb.append(')');
        throw new I7.D(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x006d  */
    public static final java.lang.Void j(int i6, java.lang.String str, java.lang.Class cls) {
        F7.c cVarE;
        java.lang.Class cls2;
        java.lang.String strB;
        if (!p247y7.AbstractC7350t.b(cls, java.lang.Class.class)) {
            if (cls.isArray() && p247y7.AbstractC7350t.b(cls.getComponentType(), java.lang.Class.class)) {
                cls2 = F7.c[].class;
            } else {
                cVarE = p227w7.a.e(cls);
            }
            if (p247y7.AbstractC7350t.b(cVarE.b(), p247y7.P.b(java.lang.Object[].class).b())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cVarE.b());
                sb.append('<');
                java.lang.Class<?> componentType = p227w7.a.b(cVarE).getComponentType();
                p247y7.AbstractC7350t.e(componentType, "getComponentType(...)");
                sb.append(p227w7.a.e(componentType).b());
                sb.append('>');
                strB = sb.toString();
            } else {
                strB = cVarE.b();
            }
            throw new java.lang.IllegalArgumentException("Argument #" + i6 + ' ' + str + " is not of the required type " + strB);
        }
        cls2 = F7.c.class;
        cVarE = p247y7.P.b(cls2);
        if (p247y7.AbstractC7350t.b(cVarE.b(), p247y7.P.b(java.lang.Object[].class).b())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(cVarE.b());
            sb2.append('<');
            java.lang.Class<?> componentType2 = p227w7.a.b(cVarE).getComponentType();
            p247y7.AbstractC7350t.e(componentType2, "getComponentType(...)");
            sb2.append(p227w7.a.e(componentType2).b());
            sb2.append('>');
            strB = sb2.toString();
        } else {
            strB = cVarE.b();
        }
        throw new java.lang.IllegalArgumentException("Argument #" + i6 + ' ' + str + " is not of the required type " + strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object k(java.lang.Object obj, java.lang.Class cls) {
        if (obj instanceof java.lang.Class) {
            return null;
        }
        if (obj instanceof F7.c) {
            obj = p227w7.a.b((F7.c) obj);
        } else if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr instanceof java.lang.Class[]) {
                return null;
            }
            if (objArr instanceof F7.c[]) {
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                F7.c[] cVarArr = (F7.c[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(cVarArr.length);
                for (F7.c cVar : cVarArr) {
                    arrayList.add(p227w7.a.b(cVar));
                }
                obj = arrayList.toArray(new java.lang.Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
