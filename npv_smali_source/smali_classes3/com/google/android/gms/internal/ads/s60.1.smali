.class public final synthetic Lcom/google/android/gms/internal/ads/s60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/r50;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/bp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/bp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/s60;->a:Lcom/google/android/gms/internal/ads/bp;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s60;->a:Lcom/google/android/gms/internal/ads/bp;

    check-cast p1, Lcom/google/android/gms/internal/ads/yp;

    new-instance v1, Lcom/google/android/gms/internal/ads/Mp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bp;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bp;->b()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/Mp;-><init>(Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/yp;->S1(Lcom/google/android/gms/internal/ads/sp;)V

    return-void
.end method
