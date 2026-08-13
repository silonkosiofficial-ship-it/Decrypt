package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5222tG implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int[] f38913I = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Handler f38914C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int[] f38915D = new int[1];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.opengl.EGLDisplay f38916E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.opengl.EGLContext f38917F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.opengl.EGLSurface f38918G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.graphics.SurfaceTexture f38919H;

    public RunnableC5222tG(android.os.Handler handler, com.google.android.gms.internal.ads.SF sf) {
        this.f38914C = handler;
    }

    public final android.graphics.SurfaceTexture a() {
        android.graphics.SurfaceTexture surfaceTexture = this.f38919H;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void b(int i6) throws com.google.android.gms.internal.ads.UG {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        com.google.android.gms.internal.ads.AbstractC5444vH.a(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        com.google.android.gms.internal.ads.AbstractC5444vH.a(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f38916E = eGLDisplayEglGetDisplay;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = android.opengl.EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f38913I, 0, eGLConfigArr, 0, 1, iArr2, 0);
        com.google.android.gms.internal.ads.AbstractC5444vH.a(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, java.lang.String.format(java.util.Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", java.lang.Boolean.valueOf(zEglChooseConfig), java.lang.Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(this.f38916E, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i6 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        com.google.android.gms.internal.ads.AbstractC5444vH.a(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f38917F = eGLContextEglCreateContext;
        android.opengl.EGLDisplay eGLDisplay = this.f38916E;
        if (i6 == 1) {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i6 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            com.google.android.gms.internal.ads.AbstractC5444vH.a(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        com.google.android.gms.internal.ads.AbstractC5444vH.a(android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f38918G = eGLSurfaceEglCreatePbufferSurface;
        android.opengl.GLES20.glGenTextures(1, this.f38915D, 0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z6 = false;
        while (true) {
            int iGlGetError = android.opengl.GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z6) {
                sb.append('\n');
            }
            java.lang.String strGluErrorString = android.opengl.GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z6 = true;
        }
        if (z6) {
            throw new com.google.android.gms.internal.ads.UG(sb.toString());
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.f38915D[0]);
        this.f38919H = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        this.f38914C.removeCallbacks(this);
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.f38919H;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, this.f38915D, 0);
            }
            android.opengl.EGLDisplay eGLDisplay = this.f38916E;
            if (eGLDisplay != null && !eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGLDisplay eGLDisplay2 = this.f38916E;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface2 = this.f38918G;
            if (eGLSurface2 != null && !eGLSurface2.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.f38916E, this.f38918G);
            }
            android.opengl.EGLContext eGLContext = this.f38917F;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.f38916E, eGLContext);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay3 = this.f38916E;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
            }
        } finally {
            android.opengl.EGLDisplay eGLDisplay4 = this.f38916E;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGLDisplay eGLDisplay5 = this.f38916E;
                android.opengl.EGLSurface eGLSurface3 = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface4 = this.f38918G;
            if (eGLSurface4 != null && !eGLSurface4.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.f38916E, this.f38918G);
            }
            android.opengl.EGLContext eGLContext2 = this.f38917F;
            if (eGLContext2 != null) {
                android.opengl.EGL14.eglDestroyContext(this.f38916E, eGLContext2);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay6 = this.f38916E;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglTerminate(this.f38916E);
            }
            this.f38916E = null;
            this.f38917F = null;
            this.f38918G = null;
            this.f38919H = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f38914C.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.SurfaceTexture surfaceTexture = this.f38919H;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }
}
