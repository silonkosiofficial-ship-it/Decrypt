.class public final Lcom/google/android/gms/internal/ads/Xz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ZD;

.field private final b:Lcom/google/android/gms/internal/ads/iF;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ZD;Lcom/google/android/gms/internal/ads/iF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xz;->a:Lcom/google/android/gms/internal/ads/ZD;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xz;->b:Lcom/google/android/gms/internal/ads/iF;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/ZD;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xz;->a:Lcom/google/android/gms/internal/ads/ZD;

    return-object v0
.end method

.method final b()Lcom/google/android/gms/internal/ads/iF;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xz;->b:Lcom/google/android/gms/internal/ads/iF;

    return-object v0
.end method

.method final c()Lcom/google/android/gms/internal/ads/EG;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xz;->b:Lcom/google/android/gms/internal/ads/iF;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/EG;

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/EG;

    new-instance v1, Lcom/google/android/gms/internal/ads/Wz;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Wz;-><init>(Lcom/google/android/gms/internal/ads/Xz;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
