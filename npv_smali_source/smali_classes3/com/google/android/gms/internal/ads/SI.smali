.class public final synthetic Lcom/google/android/gms/internal/ads/SI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ZI;

.field public final synthetic D:Landroid/view/View;

.field public final synthetic E:Z

.field public final synthetic F:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Landroid/view/View;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/SI;->C:Lcom/google/android/gms/internal/ads/ZI;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/SI;->D:Landroid/view/View;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/SI;->E:Z

    iput p4, p0, Lcom/google/android/gms/internal/ads/SI;->F:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/SI;->C:Lcom/google/android/gms/internal/ads/ZI;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/SI;->D:Landroid/view/View;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/SI;->E:Z

    iget v3, p0, Lcom/google/android/gms/internal/ads/SI;->F:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/ZI;->d0(Landroid/view/View;ZI)V

    return-void
.end method
