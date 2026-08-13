.class public final LV9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV9/g$a;
    }
.end annotation


# instance fields
.field private final C:Z

.field private final D:LX9/f;

.field private final E:LV9/g$a;

.field private final F:Z

.field private final G:Z

.field private H:Z

.field private I:I

.field private J:J

.field private K:Z

.field private L:Z

.field private M:Z

.field private final N:LX9/d;

.field private final O:LX9/d;

.field private P:LV9/c;

.field private final Q:[B

.field private final R:LX9/d$a;


# direct methods
.method public constructor <init>(ZLX9/f;LV9/g$a;ZZ)V
    .locals 1

    .prologue
    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameCallback"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LV9/g;->C:Z

    iput-object p2, p0, LV9/g;->D:LX9/f;

    iput-object p3, p0, LV9/g;->E:LV9/g$a;

    iput-boolean p4, p0, LV9/g;->F:Z

    iput-boolean p5, p0, LV9/g;->G:Z

    new-instance p2, LX9/d;

    invoke-direct {p2}, LX9/d;-><init>()V

    iput-object p2, p0, LV9/g;->N:LX9/d;

    new-instance p2, LX9/d;

    invoke-direct {p2}, LX9/d;-><init>()V

    iput-object p2, p0, LV9/g;->O:LX9/d;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    move-object p3, p2

    goto :goto_0

    :cond_0
    const/4 p3, 0x4

    new-array p3, p3, [B

    :goto_0
    iput-object p3, p0, LV9/g;->Q:[B

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, LX9/d$a;

    invoke-direct {p2}, LX9/d$a;-><init>()V

    :goto_1
    iput-object p2, p0, LV9/g;->R:LX9/d$a;

    return-void
.end method

.method private final f()V
    .locals 6

    .prologue
    iget-wide v0, p0, LV9/g;->J:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v4, p0, LV9/g;->D:LX9/f;

    iget-object v5, p0, LV9/g;->N:LX9/d;

    invoke-interface {v4, v5, v0, v1}, LX9/f;->Q0(LX9/d;J)V

    iget-boolean v0, p0, LV9/g;->C:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LV9/g;->N:LX9/d;

    iget-object v1, p0, LV9/g;->R:LX9/d$a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LX9/d;->E0(LX9/d$a;)LX9/d$a;

    iget-object v0, p0, LV9/g;->R:LX9/d$a;

    invoke-virtual {v0, v2, v3}, LX9/d$a;->i(J)I

    sget-object v0, LV9/f;->a:LV9/f;

    iget-object v1, p0, LV9/g;->R:LX9/d$a;

    iget-object v4, p0, LV9/g;->Q:[B

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v4}, LV9/f;->b(LX9/d$a;[B)V

    iget-object v0, p0, LV9/g;->R:LX9/d$a;

    invoke-virtual {v0}, LX9/d$a;->close()V

    :cond_0
    iget v0, p0, LV9/g;->I:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown control opcode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LV9/g;->I:I

    invoke-static {v2}, LI9/d;->P(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, LV9/g;->E:LV9/g$a;

    iget-object v1, p0, LV9/g;->N:LX9/d;

    invoke-virtual {v1}, LX9/d;->P0()LX9/g;

    move-result-object v1

    invoke-interface {v0, v1}, LV9/g$a;->g(LX9/g;)V

    goto :goto_1

    :pswitch_1
    iget-object v0, p0, LV9/g;->E:LV9/g$a;

    iget-object v1, p0, LV9/g;->N:LX9/d;

    invoke-virtual {v1}, LX9/d;->P0()LX9/g;

    move-result-object v1

    invoke-interface {v0, v1}, LV9/g$a;->d(LX9/g;)V

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, LV9/g;->N:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v4, 0x1

    cmp-long v4, v0, v4

    if-eqz v4, :cond_3

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v0, p0, LV9/g;->N:LX9/d;

    invoke-virtual {v0}, LX9/d;->p()S

    move-result v0

    iget-object v1, p0, LV9/g;->N:LX9/d;

    invoke-virtual {v1}, LX9/d;->Y0()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LV9/f;->a:LV9/f;

    invoke-virtual {v2, v0}, LV9/f;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v0, 0x3ed

    const-string v1, ""

    :goto_0
    iget-object v2, p0, LV9/g;->E:LV9/g$a;

    invoke-interface {v2, v0, v1}, LV9/g$a;->h(ILjava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LV9/g;->H:Z

    :goto_1
    return-void

    :cond_3
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Malformed close payload length of 1."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final g()V
    .locals 8

    .prologue
    iget-boolean v0, p0, LV9/g;->H:Z

    if-nez v0, :cond_14

    iget-object v0, p0, LV9/g;->D:LX9/f;

    invoke-interface {v0}, LX9/Z;->k()LX9/a0;

    move-result-object v0

    invoke-virtual {v0}, LX9/a0;->h()J

    move-result-wide v0

    iget-object v2, p0, LV9/g;->D:LX9/f;

    invoke-interface {v2}, LX9/Z;->k()LX9/a0;

    move-result-object v2

    invoke-virtual {v2}, LX9/a0;->b()LX9/a0;

    :try_start_0
    iget-object v2, p0, LV9/g;->D:LX9/f;

    invoke-interface {v2}, LX9/f;->m()B

    move-result v2

    const/16 v3, 0xff

    invoke-static {v2, v3}, LI9/d;->d(BI)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v4, p0, LV9/g;->D:LX9/f;

    invoke-interface {v4}, LX9/Z;->k()LX9/a0;

    move-result-object v4

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v0, v1, v5}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    and-int/lit8 v0, v2, 0xf

    iput v0, p0, LV9/g;->I:I

    and-int/lit16 v1, v2, 0x80

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iput-boolean v1, p0, LV9/g;->K:Z

    and-int/lit8 v6, v2, 0x8

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    iput-boolean v6, p0, LV9/g;->L:Z

    if-eqz v6, :cond_3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frames must be final."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    and-int/lit8 v1, v2, 0x40

    if-eqz v1, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    const-string v6, "Unexpected rsv1 flag"

    if-eq v0, v5, :cond_6

    const/4 v7, 0x2

    if-eq v0, v7, :cond_6

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v6}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-eqz v1, :cond_8

    iget-boolean v0, p0, LV9/g;->F:Z

    if-eqz v0, :cond_7

    move v0, v5

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v6}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move v0, v4

    :goto_4
    iput-boolean v0, p0, LV9/g;->M:Z

    :goto_5
    and-int/lit8 v0, v2, 0x20

    if-nez v0, :cond_13

    and-int/lit8 v0, v2, 0x10

    if-nez v0, :cond_12

    iget-object v0, p0, LV9/g;->D:LX9/f;

    invoke-interface {v0}, LX9/f;->m()B

    move-result v0

    invoke-static {v0, v3}, LI9/d;->d(BI)I

    move-result v0

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_9

    move v4, v5

    :cond_9
    iget-boolean v1, p0, LV9/g;->C:Z

    if-ne v4, v1, :cond_b

    new-instance v0, Ljava/net/ProtocolException;

    iget-boolean v1, p0, LV9/g;->C:Z

    if-eqz v1, :cond_a

    const-string v1, "Server-sent frames must not be masked."

    goto :goto_6

    :cond_a
    const-string v1, "Client-sent frames must be masked."

    :goto_6
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    and-int/lit8 v0, v0, 0x7f

    int-to-long v0, v0

    iput-wide v0, p0, LV9/g;->J:J

    const-wide/16 v2, 0x7e

    cmp-long v2, v0, v2

    if-nez v2, :cond_c

    iget-object v0, p0, LV9/g;->D:LX9/f;

    invoke-interface {v0}, LX9/f;->p()S

    move-result v0

    const v1, 0xffff

    invoke-static {v0, v1}, LI9/d;->e(SI)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, LV9/g;->J:J

    goto :goto_7

    :cond_c
    const-wide/16 v2, 0x7f

    cmp-long v0, v0, v2

    if-nez v0, :cond_e

    iget-object v0, p0, LV9/g;->D:LX9/f;

    invoke-interface {v0}, LX9/f;->O()J

    move-result-wide v0

    iput-wide v0, p0, LV9/g;->J:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Frame length 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LV9/g;->J:J

    invoke-static {v2, v3}, LI9/d;->Q(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " > 0x7FFFFFFFFFFFFFFF"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_7
    iget-boolean v0, p0, LV9/g;->L:Z

    if-eqz v0, :cond_10

    iget-wide v0, p0, LV9/g;->J:J

    const-wide/16 v2, 0x7d

    cmp-long v0, v0, v2

    if-gtz v0, :cond_f

    goto :goto_8

    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frame must be less than 125B."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_8
    if-eqz v4, :cond_11

    iget-object v0, p0, LV9/g;->D:LX9/f;

    iget-object v1, p0, LV9/g;->Q:[B

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LX9/f;->C0([B)V

    :cond_11
    return-void

    :cond_12
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv3 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv2 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, LV9/g;->D:LX9/f;

    invoke-interface {v3}, LX9/Z;->k()LX9/a0;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    throw v2

    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final i()V
    .locals 5

    .prologue
    :goto_0
    iget-boolean v0, p0, LV9/g;->H:Z

    if-nez v0, :cond_3

    iget-wide v0, p0, LV9/g;->J:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, LV9/g;->D:LX9/f;

    iget-object v3, p0, LV9/g;->O:LX9/d;

    invoke-interface {v2, v3, v0, v1}, LX9/f;->Q0(LX9/d;J)V

    iget-boolean v0, p0, LV9/g;->C:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LV9/g;->O:LX9/d;

    iget-object v1, p0, LV9/g;->R:LX9/d$a;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LX9/d;->E0(LX9/d$a;)LX9/d$a;

    iget-object v0, p0, LV9/g;->R:LX9/d$a;

    iget-object v1, p0, LV9/g;->O:LX9/d;

    invoke-virtual {v1}, LX9/d;->d1()J

    move-result-wide v1

    iget-wide v3, p0, LV9/g;->J:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, LX9/d$a;->i(J)I

    sget-object v0, LV9/f;->a:LV9/f;

    iget-object v1, p0, LV9/g;->R:LX9/d$a;

    iget-object v2, p0, LV9/g;->Q:[B

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2}, LV9/f;->b(LX9/d$a;[B)V

    iget-object v0, p0, LV9/g;->R:LX9/d$a;

    invoke-virtual {v0}, LX9/d$a;->close()V

    :cond_0
    iget-boolean v0, p0, LV9/g;->K:Z

    if-nez v0, :cond_2

    invoke-direct {p0}, LV9/g;->r()V

    iget v0, p0, LV9/g;->I:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected continuation opcode. Got: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LV9/g;->I:I

    invoke-static {v2}, LI9/d;->P(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final o()V
    .locals 4

    .prologue
    iget v0, p0, LV9/g;->I:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown opcode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LI9/d;->P(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-direct {p0}, LV9/g;->i()V

    iget-boolean v2, p0, LV9/g;->M:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, LV9/g;->P:LV9/c;

    if-nez v2, :cond_2

    new-instance v2, LV9/c;

    iget-boolean v3, p0, LV9/g;->G:Z

    invoke-direct {v2, v3}, LV9/c;-><init>(Z)V

    iput-object v2, p0, LV9/g;->P:LV9/c;

    :cond_2
    iget-object v3, p0, LV9/g;->O:LX9/d;

    invoke-virtual {v2, v3}, LV9/c;->a(LX9/d;)V

    :cond_3
    if-ne v0, v1, :cond_4

    iget-object v0, p0, LV9/g;->E:LV9/g$a;

    iget-object v1, p0, LV9/g;->O:LX9/d;

    invoke-virtual {v1}, LX9/d;->Y0()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LV9/g$a;->e(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, LV9/g;->E:LV9/g$a;

    iget-object v1, p0, LV9/g;->O:LX9/d;

    invoke-virtual {v1}, LX9/d;->P0()LX9/g;

    move-result-object v1

    invoke-interface {v0, v1}, LV9/g$a;->a(LX9/g;)V

    :goto_1
    return-void
.end method

.method private final r()V
    .locals 1

    .prologue
    :goto_0
    iget-boolean v0, p0, LV9/g;->H:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, LV9/g;->g()V

    iget-boolean v0, p0, LV9/g;->L:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, LV9/g;->f()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    invoke-direct {p0}, LV9/g;->g()V

    iget-boolean v0, p0, LV9/g;->L:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, LV9/g;->f()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LV9/g;->o()V

    :goto_0
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    iget-object v0, p0, LV9/g;->P:LV9/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV9/c;->close()V

    :cond_0
    return-void
.end method
