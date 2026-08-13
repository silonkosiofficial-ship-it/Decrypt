.class public final Lcom/google/android/gms/internal/ads/GH0;
.super Lcom/google/android/gms/internal/ads/RI0;
.source "SourceFile"


# instance fields
.field private final l:Z

.field private final m:Lcom/google/android/gms/internal/ads/Ql;

.field private final n:Lcom/google/android/gms/internal/ads/pl;

.field private o:Lcom/google/android/gms/internal/ads/DH0;

.field private p:Lcom/google/android/gms/internal/ads/CH0;

.field private q:Z

.field private r:Z

.field private s:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/NH0;Z)V
    .locals 0

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/RI0;-><init>(Lcom/google/android/gms/internal/ads/NH0;)V

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/NH0;->v()Z

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/GH0;->l:Z

    new-instance p2, Lcom/google/android/gms/internal/ads/Ql;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/Ql;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GH0;->m:Lcom/google/android/gms/internal/ads/Ql;

    new-instance p2, Lcom/google/android/gms/internal/ads/pl;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/pl;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GH0;->n:Lcom/google/android/gms/internal/ads/pl;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/NH0;->R()Lcom/google/android/gms/internal/ads/qm;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/NH0;->l0()Lcom/google/android/gms/internal/ads/Q7;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DH0;->q(Lcom/google/android/gms/internal/ads/Q7;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    return-void
.end method

.method private final I(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/DH0;->s(Lcom/google/android/gms/internal/ads/DH0;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DH0;->s(Lcom/google/android/gms/internal/ads/DH0;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final K(J)Z
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/CH0;->C:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/yH0;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    return v3

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/GH0;->n:Lcom/google/android/gms/internal/ads/pl;

    invoke-virtual {v2, v1, v4, v3}, Lcom/google/android/gms/internal/ads/qm;->d(ILcom/google/android/gms/internal/ads/pl;Z)Lcom/google/android/gms/internal/ads/pl;

    iget-wide v1, v4, Lcom/google/android/gms/internal/ads/pl;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, -0x1

    add-long/2addr v1, p1

    const-wide/16 p1, 0x0

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/CH0;->s(J)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method protected final D(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/LH0;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/DH0;->s(Lcom/google/android/gms/internal/ads/DH0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/DH0;->s(Lcom/google/android/gms/internal/ads/DH0;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/LH0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object p1

    return-object p1
.end method

.method protected final E(Lcom/google/android/gms/internal/ads/qm;)V
    .locals 14

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->r:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/DH0;->p(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/CH0;->m()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/GH0;->K(J)Z

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/qm;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->s:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/DH0;->p(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Ql;->o:Ljava/lang/Object;

    sget-object v2, Lcom/google/android/gms/internal/ads/DH0;->e:Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/ads/DH0;->r(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->m:Lcom/google/android/gms/internal/ads/Ql;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-virtual {p1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->m:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Ql;->a:Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/CH0;->n()J

    move-result-wide v6

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/GH0;->n:Lcom/google/android/gms/internal/ads/pl;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/CH0;->C:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-virtual {v8, v5, v9}, Lcom/google/android/gms/internal/ads/qm;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/pl;)Lcom/google/android/gms/internal/ads/pl;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/GH0;->m:Lcom/google/android/gms/internal/ads/Ql;

    invoke-virtual {v5, v2, v8, v3, v4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    cmp-long v2, v6, v3

    if-eqz v2, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v3

    :goto_1
    iget-object v9, p0, Lcom/google/android/gms/internal/ads/GH0;->m:Lcom/google/android/gms/internal/ads/Ql;

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/GH0;->n:Lcom/google/android/gms/internal/ads/pl;

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/qm;->l(Lcom/google/android/gms/internal/ads/Ql;Lcom/google/android/gms/internal/ads/pl;IJ)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/GH0;->s:Z

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/DH0;->p(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v3}, Lcom/google/android/gms/internal/ads/DH0;->r(Lcom/google/android/gms/internal/ads/qm;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    if-eqz p1, :cond_5

    invoke-direct {p0, v4, v5}, Lcom/google/android/gms/internal/ads/GH0;->K(J)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/CH0;->C:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/GH0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/LH0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object v1

    :cond_5
    :goto_3
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/GH0;->s:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/GH0;->r:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/kH0;->u(Lcom/google/android/gms/internal/ads/qm;)V

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/CH0;->r(Lcom/google/android/gms/internal/ads/LH0;)V

    :cond_6
    return-void
.end method

.method public final F()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->q:Z

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/sH0;->z(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/NH0;)V

    :cond_0
    return-void
.end method

.method public final G()Lcom/google/android/gms/internal/ads/qm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    return-object v0
.end method

.method public final H(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)Lcom/google/android/gms/internal/ads/CH0;
    .locals 1

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/CH0;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/CH0;-><init>(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/CH0;->u(Lcom/google/android/gms/internal/ads/NH0;)V

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/GH0;->r:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/LH0;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/GH0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LH0;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/LH0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/CH0;->r(Lcom/google/android/gms/internal/ads/LH0;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/GH0;->q:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/GH0;->q:Z

    const/4 p1, 0x0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/sH0;->z(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/NH0;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final J()V
    .locals 0

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/JH0;)V
    .locals 1

    .prologue
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/CH0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/CH0;->t()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GH0;->p:Lcom/google/android/gms/internal/ads/CH0;

    :cond_0
    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/Q7;)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    new-instance v1, Lcom/google/android/gms/internal/ads/NI0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/ads/NI0;-><init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/Q7;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/DH0;->p(Lcom/google/android/gms/internal/ads/qm;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/GH0;->o:Lcom/google/android/gms/internal/ads/DH0;

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/DH0;->q(Lcom/google/android/gms/internal/ads/Q7;)Lcom/google/android/gms/internal/ads/DH0;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RI0;->k:Lcom/google/android/gms/internal/ads/NH0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/NH0;->c(Lcom/google/android/gms/internal/ads/Q7;)V

    return-void
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)Lcom/google/android/gms/internal/ads/JH0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/GH0;->H(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)Lcom/google/android/gms/internal/ads/CH0;

    move-result-object p1

    return-object p1
.end method

.method public final w()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->r:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/GH0;->q:Z

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/sH0;->w()V

    return-void
.end method
