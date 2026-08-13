.class public final LC/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/k;
.implements LD/y;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Object;

.field private final c:Z

.field private final d:I

.field private final e:Z

.field private final f:LY0/v;

.field private final g:I

.field private final h:I

.field private final i:Ljava/util/List;

.field private final j:J

.field private final k:Ljava/lang/Object;

.field private final l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final m:J

.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:I

.field private r:I

.field private s:I

.field private t:I

.field private final u:J

.field private v:J

.field private w:I

.field private x:I

.field private y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILjava/lang/Object;ZIIZLY0/v;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JII)V
    .locals 8

    .prologue
    move-object v0, p0

    move-object/from16 v1, p10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v2, p1

    iput v2, v0, LC/v;->a:I

    move-object v2, p2

    iput-object v2, v0, LC/v;->b:Ljava/lang/Object;

    move v2, p3

    iput-boolean v2, v0, LC/v;->c:Z

    move v2, p4

    iput v2, v0, LC/v;->d:I

    move v2, p6

    iput-boolean v2, v0, LC/v;->e:Z

    move-object v2, p7

    iput-object v2, v0, LC/v;->f:LY0/v;

    move/from16 v2, p8

    iput v2, v0, LC/v;->g:I

    move/from16 v2, p9

    iput v2, v0, LC/v;->h:I

    iput-object v1, v0, LC/v;->i:Ljava/util/List;

    move-wide/from16 v2, p11

    iput-wide v2, v0, LC/v;->j:J

    move-object/from16 v2, p13

    iput-object v2, v0, LC/v;->k:Ljava/lang/Object;

    move-object/from16 v2, p14

    iput-object v2, v0, LC/v;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-wide/from16 v2, p15

    iput-wide v2, v0, LC/v;->m:J

    move/from16 v2, p17

    iput v2, v0, LC/v;->n:I

    move/from16 v2, p18

    iput v2, v0, LC/v;->o:I

    const/high16 v2, -0x80000000

    iput v2, v0, LC/v;->r:I

    invoke-interface/range {p10 .. p10}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD0/X;

    invoke-virtual {p0}, LC/v;->i()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6}, LD0/X;->w0()I

    move-result v6

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, LD0/X;->I0()I

    move-result v6

    :goto_1
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iput v5, v0, LC/v;->p:I

    add-int v1, v5, p5

    invoke-static {v1, v3}, LE7/j;->d(II)I

    move-result v1

    iput v1, v0, LC/v;->q:I

    invoke-virtual {p0}, LC/v;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, v0, LC/v;->d:I

    invoke-static {v1, v5}, LY0/u;->a(II)J

    move-result-wide v1

    goto :goto_2

    :cond_2
    iget v1, v0, LC/v;->d:I

    invoke-static {v5, v1}, LY0/u;->a(II)J

    move-result-wide v1

    :goto_2
    iput-wide v1, v0, LC/v;->u:J

    sget-object v1, LY0/p;->b:LY0/p$a;

    invoke-virtual {v1}, LY0/p$a;->a()J

    move-result-wide v1

    iput-wide v1, v0, LC/v;->v:J

    const/4 v1, -0x1

    iput v1, v0, LC/v;->w:I

    iput v1, v0, LC/v;->x:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;ZIIZLY0/v;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p18}, LC/v;-><init>(ILjava/lang/Object;ZIIZLY0/v;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JII)V

    return-void
.end method

