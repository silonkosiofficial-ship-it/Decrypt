.class public final synthetic Lcom/google/android/gms/internal/ads/M50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Q50;

.field public final synthetic D:Ls3/W0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Q50;Ls3/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/M50;->C:Lcom/google/android/gms/internal/ads/Q50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/M50;->D:Ls3/W0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/M50;->C:Lcom/google/android/gms/internal/ads/Q50;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/R50;->c(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/UX;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/M50;->D:Ls3/W0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/UX;->u0(Ls3/W0;)V

    return-void
.end method
