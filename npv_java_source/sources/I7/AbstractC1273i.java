package I7;

/* JADX INFO: renamed from: I7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1273i {

    /* JADX INFO: renamed from: I7.i$a */
    public static final class a extends I7.AbstractC1273i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Field f5366a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.reflect.Field field) {
            super(null);
            p247y7.AbstractC7350t.f(field, "field");
            this.f5366a = field;
        }

        @Override // I7.AbstractC1273i
        public java.lang.String a() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String name = this.f5366a.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            sb.append(X7.A.b(name));
            sb.append("()");
            java.lang.Class<?> type = this.f5366a.getType();
            p247y7.AbstractC7350t.e(type, "getType(...)");
            sb.append(U7.d.b(type));
            return sb.toString();
        }

        public final java.lang.reflect.Field b() {
            return this.f5366a;
        }
    }

    /* JADX INFO: renamed from: I7.i$b */
    public static final class b extends I7.AbstractC1273i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.reflect.Method f5367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.reflect.Method f5368b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            super(null);
            p247y7.AbstractC7350t.f(method, "getterMethod");
            this.f5367a = method;
            this.f5368b = method2;
        }

        @Override // I7.AbstractC1273i
        public java.lang.String a() {
            return I7.J.b(this.f5367a);
        }

        public final java.lang.reflect.Method b() {
            return this.f5367a;
        }

        public final java.lang.reflect.Method c() {
            return this.f5368b;
        }
    }

    /* JADX INFO: renamed from: I7.i$c */
    public static final class c extends I7.AbstractC1273i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final O7.U f5369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p088i8.n f5370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l8.a.d f5371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p108k8.c f5372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p108k8.g f5373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final java.lang.String f5374f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O7.U u6, p088i8.n nVar, l8.a.d dVar, p108k8.c cVar, p108k8.g gVar) {
            java.lang.String str;
            super(null);
            p247y7.AbstractC7350t.f(u6, "descriptor");
            p247y7.AbstractC7350t.f(nVar, "proto");
            p247y7.AbstractC7350t.f(dVar, "signature");
            p247y7.AbstractC7350t.f(cVar, "nameResolver");
            p247y7.AbstractC7350t.f(gVar, "typeTable");
            this.f5369a = u6;
            this.f5370b = nVar;
            this.f5371c = dVar;
            this.f5372d = cVar;
            this.f5373e = gVar;
            if (dVar.G()) {
                str = cVar.getString(dVar.B().x()) + cVar.getString(dVar.B().w());
            } else {
                m8.d.a aVarD = p128m8.i.d(p128m8.i.f51228a, nVar, cVar, gVar, false, 8, null);
                if (aVarD == null) {
                    throw new I7.D("No field signature for property: " + u6);
                }
                java.lang.String strD = aVarD.d();
                str = X7.A.b(strD) + c() + "()" + aVarD.e();
            }
            this.f5374f = str;
        }

        private final java.lang.String c() {
            java.lang.StringBuilder sb;
            java.lang.String strG;
            java.lang.String string;
            O7.InterfaceC1432m interfaceC1432mB = this.f5369a.b();
            p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
            if (p247y7.AbstractC7350t.b(this.f5369a.h(), O7.AbstractC1438t.f8185d) && (interfaceC1432mB instanceof D8.d)) {
                p088i8.c cVarJ1 = ((D8.d) interfaceC1432mB).j1();
                p8.i.f fVar = p118l8.a.f50080i;
                p247y7.AbstractC7350t.e(fVar, "classModuleName");
                java.lang.Integer num = (java.lang.Integer) p108k8.e.a(cVarJ1, fVar);
                if (num == null || (string = this.f5372d.getString(num.intValue())) == null) {
                    string = "main";
                }
                sb = new java.lang.StringBuilder();
                sb.append('$');
                strG = p138n8.g.b(string);
            } else {
                if (!p247y7.AbstractC7350t.b(this.f5369a.h(), O7.AbstractC1438t.f8182a) || !(interfaceC1432mB instanceof O7.K)) {
                    return "";
                }
                O7.U u6 = this.f5369a;
                p247y7.AbstractC7350t.d(u6, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                D8.f fVarK0 = ((D8.j) u6).k0();
                if (!(fVarK0 instanceof p068g8.n)) {
                    return "";
                }
                p068g8.n nVar = (p068g8.n) fVarK0;
                if (nVar.f() == null) {
                    return "";
                }
                sb = new java.lang.StringBuilder();
                sb.append('$');
                strG = nVar.h().g();
            }
            sb.append(strG);
            return sb.toString();
        }

        @Override // I7.AbstractC1273i
        public java.lang.String a() {
            return this.f5374f;
        }

        public final O7.U b() {
            return this.f5369a;
        }

        public final p108k8.c d() {
            return this.f5372d;
        }

        public final p088i8.n e() {
            return this.f5370b;
        }

        public final l8.a.d f() {
            return this.f5371c;
        }

        public final p108k8.g g() {
            return this.f5373e;
        }
    }

    /* JADX INFO: renamed from: I7.i$d */
    public static final class d extends I7.AbstractC1273i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I7.AbstractC1272h.e f5375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final I7.AbstractC1272h.e f5376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(I7.AbstractC1272h.e eVar, I7.AbstractC1272h.e eVar2) {
            super(null);
            p247y7.AbstractC7350t.f(eVar, "getterSignature");
            this.f5375a = eVar;
            this.f5376b = eVar2;
        }

        @Override // I7.AbstractC1273i
        public java.lang.String a() {
            return this.f5375a.a();
        }

        public final I7.AbstractC1272h.e b() {
            return this.f5375a;
        }

        public final I7.AbstractC1272h.e c() {
            return this.f5376b;
        }
    }

    private AbstractC1273i() {
    }

    public /* synthetic */ AbstractC1273i(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public abstract java.lang.String a();
}
