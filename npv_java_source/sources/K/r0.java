package K;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p237x7.l f5904a = K.r0.a.f5905L;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final K.r0.a f5905L = new K.r0.a();

        a() {
            super(1, K.m0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final K.m0 l(android.view.View view) {
            return new K.m0(view);
        }
    }

    public static final K.q0 b() {
        return new K.C1279a();
    }

    public static final p237x7.l c() {
        return f5904a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(android.view.inputmethod.EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f.c().x(editorInfo);
        }
    }
}
