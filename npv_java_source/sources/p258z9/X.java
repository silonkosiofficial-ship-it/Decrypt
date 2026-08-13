package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57714a;

        static {
            int[] iArr = new int[p249y9.EnumC7357a.values().length];
            try {
                iArr[p249y9.EnumC7357a.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p249y9.EnumC7357a.POLYMORPHIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p249y9.EnumC7357a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f57714a = iArr;
        }
    }

    public static final java.lang.String a(p219v9.f fVar, p249y9.AbstractC7358b abstractC7358b) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        for (java.lang.annotation.Annotation annotation : fVar.k()) {
            if (annotation instanceof p249y9.InterfaceC7362f) {
                return ((p249y9.InterfaceC7362f) annotation).discriminator();
            }
        }
        return abstractC7358b.e().e();
    }
}
