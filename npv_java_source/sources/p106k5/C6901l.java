package p106k5;

/* JADX INFO: renamed from: k5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6901l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.io.FilenameFilter f49633d = new java.io.FilenameFilter() { // from class: k5.j
        @Override // java.io.FilenameFilter
        public final boolean accept(java.io.File file, java.lang.String str) {
            return p106k5.C6901l.d(file, str);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Comparator f49634e = new java.util.Comparator() { // from class: k5.k
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p106k5.C6901l.e((java.io.File) obj, (java.io.File) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p166q5.g f49635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.String f49636b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f49637c = null;

    C6901l(p166q5.g gVar) {
        this.f49635a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(java.io.File file, java.lang.String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(java.io.File file, java.io.File file2) {
        return java.lang.Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(p166q5.g gVar, java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (java.io.IOException e6) {
            p076h5.g.f().l("Failed to persist App Quality Sessions session id.", e6);
        }
    }

    static java.lang.String g(p166q5.g gVar, java.lang.String str) {
        java.util.List listR = gVar.r(str, f49633d);
        if (!listR.isEmpty()) {
            return ((java.io.File) java.util.Collections.min(listR, f49634e)).getName().substring(4);
        }
        p076h5.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized java.lang.String c(java.lang.String str) {
        if (j$.util.Objects.equals(this.f49636b, str)) {
            return this.f49637c;
        }
        return g(this.f49635a, str);
    }

    public synchronized void h(java.lang.String str) {
        if (!j$.util.Objects.equals(this.f49637c, str)) {
            f(this.f49635a, this.f49636b, str);
            this.f49637c = str;
        }
    }

    public synchronized void i(java.lang.String str) {
        if (!j$.util.Objects.equals(this.f49636b, str)) {
            f(this.f49635a, str, this.f49637c);
            this.f49636b = str;
        }
    }
}
