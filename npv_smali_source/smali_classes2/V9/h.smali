.class public final LV9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final C:Z

.field private final D:LX9/e;

.field private final E:Ljava/util/Random;

.field private final F:Z

.field private final G:Z

.field private final H:J

.field private final I:LX9/d;

.field private final J:LX9/d;

.field private K:Z

.field private L:LV9/a;

.field private final M:[B

.field private final N:LX9/d$a;


# direct methods
.method public constructor <init>(ZLX9/e;Ljava/util/Random;ZZJ)V
    .locals 1

    .prologue
    const-string v0, "sink"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LV9/h;->C:Z

    iput-object p2, p0, LV9/h;->D:LX9/e;

    iput-object p3, p0, LV9/h;->E:Ljava/util/Random;

    iput-boolean p4, p0, LV9/h;->F:Z

    iput-boolean p5, p0, LV9/h;->G:Z

    iput-wide p6, p0, LV9/h;->H:J

    new-instance p3, LX9/d;

    invoke-direct {p3}, LX9/d;-><init>()V

    iput-object p3, p0, LV9/h;->I:LX9/d;

    invoke-interface {p2}, LX9/e;->d()LX9/d;

    move-result-object p2

    iput-object p2, p0, LV9/h;->J:LX9/d;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p3, 0x4

    new-array p3, p3, [B

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    iput-object p3, p0, LV9/h;->M:[B

    if-eqz p1, :cond_1

    new-instance p2, LX9/d$a;

    invoke-direct {p2}, LX9/d$a;-><init>()V

    :cond_1
    iput-object p2, p0, LV9/h;->N:LX9/d$a;

    return-void
.end method

.method private final f(ILX9/g;)V
    .locals 5

    .prologue
    iget-boolean v0, p0, LV9/h;->K:Z

    if-nez v0, :cond_3

    invoke-virtual {p2}, LX9/g;->I()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x7d

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2

    or-int/lit16 p1, p1, 0x80

    iget-object v1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v1, p1}, LX9/d;->v1(I)LX9/d;

    iget-boolean p1, p0, LV9/h;->C:Z

    if-eqz p1, :cond_0

    or-int/lit16 p1, v0, 0x80

    iget-object v1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v1, p1}, LX9/d;->v1(I)LX9/d;

    iget-object p1, p0, LV9/h;->E:Ljava/util/Random;

    iget-object v1, p0, LV9/h;->M:[B

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, LV9/h;->J:LX9/d;

    iget-object v1, p0, LV9/h;->M:[B

    invoke-virtual {p1, v1}, LX9/d;->t1([B)LX9/d;

    if-lez v0, :cond_1

    iget-object p1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide v0

    iget-object p1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {p1, p2}, LX9/d;->m1(LX9/g;)LX9/d;

    iget-object p1, p0, LV9/h;->J:LX9/d;

    iget-object p2, p0, LV9/h;->N:LX9/d$a;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LX9/d;->E0(LX9/d$a;)LX9/d$a;

    iget-object p1, p0, LV9/h;->N:LX9/d$a;

    invoke-virtual {p1, v0, v1}, LX9/d$a;->i(J)I

    sget-object p1, LV9/f;->a:LV9/f;

    iget-object p2, p0, LV9/h;->N:LX9/d$a;

    iget-object v0, p0, LV9/h;->M:[B

    invoke-virtual {p1, p2, v0}, LV9/f;->b(LX9/d$a;[B)V

    iget-object p1, p0, LV9/h;->N:LX9/d$a;

    invoke-virtual {p1}, LX9/d$a;->close()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {p1, v0}, LX9/d;->v1(I)LX9/d;

    iget-object p1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {p1, p2}, LX9/d;->m1(LX9/g;)LX9/d;

    :cond_1
    :goto_0
    iget-object p1, p0, LV9/h;->D:LX9/e;

    invoke-interface {p1}, LX9/e;->flush()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Payload size must be less than or equal to 125"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(ILX9/g;)V
    .locals 1

    .prologue
    sget-object v0, LX9/g;->G:LX9/g;

    if-nez p1, :cond_0

    if-eqz p2, :cond_3

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, LV9/f;->a:LV9/f;

    invoke-virtual {v0, p1}, LV9/f;->c(I)V

    :cond_1
    new-instance v0, LX9/d;

    invoke-direct {v0}, LX9/d;-><init>()V

    invoke-virtual {v0, p1}, LX9/d;->z1(I)LX9/d;

    if-eqz p2, :cond_2

    invoke-virtual {v0, p2}, LX9/d;->m1(LX9/g;)LX9/d;

    :cond_2
    invoke-virtual {v0}, LX9/d;->P0()LX9/g;

    move-result-object v0

    :cond_3
    const/16 p1, 0x8

    const/4 p2, 0x1

    :try_start_0
    invoke-direct {p0, p1, v0}, LV9/h;->f(ILX9/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p2, p0, LV9/h;->K:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean p2, p0, LV9/h;->K:Z

    throw p1
.end method

.method public close()V
    .locals 1

    .prologue
    iget-object v0, p0, LV9/h;->L:LV9/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV9/a;->close()V

    :cond_0
    return-void
.end method

.method public final g(ILX9/g;)V
    .locals 5

    .prologue
    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LV9/h;->K:Z

    if-nez v0, :cond_6

    iget-object v0, p0, LV9/h;->I:LX9/d;

    invoke-virtual {v0, p2}, LX9/d;->m1(LX9/g;)LX9/d;

    or-int/lit16 v0, p1, 0x80

    iget-boolean v1, p0, LV9/h;->F:Z

    if-eqz v1, :cond_1

    invoke-virtual {p2}, LX9/g;->I()I

    move-result p2

    int-to-long v1, p2

    iget-wide v3, p0, LV9/h;->H:J

    cmp-long p2, v1, v3

    if-ltz p2, :cond_1

    iget-object p2, p0, LV9/h;->L:LV9/a;

    if-nez p2, :cond_0

    new-instance p2, LV9/a;

    iget-boolean v0, p0, LV9/h;->G:Z

    invoke-direct {p2, v0}, LV9/a;-><init>(Z)V

    iput-object p2, p0, LV9/h;->L:LV9/a;

    :cond_0
    iget-object v0, p0, LV9/h;->I:LX9/d;

    invoke-virtual {p2, v0}, LV9/a;->a(LX9/d;)V

    or-int/lit16 v0, p1, 0xc0

    :cond_1
    iget-object p1, p0, LV9/h;->I:LX9/d;

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide p1

    iget-object v1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v1, v0}, LX9/d;->v1(I)LX9/d;

    iget-boolean v0, p0, LV9/h;->C:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x80

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v1, 0x7d

    cmp-long v1, p1, v1

    if-gtz v1, :cond_3

    long-to-int v1, p1

    or-int/2addr v0, v1

    iget-object v1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v1, v0}, LX9/d;->v1(I)LX9/d;

    goto :goto_1

    :cond_3
    const-wide/32 v1, 0xffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_4

    or-int/lit8 v0, v0, 0x7e

    iget-object v1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v1, v0}, LX9/d;->v1(I)LX9/d;

    iget-object v0, p0, LV9/h;->J:LX9/d;

    long-to-int v1, p1

    invoke-virtual {v0, v1}, LX9/d;->z1(I)LX9/d;

    goto :goto_1

    :cond_4
    or-int/lit8 v0, v0, 0x7f

    iget-object v1, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v1, v0}, LX9/d;->v1(I)LX9/d;

    iget-object v0, p0, LV9/h;->J:LX9/d;

    invoke-virtual {v0, p1, p2}, LX9/d;->y1(J)LX9/d;

    :goto_1
    iget-boolean v0, p0, LV9/h;->C:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, LV9/h;->E:Ljava/util/Random;

    iget-object v1, p0, LV9/h;->M:[B

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object v0, p0, LV9/h;->J:LX9/d;

    iget-object v1, p0, LV9/h;->M:[B

    invoke-virtual {v0, v1}, LX9/d;->t1([B)LX9/d;

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_5

    iget-object v2, p0, LV9/h;->I:LX9/d;

    iget-object v3, p0, LV9/h;->N:LX9/d$a;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, LX9/d;->E0(LX9/d$a;)LX9/d$a;

    iget-object v2, p0, LV9/h;->N:LX9/d$a;

    invoke-virtual {v2, v0, v1}, LX9/d$a;->i(J)I

    sget-object v0, LV9/f;->a:LV9/f;

    iget-object v1, p0, LV9/h;->N:LX9/d$a;

    iget-object v2, p0, LV9/h;->M:[B

    invoke-virtual {v0, v1, v2}, LV9/f;->b(LX9/d$a;[B)V

    iget-object v0, p0, LV9/h;->N:LX9/d$a;

    invoke-virtual {v0}, LX9/d$a;->close()V

    :cond_5
    iget-object v0, p0, LV9/h;->J:LX9/d;

    iget-object v1, p0, LV9/h;->I:LX9/d;

    invoke-virtual {v0, v1, p1, p2}, LX9/d;->F0(LX9/d;J)V

    iget-object p1, p0, LV9/h;->D:LX9/e;

    invoke-interface {p1}, LX9/e;->E()LX9/e;

    return-void

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(LX9/g;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-direct {p0, v0, p1}, LV9/h;->f(ILX9/g;)V

    return-void
.end method

.method public final o(LX9/g;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-direct {p0, v0, p1}, LV9/h;->f(ILX9/g;)V

    return-void
.end method
