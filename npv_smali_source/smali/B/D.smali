.class public final LB/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/D$c;
    }
.end annotation


# static fields
.field public static final y:LB/D$c;

.field private static final z:Le0/j;


# instance fields
.field private final a:LB/x;

.field private b:Z

.field private c:LB/s;

.field private final d:LB/B;

.field private final e:LB/f;

.field private final f:LV/w0;

.field private final g:Lz/l;

.field private h:F

.field private final i:Lx/A;

.field private j:I

.field private k:Z

.field private l:LD0/Z;

.field private final m:LD0/a0;

.field private final n:LD/b;

.field private final o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final p:LD/j;

.field private final q:Landroidx/compose/foundation/lazy/layout/d;

.field private final r:LB/v;

.field private final s:LD/D;

.field private final t:LV/w0;

.field private final u:LV/w0;

.field private final v:LV/w0;

.field private final w:LV/w0;

.field private x:Lu/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB/D$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB/D$c;-><init>(Ly7/k;)V

    sput-object v0, LB/D;->y:LB/D$c;

    sget-object v0, LB/D$a;->D:LB/D$a;

    sget-object v1, LB/D$b;->D:LB/D$b;

    invoke-static {v0, v1}, Le0/a;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    sput-object v0, LB/D;->z:Le0/j;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, LB/y;->b(IILjava/lang/Object;)LB/x;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LB/D;-><init>(IILB/x;)V

    return-void
.end method

