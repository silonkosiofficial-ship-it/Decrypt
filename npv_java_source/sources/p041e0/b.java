package p041e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f44468a = 36;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p041e0.j f44469D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p041e0.j jVar) {
            super(2);
            this.f44469D = jVar;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.InterfaceC1753w0 u(p041e0.l lVar, V.InterfaceC1753w0 interfaceC1753w0) {
            if (!(interfaceC1753w0 instanceof p051f0.q)) {
                throw new java.lang.IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
            }
            java.lang.Object objB = this.f44469D.b(lVar, interfaceC1753w0.getValue());
            if (objB == null) {
                return null;
            }
            V.u1 u1VarC = ((p051f0.q) interfaceC1753w0).c();
            p247y7.AbstractC7350t.d(u1VarC, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return V.v1.h(objB, u1VarC);
        }
    }

    /* JADX INFO: renamed from: e0.b$b, reason: collision with other inner class name */
    static final class C0493b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p041e0.j f44470D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0493b(p041e0.j jVar) {
            super(1);
            this.f44470D = jVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.InterfaceC1753w0 l(V.InterfaceC1753w0 interfaceC1753w0) {
            java.lang.Object objA;
            if (!(interfaceC1753w0 instanceof p051f0.q)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            if (interfaceC1753w0.getValue() != null) {
                p041e0.j jVar = this.f44470D;
                java.lang.Object value = interfaceC1753w0.getValue();
                p247y7.AbstractC7350t.c(value);
                objA = jVar.a(value);
            } else {
                objA = null;
            }
            V.u1 u1VarC = ((p051f0.q) interfaceC1753w0).c();
            p247y7.AbstractC7350t.d(u1VarC, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
            V.InterfaceC1753w0 interfaceC1753w0H = V.v1.h(objA, u1VarC);
            p247y7.AbstractC7350t.d(interfaceC1753w0H, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
            return interfaceC1753w0H;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p041e0.c f44471D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p041e0.j f44472E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p041e0.g f44473F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ java.lang.String f44474G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44475H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ java.lang.Object[] f44476I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p041e0.c cVar, p041e0.j jVar, p041e0.g gVar, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
            super(0);
            this.f44471D = cVar;
            this.f44472E = jVar;
            this.f44473F = gVar;
            this.f44474G = str;
            this.f44475H = obj;
            this.f44476I = objArr;
        }

        public final void a() {
            this.f44471D.i(this.f44472E, this.f44473F, this.f44474G, this.f44475H, this.f44476I);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public static final java.lang.String b(java.lang.Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final p041e0.j c(p041e0.j jVar) {
        p247y7.AbstractC7350t.d(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return p041e0.k.a(new e0.b.a(jVar), new p041e0.b.C0493b(jVar));
    }

    public static final V.InterfaceC1753w0 d(java.lang.Object[] objArr, p041e0.j jVar, java.lang.String str, p237x7.a aVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-202053668, i6, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) e(java.util.Arrays.copyOf(objArr, objArr.length), c(jVar), str2, aVar, interfaceC1734n, i6 & 8064, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return interfaceC1753w0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:V.n), (r14v9 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final java.lang.Object e(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:V.n), (r14v9 ?? I:java.lang.Object) INTERFACE call: V.n.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p041e0.g gVar, java.lang.Object obj) {
        java.lang.String strB;
        if (obj == null || gVar.a(obj)) {
            return;
        }
        if (obj instanceof p051f0.q) {
            p051f0.q qVar = (p051f0.q) obj;
            if (qVar.c() == V.v1.j() || qVar.c() == V.v1.p() || qVar.c() == V.v1.m()) {
                strB = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strB = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strB = b(obj);
        }
        throw new java.lang.IllegalArgumentException(strB);
    }
}
