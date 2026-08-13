package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XD0 implements com.google.android.gms.internal.ads.NB0, com.google.android.gms.internal.ads.YD0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f33075C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZD0 f33076D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.media.metrics.PlaybackSession f33077E;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private java.lang.String f33083K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private android.media.metrics.PlaybackMetrics.Builder f33084L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f33085M;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC2715Pf f33088P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.google.android.gms.internal.ads.VC0 f33089Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.google.android.gms.internal.ads.VC0 f33090R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private com.google.android.gms.internal.ads.VC0 f33091S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f33092T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f33093U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f33094V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f33095W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f33096X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f33097Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f33098Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f33099a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f33100b0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2764Ql f33079G = new com.google.android.gms.internal.ads.C2764Ql();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4830pl f33080H = new com.google.android.gms.internal.ads.C4830pl();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final java.util.HashMap f33082J = new java.util.HashMap();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.HashMap f33081I = new java.util.HashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f33078F = android.os.SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f33086N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f33087O = 0;

    private XD0(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.f33075C = context.getApplicationContext();
        this.f33077E = playbackSession;
        com.google.android.gms.internal.ads.UC0 uc0 = new com.google.android.gms.internal.ads.UC0(com.google.android.gms.internal.ads.UC0.f32166h);
        this.f33076D = uc0;
        uc0.g(this);
    }

    public static com.google.android.gms.internal.ads.XD0 q(android.content.Context context) {
        android.media.metrics.MediaMetricsManager mediaMetricsManagerA = com.google.android.gms.internal.ads.WC0.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.XD0(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private static int r(int i6) {
        switch (com.google.android.gms.internal.ads.EW.D(i6)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void s() {
        android.media.metrics.PlaybackMetrics.Builder builder = this.f33084L;
        if (builder != null && this.f33100b0) {
            builder.setAudioUnderrunCount(this.f33099a0);
            this.f33084L.setVideoFramesDropped(this.f33097Y);
            this.f33084L.setVideoFramesPlayed(this.f33098Z);
            java.lang.Long l6 = (java.lang.Long) this.f33081I.get(this.f33083K);
            this.f33084L.setNetworkTransferDurationMillis(l6 == null ? 0L : l6.longValue());
            java.lang.Long l10 = (java.lang.Long) this.f33082J.get(this.f33083K);
            this.f33084L.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f33084L.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f33077E.reportPlaybackMetrics(this.f33084L.build());
        }
        this.f33084L = null;
        this.f33083K = null;
        this.f33099a0 = 0;
        this.f33097Y = 0;
        this.f33098Z = 0;
        this.f33092T = null;
        this.f33093U = null;
        this.f33094V = null;
        this.f33100b0 = false;
    }

    private final void t(long j6, com.google.android.gms.internal.ads.D d6, int i6) {
        if (j$.util.Objects.equals(this.f33093U, d6)) {
            return;
        }
        int i10 = this.f33093U == null ? 1 : 0;
        this.f33093U = d6;
        x(0, j6, d6, i10);
    }

    private final void u(long j6, com.google.android.gms.internal.ads.D d6, int i6) {
        if (j$.util.Objects.equals(this.f33094V, d6)) {
            return;
        }
        int i10 = this.f33094V == null ? 1 : 0;
        this.f33094V = d6;
        x(2, j6, d6, i10);
    }

    private final void v(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0) {
        int iA;
        android.media.metrics.PlaybackMetrics.Builder builder = this.f33084L;
        if (lh0 == null || (iA = abstractC4942qm.a(lh0.f29454a)) == -1) {
            return;
        }
        int i6 = 0;
        abstractC4942qm.d(iA, this.f33080H, false);
        abstractC4942qm.e(this.f33080H.f38060c, this.f33079G, 0L);
        com.google.android.gms.internal.ads.C4651o5 c4651o5 = this.f33079G.f31041c.f30898b;
        if (c4651o5 != null) {
            int iG = com.google.android.gms.internal.ads.EW.G(c4651o5.f37715a);
            if (iG == 0) {
                i6 = 3;
            } else if (iG != 1) {
                i6 = iG != 2 ? 1 : 4;
            } else {
                i6 = 5;
            }
        }
        builder.setStreamType(i6);
        com.google.android.gms.internal.ads.C2764Ql c2764Ql = this.f33079G;
        long j6 = c2764Ql.f31050l;
        if (j6 != -9223372036854775807L && !c2764Ql.f31048j && !c2764Ql.f31046h && !c2764Ql.b()) {
            builder.setMediaDurationMillis(com.google.android.gms.internal.ads.EW.N(j6));
        }
        builder.setPlaybackType(true != this.f33079G.b() ? 1 : 2);
        this.f33100b0 = true;
    }

    private final void w(long j6, com.google.android.gms.internal.ads.D d6, int i6) {
        if (j$.util.Objects.equals(this.f33092T, d6)) {
            return;
        }
        int i10 = this.f33092T == null ? 1 : 0;
        this.f33092T = d6;
        x(1, j6, d6, i10);
    }

    private final void x(int i6, long j6, com.google.android.gms.internal.ads.D d6, int i10) {
        android.media.metrics.TrackChangeEvent.Builder timeSinceCreatedMillis = com.google.android.gms.internal.ads.DD0.a(i6).setTimeSinceCreatedMillis(j6 - this.f33078F);
        if (d6 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i10 != 1 ? 1 : 2);
            java.lang.String str = d6.f26573n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            java.lang.String str2 = d6.f26574o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            java.lang.String str3 = d6.f26570k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i11 = d6.f26569j;
            if (i11 != -1) {
                timeSinceCreatedMillis.setBitrate(i11);
            }
            int i12 = d6.f26581v;
            if (i12 != -1) {
                timeSinceCreatedMillis.setWidth(i12);
            }
            int i13 = d6.f26582w;
            if (i13 != -1) {
                timeSinceCreatedMillis.setHeight(i13);
            }
            int i14 = d6.f26551D;
            if (i14 != -1) {
                timeSinceCreatedMillis.setChannelCount(i14);
            }
            int i15 = d6.f26552E;
            if (i15 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i15);
            }
            java.lang.String str4 = d6.f26563d;
            if (str4 != null) {
                int i16 = com.google.android.gms.internal.ads.EW.f27061a;
                java.lang.String[] strArrSplit = str4.split("-", -1);
                android.util.Pair pairCreate = android.util.Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((java.lang.String) pairCreate.first);
                java.lang.Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((java.lang.String) obj);
                }
            }
            float f6 = d6.f26583x;
            if (f6 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f6);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f33100b0 = true;
        this.f33077E.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean y(com.google.android.gms.internal.ads.VC0 vc0) {
        if (vc0 != null) {
            return vc0.f32442c.equals(this.f33076D.d());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void a(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.HH0 hh0) {
        com.google.android.gms.internal.ads.LH0 lh0 = lb0.f29433d;
        if (lh0 == null) {
            return;
        }
        com.google.android.gms.internal.ads.D d6 = hh0.f28003b;
        d6.getClass();
        com.google.android.gms.internal.ads.VC0 vc0 = new com.google.android.gms.internal.ads.VC0(d6, 0, this.f33076D.c(lb0.f29431b, lh0));
        int i6 = hh0.f28002a;
        if (i6 != 0) {
            if (i6 == 1) {
                this.f33090R = vc0;
                return;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    return;
                }
                this.f33091S = vc0;
                return;
            }
        }
        this.f33089Q = vc0;
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void b(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void c(com.google.android.gms.internal.ads.LB0 lb0, java.lang.Object obj, long j6) {
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016f  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Code duplicated, block: B:146:0x020a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0210  */
    /* JADX WARN: Code duplicated, block: B:149:0x0214  */
    /* JADX WARN: Code duplicated, block: B:150:0x0217  */
    /* JADX WARN: Code duplicated, block: B:152:0x021b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x0227  */
    /* JADX WARN: Code duplicated, block: B:156:0x022f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0233  */
    /* JADX WARN: Code duplicated, block: B:159:0x023b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0283  */
    /* JADX WARN: Code duplicated, block: B:171:0x0288  */
    /* JADX WARN: Code duplicated, block: B:173:0x028d  */
    @Override // com.google.android.gms.internal.ads.NB0
    public final void d(com.google.android.gms.internal.ads.InterfaceC5045rj interfaceC5045rj, com.google.android.gms.internal.ads.MB0 mb0) {
        int i6;
        int i10;
        int iR;
        int i11;
        int errorCode;
        int iE;
        com.google.android.gms.internal.ads.EH0 eh0;
        int i12;
        int i13;
        if (mb0.b() == 0) {
            return;
        }
        for (int i14 = 0; i14 < mb0.b(); i14++) {
            int iA = mb0.a(i14);
            com.google.android.gms.internal.ads.LB0 lb0C = mb0.c(iA);
            if (iA == 0) {
                this.f33076D.b(lb0C);
            } else if (iA == 11) {
                this.f33076D.e(lb0C, this.f33085M);
            } else {
                this.f33076D.a(lb0C);
            }
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (mb0.d(0)) {
            com.google.android.gms.internal.ads.LB0 lb0C2 = mb0.c(0);
            if (this.f33084L != null) {
                v(lb0C2.f29431b, lb0C2.f29433d);
            }
        }
        if (mb0.d(2) && this.f33084L != null) {
            com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0A = interfaceC5045rj.p().a();
            int size = abstractC3398ci0A.size();
            int i15 = 0;
            loop1: while (true) {
                if (i15 >= size) {
                    eh0 = null;
                    break;
                }
                com.google.android.gms.internal.ads.C2399Gp c2399Gp = (com.google.android.gms.internal.ads.C2399Gp) abstractC3398ci0A.get(i15);
                int i16 = 0;
                while (true) {
                    i13 = i15 + 1;
                    if (i16 < c2399Gp.f27895a) {
                        if (c2399Gp.d(i16) && (eh0 = c2399Gp.b(i16).f26578s) != null) {
                            break loop1;
                        } else {
                            i16++;
                        }
                    }
                }
                i15 = i13;
            }
            if (eh0 != null) {
                android.media.metrics.PlaybackMetrics.Builder builder = this.f33084L;
                int i17 = com.google.android.gms.internal.ads.EW.f27061a;
                android.media.metrics.PlaybackMetrics.Builder builderA = com.google.android.gms.internal.ads.VD0.a(builder);
                int i18 = 0;
                while (true) {
                    if (i18 >= eh0.f27006F) {
                        i12 = 1;
                        break;
                    }
                    java.util.UUID uuid = eh0.a(i18).f34035D;
                    if (uuid.equals(com.google.android.gms.internal.ads.Hw0.f28348d)) {
                        i12 = 3;
                        break;
                    } else if (uuid.equals(com.google.android.gms.internal.ads.Hw0.f28349e)) {
                        i12 = 2;
                        break;
                    } else {
                        if (uuid.equals(com.google.android.gms.internal.ads.Hw0.f28347c)) {
                            i12 = 6;
                            break;
                        }
                        i18++;
                    }
                }
                builderA.setDrmType(i12);
            }
        }
        if (mb0.d(1011)) {
            this.f33099a0++;
        }
        com.google.android.gms.internal.ads.AbstractC2715Pf abstractC2715Pf = this.f33088P;
        if (abstractC2715Pf != null) {
            android.content.Context context = this.f33075C;
            if (abstractC2715Pf.f30763C == 1001) {
                i11 = 20;
            } else {
                com.google.android.gms.internal.ads.Qz0 qz0 = (com.google.android.gms.internal.ads.Qz0) abstractC2715Pf;
                boolean z6 = qz0.f31098E == 1;
                int i19 = qz0.f31102I;
                java.lang.Throwable cause = abstractC2715Pf.getCause();
                cause.getClass();
                if (cause instanceof java.io.IOException) {
                    if (cause instanceof com.google.android.gms.internal.ads.C5174ss0) {
                        iE = ((com.google.android.gms.internal.ads.C5174ss0) cause).f38810E;
                        i11 = 5;
                    } else if (cause instanceof com.google.android.gms.internal.ads.C4708of) {
                        iE = 0;
                        i11 = 11;
                    } else {
                        boolean z10 = cause instanceof com.google.android.gms.internal.ads.C5062rr0;
                        if (z10 || (cause instanceof com.google.android.gms.internal.ads.C4193jw0)) {
                            if (com.google.android.gms.internal.ads.C4908qQ.b(context).a() == 1) {
                                iE = 0;
                                i11 = 3;
                            } else {
                                java.lang.Throwable cause2 = cause.getCause();
                                if (cause2 instanceof java.net.UnknownHostException) {
                                    iE = 0;
                                    i11 = 6;
                                } else if (cause2 instanceof java.net.SocketTimeoutException) {
                                    iE = 0;
                                    i11 = 7;
                                } else if (z10 && ((com.google.android.gms.internal.ads.C5062rr0) cause).f38565D == 1) {
                                    iE = 0;
                                    i11 = 4;
                                } else {
                                    iE = 0;
                                    i11 = 8;
                                }
                            }
                        } else if (abstractC2715Pf.f30763C == 1002) {
                            i11 = 21;
                        } else if (cause instanceof com.google.android.gms.internal.ads.PF0) {
                            java.lang.Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof android.media.MediaDrm.MediaDrmStateException) {
                                errorCode = com.google.android.gms.internal.ads.EW.E(((android.media.MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iR = r(errorCode);
                                int i20 = iR;
                                iE = errorCode;
                                i11 = i20;
                            } else if (com.google.android.gms.internal.ads.EW.f27061a >= 23 && (cause3 instanceof android.media.MediaDrmResetException)) {
                                i11 = 27;
                            } else if (cause3 instanceof android.media.NotProvisionedException) {
                                i11 = 24;
                            } else if (cause3 instanceof android.media.DeniedByServerException) {
                                i11 = 29;
                            } else if (cause3 instanceof com.google.android.gms.internal.ads.C3138aG0) {
                                iE = 0;
                                i11 = 23;
                            } else {
                                i11 = 30;
                            }
                        } else if ((cause instanceof com.google.android.gms.internal.ads.Op0) && (cause.getCause() instanceof java.io.FileNotFoundException)) {
                            java.lang.Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            java.lang.Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof android.system.ErrnoException) && ((android.system.ErrnoException) cause5).errno == android.system.OsConstants.EACCES) {
                                i11 = 32;
                            } else {
                                iE = 0;
                                i11 = 31;
                            }
                        } else {
                            iE = 0;
                            i11 = 9;
                        }
                    }
                } else if (z6) {
                    i11 = 35;
                    if (i19 != 0 && i19 != 1) {
                        if (!z6 && i19 == 3) {
                            i11 = 15;
                        } else if (!z6 && i19 == 2) {
                            iE = 0;
                            i11 = 23;
                        } else if (cause instanceof com.google.android.gms.internal.ads.IG0) {
                            iE = com.google.android.gms.internal.ads.EW.E(((com.google.android.gms.internal.ads.IG0) cause).f28435F);
                            i11 = 13;
                        } else {
                            iR = 14;
                            if (cause instanceof com.google.android.gms.internal.ads.C5883zG0) {
                                errorCode = ((com.google.android.gms.internal.ads.C5883zG0) cause).f40245D;
                            } else if (cause instanceof java.lang.OutOfMemoryError) {
                                i11 = 14;
                            } else if (cause instanceof com.google.android.gms.internal.ads.NE0) {
                                errorCode = ((com.google.android.gms.internal.ads.NE0) cause).f30203C;
                                iR = 17;
                            } else if (cause instanceof com.google.android.gms.internal.ads.QE0) {
                                errorCode = ((com.google.android.gms.internal.ads.QE0) cause).f30948C;
                                iR = 18;
                            } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                                errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                                iR = r(errorCode);
                            } else {
                                i11 = 22;
                            }
                            int i21 = iR;
                            iE = errorCode;
                            i11 = i21;
                        }
                    }
                } else if (!z6) {
                    if (!z6) {
                    }
                    if (cause instanceof com.google.android.gms.internal.ads.IG0) {
                        iE = com.google.android.gms.internal.ads.EW.E(((com.google.android.gms.internal.ads.IG0) cause).f28435F);
                        i11 = 13;
                    } else {
                        iR = 14;
                        if (cause instanceof com.google.android.gms.internal.ads.C5883zG0) {
                            errorCode = ((com.google.android.gms.internal.ads.C5883zG0) cause).f40245D;
                        } else if (cause instanceof java.lang.OutOfMemoryError) {
                            i11 = 14;
                        } else if (cause instanceof com.google.android.gms.internal.ads.NE0) {
                            errorCode = ((com.google.android.gms.internal.ads.NE0) cause).f30203C;
                            iR = 17;
                        } else if (cause instanceof com.google.android.gms.internal.ads.QE0) {
                            errorCode = ((com.google.android.gms.internal.ads.QE0) cause).f30948C;
                            iR = 18;
                        } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                            errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                            iR = r(errorCode);
                        } else {
                            i11 = 22;
                        }
                        int i22 = iR;
                        iE = errorCode;
                        i11 = i22;
                    }
                } else {
                    if (!z6) {
                    }
                    if (cause instanceof com.google.android.gms.internal.ads.IG0) {
                        iE = com.google.android.gms.internal.ads.EW.E(((com.google.android.gms.internal.ads.IG0) cause).f28435F);
                        i11 = 13;
                    } else {
                        iR = 14;
                        if (cause instanceof com.google.android.gms.internal.ads.C5883zG0) {
                            errorCode = ((com.google.android.gms.internal.ads.C5883zG0) cause).f40245D;
                        } else if (cause instanceof java.lang.OutOfMemoryError) {
                            i11 = 14;
                        } else if (cause instanceof com.google.android.gms.internal.ads.NE0) {
                            errorCode = ((com.google.android.gms.internal.ads.NE0) cause).f30203C;
                            iR = 17;
                        } else if (cause instanceof com.google.android.gms.internal.ads.QE0) {
                            errorCode = ((com.google.android.gms.internal.ads.QE0) cause).f30948C;
                            iR = 18;
                        } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                            errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                            iR = r(errorCode);
                        } else {
                            i11 = 22;
                        }
                        int i23 = iR;
                        iE = errorCode;
                        i11 = i23;
                    }
                }
                this.f33077E.reportPlaybackErrorEvent(com.google.android.gms.internal.ads.OD0.a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f33078F).setErrorCode(i11).setSubErrorCode(iE).setException(abstractC2715Pf).build());
                this.f33100b0 = true;
                this.f33088P = null;
            }
            iE = 0;
            this.f33077E.reportPlaybackErrorEvent(com.google.android.gms.internal.ads.OD0.a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f33078F).setErrorCode(i11).setSubErrorCode(iE).setException(abstractC2715Pf).build());
            this.f33100b0 = true;
            this.f33088P = null;
        }
        if (mb0.d(2)) {
            com.google.android.gms.internal.ads.C3852gq c3852gqP = interfaceC5045rj.p();
            boolean zB = c3852gqP.b(2);
            boolean zB2 = c3852gqP.b(1);
            boolean zB3 = c3852gqP.b(3);
            if (zB || zB2) {
                if (!zB) {
                    w(jElapsedRealtime, null, 0);
                }
                if (!zB2) {
                    t(jElapsedRealtime, null, 0);
                }
                if (!zB3) {
                    u(jElapsedRealtime, null, 0);
                }
            } else if (zB3) {
                zB3 = true;
                if (!zB) {
                    w(jElapsedRealtime, null, 0);
                }
                if (!zB2) {
                    t(jElapsedRealtime, null, 0);
                }
                if (!zB3) {
                    u(jElapsedRealtime, null, 0);
                }
            }
        }
        if (y(this.f33089Q)) {
            com.google.android.gms.internal.ads.D d6 = this.f33089Q.f32440a;
            if (d6.f26582w != -1) {
                w(jElapsedRealtime, d6, 0);
                this.f33089Q = null;
            }
        }
        if (y(this.f33090R)) {
            t(jElapsedRealtime, this.f33090R.f32440a, 0);
            this.f33090R = null;
        }
        if (y(this.f33091S)) {
            u(jElapsedRealtime, this.f33091S.f32440a, 0);
            this.f33091S = null;
        }
        switch (com.google.android.gms.internal.ads.C4908qQ.b(this.f33075C).a()) {
            case 0:
                i6 = 0;
                break;
            case 1:
                i6 = 9;
                break;
            case 2:
                i6 = 2;
                break;
            case 3:
                i6 = 4;
                break;
            case 4:
                i6 = 5;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
            case 8:
            default:
                i6 = 1;
                break;
            case 7:
                i6 = 3;
                break;
            case 9:
                i6 = 8;
                break;
            case 10:
                i6 = 7;
                break;
        }
        if (i6 != this.f33087O) {
            this.f33087O = i6;
            this.f33077E.reportNetworkEvent(com.google.android.gms.internal.ads.SD0.a().setNetworkType(i6).setTimeSinceCreatedMillis(jElapsedRealtime - this.f33078F).build());
        }
        if (interfaceC5045rj.e() != 2) {
            this.f33095W = false;
        }
        if (((com.google.android.gms.internal.ads.IB0) interfaceC5045rj).s() == null) {
            this.f33096X = false;
        } else if (mb0.d(10)) {
            this.f33096X = true;
        }
        int iE2 = interfaceC5045rj.e();
        if (this.f33095W) {
            i10 = 5;
        } else if (this.f33096X) {
            i10 = 13;
        } else {
            i10 = 4;
            if (iE2 == 4) {
                i10 = 11;
            } else if (iE2 == 2) {
                int i24 = this.f33086N;
                if (i24 == 0 || i24 == 2 || i24 == 12) {
                    i10 = 2;
                } else if (interfaceC5045rj.A()) {
                    i10 = interfaceC5045rj.i() != 0 ? 10 : 6;
                } else {
                    i10 = 7;
                }
            } else if (iE2 != 3) {
                i10 = (iE2 != 1 || this.f33086N == 0) ? this.f33086N : 12;
            } else if (interfaceC5045rj.A()) {
                i10 = interfaceC5045rj.i() != 0 ? 9 : 3;
            }
        }
        if (this.f33086N != i10) {
            this.f33086N = i10;
            this.f33100b0 = true;
            this.f33077E.reportPlaybackStateEvent(com.google.android.gms.internal.ads.TD0.a().setState(this.f33086N).setTimeSinceCreatedMillis(jElapsedRealtime - this.f33078F).build());
        }
        if (mb0.d(1028)) {
            this.f33076D.f(mb0.c(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void e(com.google.android.gms.internal.ads.LB0 lb0, int i6, long j6) {
    }

    @Override // com.google.android.gms.internal.ads.YD0
    public final void f(com.google.android.gms.internal.ads.LB0 lb0, java.lang.String str, boolean z6) {
        com.google.android.gms.internal.ads.LH0 lh0 = lb0.f29433d;
        if ((lh0 == null || !lh0.b()) && str.equals(this.f33083K)) {
            s();
        }
        this.f33081I.remove(str);
        this.f33082J.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void g(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.C2697Os c2697Os) {
        com.google.android.gms.internal.ads.VC0 vc0 = this.f33089Q;
        if (vc0 != null) {
            com.google.android.gms.internal.ads.D d6 = vc0.f32440a;
            if (d6.f26582w == -1) {
                com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
                c4682oK0B.G(c2697Os.f30583a);
                c4682oK0B.k(c2697Os.f30584b);
                this.f33089Q = new com.google.android.gms.internal.ads.VC0(c4682oK0B.H(), 0, vc0.f32442c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void h(com.google.android.gms.internal.ads.LB0 lb0, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.YD0
    public final void i(com.google.android.gms.internal.ads.LB0 lb0, java.lang.String str) {
        com.google.android.gms.internal.ads.LH0 lh0 = lb0.f29433d;
        if (lh0 == null || !lh0.b()) {
            s();
            this.f33083K = str;
            this.f33084L = com.google.android.gms.internal.ads.AbstractC5107sD0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.0-beta01");
            v(lb0.f29431b, lb0.f29433d);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void j(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.AbstractC2715Pf abstractC2715Pf) {
        this.f33088P = abstractC2715Pf;
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void k(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.C5043ri c5043ri, com.google.android.gms.internal.ads.C5043ri c5043ri2, int i6) {
        if (i6 == 1) {
            this.f33095W = true;
            i6 = 1;
        }
        this.f33085M = i6;
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void l(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.Gz0 gz0) {
        this.f33097Y += gz0.f27941g;
        this.f33098Z += gz0.f27939e;
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void m(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.BH0 bh0, com.google.android.gms.internal.ads.HH0 hh0, java.io.IOException iOException, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final /* synthetic */ void n(com.google.android.gms.internal.ads.LB0 lb0, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
    }

    public final android.media.metrics.LogSessionId o() {
        return this.f33077E.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.NB0
    public final void p(com.google.android.gms.internal.ads.LB0 lb0, int i6, long j6, long j10) {
        com.google.android.gms.internal.ads.LH0 lh0 = lb0.f29433d;
        if (lh0 != null) {
            java.lang.String strC = this.f33076D.c(lb0.f29431b, lh0);
            java.lang.Long l6 = (java.lang.Long) this.f33082J.get(strC);
            java.lang.Long l10 = (java.lang.Long) this.f33081I.get(strC);
            this.f33082J.put(strC, java.lang.Long.valueOf((l6 == null ? 0L : l6.longValue()) + j6));
            this.f33081I.put(strC, java.lang.Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) i6)));
        }
    }
}
