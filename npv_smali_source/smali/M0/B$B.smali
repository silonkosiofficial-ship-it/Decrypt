.class final LM0/B$B;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$B;

    invoke-direct {v0}, LM0/B$B;-><init>()V

    sput-object v0, LM0/B$B;->D:LM0/B$B;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LM0/C;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p1

    invoke-virtual/range {p2 .. p2}, LM0/C;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v1

    sget-object v2, Lo0/y0;->b:Lo0/y0$a;

    invoke-static {v2}, LM0/B;->t(Lo0/y0$a;)Le0/j;

    move-result-object v3

    invoke-static {v1, v3, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, LM0/C;->k()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/x;->b(J)LY0/x;

    move-result-object v3

    sget-object v4, LY0/x;->b:LY0/x$a;

    invoke-static {v4}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v5

    invoke-static {v3, v5, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, LM0/C;->n()LR0/q;

    move-result-object v5

    sget-object v6, LR0/q;->D:LR0/q$a;

    invoke-static {v6}, LM0/B;->k(LR0/q$a;)Le0/j;

    move-result-object v6

    invoke-static {v5, v6, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LM0/C;->l()LR0/o;

    move-result-object v6

    invoke-static {v6}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LM0/C;->m()LR0/p;

    move-result-object v7

    invoke-static {v7}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, -0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, LM0/C;->j()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, LM0/C;->o()J

    move-result-wide v10

    invoke-static {v10, v11}, LY0/x;->b(J)LY0/x;

    move-result-object v10

    invoke-static {v4}, LM0/B;->r(LY0/x$a;)Le0/j;

    move-result-object v4

    invoke-static {v10, v4, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LM0/C;->e()LX0/a;

    move-result-object v10

    sget-object v11, LX0/a;->b:LX0/a$a;

    invoke-static {v11}, LM0/B;->n(LX0/a$a;)Le0/j;

    move-result-object v11

    invoke-static {v10, v11, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, LM0/C;->u()LX0/p;

    move-result-object v11

    sget-object v12, LX0/p;->c:LX0/p$a;

    invoke-static {v12}, LM0/B;->p(LX0/p$a;)Le0/j;

    move-result-object v12

    invoke-static {v11, v12, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, LM0/C;->p()LT0/h;

    move-result-object v12

    sget-object v13, LT0/h;->E:LT0/h$a;

    invoke-static {v13}, LM0/B;->m(LT0/h$a;)Le0/j;

    move-result-object v13

    invoke-static {v12, v13, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, LM0/C;->d()J

    move-result-wide v13

    invoke-static {v13, v14}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v13

    invoke-static {v2}, LM0/B;->t(Lo0/y0$a;)Le0/j;

    move-result-object v2

    invoke-static {v13, v2, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LM0/C;->s()LX0/k;

    move-result-object v13

    sget-object v14, LX0/k;->b:LX0/k$a;

    invoke-static {v14}, LM0/B;->o(LX0/k$a;)Le0/j;

    move-result-object v14

    invoke-static {v13, v14, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, LM0/C;->r()Lo0/c2;

    move-result-object v14

    sget-object v15, Lo0/c2;->d:Lo0/c2$a;

    invoke-static {v15}, LM0/B;->u(Lo0/c2$a;)Le0/j;

    move-result-object v15

    invoke-static {v14, v15, v0}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object v0

    const/16 v14, 0xe

    new-array v14, v14, [Ljava/lang/Object;

    const/4 v15, 0x0

    aput-object v1, v14, v15

    const/4 v1, 0x1

    aput-object v3, v14, v1

    const/4 v1, 0x2

    aput-object v5, v14, v1

    const/4 v1, 0x3

    aput-object v6, v14, v1

    const/4 v1, 0x4

    aput-object v7, v14, v1

    const/4 v1, 0x5

    aput-object v8, v14, v1

    const/4 v1, 0x6

    aput-object v9, v14, v1

    const/4 v1, 0x7

    aput-object v4, v14, v1

    const/16 v1, 0x8

    aput-object v10, v14, v1

    const/16 v1, 0x9

    aput-object v11, v14, v1

    const/16 v1, 0xa

    aput-object v12, v14, v1

    const/16 v1, 0xb

    aput-object v2, v14, v1

    const/16 v1, 0xc

    aput-object v13, v14, v1

    const/16 v1, 0xd

    aput-object v0, v14, v1

    invoke-static {v14}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LM0/C;

    invoke-virtual {p0, p1, p2}, LM0/B$B;->a(Le0/l;LM0/C;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
