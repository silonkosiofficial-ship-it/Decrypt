.class public final LX9/U;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/U$a;
    }
.end annotation


# static fields
.field public static final h:LX9/U$a;


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:LX9/U;

.field public g:LX9/U;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX9/U$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX9/U$a;-><init>(Ly7/k;)V

    sput-object v0, LX9/U;->h:LX9/U$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, LX9/U;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, LX9/U;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LX9/U;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/U;->a:[B

    iput p2, p0, LX9/U;->b:I

    iput p3, p0, LX9/U;->c:I

    iput-boolean p4, p0, LX9/U;->d:Z

    iput-boolean p5, p0, LX9/U;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, LX9/U;->g:LX9/U;

    if-eq v0, p0, :cond_3

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v0, v0, LX9/U;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, LX9/U;->c:I

    iget v1, p0, LX9/U;->b:I

    sub-int/2addr v0, v1

    iget-object v1, p0, LX9/U;->g:LX9/U;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, v1, LX9/U;->c:I

    rsub-int v1, v1, 0x2000

    iget-object v2, p0, LX9/U;->g:LX9/U;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v2, v2, LX9/U;->d:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, LX9/U;->g:LX9/U;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, v2, LX9/U;->b:I

    :goto_0
    add-int/2addr v1, v2

    if-le v0, v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, LX9/U;->g:LX9/U;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0}, LX9/U;->g(LX9/U;I)V

    invoke-virtual {p0}, LX9/U;->b()LX9/U;

    invoke-static {p0}, LX9/V;->b(LX9/U;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot compact"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()LX9/U;
    .locals 4

    .prologue
    iget-object v0, p0, LX9/U;->f:LX9/U;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, LX9/U;->g:LX9/U;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LX9/U;->f:LX9/U;

    iput-object v3, v2, LX9/U;->f:LX9/U;

    iget-object v2, p0, LX9/U;->f:LX9/U;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LX9/U;->g:LX9/U;

    iput-object v3, v2, LX9/U;->g:LX9/U;

    iput-object v1, p0, LX9/U;->f:LX9/U;

    iput-object v1, p0, LX9/U;->g:LX9/U;

    return-object v0
.end method

.method public final c(LX9/U;)LX9/U;
    .locals 1

    const-string v0, "segment"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, LX9/U;->g:LX9/U;

    iget-object v0, p0, LX9/U;->f:LX9/U;

    iput-object v0, p1, LX9/U;->f:LX9/U;

    iget-object v0, p0, LX9/U;->f:LX9/U;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object p1, v0, LX9/U;->g:LX9/U;

    iput-object p1, p0, LX9/U;->f:LX9/U;

    return-object p1
.end method

.method public final d()LX9/U;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, LX9/U;->d:Z

    new-instance v0, LX9/U;

    iget-object v2, p0, LX9/U;->a:[B

    iget v3, p0, LX9/U;->b:I

    iget v4, p0, LX9/U;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LX9/U;-><init>([BIIZZ)V

    return-object v0
.end method

.method public final e(I)LX9/U;
    .locals 8

    .prologue
    if-lez p1, :cond_1

    iget v0, p0, LX9/U;->c:I

    iget v1, p0, LX9/U;->b:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_1

    const/16 v0, 0x400

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, LX9/U;->d()LX9/U;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, LX9/V;->c()LX9/U;

    move-result-object v0

    iget-object v1, p0, LX9/U;->a:[B

    iget-object v2, v0, LX9/U;->a:[B

    iget v4, p0, LX9/U;->b:I

    add-int v5, v4, p1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lj7/n;->m([B[BIIIILjava/lang/Object;)[B

    :goto_0
    iget v1, v0, LX9/U;->b:I

    add-int/2addr v1, p1

    iput v1, v0, LX9/U;->c:I

    iget v1, p0, LX9/U;->b:I

    add-int/2addr v1, p1

    iput v1, p0, LX9/U;->b:I

    iget-object p1, p0, LX9/U;->g:LX9/U;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LX9/U;->c(LX9/U;)LX9/U;

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteCount out of range"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()LX9/U;
    .locals 7

    new-instance v6, LX9/U;

    iget-object v0, p0, LX9/U;->a:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    const-string v0, "copyOf(...)"

    invoke-static {v1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, LX9/U;->b:I

    iget v3, p0, LX9/U;->c:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LX9/U;-><init>([BIIZZ)V

    return-object v6
.end method

.method public final g(LX9/U;I)V
    .locals 8

    .prologue
    const-string v0, "sink"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, LX9/U;->e:Z

    if-eqz v0, :cond_3

    iget v5, p1, LX9/U;->c:I

    add-int v0, v5, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    iget-boolean v0, p1, LX9/U;->d:Z

    if-nez v0, :cond_1

    add-int v0, v5, p2

    iget v4, p1, LX9/U;->b:I

    sub-int/2addr v0, v4

    if-gt v0, v1, :cond_0

    iget-object v2, p1, LX9/U;->a:[B

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, v2

    invoke-static/range {v1 .. v7}, Lj7/n;->m([B[BIIIILjava/lang/Object;)[B

    iget v0, p1, LX9/U;->c:I

    iget v1, p1, LX9/U;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, LX9/U;->c:I

    const/4 v0, 0x0

    iput v0, p1, LX9/U;->b:I

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
    iget-object v0, p0, LX9/U;->a:[B

    iget-object v1, p1, LX9/U;->a:[B

    iget v2, p1, LX9/U;->c:I

    iget v3, p0, LX9/U;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lj7/n;->g([B[BIII)[B

    iget v0, p1, LX9/U;->c:I

    add-int/2addr v0, p2

    iput v0, p1, LX9/U;->c:I

    iget p1, p0, LX9/U;->b:I

    add-int/2addr p1, p2

    iput p1, p0, LX9/U;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
