.class final LH/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LY0/v;

.field private b:LY0/e;

.field private c:LR0/h$b;

.field private d:LM0/P;

.field private e:Ljava/lang/Object;

.field private f:J


# direct methods
.method public constructor <init>(LY0/v;LY0/e;LR0/h$b;LM0/P;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/S;->a:LY0/v;

    iput-object p2, p0, LH/S;->b:LY0/e;

    iput-object p3, p0, LH/S;->c:LR0/h$b;

    iput-object p4, p0, LH/S;->d:LM0/P;

    iput-object p5, p0, LH/S;->e:Ljava/lang/Object;

    invoke-direct {p0}, LH/S;->a()J

    move-result-wide p1

    iput-wide p1, p0, LH/S;->f:J

    return-void
.end method

.method private final a()J
    .locals 7

    iget-object v0, p0, LH/S;->d:LM0/P;

    iget-object v1, p0, LH/S;->b:LY0/e;

    iget-object v2, p0, LH/S;->c:LR0/h$b;

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LH/I;->b(LM0/P;LY0/e;LR0/h$b;Ljava/lang/String;IILjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, LH/S;->f:J

    return-wide v0
.end method

.method public final c(LY0/v;LY0/e;LR0/h$b;LM0/P;Ljava/lang/Object;)V
    .locals 1

    .prologue
    iget-object v0, p0, LH/S;->a:LY0/v;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LH/S;->b:LY0/e;

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LH/S;->c:LR0/h$b;

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LH/S;->d:LM0/P;

    invoke-static {p4, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LH/S;->e:Ljava/lang/Object;

    invoke-static {p5, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iput-object p1, p0, LH/S;->a:LY0/v;

    iput-object p2, p0, LH/S;->b:LY0/e;

    iput-object p3, p0, LH/S;->c:LR0/h$b;

    iput-object p4, p0, LH/S;->d:LM0/P;

    iput-object p5, p0, LH/S;->e:Ljava/lang/Object;

    invoke-direct {p0}, LH/S;->a()J

    move-result-wide p1

    iput-wide p1, p0, LH/S;->f:J

    :cond_1
    return-void
.end method
