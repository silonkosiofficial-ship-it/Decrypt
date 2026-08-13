.class public final LT9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT9/b$a;,
        LT9/b$b;
    }
.end annotation


# static fields
.field public static final d:LT9/b$b;

.field private static final e:LX9/N;

.field private static final f:LX9/g;


# instance fields
.field private final a:LX9/f;

.field private final b:LT9/b$a;

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    new-instance v0, LT9/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT9/b$b;-><init>(Ly7/k;)V

    sput-object v0, LT9/b;->d:LT9/b$b;

    sget-object v0, LX9/N;->F:LX9/N$a;

    sget-object v1, LX9/g;->F:LX9/g$a;

    const-string v2, "\r\n"

    invoke-virtual {v1, v2}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v3

    const-string v4, "\r"

    invoke-virtual {v1, v4}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v1, v5}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v5

    const-string v6, "data: "

    invoke-virtual {v1, v6}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v6

    const-string v7, "data:"

    invoke-virtual {v1, v7}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v7

    const-string v8, "data\r\n"

    invoke-virtual {v1, v8}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v8

    const-string v9, "data\r"

    invoke-virtual {v1, v9}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v9

    const-string v10, "data\n"

    invoke-virtual {v1, v10}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v10

    const-string v11, "id: "

    invoke-virtual {v1, v11}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v11

    const-string v12, "id:"

    invoke-virtual {v1, v12}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v12

    const-string v13, "id\r\n"

    invoke-virtual {v1, v13}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v13

    const-string v14, "id\r"

    invoke-virtual {v1, v14}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v14

    const-string v15, "id\n"

    invoke-virtual {v1, v15}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v15

    move-object/from16 v16, v2

    const-string v2, "event: "

    invoke-virtual {v1, v2}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v2

    move-object/from16 v17, v0

    const-string v0, "event:"

    invoke-virtual {v1, v0}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    move-object/from16 v18, v0

    const-string v0, "event\r\n"

    invoke-virtual {v1, v0}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    move-object/from16 v19, v0

    const-string v0, "event\r"

    invoke-virtual {v1, v0}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    move-object/from16 v20, v0

    const-string v0, "event\n"

    invoke-virtual {v1, v0}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    move-object/from16 v21, v0

    const-string v0, "retry: "

    invoke-virtual {v1, v0}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    move-object/from16 v22, v0

    const-string v0, "retry:"

    invoke-virtual {v1, v0}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    move-object/from16 v23, v1

    const/16 v1, 0x14

    new-array v1, v1, [LX9/g;

    const/16 v24, 0x0

    aput-object v3, v1, v24

    const/4 v3, 0x1

    aput-object v4, v1, v3

    const/4 v3, 0x2

    aput-object v5, v1, v3

    const/4 v3, 0x3

    aput-object v6, v1, v3

    const/4 v3, 0x4

    aput-object v7, v1, v3

    const/4 v3, 0x5

    aput-object v8, v1, v3

    const/4 v3, 0x6

    aput-object v9, v1, v3

    const/4 v3, 0x7

    aput-object v10, v1, v3

    const/16 v3, 0x8

    aput-object v11, v1, v3

    const/16 v3, 0x9

    aput-object v12, v1, v3

    const/16 v3, 0xa

    aput-object v13, v1, v3

    const/16 v3, 0xb

    aput-object v14, v1, v3

    const/16 v3, 0xc

    aput-object v15, v1, v3

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const/16 v2, 0xe

    aput-object v18, v1, v2

    const/16 v2, 0xf

    aput-object v19, v1, v2

    const/16 v2, 0x10

    aput-object v20, v1, v2

    const/16 v2, 0x11

    aput-object v21, v1, v2

    const/16 v2, 0x12

    aput-object v22, v1, v2

    const/16 v2, 0x13

    aput-object v0, v1, v2

    move-object/from16 v0, v17

    invoke-virtual {v0, v1}, LX9/N$a;->d([LX9/g;)LX9/N;

    move-result-object v0

    sput-object v0, LT9/b;->e:LX9/N;

    move-object/from16 v1, v16

    move-object/from16 v0, v23

    invoke-virtual {v0, v1}, LX9/g$a;->c(Ljava/lang/String;)LX9/g;

    move-result-object v0

    sput-object v0, LT9/b;->f:LX9/g;

    return-void
.end method

.method public constructor <init>(LX9/f;LT9/b$a;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9/b;->a:LX9/f;

    iput-object p2, p0, LT9/b;->b:LT9/b$a;

    return-void
.end method

.method public static final synthetic a()LX9/g;
    .locals 1

    sget-object v0, LT9/b;->f:LX9/g;

    return-object v0
.end method

.method public static final synthetic b()LX9/N;
    .locals 1

    sget-object v0, LT9/b;->e:LX9/N;

    return-object v0
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;LX9/d;)V
    .locals 4

    .prologue
    invoke-virtual {p3}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iput-object p1, p0, LT9/b;->c:Ljava/lang/String;

    const-wide/16 v0, 0x1

    invoke-virtual {p3, v0, v1}, LX9/d;->skip(J)V

    iget-object v0, p0, LT9/b;->b:LT9/b$a;

    invoke-virtual {p3}, LX9/d;->Y0()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, LT9/b$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 11

    .prologue
    iget-object v0, p0, LT9/b;->c:Ljava/lang/String;

    new-instance v1, LX9/d;

    invoke-direct {v1}, LX9/d;-><init>()V

    const/4 v2, 0x0

    :cond_0
    :goto_0
    move-object v3, v2

    :cond_1
    :goto_1
    iget-object v4, p0, LT9/b;->a:LX9/f;

    sget-object v5, LT9/b;->e:LX9/N;

    invoke-interface {v4, v5}, LX9/f;->k0(LX9/N;)I

    move-result v4

    const/4 v6, 0x3

    if-ltz v4, :cond_2

    if-ge v4, v6, :cond_2

    invoke-direct {p0, v0, v3, v1}, LT9/b;->c(Ljava/lang/String;Ljava/lang/String;LX9/d;)V

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v7, 0x5

    if-gt v6, v4, :cond_3

    if-ge v4, v7, :cond_3

    sget-object v4, LT9/b;->d:LT9/b$b;

    iget-object v5, p0, LT9/b;->a:LX9/f;

    invoke-static {v4, v5, v1}, LT9/b$b;->a(LT9/b$b;LX9/f;LX9/d;)V

    goto :goto_1

    :cond_3
    const/16 v6, 0x8

    const/16 v8, 0xa

    if-gt v7, v4, :cond_4

    if-ge v4, v6, :cond_4

    invoke-virtual {v1, v8}, LX9/d;->v1(I)LX9/d;

    goto :goto_1

    :cond_4
    if-gt v6, v4, :cond_5

    if-ge v4, v8, :cond_5

    iget-object v0, p0, LT9/b;->a:LX9/f;

    invoke-interface {v0}, LX9/f;->N0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_6

    goto :goto_1

    :cond_5
    const/16 v6, 0xd

    if-gt v8, v4, :cond_7

    if-ge v4, v6, :cond_7

    :cond_6
    move-object v0, v2

    goto :goto_1

    :cond_7
    const/16 v7, 0xf

    if-gt v6, v4, :cond_8

    if-ge v4, v7, :cond_8

    iget-object v3, p0, LT9/b;->a:LX9/f;

    invoke-interface {v3}, LX9/f;->N0()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_1

    :cond_8
    const/16 v6, 0x12

    if-gt v7, v4, :cond_9

    if-ge v4, v6, :cond_9

    goto :goto_0

    :cond_9
    const-wide/16 v7, -0x1

    if-gt v6, v4, :cond_a

    const/16 v6, 0x14

    if-ge v4, v6, :cond_a

    sget-object v4, LT9/b;->d:LT9/b$b;

    iget-object v5, p0, LT9/b;->a:LX9/f;

    invoke-static {v4, v5}, LT9/b$b;->b(LT9/b$b;LX9/f;)J

    move-result-wide v4

    cmp-long v6, v4, v7

    if-eqz v6, :cond_1

    iget-object v6, p0, LT9/b;->b:LT9/b$a;

    invoke-interface {v6, v4, v5}, LT9/b$a;->a(J)V

    goto :goto_1

    :cond_a
    const/4 v6, -0x1

    if-ne v4, v6, :cond_c

    iget-object v4, p0, LT9/b;->a:LX9/f;

    sget-object v6, LT9/b;->f:LX9/g;

    invoke-interface {v4, v6}, LX9/f;->h0(LX9/g;)J

    move-result-wide v9

    cmp-long v4, v9, v7

    if-eqz v4, :cond_b

    iget-object v4, p0, LT9/b;->a:LX9/f;

    invoke-interface {v4, v9, v10}, LX9/f;->skip(J)V

    iget-object v4, p0, LT9/b;->a:LX9/f;

    invoke-interface {v4, v5}, LX9/f;->k0(LX9/N;)I

    goto/16 :goto_1

    :cond_b
    const/4 v0, 0x0

    return v0

    :cond_c
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method
