.class public final Lcom/google/android/gms/internal/ads/Iz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Iz;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Iz;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Hz;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Iz;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/oz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oz;->a()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Iz;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/Hz;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Hz;-><init>(Lcom/google/android/gms/internal/ads/Ot;Ljava/util/concurrent/Executor;)V

    return-object v2
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Iz;->a()Lcom/google/android/gms/internal/ads/Hz;

    move-result-object v0

    return-object v0
.end method
