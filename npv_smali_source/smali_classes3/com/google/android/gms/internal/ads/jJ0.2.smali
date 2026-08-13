.class final Lcom/google/android/gms/internal/ads/jJ0;
.super Lcom/google/android/gms/internal/ads/BJ0;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final G:I

.field private final H:Z

.field private final I:Ljava/lang/String;

.field private final J:Lcom/google/android/gms/internal/ads/nJ0;

.field private final K:Z

.field private final L:I

.field private final M:I

.field private final N:I

.field private final O:Z

.field private final P:I

.field private final Q:I

.field private final R:Z

.field private final S:I

.field private final T:I

.field private final U:I

.field private final V:I

.field private final W:Z

.field private final X:Z

.field private final Y:Z


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/Pm;ILcom/google/android/gms/internal/ads/nJ0;IZLcom/google/android/gms/internal/ads/Bg0;I)V
    .locals 7

    .prologue
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/BJ0;-><init>(ILcom/google/android/gms/internal/ads/Pm;I)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/jJ0;->J:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean p1, p4, Lcom/google/android/gms/internal/ads/nJ0;->M:Z

    const/16 p2, 0x18

    const/4 p3, 0x1

    if-eq p3, p1, :cond_0

    const/16 p1, 0x10

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iget-object p8, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object p8, p8, Lcom/google/android/gms/internal/ads/D;->d:Ljava/lang/String;

    invoke-static {p8}, Lcom/google/android/gms/internal/ads/GJ0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p8

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/jJ0;->I:Ljava/lang/String;

    const/4 p8, 0x0

    invoke-static {p5, p8}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->K:Z

    move v0, p8

    :goto_1
    iget-object v1, p4, Lcom/google/android/gms/internal/ads/fp;->o:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const v2, 0x7fffffff

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object v3, p4, Lcom/google/android/gms/internal/ads/fp;->o:Lcom/google/android/gms/internal/ads/ci0;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v1, v3, p8}, Lcom/google/android/gms/internal/ads/GJ0;->m(Lcom/google/android/gms/internal/ads/D;Ljava/lang/String;Z)I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v1, p8

    move v0, v2

    :goto_2
    iput v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->M:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->L:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v0, v0, Lcom/google/android/gms/internal/ads/D;->f:I

    invoke-static {v0, p8}, Lcom/google/android/gms/internal/ads/GJ0;->l(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->N:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->f:I

    if-eqz v1, :cond_3

    and-int/2addr v1, p3

    if-eqz v1, :cond_4

    :cond_3
    move v1, p3

    goto :goto_3

    :cond_4
    move v1, p8

    :goto_3
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->O:Z

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->e:I

    and-int/2addr v1, p3

    if-eq p3, v1, :cond_5

    move v1, p8

    goto :goto_4

    :cond_5
    move v1, p3

    :goto_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->R:Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const/4 v3, -0x1

    const/4 v4, 0x2

    if-nez v1, :cond_6

    :goto_5
    move v1, p8

    goto :goto_8

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x7e929daa

    if-eq v5, v6, :cond_9

    const v6, 0xb269699

    if-eq v5, v6, :cond_8

    const v6, 0x59afdf4a

    if-eq v5, v6, :cond_7

    goto :goto_6

    :cond_7
    const-string v5, "audio/iamf"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, v4

    goto :goto_7

    :cond_8
    const-string v5, "audio/ac4"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, p3

    goto :goto_7

    :cond_9
    const-string v5, "audio/eac3-joc"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, p8

    goto :goto_7

    :cond_a
    :goto_6
    move v1, v3

    :goto_7
    if-eqz v1, :cond_b

    if-eq v1, p3, :cond_b

    if-eq v1, v4, :cond_b

    goto :goto_5

    :cond_b
    move v1, p3

    :goto_8
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->Y:Z

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->D:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->S:I

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->E:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->T:I

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->j:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->U:I

    invoke-interface {p7, v0}, Lcom/google/android/gms/internal/ads/Bg0;->b(Ljava/lang/Object;)Z

    move-result p7

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/jJ0;->H:Z

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p7

    invoke-virtual {p7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p7

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-lt v0, p2, :cond_c

    invoke-static {p7}, Landroidx/appcompat/app/g;->a(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    move-result-object p2

    invoke-static {p2}, Landroidx/appcompat/app/l;->a(Landroid/os/LocaleList;)Ljava/lang/String;

    move-result-object p2

    const-string p7, ","

    invoke-virtual {p2, p7, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    goto :goto_9

    :cond_c
    new-array p2, p3, [Ljava/lang/String;

    iget-object p7, p7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p7}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p7

    aput-object p7, p2, p8

    :goto_9
    move p7, p8

    :goto_a
    array-length v0, p2

    if-ge p7, v0, :cond_d

    aget-object v0, p2, p7

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/EW;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, p2, p7

    add-int/lit8 p7, p7, 0x1

    goto :goto_a

    :cond_d
    move p7, p8

    :goto_b
    array-length v0, p2

    if-ge p7, v0, :cond_f

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    aget-object v1, p2, p7

    invoke-static {v0, v1, p8}, Lcom/google/android/gms/internal/ads/GJ0;->m(Lcom/google/android/gms/internal/ads/D;Ljava/lang/String;Z)I

    move-result v0

    if-lez v0, :cond_e

    goto :goto_c

    :cond_e
    add-int/lit8 p7, p7, 0x1

    goto :goto_b

    :cond_f
    move v0, p8

    move p7, v2

    :goto_c
    iput p7, p0, Lcom/google/android/gms/internal/ads/jJ0;->P:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->Q:I

    move p2, p8

    :goto_d
    iget-object p7, p4, Lcom/google/android/gms/internal/ads/fp;->s:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p7

    if-ge p2, p7, :cond_11

    iget-object p7, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget-object p7, p7, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-eqz p7, :cond_10

    iget-object v0, p4, Lcom/google/android/gms/internal/ads/fp;->s:Lcom/google/android/gms/internal/ads/ci0;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p7

    if-eqz p7, :cond_10

    move v2, p2

    goto :goto_e

    :cond_10
    add-int/lit8 p2, p2, 0x1

    goto :goto_d

    :cond_11
    :goto_e
    iput v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->V:I

    and-int/lit16 p2, p5, 0x180

    const/16 p4, 0x80

    if-ne p2, p4, :cond_12

    move p2, p3

    goto :goto_f

    :cond_12
    move p2, p8

    :goto_f
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/jJ0;->W:Z

    and-int/lit8 p2, p5, 0x40

    const/16 p4, 0x40

    if-ne p2, p4, :cond_13

    move p2, p3

    goto :goto_10

    :cond_13
    move p2, p8

    :goto_10
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/jJ0;->X:Z

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/jJ0;->J:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean p4, p2, Lcom/google/android/gms/internal/ads/nJ0;->O:Z

    invoke-static {p5, p4}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p4

    if-nez p4, :cond_14

    :goto_11
    move p3, p8

    goto :goto_12

    :cond_14
    iget-boolean p4, p0, Lcom/google/android/gms/internal/ads/jJ0;->H:Z

    if-nez p4, :cond_15

    iget-boolean p7, p2, Lcom/google/android/gms/internal/ads/nJ0;->H:Z

    if-nez p7, :cond_15

    goto :goto_11

    :cond_15
    invoke-static {p5, p8}, Lcom/google/android/gms/internal/ads/BB0;->a(IZ)Z

    move-result p7

    if-eqz p7, :cond_17

    if-eqz p4, :cond_17

    iget-object p4, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget p4, p4, Lcom/google/android/gms/internal/ads/D;->j:I

    if-eq p4, v3, :cond_17

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/nJ0;->Q:Z

    if-nez p2, :cond_16

    if-nez p6, :cond_17

    :cond_16
    and-int/2addr p1, p5

    if-eqz p1, :cond_17

    move p3, v4

    :cond_17
    :goto_12
    iput p3, p0, Lcom/google/android/gms/internal/ads/jJ0;->G:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/jJ0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/jJ0;->i(Lcom/google/android/gms/internal/ads/jJ0;)I

    move-result p1

    return p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->G:I

    return v0
.end method

.method public final bridge synthetic g(Lcom/google/android/gms/internal/ads/BJ0;)Z
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->J:Lcom/google/android/gms/internal/ads/nJ0;

    check-cast p1, Lcom/google/android/gms/internal/ads/jJ0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/nJ0;->K:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v1, v0, Lcom/google/android/gms/internal/ads/D;->D:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v4, v3, Lcom/google/android/gms/internal/ads/D;->D:I

    if-ne v1, v4, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, v3, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->J:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/nJ0;->J:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v0, v0, Lcom/google/android/gms/internal/ads/D;->E:I

    if-eq v0, v2, :cond_0

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/BJ0;->F:Lcom/google/android/gms/internal/ads/D;

    iget v1, v1, Lcom/google/android/gms/internal/ads/D;->E:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->W:Z

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ads/jJ0;->W:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->X:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/jJ0;->X:Z

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Lcom/google/android/gms/internal/ads/jJ0;)I
    .locals 5

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->H:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/jJ0;->K:Z

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
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/jJ0;->K:Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->i()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v2

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->K:Z

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->M:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->M:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ni0;->c()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Ni0;->a()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->L:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->L:I

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->N:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->N:I

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->R:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->R:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->O:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->O:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->P:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->P:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ni0;->c()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Ni0;->a()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->Q:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->Q:I

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->b(II)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->H:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->H:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->V:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->V:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/Ni0;->c()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Ni0;->a()Lcom/google/android/gms/internal/ads/Ni0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->J:Lcom/google/android/gms/internal/ads/nJ0;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/fp;->z:Z

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->W:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->W:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->X:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->X:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->Y:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->Y:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Rh0;->d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->S:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->S:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->T:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->T:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->I:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/jJ0;->I:Ljava/lang/String;

    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/google/android/gms/internal/ads/jJ0;->U:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget p1, p1, Lcom/google/android/gms/internal/ads/jJ0;->U:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/internal/ads/Rh0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object v1

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Rh0;->a()I

    move-result p1

    return p1
.end method
