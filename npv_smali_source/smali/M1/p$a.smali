.class public final LM1/p$a;
.super LM1/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM1/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lx7/p;

.field private final b:LW8/v;

.field private final c:LM1/v;

.field private final d:Lm7/i;


# direct methods
.method public constructor <init>(Lx7/p;LW8/v;LM1/v;Lm7/i;)V
    .locals 1

    const-string v0, "transform"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ack"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callerContext"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LM1/p;-><init>(Ly7/k;)V

    iput-object p1, p0, LM1/p$a;->a:Lx7/p;

    iput-object p2, p0, LM1/p$a;->b:LW8/v;

    iput-object p3, p0, LM1/p$a;->c:LM1/v;

    iput-object p4, p0, LM1/p$a;->d:Lm7/i;

    return-void
.end method


# virtual methods
.method public final a()LW8/v;
    .locals 1

    iget-object v0, p0, LM1/p$a;->b:LW8/v;

    return-object v0
.end method

.method public final b()Lm7/i;
    .locals 1

    iget-object v0, p0, LM1/p$a;->d:Lm7/i;

    return-object v0
.end method

.method public c()LM1/v;
    .locals 1

    iget-object v0, p0, LM1/p$a;->c:LM1/v;

    return-object v0
.end method

.method public final d()Lx7/p;
    .locals 1

    iget-object v0, p0, LM1/p$a;->a:Lx7/p;

    return-object v0
.end method
