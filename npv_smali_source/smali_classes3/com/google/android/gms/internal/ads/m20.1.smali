.class public final synthetic Lcom/google/android/gms/internal/ads/m20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/q20;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Tm;

.field public final synthetic E:Landroid/os/Bundle;

.field public final synthetic F:Ljava/util/List;

.field public final synthetic G:Lcom/google/android/gms/internal/ads/sX;

.field public final synthetic H:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/q20;Lcom/google/android/gms/internal/ads/Tm;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/sX;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/m20;->C:Lcom/google/android/gms/internal/ads/q20;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/m20;->D:Lcom/google/android/gms/internal/ads/Tm;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/m20;->E:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/m20;->F:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/m20;->G:Lcom/google/android/gms/internal/ads/sX;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/m20;->H:Lcom/google/android/gms/internal/ads/mr;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m20;->C:Lcom/google/android/gms/internal/ads/q20;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m20;->D:Lcom/google/android/gms/internal/ads/Tm;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/m20;->E:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/m20;->F:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/m20;->G:Lcom/google/android/gms/internal/ads/sX;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/m20;->H:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/q20;->e(Lcom/google/android/gms/internal/ads/Tm;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/sX;Lcom/google/android/gms/internal/ads/mr;)V

    return-void
.end method
