.class public final LV9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final C:Z

.field private final D:LX9/d;

.field private final E:Ljava/util/zip/Inflater;

.field private final F:LX9/p;


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LV9/c;->C:Z

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    iput-object p1, p0, LV9/c;->D:LX9/d;

    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, LV9/c;->E:Ljava/util/zip/Inflater;

    new-instance v1, LX9/p;

    invoke-direct {v1, p1, v0}, LX9/p;-><init>(LX9/Z;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, LV9/c;->F:LX9/p;

    return-void
.end method


# virtual methods
.method public final a(LX9/d;)V
    .locals 5

    .prologue
    const-string v0, "buffer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV9/c;->D:LX9/d;

    invoke-virtual {v0}, LX9/d;->d1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, LV9/c;->C:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LV9/c;->E:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    :cond_0
    iget-object v0, p0, LV9/c;->D:LX9/d;

    invoke-virtual {v0, p1}, LX9/d;->c0(LX9/Z;)J

    iget-object v0, p0, LV9/c;->D:LX9/d;

    const v1, 0xffff

    invoke-virtual {v0, v1}, LX9/d;->x1(I)LX9/d;

    iget-object v0, p0, LV9/c;->E:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v0

    iget-object v2, p0, LV9/c;->D:LX9/d;

    invoke-virtual {v2}, LX9/d;->d1()J

    move-result-wide v2

    add-long/2addr v0, v2

    :cond_1
    iget-object v2, p0, LV9/c;->F:LX9/p;

    const-wide v3, 0x7fffffffffffffffL

    invoke-virtual {v2, p1, v3, v4}, LX9/p;->a(LX9/d;J)J

    iget-object v2, p0, LV9/c;->E:Ljava/util/zip/Inflater;

    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v2

    cmp-long v2, v2, v0

    if-ltz v2, :cond_1

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

    iget-object v0, p0, LV9/c;->F:LX9/p;

    invoke-virtual {v0}, LX9/p;->close()V

    return-void
.end method
