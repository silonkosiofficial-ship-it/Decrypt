.class public final enum Lcom/google/android/gms/internal/ads/Ve;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Lv0;


# static fields
.field public static final enum D:Lcom/google/android/gms/internal/ads/Ve;

.field public static final enum E:Lcom/google/android/gms/internal/ads/Ve;

.field public static final enum F:Lcom/google/android/gms/internal/ads/Ve;

.field private static final G:Lcom/google/android/gms/internal/ads/Mv0;

.field private static final synthetic H:[Lcom/google/android/gms/internal/ads/Ve;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/Ve;

    const-string v1, "ENUM_FALSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Ve;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Ve;->D:Lcom/google/android/gms/internal/ads/Ve;

    new-instance v0, Lcom/google/android/gms/internal/ads/Ve;

    const-string v1, "ENUM_TRUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/Ve;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Ve;->E:Lcom/google/android/gms/internal/ads/Ve;

    new-instance v0, Lcom/google/android/gms/internal/ads/Ve;

    const/4 v1, 0x2

    const/16 v2, 0x3e8

    const-string v3, "ENUM_UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Ve;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Ve;->F:Lcom/google/android/gms/internal/ads/Ve;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ve;->i()[Lcom/google/android/gms/internal/ads/Ve;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/Ve;->H:[Lcom/google/android/gms/internal/ads/Ve;

    new-instance v0, Lcom/google/android/gms/internal/ads/Ve$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ve$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Ve;->G:Lcom/google/android/gms/internal/ads/Mv0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/Ve;->C:I

    return-void
.end method

.method public static e(I)Lcom/google/android/gms/internal/ads/Ve;
    .locals 1

    .prologue
    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/16 v0, 0x3e8

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Ve;->F:Lcom/google/android/gms/internal/ads/Ve;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/Ve;->E:Lcom/google/android/gms/internal/ads/Ve;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/Ve;->D:Lcom/google/android/gms/internal/ads/Ve;

    return-object p0
.end method

.method public static g()Lcom/google/android/gms/internal/ads/Nv0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/We;->a:Lcom/google/android/gms/internal/ads/Nv0;

    return-object v0
.end method

.method private static synthetic i()[Lcom/google/android/gms/internal/ads/Ve;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/android/gms/internal/ads/Ve;

    sget-object v1, Lcom/google/android/gms/internal/ads/Ve;->D:Lcom/google/android/gms/internal/ads/Ve;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Ve;->E:Lcom/google/android/gms/internal/ads/Ve;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/Ve;->F:Lcom/google/android/gms/internal/ads/Ve;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/Ve;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Ve;->H:[Lcom/google/android/gms/internal/ads/Ve;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/Ve;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/Ve;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ve;->C:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ve;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
