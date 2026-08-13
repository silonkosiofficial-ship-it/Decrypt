.class public final synthetic Lcom/google/android/gms/internal/ads/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/F;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Os;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/F;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/v;->C:Lcom/google/android/gms/internal/ads/F;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/v;->D:Lcom/google/android/gms/internal/ads/Os;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/v;->C:Lcom/google/android/gms/internal/ads/F;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/v;->D:Lcom/google/android/gms/internal/ads/Os;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/F;->p(Lcom/google/android/gms/internal/ads/Os;)V

    return-void
.end method
