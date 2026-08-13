.class public final Lcom/google/android/gms/internal/ads/dz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Xy;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dz;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dz;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/tz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/tz;->a()Lcom/google/android/gms/internal/ads/sz;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/EG;

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method
