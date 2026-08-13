.class public final enum Lcom/google/android/gms/internal/ads/xP;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum C:Lcom/google/android/gms/internal/ads/xP;

.field public static final enum D:Lcom/google/android/gms/internal/ads/xP;

.field public static final enum E:Lcom/google/android/gms/internal/ads/xP;

.field private static final synthetic F:[Lcom/google/android/gms/internal/ads/xP;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/ads/xP;

    const-string v1, "AD_REQUESTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/xP;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/xP;->C:Lcom/google/android/gms/internal/ads/xP;

    new-instance v1, Lcom/google/android/gms/internal/ads/xP;

    const-string v3, "AD_LOADED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/ads/xP;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/gms/internal/ads/xP;->D:Lcom/google/android/gms/internal/ads/xP;

    new-instance v3, Lcom/google/android/gms/internal/ads/xP;

    const-string v5, "AD_LOAD_FAILED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/android/gms/internal/ads/xP;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/android/gms/internal/ads/xP;->E:Lcom/google/android/gms/internal/ads/xP;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/gms/internal/ads/xP;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/google/android/gms/internal/ads/xP;->F:[Lcom/google/android/gms/internal/ads/xP;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/xP;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/xP;->F:[Lcom/google/android/gms/internal/ads/xP;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/xP;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/xP;

    return-object v0
.end method
