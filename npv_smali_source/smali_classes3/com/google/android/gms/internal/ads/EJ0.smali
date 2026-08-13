.class final Lcom/google/android/gms/internal/ads/EJ0;
.super Lcom/google/android/gms/internal/ads/BJ0;
.source "SourceFile"


# instance fields
.field private final G:Z

.field private final H:Lcom/google/android/gms/internal/ads/nJ0;

.field private final I:Z

.field private final J:Z

.field private final K:Z

.field private final L:I

.field private final M:I

.field private final N:I

.field private final O:I

.field private final P:I

.field private final Q:I

.field private final R:Z

.field private final S:I

.field private final T:I

.field private final U:Z

.field private final V:Z

.field private final W:I


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/Pm;ILcom/google/android/gms/internal/ads/nJ0;ILjava/lang/String;IZ)V
    .locals 3

    .prologue
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/BJ0;-><init>(ILcom/google/android/gms/internal/ads/Pm;I)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/EJ0;->H:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean p1, p4, Lcom/google/android/gms/internal/ads/nJ0;->F:Z

    const/4 p2, 0x1

    if-eq p2, p1, :cond_0

    const/16 p1, 0x10

    goto :goto_0

    :cond_0
    const/16 p1, 0x18

    :goto_0
    const/high16 p3, -0x40800000    # -1.0f

    const/4 p7, 0x0

    if-eqz p8, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->v:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/D;->x:F

    cmpl-float v1, v0, p3

    if-eqz v1, :cond_2

    const/high16 v1, 0x4f000000

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, p7

    goto :goto_2

    :cond_2
    :goto_1
    move v0, p2

    :goto_2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->G:Z

    const/4 v0, -0x1

    if-eqz p8, :cond_3

    iget-object p8, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v1, p8, Lcom/google/android/gms/internal/ads/D;->v:I

    if-eq v1, v0, :cond_4

    if-ltz v1, :cond_3

    goto :goto_3

    :cond_3
    move p8, p7

    goto :goto_4

    :cond_4
    :goto_3
    iget v1, p8, Lcom/google/android/gms/internal/ads/D;->w:I

    if-eq v1, v0, :cond_5

    if-ltz v1, :cond_3

    :cond_5
    iget v1, p8, Lcom/google/android/gms/internal/ads/D;->x:F

    cmpl-float v2, v1, p3

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_3

    :cond_6
    iget p8, p8, Lcom/google/android/gms/internal/ads/D;->j:I

    if-eq p8, v0, :cond_7

    if-ltz p8, :cond_3

    :cond_7
    move p8, p2

    :goto_4
    iput-boolean p8, p0, Lcom/google/android/gms/internal/ads/EJ0;->I:Z

    invoke-static {p5, p7}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p8

    iput-boolean p8, p0, Lcom/google/android/gms/internal/ads/EJ0;->J:Z

    iget-object p8, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v1, p8, Lcom/google/android/gms/internal/ads/D;->x:F

    cmpl-float p3, v1, p3

    if-eqz p3, :cond_8

    const/high16 p3, 0x41200000    # 10.0f

    cmpl-float p3, v1, p3

    if-ltz p3, :cond_8

    move p3, p2

    goto :goto_5

    :cond_8
    move p3, p7

    :goto_5
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->K:Z

    iget p3, p8, Lcom/google/android/gms/internal/ads/D;->j:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->L:I

    invoke-virtual {p8}, Lcom/google/android/gms/internal/ads/D;->a()I

    move-result p3

    iput p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->M:I

    move p3, p7

    :goto_6
    iget-object p8, p4, Lcom/google/android/gms/internal/ads/fp;->m:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {p8}, Ljava/util/AbstractCollection;->size()I

    move-result p8

    const v1, 0x7fffffff

    if-ge p3, p8, :cond_a

    iget-object p8, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object v2, p4, Lcom/google/android/gms/internal/ads/fp;->m:Lcom/google/android/gms/internal/ads/ci0;

    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p8, v2, p7}, Lcom/google/android/gms/internal/ads/GJ0;->m(Lcom/google/android/gms/internal/ads/D;Ljava/lang/String;Z)I

    move-result p8

    if-lez p8, :cond_9

    goto :goto_7

    :cond_9
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_a
    move p8, p7

    move p3, v1

    :goto_7
    iput p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->O:I

    iput p8, p0, Lcom/google/android/gms/internal/ads/EJ0;->P:I

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget p3, p3, Lcom/google/android/gms/internal/ads/D;->f:I

    invoke-static {p3, p7}, Lcom/google/android/gms/internal/ads/GJ0;->l(II)I

    move-result p3

    iput p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->Q:I

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget p3, p3, Lcom/google/android/gms/internal/ads/D;->f:I

    if-eqz p3, :cond_b

    and-int/2addr p3, p2

    if-eqz p3, :cond_c

    :cond_b
    move p3, p2

    goto :goto_8

    :cond_c
    move p3, p7

    :goto_8
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->R:Z

    invoke-static {p6}, Lcom/google/android/gms/internal/ads/GJ0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_d

    move p3, p2

    goto :goto_9

    :cond_d
    move p3, p7

    :goto_9
    iget-object p8, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    invoke-static {p8, p6, p3}, Lcom/google/android/gms/internal/ads/GJ0;->m(Lcom/google/android/gms/internal/ads/D;Ljava/lang/String;Z)I

    move-result p3

    iput p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->S:I

    move p3, p7

    :goto_a
    iget-object p6, p4, Lcom/google/android/gms/internal/ads/fp;->l:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {p6}, Ljava/util/AbstractCollection;->size()I

    move-result p6

    if-ge p3, p6, :cond_f

    iget-object p6, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object p6, p6, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-eqz p6, :cond_e

    iget-object p8, p4, Lcom/google/android/gms/internal/ads/fp;->l:Lcom/google/android/gms/internal/ads/ci0;

    invoke-interface {p8, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p8

    invoke-virtual {p6, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_e

    move v1, p3

    goto :goto_b

    :cond_e
    add-int/lit8 p3, p3, 0x1

    goto :goto_a

    :cond_f
    :goto_b
    iput v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->N:I

    and-int/lit16 p3, p5, 0x180

    const/16 p4, 0x80

    if-ne p3, p4, :cond_10

    move p3, p2

    goto :goto_c

    :cond_10
    move p3, p7

    :goto_c
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->U:Z

    and-int/lit8 p3, p5, 0x40

    const/16 p4, 0x40

    if-ne p3, p4, :cond_11

    move p3, p2

    goto :goto_d

    :cond_11
    move p3, p7

    :goto_d
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/EJ0;->V:Z

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object p4, p3, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const/4 p6, 0x2

    if-nez p4, :cond_12

    :goto_e
    move v1, p7

    goto/16 :goto_11

    :cond_12
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result p8

    const/4 v1, 0x4

    const/4 v2, 0x3

    sparse-switch p8, :sswitch_data_0

    goto :goto_f

    :sswitch_0
    const-string p8, "video/x-vnd.on2.vp9"

    invoke-virtual {p4, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_13

    move p4, v2

    goto :goto_10

    :sswitch_1
    const-string p8, "video/avc"

    invoke-virtual {p4, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_13

    move p4, v1

    goto :goto_10

    :sswitch_2
    const-string p8, "video/hevc"

    invoke-virtual {p4, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_13

    move p4, p6

    goto :goto_10

    :sswitch_3
    const-string p8, "video/av01"

    invoke-virtual {p4, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_13

    move p4, p2

    goto :goto_10

    :sswitch_4
    const-string p8, "video/dolby-vision"

    invoke-virtual {p4, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_13

    move p4, p7

    goto :goto_10

    :cond_13
    :goto_f
    move p4, v0

    :goto_10
    if-eqz p4, :cond_17

    if-eq p4, p2, :cond_18

    if-eq p4, p6, :cond_16

    if-eq p4, v2, :cond_15

    if-eq p4, v1, :cond_14

    goto :goto_e

    :cond_14
    move v1, p2

    goto :goto_11

    :cond_15
    move v1, p6

    goto :goto_11

    :cond_16
    move v1, v2

    goto :goto_11

    :cond_17
    const/4 v1, 0x5

    :cond_18
    :goto_11
    iput v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->W:I

    iget p4, p3, Lcom/google/android/gms/internal/ads/D;->f:I

    and-int/lit16 p4, p4, 0x4000

    if-eqz p4, :cond_19

    :goto_12
    move p2, p7

    goto :goto_13

    :cond_19
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/EJ0;->H:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean p8, p4, Lcom/google/android/gms/internal/ads/nJ0;->O:Z

    invoke-static {p5, p8}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p8

    if-nez p8, :cond_1a

    goto :goto_12

    :cond_1a
    iget-boolean p8, p0, Lcom/google/android/gms/internal/ads/EJ0;->G:Z

    if-nez p8, :cond_1b

    iget-boolean p4, p4, Lcom/google/android/gms/internal/ads/nJ0;->D:Z

    if-nez p4, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-static {p5, p7}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p4

    if-eqz p4, :cond_1c

    iget-boolean p4, p0, Lcom/google/android/gms/internal/ads/EJ0;->I:Z

    if-eqz p4, :cond_1c

    if-eqz p8, :cond_1c

    iget p3, p3, Lcom/google/android/gms/internal/ads/D;->j:I

    if-eq p3, v0, :cond_1c

    and-int/2addr p1, p5

    if-eqz p1, :cond_1c

    move p2, p6

    :cond_1c
    :goto_13
    iput p2, p0, Lcom/google/android/gms/internal/ads/EJ0;->T:I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic i(Lcom/google/android/gms/internal/ads/EJ0;Lcom/google/android/gms/internal/ads/EJ0;)I
    .locals 4

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->J:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/GJ0;->o()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/GJ0;->o()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ni0;->a()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->i()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/EJ0;->H:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/fp;->z:Z

    iget v2, p0, Lcom/google/android/gms/internal/ads/EJ0;->M:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/internal/ads/EJ0;->M:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget p0, p0, Lcom/google/android/gms/internal/ads/EJ0;->L:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iget p1, p1, Lcom/google/android/gms/internal/ads/EJ0;->L:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p0, p1, v0}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Rh0;->a()I

    move-result p0

    return p0
.end method

.method public static synthetic m(Lcom/google/android/gms/internal/ads/EJ0;Lcom/google/android/gms/internal/ads/EJ0;)I
    .locals 4

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->i()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->J:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->J:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->O:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->O:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ni0;->c()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Ni0;->a()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->P:I

    iget v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->P:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->Q:I

    iget v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->Q:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->R:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->R:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->S:I

    iget v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->S:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->K:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->K:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->G:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->G:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->I:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->I:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->N:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->N:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ni0;->c()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Ni0;->a()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->U:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->U:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->V:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ads/EJ0;->V:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->U:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/EJ0;->V:Z

    if-eqz v1, :cond_0

    iget p0, p0, Lcom/google/android/gms/internal/ads/EJ0;->W:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/EJ0;->W:I

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Rh0;->a()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->T:I

    return v0
.end method

.method public final bridge synthetic g(Lcom/google/android/gms/internal/ads/BJ0;)Z
    .locals 2

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/EJ0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->H:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/nJ0;->G:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->U:Z

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/EJ0;->U:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/EJ0;->V:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/EJ0;->V:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