.method public constructor <init>(IILB/x;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LB/D;->a:LB/x;

    new-instance v0, LB/B;

    invoke-direct {v0, p1, p2}, LB/B;-><init>(II)V

    iput-object v0, p0, LB/D;->d:LB/B;

    new-instance p2, LB/f;

    invoke-direct {p2, p0}, LB/f;-><init>(LB/D;)V

    iput-object p2, p0, LB/D;->e:LB/f;

    invoke-static {}, LB/E;->b()LB/s;

    move-result-object p2

    invoke-static {}, LV/v1;->j()LV/u1;

    move-result-object v1

    invoke-static {p2, v1}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p2

    iput-object p2, p0, LB/D;->f:LV/w0;

    invoke-static {}, Lz/k;->a()Lz/l;

    move-result-object p2

    iput-object p2, p0, LB/D;->g:Lz/l;

    new-instance p2, LB/D$i;

    invoke-direct {p2, p0}, LB/D$i;-><init>(LB/D;)V

    invoke-static {p2}, Lx/B;->a(Lx7/l;)Lx/A;

    move-result-object p2

    iput-object p2, p0, LB/D;->i:Lx/A;

    const/4 p2, 0x1

    iput-boolean p2, p0, LB/D;->k:Z

    new-instance v1, LB/D$f;

    invoke-direct {v1, p0}, LB/D$f;-><init>(LB/D;)V

    iput-object v1, p0, LB/D;->m:LD0/a0;

    new-instance v1, LD/b;

    invoke-direct {v1}, LD/b;-><init>()V

    iput-object v1, p0, LB/D;->n:LD/b;

    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;-><init>()V

    iput-object v1, p0, LB/D;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    new-instance v1, LD/j;

    invoke-direct {v1}, LD/j;-><init>()V

    iput-object v1, p0, LB/D;->p:LD/j;

    new-instance v1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p3}, LB/x;->b()LD/P;

    move-result-object p3

    new-instance v2, LB/D$e;

    invoke-direct {v2, p0, p1}, LB/D$e;-><init>(LB/D;I)V

    invoke-direct {v1, p3, v2}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LD/P;Lx7/l;)V

    iput-object v1, p0, LB/D;->q:Landroidx/compose/foundation/lazy/layout/d;

    new-instance p1, LB/D$d;

    invoke-direct {p1, p0}, LB/D$d;-><init>(LB/D;)V

    iput-object p1, p0, LB/D;->r:LB/v;

    new-instance p1, LD/D;

    invoke-direct {p1}, LD/D;-><init>()V

    iput-object p1, p0, LB/D;->s:LD/D;

    invoke-virtual {v0}, LB/B;->b()LD/A;

    const/4 p1, 0x0

    invoke-static {p1, p2, p1}, LD/L;->c(LV/w0;ILy7/k;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LB/D;->t:LV/w0;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p3, p1, v0, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LB/D;->u:LV/w0;

    invoke-static {p3, p1, v0, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LB/D;->v:LV/w0;

    invoke-static {p1, p2, p1}, LD/L;->c(LV/w0;ILy7/k;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LB/D;->w:LV/w0;

    sget-object p1, Ly7/m;->a:Ly7/m;

    invoke-static {p1}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v8, 0x38

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v2

    invoke-static/range {v0 .. v9}, Lu/m;->d(Lu/x0;Ljava/lang/Object;Ljava/lang/Object;JJZILjava/lang/Object;)Lu/l;

    move-result-object p1

    iput-object p1, p0, LB/D;->x:Lu/l;

    return-void
.end method

.method private final H(FLB/q;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, LB/D;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LB/D;->a:LB/x;

    iget-object v1, p0, LB/D;->r:LB/v;

    invoke-interface {v0, v1, p1, p2}, LB/x;->d(LB/v;FLB/q;)V

    :cond_0
    return-void
.end method

.method public static synthetic K(LB/D;IILm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LB/D;->J(IILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private L(Z)V
    .locals 1

    iget-object v0, p0, LB/D;->v:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private M(Z)V
    .locals 1

    iget-object v0, p0, LB/D;->u:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final O(FLY0/e;LW8/N;)V
    .locals 24

    .prologue
    move-object/from16 v1, p0

    move/from16 v0, p1

    invoke-static {}, LB/E;->a()F

    move-result v2

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LY0/e;->B0(F)F

    move-result v2

    cmpg-float v2, v0, v2

    if-gtz v2, :cond_0

    return-void

    :cond_0
    sget-object v2, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {v2}, Lf0/k$a;->d()Lf0/k;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lf0/k;->h()Lx7/l;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v3}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v6

    :try_start_0
    iget-object v7, v1, LB/D;->x:Lu/l;

    invoke-virtual {v7}, Lu/l;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    iget-object v8, v1, LB/D;->x:Lu/l;

    invoke-virtual {v8}, Lu/l;->r()Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v9, v1, LB/D;->x:Lu/l;

    sub-float v10, v7, v0

    const/16 v17, 0x1e

    const/16 v18, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lu/m;->g(Lu/l;FFJJZILjava/lang/Object;)Lu/l;

    move-result-object v0

    iput-object v0, v1, LB/D;->x:Lu/l;

    new-instance v10, LB/D$j;

    invoke-direct {v10, v1, v4}, LB/D$j;-><init>(LB/D;Lm7/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v7 .. v12}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    new-instance v7, Lu/l;

    sget-object v8, Ly7/m;->a:Ly7/m;

    invoke-static {v8}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v14

    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const/16 v22, 0x3c

    const/16 v23, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    move-object v13, v7

    invoke-direct/range {v13 .. v23}, Lu/l;-><init>(Lu/x0;Ljava/lang/Object;Lu/r;JJZILy7/k;)V

    iput-object v7, v1, LB/D;->x:Lu/l;

    new-instance v11, LB/D$k;

    invoke-direct {v11, v1, v4}, LB/D$k;-><init>(LB/D;Lm7/e;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v8, p3

    invoke-static/range {v8 .. v13}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {v2, v3, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-void

    :goto_2
    invoke-virtual {v2, v3, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw v0
.end method

.method public static final synthetic f(LB/D;)LV/w0;
    .locals 0

    iget-object p0, p0, LB/D;->f:LV/w0;

    return-object p0
.end method

.method public static final synthetic g(LB/D;)LB/x;
    .locals 0

    iget-object p0, p0, LB/D;->a:LB/x;

    return-object p0
.end method

.method public static final synthetic h()Le0/j;
    .locals 1

    sget-object v0, LB/D;->z:Le0/j;

    return-object v0
.end method

.method public static final synthetic i(LB/D;)Lu/l;
    .locals 0

    iget-object p0, p0, LB/D;->x:Lu/l;

    return-object p0
.end method

.method public static final synthetic j(LB/D;LD0/Z;)V
    .locals 0

    iput-object p1, p0, LB/D;->l:LD0/Z;

    return-void
.end method

.method public static synthetic l(LB/D;IILm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LB/D;->k(IILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(LB/D;LB/s;ZZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LB/D;->m(LB/s;ZZ)V

    return-void
.end method


# virtual methods
.method public final A()LV/w0;
    .locals 1

    iget-object v0, p0, LB/D;->w:LV/w0;

    return-object v0
.end method

.method public final B()LB/s;
    .locals 1

    iget-object v0, p0, LB/D;->c:LB/s;

    return-object v0
.end method

.method public final C()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    iget-object v0, p0, LB/D;->q:Landroidx/compose/foundation/lazy/layout/d;

    return-object v0
.end method

.method public final D()LD0/Z;
    .locals 1

    iget-object v0, p0, LB/D;->l:LD0/Z;

    return-object v0
.end method

.method public final E()LD0/a0;
    .locals 1

    iget-object v0, p0, LB/D;->m:LD0/a0;

    return-object v0
.end method

.method public final F()F
    .locals 1

    iget-object v0, p0, LB/D;->x:Lu/l;

    invoke-virtual {v0}, Lu/l;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final G()F
    .locals 1

    iget v0, p0, LB/D;->h:F

    return v0
.end method

.method public final I(F)F
    .locals 8

    .prologue
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    invoke-virtual {p0}, LB/D;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    cmpl-float v1, p1, v0

    if-lez v1, :cond_2

    invoke-virtual {p0}, LB/D;->b()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    return v0

    :cond_2
    iget v1, p0, LB/D;->h:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_8

    iget v1, p0, LB/D;->h:F

    add-float/2addr v1, p1

    iput v1, p0, LB/D;->h:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_6

    iget-object v1, p0, LB/D;->f:LV/w0;

    invoke-interface {v1}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB/s;

    iget v3, p0, LB/D;->h:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget-object v5, p0, LB/D;->c:LB/s;

    iget-boolean v6, p0, LB/D;->b:Z

    const/4 v7, 0x1

    xor-int/2addr v6, v7

    invoke-virtual {v1, v4, v6}, LB/s;->v(IZ)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v5, :cond_3

    invoke-virtual {v5, v4, v7}, LB/s;->v(IZ)Z

    move-result v6

    :cond_3
    if-eqz v6, :cond_4

    iget-boolean v4, p0, LB/D;->b:Z

    invoke-virtual {p0, v1, v4, v7}, LB/D;->m(LB/s;ZZ)V

    iget-object v4, p0, LB/D;->w:LV/w0;

    invoke-static {v4}, LD/L;->d(LV/w0;)V

    iget v4, p0, LB/D;->h:F

    sub-float/2addr v3, v4

    :goto_0
    invoke-direct {p0, v3, v1}, LB/D;->H(FLB/q;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, LB/D;->l:LD0/Z;

    if-eqz v1, :cond_5

    invoke-interface {v1}, LD0/Z;->j()V

    :cond_5
    iget v1, p0, LB/D;->h:F

    sub-float/2addr v3, v1

    invoke-virtual {p0}, LB/D;->w()LB/q;

    move-result-object v1

    goto :goto_0

    :cond_6
    :goto_1
    iget v1, p0, LB/D;->h:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_7

    return p1

    :cond_7
    iget v1, p0, LB/D;->h:F

    sub-float/2addr p1, v1

    iput v0, p0, LB/D;->h:F

    return p1

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "entered drag with non-zero pending scroll: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LB/D;->h:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J(IILm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    new-instance v2, LB/D$h;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, p2, v0}, LB/D$h;-><init>(LB/D;IILm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lx/z;->c(Lx/A;Lv/L;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final N(IIZ)V
    .locals 1

    .prologue
    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0}, LB/B;->a()I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0}, LB/B;->c()I

    move-result v0

    if-eq v0, p2, :cond_1

    :cond_0
    iget-object v0, p0, LB/D;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->n()V

    :cond_1
    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0, p1, p2}, LB/B;->d(II)V

    if-eqz p3, :cond_2

    iget-object p1, p0, LB/D;->l:LD0/Z;

    if-eqz p1, :cond_3

    invoke-interface {p1}, LD0/Z;->j()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LB/D;->t:LV/w0;

    invoke-static {p1}, LD/L;->d(LV/w0;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final P(LB/m;I)I
    .locals 1

    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0, p1, p2}, LB/B;->j(LB/m;I)I

    move-result p1

    return p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, LB/D;->i:Lx/A;

    invoke-interface {v0}, Lx/A;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LB/D;->v:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LB/D;->u:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p3, LB/D$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LB/D$g;

    iget v1, v0, LB/D$g;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LB/D$g;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, LB/D$g;

    invoke-direct {v0, p0, p3}, LB/D$g;-><init>(LB/D;Lm7/e;)V

    :goto_0
    iget-object p3, v0, LB/D$g;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LB/D$g;->K:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LB/D$g;->H:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lx7/p;

    iget-object p1, v0, LB/D$g;->G:Ljava/lang/Object;

    check-cast p1, Lv/L;

    iget-object v2, v0, LB/D$g;->F:Ljava/lang/Object;

    check-cast v2, LB/D;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p3, p0, LB/D;->n:LD/b;

    iput-object p0, v0, LB/D$g;->F:Ljava/lang/Object;

    iput-object p1, v0, LB/D$g;->G:Ljava/lang/Object;

    iput-object p2, v0, LB/D$g;->H:Ljava/lang/Object;

    iput v4, v0, LB/D$g;->K:I

    invoke-virtual {p3, v0}, LD/b;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p3, v2, LB/D;->i:Lx/A;

    const/4 v2, 0x0

    iput-object v2, v0, LB/D$g;->F:Ljava/lang/Object;

    iput-object v2, v0, LB/D$g;->G:Ljava/lang/Object;

    iput-object v2, v0, LB/D$g;->H:Ljava/lang/Object;

    iput v3, v0, LB/D$g;->K:I

    invoke-interface {p3, p1, p2, v0}, Lx/A;->d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, LB/D;->i:Lx/A;

    invoke-interface {v0, p1}, Lx/A;->e(F)F

    move-result p1

    return p1
.end method

.method public final k(IILm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, LB/D;->e:LB/f;

    const/16 v3, 0x64

    invoke-virtual {p0}, LB/D;->q()LY0/e;

    move-result-object v4

    move v1, p1

    move v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LD/g;->d(LD/h;IIILY0/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final m(LB/s;ZZ)V
    .locals 3

    .prologue
    if-nez p2, :cond_0

    iget-boolean v0, p0, LB/D;->b:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, LB/D;->c:LB/s;

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    if-eqz p2, :cond_1

    iput-boolean v0, p0, LB/D;->b:Z

    :cond_1
    invoke-virtual {p1}, LB/s;->m()Z

    move-result v1

    invoke-direct {p0, v1}, LB/D;->L(Z)V

    invoke-virtual {p1}, LB/s;->n()Z

    move-result v1

    invoke-direct {p0, v1}, LB/D;->M(Z)V

    iget v1, p0, LB/D;->h:F

    invoke-virtual {p1}, LB/s;->p()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, p0, LB/D;->h:F

    iget-object v1, p0, LB/D;->f:LV/w0;

    invoke-interface {v1, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    if-eqz p3, :cond_2

    iget-object p3, p0, LB/D;->d:LB/B;

    invoke-virtual {p1}, LB/s;->t()I

    move-result v1

    invoke-virtual {p3, v1}, LB/B;->i(I)V

    goto :goto_0

    :cond_2
    iget-object p3, p0, LB/D;->d:LB/B;

    invoke-virtual {p3, p1}, LB/B;->h(LB/s;)V

    iget-boolean p3, p0, LB/D;->k:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, LB/D;->a:LB/x;

    iget-object v1, p0, LB/D;->r:LB/v;

    invoke-interface {p3, v1, p1}, LB/x;->c(LB/v;LB/q;)V

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p1}, LB/s;->u()F

    move-result p2

    invoke-virtual {p1}, LB/s;->r()LY0/e;

    move-result-object p3

    invoke-virtual {p1}, LB/s;->q()LW8/N;

    move-result-object p1

    invoke-direct {p0, p2, p3, p1}, LB/D;->O(FLY0/e;LW8/N;)V

    :cond_4
    iget p1, p0, LB/D;->j:I

    add-int/2addr p1, v0

    iput p1, p0, LB/D;->j:I

    :goto_1
    return-void
.end method

.method public final o()LD/b;
    .locals 1

    iget-object v0, p0, LB/D;->n:LD/b;

    return-object v0
.end method

.method public final p()LD/j;
    .locals 1

    iget-object v0, p0, LB/D;->p:LD/j;

    return-object v0
.end method

.method public final q()LY0/e;
    .locals 1

    iget-object v0, p0, LB/D;->f:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/s;

    invoke-virtual {v0}, LB/s;->r()LY0/e;

    move-result-object v0

    return-object v0
.end method

.method public final r()I
    .locals 1

    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0}, LB/B;->a()I

    move-result v0

    return v0
.end method

.method public final s()I
    .locals 1

    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0}, LB/B;->c()I

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, LB/D;->b:Z

    return v0
.end method

.method public final u()Lz/l;
    .locals 1

    iget-object v0, p0, LB/D;->g:Lz/l;

    return-object v0
.end method

.method public final v()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .locals 1

    iget-object v0, p0, LB/D;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    return-object v0
.end method

.method public final w()LB/q;
    .locals 1

    iget-object v0, p0, LB/D;->f:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/q;

    return-object v0
.end method

.method public final x()LV/w0;
    .locals 1

    iget-object v0, p0, LB/D;->t:LV/w0;

    return-object v0
.end method

.method public final y()LE7/i;
    .locals 1

    iget-object v0, p0, LB/D;->d:LB/B;

    invoke-virtual {v0}, LB/B;->b()LD/A;

    move-result-object v0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE7/i;

    return-object v0
.end method

.method public final z()LD/D;
    .locals 1

    iget-object v0, p0, LB/D;->s:LD/D;

    return-object v0
.end method
