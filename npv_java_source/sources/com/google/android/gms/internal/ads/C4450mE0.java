package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4450mE0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.C4450mE0 f37299c = new com.google.android.gms.internal.ads.C4450mE0(com.google.android.gms.internal.ads.AbstractC3398ci0.P(com.google.android.gms.internal.ads.C3463dE0.f34670d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC3398ci0 f37300d = com.google.android.gms.internal.ads.AbstractC3398ci0.R(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.AbstractC3727fi0 f37301e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseArray f37302a = new android.util.SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37303b;

    static {
        com.google.android.gms.internal.ads.C3617ei0 c3617ei0 = new com.google.android.gms.internal.ads.C3617ei0();
        c3617ei0.a(5, 6);
        c3617ei0.a(17, 6);
        c3617ei0.a(7, 6);
        c3617ei0.a(30, 10);
        c3617ei0.a(18, 6);
        c3617ei0.a(6, 8);
        c3617ei0.a(8, 8);
        c3617ei0.a(14, 8);
        f37301e = c3617ei0.c();
    }

    private C4450mE0(java.util.List list) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.google.android.gms.internal.ads.C3463dE0 c3463dE0 = (com.google.android.gms.internal.ads.C3463dE0) list.get(i6);
            this.f37302a.put(c3463dE0.f34671a, c3463dE0);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.f37302a.size(); i10++) {
            iMax = java.lang.Math.max(iMax, ((com.google.android.gms.internal.ads.C3463dE0) this.f37302a.valueAt(i10)).f34672b);
        }
        this.f37303b = iMax;
    }

    static android.net.Uri a() {
        if (f()) {
            return android.provider.Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static com.google.android.gms.internal.ads.C4450mE0 c(android.content.Context context, com.google.android.gms.internal.ads.C5459vS c5459vS, com.google.android.gms.internal.ads.C5109sE0 c5109sE0) {
        return d(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c5459vS, c5109sE0);
    }

    static com.google.android.gms.internal.ads.C4450mE0 d(android.content.Context context, android.content.Intent intent, com.google.android.gms.internal.ads.C5459vS c5459vS, com.google.android.gms.internal.ads.C5109sE0 c5109sE0) {
        java.lang.Object systemService = context.getSystemService("audio");
        systemService.getClass();
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (c5109sE0 == null) {
            com.google.android.gms.internal.ads.C5109sE0 c5109sE1 = null;
            if (com.google.android.gms.internal.ads.EW.f27061a >= 33) {
                try {
                    java.util.List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c5459vS.a().f36750a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        c5109sE1 = new com.google.android.gms.internal.ads.C5109sE0((android.media.AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
            c5109sE0 = c5109sE1;
        }
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i6 >= 33 && (com.google.android.gms.internal.ads.EW.m(context) || com.google.android.gms.internal.ads.EW.i(context))) {
            java.util.List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c5459vS.a().f36750a);
            java.util.HashMap map = new java.util.HashMap();
            map.put(2, new java.util.HashSet(com.google.android.gms.internal.ads.AbstractC2466Ij0.g(12)));
            for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
                android.media.AudioProfile audioProfileA = com.google.android.gms.internal.ads.AbstractC3792gE0.a(directProfilesForAttributes.get(i10));
                if (audioProfileA.getEncapsulationType() != 1) {
                    int format = audioProfileA.getFormat();
                    if (com.google.android.gms.internal.ads.EW.j(format) || f37301e.containsKey(java.lang.Integer.valueOf(format))) {
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            java.util.Set set = (java.util.Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(com.google.android.gms.internal.ads.AbstractC2466Ij0.g(audioProfileA.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new java.util.HashSet(com.google.android.gms.internal.ads.AbstractC2466Ij0.g(audioProfileA.getChannelMasks())));
                        }
                    }
                }
            }
            com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
            for (java.util.Map.Entry entry : map.entrySet()) {
                c3083Zh0.g(new com.google.android.gms.internal.ads.C3463dE0(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set) entry.getValue()));
            }
            return new com.google.android.gms.internal.ads.C4450mE0(c3083Zh0.j());
        }
        if (i6 >= 23) {
            android.media.AudioDeviceInfo[] devices = c5109sE0 == null ? audioManager.getDevices(2) : new android.media.AudioDeviceInfo[]{c5109sE0.f38705a};
            com.google.android.gms.internal.ads.C3837gi0 c3837gi0 = new com.google.android.gms.internal.ads.C3837gi0();
            c3837gi0.h(8, 7);
            if (i6 >= 31) {
                c3837gi0.h(26, 27);
            }
            if (i6 >= 33) {
                c3837gi0.g(30);
            }
            com.google.android.gms.internal.ads.AbstractC3947hi0 abstractC3947hi0J = c3837gi0.j();
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC3947hi0J.contains(java.lang.Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f37299c;
                }
            }
        }
        com.google.android.gms.internal.ads.C3837gi0 c3837gi1 = new com.google.android.gms.internal.ads.C3837gi0();
        c3837gi1.g(2);
        if (com.google.android.gms.internal.ads.EW.f27061a >= 29 && (com.google.android.gms.internal.ads.EW.m(context) || com.google.android.gms.internal.ads.EW.i(context))) {
            com.google.android.gms.internal.ads.C3083Zh0 c3083Zh1 = new com.google.android.gms.internal.ads.C3083Zh0();
            com.google.android.gms.internal.ads.AbstractC4167jj0 abstractC4167jj0N = f37301e.keySet().n();
            while (abstractC4167jj0N.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) abstractC4167jj0N.next();
                int iIntValue = num.intValue();
                if (com.google.android.gms.internal.ads.EW.f27061a >= com.google.android.gms.internal.ads.EW.z(iIntValue) && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c5459vS.a().f36750a)) {
                    c3083Zh1.g(num);
                }
            }
            c3083Zh1.g(2);
            c3837gi1.i(c3083Zh1.j());
            return new com.google.android.gms.internal.ads.C4450mE0(e(com.google.android.gms.internal.ads.AbstractC2466Ij0.h(c3837gi1.j()), 10));
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        boolean z6 = android.provider.Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z6 || f()) && android.provider.Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c3837gi1.i(f37300d);
        }
        if (intent == null || z6 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new com.google.android.gms.internal.ads.C4450mE0(e(com.google.android.gms.internal.ads.AbstractC2466Ij0.h(c3837gi1.j()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c3837gi1.i(com.google.android.gms.internal.ads.AbstractC2466Ij0.g(intArrayExtra));
        }
        return new com.google.android.gms.internal.ads.C4450mE0(e(com.google.android.gms.internal.ads.AbstractC2466Ij0.h(c3837gi1.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static com.google.android.gms.internal.ads.AbstractC3398ci0 e(int[] iArr, int i6) {
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        for (int i10 : iArr) {
            c3083Zh0.g(new com.google.android.gms.internal.ads.C3463dE0(i10, i6));
        }
        return c3083Zh0.j();
    }

    private static boolean f() {
        java.lang.String str = com.google.android.gms.internal.ads.EW.f27063c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r0
  0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    public final android.util.Pair b(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.C5459vS c5459vS) {
        java.lang.String str = d6.f26574o;
        str.getClass();
        int iA = com.google.android.gms.internal.ads.AbstractC3606ed.a(str, d6.f26570k);
        if (!f37301e.containsKey(java.lang.Integer.valueOf(iA))) {
            return null;
        }
        int i6 = 8;
        if (iA != 18) {
            if (iA != 8) {
                if (iA == 30 && !com.google.android.gms.internal.ads.EW.g(this.f37302a, 30)) {
                    iA = 7;
                }
            } else if (com.google.android.gms.internal.ads.EW.g(this.f37302a, 8)) {
                iA = 8;
                if (iA == 30) {
                    iA = 7;
                }
            } else {
                iA = 7;
            }
        } else if (com.google.android.gms.internal.ads.EW.g(this.f37302a, 18)) {
            iA = 18;
            if (iA != 8) {
                if (iA == 30) {
                    iA = 7;
                }
            } else if (com.google.android.gms.internal.ads.EW.g(this.f37302a, 8)) {
                iA = 8;
                if (iA == 30) {
                    iA = 7;
                }
            } else {
                iA = 7;
            }
        } else {
            iA = 6;
        }
        if (!com.google.android.gms.internal.ads.EW.g(this.f37302a, iA)) {
            return null;
        }
        com.google.android.gms.internal.ads.C3463dE0 c3463dE0 = (com.google.android.gms.internal.ads.C3463dE0) this.f37302a.get(iA);
        c3463dE0.getClass();
        int iA2 = d6.f26551D;
        if (iA2 == -1 || iA == 18) {
            int i10 = d6.f26552E;
            if (i10 == -1) {
                i10 = 48000;
            }
            iA2 = c3463dE0.a(i10, c5459vS);
        } else if (!d6.f26574o.equals("audio/vnd.dts.uhd;profile=p2") || com.google.android.gms.internal.ads.EW.f27061a >= 33) {
            if (!c3463dE0.b(iA2)) {
                return null;
            }
        } else if (iA2 > 10) {
            return null;
        }
        int i11 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i11 > 28) {
            i6 = iA2;
        } else if (iA2 != 7) {
            if (iA2 == 3 || iA2 == 4 || iA2 == 5) {
                i6 = 6;
            } else {
                i6 = iA2;
            }
        }
        if (i11 <= 26 && "fugu".equals(com.google.android.gms.internal.ads.EW.f27062b) && i6 == 1) {
            i6 = 2;
        }
        int iA3 = com.google.android.gms.internal.ads.EW.A(i6);
        if (iA3 != 0) {
            return android.util.Pair.create(java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(iA3));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C4450mE0)) {
            return false;
        }
        com.google.android.gms.internal.ads.C4450mE0 c4450mE0 = (com.google.android.gms.internal.ads.C4450mE0) obj;
        android.util.SparseArray sparseArray = this.f37302a;
        android.util.SparseArray sparseArray2 = c4450mE0.f37302a;
        if (com.google.android.gms.internal.ads.EW.f27061a < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i6 = 0; i6 < size; i6++) {
                    if (j$.util.Objects.equals(sparseArray.valueAt(i6), sparseArray2.get(sparseArray.keyAt(i6)))) {
                    }
                }
                if (this.f37303b == c4450mE0.f37303b) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.f37303b == c4450mE0.f37303b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        android.util.SparseArray sparseArray = this.f37302a;
        if (i6 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i10)) * 31) + j$.util.Objects.hashCode(sparseArray.valueAt(i10));
            }
            iContentHashCode = iKeyAt;
        }
        return this.f37303b + (iContentHashCode * 31);
    }

    public final java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f37303b + ", audioProfiles=" + this.f37302a.toString() + "]";
    }
}
