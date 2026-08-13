.class public final synthetic Lcom/google/android/gms/internal/ads/Ux;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Xx;

.field public final synthetic D:I

.field public final synthetic E:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Xx;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ux;->C:Lcom/google/android/gms/internal/ads/Xx;

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ux;->D:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/Ux;->E:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ux;->C:Lcom/google/android/gms/internal/ads/Xx;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ux;->D:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/Ux;->E:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Xx;->C(II)V

    return-void
.end method
