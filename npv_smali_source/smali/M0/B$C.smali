.class final LM0/B$C;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$C;

    invoke-direct {v0}, LM0/B$C;-><init>()V

    sput-object v0, LM0/B$C;->D:LM0/B$C;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LM0/C;
    .locals 29

    .prologue
    move-object/from16 v0, p1

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    new-instance v24, LM0/C;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-static {v2}, LM0/B;->t(Lo0/y0$a;)Le0/j;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    instance-of v5, v3, LM0/n;

    if-nez v5, :cond_1

    :cond_0
    move-object v1, v6

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_0

    invoke-interface {v3, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    :goto_0
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v7

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LY0/x;->b:LY0/x$a;

    invoke-static {v3}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v5

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    instance-of v9, v5, LM0/n;

    if-nez v9, :cond_3

    :cond_2
    move-object v1, v6

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_2

    invoke-interface {v5, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/x;

    :goto_1
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LY0/x;->k()J

    move-result-wide v10

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v5, LR0/q;->D:LR0/q$a;

    invoke-static {v5}, LM0/B;->k(LR0/q$a;)Le0/j;

    move-result-object v5

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    instance-of v9, v5, LM0/n;

    if-nez v9, :cond_5

    :cond_4
    move-object v12, v6

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_4

    invoke-interface {v5, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LR0/q;

    move-object v12, v1

    :goto_2
    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    check-cast v1, LR0/o;

    move-object v13, v1

    goto :goto_3

    :cond_6
    move-object v13, v6

    :goto_3
    const/4 v1, 0x4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_7

    check-cast v1, LR0/p;

    move-object v14, v1

    goto :goto_4

    :cond_7
    move-object v14, v6

    :goto_4
    const/4 v1, 0x6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/String;

    move-object v15, v1

    goto :goto_5

    :cond_8
    move-object v15, v6

    :goto_5
    const/4 v1, 0x7

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v3

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    instance-of v5, v3, LM0/n;

    if-nez v5, :cond_a

    :cond_9
    move-object v1, v6

    goto :goto_6

    :cond_a
    if-eqz v1, :cond_9

    invoke-interface {v3, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/x;

    :goto_6
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LY0/x;->k()J

    move-result-wide v16

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LX0/a;->b:LX0/a$a;

    invoke-static {v3}, LM0/B;->n(LX0/a$a;)Le0/j;

    move-result-object v3

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    instance-of v5, v3, LM0/n;

    if-nez v5, :cond_c

    :cond_b
    move-object/from16 v18, v6

    goto :goto_7

    :cond_c
    if-eqz v1, :cond_b

    invoke-interface {v3, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX0/a;

    move-object/from16 v18, v1

    :goto_7
    const/16 v1, 0x9

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LX0/p;->c:LX0/p$a;

    invoke-static {v3}, LM0/B;->p(LX0/p$a;)Le0/j;

    move-result-object v3

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    instance-of v5, v3, LM0/n;

    if-nez v5, :cond_e

    :cond_d
    move-object/from16 v19, v6

    goto :goto_8

    :cond_e
    if-eqz v1, :cond_d

    invoke-interface {v3, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX0/p;

    move-object/from16 v19, v1

    :goto_8
    const/16 v1, 0xa

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LT0/h;->E:LT0/h$a;

    invoke-static {v3}, LM0/B;->m(LT0/h$a;)Le0/j;

    move-result-object v3

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    instance-of v5, v3, LM0/n;

    if-nez v5, :cond_10

    :cond_f
    move-object/from16 v25, v6

    goto :goto_9

    :cond_10
    if-eqz v1, :cond_f

    invoke-interface {v3, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT0/h;

    move-object/from16 v25, v1

    :goto_9
    const/16 v1, 0xb

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, LM0/B;->t(Lo0/y0$a;)Le0/j;

    move-result-object v2

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    instance-of v3, v2, LM0/n;

    if-nez v3, :cond_12

    :cond_11
    move-object v1, v6

    goto :goto_a

    :cond_12
    if-eqz v1, :cond_11

    invoke-interface {v2, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/y0;

    :goto_a
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo0/y0;->w()J

    move-result-wide v26

    const/16 v1, 0xc

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LX0/k;->b:LX0/k$a;

    invoke-static {v2}, LM0/B;->o(LX0/k$a;)Le0/j;

    move-result-object v2

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    instance-of v3, v2, LM0/n;

    if-nez v3, :cond_14

    :cond_13
    move-object/from16 v28, v6

    goto :goto_b

    :cond_14
    if-eqz v1, :cond_13

    invoke-interface {v2, v1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX0/k;

    move-object/from16 v28, v1

    :goto_b
    const/16 v1, 0xd

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo0/c2;->d:Lo0/c2$a;

    invoke-static {v1}, LM0/B;->u(Lo0/c2$a;)Le0/j;

    move-result-object v1

    invoke-static {v0, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    instance-of v2, v1, LM0/n;

    if-nez v2, :cond_16

    :cond_15
    move-object v0, v6

    goto :goto_c

    :cond_16
    if-eqz v0, :cond_15

    invoke-interface {v1, v0}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/c2;

    :goto_c
    const v22, 0xc020

    const/16 v23, 0x0

    const/4 v9, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, v24

    move-wide v2, v7

    move-wide v4, v10

    move-object v6, v12

    move-object v7, v13

    move-object v8, v14

    move-object v10, v15

    move-wide/from16 v11, v16

    move-object/from16 v13, v18

    move-object/from16 v14, v19

    move-object/from16 v15, v25

    move-wide/from16 v16, v26

    move-object/from16 v18, v28

    move-object/from16 v19, v0

    invoke-direct/range {v1 .. v23}, LM0/C;-><init>(JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;ILy7/k;)V

    return-object v24
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$C;->a(Ljava/lang/Object;)LM0/C;

    move-result-object p1

    return-object p1
.end method
