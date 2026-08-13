.class public final Lv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/T;


# instance fields
.field private a:Ln0/g;

.field private final b:Lv/w;

.field private final c:LV/w0;

.field private d:Z

.field private e:Z

.field private f:J

.field private g:Lz0/A;

.field private final h:Landroidx/compose/ui/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lv/Q;)V
    .locals 4

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv/w;

    invoke-virtual {p2}, Lv/Q;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo0/A0;->k(J)I

    move-result v1

    invoke-direct {v0, p1, v1}, Lv/w;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lv/a;->b:Lv/w;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-static {}, LV/v1;->j()LV/u1;

    move-result-object v1

    invoke-static {p1, v1}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object v1

    iput-object v1, p0, Lv/a;->c:LV/w0;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lv/a;->d:Z

    sget-object v1, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v1}, Ln0/m$a;->b()J

    move-result-wide v1

    iput-wide v1, p0, Lv/a;->f:J

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v2, Lv/a$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lv/a$b;-><init>(Lv/a;Lm7/e;)V

    invoke-static {v1, p1, v2}, Lz0/U;->d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;

    move-result-object p1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_1

    new-instance p2, Lv/u;

    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lv/a$c;

    invoke-direct {v1, p0}, Lv/a$c;-><init>(Lv/a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v1

    :goto_0
    invoke-direct {p2, p0, v0, v1}, Lv/u;-><init>(Lv/a;Lv/w;Lx7/l;)V

    goto :goto_2

    :cond_1
    new-instance v1, Lv/o;

    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lv/a$d;

    invoke-direct {v2, p0}, Lv/a$d;-><init>(Lv/a;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v2

    :goto_1
    invoke-direct {v1, p0, v0, p2, v2}, Lv/o;-><init>(Lv/a;Lv/w;Lv/Q;Lx7/l;)V

    move-object p2, v1

    :goto_2
    invoke-interface {p1, p2}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    iput-object p1, p0, Lv/a;->h:Landroidx/compose/ui/d;

    return-void
.end method

.method public static final synthetic e(Lv/a;)Lz0/A;
    .locals 0

    iget-object p0, p0, Lv/a;->g:Lz0/A;

    return-object p0
.end method

.method public static final synthetic f(Lv/a;Lz0/A;)V
    .locals 0

    iput-object p1, p0, Lv/a;->g:Lz0/A;

    return-void
.end method

.method public static final synthetic g(Lv/a;Ln0/g;)V
    .locals 0

    iput-object p1, p0, Lv/a;->a:Ln0/g;

    return-void
.end method

.method private final h()V
    .locals 5

    .prologue
    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-static {v0}, Lv/w;->d(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v0}, Lv/w;->a(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v4

    :cond_3
    :goto_2
    invoke-static {v0}, Lv/w;->b(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v3

    if-nez v3, :cond_5

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move v1, v2

    goto :goto_4

    :cond_5
    :goto_3
    move v1, v4

    :cond_6
    :goto_4
    invoke-static {v0}, Lv/w;->c(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz v1, :cond_8

    :cond_7
    move v2, v4

    :cond_8
    move v1, v2

    :cond_9
    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lv/a;->k()V

    :cond_a
    return-void
.end method

.method private final l(J)F
    .locals 6

    .prologue
    invoke-virtual {p0}, Lv/a;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    iget-wide v2, p0, Lv/a;->f:J

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v2

    sget-object v3, Lv/v;->a:Lv/v;

    neg-float v1, v1

    const/4 v4, 0x1

    int-to-float v4, v4

    sub-float/2addr v4, v0

    invoke-virtual {v3, v2, v1, v4}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    move-result v0

    neg-float v0, v0

    iget-wide v4, p0, Lv/a;->f:J

    invoke-static {v4, v5}, Ln0/m;->g(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {v3, v2}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v0

    :goto_0
    return v0
.end method

.method private final m(J)F
    .locals 6

    .prologue
    invoke-virtual {p0}, Lv/a;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    iget-wide v2, p0, Lv/a;->f:J

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v2

    sget-object v3, Lv/v;->a:Lv/v;

    const/4 v4, 0x1

    int-to-float v4, v4

    sub-float/2addr v4, v0

    invoke-virtual {v3, v2, v1, v4}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    move-result v0

    iget-wide v4, p0, Lv/a;->f:J

    invoke-static {v4, v5}, Ln0/m;->i(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {v3, v2}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    :goto_0
    return v0
.end method

.method private final n(J)F
    .locals 6

    .prologue
    invoke-virtual {p0}, Lv/a;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    iget-wide v2, p0, Lv/a;->f:J

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v2

    sget-object v3, Lv/v;->a:Lv/v;

    neg-float v1, v1

    invoke-virtual {v3, v2, v1, v0}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    move-result v0

    neg-float v0, v0

    iget-wide v4, p0, Lv/a;->f:J

    invoke-static {v4, v5}, Ln0/m;->i(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {v3, v2}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    :goto_0
    return v0
.end method

.method private final o(J)F
    .locals 6

    .prologue
    invoke-virtual {p0}, Lv/a;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    iget-wide v2, p0, Lv/a;->f:J

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v2

    sget-object v3, Lv/v;->a:Lv/v;

    invoke-virtual {v3, v2, v1, v0}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    move-result v0

    iget-wide v4, p0, Lv/a;->f:J

    invoke-static {v4, v5}, Ln0/m;->g(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {v3, v2}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v0

    :goto_0
    return v0
.end method

.method private final p(J)Z
    .locals 7

    .prologue
    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->r()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    sget-object v0, Lv/v;->a:Lv/v;

    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v5

    invoke-virtual {v0, v4, v5}, Lv/v;->e(Landroid/widget/EdgeEffect;F)V

    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->r()Z

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->u()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v4

    cmpl-float v4, v4, v2

    if-lez v4, :cond_3

    sget-object v4, Lv/v;->a:Lv/v;

    iget-object v5, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v5}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v5

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v6

    invoke-virtual {v4, v5, v6}, Lv/v;->e(Landroid/widget/EdgeEffect;F)V

    if-nez v0, :cond_2

    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->u()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v1

    :cond_3
    :goto_2
    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->y()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v4

    cmpg-float v4, v4, v2

    if-gez v4, :cond_6

    sget-object v4, Lv/v;->a:Lv/v;

    iget-object v5, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v5}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v5

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v6

    invoke-virtual {v4, v5, v6}, Lv/v;->e(Landroid/widget/EdgeEffect;F)V

    if-nez v0, :cond_5

    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->y()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move v0, v3

    goto :goto_4

    :cond_5
    :goto_3
    move v0, v1

    :cond_6
    :goto_4
    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->o()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v4

    cmpl-float v2, v4, v2

    if-lez v2, :cond_9

    sget-object v2, Lv/v;->a:Lv/v;

    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-virtual {v2, v4, p1}, Lv/v;->e(Landroid/widget/EdgeEffect;F)V

    if-nez v0, :cond_8

    iget-object p1, p0, Lv/a;->b:Lv/w;

    invoke-virtual {p1}, Lv/w;->o()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    move v1, v3

    :cond_8
    :goto_5
    move v0, v1

    :cond_9
    return v0
.end method

.method private final q()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->t()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lv/a;->m(J)F

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->w()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lv/a;->n(J)F

    move v0, v1

    :cond_1
    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->A()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lv/a;->o(J)F

    move v0, v1

    :cond_2
    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->q()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lv/a;->l(J)F

    goto :goto_1

    :cond_3
    move v1, v0

    :goto_1
    return v1
.end method


# virtual methods
.method public a(JILx7/l;)J
    .locals 10

    .prologue
    iget-wide v0, p0, Lv/a;->f:J

    invoke-static {v0, v1}, Ln0/m;->k(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-interface {p4, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide p1

    return-wide p1

    :cond_0
    iget-boolean v0, p0, Lv/a;->e:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0}, Lv/a;->q()Z

    iput-boolean v1, p0, Lv/a;->e:Z

    :cond_1
    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v0

    const/4 v2, 0x0

    cmpg-float v0, v0, v2

    if-nez v0, :cond_3

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->A()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, p2}, Lv/a;->o(J)F

    move-result v0

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->A()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v3

    :goto_0
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Lv/a;->l(J)F

    move-result v0

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->q()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v3

    goto :goto_0

    :cond_5
    :goto_1
    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v3

    cmpg-float v3, v3, v2

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->t()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-direct {p0, p1, p2}, Lv/a;->m(J)F

    move-result v2

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->t()Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v3

    :goto_2
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_3

    :cond_7
    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->w()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-direct {p0, p1, p2}, Lv/a;->n(J)F

    move-result v2

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->w()Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v3}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v3

    goto :goto_2

    :cond_8
    :goto_3
    invoke-static {v2, v0}, Ln0/h;->a(FF)J

    move-result-wide v2

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ln0/g;->j(JJ)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lv/a;->k()V

    :cond_9
    invoke-static {p1, p2, v2, v3}, Ln0/g;->q(JJ)J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-interface {p4, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ln0/g;

    invoke-virtual {p4}, Ln0/g;->v()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ln0/g;->q(JJ)J

    move-result-wide v4

    sget-object p4, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {p4}, Ly0/f$a;->b()I

    move-result p4

    invoke-static {p3, p4}, Ly0/f;->d(II)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_10

    invoke-static {v4, v5}, Ln0/g;->m(J)F

    move-result p3

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float p3, p3, v0

    const/high16 v8, -0x41000000    # -0.5f

    if-lez p3, :cond_a

    invoke-direct {p0, v4, v5}, Lv/a;->m(J)F

    :goto_4
    move p3, v1

    goto :goto_5

    :cond_a
    invoke-static {v4, v5}, Ln0/g;->m(J)F

    move-result p3

    cmpg-float p3, p3, v8

    if-gez p3, :cond_b

    invoke-direct {p0, v4, v5}, Lv/a;->n(J)F

    goto :goto_4

    :cond_b
    move p3, p4

    :goto_5
    invoke-static {v4, v5}, Ln0/g;->n(J)F

    move-result v9

    cmpl-float v0, v9, v0

    if-lez v0, :cond_c

    invoke-direct {p0, v4, v5}, Lv/a;->o(J)F

    :goto_6
    move v0, v1

    goto :goto_7

    :cond_c
    invoke-static {v4, v5}, Ln0/g;->n(J)F

    move-result v0

    cmpg-float v0, v0, v8

    if-gez v0, :cond_d

    invoke-direct {p0, v4, v5}, Lv/a;->l(J)F

    goto :goto_6

    :cond_d
    move v0, p4

    :goto_7
    if-nez p3, :cond_f

    if-eqz v0, :cond_e

    goto :goto_8

    :cond_e
    move v1, p4

    :cond_f
    :goto_8
    move p4, v1

    :cond_10
    invoke-direct {p0, p1, p2}, Lv/a;->p(J)Z

    move-result p1

    if-nez p1, :cond_11

    if-eqz p4, :cond_12

    :cond_11
    invoke-virtual {p0}, Lv/a;->k()V

    :cond_12
    invoke-static {v2, v3, v6, v7}, Ln0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p4, Lv/a$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lv/a$a;

    iget v1, v0, Lv/a$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/a$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/a$a;

    invoke-direct {v0, p0, p4}, Lv/a$a;-><init>(Lv/a;Lm7/e;)V

    :goto_0
    iget-object p4, v0, Lv/a$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lv/a$a;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lv/a$a;->G:J

    iget-object p3, v0, Lv/a$a;->F:Ljava/lang/Object;

    check-cast p3, Lv/a;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    iget-wide v6, p0, Lv/a;->f:J

    invoke-static {v6, v7}, Ln0/m;->k(J)Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    iput v4, v0, Lv/a$a;->J:I

    invoke-interface {p3, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_5
    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result p4

    cmpl-float p4, p4, v5

    if-lez p4, :cond_6

    iget-object p4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {p4}, Lv/w;->t()Z

    move-result p4

    if-eqz p4, :cond_6

    sget-object p4, Lv/v;->a:Lv/v;

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result v4

    invoke-static {v4}, LA7/a;->d(F)I

    move-result v4

    :goto_2
    invoke-virtual {p4, v2, v4}, Lv/v;->c(Landroid/widget/EdgeEffect;I)V

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result p4

    goto :goto_3

    :cond_6
    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result p4

    cmpg-float p4, p4, v5

    if-gez p4, :cond_7

    iget-object p4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {p4}, Lv/w;->w()Z

    move-result p4

    if-eqz p4, :cond_7

    sget-object p4, Lv/v;->a:Lv/v;

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result v4

    invoke-static {v4}, LA7/a;->d(F)I

    move-result v4

    neg-int v4, v4

    goto :goto_2

    :cond_7
    move p4, v5

    :goto_3
    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v2

    cmpl-float v2, v2, v5

    if-lez v2, :cond_8

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->A()Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Lv/v;->a:Lv/v;

    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v6

    invoke-static {v6}, LA7/a;->d(F)I

    move-result v6

    :goto_4
    invoke-virtual {v2, v4, v6}, Lv/v;->c(Landroid/widget/EdgeEffect;I)V

    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v2

    goto :goto_5

    :cond_8
    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_9

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v2}, Lv/w;->q()Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lv/v;->a:Lv/v;

    iget-object v4, p0, Lv/a;->b:Lv/w;

    invoke-virtual {v4}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v6

    invoke-static {v6}, LA7/a;->d(F)I

    move-result v6

    neg-int v6, v6

    goto :goto_4

    :cond_9
    move v2, v5

    :goto_5
    invoke-static {p4, v2}, LY0/B;->a(FF)J

    move-result-wide v6

    sget-object p4, LY0/A;->b:LY0/A$a;

    invoke-virtual {p4}, LY0/A$a;->a()J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, LY0/A;->g(JJ)Z

    move-result p4

    if-nez p4, :cond_a

    invoke-virtual {p0}, Lv/a;->k()V

    :cond_a
    invoke-static {p1, p2, v6, v7}, LY0/A;->k(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p4

    iput-object p0, v0, Lv/a$a;->F:Ljava/lang/Object;

    iput-wide p1, v0, Lv/a$a;->G:J

    iput v3, v0, Lv/a$a;->J:I

    invoke-interface {p3, p4, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_b

    return-object v1

    :cond_b
    move-object p3, p0

    :goto_6
    check-cast p4, LY0/A;

    invoke-virtual {p4}, LY0/A;->o()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/A;->k(JJ)J

    move-result-wide p1

    const/4 p4, 0x0

    iput-boolean p4, p3, Lv/a;->e:Z

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result p4

    cmpl-float p4, p4, v5

    if-lez p4, :cond_c

    sget-object p4, Lv/v;->a:Lv/v;

    iget-object v0, p3, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v0

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result v1

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v1

    :goto_7
    invoke-virtual {p4, v0, v1}, Lv/v;->c(Landroid/widget/EdgeEffect;I)V

    goto :goto_8

    :cond_c
    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result p4

    cmpg-float p4, p4, v5

    if-gez p4, :cond_d

    sget-object p4, Lv/v;->a:Lv/v;

    iget-object v0, p3, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v0

    invoke-static {p1, p2}, LY0/A;->h(J)F

    move-result v1

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v1

    neg-int v1, v1

    goto :goto_7

    :cond_d
    :goto_8
    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result p4

    cmpl-float p4, p4, v5

    if-lez p4, :cond_e

    sget-object p4, Lv/v;->a:Lv/v;

    iget-object v0, p3, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v0

    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v1

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v1

    :goto_9
    invoke-virtual {p4, v0, v1}, Lv/v;->c(Landroid/widget/EdgeEffect;I)V

    goto :goto_a

    :cond_e
    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result p4

    cmpg-float p4, p4, v5

    if-gez p4, :cond_f

    sget-object p4, Lv/v;->a:Lv/v;

    iget-object v0, p3, Lv/a;->b:Lv/w;

    invoke-virtual {v0}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v0

    invoke-static {p1, p2}, LY0/A;->i(J)F

    move-result v1

    invoke-static {v1}, LA7/a;->d(F)I

    move-result v1

    neg-int v1, v1

    goto :goto_9

    :cond_f
    :goto_a
    sget-object p4, LY0/A;->b:LY0/A$a;

    invoke-virtual {p4}, LY0/A$a;->a()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, LY0/A;->g(JJ)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p3}, Lv/a;->k()V

    :cond_10
    invoke-direct {p3}, Lv/a;->h()V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public c()Landroidx/compose/ui/d;
    .locals 1

    iget-object v0, p0, Lv/a;->h:Landroidx/compose/ui/d;

    return-object v0
.end method

.method public d()Z
    .locals 5

    .prologue
    iget-object v0, p0, Lv/a;->b:Lv/w;

    invoke-static {v0}, Lv/w;->d(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    sget-object v4, Lv/v;->a:Lv/v;

    invoke-virtual {v4, v1}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    cmpg-float v1, v1, v3

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    invoke-static {v0}, Lv/w;->a(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v4, Lv/v;->a:Lv/v;

    invoke-virtual {v4, v1}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    cmpg-float v1, v1, v3

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    :goto_1
    invoke-static {v0}, Lv/w;->b(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v1

    if-eqz v1, :cond_5

    sget-object v4, Lv/v;->a:Lv/v;

    invoke-virtual {v4, v1}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v1

    cmpg-float v1, v1, v3

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    return v2

    :cond_5
    :goto_2
    invoke-static {v0}, Lv/w;->c(Lv/w;)Landroid/widget/EdgeEffect;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v1, Lv/v;->a:Lv/v;

    invoke-virtual {v1, v0}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v0

    cmpg-float v0, v0, v3

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    return v2

    :cond_7
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method public final i()J
    .locals 5

    .prologue
    iget-object v0, p0, Lv/a;->a:Ln0/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lv/a;->f:J

    invoke-static {v0, v1}, Ln0/n;->b(J)J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v2

    iget-wide v3, p0, Lv/a;->f:J

    invoke-static {v3, v4}, Ln0/m;->i(J)F

    move-result v3

    div-float/2addr v2, v3

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result v0

    iget-wide v3, p0, Lv/a;->f:J

    invoke-static {v3, v4}, Ln0/m;->g(J)F

    move-result v1

    div-float/2addr v0, v1

    invoke-static {v2, v0}, Ln0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final j()LV/w0;
    .locals 1

    iget-object v0, p0, Lv/a;->c:LV/w0;

    return-object v0
.end method

.method public final k()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lv/a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv/a;->c:LV/w0;

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {v0, v1}, LV/w0;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final r(J)V
    .locals 4

    .prologue
    iget-wide v0, p0, Lv/a;->f:J

    sget-object v2, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v2}, Ln0/m$a;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ln0/m;->f(JJ)Z

    move-result v0

    iget-wide v1, p0, Lv/a;->f:J

    invoke-static {p1, p2, v1, v2}, Ln0/m;->f(JJ)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iput-wide p1, p0, Lv/a;->f:J

    if-eqz v1, :cond_0

    iget-object v2, p0, Lv/a;->b:Lv/w;

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result v3

    invoke-static {v3}, LA7/a;->d(F)I

    move-result v3

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    invoke-static {v3, p1}, LY0/u;->a(II)J

    move-result-wide p1

    invoke-virtual {v2, p1, p2}, Lv/w;->B(J)V

    :cond_0
    if-nez v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lv/a;->k()V

    invoke-direct {p0}, Lv/a;->h()V

    :cond_1
    return-void
.end method
