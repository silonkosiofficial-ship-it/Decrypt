.class public final synthetic Lcom/google/android/gms/internal/ads/uW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Iu;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/GM;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/GM;Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uW;->C:Lcom/google/android/gms/internal/ads/GM;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uW;->D:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uW;->C:Lcom/google/android/gms/internal/ads/GM;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/GM;->b()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/uW;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->I0()V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ku;->u()V

    return-void
.end method
