package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.AssetManager f22905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f22906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.profileinstaller.i.c f22907c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.io.File f22909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f22910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f22911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f22912h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.profileinstaller.e[] f22914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f22915k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22913i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f22908d = d();

    public d(android.content.res.AssetManager assetManager, java.util.concurrent.Executor executor, androidx.profileinstaller.i.c cVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.File file) {
        this.f22905a = assetManager;
        this.f22906b = executor;
        this.f22907c = cVar;
        this.f22910f = str;
        this.f22911g = str2;
        this.f22912h = str3;
        this.f22909e = file;
    }

    private androidx.profileinstaller.d b(androidx.profileinstaller.e[] eVarArr, byte[] bArr) {
        androidx.profileinstaller.i.c cVar;
        int i6;
        try {
            java.io.InputStream inputStreamH = h(this.f22905a, this.f22912h);
            if (inputStreamH == null) {
                if (inputStreamH != null) {
                    inputStreamH.close();
                }
                return null;
            }
            try {
                this.f22914j = androidx.profileinstaller.n.q(inputStreamH, androidx.profileinstaller.n.o(inputStreamH, androidx.profileinstaller.n.f22943b), bArr, eVarArr);
                inputStreamH.close();
                return this;
            } catch (java.lang.Throwable th) {
                try {
                    inputStreamH.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e6) {
            e = e6;
            cVar = this.f22907c;
            i6 = 9;
            cVar.b(i6, e);
        } catch (java.io.IOException e10) {
            e = e10;
            cVar = this.f22907c;
            i6 = 7;
            cVar.b(i6, e);
        } catch (java.lang.IllegalStateException e11) {
            e = e11;
            this.f22914j = null;
            cVar = this.f22907c;
            i6 = 8;
            cVar.b(i6, e);
        }
    }

    private void c() {
        if (!this.f22913i) {
            throw new java.lang.IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 24 || i6 > 34) {
            return null;
        }
        switch (i6) {
            case 24:
            case 25:
                return androidx.profileinstaller.p.f22958e;
            case 26:
                return androidx.profileinstaller.p.f22957d;
            case 27:
                return androidx.profileinstaller.p.f22956c;
            case 28:
            case 29:
            case 30:
                return androidx.profileinstaller.p.f22955b;
            case 31:
            case 32:
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
            case 34:
                return androidx.profileinstaller.p.f22954a;
            default:
                return null;
        }
    }

    private java.io.InputStream f(android.content.res.AssetManager assetManager) {
        androidx.profileinstaller.i.c cVar;
        int i6;
        try {
            return h(assetManager, this.f22911g);
        } catch (java.io.FileNotFoundException e6) {
            e = e6;
            cVar = this.f22907c;
            i6 = 6;
            cVar.b(i6, e);
            return null;
        } catch (java.io.IOException e10) {
            e = e10;
            cVar = this.f22907c;
            i6 = 7;
            cVar.b(i6, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i6, java.lang.Object obj) {
        this.f22907c.b(i6, obj);
    }

    private java.io.InputStream h(android.content.res.AssetManager assetManager, java.lang.String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (java.io.FileNotFoundException e6) {
            java.lang.String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f22907c.a(5, null);
            }
            return null;
        }
    }

    private androidx.profileinstaller.e[] j(java.io.InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        androidx.profileinstaller.e[] eVarArrW = androidx.profileinstaller.n.w(inputStream, androidx.profileinstaller.n.o(inputStream, androidx.profileinstaller.n.f22942a), this.f22910f);
                        try {
                            return eVarArrW;
                        } catch (java.io.IOException e6) {
                            return eVarArrW;
                        }
                    } catch (java.io.IOException e10) {
                        this.f22907c.b(7, e10);
                        return null;
                    }
                } catch (java.lang.IllegalStateException e11) {
                    this.f22907c.b(8, e11);
                    inputStream.close();
                    return null;
                }
            } catch (java.io.IOException e12) {
                this.f22907c.b(7, e12);
                inputStream.close();
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (java.io.IOException e13) {
                this.f22907c.b(7, e13);
            }
        }
    }

    private static boolean k() {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 24 || i6 > 34) {
            return false;
        }
        if (i6 != 24 && i6 != 25) {
            switch (i6) {
                case 31:
                case 32:
                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i6, final java.lang.Object obj) {
        this.f22906b.execute(new java.lang.Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f22902C.g(i6, obj);
            }
        });
    }

    public boolean e() {
        if (this.f22908d == null) {
            l(3, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f22909e.exists()) {
            try {
                this.f22909e.createNewFile();
            } catch (java.io.IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f22909e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f22913i = true;
        return true;
    }

    public androidx.profileinstaller.d i() {
        androidx.profileinstaller.d dVarB;
        c();
        if (this.f22908d == null) {
            return this;
        }
        java.io.InputStream inputStreamF = f(this.f22905a);
        if (inputStreamF != null) {
            this.f22914j = j(inputStreamF);
        }
        androidx.profileinstaller.e[] eVarArr = this.f22914j;
        return (eVarArr == null || !k() || (dVarB = b(eVarArr, this.f22908d)) == null) ? this : dVarB;
    }

    public androidx.profileinstaller.d m() {
        androidx.profileinstaller.i.c cVar;
        int i6;
        androidx.profileinstaller.e[] eVarArr = this.f22914j;
        byte[] bArr = this.f22908d;
        if (eVarArr != null && bArr != null) {
            c();
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    androidx.profileinstaller.n.E(byteArrayOutputStream, bArr);
                    if (!androidx.profileinstaller.n.B(byteArrayOutputStream, bArr, eVarArr)) {
                        this.f22907c.b(5, null);
                        this.f22914j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f22915k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f22914j = null;
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e6) {
                e = e6;
                cVar = this.f22907c;
                i6 = 7;
                cVar.b(i6, e);
            } catch (java.lang.IllegalStateException e10) {
                e = e10;
                cVar = this.f22907c;
                i6 = 8;
                cVar.b(i6, e);
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f22915k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.f22909e);
                    try {
                        androidx.profileinstaller.f.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        this.f22915k = null;
                        this.f22914j = null;
                        return true;
                    } catch (java.lang.Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th5) {
                this.f22915k = null;
                this.f22914j = null;
                throw th5;
            }
        } catch (java.io.FileNotFoundException e6) {
            l(6, e6);
            this.f22915k = null;
            this.f22914j = null;
            return false;
        } catch (java.io.IOException e10) {
            l(7, e10);
            this.f22915k = null;
            this.f22914j = null;
            return false;
        }
    }
}
