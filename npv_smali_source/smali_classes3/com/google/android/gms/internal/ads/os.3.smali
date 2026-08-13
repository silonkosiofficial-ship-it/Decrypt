.class public final synthetic Lcom/google/android/gms/internal/ads/os;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/ys;

.field public final synthetic D:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/ys;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/os;->C:Lcom/google/android/gms/internal/ads/ys;

    iput p2, p0, Lcom/google/android/gms/internal/ads/os;->D:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/os;->C:Lcom/google/android/gms/internal/ads/ys;

    iget v1, p0, Lcom/google/android/gms/internal/ads/os;->D:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ys;->Q(I)V

    return-void
.end method
