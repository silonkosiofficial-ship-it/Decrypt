.class public final synthetic Lcom/google/android/gms/internal/ads/Xf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ag;

.field public final synthetic D:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ag;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xf;->C:Lcom/google/android/gms/internal/ads/ag;

    iput p2, p0, Lcom/google/android/gms/internal/ads/Xf;->D:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xf;->C:Lcom/google/android/gms/internal/ads/ag;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xf;->D:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ag;->f(I)V

    return-void
.end method
