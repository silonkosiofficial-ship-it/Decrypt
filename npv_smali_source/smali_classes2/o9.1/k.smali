.class public final Lo9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/k$a;
    }
.end annotation


# static fields
.field public static final h:Lo9/k$a;


# instance fields
.field private final a:[B

.field private b:I

.field private c:I

.field private d:Lo9/l;

.field public e:Z

.field private f:Lo9/k;

.field private g:Lo9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo9/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo9/k$a;-><init>(Ly7/k;)V

    sput-object v0, Lo9/k;->h:Lo9/k$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lo9/k;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo9/k;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lo9/k;->d:Lo9/l;

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lo9/k;-><init>()V

    return-void
.end method

.method private constructor <init>([BIILo9/l;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/k;->a:[B

    iput p2, p0, Lo9/k;->b:I

    iput p3, p0, Lo9/k;->c:I

    iput-object p4, p0, Lo9/k;->d:Lo9/l;

    iput-boolean p5, p0, Lo9/k;->e:Z

    return-void
.end method

.method public synthetic constructor <init>([BIILo9/l;ZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lo9/k;-><init>([BIILo9/l;Z)V

    return-void
.end method


# virtual methods
.method public final A([BII)V
    .locals 2

    const-string v0, "src"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    invoke-static {p1, v0, v1, p2, p3}, Lj7/n;->g([B[BIII)[B

    iget p1, p0, Lo9/k;->c:I

    sub-int/2addr p3, p2

    add-int/2addr p1, p3

    iput p1, p0, Lo9/k;->c:I

    return-void
.end method

.method public final synthetic B([BI)V
    .locals 0

    const-string p2, "data"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final C(B)V
    .locals 3

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo9/k;->c:I

    aput-byte p1, v0, v1

    return-void
.end method

.method public final D(S)V
    .locals 4

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    add-int/lit8 v2, v1, 0x1

    ushr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x2

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    iput v1, p0, Lo9/k;->c:I

    return-void
.end method

.method public final E(Lo9/k;I)V
    .locals 9

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lo9/k;->e:Z

    if-eqz v0, :cond_3

    iget v0, p1, Lo9/k;->c:I

    add-int/2addr v0, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    invoke-virtual {p1}, Lo9/k;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget v6, p1, Lo9/k;->c:I

    add-int v0, v6, p2

    iget v5, p1, Lo9/k;->b:I

    sub-int/2addr v0, v5

    if-gt v0, v1, :cond_0

    iget-object v3, p1, Lo9/k;->a:[B

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v2, v3

    invoke-static/range {v2 .. v8}, Lj7/n;->m([B[BIIIILjava/lang/Object;)[B

    iget v0, p1, Lo9/k;->c:I

    iget v1, p1, Lo9/k;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Lo9/k;->c:I

    const/4 v0, 0x0

    iput v0, p1, Lo9/k;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lo9/k;->a:[B

    iget-object v1, p1, Lo9/k;->a:[B

    iget v2, p1, Lo9/k;->c:I

    iget v3, p0, Lo9/k;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lj7/n;->g([B[BIII)[B

    iget v0, p1, Lo9/k;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lo9/k;->c:I

    iget p1, p0, Lo9/k;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lo9/k;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a()Lo9/k;
    .locals 3

    .prologue
    iget-object v0, p0, Lo9/k;->g:Lo9/k;

    if-eqz v0, :cond_4

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v0, v0, Lo9/k;->e:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget v0, p0, Lo9/k;->c:I

    iget v1, p0, Lo9/k;->b:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo9/k;->g:Lo9/k;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, v1, Lo9/k;->c:I

    rsub-int v1, v1, 0x2000

    iget-object v2, p0, Lo9/k;->g:Lo9/k;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lo9/k;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lo9/k;->g:Lo9/k;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, v2, Lo9/k;->b:I

    :goto_0
    add-int/2addr v1, v2

    if-le v0, v1, :cond_2

    return-object p0

    :cond_2
    iget-object v1, p0, Lo9/k;->g:Lo9/k;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0}, Lo9/k;->E(Lo9/k;I)V

    invoke-virtual {p0}, Lo9/k;->l()Lo9/k;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {p0}, Lo9/n;->d(Lo9/k;)V

    return-object v1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot compact"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic b(Z)[B
    .locals 0

    iget-object p1, p0, Lo9/k;->a:[B

    return-object p1
.end method

.method public final c()Lo9/l;
    .locals 1

    iget-object v0, p0, Lo9/k;->d:Lo9/l;

    return-object v0
.end method

.method public final synthetic d()I
    .locals 1

    iget v0, p0, Lo9/k;->c:I

    return v0
.end method

.method public final synthetic e()Lo9/k;
    .locals 1

    iget-object v0, p0, Lo9/k;->f:Lo9/k;

    return-object v0
.end method

.method public final synthetic f()I
    .locals 1

    iget v0, p0, Lo9/k;->b:I

    return v0
.end method

.method public final synthetic g()Lo9/k;
    .locals 1

    iget-object v0, p0, Lo9/k;->g:Lo9/k;

    return-object v0
.end method

.method public final synthetic h()I
    .locals 2

    iget-object v0, p0, Lo9/k;->a:[B

    array-length v0, v0

    iget v1, p0, Lo9/k;->c:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lo9/k;->d:Lo9/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo9/l;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final synthetic j()I
    .locals 2

    iget v0, p0, Lo9/k;->c:I

    iget v1, p0, Lo9/k;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final k(I)B
    .locals 2

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->b:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final l()Lo9/k;
    .locals 3

    .prologue
    iget-object v0, p0, Lo9/k;->f:Lo9/k;

    iget-object v1, p0, Lo9/k;->g:Lo9/k;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lo9/k;->f:Lo9/k;

    iput-object v2, v1, Lo9/k;->f:Lo9/k;

    :cond_0
    iget-object v1, p0, Lo9/k;->f:Lo9/k;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lo9/k;->g:Lo9/k;

    iput-object v2, v1, Lo9/k;->g:Lo9/k;

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lo9/k;->f:Lo9/k;

    iput-object v1, p0, Lo9/k;->g:Lo9/k;

    return-object v0
.end method

.method public final m(Lo9/k;)Lo9/k;
    .locals 1

    .prologue
    const-string v0, "segment"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lo9/k;->g:Lo9/k;

    iget-object v0, p0, Lo9/k;->f:Lo9/k;

    iput-object v0, p1, Lo9/k;->f:Lo9/k;

    iget-object v0, p0, Lo9/k;->f:Lo9/k;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object p1, v0, Lo9/k;->g:Lo9/k;

    :cond_0
    iput-object p1, p0, Lo9/k;->f:Lo9/k;

    return-object p1
.end method

.method public final n()B
    .locals 3

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo9/k;->b:I

    aget-byte v0, v0, v1

    return v0
.end method

.method public final o()S
    .locals 4

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v1, v1, 0x2

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v3

    int-to-short v0, v0

    iput v1, p0, Lo9/k;->b:I

    return v0
.end method

.method public final p([BII)V
    .locals 3

    const-string v0, "dst"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sub-int/2addr p3, p2

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->b:I

    add-int v2, v1, p3

    invoke-static {v0, p1, p2, v1, v2}, Lj7/n;->g([B[BIII)[B

    iget p1, p0, Lo9/k;->b:I

    add-int/2addr p1, p3

    iput p1, p0, Lo9/k;->b:I

    return-void
.end method

.method public final synthetic q(I)V
    .locals 0

    iput p1, p0, Lo9/k;->c:I

    return-void
.end method

.method public final synthetic r(Lo9/k;)V
    .locals 0

    iput-object p1, p0, Lo9/k;->f:Lo9/k;

    return-void
.end method

.method public final synthetic s(I)V
    .locals 0

    iput p1, p0, Lo9/k;->b:I

    return-void
.end method

.method public final synthetic t(Lo9/k;)V
    .locals 0

    iput-object p1, p0, Lo9/k;->g:Lo9/k;

    return-void
.end method

.method public final u(IB)V
    .locals 2

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    add-int/2addr v1, p1

    aput-byte p2, v0, v1

    return-void
.end method

.method public final v(IBB)V
    .locals 2

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    add-int/2addr v1, p1

    aput-byte p2, v0, v1

    add-int/lit8 v1, v1, 0x1

    aput-byte p3, v0, v1

    return-void
.end method

.method public final w(IBBB)V
    .locals 2

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    add-int/2addr v1, p1

    aput-byte p2, v0, v1

    add-int/lit8 p1, v1, 0x1

    aput-byte p3, v0, p1

    add-int/lit8 v1, v1, 0x2

    aput-byte p4, v0, v1

    return-void
.end method

.method public final x(IBBBB)V
    .locals 2

    iget-object v0, p0, Lo9/k;->a:[B

    iget v1, p0, Lo9/k;->c:I

    add-int/2addr v1, p1

    aput-byte p2, v0, v1

    add-int/lit8 p1, v1, 0x1

    aput-byte p3, v0, p1

    add-int/lit8 p1, v1, 0x2

    aput-byte p4, v0, p1

    add-int/lit8 v1, v1, 0x3

    aput-byte p5, v0, v1

    return-void
.end method

.method public final y()Lo9/k;
    .locals 7

    .prologue
    iget-object v0, p0, Lo9/k;->d:Lo9/l;

    if-nez v0, :cond_0

    invoke-static {}, Lo9/n;->h()Lo9/l;

    move-result-object v0

    iput-object v0, p0, Lo9/k;->d:Lo9/l;

    :cond_0
    move-object v5, v0

    iget-object v2, p0, Lo9/k;->a:[B

    iget v3, p0, Lo9/k;->b:I

    iget v4, p0, Lo9/k;->c:I

    invoke-virtual {v5}, Lo9/l;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    new-instance v0, Lo9/k;

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lo9/k;-><init>([BIILo9/l;Z)V

    return-object v0
.end method

.method public final z(I)Lo9/k;
    .locals 8

    .prologue
    if-lez p1, :cond_2

    iget v0, p0, Lo9/k;->c:I

    iget v1, p0, Lo9/k;->b:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_2

    const/16 v0, 0x400

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lo9/k;->y()Lo9/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lo9/n;->f()Lo9/k;

    move-result-object v0

    iget-object v1, p0, Lo9/k;->a:[B

    iget-object v2, v0, Lo9/k;->a:[B

    iget v4, p0, Lo9/k;->b:I

    add-int v5, v4, p1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lj7/n;->m([B[BIIIILjava/lang/Object;)[B

    :goto_0
    iget v1, v0, Lo9/k;->b:I

    add-int/2addr v1, p1

    iput v1, v0, Lo9/k;->c:I

    iget v1, p0, Lo9/k;->b:I

    add-int/2addr v1, p1

    iput v1, p0, Lo9/k;->b:I

    iget-object p1, p0, Lo9/k;->g:Lo9/k;

    if-eqz p1, :cond_1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lo9/k;->m(Lo9/k;)Lo9/k;

    goto :goto_1

    :cond_1
    iput-object p0, v0, Lo9/k;->f:Lo9/k;

    iput-object v0, p0, Lo9/k;->g:Lo9/k;

    :goto_1
    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteCount out of range"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
