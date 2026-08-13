.class public final LX9/T$a;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/T;->r1()Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LX9/T;


# direct methods
.method constructor <init>(LX9/T;)V
    .locals 0

    iput-object p1, p0, LX9/T$a;->C:LX9/T;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public available()I
    .locals 4

    .prologue
    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-boolean v1, v0, LX9/T;->E:Z

    if-nez v1, :cond_0

    iget-object v0, v0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const v2, 0x7fffffff

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    invoke-virtual {v0}, LX9/T;->close()V

    return-void
.end method

.method public read()I
    .locals 4

    .prologue
    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-boolean v1, v0, LX9/T;->E:Z

    if-nez v1, :cond_1

    iget-object v0, v0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-object v1, v0, LX9/T;->C:LX9/Z;

    iget-object v0, v0, LX9/T;->D:LX9/d;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-object v0, v0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->m()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public read([BII)I
    .locals 7

    .prologue
    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-boolean v0, v0, LX9/T;->E:Z

    if-nez v0, :cond_1

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, LX9/b;->b(JJJ)V

    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-object v0, v0, LX9/T;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-object v1, v0, LX9/T;->C:LX9/Z;

    iget-object v0, v0, LX9/T;->D:LX9/d;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, LX9/Z;->b0(LX9/d;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, LX9/T$a;->C:LX9/T;

    iget-object v0, v0, LX9/T;->D:LX9/d;

    invoke-virtual {v0, p1, p2, p3}, LX9/d;->z0([BII)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LX9/T$a;->C:LX9/T;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
