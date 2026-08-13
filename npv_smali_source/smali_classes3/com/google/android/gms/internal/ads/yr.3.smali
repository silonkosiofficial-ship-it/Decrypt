.class public final synthetic Lcom/google/android/gms/internal/ads/yr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Ir;

.field public final synthetic D:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ir;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yr;->C:Lcom/google/android/gms/internal/ads/Ir;

    iput p2, p0, Lcom/google/android/gms/internal/ads/yr;->D:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yr;->C:Lcom/google/android/gms/internal/ads/Ir;

    iget v1, p0, Lcom/google/android/gms/internal/ads/yr;->D:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Ir;->y(I)V

    return-void
.end method
