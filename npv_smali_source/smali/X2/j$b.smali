.class final LX2/j$b;
.super LX2/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/Integer;

.field private c:LX2/p;

.field private d:Ljava/lang/Long;

.field private e:[B

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Long;

.field private h:LX2/w;

.field private i:LX2/q;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LX2/t$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LX2/t;
    .locals 17

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LX2/j$b;->a:Ljava/lang/Long;

    const-string v2, ""

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " eventTimeMs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v1, v0, LX2/j$b;->d:Ljava/lang/Long;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " eventUptimeMs"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    iget-object v1, v0, LX2/j$b;->g:Ljava/lang/Long;

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " timezoneOffsetSeconds"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, LX2/j;

    iget-object v2, v0, LX2/j$b;->a:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v6, v0, LX2/j$b;->b:Ljava/lang/Integer;

    iget-object v7, v0, LX2/j$b;->c:LX2/p;

    iget-object v2, v0, LX2/j$b;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v10, v0, LX2/j$b;->e:[B

    iget-object v11, v0, LX2/j$b;->f:Ljava/lang/String;

    iget-object v2, v0, LX2/j$b;->g:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v14, v0, LX2/j$b;->h:LX2/w;

    iget-object v15, v0, LX2/j$b;->i:LX2/q;

    const/16 v16, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, LX2/j;-><init>(JLjava/lang/Integer;LX2/p;J[BLjava/lang/String;JLX2/w;LX2/q;LX2/j$a;)V

    return-object v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(LX2/p;)LX2/t$a;
    .locals 0

    iput-object p1, p0, LX2/j$b;->c:LX2/p;

    return-object p0
.end method

.method public c(Ljava/lang/Integer;)LX2/t$a;
    .locals 0

    iput-object p1, p0, LX2/j$b;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(J)LX2/t$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LX2/j$b;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public e(J)LX2/t$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LX2/j$b;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public f(LX2/q;)LX2/t$a;
    .locals 0

    iput-object p1, p0, LX2/j$b;->i:LX2/q;

    return-object p0
.end method

.method public g(LX2/w;)LX2/t$a;
    .locals 0

    iput-object p1, p0, LX2/j$b;->h:LX2/w;

    return-object p0
.end method

.method h([B)LX2/t$a;
    .locals 0

    iput-object p1, p0, LX2/j$b;->e:[B

    return-object p0
.end method

.method i(Ljava/lang/String;)LX2/t$a;
    .locals 0

    iput-object p1, p0, LX2/j$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public j(J)LX2/t$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LX2/j$b;->g:Ljava/lang/Long;

    return-object p0
.end method
