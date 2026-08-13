.class final LH/G$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/G$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LK/o;

.field final synthetic E:LS0/L;

.field final synthetic F:LS0/V;

.field final synthetic G:LH/w;

.field final synthetic H:Lo0/n0;


# direct methods
.method constructor <init>(LK/o;LS0/L;LS0/V;LH/w;Lo0/n0;)V
    .locals 0

    iput-object p1, p0, LH/G$a$b;->D:LK/o;

    iput-object p2, p0, LH/G$a$b;->E:LS0/L;

    iput-object p3, p0, LH/G$a$b;->F:LS0/V;

    iput-object p4, p0, LH/G$a$b;->G:LH/w;

    iput-object p5, p0, LH/G$a$b;->H:Lo0/n0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lq0/c;->l1()V

    iget-object v1, v0, LH/G$a$b;->D:LK/o;

    invoke-virtual {v1}, LK/o;->c()F

    move-result v11

    const/4 v1, 0x0

    cmpg-float v2, v11, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v0, LH/G$a$b;->E:LS0/L;

    iget-object v3, v0, LH/G$a$b;->F:LS0/V;

    invoke-virtual {v3}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LM0/N;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LS0/L;->b(I)I

    move-result v2

    iget-object v3, v0, LH/G$a$b;->G:LH/w;

    invoke-virtual {v3}, LH/w;->j()LH/V;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LH/V;->f()LM0/K;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, LM0/K;->e(I)Ln0/i;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    new-instance v2, Ln0/i;

    invoke-direct {v2, v1, v1, v1, v1}, Ln0/i;-><init>(FFFF)V

    :cond_2
    invoke-static {}, LH/G;->b()F

    move-result v1

    move-object/from16 v3, p1

    invoke-interface {v3, v1}, LY0/e;->B0(F)F

    move-result v8

    invoke-virtual {v2}, Ln0/i;->i()F

    move-result v1

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float v4, v8, v4

    add-float/2addr v1, v4

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ln0/m;->i(J)F

    move-result v5

    sub-float/2addr v5, v4

    invoke-static {v1, v5}, LE7/j;->f(FF)F

    move-result v1

    invoke-static {v1, v4}, LE7/j;->c(FF)F

    move-result v1

    invoke-virtual {v2}, Ln0/i;->l()F

    move-result v4

    invoke-static {v1, v4}, Ln0/h;->a(FF)J

    move-result-wide v4

    invoke-virtual {v2}, Ln0/i;->e()F

    move-result v2

    invoke-static {v1, v2}, Ln0/h;->a(FF)J

    move-result-wide v6

    iget-object v1, v0, LH/G$a$b;->H:Lo0/n0;

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v2, p1

    move-object v3, v1

    invoke-static/range {v2 .. v15}, Lq0/f;->h(Lq0/g;Lo0/n0;JJFILo0/R1;FLo0/z0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, LH/G$a$b;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
