.class public final Lu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lu/x0;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/String;

.field private final d:Lu/l;

.field private final e:LV/w0;

.field private final f:LV/w0;

.field private final g:Lu/d0;

.field private final h:Lu/l0;

.field private final i:Lu/r;

.field private final j:Lu/r;

.field private k:Lu/r;

.field private l:Lu/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 11

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu/a;->a:Lu/x0;

    iput-object p3, p0, Lu/a;->b:Ljava/lang/Object;

    iput-object p4, p0, Lu/a;->c:Ljava/lang/String;

    new-instance p4, Lu/l;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object v0, p4

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v0 .. v10}, Lu/l;-><init>(Lu/x0;Ljava/lang/Object;Lu/r;JJZILy7/k;)V

    iput-object p4, p0, Lu/a;->d:Lu/l;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p4, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p4, v0, p4}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p2

    iput-object p2, p0, Lu/a;->e:LV/w0;

    invoke-static {p1, p4, v0, p4}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lu/a;->f:LV/w0;

    new-instance p1, Lu/d0;

    invoke-direct {p1}, Lu/d0;-><init>()V

    iput-object p1, p0, Lu/a;->g:Lu/d0;

    new-instance p1, Lu/l0;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lu/l0;-><init>(FFLjava/lang/Object;ILy7/k;)V

    iput-object p1, p0, Lu/a;->h:Lu/l0;

    invoke-virtual {p0}, Lu/a;->o()Lu/r;

    move-result-object p1

    instance-of p2, p1, Lu/n;

    if-eqz p2, :cond_0

    invoke-static {}, Lu/b;->c()Lu/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lu/o;

    if-eqz p2, :cond_1

    invoke-static {}, Lu/b;->d()Lu/o;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lu/p;

    if-eqz p1, :cond_2

    invoke-static {}, Lu/b;->e()Lu/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lu/b;->f()Lu/q;

    move-result-object p1

    :goto_0
    const-string p2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu/a;->i:Lu/r;

    invoke-virtual {p0}, Lu/a;->o()Lu/r;

    move-result-object p3

    instance-of p4, p3, Lu/n;

    if-eqz p4, :cond_3

    invoke-static {}, Lu/b;->g()Lu/n;

    move-result-object p3

    goto :goto_1

    :cond_3
    instance-of p4, p3, Lu/o;

    if-eqz p4, :cond_4

    invoke-static {}, Lu/b;->h()Lu/o;

    move-result-object p3

    goto :goto_1

    :cond_4
    instance-of p3, p3, Lu/p;

    if-eqz p3, :cond_5

    invoke-static {}, Lu/b;->i()Lu/p;

    move-result-object p3

    goto :goto_1

    :cond_5
    invoke-static {}, Lu/b;->j()Lu/q;

    move-result-object p3

    :goto_1
    invoke-static {p3, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lu/a;->j:Lu/r;

    iput-object p1, p0, Lu/a;->k:Lu/r;

    iput-object p3, p0, Lu/a;->l:Lu/r;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const-string p4, "Animatable"

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lu/a;-><init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Lu/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lu/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lu/a;)V
    .locals 0

    invoke-direct {p0}, Lu/a;->i()V

    return-void
.end method

