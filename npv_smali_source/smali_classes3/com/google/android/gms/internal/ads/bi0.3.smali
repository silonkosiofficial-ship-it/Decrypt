.class final Lcom/google/android/gms/internal/ads/bi0;
.super Lcom/google/android/gms/internal/ads/ci0;
.source "SourceFile"


# instance fields
.field final transient F:I

.field final transient G:I

.field final synthetic H:Lcom/google/android/gms/internal/ads/ci0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ci0;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bi0;->H:Lcom/google/android/gms/internal/ads/ci0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ci0;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/bi0;->F:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/bi0;->G:I

    return-void
.end method


# virtual methods
.method final e()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi0;->H:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xh0;->f()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/bi0;->F:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/ads/bi0;->G:I

    add-int/2addr v0, v1

    return v0
.end method

.method final f()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi0;->H:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xh0;->f()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/bi0;->F:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/bi0;->G:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ag0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi0;->H:Lcom/google/android/gms/internal/ads/ci0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/bi0;->F:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final s()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi0;->H:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Xh0;->s()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bi0;->G:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ci0;->w(II)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    return-object p1
.end method

.method public final w(II)Lcom/google/android/gms/internal/ads/ci0;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/bi0;->G:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/Ag0;->k(III)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/bi0;->F:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bi0;->H:Lcom/google/android/gms/internal/ads/ci0;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/ci0;->w(II)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    return-object p1
.end method
