.class public final enum Lcom/google/android/gms/internal/ads/Fe;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Lv0;


# static fields
.field public static final enum D:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum E:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum F:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum G:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum H:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum I:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum J:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum K:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum L:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum M:Lcom/google/android/gms/internal/ads/Fe;

.field public static final enum N:Lcom/google/android/gms/internal/ads/Fe;

.field private static final O:Lcom/google/android/gms/internal/ads/Mv0;

.field private static final synthetic P:[Lcom/google/android/gms/internal/ads/Fe;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "AD_FORMAT_TYPE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->D:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "BANNER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->E:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "INTERSTITIAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->F:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "NATIVE_EXPRESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->G:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "NATIVE_CONTENT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->H:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "NATIVE_APP_INSTALL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->I:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "NATIVE_CUSTOM_TEMPLATE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->J:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "DFP_BANNER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->K:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "DFP_INTERSTITIAL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->L:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "REWARD_BASED_VIDEO_AD"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->M:Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe;

    const-string v1, "BANNER_SEARCH_ADS"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Fe;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->N:Lcom/google/android/gms/internal/ads/Fe;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Fe;->i()[Lcom/google/android/gms/internal/ads/Fe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->P:[Lcom/google/android/gms/internal/ads/Fe;

    new-instance v0, Lcom/google/android/gms/internal/ads/Fe$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Fe$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Fe;->O:Lcom/google/android/gms/internal/ads/Mv0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/Fe;->C:I

    return-void
.end method

.method public static e(I)Lcom/google/android/gms/internal/ads/Fe;
    .locals 0

    .prologue
    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->N:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->M:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->L:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->K:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->J:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->I:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->H:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->G:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_8
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->F:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_9
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->E:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_a
    sget-object p0, Lcom/google/android/gms/internal/ads/Fe;->D:Lcom/google/android/gms/internal/ads/Fe;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g()Lcom/google/android/gms/internal/ads/Nv0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Ge;->a:Lcom/google/android/gms/internal/ads/Nv0;

    return-object v0
.end method

.method private static synthetic i()[Lcom/google/android/gms/internal/ads/Fe;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/Fe;

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->D:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->E:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->F:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->G:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->H:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->I:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->J:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->K:Lcom/google/android/gms/internal/ads/Fe;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->L:Lcom/google/android/gms/internal/ads/Fe;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->M:Lcom/google/android/gms/internal/ads/Fe;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Fe;->N:Lcom/google/android/gms/internal/ads/Fe;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/Fe;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Fe;->P:[Lcom/google/android/gms/internal/ads/Fe;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/Fe;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/Fe;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Fe;->C:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fe;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
