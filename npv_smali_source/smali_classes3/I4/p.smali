.class final LI4/p;
.super LI4/d$a;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/Long;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LI4/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LI4/d;
    .locals 4

    .prologue
    iget-object v0, p0, LI4/p;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, LI4/r;

    iget-object v2, p0, LI4/p;->b:Ljava/lang/Long;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3, v3}, LI4/r;-><init>(Ljava/lang/String;Ljava/lang/Long;Landroid/net/Network;LI4/q;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required properties: nonce"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(J)LI4/d$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LI4/p;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)LI4/d$a;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    iput-object p1, p0, LI4/p;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null nonce"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
