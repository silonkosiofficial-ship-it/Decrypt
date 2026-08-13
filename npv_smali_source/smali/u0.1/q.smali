.class public final Lu0/q;
.super Lt0/b;
.source "SourceFile"


# static fields
.field public static final n:I = 0x8


# instance fields
.field private final g:LV/w0;

.field private final h:LV/w0;

.field private final i:Lu0/m;

.field private final j:LV/s0;

.field private k:F

.field private l:Lo0/z0;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu0/c;)V
    .locals 3

    invoke-direct {p0}, Lt0/b;-><init>()V

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v0}, Ln0/m$a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->c(J)Ln0/m;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu0/q;->g:LV/w0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    iput-object v0, p0, Lu0/q;->h:LV/w0;

    new-instance v0, Lu0/m;

    invoke-direct {v0, p1}, Lu0/m;-><init>(Lu0/c;)V

    new-instance p1, Lu0/q$a;

    invoke-direct {p1, p0}, Lu0/q$a;-><init>(Lu0/q;)V

    invoke-virtual {v0, p1}, Lu0/m;->o(Lx7/a;)V

    iput-object v0, p0, Lu0/q;->i:Lu0/m;

    const/4 p1, 0x0

    invoke-static {p1}, LV/l1;->a(I)LV/s0;

    move-result-object p1

    iput-object p1, p0, Lu0/q;->j:LV/s0;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lu0/q;->k:F

    const/4 p1, -0x1

    iput p1, p0, Lu0/q;->m:I

    return-void
.end method

.method public static final synthetic k(Lu0/q;)I
    .locals 0

    iget p0, p0, Lu0/q;->m:I

    return p0
.end method

.method public static final synthetic l(Lu0/q;)I
    .locals 0

    invoke-direct {p0}, Lu0/q;->o()I

    move-result p0

    return p0
.end method

.method public static final synthetic m(Lu0/q;I)V
    .locals 0

    invoke-direct {p0, p1}, Lu0/q;->s(I)V

    return-void
.end method

.method private final o()I
    .locals 1

    iget-object v0, p0, Lu0/q;->j:LV/s0;

    invoke-interface {v0}, LV/Y;->d()I

    move-result v0

    return v0
.end method

.method private final s(I)V
    .locals 1

    iget-object v0, p0, Lu0/q;->j:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    return-void
.end method


# virtual methods
.method protected a(F)Z
    .locals 0

    iput p1, p0, Lu0/q;->k:F

    const/4 p1, 0x1

    return p1
.end method

.method protected b(Lo0/z0;)Z
    .locals 0

    iput-object p1, p0, Lu0/q;->l:Lo0/z0;

    const/4 p1, 0x1

    return p1
.end method

.method public h()J
    .locals 2

    invoke-virtual {p0}, Lu0/q;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method protected j(Lq0/g;)V
    .locals 10

    .prologue
    iget-object v0, p0, Lu0/q;->i:Lu0/m;

    iget-object v1, p0, Lu0/q;->l:Lo0/z0;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lu0/m;->k()Lo0/z0;

    move-result-object v1

    :cond_0
    invoke-virtual {p0}, Lu0/q;->n()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v2

    sget-object v3, LY0/v;->D:LY0/v;

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Lq0/g;->W0()J

    move-result-wide v2

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v4

    invoke-interface {v4}, Lq0/d;->i()J

    move-result-wide v5

    invoke-interface {v4}, Lq0/d;->h()Lo0/q0;

    move-result-object v7

    invoke-interface {v7}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v4}, Lq0/d;->c()Lq0/j;

    move-result-object v7

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-interface {v7, v8, v9, v2, v3}, Lq0/j;->e(FFJ)V

    iget v2, p0, Lu0/q;->k:F

    invoke-virtual {v0, p1, v2, v1}, Lu0/m;->i(Lq0/g;FLo0/z0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v4}, Lq0/d;->h()Lo0/q0;

    move-result-object p1

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-interface {v4, v5, v6}, Lq0/d;->d(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v4}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v4, v5, v6}, Lq0/d;->d(J)V

    throw p1

    :cond_1
    iget v2, p0, Lu0/q;->k:F

    invoke-virtual {v0, p1, v2, v1}, Lu0/m;->i(Lq0/g;FLo0/z0;)V

    :goto_0
    invoke-direct {p0}, Lu0/q;->o()I

    move-result p1

    iput p1, p0, Lu0/q;->m:I

    return-void
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lu0/q;->h:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final p()J
    .locals 2

    iget-object v0, p0, Lu0/q;->g:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/m;

    invoke-virtual {v0}, Ln0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final q(Z)V
    .locals 1

    iget-object v0, p0, Lu0/q;->h:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final r(Lo0/z0;)V
    .locals 1

    iget-object v0, p0, Lu0/q;->i:Lu0/m;

    invoke-virtual {v0, p1}, Lu0/m;->n(Lo0/z0;)V

    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lu0/q;->i:Lu0/m;

    invoke-virtual {v0, p1}, Lu0/m;->p(Ljava/lang/String;)V

    return-void
.end method

.method public final u(J)V
    .locals 1

    iget-object v0, p0, Lu0/q;->g:LV/w0;

    invoke-static {p1, p2}, Ln0/m;->c(J)Ln0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final v(J)V
    .locals 1

    iget-object v0, p0, Lu0/q;->i:Lu0/m;

    invoke-virtual {v0, p1, p2}, Lu0/m;->q(J)V

    return-void
.end method
