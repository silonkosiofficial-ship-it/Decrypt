.class Lo9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/h;


# instance fields
.field private final C:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/d;->C:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public I0(Lo9/a;J)J
    .locals 7

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    if-ltz v2, :cond_7

    :try_start_0
    sget-object v0, Ls9/d;->a:Ls9/d;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lo9/k;->b(Z)[B

    move-result-object v3

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result v4

    array-length v5, v3

    sub-int/2addr v5, v4

    int-to-long v5, v5

    invoke-static {p2, p3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    iget-object p3, p0, Lo9/d;->C:Ljava/io/InputStream;

    invoke-virtual {p3, v3, v4, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p2

    int-to-long p2, p2

    const-wide/16 v4, -0x1

    cmp-long v4, p2, v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    long-to-int v2, p2

    :goto_0
    if-ne v2, v0, :cond_2

    invoke-virtual {v1, v3, v2}, Lo9/k;->B([BI)V

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lo9/k;->q(I)V

    invoke-virtual {p1}, Lo9/a;->s()J

    move-result-wide v0

    :goto_1
    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lo9/a;->R(J)V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    if-ltz v2, :cond_5

    invoke-virtual {v1}, Lo9/k;->h()I

    move-result v0

    if-gt v2, v0, :cond_5

    if-eqz v2, :cond_3

    invoke-virtual {v1, v3, v2}, Lo9/k;->B([BI)V

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lo9/k;->q(I)V

    invoke-virtual {p1}, Lo9/a;->s()J

    move-result-wide v0

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lo9/m;->a(Lo9/k;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lo9/a;->H()V

    :cond_4
    :goto_2
    return-wide p2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid number of bytes written: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ". Should be in 0.."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lo9/k;->h()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    invoke-static {p1}, Lo9/e;->b(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_6
    throw p1

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ") < 0"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lo9/d;->C:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RawSource("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo9/d;->C:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
