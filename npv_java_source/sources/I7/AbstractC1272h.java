package I7;

/* JADX INFO: renamed from: I7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1272h {

    /* JADX INFO: renamed from: I7.h$a */
    public static final class a extends I7.AbstractC1272h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Class f5356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.List f5357b;

        /* JADX INFO: renamed from: I7.h$a$a, reason: collision with other inner class name */
        static final class C0124a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final I7.AbstractC1272h.a.C0124a f5358D = new I7.AbstractC1272h.a.C0124a();

            C0124a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence l(java.lang.reflect.Method method) {
                java.lang.Class<?> returnType = method.getReturnType();
                p247y7.AbstractC7350t.e(returnType, "getReturnType(...)");
                return U7.d.b(returnType);
            }
        }

        /* JADX INFO: renamed from: I7.h$a$b */
        public static final class b implements java.util.Comparator {
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return p117l7.a.d(((java.lang.reflect.Method) obj).getName(), ((java.lang.reflect.Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.Class cls) {
            super(null);
            p247y7.AbstractC7350t.f(cls, "jClass");
            this.f5356a = cls;
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            p247y7.AbstractC7350t.e(declaredMethods, "getDeclaredMethods(...)");
            this.f5357b = p097j7.AbstractC6872n.I0(declaredMethods, new I7.AbstractC1272h.a.b());
        }

        @Override // I7.AbstractC1272h
        public java.lang.String a() {
            return p097j7.AbstractC6879v.r0(this.f5357b, "", "<init>(", ")V", 0, null, I7.AbstractC1272h.a.C0124a.f5358D, 24, null);
        }

        public final java.util.List b() {
            return this.f5357b;
        }
    }

    /* JADX INFO: renamed from: I7.h$b */
    public static final class b extends I7.AbstractC1272h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Constructor f5359a;

        /* JADX INFO: renamed from: I7.h$b$a */
        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final I7.AbstractC1272h.b.a f5360D = new I7.AbstractC1272h.b.a();

            a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence l(java.lang.Class cls) {
                p247y7.AbstractC7350t.c(cls);
                return U7.d.b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.reflect.Constructor constructor) {
            super(null);
            p247y7.AbstractC7350t.f(constructor, "constructor");
            this.f5359a = constructor;
        }

        @Override // I7.AbstractC1272h
        public java.lang.String a() {
            java.lang.Class<?>[] parameterTypes = this.f5359a.getParameterTypes();
            p247y7.AbstractC7350t.e(parameterTypes, "getParameterTypes(...)");
            return p097j7.AbstractC6872n.w0(parameterTypes, "", "<init>(", ")V", 0, null, I7.AbstractC1272h.b.a.f5360D, 24, null);
        }

        public final java.lang.reflect.Constructor b() {
            return this.f5359a;
        }
    }

    /* JADX INFO: renamed from: I7.h$c */
    public static final class c extends I7.AbstractC1272h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f5361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(java.lang.reflect.Method method) {
            super(null);
            p247y7.AbstractC7350t.f(method, "method");
            this.f5361a = method;
        }

        @Override // I7.AbstractC1272h
        public java.lang.String a() {
            return I7.J.b(this.f5361a);
        }

        public final java.lang.reflect.Method b() {
            return this.f5361a;
        }
    }

    /* JADX INFO: renamed from: I7.h$d */
    public static final class d extends I7.AbstractC1272h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m8.d.b f5362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f5363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m8.d.b bVar) {
            super(null);
            p247y7.AbstractC7350t.f(bVar, "signature");
            this.f5362a = bVar;
            this.f5363b = bVar.a();
        }

        @Override // I7.AbstractC1272h
        public java.lang.String a() {
            return this.f5363b;
        }

        public final java.lang.String b() {
            return this.f5362a.b();
        }
    }

    /* JADX INFO: renamed from: I7.h$e */
    public static final class e extends I7.AbstractC1272h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m8.d.b f5364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f5365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m8.d.b bVar) {
            super(null);
            p247y7.AbstractC7350t.f(bVar, "signature");
            this.f5364a = bVar;
            this.f5365b = bVar.a();
        }

        @Override // I7.AbstractC1272h
        public java.lang.String a() {
            return this.f5365b;
        }

        public final java.lang.String b() {
            return this.f5364a.b();
        }

        public final java.lang.String c() {
            return this.f5364a.c();
        }
    }

    private AbstractC1272h() {
    }

    public /* synthetic */ AbstractC1272h(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract java.lang.String a();
}
