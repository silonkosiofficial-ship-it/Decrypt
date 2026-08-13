package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3526ds extends java.lang.Thread implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.google.android.gms.internal.ads.InterfaceC3308bs {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final float[] f34806d0 = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3417cs f34807C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final float[] f34808D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final float[] f34809E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final float[] f34810F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final float[] f34811G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final float[] f34812H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final float[] f34813I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final float[] f34814J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float f34815K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f34816L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f34817M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f34818N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f34819O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private android.graphics.SurfaceTexture f34820P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private android.graphics.SurfaceTexture f34821Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f34822R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f34823S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f34824T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final java.nio.FloatBuffer f34825U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final java.util.concurrent.CountDownLatch f34826V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final java.lang.Object f34827W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGL10 f34828X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLDisplay f34829Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLContext f34830Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private javax.microedition.khronos.egl.EGLSurface f34831a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private volatile boolean f34832b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private volatile boolean f34833c0;

    public C3526ds(android.content.Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f34806d0;
        int length = fArr.length;
        java.nio.FloatBuffer floatBufferAsFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f34825U = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f34808D = new float[9];
        this.f34809E = new float[9];
        this.f34810F = new float[9];
        this.f34811G = new float[9];
        this.f34812H = new float[9];
        this.f34813I = new float[9];
        this.f34814J = new float[9];
        this.f34815K = Float.NaN;
        com.google.android.gms.internal.ads.C3417cs c3417cs = new com.google.android.gms.internal.ads.C3417cs(context);
        this.f34807C = c3417cs;
        c3417cs.b(this);
        this.f34826V = new java.util.concurrent.CountDownLatch(1);
        this.f34827W = new java.lang.Object();
    }

    private static final void h(java.lang.String str) {
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlGetError != 0) {
            java.lang.String str2 = str + ": glError " + iGlGetError;
        }
    }

    private static final void i(float[] fArr, float[] fArr2, float[] fArr3) {
        float f6 = fArr2[0] * fArr3[0];
        float f10 = fArr2[1];
        float f11 = fArr3[3];
        float f12 = fArr2[2];
        float f13 = fArr3[6];
        fArr[0] = f6 + (f10 * f11) + (f12 * f13);
        float f14 = fArr2[0];
        float f15 = fArr3[1] * f14;
        float f16 = fArr3[4];
        float f17 = fArr3[7];
        fArr[1] = f15 + (f10 * f16) + (f12 * f17);
        float f18 = f14 * fArr3[2];
        float f19 = fArr2[1];
        float f20 = fArr3[5];
        float f21 = fArr3[8];
        fArr[2] = f18 + (f19 * f20) + (f12 * f21);
        float f22 = fArr2[3];
        float f23 = fArr3[0];
        float f24 = fArr2[4];
        float f25 = fArr2[5];
        fArr[3] = (f22 * f23) + (f11 * f24) + (f25 * f13);
        float f26 = fArr2[3];
        float f27 = fArr3[1];
        fArr[4] = (f26 * f27) + (f24 * f16) + (f25 * f17);
        float f28 = fArr3[2];
        fArr[5] = (f26 * f28) + (fArr2[4] * f20) + (f25 * f21);
        float f29 = fArr2[6] * f23;
        float f30 = fArr2[7];
        float f31 = fArr3[3] * f30;
        float f32 = fArr2[8];
        fArr[6] = f29 + f31 + (f13 * f32);
        float f33 = fArr2[6];
        fArr[7] = (f27 * f33) + (f30 * fArr3[4]) + (f17 * f32);
        fArr[8] = (f33 * f28) + (fArr2[7] * fArr3[5]) + (f32 * f21);
    }

    private static final void j(float[] fArr, float f6) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d6 = f6;
        fArr[4] = (float) java.lang.Math.cos(d6);
        fArr[5] = (float) (-java.lang.Math.sin(d6));
        fArr[6] = 0.0f;
        fArr[7] = (float) java.lang.Math.sin(d6);
        fArr[8] = (float) java.lang.Math.cos(d6);
    }

    private static final void k(float[] fArr, float f6) {
        double d6 = f6;
        fArr[0] = (float) java.lang.Math.cos(d6);
        fArr[1] = (float) (-java.lang.Math.sin(d6));
        fArr[2] = 0.0f;
        fArr[3] = (float) java.lang.Math.sin(d6);
        fArr[4] = (float) java.lang.Math.cos(d6);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int l(int i6, java.lang.String str) {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i6);
        h("createShader");
        if (iGlCreateShader != 0) {
            android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
            h("shaderSource");
            android.opengl.GLES20.glCompileShader(iGlCreateShader);
            h("compileShader");
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            h("getShaderiv");
            if (iArr[0] == 0) {
                java.lang.String str2 = "Could not compile shader " + i6 + ":";
                android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader);
                android.opengl.GLES20.glDeleteShader(iGlCreateShader);
                h("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3308bs
    public final void a() {
        synchronized (this.f34827W) {
            this.f34827W.notifyAll();
        }
    }

    public final android.graphics.SurfaceTexture b() {
        if (this.f34821Q == null) {
            return null;
        }
        try {
            this.f34826V.await();
        } catch (java.lang.InterruptedException unused) {
        }
        return this.f34820P;
    }

    public final void c(int i6, int i10) {
        synchronized (this.f34827W) {
            this.f34819O = i6;
            this.f34818N = i10;
            this.f34832b0 = true;
            this.f34827W.notifyAll();
        }
    }

    public final void d(android.graphics.SurfaceTexture surfaceTexture, int i6, int i10) {
        this.f34819O = i6;
        this.f34818N = i10;
        this.f34821Q = surfaceTexture;
    }

    public final void e() {
        synchronized (this.f34827W) {
            this.f34833c0 = true;
            this.f34821Q = null;
            this.f34827W.notifyAll();
        }
    }

    public final void f(float f6, float f10) {
        int i6 = this.f34819O;
        int i10 = this.f34818N;
        if (i6 <= i10) {
            i6 = i10;
        }
        float f11 = i6;
        this.f34816L -= (f6 * 1.7453293f) / f11;
        float f12 = this.f34817M - ((f10 * 1.7453293f) / f11);
        this.f34817M = f12;
        if (f12 < -1.5707964f) {
            this.f34817M = -1.5707964f;
            f12 = -1.5707964f;
        }
        if (f12 > 1.5707964f) {
            this.f34817M = 1.5707964f;
        }
    }

    final boolean g() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f34831a0;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f34828X.eglDestroySurface(this.f34829Y, this.f34831a0) | this.f34828X.eglMakeCurrent(this.f34829Y, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            this.f34831a0 = null;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f34830Z;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f34828X.eglDestroyContext(this.f34829Y, eGLContext);
            this.f34830Z = null;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f34829Y;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f34828X.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.f34829Y = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f34824T++;
        synchronized (this.f34827W) {
            this.f34827W.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:6:0x0025  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z6;
        int iGlCreateProgram;
        if (this.f34821Q == null) {
            p224w3.p.d("SphericalVideoProcessor started with no output texture.");
            this.f34826V.countDown();
            return;
        }
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f34828X = egl10;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f34829Y = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY && this.f34828X.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
            javax.microedition.khronos.egl.EGLConfig eGLConfig = (this.f34828X.eglChooseConfig(this.f34829Y, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig == null) {
                z6 = false;
            } else {
                javax.microedition.khronos.egl.EGL10 egl11 = this.f34828X;
                javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f34829Y;
                javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
                javax.microedition.khronos.egl.EGLContext eGLContextEglCreateContext = egl11.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                this.f34830Z = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                    z6 = false;
                } else {
                    javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglCreateWindowSurface = this.f34828X.eglCreateWindowSurface(this.f34829Y, eGLConfig, this.f34821Q, null);
                    this.f34831a0 = eGLSurfaceEglCreateWindowSurface;
                    if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE || !this.f34828X.eglMakeCurrent(this.f34829Y, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.f34830Z)) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                }
            }
        } else {
            z6 = false;
        }
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.f25683s1;
        int iL = l(35633, !((java.lang.String) p184s3.A.c().a(abstractC5037rf)).equals(abstractC5037rf.k()) ? (java.lang.String) p184s3.A.c().a(abstractC5037rf) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iL == 0) {
            iGlCreateProgram = 0;
        } else {
            com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf2 = com.google.android.gms.internal.ads.AbstractC2161Af.f25693t1;
            int iL2 = l(35632, !((java.lang.String) p184s3.A.c().a(abstractC5037rf2)).equals(abstractC5037rf2.k()) ? (java.lang.String) p184s3.A.c().a(abstractC5037rf2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iL2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
                h("createProgram");
                if (iGlCreateProgram != 0) {
                    android.opengl.GLES20.glAttachShader(iGlCreateProgram, iL);
                    h("attachShader");
                    android.opengl.GLES20.glAttachShader(iGlCreateProgram, iL2);
                    h("attachShader");
                    android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
                    h("linkProgram");
                    int[] iArr2 = new int[1];
                    android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    h("getProgramiv");
                    if (iArr2[0] != 1) {
                        android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram);
                        android.opengl.GLES20.glDeleteProgram(iGlCreateProgram);
                        h("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        android.opengl.GLES20.glValidateProgram(iGlCreateProgram);
                        h("validateProgram");
                    }
                }
            }
        }
        this.f34822R = iGlCreateProgram;
        android.opengl.GLES20.glUseProgram(iGlCreateProgram);
        h("useProgram");
        int iGlGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f34822R, "aPosition");
        android.opengl.GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (java.nio.Buffer) this.f34825U);
        h("vertexAttribPointer");
        android.opengl.GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        h("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr3, 0);
        h("genTextures");
        int i6 = iArr3[0];
        android.opengl.GLES20.glBindTexture(36197, i6);
        h("bindTextures");
        android.opengl.GLES20.glTexParameteri(36197, 10240, 9729);
        h("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
        h("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        h("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        h("texParameteri");
        int iGlGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f34822R, "uVMat");
        this.f34823S = iGlGetUniformLocation;
        android.opengl.GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i10 = this.f34822R;
        if (!z6 || i10 == 0) {
            java.lang.String strConcat = "EGL initialization failed: ".concat(java.lang.String.valueOf(android.opengl.GLUtils.getEGLErrorString(this.f34828X.eglGetError())));
            p224w3.p.d(strConcat);
            p174r3.v.s().x(new java.lang.Throwable(strConcat), "SphericalVideoProcessor.run.1");
            g();
            this.f34826V.countDown();
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i6);
        this.f34820P = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f34826V.countDown();
        this.f34807C.c();
        try {
            try {
                this.f34832b0 = true;
                while (!this.f34833c0) {
                    while (this.f34824T > 0) {
                        this.f34820P.updateTexImage();
                        this.f34824T--;
                    }
                    if (this.f34807C.e(this.f34808D)) {
                        if (java.lang.Float.isNaN(this.f34815K)) {
                            float[] fArr = this.f34808D;
                            float[] fArr2 = {0.0f, 1.0f, 0.0f};
                            float f6 = fArr[0];
                            float f10 = fArr2[0];
                            float f11 = fArr[1];
                            float f12 = fArr2[1];
                            float[] fArr3 = {(f6 * f10) + (f11 * f12) + (fArr[2] * 0.0f), (fArr[3] * f10) + (fArr[4] * f12) + (fArr[5] * 0.0f), (fArr[6] * f10) + (fArr[7] * f12) + (fArr[8] * 0.0f)};
                            this.f34815K = -(((float) java.lang.Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                        }
                        k(this.f34813I, this.f34815K + this.f34816L);
                    } else {
                        j(this.f34808D, -1.5707964f);
                        k(this.f34813I, this.f34816L);
                    }
                    j(this.f34809E, 1.5707964f);
                    i(this.f34810F, this.f34813I, this.f34809E);
                    i(this.f34811G, this.f34808D, this.f34810F);
                    j(this.f34812H, this.f34817M);
                    i(this.f34814J, this.f34812H, this.f34811G);
                    android.opengl.GLES20.glUniformMatrix3fv(this.f34823S, 1, false, this.f34814J, 0);
                    android.opengl.GLES20.glDrawArrays(5, 0, 4);
                    h("drawArrays");
                    android.opengl.GLES20.glFinish();
                    this.f34828X.eglSwapBuffers(this.f34829Y, this.f34831a0);
                    if (this.f34832b0) {
                        android.opengl.GLES20.glViewport(0, 0, this.f34819O, this.f34818N);
                        h("viewport");
                        int iGlGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.f34822R, "uFOVx");
                        int iGlGetUniformLocation3 = android.opengl.GLES20.glGetUniformLocation(this.f34822R, "uFOVy");
                        int i11 = this.f34819O;
                        int i12 = this.f34818N;
                        if (i11 > i12) {
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation3, (this.f34818N * 0.87266463f) / this.f34819O);
                        } else {
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation2, (i11 * 0.87266463f) / i12);
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.f34832b0 = false;
                    }
                    try {
                        synchronized (this.f34827W) {
                            try {
                                if (!this.f34833c0 && !this.f34832b0 && this.f34824T == 0) {
                                    this.f34827W.wait();
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            } catch (java.lang.Throwable th2) {
                this.f34807C.d();
                this.f34820P.setOnFrameAvailableListener(null);
                this.f34820P = null;
                g();
                throw th2;
            }
        } catch (java.lang.IllegalStateException unused2) {
            p224w3.p.g("SphericalVideoProcessor halted unexpectedly.");
        } catch (java.lang.Throwable th3) {
            p224w3.p.e("SphericalVideoProcessor died.", th3);
            p174r3.v.s().x(th3, "SphericalVideoProcessor.run.2");
        }
        this.f34807C.d();
        this.f34820P.setOnFrameAvailableListener(null);
        this.f34820P = null;
        g();
    }
}
