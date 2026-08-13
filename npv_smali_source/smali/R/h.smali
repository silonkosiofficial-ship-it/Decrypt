.class public final LR/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ln0/g;

.field private final b:F

.field private final c:Z

.field private d:Ljava/lang/Float;

.field private e:Ln0/g;

.field private final f:Lu/a;

.field private final g:Lu/a;

.field private final h:Lu/a;

.field private final i:LW8/v;

.field private final j:LV/w0;

.field private final k:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ln0/g;FZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR/h;->a:Ln0/g;

    iput p2, p0, LR/h;->b:F

    iput-boolean p3, p0, LR/h;->c:Z

    const/4 p1, 0x0

    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-static {p1, p1, p2, p3}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object v0

    iput-object v0, p0, LR/h;->f:Lu/a;

    invoke-static {p1, p1, p2, p3}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object v0

    iput-object v0, p0, LR/h;->g:Lu/a;

    invoke-static {p1, p1, p2, p3}, Lu/b;->b(FFILjava/lang/Object;)Lu/a;

    move-result-object p1

    iput-object p1, p0, LR/h;->h:Lu/a;

    invoke-static {p3}, LW8/x;->a(LW8/z0;)LW8/v;

    move-result-object p1

    iput-object p1, p0, LR/h;->i:LW8/v;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p3, p2, p3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, LR/h;->j:LV/w0;

    invoke-static {p1, p3, p2, p3}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LR/h;->k:LV/w0;

    return-void
.end method

.method public synthetic constructor <init>(Ln0/g;FZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LR/h;-><init>(Ln0/g;FZ)V

    return-void
.end method

.method public static final synthetic a(LR/h;)Lu/a;
    .locals 0

    iget-object p0, p0, LR/h;->f:Lu/a;

    return-object p0
.end method

.method public static final synthetic b(LR/h;)Lu/a;
    .locals 0

    iget-object p0, p0, LR/h;->h:Lu/a;

    return-object p0
.end method

.method public static final synthetic c(LR/h;)Lu/a;
    .locals 0

    iget-object p0, p0, LR/h;->g:Lu/a;

    return-object p0
.end method

.method private final f(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, LR/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LR/h$b;-><init>(LR/h;Lm7/e;)V

    invoke-static {v0, p1}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final g(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, LR/h$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LR/h$c;-><init>(LR/h;Lm7/e;)V

    invoke-static {v0, p1}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method private final i()Z
    .locals 1

    iget-object v0, p0, LR/h;->k:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final j()Z
    .locals 1

    iget-object v0, p0, LR/h;->j:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final k(Z)V
    .locals 1

    iget-object v0, p0, LR/h;->k:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final l(Z)V
    .locals 1

    iget-object v0, p0, LR/h;->j:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d(Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p1, LR/h$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LR/h$a;

    iget v1, v0, LR/h$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LR/h$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LR/h$a;

    invoke-direct {v0, p0, p1}, LR/h$a;-><init>(LR/h;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LR/h$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LR/h$a;->I:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LR/h$a;->F:Ljava/lang/Object;

    check-cast v2, LR/h;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v2, v0, LR/h$a;->F:Ljava/lang/Object;

    check-cast v2, LR/h;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iput-object p0, v0, LR/h$a;->F:Ljava/lang/Object;

    iput v5, v0, LR/h$a;->I:I

    invoke-direct {p0, v0}, LR/h;->f(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    invoke-direct {v2, v5}, LR/h;->l(Z)V

    iget-object p1, v2, LR/h;->i:LW8/v;

    iput-object v2, v0, LR/h$a;->F:Ljava/lang/Object;

    iput v4, v0, LR/h$a;->I:I

    invoke-interface {p1, v0}, LW8/V;->d1(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    const/4 p1, 0x0

    iput-object p1, v0, LR/h$a;->F:Ljava/lang/Object;

    iput v3, v0, LR/h$a;->I:I

    invoke-direct {v2, v0}, LR/h;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final e(Lq0/g;J)V
    .locals 19

    .prologue
    move-object/from16 v1, p0

    iget-object v0, v1, LR/h;->d:Ljava/lang/Float;

    if-nez v0, :cond_0

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, LR/i;->b(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, v1, LR/h;->d:Ljava/lang/Float;

    :cond_0
    iget-object v0, v1, LR/h;->a:Ln0/g;

    if-nez v0, :cond_1

    invoke-interface/range {p1 .. p1}, Lq0/g;->W0()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    iput-object v0, v1, LR/h;->a:Ln0/g;

    :cond_1
    iget-object v0, v1, LR/h;->e:Ln0/g;

    if-nez v0, :cond_2

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/m;->g(J)F

    move-result v3

    div-float/2addr v3, v2

    invoke-static {v0, v3}, Ln0/h;->a(FF)J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    iput-object v0, v1, LR/h;->e:Ln0/g;

    :cond_2
    invoke-direct/range {p0 .. p0}, LR/h;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct/range {p0 .. p0}, LR/h;->j()Z

    move-result v0

    if-nez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_3
    iget-object v0, v1, LR/h;->f:Lu/a;

    invoke-virtual {v0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    :goto_0
    iget-object v2, v1, LR/h;->d:Ljava/lang/Float;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget v3, v1, LR/h;->b:F

    iget-object v4, v1, LR/h;->g:Lu/a;

    invoke-virtual {v4}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v2, v3, v4}, La1/b;->b(FFF)F

    move-result v8

    iget-object v2, v1, LR/h;->a:Ln0/g;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln0/g;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/g;->m(J)F

    move-result v2

    iget-object v3, v1, LR/h;->e:Ln0/g;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ln0/g;->v()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->m(J)F

    move-result v3

    iget-object v4, v1, LR/h;->h:Lu/a;

    invoke-virtual {v4}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v2, v3, v4}, La1/b;->b(FFF)F

    move-result v2

    iget-object v3, v1, LR/h;->a:Ln0/g;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ln0/g;->v()J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v3

    iget-object v4, v1, LR/h;->e:Ln0/g;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln0/g;->v()J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/g;->n(J)F

    move-result v4

    iget-object v5, v1, LR/h;->h:Lu/a;

    invoke-virtual {v5}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v3, v4, v5}, La1/b;->b(FFF)F

    move-result v3

    invoke-static {v2, v3}, Ln0/h;->a(FF)J

    move-result-wide v9

    invoke-static/range {p2 .. p3}, Lo0/y0;->p(J)F

    move-result v2

    mul-float v13, v2, v0

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 v11, p2

    invoke-static/range {v11 .. v18}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    iget-boolean v0, v1, LR/h;->c:Z

    if-eqz v0, :cond_4

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v14

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v15

    sget-object v0, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {v0}, Lo0/x0$a;->b()I

    move-result v16

    invoke-interface/range {p1 .. p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2}, Lq0/d;->i()J

    move-result-wide v3

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v2}, Lq0/d;->c()Lq0/j;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-interface/range {v11 .. v16}, Lq0/j;->c(FFFFI)V

    const/16 v15, 0x78

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v16}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v2, v3, v4}, Lq0/d;->d(J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Lq0/d;->h()Lo0/q0;

    move-result-object v5

    invoke-interface {v5}, Lo0/q0;->s()V

    invoke-interface {v2, v3, v4}, Lq0/d;->d(J)V

    throw v0

    :cond_4
    const/16 v15, 0x78

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v16}, Lq0/f;->e(Lq0/g;JFJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final h()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LR/h;->k(Z)V

    iget-object v0, p0, LR/h;->i:LW8/v;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {v0, v1}, LW8/v;->R0(Ljava/lang/Object;)Z

    return-void
.end method
