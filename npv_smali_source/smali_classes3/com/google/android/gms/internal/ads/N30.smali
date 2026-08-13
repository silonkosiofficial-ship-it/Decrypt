.class public final Lcom/google/android/gms/internal/ads/N30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field final a:Lcom/google/android/gms/internal/ads/Yk0;

.field final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/if;Lcom/google/android/gms/internal/ads/Yk0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/N30;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/N30;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x30

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/M30;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/M30;-><init>(Lcom/google/android/gms/internal/ads/N30;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/N30;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method
