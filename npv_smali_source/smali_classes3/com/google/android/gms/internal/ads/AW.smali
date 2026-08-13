.class public final synthetic Lcom/google/android/gms/internal/ads/AW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/BW;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/e70;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/YT;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/BW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/AW;->C:Lcom/google/android/gms/internal/ads/BW;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/AW;->D:Lcom/google/android/gms/internal/ads/e70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/AW;->E:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/AW;->F:Lcom/google/android/gms/internal/ads/YT;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/AW;->C:Lcom/google/android/gms/internal/ads/BW;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/BW;->d:Lcom/google/android/gms/internal/ads/DW;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/AW;->D:Lcom/google/android/gms/internal/ads/e70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/AW;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/AW;->F:Lcom/google/android/gms/internal/ads/YT;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/DW;->d(Lcom/google/android/gms/internal/ads/DW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    return-void
.end method
