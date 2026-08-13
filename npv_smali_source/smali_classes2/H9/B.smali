.class public final LH9/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/B$a;
    }
.end annotation


# instance fields
.field private final C:LH9/z;

.field private final D:LH9/y;

.field private final E:Ljava/lang/String;

.field private final F:I

.field private final G:LH9/s;

.field private final H:LH9/t;

.field private final I:LH9/C;

.field private final J:LH9/B;

.field private final K:LH9/B;

.field private final L:LH9/B;

.field private final M:J

.field private final N:J

.field private final O:LM9/c;

.field private P:LH9/d;


# direct methods
.method public constructor <init>(LH9/z;LH9/y;Ljava/lang/String;ILH9/s;LH9/t;LH9/C;LH9/B;LH9/B;LH9/B;JJLM9/c;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    const-string v5, "request"

    invoke-static {p1, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "protocol"

    invoke-static {p2, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "message"

    invoke-static {p3, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "headers"

    invoke-static {p6, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LH9/B;->C:LH9/z;

    iput-object v2, v0, LH9/B;->D:LH9/y;

    iput-object v3, v0, LH9/B;->E:Ljava/lang/String;

    move v1, p4

    iput v1, v0, LH9/B;->F:I

    move-object v1, p5

    iput-object v1, v0, LH9/B;->G:LH9/s;

    iput-object v4, v0, LH9/B;->H:LH9/t;

    move-object v1, p7

    iput-object v1, v0, LH9/B;->I:LH9/C;

    move-object v1, p8

    iput-object v1, v0, LH9/B;->J:LH9/B;

    move-object v1, p9

    iput-object v1, v0, LH9/B;->K:LH9/B;

    move-object/from16 v1, p10

    iput-object v1, v0, LH9/B;->L:LH9/B;

    move-wide/from16 v1, p11

    iput-wide v1, v0, LH9/B;->M:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, LH9/B;->N:J

    move-object/from16 v1, p15

    iput-object v1, v0, LH9/B;->O:LM9/c;

    return-void
.end method

.method public static synthetic D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LH9/B;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final H()LH9/t;
    .locals 1

    iget-object v0, p0, LH9/B;->H:LH9/t;

    return-object v0
.end method

.method public final N()Z
    .locals 3

    .prologue
    iget v0, p0, LH9/B;->F:I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    if-gt v1, v0, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public final R()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH9/B;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final a()LH9/C;
    .locals 1

    iget-object v0, p0, LH9/B;->I:LH9/C;

    return-object v0
.end method

.method public close()V
    .locals 2

    .prologue
    iget-object v0, p0, LH9/B;->I:LH9/C;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH9/C;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e0()LH9/B;
    .locals 1

    iget-object v0, p0, LH9/B;->J:LH9/B;

    return-object v0
.end method

.method public final f()LH9/d;
    .locals 2

    .prologue
    iget-object v0, p0, LH9/B;->P:LH9/d;

    if-nez v0, :cond_0

    sget-object v0, LH9/d;->n:LH9/d$b;

    iget-object v1, p0, LH9/B;->H:LH9/t;

    invoke-virtual {v0, v1}, LH9/d$b;->b(LH9/t;)LH9/d;

    move-result-object v0

    iput-object v0, p0, LH9/B;->P:LH9/d;

    :cond_0
    return-object v0
.end method

.method public final g()LH9/B;
    .locals 1

    iget-object v0, p0, LH9/B;->K:LH9/B;

    return-object v0
.end method

.method public final g0()LH9/B$a;
    .locals 1

    new-instance v0, LH9/B$a;

    invoke-direct {v0, p0}, LH9/B$a;-><init>(LH9/B;)V

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 3

    .prologue
    iget-object v0, p0, LH9/B;->H:LH9/t;

    iget v1, p0, LH9/B;->F:I

    const/16 v2, 0x191

    if-eq v1, v2, :cond_1

    const/16 v2, 0x197

    if-eq v1, v2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, "Proxy-Authenticate"

    goto :goto_0

    :cond_1
    const-string v1, "WWW-Authenticate"

    :goto_0
    invoke-static {v0, v1}, LN9/e;->a(LH9/t;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final n0()LH9/B;
    .locals 1

    iget-object v0, p0, LH9/B;->L:LH9/B;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, LH9/B;->F:I

    return v0
.end method

.method public final o0()LH9/y;
    .locals 1

    iget-object v0, p0, LH9/B;->D:LH9/y;

    return-object v0
.end method

.method public final q0()J
    .locals 2

    iget-wide v0, p0, LH9/B;->N:J

    return-wide v0
.end method

.method public final r()LM9/c;
    .locals 1

    iget-object v0, p0, LH9/B;->O:LM9/c;

    return-object v0
.end method

.method public final r0()LH9/z;
    .locals 1

    iget-object v0, p0, LH9/B;->C:LH9/z;

    return-object v0
.end method

.method public final s()LH9/s;
    .locals 1

    iget-object v0, p0, LH9/B;->G:LH9/s;

    return-object v0
.end method

.method public final s0()J
    .locals 2

    iget-wide v0, p0, LH9/B;->M:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH9/B;->D:LH9/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LH9/B;->F:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH9/B;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH9/B;->C:LH9/z;

    invoke-virtual {v1}, LH9/z;->i()LH9/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/B;->H:LH9/t;

    invoke-virtual {v0, p1}, LH9/t;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    return-object p2
.end method
