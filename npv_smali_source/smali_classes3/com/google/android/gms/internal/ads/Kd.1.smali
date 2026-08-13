.class public final enum Lcom/google/android/gms/internal/ads/Kd;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Lv0;


# static fields
.field public static final enum D:Lcom/google/android/gms/internal/ads/Kd;

.field public static final enum E:Lcom/google/android/gms/internal/ads/Kd;

.field public static final enum F:Lcom/google/android/gms/internal/ads/Kd;

.field public static final enum G:Lcom/google/android/gms/internal/ads/Kd;

.field public static final enum H:Lcom/google/android/gms/internal/ads/Kd;

.field public static final enum I:Lcom/google/android/gms/internal/ads/Kd;

.field private static final J:Lcom/google/android/gms/internal/ads/Mv0;

.field private static final synthetic K:[Lcom/google/android/gms/internal/ads/Kd;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Kd;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->D:Lcom/google/android/gms/internal/ads/Kd;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd;

    const-string v1, "CONNECTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Kd;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->E:Lcom/google/android/gms/internal/ads/Kd;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd;

    const-string v1, "CONNECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Kd;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->F:Lcom/google/android/gms/internal/ads/Kd;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd;

    const-string v1, "DISCONNECTING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Kd;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->G:Lcom/google/android/gms/internal/ads/Kd;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Kd;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->H:Lcom/google/android/gms/internal/ads/Kd;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd;

    const-string v1, "SUSPENDED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Kd;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->I:Lcom/google/android/gms/internal/ads/Kd;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Kd;->i()[Lcom/google/android/gms/internal/ads/Kd;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->K:[Lcom/google/android/gms/internal/ads/Kd;

    new-instance v0, Lcom/google/android/gms/internal/ads/Kd$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Kd$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Kd;->J:Lcom/google/android/gms/internal/ads/Mv0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/Kd;->C:I

    return-void
.end method

.method public static e(I)Lcom/google/android/gms/internal/ads/Kd;
    .locals 1

    .prologue
    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Kd;->I:Lcom/google/android/gms/internal/ads/Kd;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/Kd;->H:Lcom/google/android/gms/internal/ads/Kd;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/Kd;->G:Lcom/google/android/gms/internal/ads/Kd;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/ads/Kd;->F:Lcom/google/android/gms/internal/ads/Kd;

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/ads/Kd;->E:Lcom/google/android/gms/internal/ads/Kd;

    return-object p0

    :cond_5
    sget-object p0, Lcom/google/android/gms/internal/ads/Kd;->D:Lcom/google/android/gms/internal/ads/Kd;

    return-object p0
.end method

.method public static g()Lcom/google/android/gms/internal/ads/Nv0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Ld;->a:Lcom/google/android/gms/internal/ads/Nv0;

    return-object v0
.end method

.method private static synthetic i()[Lcom/google/android/gms/internal/ads/Kd;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/Kd;

    sget-object v1, Lcom/google/android/gms/internal/ads/Kd;->D:Lcom/google/android/gms/internal/ads/Kd;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Kd;->E:Lcom/google/android/gms/internal/ads/Kd;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Kd;->F:Lcom/google/android/gms/internal/ads/Kd;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Kd;->G:Lcom/google/android/gms/internal/ads/Kd;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Kd;->H:Lcom/google/android/gms/internal/ads/Kd;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Kd;->I:Lcom/google/android/gms/internal/ads/Kd;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/Kd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Kd;->K:[Lcom/google/android/gms/internal/ads/Kd;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/Kd;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/Kd;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Kd;->C:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Kd;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
