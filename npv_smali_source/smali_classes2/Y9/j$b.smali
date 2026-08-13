.class final LY9/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/j;->g(LX9/f;)LY9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/K;

.field final synthetic E:J

.field final synthetic F:Ly7/N;

.field final synthetic G:LX9/f;

.field final synthetic H:Ly7/N;

.field final synthetic I:Ly7/N;

.field final synthetic J:Ly7/O;

.field final synthetic K:Ly7/O;

.field final synthetic L:Ly7/O;


# direct methods
.method constructor <init>(Ly7/K;JLy7/N;LX9/f;Ly7/N;Ly7/N;Ly7/O;Ly7/O;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LY9/j$b;->D:Ly7/K;

    iput-wide p2, p0, LY9/j$b;->E:J

    iput-object p4, p0, LY9/j$b;->F:Ly7/N;

    iput-object p5, p0, LY9/j$b;->G:LX9/f;

    iput-object p6, p0, LY9/j$b;->H:Ly7/N;

    iput-object p7, p0, LY9/j$b;->I:Ly7/N;

    iput-object p8, p0, LY9/j$b;->J:Ly7/O;

    iput-object p9, p0, LY9/j$b;->K:Ly7/O;

    iput-object p10, p0, LY9/j$b;->L:Ly7/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IJ)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x4

    cmp-long p1, p2, v0

    if-ltz p1, :cond_1

    iget-object p1, p0, LY9/j$b;->G:LX9/f;

    invoke-interface {p1, v0, v1}, LX9/f;->skip(J)V

    iget-object p1, p0, LY9/j$b;->G:LX9/f;

    sub-long/2addr p2, v0

    long-to-int p2, p2

    new-instance p3, LY9/j$b$a;

    iget-object v0, p0, LY9/j$b;->J:Ly7/O;

    iget-object v1, p0, LY9/j$b;->K:Ly7/O;

    iget-object v2, p0, LY9/j$b;->L:Ly7/O;

    invoke-direct {p3, v0, p1, v1, v2}, LY9/j$b$a;-><init>(Ly7/O;LX9/f;Ly7/O;Ly7/O;)V

    invoke-static {p1, p2, p3}, LY9/j;->a(LX9/f;ILx7/p;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: NTFS extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p0, LY9/j$b;->D:Ly7/K;

    iget-boolean v1, p1, Ly7/K;->C:Z

    if-nez v1, :cond_7

    iput-boolean v0, p1, Ly7/K;->C:Z

    iget-wide v0, p0, LY9/j$b;->E:J

    cmp-long p1, p2, v0

    if-ltz p1, :cond_6

    iget-object p1, p0, LY9/j$b;->F:Ly7/N;

    iget-wide p2, p1, Ly7/N;->C:J

    const-wide v0, 0xffffffffL

    cmp-long v2, p2, v0

    if-nez v2, :cond_3

    iget-object p2, p0, LY9/j$b;->G:LX9/f;

    invoke-interface {p2}, LX9/f;->b1()J

    move-result-wide p2

    :cond_3
    iput-wide p2, p1, Ly7/N;->C:J

    iget-object p1, p0, LY9/j$b;->H:Ly7/N;

    iget-wide p2, p1, Ly7/N;->C:J

    cmp-long p2, p2, v0

    const-wide/16 v2, 0x0

    if-nez p2, :cond_4

    iget-object p2, p0, LY9/j$b;->G:LX9/f;

    invoke-interface {p2}, LX9/f;->b1()J

    move-result-wide p2

    goto :goto_0

    :cond_4
    move-wide p2, v2

    :goto_0
    iput-wide p2, p1, Ly7/N;->C:J

    iget-object p1, p0, LY9/j$b;->I:Ly7/N;

    iget-wide p2, p1, Ly7/N;->C:J

    cmp-long p2, p2, v0

    if-nez p2, :cond_5

    iget-object p2, p0, LY9/j$b;->G:LX9/f;

    invoke-interface {p2}, LX9/f;->b1()J

    move-result-wide v2

    :cond_5
    iput-wide v2, p1, Ly7/N;->C:J

    :goto_1
    return-void

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra too short"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: zip64 extra repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LY9/j$b;->a(IJ)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
