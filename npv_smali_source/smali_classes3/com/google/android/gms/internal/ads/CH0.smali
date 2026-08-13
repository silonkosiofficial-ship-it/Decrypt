.class public final Lcom/google/android/gms/internal/ads/CH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/JH0;
.implements Lcom/google/android/gms/internal/ads/IH0;


# instance fields
.field public final C:Lcom/google/android/gms/internal/ads/LH0;

.field private final D:J

.field private E:Lcom/google/android/gms/internal/ads/NH0;

.field private F:Lcom/google/android/gms/internal/ads/JH0;

.field private G:Lcom/google/android/gms/internal/ads/IH0;

.field private H:J

.field private final I:Lcom/google/android/gms/internal/ads/YJ0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->C:Lcom/google/android/gms/internal/ads/LH0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/CH0;->I:Lcom/google/android/gms/internal/ads/YJ0;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/CH0;->D:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/CH0;->H:J

    return-void
.end method

.method private final v(J)J
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/CH0;->H:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    return-wide p1
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->a(J)V

    return-void
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/ZA0;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/JH0;->d(Lcom/google/android/gms/internal/ads/ZA0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/ads/HI0;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/JH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->G:Lcom/google/android/gms/internal/ads/IH0;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/FI0;->e(Lcom/google/android/gms/internal/ads/HI0;)V

    return-void
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/PI0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->g()Lcom/google/android/gms/internal/ads/PI0;

    move-result-object v0

    return-object v0
.end method

.method public final h(J)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/JH0;->h(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final i(JLcom/google/android/gms/internal/ads/GB0;)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->i(JLcom/google/android/gms/internal/ads/GB0;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final j(JZ)V
    .locals 1

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Lcom/google/android/gms/internal/ads/JH0;->j(JZ)V

    return-void
.end method

.method public final k()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->k()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->E:Lcom/google/android/gms/internal/ads/NH0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/NH0;->J()V

    :cond_1
    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/ads/JH0;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->G:Lcom/google/android/gms/internal/ads/IH0;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/IH0;->l(Lcom/google/android/gms/internal/ads/JH0;)V

    return-void
.end method

.method public final m()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/CH0;->H:J

    return-wide v0
.end method

.method public final n()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/CH0;->D:J

    return-wide v0
.end method

.method public final o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J
    .locals 13

    .prologue
    move-object v0, p0

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/CH0;->H:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/CH0;->D:J

    cmp-long v5, p5, v5

    if-nez v5, :cond_0

    move-wide v11, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p5

    :goto_0
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/CH0;->H:J

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    sget v1, Lcom/google/android/gms/internal/ads/EW;->a:I

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-interface/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/JH0;->o([Lcom/google/android/gms/internal/ads/IJ0;[Z[Lcom/google/android/gms/internal/ads/EI0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final p(Lcom/google/android/gms/internal/ads/IH0;J)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->G:Lcom/google/android/gms/internal/ads/IH0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    if-eqz p1, :cond_0

    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/CH0;->D:J

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/CH0;->v(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lcom/google/android/gms/internal/ads/JH0;->p(Lcom/google/android/gms/internal/ads/IH0;J)V

    :cond_0
    return-void
.end method

.method public final q()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/JH0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r(Lcom/google/android/gms/internal/ads/LH0;)V
    .locals 4

    .prologue
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/CH0;->D:J

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/CH0;->v(J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/CH0;->E:Lcom/google/android/gms/internal/ads/NH0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/CH0;->I:Lcom/google/android/gms/internal/ads/YJ0;

    invoke-interface {v2, p1, v3, v0, v1}, Lcom/google/android/gms/internal/ads/NH0;->e(Lcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/YJ0;J)Lcom/google/android/gms/internal/ads/JH0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/CH0;->G:Lcom/google/android/gms/internal/ads/IH0;

    if-eqz v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lcom/google/android/gms/internal/ads/JH0;->p(Lcom/google/android/gms/internal/ads/IH0;J)V

    :cond_0
    return-void
.end method

.method public final s(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/CH0;->H:J

    return-void
.end method

.method public final t()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->F:Lcom/google/android/gms/internal/ads/JH0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/CH0;->E:Lcom/google/android/gms/internal/ads/NH0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/NH0;->b(Lcom/google/android/gms/internal/ads/JH0;)V

    :cond_0
    return-void
.end method

.method public final u(Lcom/google/android/gms/internal/ads/NH0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CH0;->E:Lcom/google/android/gms/internal/ads/NH0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CH0;->E:Lcom/google/android/gms/internal/ads/NH0;

    return-void
.end method
