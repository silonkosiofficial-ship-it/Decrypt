.class public final synthetic Lcom/google/android/gms/internal/ads/Rk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/hl;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/gl;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/hl;Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/gl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Rk;->C:Lcom/google/android/gms/internal/ads/hl;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Rk;->D:Lcom/google/android/gms/internal/ads/gl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rk;->C:Lcom/google/android/gms/internal/ads/hl;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Rk;->D:Lcom/google/android/gms/internal/ads/gl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/hl;->i(Lcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/gl;)V

    return-void
.end method
