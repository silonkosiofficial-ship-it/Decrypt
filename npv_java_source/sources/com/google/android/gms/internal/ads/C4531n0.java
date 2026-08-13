package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4531n0 implements com.google.android.gms.internal.ads.InterfaceC5740y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f37456c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C4421m0 f37457d = new com.google.android.gms.internal.ads.C4421m0(new com.google.android.gms.internal.ads.InterfaceC4311l0() { // from class: com.google.android.gms.internal.ads.j0
        @Override // com.google.android.gms.internal.ads.InterfaceC4311l0
        public final java.lang.reflect.Constructor a() {
            if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(com.google.android.gms.internal.ads.InterfaceC5190t0.class).getConstructor(java.lang.Integer.TYPE);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C4421m0 f37458e = new com.google.android.gms.internal.ads.C4421m0(new com.google.android.gms.internal.ads.InterfaceC4311l0() { // from class: com.google.android.gms.internal.ads.k0
        @Override // com.google.android.gms.internal.ads.InterfaceC4311l0
        public final java.lang.reflect.Constructor a() {
            return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(com.google.android.gms.internal.ads.InterfaceC5190t0.class).getConstructor(null);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC3398ci0 f37459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4869q4 f37460b = new com.google.android.gms.internal.ads.C4209k4();

    private final void b(int i6, java.util.List list) {
        switch (i6) {
            case 0:
                list.add(new com.google.android.gms.internal.ads.C4761p5());
                break;
            case 1:
                list.add(new com.google.android.gms.internal.ads.C4980r5());
                break;
            case 2:
                list.add(new com.google.android.gms.internal.ads.C5200t5(0));
                break;
            case 3:
                list.add(new com.google.android.gms.internal.ads.C3985i1(0));
                break;
            case 4:
                com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t0A = f37457d.a(0);
                if (interfaceC5190t0A == null) {
                    list.add(new com.google.android.gms.internal.ads.A1(0));
                } else {
                    list.add(interfaceC5190t0A);
                }
                break;
            case 5:
                list.add(new com.google.android.gms.internal.ads.C1());
                break;
            case 6:
                list.add(new com.google.android.gms.internal.ads.X2(this.f37460b, 0));
                break;
            case 7:
                list.add(new com.google.android.gms.internal.ads.C3330c3(0));
                break;
            case 8:
                list.add(new com.google.android.gms.internal.ads.B3(this.f37460b, 0, null, null, com.google.android.gms.internal.ads.AbstractC3398ci0.O(), null));
                list.add(new com.google.android.gms.internal.ads.G3(this.f37460b, 0));
                break;
            case 9:
                list.add(new com.google.android.gms.internal.ads.X3());
                break;
            case 10:
                list.add(new com.google.android.gms.internal.ads.Z5());
                break;
            case 11:
                if (this.f37459a == null) {
                    this.f37459a = com.google.android.gms.internal.ads.AbstractC3398ci0.O();
                }
                list.add(new com.google.android.gms.internal.ads.C4103j6(1, 0, this.f37460b, new com.google.android.gms.internal.ads.C3267bV(0L), new com.google.android.gms.internal.ads.C5420v5(0, this.f37459a), 112800));
                break;
            case 12:
                list.add(new com.google.android.gms.internal.ads.C5422v6());
                break;
            case 14:
                list.add(new com.google.android.gms.internal.ads.J1(0));
                break;
            case 15:
                com.google.android.gms.internal.ads.InterfaceC5190t0 interfaceC5190t0A2 = f37458e.a(new java.lang.Object[0]);
                if (interfaceC5190t0A2 != null) {
                    list.add(interfaceC5190t0A2);
                }
                break;
            case 16:
                list.add(new com.google.android.gms.internal.ads.C4533n1(0, this.f37460b));
                break;
            case 17:
                list.add(new com.google.android.gms.internal.ads.C3991i4());
                break;
            case 18:
                list.add(new com.google.android.gms.internal.ads.A6());
                break;
            case 19:
                list.add(new com.google.android.gms.internal.ads.C5412v1());
                break;
            case 20:
                list.add(new com.google.android.gms.internal.ads.H1());
                break;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                list.add(new com.google.android.gms.internal.ads.C5302u1());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5740y0
    public final synchronized com.google.android.gms.internal.ads.InterfaceC5190t0[] a(android.net.Uri uri, java.util.Map map) {
        java.util.ArrayList arrayList;
        int i6;
        int i10;
        try {
            arrayList = new java.util.ArrayList(21);
            java.util.List list = (java.util.List) map.get("Content-Type");
            java.lang.String str = (list == null || list.isEmpty()) ? null : (java.lang.String) list.get(0);
            if (str != null) {
                switch (com.google.android.gms.internal.ads.AbstractC3606ed.e(str)) {
                    case "audio/ac3":
                    case "audio/eac3":
                    case "audio/eac3-joc":
                        i6 = 0;
                        break;
                    case "audio/ac4":
                        i6 = 1;
                        break;
                    case "audio/amr":
                    case "audio/3gpp":
                    case "audio/amr-wb":
                        i6 = 3;
                        break;
                    case "audio/flac":
                        i6 = 4;
                        break;
                    case "video/x-flv":
                        i6 = 5;
                        break;
                    case "audio/midi":
                        i6 = 15;
                        break;
                    case "video/x-matroska":
                    case "audio/x-matroska":
                    case "video/webm":
                    case "audio/webm":
                    case "application/webm":
                        i6 = 6;
                        break;
                    case "audio/mpeg":
                        i6 = 7;
                        break;
                    case "video/mp4":
                    case "audio/mp4":
                    case "application/mp4":
                        i6 = 8;
                        break;
                    case "audio/ogg":
                        i6 = 9;
                        break;
                    case "video/mp2p":
                        i6 = 10;
                        break;
                    case "video/mp2t":
                        i6 = 11;
                        break;
                    case "audio/wav":
                        i6 = 12;
                        break;
                    case "text/vtt":
                        i6 = 13;
                        break;
                    case "image/jpeg":
                        i6 = 14;
                        break;
                    case "video/x-msvideo":
                        i6 = 16;
                        break;
                    case "image/png":
                        i6 = 17;
                        break;
                    case "image/webp":
                        i6 = 18;
                        break;
                    case "image/bmp":
                        i6 = 19;
                        break;
                    case "image/heif":
                    case "image/heic":
                        i6 = 20;
                        break;
                    case "image/avif":
                        i6 = 21;
                        break;
                    default:
                        i6 = -1;
                        break;
                }
            } else {
                i6 = -1;
            }
            if (i6 != -1) {
                b(i6, arrayList);
            }
            java.lang.String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i10 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i10 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i10 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i10 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i10 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i10 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i10 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i10 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i10 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i10 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i10 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i10 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i10 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i10 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i10 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i10 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i10 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i10 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i10 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i10 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i10 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i10 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i10 = 21;
            } else {
                i10 = -1;
            }
            if (i10 != -1 && i10 != i6) {
                b(i10, arrayList);
            }
            int[] iArr = f37456c;
            for (int i11 = 0; i11 < 21; i11++) {
                int i12 = iArr[i11];
                if (i12 != i6 && i12 != i10) {
                    b(i12, arrayList);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return (com.google.android.gms.internal.ads.InterfaceC5190t0[]) arrayList.toArray(new com.google.android.gms.internal.ads.InterfaceC5190t0[arrayList.size()]);
    }
}
