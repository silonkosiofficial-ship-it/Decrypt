package p176r5;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p146o5.j f53955c = new p146o5.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.String f53956d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.lang.String f53957e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final W2.g f53958f = new W2.g() { // from class: r5.a
        @Override // W2.g
        public final java.lang.Object apply(java.lang.Object obj) {
            return p176r5.b.d((p136n5.F) obj);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p176r5.e f53959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W2.g f53960b;

    b(p176r5.e eVar, W2.g gVar) {
        this.f53959a = eVar;
        this.f53960b = gVar;
    }

    public static p176r5.b b(android.content.Context context, p186s5.j jVar, p106k5.M m6) {
        Y2.u.f(context);
        W2.i iVarG = Y2.u.c().g(new com.google.android.datatransport.cct.a(f53956d, f53957e));
        W2.b bVarB = W2.b.b("json");
        W2.g gVar = f53958f;
        return new p176r5.b(new p176r5.e(iVarG.a("FIREBASE_CRASHLYTICS_REPORT", p136n5.F.class, bVarB, gVar), jVar.b(), m6), gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(p136n5.F f6) {
        return f53955c.M(f6).getBytes(java.nio.charset.Charset.forName("UTF-8"));
    }

    private static java.lang.String e(java.lang.String str, java.lang.String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new java.lang.IllegalArgumentException("Invalid input received");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + str2.length());
        for (int i6 = 0; i6 < str.length(); i6++) {
            sb.append(str.charAt(i6));
            if (str2.length() > i6) {
                sb.append(str2.charAt(i6));
            }
        }
        return sb.toString();
    }

    public p115l4.AbstractC6931l c(p106k5.AbstractC6914z abstractC6914z, boolean z6) {
        return this.f53959a.i(abstractC6914z, z6).a();
    }
}
