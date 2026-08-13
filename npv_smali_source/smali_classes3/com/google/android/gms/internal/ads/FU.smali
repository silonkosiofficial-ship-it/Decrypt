.class public final synthetic Lcom/google/android/gms/internal/ads/FU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/IU;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/R60;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/IU;Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/FU;->a:Lcom/google/android/gms/internal/ads/IU;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/FU;->b:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/FU;->c:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/FU;->a:Lcom/google/android/gms/internal/ads/IU;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/FU;->b:Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/FU;->c:Lcom/google/android/gms/internal/ads/R60;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/IU;->c(Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
