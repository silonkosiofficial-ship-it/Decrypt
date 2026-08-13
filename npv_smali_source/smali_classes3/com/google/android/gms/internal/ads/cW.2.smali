.class public final Lcom/google/android/gms/internal/ads/cW;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/TV;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/TV;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cW;->a:Lcom/google/android/gms/internal/ads/TV;

    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/ads/TV;)Lcom/google/android/gms/internal/ads/cW;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/cW;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/cW;-><init>(Lcom/google/android/gms/internal/ads/TV;)V

    return-object v0
.end method


# virtual methods
.method public final a(LV3/f;Lcom/google/android/gms/internal/ads/VV;Lcom/google/android/gms/internal/ads/bU;Lcom/google/android/gms/internal/ads/La0;)Lcom/google/android/gms/internal/ads/TV;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cW;->a:Lcom/google/android/gms/internal/ads/TV;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/TV;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/TV;-><init>(LV3/f;Lcom/google/android/gms/internal/ads/VV;Lcom/google/android/gms/internal/ads/bU;Lcom/google/android/gms/internal/ads/La0;)V

    return-object v0
.end method
