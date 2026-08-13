.class public final LH/h$e$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$e$a$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LH/w;

.field final synthetic b:Lx7/l;

.field final synthetic c:LS0/V;

.field final synthetic d:LS0/L;

.field final synthetic e:LY0/e;

.field final synthetic f:I


# direct methods
.method constructor <init>(LH/w;Lx7/l;LS0/V;LS0/L;LY0/e;I)V
    .locals 0

    iput-object p1, p0, LH/h$e$a$a$a;->a:LH/w;

    iput-object p2, p0, LH/h$e$a$a$a;->b:Lx7/l;

    iput-object p3, p0, LH/h$e$a$a$a;->c:LS0/V;

    iput-object p4, p0, LH/h$e$a$a$a;->d:LS0/L;

    iput-object p5, p0, LH/h$e$a$a$a;->e:LY0/e;

    iput p6, p0, LH/h$e$a$a$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LD0/o;Ljava/util/List;I)I
    .locals 0

    iget-object p2, p0, LH/h$e$a$a$a;->a:LH/w;

    invoke-virtual {p2}, LH/w;->v()LH/D;

    move-result-object p2

    invoke-interface {p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object p1

    invoke-virtual {p2, p1}, LH/D;->m(LY0/v;)V

    iget-object p1, p0, LH/h$e$a$a$a;->a:LH/w;

    invoke-virtual {p1}, LH/w;->v()LH/D;

    move-result-object p1

    invoke-virtual {p1}, LH/D;->c()I

    move-result p1

    return p1
.end method

.method public b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 16

    .prologue
    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x1

    sget-object v3, Lf0/k;->e:Lf0/k$a;

    iget-object v4, v1, LH/h$e$a$a$a;->a:LH/w;

    invoke-virtual {v3}, Lf0/k$a;->d()Lf0/k;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lf0/k;->h()Lx7/l;

    move-result-object v7

    goto :goto_0

    :cond_0
    move-object v7, v6

    :goto_0
    invoke-virtual {v3, v5}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v8

    :try_start_0
    invoke-virtual {v4}, LH/w;->j()LH/V;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v5, v8, v7}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    if-eqz v4, :cond_1

    invoke-virtual {v4}, LH/V;->f()LM0/K;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v6

    :goto_1
    sget-object v7, LH/H;->a:LH/H$a;

    iget-object v5, v1, LH/h$e$a$a$a;->a:LH/w;

    invoke-virtual {v5}, LH/w;->v()LH/D;

    move-result-object v8

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v11

    move-wide/from16 v9, p3

    move-object v12, v3

    invoke-virtual/range {v7 .. v12}, LH/H$a;->d(LH/D;JLY0/v;LM0/K;)Li7/A;

    move-result-object v5

    invoke-virtual {v5}, Li7/A;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v5}, Li7/A;->b()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v5}, Li7/A;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LM0/K;

    invoke-static {v3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, v1, LH/h$e$a$a$a;->a:LH/w;

    new-instance v15, LH/V;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LH/V;->b()LD0/t;

    move-result-object v6

    :cond_2
    move-object v12, v6

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object v9, v15

    move-object v10, v5

    invoke-direct/range {v9 .. v14}, LH/V;-><init>(LM0/K;LD0/t;LD0/t;ILy7/k;)V

    invoke-virtual {v3, v15}, LH/w;->G(LH/V;)V

    iget-object v3, v1, LH/h$e$a$a$a;->b:Lx7/l;

    invoke-interface {v3, v5}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v1, LH/h$e$a$a$a;->a:LH/w;

    iget-object v4, v1, LH/h$e$a$a$a;->c:LS0/V;

    iget-object v6, v1, LH/h$e$a$a$a;->d:LS0/L;

    invoke-static {v3, v4, v6}, LH/h;->j(LH/w;LS0/V;LS0/L;)V

    :cond_3
    iget-object v3, v1, LH/h$e$a$a$a;->a:LH/w;

    iget-object v4, v1, LH/h$e$a$a$a;->e:LY0/e;

    iget v6, v1, LH/h$e$a$a$a;->f:I

    if-ne v6, v2, :cond_4

    invoke-virtual {v5, v0}, LM0/K;->m(I)F

    move-result v6

    invoke-static {v6}, LH/E;->a(F)I

    move-result v6

    goto :goto_2

    :cond_4
    move v6, v0

    :goto_2
    invoke-interface {v4, v6}, LY0/e;->o0(I)F

    move-result v4

    invoke-virtual {v3, v4}, LH/w;->H(F)V

    invoke-static {}, LD0/b;->a()LD0/m;

    move-result-object v3

    invoke-virtual {v5}, LM0/K;->h()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    invoke-static {}, LD0/b;->b()LD0/m;

    move-result-object v4

    invoke-virtual {v5}, LM0/K;->k()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Li7/u;

    aput-object v3, v5, v0

    aput-object v4, v5, v2

    invoke-static {v5}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sget-object v2, LH/h$e$a$a$a$a;->D:LH/h$e$a$a$a$a;

    move-object/from16 v3, p1

    invoke-interface {v3, v7, v8, v0, v2}, LD0/M;->f0(IILjava/util/Map;Lx7/l;)LD0/K;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-virtual {v3, v5, v8, v7}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw v2
.end method

.method public synthetic c(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->d(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic e(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->c(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic j(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->a(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
