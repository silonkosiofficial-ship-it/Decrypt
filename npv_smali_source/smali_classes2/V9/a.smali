.class public final LV9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final C:Z

.field private final D:LX9/d;

.field private final E:Ljava/util/zip/Deflater;

.field private final F:LX9/h;


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LV9/a;->C:Z

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LV9/a;->D:LX9/d;

    new-instance v0, Ljava/util/zip/Deflater;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object v0, p0, LV9/a;->E:Ljava/util/zip/Deflater;

    new-instance v1, LX9/h;

    invoke-direct {v1, p1, v0}, LX9/h;-><init>(LX9/X;Ljava/util/zip/Deflater;)V

    iput-object v1, p0, LV9/a;->F:LX9/h;

    return-void
.end method

.method private final f(LX9/d;LX9/g;)Z
    .locals 4

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide v0

    invoke-virtual {p2}, LX9/g;->I()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1, p2}, LX9/d;->x0(JLX9/g;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final a(LX9/d;)V
    .locals 5

    .prologue
    const-string v0, "buffer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV9/a;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, LV9/a;->C:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LV9/a;->E:Ljava/util/zip/Deflater;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->reset()V

    :cond_0
    iget-object v0, p0, LV9/a;->F:LX9/h;

    invoke-virtual {p1}, LX9/d;->d1()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LX9/h;->F0(LX9/d;J)V

    iget-object v0, p0, LV9/a;->F:LX9/h;

    invoke-virtual {v0}, LX9/h;->flush()V

    iget-object v0, p0, LV9/a;->D:LX9/d;

    invoke-static {}, LV9/b;->a()LX9/g;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LV9/a;->f(LX9/d;LX9/g;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LV9/a;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const/4 v2, 0x4

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iget-object v2, p0, LV9/a;->D:LX9/d;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4}, LX9/d;->H0(LX9/d;LX9/d$a;ILjava/lang/Object;)LX9/d$a;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2, v0, v1}, LX9/d$a;->g(J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2, v4}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v2, p1}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    iget-object v0, p0, LV9/a;->D:LX9/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LX9/d;->v1(I)LX9/d;

    :goto_0
    iget-object v0, p0, LV9/a;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, LX9/d;->F0(LX9/d;J)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LV9/a;->F:LX9/h;

    invoke-virtual {v0}, LX9/h;->close()V

    return-void
.end method
