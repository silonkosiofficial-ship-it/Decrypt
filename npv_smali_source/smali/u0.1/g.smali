.class public final Lu0/g;
.super Lu0/l;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Lo0/n0;

.field private d:F

.field private e:Ljava/util/List;

.field private f:I

.field private g:F

.field private h:F

.field private i:Lo0/n0;

.field private j:I

.field private k:I

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Lq0/m;

.field private final t:Lo0/Q1;

.field private u:Lo0/Q1;

.field private final v:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu0/l;-><init>(Ly7/k;)V

    const-string v0, ""

    iput-object v0, p0, Lu0/g;->b:Ljava/lang/String;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lu0/g;->d:F

    invoke-static {}, Lu0/o;->e()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lu0/g;->e:Ljava/util/List;

    invoke-static {}, Lu0/o;->b()I

    move-result v1

    iput v1, p0, Lu0/g;->f:I

    iput v0, p0, Lu0/g;->g:F

    invoke-static {}, Lu0/o;->c()I

    move-result v1

    iput v1, p0, Lu0/g;->j:I

    invoke-static {}, Lu0/o;->d()I

    move-result v1

    iput v1, p0, Lu0/g;->k:I

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, p0, Lu0/g;->l:F

    iput v0, p0, Lu0/g;->n:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu0/g;->p:Z

    iput-boolean v0, p0, Lu0/g;->q:Z

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v0

    iput-object v0, p0, Lu0/g;->t:Lo0/Q1;

    iput-object v0, p0, Lu0/g;->u:Lo0/Q1;

    sget-object v0, Li7/r;->E:Li7/r;

    sget-object v1, Lu0/g$a;->D:Lu0/g$a;

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, Lu0/g;->v:Li7/n;

    return-void
.end method

.method private final f()Lo0/T1;
    .locals 1

    iget-object v0, p0, Lu0/g;->v:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/T1;

    return-object v0
.end method

.method private final v()V
    .locals 2

    iget-object v0, p0, Lu0/g;->e:Ljava/util/List;

    iget-object v1, p0, Lu0/g;->t:Lo0/Q1;

    invoke-static {v0, v1}, Lu0/k;->c(Ljava/util/List;Lo0/Q1;)Lo0/Q1;

    invoke-direct {p0}, Lu0/g;->w()V

    return-void
.end method

