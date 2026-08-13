.class public final LH/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LH/D;

.field private final b:LV/Q0;

.field private final c:Landroidx/compose/ui/platform/s1;

.field private final d:LS0/k;

.field private e:LS0/d0;

.field private final f:LV/w0;

.field private final g:LV/w0;

.field private h:LD0/t;

.field private final i:LV/w0;

.field private j:LM0/d;

.field private final k:LV/w0;

.field private final l:LV/w0;

.field private final m:LV/w0;

.field private final n:LV/w0;

.field private final o:LV/w0;

.field private p:Z

.field private final q:LV/w0;

.field private final r:LH/t;

.field private s:Lx7/l;

.field private final t:Lx7/l;

.field private final u:Lx7/l;

.field private final v:Lo0/N1;

.field private w:J

.field private final x:LV/w0;

.field private final y:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LH/D;LV/Q0;Landroidx/compose/ui/platform/s1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/w;->a:LH/D;

    iput-object p2, p0, LH/w;->b:LV/Q0;

    iput-object p3, p0, LH/w;->c:Landroidx/compose/ui/platform/s1;

    new-instance p1, LS0/k;

    invoke-direct {p1}, LS0/k;-><init>()V

    iput-object p1, p0, LH/w;->d:LS0/k;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->f:LV/w0;

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LY0/i;->m(F)LY0/i;

    move-result-object v1

    invoke-static {v1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->g:LV/w0;

    invoke-static {p2, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->i:LV/w0;

    sget-object v1, LH/l;->C:LH/l;

    invoke-static {v1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->k:LV/w0;

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->l:LV/w0;

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->m:LV/w0;

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v1

    iput-object v1, p0, LH/w;->n:LV/w0;

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LH/w;->o:LV/w0;

    const/4 p1, 0x1

    iput-boolean p1, p0, LH/w;->p:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LH/w;->q:LV/w0;

    new-instance p1, LH/t;

    invoke-direct {p1, p3}, LH/t;-><init>(Landroidx/compose/ui/platform/s1;)V

    iput-object p1, p0, LH/w;->r:LH/t;

    sget-object p1, LH/w$c;->D:LH/w$c;

    iput-object p1, p0, LH/w;->s:Lx7/l;

    new-instance p1, LH/w$b;

    invoke-direct {p1, p0}, LH/w$b;-><init>(LH/w;)V

    iput-object p1, p0, LH/w;->t:Lx7/l;

    new-instance p1, LH/w$a;

    invoke-direct {p1, p0}, LH/w$a;-><init>(LH/w;)V

    iput-object p1, p0, LH/w;->u:Lx7/l;

    invoke-static {}, Lo0/U;->a()Lo0/N1;

    move-result-object p1

    iput-object p1, p0, LH/w;->v:Lo0/N1;

    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->g()J

    move-result-wide v1

    iput-wide v1, p0, LH/w;->w:J

    sget-object p1, LM0/N;->b:LM0/N$a;

    invoke-virtual {p1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->b(J)LM0/N;

    move-result-object p3

    invoke-static {p3, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, LH/w;->x:LV/w0;

    invoke-virtual {p1}, LM0/N$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->b(J)LM0/N;

    move-result-object p1

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LH/w;->y:LV/w0;

    return-void
.end method

.method public static final synthetic a(LH/w;)LH/t;
    .locals 0

    iget-object p0, p0, LH/w;->r:LH/t;

    return-object p0
.end method

.method public static final synthetic b(LH/w;)Lx7/l;
    .locals 0

    iget-object p0, p0, LH/w;->s:Lx7/l;

    return-object p0
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    iget-object v0, p0, LH/w;->y:LV/w0;

    invoke-static {p1, p2}, LM0/N;->b(J)LM0/N;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final B(LH/l;)V
    .locals 1

    iget-object v0, p0, LH/w;->k:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final C(Z)V
    .locals 1

    iget-object v0, p0, LH/w;->f:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final D(Z)V
    .locals 1

    iget-object v0, p0, LH/w;->q:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final E(LS0/d0;)V
    .locals 0

    iput-object p1, p0, LH/w;->e:LS0/d0;

    return-void
.end method

.method public final F(LD0/t;)V
    .locals 0

    iput-object p1, p0, LH/w;->h:LD0/t;

    return-void
.end method

.method public final G(LH/V;)V
    .locals 1

    iget-object v0, p0, LH/w;->i:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LH/w;->p:Z

    return-void
.end method

.method public final H(F)V
    .locals 1

    iget-object v0, p0, LH/w;->g:LV/w0;

    invoke-static {p1}, LY0/i;->m(F)LY0/i;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final I(J)V
    .locals 1

    iget-object v0, p0, LH/w;->x:LV/w0;

    invoke-static {p1, p2}, LM0/N;->b(J)LM0/N;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final J(Z)V
    .locals 1

    iget-object v0, p0, LH/w;->o:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final K(Z)V
    .locals 1

    iget-object v0, p0, LH/w;->l:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final L(Z)V
    .locals 1

    iget-object v0, p0, LH/w;->n:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final M(Z)V
    .locals 1

    iget-object v0, p0, LH/w;->m:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final N(LM0/d;LM0/d;LM0/P;ZLY0/e;LR0/h$b;Lx7/l;LH/u;Lm0/f;J)V
    .locals 13

    .prologue
    move-object v0, p0

    move-object/from16 v1, p7

    iput-object v1, v0, LH/w;->s:Lx7/l;

    move-wide/from16 v1, p10

    iput-wide v1, v0, LH/w;->w:J

    iget-object v1, v0, LH/w;->r:LH/t;

    move-object/from16 v2, p8

    invoke-virtual {v1, v2}, LH/t;->f(LH/u;)V

    move-object/from16 v2, p9

    invoke-virtual {v1, v2}, LH/t;->e(Lm0/f;)V

    move-object v1, p1

    iput-object v1, v0, LH/w;->j:LM0/d;

    iget-object v1, v0, LH/w;->a:LH/D;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v10

    const/16 v11, 0x1c0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p4

    invoke-static/range {v1 .. v12}, LH/E;->c(LH/D;LM0/d;LM0/P;LY0/e;LR0/h$b;ZIIILjava/util/List;ILjava/lang/Object;)LH/D;

    move-result-object v1

    iget-object v2, v0, LH/w;->a:LH/D;

    if-eq v2, v1, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v0, LH/w;->p:Z

    :cond_0
    iput-object v1, v0, LH/w;->a:LH/D;

    return-void
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, LH/w;->y:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/N;

    invoke-virtual {v0}, LM0/N;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()LH/l;
    .locals 1

    iget-object v0, p0, LH/w;->k:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH/l;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, LH/w;->f:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final f()Lo0/N1;
    .locals 1

    iget-object v0, p0, LH/w;->v:Lo0/N1;

    return-object v0
.end method

.method public final g()LS0/d0;
    .locals 1

    iget-object v0, p0, LH/w;->e:LS0/d0;

    return-object v0
.end method

.method public final h()Landroidx/compose/ui/platform/s1;
    .locals 1

    iget-object v0, p0, LH/w;->c:Landroidx/compose/ui/platform/s1;

    return-object v0
.end method

.method public final i()LD0/t;
    .locals 3

    .prologue
    iget-object v0, p0, LH/w;->h:LD0/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final j()LH/V;
    .locals 1

    iget-object v0, p0, LH/w;->i:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH/V;

    return-object v0
.end method

.method public final k()F
    .locals 1

    iget-object v0, p0, LH/w;->g:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/i;

    invoke-virtual {v0}, LY0/i;->v()F

    move-result v0

    return v0
.end method

.method public final l()Lx7/l;
    .locals 1

    iget-object v0, p0, LH/w;->u:Lx7/l;

    return-object v0
.end method

.method public final m()Lx7/l;
    .locals 1

    iget-object v0, p0, LH/w;->t:Lx7/l;

    return-object v0
.end method

.method public final n()LS0/k;
    .locals 1

    iget-object v0, p0, LH/w;->d:LS0/k;

    return-object v0
.end method

.method public final o()LV/Q0;
    .locals 1

    iget-object v0, p0, LH/w;->b:LV/Q0;

    return-object v0
.end method

.method public final p()J
    .locals 2

    iget-wide v0, p0, LH/w;->w:J

    return-wide v0
.end method

.method public final q()J
    .locals 2

    iget-object v0, p0, LH/w;->x:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/N;

    invoke-virtual {v0}, LM0/N;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, LH/w;->o:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, LH/w;->l:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, LH/w;->n:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, LH/w;->m:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final v()LH/D;
    .locals 1

    iget-object v0, p0, LH/w;->a:LH/D;

    return-object v0
.end method

.method public final w()LM0/d;
    .locals 1

    iget-object v0, p0, LH/w;->j:LM0/d;

    return-object v0
.end method

.method public final x()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LH/w;->q()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LH/w;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, LM0/N;->h(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final y()Z
    .locals 1

    iget-object v0, p0, LH/w;->q:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, LH/w;->p:Z

    return v0
.end method
