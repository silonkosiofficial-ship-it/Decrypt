package Z8;

/* JADX INFO: renamed from: Z8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1865b extends Z8.C1867d {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p237x7.p f16811G;

    /* JADX INFO: renamed from: Z8.b$a */
    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16812F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16813G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f16815I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16813G = obj;
            this.f16815I |= Integer.MIN_VALUE;
            return Z8.C1865b.this.h(null, this);
        }
    }

    public C1865b(p237x7.p pVar, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        super(pVar, iVar, i6, enumC1863d);
        this.f16811G = pVar;
    }

    public /* synthetic */ C1865b(p237x7.p pVar, p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(pVar, (i10 & 2) != 0 ? p127m7.j.f51198C : iVar, (i10 & 4) != 0 ? -2 : i6, (i10 & 8) != 0 ? Y8.EnumC1863d.SUSPEND : enumC1863d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // Z8.C1867d, p009a9.e
    protected java.lang.Object h(Y8.z zVar, p127m7.e eVar) {
        Z8.C1865b.a aVar;
        if (eVar instanceof Z8.C1865b.a) {
            aVar = (Z8.C1865b.a) eVar;
            int i6 = aVar.f16815I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f16815I = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new Z8.C1865b.a(eVar);
            }
        } else {
            aVar = new Z8.C1865b.a(eVar);
        }
        java.lang.Object obj = aVar.f16813G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f16815I;
        if (i10 == 0) {
            p087i7.x.b(obj);
            aVar.f16812F = zVar;
            aVar.f16815I = 1;
            if (super.h(zVar, aVar) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (Y8.z) aVar.f16812F;
            p087i7.x.b(obj);
        }
        if (zVar.m()) {
            return p087i7.M.f46721a;
        }
        throw new java.lang.IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // Z8.C1867d, p009a9.e
    protected p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return new Z8.C1865b(this.f16811G, iVar, i6, enumC1863d);
    }
}