.method private final w()V
    .locals 7

    .prologue
    iget v0, p0, Lu0/g;->m:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v0, :cond_0

    iget v0, p0, Lu0/g;->n:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lu0/g;->t:Lo0/Q1;

    iput-object v0, p0, Lu0/g;->u:Lo0/Q1;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lu0/g;->u:Lo0/Q1;

    iget-object v3, p0, Lu0/g;->t:Lo0/Q1;

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v0

    iput-object v0, p0, Lu0/g;->u:Lo0/Q1;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v0}, Lo0/Q1;->i()I

    move-result v0

    iget-object v3, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v3}, Lo0/Q1;->n()V

    iget-object v3, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v3, v0}, Lo0/Q1;->g(I)V

    :goto_0
    invoke-direct {p0}, Lu0/g;->f()Lo0/T1;

    move-result-object v0

    iget-object v3, p0, Lu0/g;->t:Lo0/Q1;

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Lo0/T1;->b(Lo0/Q1;Z)V

    invoke-direct {p0}, Lu0/g;->f()Lo0/T1;

    move-result-object v0

    invoke-interface {v0}, Lo0/T1;->a()F

    move-result v0

    iget v3, p0, Lu0/g;->m:F

    iget v4, p0, Lu0/g;->o:F

    add-float/2addr v3, v4

    rem-float/2addr v3, v2

    mul-float/2addr v3, v0

    iget v5, p0, Lu0/g;->n:F

    add-float/2addr v5, v4

    rem-float/2addr v5, v2

    mul-float/2addr v5, v0

    cmpl-float v2, v3, v5

    const/4 v4, 0x1

    if-lez v2, :cond_2

    invoke-direct {p0}, Lu0/g;->f()Lo0/T1;

    move-result-object v2

    iget-object v6, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v2, v3, v0, v6, v4}, Lo0/T1;->c(FFLo0/Q1;Z)Z

    invoke-direct {p0}, Lu0/g;->f()Lo0/T1;

    move-result-object v0

    iget-object v2, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v0, v1, v5, v2, v4}, Lo0/T1;->c(FFLo0/Q1;Z)Z

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lu0/g;->f()Lo0/T1;

    move-result-object v0

    iget-object v1, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v0, v3, v5, v1, v4}, Lo0/T1;->c(FFLo0/Q1;Z)Z

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lq0/g;)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lu0/g;->p:Z

    if-eqz v1, :cond_0

    invoke-direct/range {p0 .. p0}, Lu0/g;->v()V

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Lu0/g;->r:Z

    if-eqz v1, :cond_1

    invoke-direct/range {p0 .. p0}, Lu0/g;->w()V

    :cond_1
    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, v0, Lu0/g;->p:Z

    iput-boolean v1, v0, Lu0/g;->r:Z

    iget-object v4, v0, Lu0/g;->c:Lo0/n0;

    if-eqz v4, :cond_2

    iget-object v3, v0, Lu0/g;->u:Lo0/Q1;

    iget v5, v0, Lu0/g;->d:F

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v10}, Lq0/f;->j(Lq0/g;Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_2
    iget-object v13, v0, Lu0/g;->i:Lo0/n0;

    if-eqz v13, :cond_5

    iget-object v2, v0, Lu0/g;->s:Lq0/m;

    iget-boolean v3, v0, Lu0/g;->q:Z

    if-nez v3, :cond_4

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v15, v2

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v2, Lq0/m;

    iget v5, v0, Lu0/g;->h:F

    iget v6, v0, Lu0/g;->l:F

    iget v7, v0, Lu0/g;->j:I

    iget v8, v0, Lu0/g;->k:I

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v11}, Lq0/m;-><init>(FFIILo0/R1;ILy7/k;)V

    iput-object v2, v0, Lu0/g;->s:Lq0/m;

    iput-boolean v1, v0, Lu0/g;->q:Z

    goto :goto_1

    :goto_3
    iget-object v12, v0, Lu0/g;->u:Lo0/Q1;

    iget v14, v0, Lu0/g;->g:F

    const/16 v18, 0x30

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v11 .. v19}, Lq0/f;->j(Lq0/g;Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final e()Lo0/n0;
    .locals 1

    iget-object v0, p0, Lu0/g;->c:Lo0/n0;

    return-object v0
.end method

.method public final g()Lo0/n0;
    .locals 1

    iget-object v0, p0, Lu0/g;->i:Lo0/n0;

    return-object v0
.end method

.method public final h(Lo0/n0;)V
    .locals 0

    iput-object p1, p0, Lu0/g;->c:Lo0/n0;

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final i(F)V
    .locals 0

    iput p1, p0, Lu0/g;->d:F

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lu0/g;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final k(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lu0/g;->e:Ljava/util/List;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->p:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final l(I)V
    .locals 1

    iput p1, p0, Lu0/g;->f:I

    iget-object v0, p0, Lu0/g;->u:Lo0/Q1;

    invoke-interface {v0, p1}, Lo0/Q1;->g(I)V

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final m(Lo0/n0;)V
    .locals 0

    iput-object p1, p0, Lu0/g;->i:Lo0/n0;

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final n(F)V
    .locals 0

    iput p1, p0, Lu0/g;->g:F

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Lu0/g;->j:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->q:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Lu0/g;->k:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->q:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final q(F)V
    .locals 0

    iput p1, p0, Lu0/g;->l:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->q:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final r(F)V
    .locals 0

    iput p1, p0, Lu0/g;->h:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->q:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final s(F)V
    .locals 0

    iput p1, p0, Lu0/g;->n:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->r:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public final t(F)V
    .locals 0

    iput p1, p0, Lu0/g;->o:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->r:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu0/g;->t:Lo0/Q1;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(F)V
    .locals 0

    iput p1, p0, Lu0/g;->m:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu0/g;->r:Z

    invoke-virtual {p0}, Lu0/l;->c()V

    return-void
.end method
