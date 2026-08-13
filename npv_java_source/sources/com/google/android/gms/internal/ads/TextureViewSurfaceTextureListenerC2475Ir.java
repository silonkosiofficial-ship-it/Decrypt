package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC2475Ir extends com.google.android.gms.internal.ads.AbstractC2549Kr implements android.view.TextureView.SurfaceTextureListener, android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final java.util.Map f28502U;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3746fs f28503E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3856gs f28504F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f28505G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f28506H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f28507I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private android.media.MediaPlayer f28508J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private android.net.Uri f28509K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f28510L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f28511M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f28512N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3526ds f28513O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f28514P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f28515Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2512Jr f28516R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f28517S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private java.lang.Integer f28518T;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f28502U = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC2475Ir(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, boolean z6, boolean z10, com.google.android.gms.internal.ads.C3636es c3636es, com.google.android.gms.internal.ads.C3856gs c3856gs) {
        super(context);
        this.f28506H = 0;
        this.f28507I = 0;
        this.f28517S = false;
        this.f28518T = null;
        setSurfaceTextureListener(this);
        this.f28503E = interfaceC3746fs;
        this.f28504F = c3856gs;
        this.f28514P = z6;
        this.f28505G = z10;
        c3856gs.a(this);
    }

    private final void E() {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView init MediaPlayer");
        android.graphics.SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f28509K == null || surfaceTexture == null) {
            return;
        }
        F(false);
        try {
            p174r3.v.o();
            android.media.MediaPlayer mediaPlayer = new android.media.MediaPlayer();
            this.f28508J = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f28508J.setOnCompletionListener(this);
            this.f28508J.setOnErrorListener(this);
            this.f28508J.setOnInfoListener(this);
            this.f28508J.setOnPreparedListener(this);
            this.f28508J.setOnVideoSizeChangedListener(this);
            this.f28512N = 0;
            if (this.f28514P) {
                com.google.android.gms.internal.ads.C3526ds c3526ds = new com.google.android.gms.internal.ads.C3526ds(getContext());
                this.f28513O = c3526ds;
                c3526ds.d(surfaceTexture, getWidth(), getHeight());
                this.f28513O.start();
                android.graphics.SurfaceTexture surfaceTextureB = this.f28513O.b();
                if (surfaceTextureB != null) {
                    surfaceTexture = surfaceTextureB;
                } else {
                    this.f28513O.e();
                    this.f28513O = null;
                }
            }
            this.f28508J.setDataSource(getContext(), this.f28509K);
            p174r3.v.p();
            this.f28508J.setSurface(new android.view.Surface(surfaceTexture));
            this.f28508J.setAudioStreamType(3);
            this.f28508J.setScreenOnWhilePlaying(true);
            this.f28508J.prepareAsync();
            G(1);
        } catch (java.io.IOException e6) {
            e = e6;
            p224w3.p.h("Failed to initialize MediaPlayer at ".concat(java.lang.String.valueOf(this.f28509K)), e);
            onError(this.f28508J, 1, 0);
        } catch (java.lang.IllegalArgumentException e10) {
            e = e10;
            p224w3.p.h("Failed to initialize MediaPlayer at ".concat(java.lang.String.valueOf(this.f28509K)), e);
            onError(this.f28508J, 1, 0);
        } catch (java.lang.IllegalStateException e11) {
            e = e11;
            p224w3.p.h("Failed to initialize MediaPlayer at ".concat(java.lang.String.valueOf(this.f28509K)), e);
            onError(this.f28508J, 1, 0);
        }
    }

    private final void F(boolean z6) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView release");
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f28513O;
        if (c3526ds != null) {
            c3526ds.e();
            this.f28513O = null;
        }
        android.media.MediaPlayer mediaPlayer = this.f28508J;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f28508J.release();
            this.f28508J = null;
            G(0);
            if (z6) {
                this.f28507I = 0;
            }
        }
    }

    private final void G(int i6) {
        if (i6 == 3) {
            this.f28504F.c();
            this.f29015D.b();
        } else if (this.f28506H == 3) {
            this.f28504F.e();
            this.f29015D.c();
        }
        this.f28506H = i6;
    }

    private final void H(float f6) {
        android.media.MediaPlayer mediaPlayer = this.f28508J;
        if (mediaPlayer == null) {
            p224w3.p.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f6, f6);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    private final boolean I() {
        int i6;
        return (this.f28508J == null || (i6 = this.f28506H) == -1 || i6 == 0 || i6 == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void L(com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir, android.media.MediaPlayer mediaPlayer) {
        java.lang.String string;
        java.lang.String str;
        android.media.MediaFormat format;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() || textureViewSurfaceTextureListenerC2475Ir.f28503E == null || mediaPlayer == null) {
            return;
        }
        try {
            android.media.MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                java.util.HashMap map = new java.util.HashMap();
                for (android.media.MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            android.media.MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", java.lang.String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (java.lang.ClassCastException unused) {
                                        map.put("frameRate", java.lang.String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(format2.getInteger("bitrate"));
                                    textureViewSurfaceTextureListenerC2475Ir.f28518T = numValueOf;
                                    map.put("bitRate", java.lang.String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (android.os.Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    string = format2.getString("codecs-string");
                                    str = "videoCodec";
                                    map.put(str, string);
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                string = format.getString("codecs-string");
                                str = "audioCodec";
                                map.put(str, string);
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                textureViewSurfaceTextureListenerC2475Ir.f28503E.O("onMetadataEvent", map);
            }
        } catch (java.lang.RuntimeException e6) {
            p174r3.v.s().x(e6, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int d() {
        if (I()) {
            return this.f28508J.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int e() {
        if (android.os.Build.VERSION.SDK_INT < 26 || !I()) {
            return -1;
        }
        return this.f28508J.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int f() {
        if (I()) {
            return this.f28508J.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int g() {
        android.media.MediaPlayer mediaPlayer = this.f28508J;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final int h() {
        android.media.MediaPlayer mediaPlayer = this.f28508J;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long j() {
        if (this.f28518T != null) {
            return (k() * ((long) this.f28512N)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final long k() {
        if (this.f28518T != null) {
            return ((long) f()) * ((long) this.f28518T.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final java.lang.String l() {
        return "MediaPlayer".concat(true != this.f28514P ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void m() {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView pause");
        if (I() && this.f28508J.isPlaying()) {
            this.f28508J.pause();
            G(4);
            p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2401Gr(this));
        }
        this.f28507I = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr, com.google.android.gms.internal.ads.InterfaceC4075is
    public final void n() {
        H(this.f29015D.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void o() {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView play");
        if (I()) {
            this.f28508J.start();
            G(3);
            this.f29014C.b();
            p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2364Fr(this));
        }
        this.f28507I = 3;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i6) {
        this.f28512N = i6;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView completion");
        G(5);
        this.f28507I = 5;
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2179Ar(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i6, int i10) {
        java.util.Map map = f28502U;
        java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(i6));
        java.lang.String str2 = (java.lang.String) map.get(java.lang.Integer.valueOf(i10));
        p224w3.p.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        G(-1);
        this.f28507I = -1;
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2216Br(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i6, int i10) {
        java.util.Map map = f28502U;
        p214v3.AbstractC7265q0.k("AdMediaPlayerView MediaPlayer info: " + ((java.lang.String) map.get(java.lang.Integer.valueOf(i6))) + ":" + ((java.lang.String) map.get(java.lang.Integer.valueOf(i10))));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    protected final void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int defaultSize = android.view.View.getDefaultSize(this.f28510L, i6);
        int defaultSize2 = android.view.View.getDefaultSize(this.f28511M, i10);
        if (this.f28510L > 0 && this.f28511M > 0 && this.f28513O == null) {
            int mode = android.view.View.MeasureSpec.getMode(i6);
            int size = android.view.View.MeasureSpec.getSize(i6);
            int mode2 = android.view.View.MeasureSpec.getMode(i10);
            int size2 = android.view.View.MeasureSpec.getSize(i10);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i14 = (this.f28511M * size) / this.f28510L;
                    if (mode2 == Integer.MIN_VALUE || i14 <= size2) {
                        defaultSize2 = i14;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i13 = (this.f28510L * size2) / this.f28511M;
                        if (mode != Integer.MIN_VALUE && i13 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i11 = this.f28510L;
                        i12 = this.f28511M;
                        if (mode2 == Integer.MIN_VALUE || i12 <= size2) {
                            i13 = i11;
                            size2 = i12;
                        } else {
                            i13 = (size2 * i11) / i12;
                        }
                        if (mode == Integer.MIN_VALUE && i13 > size) {
                            defaultSize2 = (i12 * size) / i11;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i13;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i15 = this.f28510L;
                int i16 = i15 * size2;
                int i17 = this.f28511M;
                int i18 = size * i17;
                if (i16 < i18) {
                    defaultSize = i16 / i17;
                } else {
                    if (i16 > i18) {
                        defaultSize2 = i18 / i15;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i14 = (this.f28511M * size) / this.f28510L;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i14;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i13 = (this.f28510L * size2) / this.f28511M;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i11 = this.f28510L;
                        i12 = this.f28511M;
                        if (mode2 == Integer.MIN_VALUE) {
                            i13 = i11;
                            size2 = i12;
                        } else {
                            i13 = i11;
                            size2 = i12;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i12 * size) / i11;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i13;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f28513O;
        if (c3526ds != null) {
            c3526ds.c(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView prepared");
        G(2);
        this.f28504F.b();
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC5941zr(this, mediaPlayer));
        this.f28510L = mediaPlayer.getVideoWidth();
        this.f28511M = mediaPlayer.getVideoHeight();
        int i6 = this.f28515Q;
        if (i6 != 0) {
            p(i6);
        }
        if (this.f28505G && I() && this.f28508J.getCurrentPosition() > 0 && this.f28507I != 3) {
            p214v3.AbstractC7265q0.k("AdMediaPlayerView nudging MediaPlayer");
            H(0.0f);
            this.f28508J.start();
            int currentPosition = this.f28508J.getCurrentPosition();
            long jA = p174r3.v.c().a();
            while (I() && this.f28508J.getCurrentPosition() == currentPosition && p174r3.v.c().a() - jA <= 250) {
            }
            this.f28508J.pause();
            n();
        }
        p224w3.p.f("AdMediaPlayerView stream dimensions: " + this.f28510L + " x " + this.f28511M);
        if (this.f28507I == 3) {
            o();
        }
        n();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i6, int i10) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView surface created");
        E();
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2253Cr(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView surface destroyed");
        android.media.MediaPlayer mediaPlayer = this.f28508J;
        if (mediaPlayer != null && this.f28515Q == 0) {
            this.f28515Q = mediaPlayer.getCurrentPosition();
        }
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f28513O;
        if (c3526ds != null) {
            c3526ds.e();
        }
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2327Er(this));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i6, int i10) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView surface changed");
        int i11 = this.f28507I;
        boolean z6 = false;
        if (this.f28510L == i6 && this.f28511M == i10) {
            z6 = true;
        }
        if (this.f28508J != null && i11 == 3 && z6) {
            int i12 = this.f28515Q;
            if (i12 != 0) {
                p(i12);
            }
            o();
        }
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f28513O;
        if (c3526ds != null) {
            c3526ds.c(i6, i10);
        }
        p214v3.E0.f55826l.post(new com.google.android.gms.internal.ads.RunnableC2290Dr(this, i6, i10));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f28504F.f(this);
        this.f29014C.a(surfaceTexture, this.f28516R);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i6, int i10) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView size changed: " + i6 + " x " + i10);
        this.f28510L = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f28511M = videoHeight;
        if (this.f28510L == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i6) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView window visibility changed to " + i6);
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.yr
            @Override // java.lang.Runnable
            public final void run() {
                this.f40145C.y(i6);
            }
        });
        super.onWindowVisibilityChanged(i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void p(int i6) {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView seek " + i6);
        if (!I()) {
            this.f28515Q = i6;
        } else {
            this.f28508J.seekTo(i6);
            this.f28515Q = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void q(com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr) {
        this.f28516R = interfaceC2512Jr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void r(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        com.google.android.gms.internal.ads.C3072Zc c3072ZcE = com.google.android.gms.internal.ads.C3072Zc.e(uri);
        if (c3072ZcE == null || c3072ZcE.f33616C != null) {
            if (c3072ZcE != null) {
                uri = android.net.Uri.parse(c3072ZcE.f33616C);
            }
            this.f28509K = uri;
            this.f28515Q = 0;
            E();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void s() {
        p214v3.AbstractC7265q0.k("AdMediaPlayerView stop");
        android.media.MediaPlayer mediaPlayer = this.f28508J;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f28508J.release();
            this.f28508J = null;
            G(0);
            this.f28507I = 0;
        }
        this.f28504F.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2549Kr
    public final void t(float f6, float f10) {
        com.google.android.gms.internal.ads.C3526ds c3526ds = this.f28513O;
        if (c3526ds != null) {
            c3526ds.f(f6, f10);
        }
    }

    @Override // android.view.View
    public final java.lang.String toString() {
        return com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir.class.getName() + "@" + java.lang.Integer.toHexString(hashCode());
    }

    final /* synthetic */ void y(int i6) {
        com.google.android.gms.internal.ads.InterfaceC2512Jr interfaceC2512Jr = this.f28516R;
        if (interfaceC2512Jr != null) {
            interfaceC2512Jr.onWindowVisibilityChanged(i6);
        }
    }
}
