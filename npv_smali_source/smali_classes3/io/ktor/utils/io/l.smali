.class public abstract Lio/ktor/utils/io/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/ktor/utils/io/g;ILx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    sget-object v0, Ls9/d;->a:Ls9/d;

    invoke-interface {p0}, Lio/ktor/utils/io/g;->c()Lo9/p;

    move-result-object v0

    invoke-interface {v0}, Lo9/p;->d()Lo9/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lo9/k;->b(Z)[B

    move-result-object v2

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result v3

    array-length v4, v2

    sub-int/2addr v4, v3

    invoke-static {v2, v3, v4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p2, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result p2

    sub-int/2addr p2, v3

    if-ne p2, p1, :cond_0

    :goto_0
    invoke-virtual {v1, v2, p2}, Lo9/k;->B([BI)V

    invoke-virtual {v1}, Lo9/k;->d()I

    move-result p1

    add-int/2addr p1, p2

    invoke-virtual {v1, p1}, Lo9/k;->q(I)V

    invoke-virtual {v0}, Lo9/a;->s()J

    move-result-wide v1

    int-to-long p1, p2

    add-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lo9/a;->R(J)V

    goto :goto_1

    :cond_0
    if-ltz p2, :cond_4

    invoke-virtual {v1}, Lo9/k;->h()I

    move-result p1

    if-gt p2, p1, :cond_4

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lo9/m;->a(Lo9/k;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lo9/a;->H()V

    :cond_2
    :goto_1
    invoke-interface {p0, p3}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Invalid number of bytes written: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Should be in 0.."

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lo9/k;->h()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(Lio/ktor/utils/io/g;ILx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    const/4 p5, 0x1

    and-int/2addr p4, p5

    if-eqz p4, :cond_0

    move p1, p5

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lio/ktor/utils/io/l;->a(Lio/ktor/utils/io/g;ILx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
