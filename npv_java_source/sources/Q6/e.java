package Q6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f9093F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f9094G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f9095H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f9094G = obj;
            this.f9095H |= Integer.MIN_VALUE;
            return Q6.e.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(Q6.c cVar, java.nio.charset.Charset charset, p127m7.e eVar) throws java.lang.Throwable {
        Q6.e.a aVar;
        F7.o oVarP;
        java.nio.charset.CharsetDecoder charsetDecoder;
        if (eVar instanceof Q6.e.a) {
            aVar = (Q6.e.a) eVar;
            int i6 = aVar.f9095H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f9095H = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new Q6.e.a(eVar);
            }
        } else {
            aVar = new Q6.e.a(eVar);
        }
        java.lang.Object objA = aVar.f9094G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar.f9095H;
        if (i10 == 0) {
            p087i7.x.b(objA);
            java.nio.charset.Charset charsetA = T6.AbstractC1677z.a(cVar);
            if (charsetA != null) {
                charset = charsetA;
            }
            java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            D6.b bVarH0 = cVar.H0();
            F7.c cVarB = p247y7.P.b(p149o9.q.class);
            try {
                oVarP = p247y7.P.p(p149o9.q.class);
            } catch (java.lang.Throwable unused) {
                oVarP = null;
            }
            p017b7.a aVar2 = new p017b7.a(cVarB, oVarP);
            aVar.f9093F = charsetDecoderNewDecoder;
            aVar.f9095H = 1;
            objA = bVarH0.a(aVar2, aVar);
            if (objA == objG) {
                return objG;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charsetDecoder = (java.nio.charset.CharsetDecoder) aVar.f9093F;
            p087i7.x.b(objA);
        }
        if (objA == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
        }
        p247y7.AbstractC7350t.c(charsetDecoder);
        return p027c7.b.b(charsetDecoder, (p149o9.q) objA, 0, 2, null);
    }

    public static /* synthetic */ java.lang.Object b(Q6.c cVar, java.nio.charset.Charset charset, p127m7.e eVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            charset = S8.C1631d.f12624b;
        }
        return a(cVar, charset, eVar);
    }

    public static final O6.b c(Q6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        return cVar.H0().d();
    }
}
