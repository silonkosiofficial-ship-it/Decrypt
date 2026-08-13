.class public final synthetic Lcom/google/android/gms/internal/ads/Pt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Zt;

.field public final synthetic D:Landroid/view/View;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/aq;

.field public final synthetic F:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Zt;Landroid/view/View;Lcom/google/android/gms/internal/ads/aq;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pt;->C:Lcom/google/android/gms/internal/ads/Zt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Pt;->D:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Pt;->E:Lcom/google/android/gms/internal/ads/aq;

    iput p4, p0, Lcom/google/android/gms/internal/ads/Pt;->F:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pt;->C:Lcom/google/android/gms/internal/ads/Zt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pt;->D:Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pt;->E:Lcom/google/android/gms/internal/ads/aq;

    iget v3, p0, Lcom/google/android/gms/internal/ads/Pt;->F:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/Zt;->q0(Landroid/view/View;Lcom/google/android/gms/internal/ads/aq;I)V

    return-void
.end method
