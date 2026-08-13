.class public final synthetic Lcom/google/android/gms/internal/ads/oH;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZE;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/oH;->C:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/oH;->C:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->P()Lu3/x;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu3/x;->b()V

    :cond_0
    return-void
.end method
