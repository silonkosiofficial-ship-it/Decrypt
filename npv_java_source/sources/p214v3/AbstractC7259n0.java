package p214v3;

/* JADX INFO: renamed from: v3.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7259n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.util.List f55912b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f55911a = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f55913c = new java.lang.Object();

    public static java.util.List a(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.lang.Object obj = f55913c;
        synchronized (obj) {
            java.util.Map map = f55911a;
            if (map.containsKey(str)) {
                return (java.util.List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (f55912b == null) {
                            f55912b = java.util.Arrays.asList(new android.media.MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new java.util.ArrayList();
                        for (android.media.MediaCodecInfo mediaCodecInfo : f55912b) {
                            if (!mediaCodecInfo.isEncoder() && java.util.Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                java.util.HashMap map2 = new java.util.HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new java.lang.Integer[]{java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                map2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                map2.put("widthAlignment", java.lang.Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                map2.put("heightAlignment", java.lang.Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                map2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                map2.put("widths", b(videoCapabilities.getSupportedWidths()));
                                map2.put("heights", b(videoCapabilities.getSupportedHeights()));
                                map2.put("instancesLimit", java.lang.Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(map2);
                            }
                        }
                        f55911a.put(str, arrayList);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return arrayList;
            } catch (java.lang.LinkageError e6) {
                e = e6;
                java.util.HashMap map3 = new java.util.HashMap();
                map3.put("error", e.getClass().getSimpleName());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(map3);
                f55911a.put(str, arrayList3);
                return arrayList3;
            } catch (java.lang.RuntimeException e10) {
                e = e10;
                java.util.HashMap map4 = new java.util.HashMap();
                map4.put("error", e.getClass().getSimpleName());
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(map4);
                f55911a.put(str, arrayList4);
                return arrayList4;
            }
        }
    }

    private static java.lang.Integer[] b(android.util.Range range) {
        return new java.lang.Integer[]{(java.lang.Integer) range.getLower(), (java.lang.Integer) range.getUpper()};
    }
}
