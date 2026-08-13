.class public final Lcom/google/android/gms/internal/ads/KF0;
.super Lcom/google/android/gms/internal/ads/NG0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aB0;


# instance fields
.field private final A0:Lcom/google/android/gms/internal/ads/JE0;

.field private final B0:Lcom/google/android/gms/internal/ads/RE0;

.field private final C0:Lcom/google/android/gms/internal/ads/sG0;

.field private D0:I

.field private E0:Z

.field private F0:Z

.field private G0:Lcom/google/android/gms/internal/ads/D;

.field private H0:Lcom/google/android/gms/internal/ads/D;

.field private I0:J

.field private J0:Z

.field private K0:Z

.field private L0:Z

.field private M0:I

.field private final z0:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vG0;Lcom/google/android/gms/internal/ads/PG0;ZLandroid/os/Handler;Lcom/google/android/gms/internal/ads/KE0;Lcom/google/android/gms/internal/ads/RE0;)V
    .locals 8

    .prologue
    sget p4, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v0, 0x23

    const/4 v1, 0x0

    if-lt p4, v0, :cond_0

    new-instance p4, Lcom/google/android/gms/internal/ads/sG0;

    sget-object v0, Lcom/google/android/gms/internal/ads/rG0;->a:Lcom/google/android/gms/internal/ads/rG0;

    invoke-direct {p4, v0}, Lcom/google/android/gms/internal/ads/sG0;-><init>(Lcom/google/android/gms/internal/ads/rG0;)V

    goto :goto_0

    :cond_0
    move-object p4, v1

    :goto_0
    const/4 v6, 0x0

    const v7, 0x472c4400    # 44100.0f

    const/4 v3, 0x1

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/NG0;-><init>(ILcom/google/android/gms/internal/ads/vG0;Lcom/google/android/gms/internal/ads/PG0;ZF)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->z0:Landroid/content/Context;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/KF0;->C0:Lcom/google/android/gms/internal/ads/sG0;

    const/16 p1, -0x3e8

    iput p1, p0, Lcom/google/android/gms/internal/ads/KF0;->M0:I

    new-instance p1, Lcom/google/android/gms/internal/ads/JE0;

    invoke-direct {p1, p5, p6}, Lcom/google/android/gms/internal/ads/JE0;-><init>(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/KE0;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    new-instance p1, Lcom/google/android/gms/internal/ads/IF0;

    invoke-direct {p1, p0, v1}, Lcom/google/android/gms/internal/ads/IF0;-><init>(Lcom/google/android/gms/internal/ads/KF0;Lcom/google/android/gms/internal/ads/JF0;)V

    invoke-interface {p7, p1}, Lcom/google/android/gms/internal/ads/RE0;->u(Lcom/google/android/gms/internal/ads/OE0;)V

    return-void
.end method

.method private final c1(Lcom/google/android/gms/internal/ads/AG0;Lcom/google/android/gms/internal/ads/D;)I
    .locals 1

    .prologue
    const-string v0, "OMX.google.raw.decoder"

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/AG0;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->z0:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/EW;->m(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Lcom/google/android/gms/internal/ads/D;->p:I

    return p1
.end method

.method private static d1(Lcom/google/android/gms/internal/ads/PG0;Lcom/google/android/gms/internal/ads/D;ZLcom/google/android/gms/internal/ads/RE0;)Ljava/util/List;
    .locals 0

    .prologue
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-nez p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p3, p1}, Lcom/google/android/gms/internal/ads/RE0;->p(Lcom/google/android/gms/internal/ads/D;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/fH0;->a()Lcom/google/android/gms/internal/ads/AG0;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/ci0;->P(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p2, 0x0

    invoke-static {p0, p1, p2, p2}, Lcom/google/android/gms/internal/ads/fH0;->e(Lcom/google/android/gms/internal/ads/PG0;Lcom/google/android/gms/internal/ads/D;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic e1(Lcom/google/android/gms/internal/ads/KF0;)Lcom/google/android/gms/internal/ads/JE0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    return-object p0
.end method

.method static bridge synthetic f1(Lcom/google/android/gms/internal/ads/KF0;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/KF0;->L0:Z

    return-void
.end method

.method static synthetic g1(Lcom/google/android/gms/internal/ads/KF0;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->A()V

    return-void
.end method

.method private final x0()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->g()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/RE0;->P(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/KF0;->J0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/KF0;->I0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/KF0;->I0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->J0:Z

    :cond_1
    return-void
.end method


# virtual methods
.method protected final B()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->L0:Z

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/NG0;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/KF0;->K0:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->K0:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->l()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/KF0;->K0:Z

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->K0:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->l()V

    :goto_0
    throw v1
.end method

.method protected final C()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->h()V

    return-void
.end method

.method protected final D()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/KF0;->x0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->g()V

    return-void
.end method

.method protected final D0(Lcom/google/android/gms/internal/ads/PG0;Lcom/google/android/gms/internal/ads/D;)I
    .locals 9

    .prologue
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ed;->g(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x80

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p2, Lcom/google/android/gms/internal/ads/D;->K:I

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/NG0;->u0(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/fH0;->a()Lcom/google/android/gms/internal/ads/AG0;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v5, v3

    goto :goto_3

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/RE0;->v(Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/vE0;

    move-result-object v0

    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/vE0;->a:Z

    if-nez v5, :cond_3

    move v5, v3

    goto :goto_2

    :cond_3
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/vE0;->b:Z

    if-eq v4, v5, :cond_4

    const/16 v5, 0x200

    goto :goto_1

    :cond_4
    const/16 v5, 0x600

    :goto_1
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/vE0;->c:Z

    if-eqz v0, :cond_5

    or-int/lit16 v5, v5, 0x800

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/RE0;->p(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    or-int/lit16 p1, v5, 0xac

    return p1

    :goto_3
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const-string v6, "audio/raw"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/RE0;->p(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    iget v6, p2, Lcom/google/android/gms/internal/ads/D;->D:I

    iget v7, p2, Lcom/google/android/gms/internal/ads/D;->E:I

    const/4 v8, 0x2

    invoke-static {v8, v6, v7}, Lcom/google/android/gms/internal/ads/EW;->a(III)Lcom/google/android/gms/internal/ads/D;

    move-result-object v6

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/RE0;->p(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-static {p1, p2, v3, v0}, Lcom/google/android/gms/internal/ads/KF0;->d1(Lcom/google/android/gms/internal/ads/PG0;Lcom/google/android/gms/internal/ads/D;ZLcom/google/android/gms/internal/ads/RE0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_4

    :cond_9
    if-nez v2, :cond_a

    move v4, v8

    :goto_4
    or-int/lit16 p1, v4, 0x80

    return p1

    :cond_a
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/AG0;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/AG0;->e(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v2

    if-nez v2, :cond_c

    move v6, v4

    :goto_5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_c

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/ads/AG0;

    invoke-virtual {v7, p2}, Lcom/google/android/gms/internal/ads/AG0;->e(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v8

    if-eqz v8, :cond_b

    move p1, v3

    move v2, v4

    move-object v0, v7

    goto :goto_6

    :cond_b
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_c
    move p1, v4

    :goto_6
    if-eq v4, v2, :cond_d

    const/4 v6, 0x3

    goto :goto_7

    :cond_d
    const/4 v6, 0x4

    :goto_7
    const/16 v7, 0x8

    if-eqz v2, :cond_e

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/AG0;->f(Lcom/google/android/gms/internal/ads/D;)Z

    move-result p2

    if-eqz p2, :cond_e

    const/16 v7, 0x10

    :cond_e
    iget-boolean p2, v0, Lcom/google/android/gms/internal/ads/AG0;->g:Z

    if-eq v4, p2, :cond_f

    move p2, v3

    goto :goto_8

    :cond_f
    const/16 p2, 0x40

    :goto_8
    if-eq v4, p1, :cond_10

    move v1, v3

    :cond_10
    or-int p1, v6, v7

    or-int/lit8 p1, p1, 0x20

    or-int/2addr p1, p2

    or-int/2addr p1, v1

    or-int/2addr p1, v5

    return p1
.end method

.method protected final E0(Lcom/google/android/gms/internal/ads/AG0;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/Hz0;
    .locals 8

    .prologue
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/AG0;->b(Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/Hz0;

    move-result-object v0

    iget v1, v0, Lcom/google/android/gms/internal/ads/Hz0;->e:I

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/ads/NG0;->r0(Lcom/google/android/gms/internal/ads/D;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x8000

    or-int/2addr v1, v2

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/KF0;->c1(Lcom/google/android/gms/internal/ads/AG0;Lcom/google/android/gms/internal/ads/D;)I

    move-result v2

    iget v3, p0, Lcom/google/android/gms/internal/ads/KF0;->D0:I

    if-le v2, v3, :cond_1

    or-int/lit8 v1, v1, 0x40

    :cond_1
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/AG0;->a:Ljava/lang/String;

    new-instance p1, Lcom/google/android/gms/internal/ads/Hz0;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move v7, v1

    move v6, v2

    goto :goto_0

    :cond_2
    iget v0, v0, Lcom/google/android/gms/internal/ads/Hz0;->d:I

    move v6, v0

    move v7, v2

    :goto_0
    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/Hz0;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/D;II)V

    return-object p1
.end method

.method protected final F0(Lcom/google/android/gms/internal/ads/UA0;)Lcom/google/android/gms/internal/ads/Hz0;
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/UA0;->a:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->G0:Lcom/google/android/gms/internal/ads/D;

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/NG0;->F0(Lcom/google/android/gms/internal/ads/UA0;)Lcom/google/android/gms/internal/ads/Hz0;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/ads/JE0;->i(Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V

    return-object p1
.end method

.method protected final I0(Lcom/google/android/gms/internal/ads/AG0;Lcom/google/android/gms/internal/ads/D;Landroid/media/MediaCrypto;F)Lcom/google/android/gms/internal/ads/uG0;
    .locals 7

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->G()[Lcom/google/android/gms/internal/ads/D;

    move-result-object p3

    array-length v0, p3

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/KF0;->c1(Lcom/google/android/gms/internal/ads/AG0;Lcom/google/android/gms/internal/ads/D;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    goto :goto_1

    :cond_0
    move v4, v2

    :goto_0
    if-ge v4, v0, :cond_2

    aget-object v5, p3, v4

    invoke-virtual {p1, p2, v5}, Lcom/google/android/gms/internal/ads/AG0;->b(Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/D;)Lcom/google/android/gms/internal/ads/Hz0;

    move-result-object v6

    iget v6, v6, Lcom/google/android/gms/internal/ads/Hz0;->d:I

    if-eqz v6, :cond_1

    invoke-direct {p0, p1, v5}, Lcom/google/android/gms/internal/ads/KF0;->c1(Lcom/google/android/gms/internal/ads/AG0;Lcom/google/android/gms/internal/ads/D;)I

    move-result v5

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput v1, p0, Lcom/google/android/gms/internal/ads/KF0;->D0:I

    iget-object p3, p1, Lcom/google/android/gms/internal/ads/AG0;->a:Ljava/lang/String;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v4, "OMX.SEC.aac.dec"

    invoke-virtual {v4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const-string p3, "samsung"

    sget-object v4, Lcom/google/android/gms/internal/ads/EW;->c:Ljava/lang/String;

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, Lcom/google/android/gms/internal/ads/EW;->b:Ljava/lang/String;

    const-string v4, "zeroflte"

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "herolte"

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "heroqlte"

    invoke-virtual {p3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    :cond_3
    move p3, v3

    goto :goto_2

    :cond_4
    move p3, v2

    :goto_2
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/KF0;->E0:Z

    iget-object p3, p1, Lcom/google/android/gms/internal/ads/AG0;->a:Ljava/lang/String;

    const-string v4, "OMX.google.opus.decoder"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "c2.android.opus.decoder"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "OMX.google.vorbis.decoder"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "c2.android.vorbis.decoder"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    :cond_5
    move p3, v3

    goto :goto_3

    :cond_6
    move p3, v2

    :goto_3
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/KF0;->F0:Z

    iget-object p3, p1, Lcom/google/android/gms/internal/ads/AG0;->c:Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/internal/ads/KF0;->D0:I

    new-instance v5, Landroid/media/MediaFormat;

    invoke-direct {v5}, Landroid/media/MediaFormat;-><init>()V

    const-string v6, "mime"

    invoke-virtual {v5, v6, p3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p3, p2, Lcom/google/android/gms/internal/ads/D;->D:I

    const-string v6, "channel-count"

    invoke-virtual {v5, v6, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p3, p2, Lcom/google/android/gms/internal/ads/D;->E:I

    const-string v6, "sample-rate"

    invoke-virtual {v5, v6, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/D;->r:Ljava/util/List;

    invoke-static {v5, p3}, Lcom/google/android/gms/internal/ads/HN;->b(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p3, "max-input-size"

    invoke-static {v5, p3, v4}, Lcom/google/android/gms/internal/ads/HN;->a(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const/16 p3, 0x17

    if-lt v0, p3, :cond_8

    const-string v4, "priority"

    invoke-virtual {v5, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v4, p4, v4

    if-eqz v4, :cond_8

    if-ne v0, p3, :cond_7

    sget-object p3, Lcom/google/android/gms/internal/ads/EW;->d:Ljava/lang/String;

    const-string v4, "ZTE B2017G"

    invoke-virtual {v4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "AXON 7 mini"

    invoke-virtual {v4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    :cond_7
    const-string p3, "operating-rate"

    invoke-virtual {v5, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_8
    const/16 p3, 0x1c

    if-gt v0, p3, :cond_9

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const-string p4, "audio/ac4"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    const-string p3, "ac4-is-sync"

    invoke-virtual {v5, p3, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_9
    if-lt v0, v1, :cond_a

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    iget p4, p2, Lcom/google/android/gms/internal/ads/D;->D:I

    iget v1, p2, Lcom/google/android/gms/internal/ads/D;->E:I

    const/4 v3, 0x4

    invoke-static {v3, p4, v1}, Lcom/google/android/gms/internal/ads/EW;->a(III)Lcom/google/android/gms/internal/ads/D;

    move-result-object p4

    invoke-interface {p3, p4}, Lcom/google/android/gms/internal/ads/RE0;->a(Lcom/google/android/gms/internal/ads/D;)I

    move-result p3

    const/4 p4, 0x2

    if-ne p3, p4, :cond_a

    const-string p3, "pcm-encoding"

    invoke-virtual {v5, p3, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_a
    const/16 p3, 0x20

    if-lt v0, p3, :cond_b

    const-string p3, "max-output-channel-count"

    const/16 p4, 0x63

    invoke-virtual {v5, p3, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_b
    const/16 p3, 0x23

    if-lt v0, p3, :cond_c

    iget p3, p0, Lcom/google/android/gms/internal/ads/KF0;->M0:I

    neg-int p3, p3

    invoke-static {v2, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    const-string p4, "importance"

    invoke-virtual {v5, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_c
    iget-object p3, p1, Lcom/google/android/gms/internal/ads/AG0;->b:Ljava/lang/String;

    const-string p4, "audio/raw"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_d

    iget-object p3, p2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_d

    move-object p3, p2

    goto :goto_4

    :cond_d
    move-object p3, v0

    :goto_4
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/KF0;->H0:Lcom/google/android/gms/internal/ads/D;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/KF0;->C0:Lcom/google/android/gms/internal/ads/sG0;

    invoke-static {p1, v5, p2, v0, p3}, Lcom/google/android/gms/internal/ads/uG0;->a(Lcom/google/android/gms/internal/ads/AG0;Landroid/media/MediaFormat;Lcom/google/android/gms/internal/ads/D;Landroid/media/MediaCrypto;Lcom/google/android/gms/internal/ads/sG0;)Lcom/google/android/gms/internal/ads/uG0;

    move-result-object p1

    return-object p1
.end method

.method protected final J0(Lcom/google/android/gms/internal/ads/PG0;Lcom/google/android/gms/internal/ads/D;Z)Ljava/util/List;
    .locals 1

    const/4 p3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/KF0;->d1(Lcom/google/android/gms/internal/ads/PG0;Lcom/google/android/gms/internal/ads/D;ZLcom/google/android/gms/internal/ads/RE0;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/fH0;->f(Ljava/util/List;Lcom/google/android/gms/internal/ads/D;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected final M0(Lcom/google/android/gms/internal/ads/vz0;)V
    .locals 5

    .prologue
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vz0;->b:Lcom/google/android/gms/internal/ads/D;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const-string v1, "audio/opus"

    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vz0;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vz0;->b:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p1, Lcom/google/android/gms/internal/ads/D;->G:I

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    const-wide/32 v2, 0xbb80

    mul-long/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    const-wide/32 v3, 0x3b9aca00

    div-long/2addr v0, v3

    long-to-int v0, v0

    invoke-interface {v2, p1, v0}, Lcom/google/android/gms/internal/ads/RE0;->f(II)V

    :cond_0
    return-void
.end method

.method protected final N0(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/JE0;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method protected final O0(Ljava/lang/String;Lcom/google/android/gms/internal/ads/uG0;JJ)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/JE0;->e(Ljava/lang/String;JJ)V

    return-void
.end method

.method protected final P0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/JE0;->f(Ljava/lang/String;)V

    return-void
.end method

.method public final Q(Lcom/google/android/gms/internal/ads/qg;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/RE0;->r(Lcom/google/android/gms/internal/ads/qg;)V

    return-void
.end method

.method protected final Q0(Lcom/google/android/gms/internal/ads/D;Landroid/media/MediaFormat;)V
    .locals 10

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->H0:Lcom/google/android/gms/internal/ads/D;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->b1()Lcom/google/android/gms/internal/ads/xG0;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    const-string v4, "audio/raw"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v5, 0x2

    if-eqz v0, :cond_2

    iget v0, p1, Lcom/google/android/gms/internal/ads/D;->F:I

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v6, 0x18

    if-lt v0, v6, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/EW;->F(I)I

    move-result v0

    goto :goto_0

    :cond_4
    move v0, v5

    :goto_0
    new-instance v6, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->u(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v0, p1, Lcom/google/android/gms/internal/ads/D;->G:I

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->g(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v0, p1, Lcom/google/android/gms/internal/ads/D;->H:I

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->h(I)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->l:Lcom/google/android/gms/internal/ads/Cb;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->t(Lcom/google/android/gms/internal/ads/Cb;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->a:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->b:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->c:Ljava/util/List;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->p(Ljava/util/List;)Lcom/google/android/gms/internal/ads/oK0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/D;->d:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    iget v0, p1, Lcom/google/android/gms/internal/ads/D;->e:I

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->D(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v0, p1, Lcom/google/android/gms/internal/ads/D;->f:I

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->y(I)Lcom/google/android/gms/internal/ads/oK0;

    const-string v0, "channel-count"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/oK0;->r0(I)Lcom/google/android/gms/internal/ads/oK0;

    const-string v0, "sample-rate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/oK0;->C(I)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object p2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->E0:Z

    const/4 v4, 0x6

    if-eqz v0, :cond_6

    iget v0, p2, Lcom/google/android/gms/internal/ads/D;->D:I

    if-ne v0, v4, :cond_6

    iget v0, p1, Lcom/google/android/gms/internal/ads/D;->D:I

    if-ge v0, v4, :cond_6

    new-array v1, v0, [I

    move v0, v3

    :goto_1
    iget v4, p1, Lcom/google/android/gms/internal/ads/D;->D:I

    if-ge v0, v4, :cond_5

    aput v0, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    move-object p1, p2

    goto :goto_3

    :cond_6
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/KF0;->F0:Z

    if-eqz p1, :cond_5

    iget p1, p2, Lcom/google/android/gms/internal/ads/D;->D:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_b

    const/4 v6, 0x4

    const/4 v7, 0x5

    if-eq p1, v7, :cond_a

    if-eq p1, v4, :cond_9

    const/4 v8, 0x7

    if-eq p1, v8, :cond_8

    const/16 v9, 0x8

    if-eq p1, v9, :cond_7

    goto :goto_2

    :cond_7
    new-array v1, v9, [I

    aput v3, v1, v3

    aput v5, v1, v2

    aput v2, v1, v5

    aput v8, v1, v0

    aput v7, v1, v6

    aput v4, v1, v7

    aput v0, v1, v4

    aput v6, v1, v8

    goto :goto_2

    :cond_8
    new-array v1, v8, [I

    aput v3, v1, v3

    aput v5, v1, v2

    aput v2, v1, v5

    aput v4, v1, v0

    aput v7, v1, v6

    aput v0, v1, v7

    aput v6, v1, v4

    goto :goto_2

    :cond_9
    new-array v1, v4, [I

    aput v3, v1, v3

    aput v5, v1, v2

    aput v2, v1, v5

    aput v7, v1, v0

    aput v0, v1, v6

    aput v6, v1, v7

    goto :goto_2

    :cond_a
    new-array v1, v7, [I

    aput v3, v1, v3

    aput v5, v1, v2

    aput v2, v1, v5

    aput v0, v1, v0

    aput v6, v1, v6

    goto :goto_2

    :cond_b
    new-array v1, v0, [I

    aput v3, v1, v3

    aput v5, v1, v2

    aput v2, v1, v5

    goto :goto_2

    :goto_3
    :try_start_0
    sget p2, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v0, 0x1d

    if-lt p2, v0, :cond_e

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->q0()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->S()Lcom/google/android/gms/internal/ads/EB0;

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_6

    :cond_c
    :goto_4
    if-lt p2, v0, :cond_d

    goto :goto_5

    :cond_d
    move v2, v3

    :goto_5
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    :cond_e
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {p2, p1, v3, v1}, Lcom/google/android/gms/internal/ads/RE0;->z(Lcom/google/android/gms/internal/ads/D;I[I)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/ME0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_6
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/ME0;->C:Lcom/google/android/gms/internal/ads/D;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v3, v0}, Lcom/google/android/gms/internal/ads/Fz0;->L(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/D;ZI)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object p1

    throw p1
.end method

.method protected final R0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->J0:Z

    return-void
.end method

.method protected final S0()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->i()V

    return-void
.end method

.method protected final T0()V
    .locals 4

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->j()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/QE0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->q0()Z

    move-result v2

    if-eq v1, v2, :cond_0

    const/16 v1, 0x138a

    goto :goto_0

    :cond_0
    const/16 v1, 0x138b

    :goto_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/QE0;->E:Lcom/google/android/gms/internal/ads/D;

    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/QE0;->D:Z

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/Fz0;->L(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/D;ZI)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object v0

    throw v0
.end method

.method protected final U()V
    .locals 3

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->K0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->G0:Lcom/google/android/gms/internal/ads/D;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/NG0;->U()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/NG0;->s0:Lcom/google/android/gms/internal/ads/Gz0;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/JE0;->g(Lcom/google/android/gms/internal/ads/Gz0;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/NG0;->U()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/NG0;->s0:Lcom/google/android/gms/internal/ads/Gz0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/JE0;->g(Lcom/google/android/gms/internal/ads/Gz0;)V

    throw v0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/NG0;->s0:Lcom/google/android/gms/internal/ads/Gz0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/JE0;->g(Lcom/google/android/gms/internal/ads/Gz0;)V

    throw v0
.end method

.method protected final U0(JJLcom/google/android/gms/internal/ads/xG0;Ljava/nio/ByteBuffer;IIIJZZLcom/google/android/gms/internal/ads/D;)Z
    .locals 0

    .prologue
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->H0:Lcom/google/android/gms/internal/ads/D;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p5, p7, p3}, Lcom/google/android/gms/internal/ads/xG0;->i(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lcom/google/android/gms/internal/ads/xG0;->i(IZ)V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NG0;->s0:Lcom/google/android/gms/internal/ads/Gz0;

    iget p3, p1, Lcom/google/android/gms/internal/ads/Gz0;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lcom/google/android/gms/internal/ads/Gz0;->f:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/RE0;->i()V

    return p2

    :cond_2
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {p1, p6, p10, p11, p9}, Lcom/google/android/gms/internal/ads/RE0;->w(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/NE0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/ads/QE0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lcom/google/android/gms/internal/ads/xG0;->i(IZ)V

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NG0;->s0:Lcom/google/android/gms/internal/ads/Gz0;

    iget p3, p1, Lcom/google/android/gms/internal/ads/Gz0;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lcom/google/android/gms/internal/ads/Gz0;->e:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->q0()Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->S()Lcom/google/android/gms/internal/ads/EB0;

    :goto_1
    iget-boolean p2, p1, Lcom/google/android/gms/internal/ads/QE0;->D:Z

    const/16 p3, 0x138a

    invoke-virtual {p0, p1, p14, p2, p3}, Lcom/google/android/gms/internal/ads/Fz0;->L(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/D;ZI)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object p1

    throw p1

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/KF0;->G0:Lcom/google/android/gms/internal/ads/D;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->q0()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->S()Lcom/google/android/gms/internal/ads/EB0;

    :cond_6
    iget-boolean p3, p1, Lcom/google/android/gms/internal/ads/NE0;->D:Z

    const/16 p4, 0x1389

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/Fz0;->L(Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/D;ZI)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object p1

    throw p1
.end method

.method protected final V(ZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/NG0;->V(ZZ)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->A0:Lcom/google/android/gms/internal/ads/JE0;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/NG0;->s0:Lcom/google/android/gms/internal/ads/Gz0;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/JE0;->h(Lcom/google/android/gms/internal/ads/Gz0;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->S()Lcom/google/android/gms/internal/ads/EB0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->T()Lcom/google/android/gms/internal/ads/bE0;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->x(Lcom/google/android/gms/internal/ads/bE0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->P()Lcom/google/android/gms/internal/ads/mD;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->y(Lcom/google/android/gms/internal/ads/mD;)V

    return-void
.end method

.method protected final V0(Lcom/google/android/gms/internal/ads/D;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->S()Lcom/google/android/gms/internal/ads/EB0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/RE0;->p(Lcom/google/android/gms/internal/ads/D;)Z

    move-result p1

    return p1
.end method

.method protected final W(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/NG0;->W(JZ)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/RE0;->e()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/KF0;->I0:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/KF0;->L0:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/KF0;->J0:Z

    return-void
.end method

.method public final X()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->V()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/NG0;->X()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final Y()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method protected final Z(FLcom/google/android/gms/internal/ads/D;[Lcom/google/android/gms/internal/ads/D;)F
    .locals 3

    .prologue
    const/4 p2, 0x0

    const/4 v0, -0x1

    move v1, v0

    :goto_0
    array-length v2, p3

    if-ge p2, v2, :cond_1

    aget-object v2, p3, p2

    iget v2, v2, Lcom/google/android/gms/internal/ads/D;->E:I

    if-eq v2, v0, :cond_0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    if-ne v1, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    return p1

    :cond_2
    int-to-float p2, v1

    mul-float/2addr p2, p1

    return p2
.end method

.method public final a()J
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fz0;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/KF0;->x0()V

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/KF0;->I0:J

    return-wide v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/qg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/NG0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/KF0;->L0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/KF0;->L0:Z

    return v0
.end method

.method public final l()Lcom/google/android/gms/internal/ads/aB0;
    .locals 0

    return-object p0
.end method

.method public final x(ILjava/lang/Object;)V
    .locals 2

    .prologue
    const/4 v0, 0x2

    if-eq p1, v0, :cond_7

    const/4 v0, 0x3

    if-eq p1, v0, :cond_6

    const/4 v0, 0x6

    if-eq p1, v0, :cond_5

    const/16 v0, 0xc

    if-eq p1, v0, :cond_3

    const/16 v0, 0x10

    const/16 v1, 0x23

    if-eq p1, v0, :cond_2

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/NG0;->x(ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/RE0;->A(I)V

    sget p2, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-lt p2, v1, :cond_4

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/KF0;->C0:Lcom/google/android/gms/internal/ads/sG0;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/sG0;->d(I)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->o(Z)V

    return-void

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/KF0;->M0:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/NG0;->b1()Lcom/google/android/gms/internal/ads/xG0;

    move-result-object p1

    if-eqz p1, :cond_4

    sget p2, Lcom/google/android/gms/internal/ads/EW;->a:I

    if-lt p2, v1, :cond_4

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Lcom/google/android/gms/internal/ads/KF0;->M0:I

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "importance"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/xG0;->U(Landroid/os/Bundle;)V

    return-void

    :cond_3
    sget p1, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    check-cast p2, Landroid/media/AudioDeviceInfo;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->s(Landroid/media/AudioDeviceInfo;)V

    :cond_4
    return-void

    :cond_5
    check-cast p2, Lcom/google/android/gms/internal/ads/a60;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->t(Lcom/google/android/gms/internal/ads/a60;)V

    return-void

    :cond_6
    check-cast p2, Lcom/google/android/gms/internal/ads/vS;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->B(Lcom/google/android/gms/internal/ads/vS;)V

    return-void

    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/RE0;->q(F)V

    return-void
.end method

.method protected final y()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->B0:Lcom/google/android/gms/internal/ads/RE0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/RE0;->k()V

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KF0;->C0:Lcom/google/android/gms/internal/ads/sG0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sG0;->b()V

    :cond_0
    return-void
.end method
