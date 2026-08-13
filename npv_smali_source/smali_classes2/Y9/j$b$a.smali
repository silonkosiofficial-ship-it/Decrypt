.class final LY9/j$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/j$b;->a(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:LX9/f;

.field final synthetic F:Ly7/O;

.field final synthetic G:Ly7/O;


# direct methods
.method constructor <init>(Ly7/O;LX9/f;Ly7/O;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LY9/j$b$a;->D:Ly7/O;

    iput-object p2, p0, LY9/j$b$a;->E:LX9/f;

    iput-object p3, p0, LY9/j$b$a;->F:Ly7/O;

    iput-object p4, p0, LY9/j$b$a;->G:Ly7/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IJ)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LY9/j$b$a;->D:Ly7/O;

    iget-object v0, p1, Ly7/O;->C:Ljava/lang/Object;

    if-nez v0, :cond_1

    const-wide/16 v0, 0x18

    cmp-long p2, p2, v0

    if-nez p2, :cond_0

    iget-object p2, p0, LY9/j$b$a;->E:LX9/f;

    invoke-interface {p2}, LX9/f;->b1()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p1, Ly7/O;->C:Ljava/lang/Object;

    iget-object p1, p0, LY9/j$b$a;->F:Ly7/O;

    iget-object p2, p0, LY9/j$b$a;->E:LX9/f;

    invoke-interface {p2}, LX9/f;->b1()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p1, Ly7/O;->C:Ljava/lang/Object;

    iget-object p1, p0, LY9/j$b$a;->G:Ly7/O;

    iget-object p2, p0, LY9/j$b$a;->E:LX9/f;

    invoke-interface {p2}, LX9/f;->b1()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p1, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: NTFS extra attribute tag 0x0001 size != 24"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "bad zip: NTFS extra attribute tag 0x0001 repeated"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LY9/j$b$a;->a(IJ)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
