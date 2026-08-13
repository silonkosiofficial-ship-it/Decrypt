package Y4;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Z4.b f16400b = new Z4.b(Y4.p.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p046e5.x f16401a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16402a;

        static {
            int[] iArr = new int[Y4.p.b.values().length];
            f16402a = iArr;
            try {
                iArr[Y4.p.b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f16402a[Y4.p.b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public p(final android.content.Context context, java.lang.String str) {
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.f(str);
        final java.lang.String str2 = java.lang.String.format("com.google.firebase.appcheck.store.%s", str);
        this.f16401a = new p046e5.x(new F5.b() { // from class: Y4.o
            @Override // F5.b
            public final java.lang.Object get() {
                return Y4.p.c(context, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object c(android.content.Context context, java.lang.String str) {
        return context.getSharedPreferences(str, 0);
    }

    void b() {
        ((android.content.SharedPreferences) this.f16401a.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    public V4.c d() {
        java.lang.String string = ((android.content.SharedPreferences) this.f16401a.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        java.lang.String string2 = ((android.content.SharedPreferences) this.f16401a.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i6 = Y4.p.a.f16402a[Y4.p.b.valueOf(string).ordinal()];
                if (i6 == 1) {
                    return Y4.b.e(string2);
                }
                if (i6 == 2) {
                    return Y4.b.d(string2);
                }
                f16400b.d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (java.lang.IllegalArgumentException e6) {
                f16400b.d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e6.getMessage());
                b();
            }
        }
        return null;
    }

    public void e(V4.c cVar) {
        android.content.SharedPreferences.Editor editorPutString;
        Y4.p.b bVar;
        if (cVar instanceof Y4.b) {
            editorPutString = ((android.content.SharedPreferences) this.f16401a.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((Y4.b) cVar).i());
            bVar = Y4.p.b.DEFAULT_APP_CHECK_TOKEN;
        } else {
            editorPutString = ((android.content.SharedPreferences) this.f16401a.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", cVar.b());
            bVar = Y4.p.b.UNKNOWN_APP_CHECK_TOKEN;
        }
        editorPutString.putString("com.google.firebase.appcheck.TOKEN_TYPE", bVar.name()).apply();
    }
}
