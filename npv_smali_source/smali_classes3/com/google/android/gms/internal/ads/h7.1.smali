.class public final Lcom/google/android/gms/internal/ads/h7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/google/android/gms/internal/ads/M6;

.field public final c:Lcom/google/android/gms/internal/ads/k7;

.field public d:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/k7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/h7;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/h7;->a:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/h7;->b:Lcom/google/android/gms/internal/ads/M6;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h7;->c:Lcom/google/android/gms/internal/ads/k7;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/M6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/h7;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h7;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/h7;->b:Lcom/google/android/gms/internal/ads/M6;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h7;->c:Lcom/google/android/gms/internal/ads/k7;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/k7;)Lcom/google/android/gms/internal/ads/h7;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/h7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/h7;-><init>(Lcom/google/android/gms/internal/ads/k7;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/M6;)Lcom/google/android/gms/internal/ads/h7;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/h7;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/h7;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/M6;)V

    return-object v0
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/h7;->c:Lcom/google/android/gms/internal/ads/k7;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
