.class public final LC/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/s;
.implements LD0/K;


# instance fields
.field private final a:LC/x;

.field private b:I

.field private c:Z

.field private d:F

.field private final e:Z

.field private final f:LW8/N;

.field private final g:LY0/e;

.field private final h:I

.field private final i:Lx7/l;

.field private final j:Ljava/util/List;

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:Z

.field private final o:Lx/s;

.field private final p:I

.field private final q:I

.field private final synthetic r:LD0/K;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LC/x;IZFLD0/K;ZLW8/N;LY0/e;ILx7/l;Ljava/util/List;IIIZLx/s;II)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LC/u;->a:LC/x;

    move v1, p2

    iput v1, v0, LC/u;->b:I

    move v1, p3

    iput-boolean v1, v0, LC/u;->c:Z

    move v1, p4

    iput v1, v0, LC/u;->d:F

    move v1, p6

    iput-boolean v1, v0, LC/u;->e:Z

    move-object v1, p7

    iput-object v1, v0, LC/u;->f:LW8/N;

    move-object v1, p8

    iput-object v1, v0, LC/u;->g:LY0/e;

    move v1, p9

    iput v1, v0, LC/u;->h:I

    move-object v1, p10

    iput-object v1, v0, LC/u;->i:Lx7/l;

    move-object v1, p11

    iput-object v1, v0, LC/u;->j:Ljava/util/List;

    move v1, p12

    iput v1, v0, LC/u;->k:I

    move v1, p13

    iput v1, v0, LC/u;->l:I

    move/from16 v1, p14

    iput v1, v0, LC/u;->m:I

    move/from16 v1, p15

    iput-boolean v1, v0, LC/u;->n:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LC/u;->o:Lx/s;

    move/from16 v1, p17

    iput v1, v0, LC/u;->p:I

    move/from16 v1, p18

    iput v1, v0, LC/u;->q:I

    move-object v1, p5

    iput-object v1, v0, LC/u;->r:LD0/K;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-virtual {p0}, LC/u;->getWidth()I

    move-result v0

    invoke-virtual {p0}, LC/u;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/u;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LC/u;->p:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LC/u;->l:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LC/u;->m:I

    return v0
.end method

.method public e()Lx/s;
    .locals 1

    iget-object v0, p0, LC/u;->o:Lx/s;

    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LC/u;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    invoke-virtual {p0}, LC/u;->i()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LC/u;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LC/u;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->getWidth()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LC/u;->q:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, LC/u;->k:I

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LC/u;->j:Ljava/util/List;

    return-object v0
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, LC/u;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->k()V

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LC/u;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->l()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 2

    .prologue
    iget-object v0, p0, LC/u;->a:LC/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC/x;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, LC/u;->b:I

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, LC/u;->c:Z

    return v0
.end method

.method public final o()F
    .locals 1

    iget v0, p0, LC/u;->d:F

    return v0
.end method

.method public final p()LC/x;
    .locals 1

    iget-object v0, p0, LC/u;->a:LC/x;

    return-object v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, LC/u;->b:I

    return v0
.end method

.method public final r()Lx7/l;
    .locals 1

    iget-object v0, p0, LC/u;->i:Lx7/l;

    return-object v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, LC/u;->h:I

    return v0
.end method

.method public final t(I)Z
    .locals 5

    .prologue
    iget-boolean v0, p0, LC/u;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LC/u;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LC/u;->a:LC/x;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LC/x;->d()I

    move-result v0

    iget v2, p0, LC/u;->b:I

    sub-int/2addr v2, p1

    if-ltz v2, :cond_3

    if-ge v2, v0, :cond_3

    invoke-virtual {p0}, LC/u;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/v;

    invoke-virtual {p0}, LC/u;->j()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC/v;

    invoke-virtual {v0}, LC/v;->s()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, LC/v;->s()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    if-gez p1, :cond_1

    invoke-virtual {p0}, LC/u;->e()Lx/s;

    move-result-object v3

    invoke-static {v0, v3}, Ly/e;->a(LC/k;Lx/s;)I

    move-result v3

    invoke-virtual {v0}, LC/v;->e()I

    move-result v0

    add-int/2addr v3, v0

    invoke-virtual {p0}, LC/u;->i()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-virtual {p0}, LC/u;->e()Lx/s;

    move-result-object v0

    invoke-static {v2, v0}, Ly/e;->a(LC/k;Lx/s;)I

    move-result v0

    invoke-virtual {v2}, LC/v;->e()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0}, LC/u;->c()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    neg-int v2, p1

    if-le v0, v2, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LC/u;->i()I

    move-result v3

    invoke-virtual {p0}, LC/u;->e()Lx/s;

    move-result-object v4

    invoke-static {v0, v4}, Ly/e;->a(LC/k;Lx/s;)I

    move-result v0

    sub-int/2addr v3, v0

    invoke-virtual {p0}, LC/u;->c()I

    move-result v0

    invoke-virtual {p0}, LC/u;->e()Lx/s;

    move-result-object v4

    invoke-static {v2, v4}, Ly/e;->a(LC/k;Lx/s;)I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-le v0, p1, :cond_3

    :goto_0
    iget v0, p0, LC/u;->b:I

    sub-int/2addr v0, p1

    iput v0, p0, LC/u;->b:I

    invoke-virtual {p0}, LC/u;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/v;

    invoke-virtual {v3, p1}, LC/v;->o(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    int-to-float v0, p1

    iput v0, p0, LC/u;->d:F

    iget-boolean v0, p0, LC/u;->c:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    if-lez p1, :cond_3

    iput-boolean v1, p0, LC/u;->c:Z

    :cond_3
    :goto_2
    return v1
.end method
