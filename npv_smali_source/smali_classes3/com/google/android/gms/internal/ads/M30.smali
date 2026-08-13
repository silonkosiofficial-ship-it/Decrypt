.class public final synthetic Lcom/google/android/gms/internal/ads/M30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/N30;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/N30;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/M30;->a:Lcom/google/android/gms/internal/ads/N30;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/M30;->a:Lcom/google/android/gms/internal/ads/N30;

    new-instance v1, Lcom/google/android/gms/internal/ads/O30;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/N30;->b:Ljava/util/List;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/O30;-><init>(Ljava/util/List;)V

    return-object v1
.end method
