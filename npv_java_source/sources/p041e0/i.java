package p041e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f44514a = V.AbstractC1756y.f(e0.i.a.f44515D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e0.i.a f44515D = new e0.i.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p041e0.g b() {
            return null;
        }
    }

    public static final p041e0.g a(java.util.Map map, p237x7.l lVar) {
        return new p041e0.h(map, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!S8.AbstractC1628a.c(charSequence.charAt(i6))) {
                return false;
            }
        }
        return true;
    }

    public static final V.O0 d() {
        return f44514a;
    }
}
