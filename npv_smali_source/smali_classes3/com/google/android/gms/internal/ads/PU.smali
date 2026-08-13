.class public final synthetic Lcom/google/android/gms/internal/ads/PU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/RU;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/e70;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/R60;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/RU;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/PU;->C:Lcom/google/android/gms/internal/ads/RU;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/PU;->D:Lcom/google/android/gms/internal/ads/e70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/PU;->E:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/PU;->C:Lcom/google/android/gms/internal/ads/RU;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/PU;->D:Lcom/google/android/gms/internal/ads/e70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/PU;->E:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/RU;->f(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)V

    return-void
.end method
