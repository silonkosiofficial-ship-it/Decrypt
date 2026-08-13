.class public final synthetic Lcom/google/android/gms/internal/ads/su;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/tu;

.field public final synthetic D:I

.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/tu;IIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/su;->C:Lcom/google/android/gms/internal/ads/tu;

    iput p2, p0, Lcom/google/android/gms/internal/ads/su;->D:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/su;->E:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/su;->F:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/su;->G:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/su;->C:Lcom/google/android/gms/internal/ads/tu;

    iget v1, p0, Lcom/google/android/gms/internal/ads/su;->D:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/su;->E:I

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/su;->F:Z

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/su;->G:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/tu;->q6(IIZZ)V

    return-void
.end method
