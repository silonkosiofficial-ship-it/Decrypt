package p247y7;

/* JADX INFO: renamed from: y7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7340i implements F7.c, p247y7.InterfaceC7339h {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final p247y7.C7340i.a f57294D = new p247y7.C7340i.a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.util.Map f57295E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.util.HashMap f57296F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.HashMap f57297G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final java.util.HashMap f57298H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.util.Map f57299I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Class f57300C;

    /* JADX INFO: renamed from: y7.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.String a(java.lang.Class cls) {
            java.lang.String str;
            p247y7.AbstractC7350t.f(cls, "jClass");
            java.lang.String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                java.lang.String str3 = (java.lang.String) p247y7.C7340i.f57298H.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            java.lang.Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (java.lang.String) p247y7.C7340i.f57298H.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                p247y7.AbstractC7350t.f(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Laf
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L66
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L40
                p247y7.AbstractC7350t.c(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = S8.r.i1(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L40
            L3e:
                r1 = r2
                goto Laf
            L40:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                p247y7.AbstractC7350t.c(r0)
                if (r7 == 0) goto L61
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = S8.r.i1(r0, r7, r1, r3, r1)
                goto Laf
            L61:
                java.lang.String r1 = S8.r.h1(r0, r4, r1, r3, r1)
                goto Laf
            L66:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9a
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L97
                java.util.Map r0 = p247y7.C7340i.h()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L97
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L97:
                if (r1 != 0) goto Laf
                goto L3e
            L9a:
                java.util.Map r0 = p247y7.C7340i.h()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Laf
                java.lang.String r1 = r7.getSimpleName()
            Laf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p247y7.C7340i.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(java.lang.Object obj, java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "jClass");
            java.util.Map map = p247y7.C7340i.f57295E;
            p247y7.AbstractC7350t.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            java.lang.Integer num = (java.lang.Integer) map.get(cls);
            if (num != null) {
                return p247y7.W.m(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = p227w7.a.c(p227w7.a.e(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i6 = 0;
        java.util.List listP = p097j7.AbstractC6879v.p(p237x7.a.class, p237x7.l.class, p237x7.p.class, p237x7.q.class, p237x7.r.class, p237x7.s.class, p237x7.t.class, p237x7.u.class, p237x7.v.class, p237x7.w.class, p237x7.b.class, p237x7.c.class, p237x7.d.class, p237x7.e.class, p237x7.f.class, p237x7.g.class, p237x7.h.class, p237x7.i.class, p237x7.j.class, p237x7.k.class, p237x7.m.class, p237x7.n.class, p237x7.o.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listP, 10));
        for (java.lang.Object obj : listP) {
            int i10 = i6 + 1;
            if (i6 < 0) {
                p097j7.AbstractC6879v.w();
            }
            arrayList.add(p087i7.B.a((java.lang.Class) obj, java.lang.Integer.valueOf(i6)));
            i6 = i10;
        }
        f57295E = p097j7.S.q(arrayList);
        java.util.HashMap map = new java.util.HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f57296F = map;
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f57297G = map2;
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        java.util.Collection<java.lang.String> collectionValues = map.values();
        p247y7.AbstractC7350t.e(collectionValues, "<get-values>(...)");
        for (java.lang.String str : collectionValues) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("kotlin.jvm.internal.");
            p247y7.AbstractC7350t.c(str);
            sb.append(S8.r.l1(str, '.', null, 2, null));
            sb.append("CompanionObject");
            p087i7.u uVarA = p087i7.B.a(sb.toString(), str + ".Companion");
            map3.put(uVarA.c(), uVarA.d());
        }
        for (java.util.Map.Entry entry : f57295E.entrySet()) {
            map3.put(((java.lang.Class) entry.getKey()).getName(), "kotlin.Function" + ((java.lang.Number) entry.getValue()).intValue());
        }
        f57298H = map3;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p097j7.S.d(map3.size()));
        for (java.util.Map.Entry entry2 : map3.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.String str2 = (java.lang.String) entry2.getValue();
            p247y7.AbstractC7350t.c(str2);
            linkedHashMap.put(key, S8.r.l1(str2, '.', null, 2, null));
        }
        f57299I = linkedHashMap;
    }

    public C7340i(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        this.f57300C = cls;
    }

    private final java.lang.Void i() {
        throw new p227w7.b();
    }

    @Override // F7.c
    public java.lang.String b() {
        return f57294D.a(e());
    }

    @Override // F7.c
    public java.lang.String c() {
        return f57294D.b(e());
    }

    @Override // F7.c
    public boolean d(java.lang.Object obj) {
        return f57294D.c(obj, e());
    }

    @Override // p247y7.InterfaceC7339h
    public java.lang.Class e() {
        return this.f57300C;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p247y7.C7340i) && p247y7.AbstractC7350t.b(p227w7.a.c(this), p227w7.a.c((F7.c) obj));
    }

    @Override // F7.c
    public java.util.List g() {
        i();
        throw new p087i7.C6665k();
    }

    @Override // F7.c
    public int hashCode() {
        return p227w7.a.c(this).hashCode();
    }

    public java.lang.String toString() {
        return e() + " (Kotlin reflection is not available)";
    }
}
