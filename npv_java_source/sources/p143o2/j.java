package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z8.y f52430a;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        /* synthetic */ java.lang.Object f52431F;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f52433H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f52431F = obj;
            this.f52433H |= Integer.MIN_VALUE;
            return p143o2.j.this.a(null, this);
        }
    }

    public j(int i6) {
        this.f52430a = Z8.P.a(new int[i6]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        o2.j.a aVar;
        if (eVar instanceof o2.j.a) {
            aVar = (o2.j.a) eVar;
            int i6 = aVar.f52433H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f52433H = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new o2.j.a(eVar);
            }
        } else {
            aVar = new o2.j.a(eVar);
        }
        java.lang.Object obj = aVar.f52431F;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f52433H;
        if (i10 == 0) {
            p087i7.x.b(obj);
            Z8.y yVar = this.f52430a;
            aVar.f52433H = 1;
            if (yVar.b(interfaceC1870g, aVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
        }
        throw new p087i7.C6665k();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(java.util.Set set) {
        java.lang.Object value;
        int[] iArr;
        p247y7.AbstractC7350t.f(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        Z8.y yVar = this.f52430a;
        do {
            value = yVar.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = set.contains(java.lang.Integer.valueOf(i6)) ? iArr2[i6] + 1 : iArr2[i6];
            }
        } while (!yVar.g(value, iArr));
    }
}
