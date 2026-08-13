.class public final synthetic Lcom/google/android/gms/internal/ads/Rp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Vp;

.field public final synthetic D:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Vp;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Rp;->C:Lcom/google/android/gms/internal/ads/Vp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Rp;->D:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rp;->C:Lcom/google/android/gms/internal/ads/Vp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Rp;->D:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Vp;->g(Landroid/graphics/Bitmap;)V

    return-void
.end method
