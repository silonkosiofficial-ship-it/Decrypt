package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20700a;

        static {
            int[] iArr = new int[androidx.compose.ui.window.t.values().length];
            try {
                iArr[androidx.compose.ui.window.t.SecureOff.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.window.t.SecureOn.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.window.t.Inherit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f20700a = iArr;
        }
    }

    public static final boolean a(androidx.compose.ui.window.t tVar, boolean z6) {
        int i6 = androidx.compose.ui.window.u.a.f20700a[tVar.ordinal()];
        if (i6 == 1) {
            return false;
        }
        if (i6 == 2) {
            return true;
        }
        if (i6 == 3) {
            return z6;
        }
        throw new p087i7.s();
    }
}
