.class public final synthetic LY6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx9/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:LY6/b$a;

.field private static final descriptor:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LY6/b$a;

    invoke-direct {v0}, LY6/b$a;-><init>()V

    sput-object v0, LY6/b$a;->a:LY6/b$a;

    new-instance v1, Lx9/k0;

    const-string v2, "io.ktor.util.date.GMTDate"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, Lx9/k0;-><init>(Ljava/lang/String;Lx9/E;I)V

    const-string v0, "seconds"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "minutes"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "hours"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "dayOfWeek"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "dayOfMonth"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "dayOfYear"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "month"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "year"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    const-string v0, "timestamp"

    invoke-virtual {v1, v0, v2}, Lx9/k0;->r(Ljava/lang/String;Z)V

    sput-object v1, LY6/b$a;->descriptor:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lv9/f;
    .locals 1

    sget-object v0, LY6/b$a;->descriptor:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LY6/b$a;->f(Lw9/h;)LY6/b;

    move-result-object p1

    return-object p1
.end method

.method public c()[Lt9/b;
    .locals 1

    invoke-static {p0}, Lx9/E$a;->a(Lx9/E;)[Lt9/b;

    move-result-object v0

    return-object v0
.end method

.method public final d()[Lt9/b;
    .locals 7

    invoke-static {}, LY6/b;->e()[Lt9/b;

    move-result-object v0

    const/4 v1, 0x3

    aget-object v2, v0, v1

    const/4 v3, 0x6

    aget-object v0, v0, v3

    const/16 v4, 0x9

    new-array v4, v4, [Lt9/b;

    sget-object v5, Lx9/J;->a:Lx9/J;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const/4 v6, 0x2

    aput-object v5, v4, v6

    aput-object v2, v4, v1

    const/4 v1, 0x4

    aput-object v5, v4, v1

    const/4 v1, 0x5

    aput-object v5, v4, v1

    aput-object v0, v4, v3

    const/4 v0, 0x7

    aput-object v5, v4, v0

    sget-object v0, Lx9/Q;->a:Lx9/Q;

    const/16 v1, 0x8

    aput-object v0, v4, v1

    return-object v4
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LY6/b;

    invoke-virtual {p0, p1, p2}, LY6/b$a;->g(Lw9/j;LY6/b;)V

    return-void
.end method

.method public final f(Lw9/h;)LY6/b;
    .locals 36

    .prologue
    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LY6/b$a;->descriptor:Lv9/f;

    invoke-interface {v0, v1}, Lw9/h;->a(Lv9/f;)Lw9/d;

    move-result-object v0

    invoke-static {}, LY6/b;->e()[Lt9/b;

    move-result-object v2

    invoke-interface {v0}, Lw9/d;->v()Z

    move-result v3

    const/4 v4, 0x7

    const/4 v5, 0x5

    const/16 v6, 0x8

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x6

    const/4 v10, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v12}, Lw9/d;->t(Lv9/f;I)I

    move-result v3

    invoke-interface {v0, v1, v11}, Lw9/d;->t(Lv9/f;I)I

    move-result v11

    invoke-interface {v0, v1, v8}, Lw9/d;->t(Lv9/f;I)I

    move-result v8

    aget-object v12, v2, v10

    invoke-interface {v0, v1, v10, v12, v13}, Lw9/d;->B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LY6/d;

    invoke-interface {v0, v1, v7}, Lw9/d;->t(Lv9/f;I)I

    move-result v7

    invoke-interface {v0, v1, v5}, Lw9/d;->t(Lv9/f;I)I

    move-result v5

    aget-object v2, v2, v9

    invoke-interface {v0, v1, v9, v2, v13}, Lw9/d;->B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY6/c;

    invoke-interface {v0, v1, v4}, Lw9/d;->t(Lv9/f;I)I

    move-result v4

    invoke-interface {v0, v1, v6}, Lw9/d;->u(Lv9/f;I)J

    move-result-wide v12

    const/16 v6, 0x1ff

    move-object/from16 v31, v2

    move/from16 v25, v3

    move/from16 v32, v4

    move/from16 v30, v5

    move/from16 v24, v6

    move/from16 v29, v7

    move/from16 v27, v8

    move-object/from16 v28, v10

    move/from16 v26, v11

    move-wide/from16 v33, v12

    goto/16 :goto_3

    :cond_0
    const-wide/16 v14, 0x0

    move/from16 v22, v11

    move v3, v12

    move/from16 v16, v3

    move/from16 v17, v16

    move/from16 v18, v17

    move-object v11, v13

    move-wide/from16 v19, v14

    move/from16 v14, v18

    move v15, v14

    move-object v12, v11

    move v13, v15

    :goto_0
    if-eqz v22, :cond_1

    invoke-interface {v0, v1}, Lw9/d;->r(Lv9/f;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lt9/f;

    invoke-direct {v0, v8}, Lt9/f;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v6}, Lw9/d;->u(Lv9/f;I)J

    move-result-wide v19

    or-int/lit16 v15, v15, 0x100

    :goto_1
    const/4 v8, 0x2

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v4}, Lw9/d;->t(Lv9/f;I)I

    move-result v13

    or-int/lit16 v15, v15, 0x80

    goto :goto_1

    :pswitch_2
    aget-object v8, v2, v9

    invoke-interface {v0, v1, v9, v8, v11}, Lw9/d;->B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, LY6/c;

    or-int/lit8 v15, v15, 0x40

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v5}, Lw9/d;->t(Lv9/f;I)I

    move-result v14

    or-int/lit8 v15, v15, 0x20

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v7}, Lw9/d;->t(Lv9/f;I)I

    move-result v16

    or-int/lit8 v15, v15, 0x10

    goto :goto_1

    :pswitch_5
    aget-object v8, v2, v10

    invoke-interface {v0, v1, v10, v8, v12}, Lw9/d;->B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, LY6/d;

    or-int/lit8 v15, v15, 0x8

    goto :goto_1

    :pswitch_6
    const/4 v8, 0x2

    invoke-interface {v0, v1, v8}, Lw9/d;->t(Lv9/f;I)I

    move-result v17

    or-int/lit8 v15, v15, 0x4

    goto :goto_0

    :pswitch_7
    const/4 v4, 0x1

    const/4 v8, 0x2

    invoke-interface {v0, v1, v4}, Lw9/d;->t(Lv9/f;I)I

    move-result v18

    or-int/lit8 v15, v15, 0x2

    :goto_2
    const/4 v4, 0x7

    goto :goto_0

    :pswitch_8
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v8, 0x2

    invoke-interface {v0, v1, v3}, Lw9/d;->t(Lv9/f;I)I

    move-result v21

    or-int/lit8 v15, v15, 0x1

    move/from16 v3, v21

    goto :goto_2

    :pswitch_9
    const/4 v4, 0x1

    const/4 v8, 0x2

    const/16 v21, 0x0

    move/from16 v22, v21

    goto :goto_2

    :cond_1
    move/from16 v25, v3

    move-object/from16 v31, v11

    move-object/from16 v28, v12

    move/from16 v32, v13

    move/from16 v30, v14

    move/from16 v24, v15

    move/from16 v29, v16

    move/from16 v27, v17

    move/from16 v26, v18

    move-wide/from16 v33, v19

    :goto_3
    invoke-interface {v0, v1}, Lw9/d;->b(Lv9/f;)V

    new-instance v0, LY6/b;

    const/16 v35, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v23 .. v35}, LY6/b;-><init>(IIIILY6/d;IILY6/c;IJLx9/u0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lw9/j;LY6/b;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LY6/b$a;->descriptor:Lv9/f;

    invoke-interface {p1, v0}, Lw9/j;->a(Lv9/f;)Lw9/f;

    move-result-object p1

    invoke-static {p2, p1, v0}, LY6/b;->i(LY6/b;Lw9/f;Lv9/f;)V

    invoke-interface {p1, v0}, Lw9/f;->b(Lv9/f;)V

    return-void
.end method
