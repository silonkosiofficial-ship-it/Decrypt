package H7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* synthetic */ class a extends p247y7.AbstractC7347p implements p237x7.p {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final H7.d.a f4395L = new H7.d.a();

        a() {
            super(2);
        }

        @Override // p247y7.AbstractC7337f, F7.b
        public final java.lang.String getName() {
            return "loadFunction";
        }

        @Override // p247y7.AbstractC7337f
        public final F7.e k() {
            return p247y7.P.b(B8.x.class);
        }

        @Override // p247y7.AbstractC7337f
        public final java.lang.String n() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final O7.Z u(B8.x xVar, p088i8.i iVar) {
            p247y7.AbstractC7350t.f(xVar, "p0");
            p247y7.AbstractC7350t.f(iVar, "p1");
            return xVar.j(iVar);
        }
    }

    public static final F7.f a(p087i7.InterfaceC6663i interfaceC6663i) {
        p247y7.AbstractC7350t.f(interfaceC6663i, "<this>");
        kotlin.Metadata metadata = (kotlin.Metadata) com.napsternetlabs.napsternetv.ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a.wuzl(interfaceC6663i.getClass(), kotlin.Metadata.class);
        if (metadata == null) {
            return null;
        }
        java.lang.String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        p087i7.u uVarJ = p128m8.i.j(strArrD1, metadata.d2());
        p128m8.f fVar = (p128m8.f) uVarJ.a();
        p088i8.i iVar = (p088i8.i) uVarJ.b();
        p128m8.e eVar = new p128m8.e(metadata.mv(), (metadata.xi() & 8) != 0);
        java.lang.Class<?> cls = interfaceC6663i.getClass();
        p088i8.t tVarN0 = iVar.n0();
        p247y7.AbstractC7350t.e(tVarN0, "getTypeTable(...)");
        return new I7.o(I7.C1270f.f5355F, (O7.Z) I7.M.h(cls, iVar, fVar, new p108k8.g(tVarN0), eVar, H7.d.a.f4395L));
    }
}
