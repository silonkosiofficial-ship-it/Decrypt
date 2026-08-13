package p166q5;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f53132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.io.File f53133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.io.File f53134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.io.File f53135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.io.File f53136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.io.File f53137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.io.File f53138g;

    public g(android.content.Context context) {
        java.lang.String str;
        java.lang.String strD = p076h5.j.f46504a.e(context).d();
        this.f53132a = strD;
        java.io.File filesDir = context.getFilesDir();
        this.f53133b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + java.io.File.separator + x(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        java.io.File fileT = t(new java.io.File(filesDir, str));
        this.f53134c = fileT;
        this.f53135d = t(new java.io.File(fileT, "open-sessions"));
        this.f53136e = t(new java.io.File(fileT, "reports"));
        this.f53137f = t(new java.io.File(fileT, "priority-reports"));
        this.f53138g = t(new java.io.File(fileT, "native-reports"));
    }

    private void b(java.lang.String str) {
        java.io.File file = new java.io.File(this.f53133b, str);
        if (file.exists() && v(file)) {
            p076h5.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final java.lang.String str) {
        java.lang.String[] list;
        if (!this.f53133b.exists() || (list = this.f53133b.list(new java.io.FilenameFilter() { // from class: q5.f
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str2) {
                return p166q5.g.s(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (java.lang.String str2 : list) {
            b(str2);
        }
    }

    private java.io.File p(java.lang.String str) {
        return u(new java.io.File(this.f53135d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(java.lang.String str, java.io.File file, java.lang.String str2) {
        return str2.startsWith(str);
    }

    private static synchronized java.io.File t(java.io.File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                p076h5.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                p076h5.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private static java.io.File u(java.io.File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static java.util.List w(java.lang.Object[] objArr) {
        return objArr == null ? java.util.Collections.emptyList() : java.util.Arrays.asList(objArr);
    }

    static java.lang.String x(java.lang.String str) {
        return str.length() > 40 ? p106k5.AbstractC6898i.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f53132a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + java.io.File.pathSeparator);
        }
    }

    public boolean e(java.lang.String str) {
        return v(new java.io.File(this.f53135d, str));
    }

    public java.util.List f() {
        return w(this.f53135d.list());
    }

    public java.io.File g(java.lang.String str) {
        return new java.io.File(this.f53134c, str);
    }

    public java.util.List h(java.io.FilenameFilter filenameFilter) {
        return w(this.f53134c.listFiles(filenameFilter));
    }

    public java.io.File i(java.lang.String str) {
        return new java.io.File(this.f53138g, str);
    }

    public java.util.List j() {
        return w(this.f53138g.listFiles());
    }

    public java.io.File k(java.lang.String str) {
        return u(new java.io.File(p(str), "native"));
    }

    public java.io.File l(java.lang.String str) {
        return new java.io.File(this.f53137f, str);
    }

    public java.util.List m() {
        return w(this.f53137f.listFiles());
    }

    public java.io.File n(java.lang.String str) {
        return new java.io.File(this.f53136e, str);
    }

    public java.util.List o() {
        return w(this.f53136e.listFiles());
    }

    public java.io.File q(java.lang.String str, java.lang.String str2) {
        return new java.io.File(p(str), str2);
    }

    public java.util.List r(java.lang.String str, java.io.FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