.method private final p(J)I
    .locals 1

    .prologue
    invoke-virtual {p0}, LC/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LY0/p;->i(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LY0/p;->h(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method private final r(LD0/X;)I
    .locals 1

    .prologue
    invoke-virtual {p0}, LC/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LD0/X;->I0()I

    move-result p1

    :goto_0
    return p1
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, LC/v;->u:J

    return-wide v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LC/v;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LC/v;->w:I

    return v0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, LC/v;->y:Z

    return-void
.end method

.method public e()I
    .locals 1

    iget v0, p0, LC/v;->q:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, LC/v;->o:I

    return v0
.end method

.method public g(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC/v;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD0/X;

    invoke-virtual {p1}, LD0/X;->Z()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, LC/v;->a:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC/v;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, LC/v;->m:J

    return-wide v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, LC/v;->c:Z

    return v0
.end method

.method public j(I)J
    .locals 2

    invoke-virtual {p0}, LC/v;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, LC/v;->n:I

    return v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, LC/v;->v:J

    return-wide v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, LC/v;->x:I

    return v0
.end method

.method public n(IIII)V
    .locals 7

    const/4 v5, -0x1

    const/4 v6, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v6}, LC/v;->u(IIIIII)V

    return-void
.end method

.method public final o(I)V
    .locals 4

    .prologue
    invoke-virtual {p0}, LC/v;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LC/v;->l()J

    move-result-wide v0

    invoke-virtual {p0}, LC/v;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, LY0/p;->h(J)I

    move-result v2

    add-int/2addr v2, p1

    :goto_0
    invoke-virtual {p0}, LC/v;->i()Z

    move-result v3

    invoke-static {v0, v1}, LY0/p;->i(J)I

    move-result v0

    if-eqz v3, :cond_2

    add-int/2addr v0, p1

    :cond_2
    invoke-static {v2, v0}, LY0/q;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, LC/v;->v:J

    invoke-virtual {p0}, LC/v;->b()I

    move-result p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_3

    iget-object v1, p0, LC/v;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {p0}, LC/v;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final q()I
    .locals 1

    iget v0, p0, LC/v;->p:I

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, LC/v;->y:Z

    return v0
.end method

.method public final t(LD0/X$a;)V
    .locals 11

    .prologue
    iget v0, p0, LC/v;->r:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_5

    invoke-virtual {p0}, LC/v;->b()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    iget-object v2, p0, LC/v;->i:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LD0/X;

    invoke-direct {p0, v4}, LC/v;->r(LD0/X;)I

    invoke-virtual {p0}, LC/v;->l()J

    move-result-wide v2

    iget-object v5, p0, LC/v;->l:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {p0}, LC/v;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->d(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;

    iget-boolean v5, p0, LC/v;->e:Z

    if-eqz v5, :cond_2

    invoke-virtual {p0}, LC/v;->i()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v2, v3}, LY0/p;->h(J)I

    move-result v5

    goto :goto_1

    :cond_0
    invoke-static {v2, v3}, LY0/p;->h(J)I

    move-result v5

    iget v6, p0, LC/v;->r:I

    sub-int/2addr v6, v5

    invoke-direct {p0, v4}, LC/v;->r(LD0/X;)I

    move-result v5

    sub-int v5, v6, v5

    :goto_1
    invoke-virtual {p0}, LC/v;->i()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-static {v2, v3}, LY0/p;->i(J)I

    move-result v2

    iget v3, p0, LC/v;->r:I

    sub-int/2addr v3, v2

    invoke-direct {p0, v4}, LC/v;->r(LD0/X;)I

    move-result v2

    sub-int/2addr v3, v2

    goto :goto_2

    :cond_1
    invoke-static {v2, v3}, LY0/p;->i(J)I

    move-result v3

    :goto_2
    invoke-static {v5, v3}, LY0/q;->a(II)J

    move-result-wide v2

    :cond_2
    iget-wide v5, p0, LC/v;->j:J

    invoke-static {v2, v3, v5, v6}, LY0/p;->l(JJ)J

    move-result-wide v5

    invoke-virtual {p0}, LC/v;->i()Z

    move-result v2

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    if-eqz v2, :cond_3

    invoke-static/range {v3 .. v10}, LD0/X$a;->y(LD0/X$a;LD0/X;JFLx7/l;ILjava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static/range {v3 .. v10}, LD0/X$a;->s(LD0/X$a;LD0/X;JFLx7/l;ILjava/lang/Object;)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "position() should be called first"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u(IIIIII)V
    .locals 1

    .prologue
    invoke-virtual {p0}, LC/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, p4

    goto :goto_0

    :cond_0
    move v0, p3

    :goto_0
    iput v0, p0, LC/v;->r:I

    invoke-virtual {p0}, LC/v;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    invoke-virtual {p0}, LC/v;->i()Z

    move-result p4

    if-eqz p4, :cond_2

    iget-object p4, p0, LC/v;->f:LY0/v;

    sget-object v0, LY0/v;->D:LY0/v;

    if-ne p4, v0, :cond_2

    sub-int/2addr p3, p2

    iget p2, p0, LC/v;->d:I

    sub-int p2, p3, p2

    :cond_2
    invoke-virtual {p0}, LC/v;->i()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p2, p1}, LY0/q;->a(II)J

    move-result-wide p1

    goto :goto_2

    :cond_3
    invoke-static {p1, p2}, LY0/q;->a(II)J

    move-result-wide p1

    :goto_2
    iput-wide p1, p0, LC/v;->v:J

    iput p5, p0, LC/v;->w:I

    iput p6, p0, LC/v;->x:I

    iget p1, p0, LC/v;->g:I

    neg-int p1, p1

    iput p1, p0, LC/v;->s:I

    iget p1, p0, LC/v;->r:I

    iget p2, p0, LC/v;->h:I

    add-int/2addr p1, p2

    iput p1, p0, LC/v;->t:I

    return-void
.end method

.method public final v(I)V
    .locals 1

    iput p1, p0, LC/v;->r:I

    iget v0, p0, LC/v;->h:I

    add-int/2addr p1, v0

    iput p1, p0, LC/v;->t:I

    return-void
.end method
