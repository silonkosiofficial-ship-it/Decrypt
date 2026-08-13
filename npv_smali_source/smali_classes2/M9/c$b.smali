.class public final LM9/c$b;
.super LX9/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final D:J

.field private E:J

.field private F:Z

.field private G:Z

.field private H:Z

.field final synthetic I:LM9/c;


# direct methods
.method public constructor <init>(LM9/c;LX9/Z;J)V
    .locals 1

    .prologue
    const-string v0, "delegate"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LM9/c$b;->I:LM9/c;

    invoke-direct {p0, p2}, LX9/m;-><init>(LX9/Z;)V

    iput-wide p3, p0, LM9/c$b;->D:J

    const/4 p1, 0x1

    iput-boolean p1, p0, LM9/c$b;->F:Z

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LM9/c$b;->f(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_0
    return-void
.end method


# virtual methods
.method public b0(LX9/d;J)J
    .locals 7

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LM9/c$b;->H:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_5

    :try_start_0
    invoke-virtual {p0}, LX9/m;->a()LX9/Z;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide p1

    iget-boolean p3, p0, LM9/c$b;->F:Z

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    iput-boolean p3, p0, LM9/c$b;->F:Z

    iget-object p3, p0, LM9/c$b;->I:LM9/c;

    invoke-virtual {p3}, LM9/c;->i()LH9/r;

    move-result-object p3

    iget-object v0, p0, LM9/c$b;->I:LM9/c;

    invoke-virtual {v0}, LM9/c;->g()LM9/e;

    move-result-object v0

    invoke-virtual {p3, v0}, LH9/r;->v(LH9/e;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const-wide/16 v0, -0x1

    cmp-long p3, p1, v0

    const/4 v2, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0, v2}, LM9/c$b;->f(Ljava/io/IOException;)Ljava/io/IOException;

    return-wide v0

    :cond_1
    iget-wide v3, p0, LM9/c$b;->E:J

    add-long/2addr v3, p1

    iget-wide v5, p0, LM9/c$b;->D:J

    cmp-long p3, v5, v0

    if-eqz p3, :cond_3

    cmp-long p3, v3, v5

    if-gtz p3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, LM9/c$b;->D:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but received "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-wide v3, p0, LM9/c$b;->E:J

    cmp-long p3, v3, v5

    if-nez p3, :cond_4

    invoke-virtual {p0, v2}, LM9/c$b;->f(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-wide p1

    :goto_2
    invoke-virtual {p0, p1}, LM9/c$b;->f(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LM9/c$b;->H:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LM9/c$b;->H:Z

    :try_start_0
    invoke-super {p0}, LX9/m;->close()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LM9/c$b;->f(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LM9/c$b;->f(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final f(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 8

    .prologue
    iget-boolean v0, p0, LM9/c$b;->G:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LM9/c$b;->G:Z

    if-nez p1, :cond_1

    iget-boolean v0, p0, LM9/c$b;->F:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, LM9/c$b;->F:Z

    iget-object v0, p0, LM9/c$b;->I:LM9/c;

    invoke-virtual {v0}, LM9/c;->i()LH9/r;

    move-result-object v0

    iget-object v1, p0, LM9/c$b;->I:LM9/c;

    invoke-virtual {v1}, LM9/c;->g()LM9/e;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/r;->v(LH9/e;)V

    :cond_1
    iget-object v2, p0, LM9/c$b;->I:LM9/c;

    iget-wide v3, p0, LM9/c$b;->E:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, LM9/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method
