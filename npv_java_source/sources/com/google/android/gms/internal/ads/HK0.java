package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class HK0 extends com.google.android.gms.internal.ads.NG0 implements com.google.android.gms.internal.ads.InterfaceC4420m {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int[] f28012g1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static boolean f28013h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static boolean f28014i1;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final boolean f28015A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F f28016B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final boolean f28017C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4530n f28018D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4310l f28019E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.GK0 f28020F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f28021G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private boolean f28022H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.L f28023I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f28024J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private java.util.List f28025K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private android.view.Surface f28026L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.KK0 f28027M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.UR f28028N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f28029O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f28030P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private int f28031Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private long f28032R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private int f28033S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private int f28034T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private int f28035U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private long f28036V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private int f28037W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private long f28038X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2697Os f28039Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2697Os f28040Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f28041a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f28042b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4200k f28043c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private long f28044d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f28045e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f28046f1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final android.content.Context f28047z0;

    public HK0(android.content.Context context, com.google.android.gms.internal.ads.InterfaceC5443vG0 interfaceC5443vG0, com.google.android.gms.internal.ads.PG0 pg0, long j6, boolean z6, android.os.Handler handler, com.google.android.gms.internal.ads.G g6, int i6, float f6) {
        super(2, interfaceC5443vG0, pg0, false, 30.0f);
        android.content.Context applicationContext = context.getApplicationContext();
        this.f28047z0 = applicationContext;
        this.f28023I0 = null;
        this.f28016B0 = new com.google.android.gms.internal.ads.F(handler, g6);
        this.f28015A0 = true;
        this.f28018D0 = new com.google.android.gms.internal.ads.C4530n(applicationContext, this, 0L);
        this.f28019E0 = new com.google.android.gms.internal.ads.C4310l();
        this.f28017C0 = "NVIDIA".equals(com.google.android.gms.internal.ads.EW.f27063c);
        this.f28028N0 = com.google.android.gms.internal.ads.UR.f32204c;
        this.f28030P0 = 1;
        this.f28031Q0 = 0;
        this.f28039Y0 = com.google.android.gms.internal.ads.C2697Os.f30582d;
        this.f28042b1 = 0;
        this.f28040Z0 = null;
        this.f28041a1 = -1000;
        this.f28044d1 = -9223372036854775807L;
        this.f28045e1 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x015f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0163  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x020b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x021f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0223  */
    /* JADX WARN: Code duplicated, block: B:158:0x022b  */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0237  */
    /* JADX WARN: Code duplicated, block: B:162:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0243  */
    /* JADX WARN: Code duplicated, block: B:165:0x0247  */
    /* JADX WARN: Code duplicated, block: B:167:0x024f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0253  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:171:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0267  */
    /* JADX WARN: Code duplicated, block: B:174:0x026b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0273  */
    /* JADX WARN: Code duplicated, block: B:177:0x0277  */
    /* JADX WARN: Code duplicated, block: B:179:0x027f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:182:0x028b  */
    /* JADX WARN: Code duplicated, block: B:183:0x028f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:186:0x029b  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02af  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:203:0x02df  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0302  */
    /* JADX WARN: Code duplicated, block: B:213:0x0306  */
    /* JADX WARN: Code duplicated, block: B:215:0x030e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0312  */
    /* JADX WARN: Code duplicated, block: B:218:0x031a  */
    /* JADX WARN: Code duplicated, block: B:219:0x031e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0326  */
    /* JADX WARN: Code duplicated, block: B:222:0x032a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0332  */
    /* JADX WARN: Code duplicated, block: B:225:0x0336  */
    /* JADX WARN: Code duplicated, block: B:227:0x033e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0342  */
    /* JADX WARN: Code duplicated, block: B:230:0x034a  */
    /* JADX WARN: Code duplicated, block: B:231:0x034e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0356  */
    /* JADX WARN: Code duplicated, block: B:234:0x035a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0362  */
    /* JADX WARN: Code duplicated, block: B:237:0x0366  */
    /* JADX WARN: Code duplicated, block: B:239:0x036e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0372  */
    /* JADX WARN: Code duplicated, block: B:242:0x037a  */
    /* JADX WARN: Code duplicated, block: B:243:0x037e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0386  */
    /* JADX WARN: Code duplicated, block: B:246:0x038a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0392  */
    /* JADX WARN: Code duplicated, block: B:249:0x0396  */
    /* JADX WARN: Code duplicated, block: B:251:0x039e  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:260:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:261:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:263:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:267:0x03db  */
    /* JADX WARN: Code duplicated, block: B:269:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:272:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:275:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:278:0x0407  */
    /* JADX WARN: Code duplicated, block: B:279:0x040b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0413  */
    /* JADX WARN: Code duplicated, block: B:282:0x0417  */
    /* JADX WARN: Code duplicated, block: B:284:0x041f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0423  */
    /* JADX WARN: Code duplicated, block: B:287:0x042b  */
    /* JADX WARN: Code duplicated, block: B:288:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0437  */
    /* JADX WARN: Code duplicated, block: B:291:0x043b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0443  */
    /* JADX WARN: Code duplicated, block: B:294:0x0447  */
    /* JADX WARN: Code duplicated, block: B:296:0x044f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0453  */
    /* JADX WARN: Code duplicated, block: B:299:0x045b  */
    /* JADX WARN: Code duplicated, block: B:300:0x045f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0467  */
    /* JADX WARN: Code duplicated, block: B:303:0x046b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0473  */
    /* JADX WARN: Code duplicated, block: B:306:0x0477  */
    /* JADX WARN: Code duplicated, block: B:308:0x047f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0483  */
    /* JADX WARN: Code duplicated, block: B:311:0x048b  */
    /* JADX WARN: Code duplicated, block: B:312:0x048f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0497  */
    /* JADX WARN: Code duplicated, block: B:315:0x049a  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:318:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:323:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:324:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:327:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:332:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:336:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:341:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:342:0x0500  */
    /* JADX WARN: Code duplicated, block: B:344:0x0508  */
    /* JADX WARN: Code duplicated, block: B:345:0x050c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0514  */
    /* JADX WARN: Code duplicated, block: B:348:0x0518  */
    /* JADX WARN: Code duplicated, block: B:350:0x0520  */
    /* JADX WARN: Code duplicated, block: B:351:0x0524  */
    /* JADX WARN: Code duplicated, block: B:353:0x052c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0530  */
    /* JADX WARN: Code duplicated, block: B:356:0x0538  */
    /* JADX WARN: Code duplicated, block: B:357:0x053c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0544  */
    /* JADX WARN: Code duplicated, block: B:360:0x0548  */
    /* JADX WARN: Code duplicated, block: B:362:0x0550  */
    /* JADX WARN: Code duplicated, block: B:363:0x0554  */
    /* JADX WARN: Code duplicated, block: B:365:0x055c  */
    /* JADX WARN: Code duplicated, block: B:366:0x0560  */
    /* JADX WARN: Code duplicated, block: B:368:0x0568  */
    /* JADX WARN: Code duplicated, block: B:369:0x056c  */
    /* JADX WARN: Code duplicated, block: B:371:0x0574  */
    /* JADX WARN: Code duplicated, block: B:372:0x0578  */
    /* JADX WARN: Code duplicated, block: B:374:0x0580  */
    /* JADX WARN: Code duplicated, block: B:375:0x0584  */
    /* JADX WARN: Code duplicated, block: B:377:0x058c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0590  */
    /* JADX WARN: Code duplicated, block: B:380:0x0598  */
    /* JADX WARN: Code duplicated, block: B:381:0x059c  */
    /* JADX WARN: Code duplicated, block: B:383:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:384:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:386:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:389:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:392:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:393:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:395:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:396:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:401:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:404:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:405:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:407:0x0604  */
    /* JADX WARN: Code duplicated, block: B:408:0x0608  */
    /* JADX WARN: Code duplicated, block: B:410:0x0610  */
    /* JADX WARN: Code duplicated, block: B:411:0x0614  */
    /* JADX WARN: Code duplicated, block: B:413:0x061c  */
    /* JADX WARN: Code duplicated, block: B:414:0x0620  */
    /* JADX WARN: Code duplicated, block: B:416:0x0628  */
    /* JADX WARN: Code duplicated, block: B:417:0x062c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0634  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x0638  */
    /* JADX WARN: Code duplicated, block: B:422:0x0640  */
    /* JADX WARN: Code duplicated, block: B:423:0x0644  */
    /* JADX WARN: Code duplicated, block: B:425:0x064c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0650  */
    /* JADX WARN: Code duplicated, block: B:428:0x0658  */
    /* JADX WARN: Code duplicated, block: B:429:0x065b  */
    /* JADX WARN: Code duplicated, block: B:431:0x0663  */
    /* JADX WARN: Code duplicated, block: B:432:0x0666  */
    /* JADX WARN: Code duplicated, block: B:434:0x066e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0672  */
    /* JADX WARN: Code duplicated, block: B:437:0x067a  */
    /* JADX WARN: Code duplicated, block: B:438:0x067e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0686  */
    /* JADX WARN: Code duplicated, block: B:441:0x068a  */
    /* JADX WARN: Code duplicated, block: B:443:0x0692  */
    /* JADX WARN: Code duplicated, block: B:444:0x0696  */
    /* JADX WARN: Code duplicated, block: B:446:0x069e  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:449:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:450:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:452:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:453:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:456:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:458:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:461:0x06da  */
    /* JADX WARN: Code duplicated, block: B:462:0x06de  */
    /* JADX WARN: Code duplicated, block: B:464:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:467:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:468:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:470:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:471:0x0702  */
    /* JADX WARN: Code duplicated, block: B:473:0x070a  */
    /* JADX WARN: Code duplicated, block: B:474:0x070e  */
    /* JADX WARN: Code duplicated, block: B:476:0x0716  */
    /* JADX WARN: Code duplicated, block: B:477:0x071a  */
    /* JADX WARN: Code duplicated, block: B:479:0x0722  */
    /* JADX WARN: Code duplicated, block: B:480:0x0726  */
    /* JADX WARN: Code duplicated, block: B:482:0x072e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0731  */
    /* JADX WARN: Code duplicated, block: B:485:0x0739  */
    /* JADX WARN: Code duplicated, block: B:486:0x073c  */
    /* JADX WARN: Code duplicated, block: B:488:0x0744  */
    /* JADX WARN: Code duplicated, block: B:489:0x0747  */
    /* JADX WARN: Code duplicated, block: B:491:0x074f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0752  */
    /* JADX WARN: Code duplicated, block: B:494:0x075a  */
    /* JADX WARN: Code duplicated, block: B:495:0x075d  */
    /* JADX WARN: Code duplicated, block: B:497:0x0765  */
    /* JADX WARN: Code duplicated, block: B:498:0x0768  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:500:0x0770  */
    /* JADX WARN: Code duplicated, block: B:501:0x0773  */
    /* JADX WARN: Code duplicated, block: B:503:0x077b  */
    /* JADX WARN: Code duplicated, block: B:504:0x077e  */
    /* JADX WARN: Code duplicated, block: B:506:0x0786  */
    /* JADX WARN: Code duplicated, block: B:507:0x0789  */
    /* JADX WARN: Code duplicated, block: B:509:0x078d A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:513:0x0797  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:516:0x07a1, B:46:0x008a, B:49:0x0095, B:84:0x0104, B:509:0x078d, B:517:0x07a5), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean g1(java.lang.String str) {
        java.lang.String str2;
        byte b6;
        java.lang.String str3;
        byte b10;
        boolean z6 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (com.google.android.gms.internal.ads.HK0.class) {
            if (!f28013h1) {
                int i6 = com.google.android.gms.internal.ads.EW.f27061a;
                byte b11 = 28;
                if (i6 <= 28) {
                    java.lang.String str4 = com.google.android.gms.internal.ads.EW.f27062b;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b10 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b10 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b10 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b10 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b10 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b10 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b10 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b10 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i6 <= 27 || !"HWEML".equals(com.google.android.gms.internal.ads.EW.f27062b)) {
                                str2 = com.google.android.gms.internal.ads.EW.f27064d;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b6 = -1;
                                        } else {
                                            b6 = 5;
                                        }
                                        break;
                                    default:
                                        b6 = -1;
                                        break;
                                }
                                switch (b6) {
                                    default:
                                        if (i6 <= 26) {
                                            str3 = com.google.android.gms.internal.ads.EW.f27062b;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b11 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b11 = -1;
                                                    } else {
                                                        b11 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b11 = -1;
                                                    break;
                                            }
                                            switch (b11) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 127 */:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z6 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z6 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z6 = true;
                            break;
                    }
                } else if (i6 <= 27) {
                    str2 = com.google.android.gms.internal.ads.EW.f27064d;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b6 = -1;
                            } else {
                                b6 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b6 = -1;
                            } else {
                                b6 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b6 = -1;
                            } else {
                                b6 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b6 = -1;
                            } else {
                                b6 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b6 = -1;
                            } else {
                                b6 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b6 = -1;
                            } else {
                                b6 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b6 = -1;
                            } else {
                                b6 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b6 = -1;
                            } else {
                                b6 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b6 = -1;
                            } else {
                                b6 = 5;
                            }
                            break;
                        default:
                            b6 = -1;
                            break;
                    }
                    switch (b6) {
                        default:
                            if (i6 <= 26) {
                                str3 = com.google.android.gms.internal.ads.EW.f27062b;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b11 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 66;
                                        }
                                        break;
                                    default:
                                        b11 = -1;
                                        break;
                                }
                                switch (b11) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 127 */:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z6 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z6 = true;
                            break;
                    }
                } else {
                    str2 = com.google.android.gms.internal.ads.EW.f27064d;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b6 = -1;
                            } else {
                                b6 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b6 = -1;
                            } else {
                                b6 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b6 = -1;
                            } else {
                                b6 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b6 = -1;
                            } else {
                                b6 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b6 = -1;
                            } else {
                                b6 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b6 = -1;
                            } else {
                                b6 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b6 = -1;
                            } else {
                                b6 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b6 = -1;
                            } else {
                                b6 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b6 = -1;
                            } else {
                                b6 = 5;
                            }
                            break;
                        default:
                            b6 = -1;
                            break;
                    }
                    switch (b6) {
                        default:
                            if (i6 <= 26) {
                                str3 = com.google.android.gms.internal.ads.EW.f27062b;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b11 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b11 = -1;
                                        } else {
                                            b11 = 66;
                                        }
                                        break;
                                    default:
                                        b11 = -1;
                                        break;
                                }
                                switch (b11) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            break;
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 127 */:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z6 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z6 = true;
                            break;
                    }
                }
                f28014i1 = z6;
                f28013h1 = true;
            }
        }
        return f28014i1;
    }

    protected static final boolean h1(com.google.android.gms.internal.ads.AG0 ag0) {
        return com.google.android.gms.internal.ads.EW.f27061a >= 35 && ag0.f25101h;
    }

    private final android.view.Surface i1(com.google.android.gms.internal.ads.AG0 ag0) {
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            return l6.a();
        }
        android.view.Surface surface = this.f28026L0;
        if (surface != null) {
            return surface;
        }
        if (h1(ag0)) {
            return null;
        }
        com.google.android.gms.internal.ads.LC.f(t1(ag0));
        com.google.android.gms.internal.ads.KK0 kk0 = this.f28027M0;
        if (kk0 != null) {
            if (kk0.f28897C != ag0.f25099f) {
                r1();
            }
        }
        if (this.f28027M0 == null) {
            this.f28027M0 = com.google.android.gms.internal.ads.KK0.a(this.f28047z0, ag0.f25099f);
        }
        return this.f28027M0;
    }

    private static java.util.List j1(android.content.Context context, com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6, boolean z6, boolean z10) {
        java.lang.String str = d6.f26574o;
        if (str == null) {
            return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
        }
        if (com.google.android.gms.internal.ads.EW.f27061a >= 26 && "video/dolby-vision".equals(str) && !com.google.android.gms.internal.ads.FK0.a(context)) {
            java.util.List listC = com.google.android.gms.internal.ads.AbstractC3688fH0.c(pg0, d6, z6, z10);
            if (!listC.isEmpty()) {
                return listC;
            }
        }
        return com.google.android.gms.internal.ads.AbstractC3688fH0.e(pg0, d6, z6, z10);
    }

    private final void k1() {
        com.google.android.gms.internal.ads.C2697Os c2697Os = this.f28040Z0;
        if (c2697Os != null) {
            this.f28016B0.t(c2697Os);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        this.f28016B0.q(this.f28026L0);
        this.f28029O0 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int m1(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6) {
        int iIntValue;
        int i6 = d6.f26581v;
        int i10 = d6.f26582w;
        if (i6 != -1 && i10 != -1) {
            java.lang.String str = d6.f26574o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i11 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
                android.util.Pair pairA = com.google.android.gms.internal.ads.ND.a(d6);
                str = (pairA == null || !((iIntValue = ((java.lang.Integer) pairA.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i12 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i6 * i10) * 3) / i12;
                case "video/hevc":
                    return java.lang.Math.max(2097152, ((i6 * i10) * 3) / 4);
                case "video/avc":
                    java.lang.String str2 = com.google.android.gms.internal.ads.EW.f27064d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(com.google.android.gms.internal.ads.EW.f27063c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !ag0.f25099f)))) {
                        return ((((i6 + 15) / 16) * ((i10 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i12 = 8;
                    return ((i6 * i10) * 3) / i12;
            }
        }
        return -1;
    }

    protected static int n1(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6) {
        if (d6.f26575p == -1) {
            return m1(ag0, d6);
        }
        int size = d6.f26577r.size();
        int length = 0;
        for (int i6 = 0; i6 < size; i6++) {
            length += ((byte[]) d6.f26577r.get(i6)).length;
        }
        return d6.f26575p + length;
    }

    private final void r1() {
        com.google.android.gms.internal.ads.KK0 kk0 = this.f28027M0;
        if (kk0 != null) {
            kk0.release();
            this.f28027M0 = null;
        }
    }

    private final boolean s1(com.google.android.gms.internal.ads.AG0 ag0) {
        android.view.Surface surface = this.f28026L0;
        return (surface != null && surface.isValid()) || h1(ag0) || t1(ag0);
    }

    private final boolean t1(com.google.android.gms.internal.ads.AG0 ag0) {
        if (com.google.android.gms.internal.ads.EW.f27061a < 23 || g1(ag0.f25094a)) {
            return false;
        }
        return !ag0.f25099f || com.google.android.gms.internal.ads.KK0.b(this.f28047z0);
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void B() {
        try {
            super.B();
        } finally {
            this.f28024J0 = false;
            this.f28044d1 = -9223372036854775807L;
            r1();
        }
    }

    @Override // com.google.android.gms.internal.ads.Fz0
    protected final void C() {
        this.f28033S0 = 0;
        this.f28032R0 = P().b();
        this.f28036V0 = 0L;
        this.f28037W0 = 0;
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.j();
        } else {
            this.f28018D0.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.Fz0
    protected final void D() {
        if (this.f28033S0 > 0) {
            long jB = P().b();
            this.f28016B0.d(this.f28033S0, jB - this.f28032R0);
            this.f28033S0 = 0;
            this.f28032R0 = jB;
        }
        int i6 = this.f28037W0;
        if (i6 != 0) {
            this.f28016B0.r(this.f28036V0, i6);
            this.f28036V0 = 0L;
            this.f28037W0 = 0;
        }
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.k();
        } else {
            this.f28018D0.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final int D0(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6) {
        boolean z6;
        if (!com.google.android.gms.internal.ads.AbstractC3606ed.i(d6.f26574o)) {
            return 128;
        }
        android.content.Context context = this.f28047z0;
        int i6 = 0;
        boolean z10 = d6.f26578s != null;
        java.util.List listJ1 = j1(context, pg0, d6, z10, false);
        if (z10 && listJ1.isEmpty()) {
            listJ1 = j1(context, pg0, d6, false, false);
        }
        if (listJ1.isEmpty()) {
            return 129;
        }
        if (!com.google.android.gms.internal.ads.NG0.u0(d6)) {
            return 130;
        }
        com.google.android.gms.internal.ads.AG0 ag0 = (com.google.android.gms.internal.ads.AG0) listJ1.get(0);
        boolean zE = ag0.e(d6);
        if (!zE) {
            int i10 = 1;
            while (true) {
                if (i10 >= listJ1.size()) {
                    z6 = true;
                    break;
                }
                com.google.android.gms.internal.ads.AG0 ag1 = (com.google.android.gms.internal.ads.AG0) listJ1.get(i10);
                if (ag1.e(d6)) {
                    zE = true;
                    z6 = false;
                    ag0 = ag1;
                    break;
                }
                i10++;
            }
        } else {
            z6 = true;
            break;
        }
        int i11 = true != zE ? 3 : 4;
        int i12 = true != ag0.f(d6) ? 8 : 16;
        int i13 = true != ag0.f25100g ? 0 : 64;
        int i14 = true != z6 ? 0 : 128;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 26 && "video/dolby-vision".equals(d6.f26574o) && !com.google.android.gms.internal.ads.FK0.a(context)) {
            i14 = 256;
        }
        if (zE) {
            java.util.List listJ2 = j1(context, pg0, d6, z10, true);
            if (!listJ2.isEmpty()) {
                com.google.android.gms.internal.ads.AG0 ag2 = (com.google.android.gms.internal.ads.AG0) com.google.android.gms.internal.ads.AbstractC3688fH0.f(listJ2, d6).get(0);
                if (ag2.e(d6) && ag2.f(d6)) {
                    i6 = 32;
                }
            }
        }
        return i14 | i11 | i12 | i6 | i13;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void E(com.google.android.gms.internal.ads.D[] dArr, long j6, long j10, com.google.android.gms.internal.ads.LH0 lh0) {
        super.E(dArr, j6, j10, lh0);
        if (this.f28044d1 == -9223372036854775807L) {
            this.f28044d1 = j6;
        }
        com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qmO = O();
        if (abstractC4942qmO.o()) {
            this.f28045e1 = -9223372036854775807L;
        } else {
            this.f28045e1 = abstractC4942qmO.n(lh0.f29454a, new com.google.android.gms.internal.ads.C4830pl()).f38061d;
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.Hz0 E0(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.D d10) {
        int i6;
        int i10;
        com.google.android.gms.internal.ads.Hz0 hz0B = ag0.b(d6, d10);
        int i11 = hz0B.f28360e;
        com.google.android.gms.internal.ads.GK0 gk0 = this.f28020F0;
        gk0.getClass();
        if (d10.f26581v > gk0.f27793a || d10.f26582w > gk0.f27794b) {
            i11 |= 256;
        }
        if (n1(ag0, d10) > gk0.f27795c) {
            i11 |= 64;
        }
        java.lang.String str = ag0.f25094a;
        if (i11 != 0) {
            i10 = i11;
            i6 = 0;
        } else {
            i6 = hz0B.f28359d;
            i10 = 0;
        }
        return new com.google.android.gms.internal.ads.Hz0(str, d6, d10, i6, i10);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.Hz0 F0(com.google.android.gms.internal.ads.UA0 ua0) {
        com.google.android.gms.internal.ads.Hz0 hz0F0 = super.F0(ua0);
        com.google.android.gms.internal.ads.D d6 = ua0.f32158a;
        d6.getClass();
        this.f28016B0.f(d6, hz0F0);
        return hz0F0;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.C5333uG0 I0(com.google.android.gms.internal.ads.AG0 ag0, com.google.android.gms.internal.ads.D d6, android.media.MediaCrypto mediaCrypto, float f6) {
        android.graphics.Point pointA;
        int i6;
        int i10;
        int iM1;
        com.google.android.gms.internal.ads.D[] dArrG = G();
        int length = dArrG.length;
        int iN1 = n1(ag0, d6);
        int iMax = d6.f26581v;
        int iMax2 = d6.f26582w;
        if (length != 1) {
            boolean z6 = false;
            for (int i11 = 0; i11 < length; i11++) {
                com.google.android.gms.internal.ads.D dH = dArrG[i11];
                if (d6.f26550C != null && dH.f26550C == null) {
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = dH.b();
                    c4682oK0B.b(d6.f26550C);
                    dH = c4682oK0B.H();
                }
                if (ag0.b(d6, dH).f28359d != 0) {
                    int i12 = dH.f26581v;
                    z6 |= i12 == -1 || dH.f26582w == -1;
                    iMax = java.lang.Math.max(iMax, i12);
                    iMax2 = java.lang.Math.max(iMax2, dH.f26582w);
                    iN1 = java.lang.Math.max(iN1, n1(ag0, dH));
                }
            }
            if (z6) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i13 = d6.f26582w;
                int i14 = d6.f26581v;
                boolean z10 = i13 > i14;
                int i15 = z10 ? i13 : i14;
                if (true == z10) {
                    i13 = i14;
                }
                int[] iArr = f28012g1;
                int i16 = 0;
                while (true) {
                    if (i16 < 9) {
                        float f10 = i13;
                        float f11 = i15;
                        int i17 = iArr[i16];
                        int[] iArr2 = iArr;
                        float f12 = i17;
                        if (i17 > i15 && (i6 = (int) (f12 * (f10 / f11))) > i13) {
                            int i18 = true != z10 ? i17 : i6;
                            if (true != z10) {
                                i17 = i6;
                            }
                            pointA = ag0.a(i18, i17);
                            float f13 = d6.f26583x;
                            if (pointA != null) {
                                if (ag0.g(pointA.x, pointA.y, f13)) {
                                    break;
                                }
                            }
                            i16++;
                            z10 = z10;
                            iArr = iArr2;
                            i13 = i13;
                        }
                    }
                    pointA = null;
                    break;
                }
                if (pointA != null) {
                    iMax = java.lang.Math.max(iMax, pointA.x);
                    iMax2 = java.lang.Math.max(iMax2, pointA.y);
                    com.google.android.gms.internal.ads.C4682oK0 c4682oK0B2 = d6.b();
                    c4682oK0B2.G(iMax);
                    c4682oK0B2.k(iMax2);
                    iN1 = java.lang.Math.max(iN1, m1(ag0, c4682oK0B2.H()));
                    com.google.android.gms.internal.ads.AbstractC3586eM.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (iN1 != -1 && (iM1 = m1(ag0, d6)) != -1) {
            iN1 = java.lang.Math.min((int) (iN1 * 1.5f), iM1);
        }
        java.lang.String str = ag0.f25096c;
        com.google.android.gms.internal.ads.GK0 gk0 = new com.google.android.gms.internal.ads.GK0(iMax, iMax2, iN1);
        this.f28020F0 = gk0;
        boolean z11 = this.f28017C0;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", d6.f26581v);
        mediaFormat.setInteger("height", d6.f26582w);
        com.google.android.gms.internal.ads.HN.b(mediaFormat, d6.f26577r);
        float f14 = d6.f26583x;
        if (f14 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f14);
        }
        com.google.android.gms.internal.ads.HN.a(mediaFormat, "rotation-degrees", d6.f26584y);
        com.google.android.gms.internal.ads.PA0 pa0 = d6.f26550C;
        if (pa0 != null) {
            com.google.android.gms.internal.ads.HN.a(mediaFormat, "color-transfer", pa0.f30664c);
            com.google.android.gms.internal.ads.HN.a(mediaFormat, "color-standard", pa0.f30662a);
            com.google.android.gms.internal.ads.HN.a(mediaFormat, "color-range", pa0.f30663b);
            byte[] bArr = pa0.f30665d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(d6.f26574o)) {
            int i19 = com.google.android.gms.internal.ads.AbstractC3688fH0.f35314b;
            android.util.Pair pairA = com.google.android.gms.internal.ads.ND.a(d6);
            if (pairA != null) {
                com.google.android.gms.internal.ads.HN.a(mediaFormat, "profile", ((java.lang.Integer) pairA.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", gk0.f27793a);
        mediaFormat.setInteger("max-height", gk0.f27794b);
        com.google.android.gms.internal.ads.HN.a(mediaFormat, "max-input-size", gk0.f27795c);
        int i20 = com.google.android.gms.internal.ads.EW.f27061a;
        if (i20 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f6 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            i10 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i10 = 0;
        }
        if (i20 >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(i10, -this.f28041a1));
        }
        android.view.Surface surfaceI1 = i1(ag0);
        if (this.f28023I0 != null && !com.google.android.gms.internal.ads.EW.k(this.f28047z0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return com.google.android.gms.internal.ads.C5333uG0.b(ag0, mediaFormat, d6, surfaceI1, null);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final java.util.List J0(com.google.android.gms.internal.ads.PG0 pg0, com.google.android.gms.internal.ads.D d6, boolean z6) {
        return com.google.android.gms.internal.ads.AbstractC3688fH0.f(j1(this.f28047z0, pg0, d6, false, false), d6);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void M0(com.google.android.gms.internal.ads.C5518vz0 c5518vz0) {
        if (this.f28022H0) {
            java.nio.ByteBuffer byteBuffer = c5518vz0.f39489g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b6 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b6 == -75 && s6 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0B1 = b1();
                        interfaceC5663xG0B1.getClass();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        interfaceC5663xG0B1.U(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void N0(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.AbstractC3586eM.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f28016B0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void O0(java.lang.String str, com.google.android.gms.internal.ads.C5333uG0 c5333uG0, long j6, long j10) {
        this.f28016B0.a(str, j6, j10);
        this.f28021G0 = g1(str);
        com.google.android.gms.internal.ads.AG0 ag0C0 = c0();
        ag0C0.getClass();
        boolean z6 = false;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 29 && "video/x-vnd.on2.vp9".equals(ag0C0.f25095b)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : ag0C0.h()) {
                if (codecProfileLevel.profile == 16384) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f28022H0 = z6;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void P0(java.lang.String str) {
        this.f28016B0.b(str);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void Q0(com.google.android.gms.internal.ads.D d6, android.media.MediaFormat mediaFormat) {
        com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0B1 = b1();
        if (interfaceC5663xG0B1 != null) {
            interfaceC5663xG0B1.g(this.f28030P0);
        }
        mediaFormat.getClass();
        boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float integer3 = d6.f26585z;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i6 = d6.f26584y;
        if (i6 == 90 || i6 == 270) {
            integer3 = 1.0f / integer3;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.f28039Y0 = new com.google.android.gms.internal.ads.C2697Os(integer, integer2, integer3);
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 == null || !this.f28046f1) {
            this.f28018D0.l(d6.f26583x);
        } else {
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
            c4682oK0B.G(integer);
            c4682oK0B.k(integer2);
            c4682oK0B.w(integer3);
            l6.I0(1, c4682oK0B.H());
        }
        this.f28046f1 = false;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void S0() {
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.J0(Z0(), Y0(), -this.f28044d1, N());
        } else {
            this.f28018D0.f();
        }
        this.f28046f1 = true;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void U() {
        this.f28040Z0 = null;
        this.f28045e1 = -9223372036854775807L;
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.g();
        } else {
            this.f28018D0.d();
        }
        this.f28029O0 = false;
        try {
            super.U();
        } finally {
            this.f28016B0.c(this.f30254s0);
            this.f28016B0.t(com.google.android.gms.internal.ads.C2697Os.f30582d);
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final boolean U0(long j6, long j10, com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0, java.nio.ByteBuffer byteBuffer, int i6, int i10, int i11, long j11, boolean z6, boolean z10, com.google.android.gms.internal.ads.D d6) throws com.google.android.gms.internal.ads.Qz0 {
        interfaceC5663xG0.getClass();
        long jY0 = j11 - Y0();
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 == null) {
            int iA = this.f28018D0.a(j11, j6, j10, Z0(), z10, this.f28019E0);
            if (iA == 4) {
                return false;
            }
            if (z6 && !z10) {
                c1(interfaceC5663xG0, i6, jY0);
                return true;
            }
            if (this.f28026L0 == null) {
                if (this.f28019E0.c() >= 30000) {
                    return false;
                }
                c1(interfaceC5663xG0, i6, jY0);
                e1(this.f28019E0.c());
                return true;
            }
            if (iA == 0) {
                q1(interfaceC5663xG0, i6, jY0, P().c());
                e1(this.f28019E0.c());
                return true;
            }
            if (iA == 1) {
                com.google.android.gms.internal.ads.C4310l c4310l = this.f28019E0;
                long jD = c4310l.d();
                long jC = c4310l.c();
                if (jD == this.f28038X0) {
                    c1(interfaceC5663xG0, i6, jY0);
                } else {
                    q1(interfaceC5663xG0, i6, jY0, jD);
                }
                e1(jC);
                this.f28038X0 = jD;
                return true;
            }
            if (iA == 2) {
                android.os.Trace.beginSection("dropVideoBuffer");
                interfaceC5663xG0.i(i6, false);
                android.os.Trace.endSection();
                d1(0, 1);
                e1(this.f28019E0.c());
                return true;
            }
            if (iA != 3) {
                if (iA == 5) {
                    return false;
                }
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(iA));
            }
            c1(interfaceC5663xG0, i6, jY0);
            e1(this.f28019E0.c());
            return true;
        }
        try {
            try {
                return l6.Q0(j11 + (-this.f28044d1), z10, j6, j10, new com.google.android.gms.internal.ads.BK0(this, interfaceC5663xG0, i6, jY0));
            } catch (com.google.android.gms.internal.ads.K e6) {
                e = e6;
                throw L(e, e.f28793C, false, 7001);
            }
        } catch (com.google.android.gms.internal.ads.K e10) {
            e = e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void V(boolean z6, boolean z10) {
        super.V(z6, z10);
        S();
        this.f28016B0.e(this.f30254s0);
        if (!this.f28024J0) {
            if (this.f28025K0 != null && this.f28023I0 == null) {
                com.google.android.gms.internal.ads.OK0 ok0 = new com.google.android.gms.internal.ads.OK0(this.f28047z0, this.f28018D0);
                ok0.d(P());
                this.f28023I0 = ok0.e().h();
            }
            this.f28024J0 = true;
        }
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 == null) {
            this.f28018D0.k(P());
            this.f28018D0.e(z10);
            return;
        }
        l6.R0(new com.google.android.gms.internal.ads.AK0(this), com.google.android.gms.internal.ads.AbstractC3733fl0.c());
        com.google.android.gms.internal.ads.InterfaceC4200k interfaceC4200k = this.f28043c1;
        if (interfaceC4200k != null) {
            this.f28023I0.K0(interfaceC4200k);
        }
        if (this.f28026L0 != null && !this.f28028N0.equals(com.google.android.gms.internal.ads.UR.f32204c)) {
            this.f28023I0.L0(this.f28026L0, this.f28028N0);
        }
        this.f28023I0.A(this.f28031Q0);
        this.f28023I0.w0(W0());
        java.util.List list = this.f28025K0;
        if (list != null) {
            this.f28023I0.P0(list);
        }
        this.f28023I0.O0(z10);
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.Fz0
    protected final void W(long j6, boolean z6) {
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.H0(true);
            this.f28023I0.J0(Z0(), Y0(), -this.f28044d1, N());
            this.f28046f1 = true;
        }
        super.W(j6, z6);
        if (this.f28023I0 == null) {
            this.f28018D0.i();
        }
        if (z6) {
            com.google.android.gms.internal.ads.L l10 = this.f28023I0;
            if (l10 != null) {
                l10.F0(false);
            } else {
                this.f28018D0.c(false);
            }
        }
        this.f28034T0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.AB0
    public final boolean X() {
        boolean zX = super.X();
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            return l6.G0(zX);
        }
        if (zX && (b1() == null || this.f28026L0 == null)) {
            return true;
        }
        return this.f28018D0.o(zX);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final int X0(com.google.android.gms.internal.ads.C5518vz0 c5518vz0) {
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AB0, com.google.android.gms.internal.ads.DB0
    public final java.lang.String Y() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final float Z(float f6, com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.D[] dArr) {
        float fMax = -1.0f;
        for (com.google.android.gms.internal.ads.D d10 : dArr) {
            float f10 = d10.f26583x;
            if (f10 != -1.0f) {
                fMax = java.lang.Math.max(fMax, f10);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f6;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final com.google.android.gms.internal.ads.C5883zG0 a0(java.lang.Throwable th, com.google.android.gms.internal.ads.AG0 ag0) {
        return new com.google.android.gms.internal.ads.C5891zK0(th, ag0, this.f28026L0);
    }

    protected final void c1(com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0, int i6, long j6) {
        android.os.Trace.beginSection("skipVideoBuffer");
        interfaceC5663xG0.i(i6, false);
        android.os.Trace.endSection();
        this.f30254s0.f27940f++;
    }

    protected final void d1(int i6, int i10) {
        com.google.android.gms.internal.ads.Gz0 gz0 = this.f30254s0;
        gz0.f27942h += i6;
        int i11 = i6 + i10;
        gz0.f27941g += i11;
        this.f28033S0 += i11;
        int i12 = this.f28034T0 + i11;
        this.f28034T0 = i12;
        gz0.f27943i = java.lang.Math.max(i12, gz0.f27943i);
    }

    protected final void e1(long j6) {
        com.google.android.gms.internal.ads.Gz0 gz0 = this.f30254s0;
        gz0.f27945k += j6;
        gz0.f27946l++;
        this.f28036V0 += j6;
        this.f28037W0++;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void f0(long j6) {
        super.f0(j6);
        this.f28035U0--;
    }

    protected final boolean f1(long j6, boolean z6) throws com.google.android.gms.internal.ads.Qz0 {
        int iM = M(j6);
        if (iM == 0) {
            return false;
        }
        if (z6) {
            com.google.android.gms.internal.ads.Gz0 gz0 = this.f30254s0;
            gz0.f27938d += iM;
            gz0.f27940f += this.f28035U0;
        } else {
            this.f30254s0.f27944j++;
            d1(iM, this.f28035U0);
        }
        o0();
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.H0(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.AB0
    public final boolean g() {
        if (!super.g()) {
            return false;
        }
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 == null) {
            return true;
        }
        l6.v();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void j0(com.google.android.gms.internal.ads.C5518vz0 c5518vz0) {
        this.f28035U0++;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.AB0
    public final void k(long j6, long j10) throws com.google.android.gms.internal.ads.Qz0 {
        super.k(j6, j10);
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            try {
                l6.N0(j6, j10);
            } catch (com.google.android.gms.internal.ads.K e6) {
                throw L(e6, e6.f28793C, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void k0(com.google.android.gms.internal.ads.D d6) throws com.google.android.gms.internal.ads.Qz0 {
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 == null || l6.z()) {
            return;
        }
        try {
            l6.M0(d6);
        } catch (com.google.android.gms.internal.ads.K e6) {
            throw L(e6, d6, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final void m0() {
        super.m0();
        this.f28035U0 = 0;
    }

    protected final void q1(com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0, int i6, long j6, long j10) {
        android.os.Trace.beginSection("releaseOutputBuffer");
        interfaceC5663xG0.e(i6, j10);
        android.os.Trace.endSection();
        this.f30254s0.f27939e++;
        this.f28034T0 = 0;
        if (this.f28023I0 == null) {
            com.google.android.gms.internal.ads.C2697Os c2697Os = this.f28039Y0;
            if (!c2697Os.equals(com.google.android.gms.internal.ads.C2697Os.f30582d) && !c2697Os.equals(this.f28040Z0)) {
                this.f28040Z0 = c2697Os;
                this.f28016B0.t(c2697Os);
            }
            if (!this.f28018D0.p() || this.f28026L0 == null) {
                return;
            }
            l1();
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final boolean s0(com.google.android.gms.internal.ads.AG0 ag0) {
        return s1(ag0);
    }

    @Override // com.google.android.gms.internal.ads.NG0
    protected final boolean t0(com.google.android.gms.internal.ads.C5518vz0 c5518vz0) {
        if (c5518vz0.i() && !g0() && !c5518vz0.h() && this.f28045e1 != -9223372036854775807L) {
            if (this.f28045e1 - (c5518vz0.f39488f - Y0()) > 100000 && !c5518vz0.l() && c5518vz0.f39488f < N()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.AB0
    public final void u(float f6, float f10) throws com.google.android.gms.internal.ads.Qz0 {
        super.u(f6, f10);
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.w0(f6);
        } else {
            this.f28018D0.n(f6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fz0, com.google.android.gms.internal.ads.AB0
    public final void w() {
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 != null) {
            l6.c();
        } else {
            this.f28018D0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.NG0, com.google.android.gms.internal.ads.InterfaceC5433vB0
    public final void x(int i6, java.lang.Object obj) throws com.google.android.gms.internal.ads.Qz0 {
        if (i6 == 1) {
            android.view.Surface surface = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
            if (this.f28026L0 == surface) {
                if (surface != null) {
                    k1();
                    android.view.Surface surface2 = this.f28026L0;
                    if (surface2 == null || !this.f28029O0) {
                        return;
                    }
                    this.f28016B0.q(surface2);
                    return;
                }
                return;
            }
            this.f28026L0 = surface;
            if (this.f28023I0 == null) {
                this.f28018D0.m(surface);
            }
            this.f28029O0 = false;
            int iF = f();
            com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0B1 = b1();
            if (interfaceC5663xG0B1 != null && this.f28023I0 == null) {
                com.google.android.gms.internal.ads.AG0 ag0C0 = c0();
                ag0C0.getClass();
                boolean zS1 = s1(ag0C0);
                int i10 = com.google.android.gms.internal.ads.EW.f27061a;
                if (i10 < 23 || !zS1 || this.f28021G0) {
                    l0();
                    e0();
                } else {
                    android.view.Surface surfaceI1 = i1(ag0C0);
                    if (i10 >= 23 && surfaceI1 != null) {
                        interfaceC5663xG0B1.d(surfaceI1);
                    } else {
                        if (i10 < 35) {
                            throw new java.lang.IllegalStateException();
                        }
                        interfaceC5663xG0B1.h();
                    }
                }
            }
            if (surface == null) {
                this.f28040Z0 = null;
                com.google.android.gms.internal.ads.L l6 = this.f28023I0;
                if (l6 != null) {
                    l6.b();
                    return;
                }
                return;
            }
            k1();
            if (iF == 2) {
                com.google.android.gms.internal.ads.L l10 = this.f28023I0;
                if (l10 != null) {
                    l10.F0(true);
                    return;
                } else {
                    this.f28018D0.c(true);
                    return;
                }
            }
            return;
        }
        if (i6 == 7) {
            obj.getClass();
            com.google.android.gms.internal.ads.InterfaceC4200k interfaceC4200k = (com.google.android.gms.internal.ads.InterfaceC4200k) obj;
            this.f28043c1 = interfaceC4200k;
            com.google.android.gms.internal.ads.L l11 = this.f28023I0;
            if (l11 != null) {
                l11.K0(interfaceC4200k);
                return;
            }
            return;
        }
        if (i6 == 10) {
            obj.getClass();
            int iIntValue = ((java.lang.Integer) obj).intValue();
            if (this.f28042b1 != iIntValue) {
                this.f28042b1 = iIntValue;
                return;
            }
            return;
        }
        if (i6 == 16) {
            obj.getClass();
            this.f28041a1 = ((java.lang.Integer) obj).intValue();
            com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0B2 = b1();
            if (interfaceC5663xG0B2 == null || com.google.android.gms.internal.ads.EW.f27061a < 35) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.f28041a1));
            interfaceC5663xG0B2.U(bundle);
            return;
        }
        if (i6 == 4) {
            obj.getClass();
            int iIntValue2 = ((java.lang.Integer) obj).intValue();
            this.f28030P0 = iIntValue2;
            com.google.android.gms.internal.ads.InterfaceC5663xG0 interfaceC5663xG0B3 = b1();
            if (interfaceC5663xG0B3 != null) {
                interfaceC5663xG0B3.g(iIntValue2);
                return;
            }
            return;
        }
        if (i6 == 5) {
            obj.getClass();
            int iIntValue3 = ((java.lang.Integer) obj).intValue();
            this.f28031Q0 = iIntValue3;
            com.google.android.gms.internal.ads.L l12 = this.f28023I0;
            if (l12 != null) {
                l12.A(iIntValue3);
                return;
            } else {
                this.f28018D0.j(iIntValue3);
                return;
            }
        }
        if (i6 == 13) {
            obj.getClass();
            java.util.List list = (java.util.List) obj;
            this.f28025K0 = list;
            com.google.android.gms.internal.ads.L l13 = this.f28023I0;
            if (l13 != null) {
                l13.P0(list);
                return;
            }
            return;
        }
        if (i6 != 14) {
            super.x(i6, obj);
            return;
        }
        obj.getClass();
        com.google.android.gms.internal.ads.UR ur = (com.google.android.gms.internal.ads.UR) obj;
        if (ur.b() == 0 || ur.a() == 0) {
            return;
        }
        this.f28028N0 = ur;
        com.google.android.gms.internal.ads.L l14 = this.f28023I0;
        if (l14 != null) {
            android.view.Surface surface3 = this.f28026L0;
            com.google.android.gms.internal.ads.LC.b(surface3);
            l14.L0(surface3, ur);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fz0
    protected final void y() {
        com.google.android.gms.internal.ads.L l6 = this.f28023I0;
        if (l6 == null || !this.f28015A0) {
            return;
        }
        l6.l();
    }
}
