.class public final LN9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/v;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LN9/b;->a:Z

    return-void
.end method

.method private final b(I)Z
    .locals 2

    .prologue
    const/16 v0, 0x64

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x66

    if-gt v0, p1, :cond_1

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public a(LH9/v$a;)LH9/B;
    .locals 13

    .prologue
    const-string v0, "Connection"

    const-string v1, "close"

    const-string v2, "chain"

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LN9/g;

    invoke-virtual {p1}, LN9/g;->g()LM9/c;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LN9/g;->i()LH9/z;

    move-result-object p1

    invoke-virtual {p1}, LH9/z;->a()LH9/A;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    :try_start_0
    invoke-virtual {v2, p1}, LM9/c;->w(LH9/z;)V

    invoke-virtual {p1}, LH9/z;->g()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, LN9/f;->a(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    if-eqz v3, :cond_3

    const-string v9, "100-continue"

    const-string v10, "Expect"

    invoke-virtual {p1, v10}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v7}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v2}, LM9/c;->f()V

    invoke-virtual {v2, v7}, LM9/c;->r(Z)LH9/B$a;

    move-result-object v9
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v2}, LM9/c;->t()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move v10, v6

    goto :goto_0

    :catch_0
    move-exception v3

    move v10, v7

    goto :goto_2

    :catch_1
    move-exception v3

    move v10, v7

    move-object v9, v8

    goto :goto_2

    :cond_0
    move v10, v7

    move-object v9, v8

    :goto_0
    if-nez v9, :cond_2

    :try_start_2
    invoke-virtual {v3}, LH9/A;->c()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v2}, LM9/c;->f()V

    invoke-virtual {v2, p1, v7}, LM9/c;->c(LH9/z;Z)LX9/X;

    move-result-object v11

    invoke-static {v11}, LX9/K;->a(LX9/X;)LX9/e;

    move-result-object v11

    invoke-virtual {v3, v11}, LH9/A;->e(LX9/e;)V

    goto :goto_1

    :catch_2
    move-exception v3

    goto :goto_2

    :cond_1
    invoke-virtual {v2, p1, v6}, LM9/c;->c(LH9/z;Z)LX9/X;

    move-result-object v11

    invoke-static {v11}, LX9/K;->a(LX9/X;)LX9/e;

    move-result-object v11

    invoke-virtual {v3, v11}, LH9/A;->e(LX9/e;)V

    invoke-interface {v11}, LX9/X;->close()V

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, LM9/c;->p()V

    invoke-virtual {v2}, LM9/c;->h()LM9/f;

    move-result-object v11

    invoke-virtual {v11}, LM9/f;->v()Z

    move-result v11

    if-nez v11, :cond_4

    invoke-virtual {v2}, LM9/c;->o()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :cond_3
    :try_start_3
    invoke-virtual {v2}, LM9/c;->p()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    move v10, v7

    move-object v9, v8

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    :try_start_4
    invoke-virtual {v3}, LH9/A;->c()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-virtual {v2}, LM9/c;->e()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_6
    move-object v3, v8

    goto :goto_3

    :goto_2
    instance-of v11, v3, LP9/a;

    if-nez v11, :cond_13

    invoke-virtual {v2}, LM9/c;->k()Z

    move-result v11

    if-eqz v11, :cond_12

    :goto_3
    if-nez v9, :cond_7

    :try_start_5
    invoke-virtual {v2, v6}, LM9/c;->r(Z)LH9/B$a;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v10, :cond_7

    invoke-virtual {v2}, LM9/c;->t()V

    move v10, v6

    goto :goto_4

    :catch_3
    move-exception p1

    goto/16 :goto_8

    :cond_7
    :goto_4
    invoke-virtual {v9, p1}, LH9/B$a;->r(LH9/z;)LH9/B$a;

    move-result-object v9

    invoke-virtual {v2}, LM9/c;->h()LM9/f;

    move-result-object v11

    invoke-virtual {v11}, LM9/f;->r()LH9/s;

    move-result-object v11

    invoke-virtual {v9, v11}, LH9/B$a;->i(LH9/s;)LH9/B$a;

    move-result-object v9

    invoke-virtual {v9, v4, v5}, LH9/B$a;->s(J)LH9/B$a;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, LH9/B$a;->q(J)LH9/B$a;

    move-result-object v9

    invoke-virtual {v9}, LH9/B$a;->c()LH9/B;

    move-result-object v9

    invoke-virtual {v9}, LH9/B;->o()I

    move-result v11

    invoke-direct {p0, v11}, LN9/b;->b(I)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v2, v6}, LM9/c;->r(Z)LH9/B$a;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v10, :cond_8

    invoke-virtual {v2}, LM9/c;->t()V

    :cond_8
    invoke-virtual {v6, p1}, LH9/B$a;->r(LH9/z;)LH9/B$a;

    move-result-object p1

    invoke-virtual {v2}, LM9/c;->h()LM9/f;

    move-result-object v6

    invoke-virtual {v6}, LM9/f;->r()LH9/s;

    move-result-object v6

    invoke-virtual {p1, v6}, LH9/B$a;->i(LH9/s;)LH9/B$a;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, LH9/B$a;->s(J)LH9/B$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, LH9/B$a;->q(J)LH9/B$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/B$a;->c()LH9/B;

    move-result-object v9

    invoke-virtual {v9}, LH9/B;->o()I

    move-result v11

    :cond_9
    invoke-virtual {v2, v9}, LM9/c;->s(LH9/B;)V

    iget-boolean p1, p0, LN9/b;->a:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x65

    if-ne v11, p1, :cond_a

    invoke-virtual {v9}, LH9/B;->g0()LH9/B$a;

    move-result-object p1

    sget-object v4, LI9/d;->c:LH9/C;

    invoke-virtual {p1, v4}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    move-result-object p1

    :goto_5
    invoke-virtual {p1}, LH9/B$a;->c()LH9/B;

    move-result-object p1

    goto :goto_6

    :cond_a
    invoke-virtual {v9}, LH9/B;->g0()LH9/B$a;

    move-result-object p1

    invoke-virtual {v2, v9}, LM9/c;->q(LH9/B;)LH9/C;

    move-result-object v4

    invoke-virtual {p1, v4}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    move-result-object p1

    goto :goto_5

    :goto_6
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v4

    invoke-virtual {v4, v0}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v7}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_b

    const/4 v4, 0x2

    invoke-static {p1, v0, v8, v4, v8}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    invoke-virtual {v2}, LM9/c;->o()V

    :cond_c
    const/16 v0, 0xcc

    if-eq v11, v0, :cond_d

    const/16 v0, 0xcd

    if-ne v11, v0, :cond_10

    :cond_d
    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, LH9/C;->a()J

    move-result-wide v0

    goto :goto_7

    :cond_e
    const-wide/16 v0, -0x1

    :goto_7
    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_10

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, LH9/C;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :cond_f
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :cond_10
    return-object p1

    :goto_8
    if-eqz v3, :cond_11

    invoke-static {v3, p1}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v3

    :cond_11
    throw p1

    :cond_12
    throw v3

    :cond_13
    throw v3
.end method
