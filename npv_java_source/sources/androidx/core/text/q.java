package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.core.text.p f21634a = new androidx.core.text.q.e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.core.text.p f21635b = new androidx.core.text.q.e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.core.text.p f21636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.core.text.p f21637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.core.text.p f21638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.core.text.p f21639f;

    private static class a implements androidx.core.text.q.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final androidx.core.text.q.a f21640b = new androidx.core.text.q.a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f21641a;

        private a(boolean z6) {
            this.f21641a = z6;
        }

        @Override // androidx.core.text.q.c
        public int a(java.lang.CharSequence charSequence, int i6, int i10) {
            int i11 = i10 + i6;
            boolean z6 = false;
            while (i6 < i11) {
                int iA = androidx.core.text.q.a(java.lang.Character.getDirectionality(charSequence.charAt(i6)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f21641a) {
                        return 1;
                    }
                    i6++;
                    z6 = z6;
                } else if (this.f21641a) {
                    return 0;
                }
                z6 = true;
                i6++;
                z6 = z6;
            }
            if (z6) {
                return this.f21641a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements androidx.core.text.q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final androidx.core.text.q.b f21642a = new androidx.core.text.q.b();

        private b() {
        }

        @Override // androidx.core.text.q.c
        public int a(java.lang.CharSequence charSequence, int i6, int i10) {
            int i11 = i10 + i6;
            int iB = 2;
            while (i6 < i11 && iB == 2) {
                iB = androidx.core.text.q.b(java.lang.Character.getDirectionality(charSequence.charAt(i6)));
                i6++;
            }
            return iB;
        }
    }

    private interface c {
        int a(java.lang.CharSequence charSequence, int i6, int i10);
    }

    private static abstract class d implements androidx.core.text.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.text.q.c f21643a;

        d(androidx.core.text.q.c cVar) {
            this.f21643a = cVar;
        }

        private boolean c(java.lang.CharSequence charSequence, int i6, int i10) {
            int iA = this.f21643a.a(charSequence, i6, i10);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.p
        public boolean a(java.lang.CharSequence charSequence, int i6, int i10) {
            if (charSequence == null || i6 < 0 || i10 < 0 || charSequence.length() - i10 < i6) {
                throw new java.lang.IllegalArgumentException();
            }
            return this.f21643a == null ? b() : c(charSequence, i6, i10);
        }

        protected abstract boolean b();
    }

    private static class e extends androidx.core.text.q.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21644b;

        e(androidx.core.text.q.c cVar, boolean z6) {
            super(cVar);
            this.f21644b = z6;
        }

        @Override // androidx.core.text.q.d
        protected boolean b() {
            return this.f21644b;
        }
    }

    private static class f extends androidx.core.text.q.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final androidx.core.text.q.f f21645b = new androidx.core.text.q.f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.q.d
        protected boolean b() {
            return androidx.core.text.r.a(java.util.Locale.getDefault()) == 1;
        }
    }

    static {
        androidx.core.text.q.b bVar = androidx.core.text.q.b.f21642a;
        f21636c = new androidx.core.text.q.e(bVar, false);
        f21637d = new androidx.core.text.q.e(bVar, true);
        f21638e = new androidx.core.text.q.e(androidx.core.text.q.a.f21640b, false);
        f21639f = androidx.core.text.q.f.f21645b;
    }

    static int a(int i6) {
        if (i6 != 0) {
            return (i6 == 1 || i6 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i6) {
        if (i6 != 0) {
            if (i6 == 1 || i6 == 2) {
                return 0;
            }
            switch (i6) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
