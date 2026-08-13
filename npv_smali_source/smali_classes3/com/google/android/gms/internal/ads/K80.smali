.class public final Lcom/google/android/gms/internal/ads/K80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/K80;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/J80;->a()Lcom/google/android/gms/internal/ads/K80;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ee0;->a()Lcom/google/android/gms/internal/ads/Be0;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Be0;->r(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/fl0;->a(Ljava/util/concurrent/ExecutorService;)Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/iz0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
