.class final Lcom/google/android/gms/internal/ads/h6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/a6;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/RQ;

.field final synthetic b:Lcom/google/android/gms/internal/ads/j6;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/j6;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h6;->b:Lcom/google/android/gms/internal/ads/j6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/RQ;

    const/4 v0, 0x4

    new-array v1, v0, [B

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/RQ;-><init>([BI)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/h6;->a:Lcom/google/android/gms/internal/ads/RQ;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/bV;Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V
    .locals 0

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/sR;)V
    .locals 9

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v0

    const/4 v1, 0x4

    div-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/h6;->a:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {p1, v4, v1}, Lcom/google/android/gms/internal/ads/sR;->g(Lcom/google/android/gms/internal/ads/RQ;I)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/h6;->a:Lcom/google/android/gms/internal/ads/RQ;

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v5

    const/4 v6, 0x3

    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/RQ;->n(I)V

    const/16 v4, 0xd

    if-nez v5, :cond_1

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/h6;->a:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/RQ;->n(I)V

    goto :goto_1

    :cond_1
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/h6;->a:Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/h6;->b:Lcom/google/android/gms/internal/ads/j6;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/j6;->b(Lcom/google/android/gms/internal/ads/j6;)Landroid/util/SparseArray;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/h6;->b:Lcom/google/android/gms/internal/ads/j6;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/j6;->b(Lcom/google/android/gms/internal/ads/j6;)Landroid/util/SparseArray;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/b6;

    new-instance v8, Lcom/google/android/gms/internal/ads/i6;

    invoke-direct {v8, v5, v4}, Lcom/google/android/gms/internal/ads/i6;-><init>(Lcom/google/android/gms/internal/ads/j6;I)V

    invoke-direct {v7, v8}, Lcom/google/android/gms/internal/ads/b6;-><init>(Lcom/google/android/gms/internal/ads/a6;)V

    invoke-virtual {v6, v4, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/h6;->b:Lcom/google/android/gms/internal/ads/j6;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/j6;->a(Lcom/google/android/gms/internal/ads/j6;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/j6;->o(Lcom/google/android/gms/internal/ads/j6;I)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/h6;->b:Lcom/google/android/gms/internal/ads/j6;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/j6;->b(Lcom/google/android/gms/internal/ads/j6;)Landroid/util/SparseArray;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    :cond_4
    :goto_2
    return-void
.end method
