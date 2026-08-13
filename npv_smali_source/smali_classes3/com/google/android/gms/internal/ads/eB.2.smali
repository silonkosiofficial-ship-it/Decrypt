.class public final Lcom/google/android/gms/internal/ads/eB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eB;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/Xx;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/EG;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/EG;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eB;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Xx;

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/eB;->a(Lcom/google/android/gms/internal/ads/Xx;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/EG;

    move-result-object v0

    return-object v0
.end method
