.class final Lcom/google/android/gms/internal/ads/nI0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/EI0;


# instance fields
.field private final a:I

.field final synthetic b:Lcom/google/android/gms/internal/ads/qI0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/qI0;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nI0;->b:Lcom/google/android/gms/internal/ads/qI0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/nI0;->a:I

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/nI0;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/nI0;->a:I

    return p0
.end method


# virtual methods
.method public final a(J)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nI0;->b:Lcom/google/android/gms/internal/ads/qI0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/nI0;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/ads/qI0;->M(IJ)I

    move-result p1

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/UA0;Lcom/google/android/gms/internal/ads/vz0;I)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nI0;->b:Lcom/google/android/gms/internal/ads/qI0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/nI0;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/qI0;->L(ILcom/google/android/gms/internal/ads/UA0;Lcom/google/android/gms/internal/ads/vz0;I)I

    move-result p1

    return p1
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nI0;->b:Lcom/google/android/gms/internal/ads/qI0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/nI0;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/qI0;->A(I)Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nI0;->b:Lcom/google/android/gms/internal/ads/qI0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/nI0;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/qI0;->y(I)V

    return-void
.end method
