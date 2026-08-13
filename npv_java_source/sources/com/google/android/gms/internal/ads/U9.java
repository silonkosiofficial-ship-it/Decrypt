package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class U9 implements com.google.android.gms.internal.ads.T9 {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected static volatile com.google.android.gms.internal.ads.C2262Da f32134W;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected android.view.MotionEvent f32135C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected double f32144L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private double f32145M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private double f32146N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected float f32147O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected float f32148P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected float f32149Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected float f32150R;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected android.util.DisplayMetrics f32153U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.C5357ua f32154V;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected final java.util.LinkedList f32136D = new java.util.LinkedList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected long f32137E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected long f32138F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected long f32139G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected long f32140H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected long f32141I = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected long f32142J = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected long f32143K = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f32151S = false;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f32152T = false;

    protected U9(android.content.Context context) {
        try {
            com.google.android.gms.internal.ads.AbstractC5428v9.e();
            this.f32153U = context.getResources().getDisplayMetrics();
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25418T2)).booleanValue()) {
                this.f32154V = new com.google.android.gms.internal.ads.C5357ua();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private final void o() {
        this.f32141I = 0L;
        this.f32137E = 0L;
        this.f32138F = 0L;
        this.f32139G = 0L;
        this.f32140H = 0L;
        this.f32142J = 0L;
        this.f32143K = 0L;
        if (this.f32136D.isEmpty()) {
            android.view.MotionEvent motionEvent = this.f32135C;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            java.util.Iterator it = this.f32136D.iterator();
            while (it.hasNext()) {
                ((android.view.MotionEvent) it.next()).recycle();
            }
            this.f32136D.clear();
        }
        this.f32135C = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:45:0x00a8, B:48:0x00b5, B:57:0x00d9, B:60:0x00ed), top: B:74:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[Catch: Exception -> 0x00e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e9, blocks: (B:45:0x00a8, B:48:0x00b5, B:57:0x00d9, B:60:0x00ed), top: B:74:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final java.lang.String p(android.content.Context context, java.lang.String str, int i6, android.view.View view, android.app.Activity activity, byte[] bArr) {
        com.google.android.gms.internal.ads.S9 s9D;
        java.lang.String str2;
        int i10;
        java.lang.Exception exc;
        int i11;
        int i12;
        long jCurrentTimeMillis;
        java.lang.String strB;
        int i13;
        int i14;
        com.google.android.gms.internal.ads.C5316u8 c5316u8L;
        int i15;
        int i16;
        int i17 = i6;
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25275G2)).booleanValue();
        com.google.android.gms.internal.ads.C5316u8 c5316u8K = null;
        if (zBooleanValue) {
            s9D = f32134W != null ? f32134W.d() : null;
            str2 = "be";
        } else {
            s9D = null;
            str2 = null;
        }
        int i18 = 1;
        try {
            if (i17 == 3) {
                c5316u8K = k(context, view, activity);
                try {
                    this.f32151S = true;
                    i16 = 1002;
                } catch (java.lang.Exception e6) {
                    exc = e6;
                    i10 = 3;
                    i18 = 1;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (c5316u8K != null) {
                        try {
                            if (((com.google.android.gms.internal.ads.Q8) c5316u8K.u()).c() == 0) {
                                strB = java.lang.Integer.toString(5);
                            } else {
                                com.google.android.gms.internal.ads.Q8 q10 = (com.google.android.gms.internal.ads.Q8) c5316u8K.u();
                                boolean z6 = com.google.android.gms.internal.ads.AbstractC5428v9.f39347a;
                                strB = com.google.android.gms.internal.ads.AbstractC5428v9.b(q10.l(), str);
                                if (zBooleanValue) {
                                    if (i17 == i10) {
                                        i13 = 1006;
                                    } else if (i17 == i11) {
                                        i13 = 1010;
                                    } else {
                                        i13 = 1004;
                                    }
                                    s9D.c(i13, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (java.lang.Exception e10) {
                            strB = java.lang.Integer.toString(7);
                            if (zBooleanValue && s9D != null) {
                                if (i17 == i10) {
                                    i14 = 1007;
                                } else {
                                    i14 = i17 == i11 ? 1011 : 1005;
                                }
                                s9D.c(i14, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, e10);
                            }
                        }
                    } else {
                        strB = java.lang.Integer.toString(5);
                    }
                    return strB;
                }
            } else {
                if (i17 == 2) {
                    c5316u8L = m(context, view, activity);
                    i15 = 1008;
                } else {
                    c5316u8L = l(context, null);
                    i15 = 1000;
                }
                c5316u8K = c5316u8L;
                i16 = i15;
            }
            if (!zBooleanValue || s9D == null) {
                i10 = 3;
            } else {
                i10 = 3;
                try {
                    s9D.c(i16, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (java.lang.Exception e11) {
                    e = e11;
                    exc = e;
                    if (!zBooleanValue && s9D != null) {
                        if (i17 == i10) {
                            i12 = 1003;
                            i11 = 2;
                        } else {
                            i11 = 2;
                            if (i17 == 2) {
                                i12 = 1009;
                            } else {
                                i12 = 1001;
                                i17 = i18;
                            }
                        }
                        s9D.c(i12, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (c5316u8K != null) {
                        strB = java.lang.Integer.toString(5);
                    } else if (((com.google.android.gms.internal.ads.Q8) c5316u8K.u()).c() == 0) {
                        strB = java.lang.Integer.toString(5);
                    } else {
                        com.google.android.gms.internal.ads.Q8 q11 = (com.google.android.gms.internal.ads.Q8) c5316u8K.u();
                        boolean z10 = com.google.android.gms.internal.ads.AbstractC5428v9.f39347a;
                        strB = com.google.android.gms.internal.ads.AbstractC5428v9.b(q11.l(), str);
                        if (zBooleanValue) {
                            if (i17 == i10) {
                                i13 = 1006;
                            } else if (i17 == i11) {
                                i13 = 1010;
                            } else {
                                i13 = 1004;
                            }
                            s9D.c(i13, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strB;
                }
            }
        } catch (java.lang.Exception e12) {
            e = e12;
            i10 = 3;
        }
        i11 = 2;
        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (c5316u8K != null) {
            strB = java.lang.Integer.toString(5);
        } else if (((com.google.android.gms.internal.ads.Q8) c5316u8K.u()).c() == 0) {
            strB = java.lang.Integer.toString(5);
        } else {
            com.google.android.gms.internal.ads.Q8 q12 = (com.google.android.gms.internal.ads.Q8) c5316u8K.u();
            boolean z11 = com.google.android.gms.internal.ads.AbstractC5428v9.f39347a;
            strB = com.google.android.gms.internal.ads.AbstractC5428v9.b(q12.l(), str);
            if (zBooleanValue && s9D != null) {
                if (i17 == i10) {
                    i13 = 1006;
                } else if (i17 == i11) {
                    i13 = 1010;
                } else {
                    i13 = 1004;
                }
                s9D.c(i13, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strB;
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String a(android.content.Context context) {
        if (com.google.android.gms.internal.ads.AbstractC2373Ga.c()) {
            throw new java.lang.IllegalStateException("The caller must not be called from the UI thread.");
        }
        return p(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final void c(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.C5357ua c5357ua;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25418T2)).booleanValue() || (c5357ua = this.f32154V) == null) {
            return;
        }
        c5357ua.b(java.util.Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String d(android.content.Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String e(android.content.Context context, java.lang.String str, android.view.View view) {
        return p(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String f(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return p(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final synchronized void g(int i6, int i10, int i11) {
        try {
            if (this.f32135C != null) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25253E2)).booleanValue()) {
                    o();
                } else {
                    this.f32135C.recycle();
                }
            }
            android.util.DisplayMetrics displayMetrics = this.f32153U;
            if (displayMetrics != null) {
                float f6 = displayMetrics.density;
                this.f32135C = android.view.MotionEvent.obtain(0L, i11, 1, i6 * f6, i10 * f6, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f32135C = null;
            }
            this.f32152T = false;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final synchronized void h(android.view.MotionEvent motionEvent) {
        java.lang.Long l6;
        try {
            if (this.f32151S) {
                o();
                this.f32151S = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f32144L = 0.0d;
                this.f32145M = motionEvent.getRawX();
                this.f32146N = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d6 = rawX - this.f32145M;
                double d10 = rawY - this.f32146N;
                this.f32144L += java.lang.Math.sqrt((d6 * d6) + (d10 * d10));
                this.f32145M = rawX;
                this.f32146N = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                        this.f32135C = motionEventObtain;
                        this.f32136D.add(motionEventObtain);
                        if (this.f32136D.size() > 6) {
                            ((android.view.MotionEvent) this.f32136D.remove()).recycle();
                        }
                        this.f32139G++;
                        this.f32141I = j(new java.lang.Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f32138F += (long) (motionEvent.getHistorySize() + 1);
                        com.google.android.gms.internal.ads.C2336Fa c2336FaN = n(motionEvent);
                        java.lang.Long l10 = c2336FaN.f27392e;
                        if (l10 != null && c2336FaN.f27395h != null) {
                            this.f32142J += l10.longValue() + c2336FaN.f27395h.longValue();
                        }
                        if (this.f32153U != null && (l6 = c2336FaN.f27393f) != null && c2336FaN.f27396i != null) {
                            this.f32143K += l6.longValue() + c2336FaN.f27396i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f32140H++;
                    }
                } catch (com.google.android.gms.internal.ads.C5137sa unused) {
                }
            } else {
                this.f32147O = motionEvent.getX();
                this.f32148P = motionEvent.getY();
                this.f32149Q = motionEvent.getRawX();
                this.f32150R = motionEvent.getRawY();
                this.f32137E++;
            }
            this.f32152T = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.T9
    public final java.lang.String i(android.content.Context context, android.view.View view, android.app.Activity activity) {
        return p(context, null, 2, view, activity, null);
    }

    protected abstract long j(java.lang.StackTraceElement[] stackTraceElementArr);

    protected abstract com.google.android.gms.internal.ads.C5316u8 k(android.content.Context context, android.view.View view, android.app.Activity activity);

    protected abstract com.google.android.gms.internal.ads.C5316u8 l(android.content.Context context, com.google.android.gms.internal.ads.C3779g8 c3779g8);

    protected abstract com.google.android.gms.internal.ads.C5316u8 m(android.content.Context context, android.view.View view, android.app.Activity activity);

    protected abstract com.google.android.gms.internal.ads.C2336Fa n(android.view.MotionEvent motionEvent);
}
