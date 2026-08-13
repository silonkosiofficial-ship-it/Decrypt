.class public final synthetic Lcom/google/android/gms/internal/ads/gL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Nb;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gL;->C:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final L(Lcom/google/android/gms/internal/ads/Mb;)V
    .locals 2

    .prologue
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    if-eq v1, p1, :cond_0

    const-string p1, "0"

    goto :goto_0

    :cond_0
    const-string p1, "1"

    :goto_0
    const-string v1, "isVisible"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gL;->C:Lcom/google/android/gms/internal/ads/Ot;

    const-string v1, "onAdVisibilityChanged"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
