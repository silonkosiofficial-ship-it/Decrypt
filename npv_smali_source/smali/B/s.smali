.class public final LB/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/q;
.implements LD0/K;


# instance fields
.field private final a:LB/t;

.field private b:I

.field private c:Z

.field private d:F

.field private final e:F

.field private final f:Z

.field private final g:LW8/N;

.field private final h:LY0/e;

.field private final i:J

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

.method private constructor <init>(LB/t;IZFLD0/K;FZLW8/N;LY0/e;JLjava/util/List;IIIZLx/s;II)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LB/s;->a:LB/t;

    move v1, p2

    iput v1, v0, LB/s;->b:I

    move v1, p3

    iput-boolean v1, v0, LB/s;->c:Z

    move v1, p4

    iput v1, v0, LB/s;->d:F

    move v1, p6

    iput v1, v0, LB/s;->e:F

    move v1, p7

    iput-boolean v1, v0, LB/s;->f:Z

    move-object v1, p8

    iput-object v1, v0, LB/s;->g:LW8/N;

    move-object v1, p9

    iput-object v1, v0, LB/s;->h:LY0/e;

    move-wide v1, p10

    iput-wide v1, v0, LB/s;->i:J

    move-object v1, p12

    iput-object v1, v0, LB/s;->j:Ljava/util/List;

    move/from16 v1, p13

    iput v1, v0, LB/s;->k:I

    move/from16 v1, p14

    iput v1, v0, LB/s;->l:I

    move/from16 v1, p15

    iput v1, v0, LB/s;->m:I

    move/from16 v1, p16

    iput-boolean v1, v0, LB/s;->n:Z

    move-object/from16 v1, p17

    iput-object v1, v0, LB/s;->o:Lx/s;

    move/from16 v1, p18

    iput v1, v0, LB/s;->p:I

    move/from16 v1, p19

    iput v1, v0, LB/s;->q:I

    move-object v1, p5

    iput-object v1, v0, LB/s;->r:LD0/K;

    return-void
.end method

.method public synthetic constructor <init>(LB/t;IZFLD0/K;FZLW8/N;LY0/e;JLjava/util/List;IIIZLx/s;IILy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p19}, LB/s;-><init>(LB/t;IZFLD0/K;FZLW8/N;LY0/e;JLjava/util/List;IIIZLx/s;II)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-virtual {p0}, LB/s;->getWidth()I

    move-result v0

    invoke-virtual {p0}, LB/s;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/u;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LB/s;->p:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LB/s;->l:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LB/s;->m:I

    return v0
.end method

.method public e()Lx/s;
    .locals 1

    iget-object v0, p0, LB/s;->o:Lx/s;

    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LB/s;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    invoke-virtual {p0}, LB/s;->i()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LB/s;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LB/s;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->getWidth()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LB/s;->q:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, LB/s;->k:I

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LB/s;->j:Ljava/util/List;

    return-object v0
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, LB/s;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->k()V

    return-void
.end method

.method public l()Lx7/l;
    .locals 1

    iget-object v0, p0, LB/s;->r:LD0/K;

    invoke-interface {v0}, LD0/K;->l()Lx7/l;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 2

    .prologue
    iget-object v0, p0, LB/s;->a:LB/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB/t;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, LB/s;->b:I

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, LB/s;->c:Z

    return v0
.end method

.method public final o()J
    .locals 2

    iget-wide v0, p0, LB/s;->i:J

    return-wide v0
.end method

.method public final p()F
    .locals 1

    iget v0, p0, LB/s;->d:F

    return v0
.end method

.method public final q()LW8/N;
    .locals 1

    iget-object v0, p0, LB/s;->g:LW8/N;

    return-object v0
.end method

.method public final r()LY0/e;
    .locals 1

    iget-object v0, p0, LB/s;->h:LY0/e;

    return-object v0
.end method

.method public final s()LB/t;
    .locals 1

    iget-object v0, p0, LB/s;->a:LB/t;

    return-object v0
.end method

.method public final t()I
    .locals 1

    iget v0, p0, LB/s;->b:I

    return v0
.end method

.method public final u()F
    .locals 1

    iget v0, p0, LB/s;->e:F

    return v0
.end method

.method public final v(IZ)Z
    .locals 4

    .prologue
    iget-boolean v0, p0, LB/s;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LB/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LB/s;->a:LB/t;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LB/t;->e()I

    move-result v0

    iget v2, p0, LB/s;->b:I

    sub-int/2addr v2, p1

    if-ltz v2, :cond_3

    if-ge v2, v0, :cond_3

    invoke-virtual {p0}, LB/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    invoke-virtual {p0}, LB/s;->j()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LB/t;

    invoke-virtual {v0}, LB/t;->q()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, LB/t;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    if-gez p1, :cond_1

    invoke-virtual {v0}, LB/t;->c()I

    move-result v3

    invoke-virtual {v0}, LB/t;->e()I

    move-result v0

    add-int/2addr v3, v0

    invoke-virtual {p0}, LB/s;->i()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-virtual {v2}, LB/t;->c()I

    move-result v0

    invoke-virtual {v2}, LB/t;->e()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0}, LB/s;->c()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    neg-int v2, p1

    if-le v0, v2, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LB/s;->i()I

    move-result v3

    invoke-virtual {v0}, LB/t;->c()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-virtual {p0}, LB/s;->c()I

    move-result v0

    invoke-virtual {v2}, LB/t;->c()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-le v0, p1, :cond_3

    :goto_0
    iget v0, p0, LB/s;->b:I

    sub-int/2addr v0, p1

    iput v0, p0, LB/s;->b:I

    invoke-virtual {p0}, LB/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB/t;

    invoke-virtual {v3, p1, p2}, LB/t;->l(IZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    int-to-float p2, p1

    iput p2, p0, LB/s;->d:F

    iget-boolean p2, p0, LB/s;->c:Z

    const/4 v1, 0x1

    if-nez p2, :cond_3

    if-lez p1, :cond_3

    iput-boolean v1, p0, LB/s;->c:Z

    :cond_3
    :goto_2
    return v1
.end method