.method public static final synthetic c(Lu/a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lu/a;->q(Z)V

    return-void
.end method

.method public static final synthetic d(Lu/a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lu/a;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lu/a;Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    iget-object p2, p0, Lu/a;->h:Lu/l0;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lu/a;->n()Ljava/lang/Object;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lu/a;->e(Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Lu/a;->k:Lu/r;

    iget-object v1, p0, Lu/a;->i:Lu/r;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu/a;->l:Lu/r;

    iget-object v1, p0, Lu/a;->j:Lu/r;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lu/a;->a:Lu/x0;

    invoke-interface {v0}, Lu/x0;->a()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/r;

    invoke-virtual {v0}, Lu/r;->b()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {v0, v2}, Lu/r;->a(I)F

    move-result v4

    iget-object v5, p0, Lu/a;->k:Lu/r;

    invoke-virtual {v5, v2}, Lu/r;->a(I)F

    move-result v5

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_1

    invoke-virtual {v0, v2}, Lu/r;->a(I)F

    move-result v4

    iget-object v5, p0, Lu/a;->l:Lu/r;

    invoke-virtual {v5, v2}, Lu/r;->a(I)F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_2

    :cond_1
    invoke-virtual {v0, v2}, Lu/r;->a(I)F

    move-result v3

    iget-object v4, p0, Lu/a;->k:Lu/r;

    invoke-virtual {v4, v2}, Lu/r;->a(I)F

    move-result v4

    iget-object v5, p0, Lu/a;->l:Lu/r;

    invoke-virtual {v5, v2}, Lu/r;->a(I)F

    move-result v5

    invoke-static {v3, v4, v5}, LE7/j;->j(FFF)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lu/r;->e(IF)V

    const/4 v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    iget-object p1, p0, Lu/a;->a:Lu/x0;

    invoke-interface {p1}, Lu/x0;->b()Lx7/l;

    move-result-object p1

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method private final i()V
    .locals 3

    iget-object v0, p0, Lu/a;->d:Lu/l;

    invoke-virtual {v0}, Lu/l;->q()Lu/r;

    move-result-object v1

    invoke-virtual {v1}, Lu/r;->d()V

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lu/l;->t(J)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu/a;->q(Z)V

    return-void
.end method

.method private final p(Lu/e;Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 15

    move-object v8, p0

    iget-object v0, v8, Lu/a;->d:Lu/l;

    invoke-virtual {v0}, Lu/l;->g()J

    move-result-wide v4

    iget-object v9, v8, Lu/a;->g:Lu/d0;

    new-instance v11, Lu/a$a;

    const/4 v7, 0x0

    move-object v0, v11

    move-object v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v7}, Lu/a$a;-><init>(Lu/a;Ljava/lang/Object;Lu/e;JLx7/l;Lm7/e;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object/from16 v12, p4

    invoke-static/range {v9 .. v14}, Lu/d0;->e(Lu/d0;Lu/a0;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final q(Z)V
    .locals 1

    iget-object v0, p0, Lu/a;->e:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final r(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu/a;->f:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lu/j;Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lu/a;->a:Lu/x0;

    invoke-static {p2, v1, v0, p1, p3}, Lu/g;->a(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu/r0;

    move-result-object p1

    invoke-direct {p0, p1, p3, p4, p5}, Lu/a;->p(Lu/e;Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g()LV/G1;
    .locals 1

    iget-object v0, p0, Lu/a;->d:Lu/l;

    return-object v0
.end method

.method public final j()Lu/l;
    .locals 1

    iget-object v0, p0, Lu/a;->d:Lu/l;

    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/a;->f:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lu/x0;
    .locals 1

    iget-object v0, p0, Lu/a;->a:Lu/x0;

    return-object v0
.end method

.method public final m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/a;->d:Lu/l;

    invoke-virtual {v0}, Lu/l;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu/a;->a:Lu/x0;

    invoke-interface {v0}, Lu/x0;->b()Lx7/l;

    move-result-object v0

    invoke-virtual {p0}, Lu/a;->o()Lu/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lu/r;
    .locals 1

    iget-object v0, p0, Lu/a;->d:Lu/l;

    invoke-virtual {v0}, Lu/l;->q()Lu/r;

    move-result-object v0

    return-object v0
.end method

.method public final s(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Lu/a;->g:Lu/d0;

    new-instance v2, Lu/a$b;

    const/4 v1, 0x0

    invoke-direct {v2, p0, p1, v1}, Lu/a$b;-><init>(Lu/a;Ljava/lang/Object;Lm7/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lu/d0;->e(Lu/d0;Lu/a0;Lx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
