.class public final LO9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN9/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO9/b$a;,
        LO9/b$b;,
        LO9/b$c;,
        LO9/b$d;,
        LO9/b$e;,
        LO9/b$f;,
        LO9/b$g;
    }
.end annotation


# static fields
.field public static final h:LO9/b$d;


# instance fields
.field private final a:LH9/x;

.field private final b:LM9/f;

.field private final c:LX9/f;

.field private final d:LX9/e;

.field private e:I

.field private final f:LO9/a;

.field private g:LH9/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO9/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO9/b$d;-><init>(Ly7/k;)V

    sput-object v0, LO9/b;->h:LO9/b$d;

    return-void
.end method

.method public constructor <init>(LH9/x;LM9/f;LX9/f;LX9/e;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO9/b;->a:LH9/x;

    iput-object p2, p0, LO9/b;->b:LM9/f;

    iput-object p3, p0, LO9/b;->c:LX9/f;

    iput-object p4, p0, LO9/b;->d:LX9/e;

    new-instance p1, LO9/a;

    invoke-direct {p1, p3}, LO9/a;-><init>(LX9/f;)V

    iput-object p1, p0, LO9/b;->f:LO9/a;

    return-void
.end method

.method public static final synthetic i(LO9/b;LX9/n;)V
    .locals 0

    invoke-direct {p0, p1}, LO9/b;->r(LX9/n;)V

    return-void
.end method

.method public static final synthetic j(LO9/b;)LH9/x;
    .locals 0

    iget-object p0, p0, LO9/b;->a:LH9/x;

    return-object p0
.end method

.method public static final synthetic k(LO9/b;)LO9/a;
    .locals 0

    iget-object p0, p0, LO9/b;->f:LO9/a;

    return-object p0
.end method

.method public static final synthetic l(LO9/b;)LX9/e;
    .locals 0

    iget-object p0, p0, LO9/b;->d:LX9/e;

    return-object p0
.end method

.method public static final synthetic m(LO9/b;)LX9/f;
    .locals 0

    iget-object p0, p0, LO9/b;->c:LX9/f;

    return-object p0
.end method

.method public static final synthetic n(LO9/b;)I
    .locals 0

    iget p0, p0, LO9/b;->e:I

    return p0
.end method

.method public static final synthetic o(LO9/b;)LH9/t;
    .locals 0

    iget-object p0, p0, LO9/b;->g:LH9/t;

    return-object p0
.end method

.method public static final synthetic p(LO9/b;I)V
    .locals 0

    iput p1, p0, LO9/b;->e:I

    return-void
.end method

.method public static final synthetic q(LO9/b;LH9/t;)V
    .locals 0

    iput-object p1, p0, LO9/b;->g:LH9/t;

    return-void
.end method

.method private final r(LX9/n;)V
    .locals 2

    invoke-virtual {p1}, LX9/n;->i()LX9/a0;

    move-result-object v0

    sget-object v1, LX9/a0;->e:LX9/a0;

    invoke-virtual {p1, v1}, LX9/n;->j(LX9/a0;)LX9/n;

    invoke-virtual {v0}, LX9/a0;->a()LX9/a0;

    invoke-virtual {v0}, LX9/a0;->b()LX9/a0;

    return-void
.end method

.method private final s(LH9/z;)Z
    .locals 2

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1, v0}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private final t(LH9/B;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Transfer-Encoding"

    invoke-static {p1, v2, v0, v1, v0}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1, v0}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private final u()LX9/X;
    .locals 2

    .prologue
    iget v0, p0, LO9/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LO9/b;->e:I

    new-instance v0, LO9/b$b;

    invoke-direct {v0, p0}, LO9/b$b;-><init>(LO9/b;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LO9/b;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final v(LH9/u;)LX9/Z;
    .locals 2

    .prologue
    iget v0, p0, LO9/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LO9/b;->e:I

    new-instance v0, LO9/b$c;

    invoke-direct {v0, p0, p1}, LO9/b$c;-><init>(LO9/b;LH9/u;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LO9/b;->e:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final w(J)LX9/Z;
    .locals 2

    .prologue
    iget v0, p0, LO9/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LO9/b;->e:I

    new-instance v0, LO9/b$e;

    invoke-direct {v0, p0, p1, p2}, LO9/b$e;-><init>(LO9/b;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LO9/b;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final x()LX9/X;
    .locals 2

    .prologue
    iget v0, p0, LO9/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LO9/b;->e:I

    new-instance v0, LO9/b$f;

    invoke-direct {v0, p0}, LO9/b$f;-><init>(LO9/b;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LO9/b;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final y()LX9/Z;
    .locals 2

    .prologue
    iget v0, p0, LO9/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LO9/b;->e:I

    invoke-virtual {p0}, LO9/b;->e()LM9/f;

    move-result-object v0

    invoke-virtual {v0}, LM9/f;->z()V

    new-instance v0, LO9/b$g;

    invoke-direct {v0, p0}, LO9/b$g;-><init>(LO9/b;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LO9/b;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final A(LH9/t;Ljava/lang/String;)V
    .locals 4

    .prologue
    const-string v0, "headers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LO9/b;->e:I

    if-nez v0, :cond_1

    iget-object v0, p0, LO9/b;->d:LX9/e;

    invoke-interface {v0, p2}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    invoke-virtual {p1}, LH9/t;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p0, LO9/b;->d:LX9/e;

    invoke-virtual {p1, v1}, LH9/t;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    move-result-object v2

    const-string v3, ": "

    invoke-interface {v2, v3}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    move-result-object v2

    invoke-virtual {p1, v1}, LH9/t;->s(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    move-result-object v2

    invoke-interface {v2, v0}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LO9/b;->d:LX9/e;

    invoke-interface {p1, v0}, LX9/e;->t0(Ljava/lang/String;)LX9/e;

    const/4 p1, 0x1

    iput p1, p0, LO9/b;->e:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "state: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LO9/b;->e:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(LH9/B;)J
    .locals 2

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LN9/e;->b(LH9/B;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, LO9/b;->t(LH9/B;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, LI9/d;->v(LH9/B;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LO9/b;->d:LX9/e;

    invoke-interface {v0}, LX9/e;->flush()V

    return-void
.end method

.method public c(LH9/B;)LX9/Z;
    .locals 4

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LN9/e;->b(LH9/B;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, v1}, LO9/b;->w(J)LX9/Z;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, LO9/b;->t(LH9/B;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object p1

    invoke-virtual {p1}, LH9/z;->i()LH9/u;

    move-result-object p1

    invoke-direct {p0, p1}, LO9/b;->v(LH9/u;)LX9/Z;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, LI9/d;->v(LH9/B;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, LO9/b;->y()LX9/Z;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public cancel()V
    .locals 1

    invoke-virtual {p0}, LO9/b;->e()LM9/f;

    move-result-object v0

    invoke-virtual {v0}, LM9/f;->d()V

    return-void
.end method

.method public d(Z)LH9/B$a;
    .locals 4

    .prologue
    iget v0, p0, LO9/b;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LO9/b;->e:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    :try_start_0
    sget-object v0, LN9/k;->d:LN9/k$a;

    iget-object v1, p0, LO9/b;->f:LO9/a;

    invoke-virtual {v1}, LO9/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN9/k$a;->a(Ljava/lang/String;)LN9/k;

    move-result-object v0

    new-instance v1, LH9/B$a;

    invoke-direct {v1}, LH9/B$a;-><init>()V

    iget-object v3, v0, LN9/k;->a:LH9/y;

    invoke-virtual {v1, v3}, LH9/B$a;->p(LH9/y;)LH9/B$a;

    move-result-object v1

    iget v3, v0, LN9/k;->b:I

    invoke-virtual {v1, v3}, LH9/B$a;->g(I)LH9/B$a;

    move-result-object v1

    iget-object v3, v0, LN9/k;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, LH9/B$a;->m(Ljava/lang/String;)LH9/B$a;

    move-result-object v1

    iget-object v3, p0, LO9/b;->f:LO9/a;

    invoke-virtual {v3}, LO9/a;->a()LH9/t;

    move-result-object v3

    invoke-virtual {v1, v3}, LH9/B$a;->k(LH9/t;)LH9/B$a;

    move-result-object v1

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, LN9/k;->b:I

    if-ne p1, v3, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    iget p1, v0, LN9/k;->b:I

    if-ne p1, v3, :cond_3

    :goto_1
    iput v2, p0, LO9/b;->e:I

    goto :goto_2

    :cond_3
    const/16 v0, 0x66

    if-gt v0, p1, :cond_4

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, LO9/b;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return-object v1

    :goto_3
    invoke-virtual {p0}, LO9/b;->e()LM9/f;

    move-result-object v0

    invoke-virtual {v0}, LM9/f;->A()LH9/D;

    move-result-object v0

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->n()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected end of stream on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public e()LM9/f;
    .locals 1

    iget-object v0, p0, LO9/b;->b:LM9/f;

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, LO9/b;->d:LX9/e;

    invoke-interface {v0}, LX9/e;->flush()V

    return-void
.end method

.method public g(LH9/z;J)LX9/X;
    .locals 2

    .prologue
    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH9/z;->a()LH9/A;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LH9/z;->a()LH9/A;

    move-result-object v0

    invoke-virtual {v0}, LH9/A;->c()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, LO9/b;->s(LH9/z;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, LO9/b;->u()LX9/X;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    invoke-direct {p0}, LO9/b;->x()LX9/X;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(LH9/z;)V
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN9/i;->a:LN9/i;

    invoke-virtual {p0}, LO9/b;->e()LM9/f;

    move-result-object v1

    invoke-virtual {v1}, LM9/f;->A()LH9/D;

    move-result-object v1

    invoke-virtual {v1}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    const-string v2, "connection.route().proxy.type()"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, LN9/i;->a(LH9/z;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LH9/z;->e()LH9/t;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, LO9/b;->A(LH9/t;Ljava/lang/String;)V

    return-void
.end method

.method public final z(LH9/B;)V
    .locals 4

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LI9/d;->v(LH9/B;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v0, v1}, LO9/b;->w(J)LX9/Z;

    move-result-object p1

    const v0, 0x7fffffff

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, LI9/d;->K(LX9/Z;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p1}, LX9/Z;->close()V

    return-void
.end method
