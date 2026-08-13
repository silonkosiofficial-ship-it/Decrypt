.class public final LH/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/Y$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private b:LH/Y$a;

.field private c:LH/Y$a;

.field private d:I

.field private e:Ljava/lang/Long;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LH/Y;->a:I

    return-void
.end method

.method public synthetic constructor <init>(IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x186a0

    :cond_0
    invoke-direct {p0, p1}, LH/Y;-><init>(I)V

    return-void
.end method

.method private final d()V
    .locals 3

    .prologue
    iget-object v0, p0, LH/Y;->b:LH/Y$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/Y$a;->a()LH/Y$a;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_1

    return-void

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LH/Y$a;->a()LH/Y$a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LH/Y$a;->a()LH/Y$a;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {v0}, LH/Y$a;->a()LH/Y$a;

    move-result-object v0

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v1}, LH/Y$a;->c(LH/Y$a;)V

    :goto_3
    return-void
.end method

.method public static synthetic f(LH/Y;LS0/V;JILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, LH/a0;->a()J

    move-result-wide p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LH/Y;->e(LS0/V;J)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LH/Y;->f:Z

    return-void
.end method

.method public final b(LS0/V;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    iput-boolean v0, p0, LH/Y;->f:Z

    iget-object v0, p0, LH/Y;->b:LH/Y$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/Y$a;->b()LS0/V;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, LH/Y;->b:LH/Y$a;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LH/Y$a;->b()LS0/V;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LH/Y;->b:LH/Y$a;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p1}, LH/Y$a;->d(LS0/V;)V

    :goto_2
    return-void

    :cond_4
    iget-object v0, p0, LH/Y;->b:LH/Y$a;

    new-instance v2, LH/Y$a;

    invoke-direct {v2, v0, p1}, LH/Y$a;-><init>(LH/Y$a;LS0/V;)V

    iput-object v2, p0, LH/Y;->b:LH/Y$a;

    iput-object v1, p0, LH/Y;->c:LH/Y$a;

    iget v0, p0, LH/Y;->d:I

    invoke-virtual {p1}, LS0/V;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LH/Y;->d:I

    iget p1, p0, LH/Y;->a:I

    if-le v0, p1, :cond_5

    invoke-direct {p0}, LH/Y;->d()V

    :cond_5
    return-void
.end method

.method public final c()LS0/V;
    .locals 4

    .prologue
    iget-object v0, p0, LH/Y;->c:LH/Y$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/Y$a;->a()LH/Y$a;

    move-result-object v1

    iput-object v1, p0, LH/Y;->c:LH/Y$a;

    invoke-virtual {v0}, LH/Y$a;->b()LS0/V;

    move-result-object v1

    iget-object v2, p0, LH/Y;->b:LH/Y$a;

    new-instance v3, LH/Y$a;

    invoke-direct {v3, v2, v1}, LH/Y$a;-><init>(LH/Y$a;LS0/V;)V

    iput-object v3, p0, LH/Y;->b:LH/Y$a;

    iget v1, p0, LH/Y;->d:I

    invoke-virtual {v0}, LH/Y$a;->b()LS0/V;

    move-result-object v2

    invoke-virtual {v2}, LS0/V;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, p0, LH/Y;->d:I

    invoke-virtual {v0}, LH/Y$a;->b()LS0/V;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final e(LS0/V;J)V
    .locals 4

    .prologue
    iget-boolean v0, p0, LH/Y;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LH/Y;->e:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {}, LH/Z;->a()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    :cond_1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LH/Y;->e:Ljava/lang/Long;

    invoke-virtual {p0, p1}, LH/Y;->b(LS0/V;)V

    :cond_2
    return-void
.end method

.method public final g()LS0/V;
    .locals 4

    .prologue
    iget-object v0, p0, LH/Y;->b:LH/Y$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LH/Y$a;->a()LH/Y$a;

    move-result-object v2

    if-eqz v2, :cond_0

    iput-object v2, p0, LH/Y;->b:LH/Y$a;

    iget v1, p0, LH/Y;->d:I

    invoke-virtual {v0}, LH/Y$a;->b()LS0/V;

    move-result-object v3

    invoke-virtual {v3}, LS0/V;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v1, v3

    iput v1, p0, LH/Y;->d:I

    invoke-virtual {v0}, LH/Y$a;->b()LS0/V;

    move-result-object v0

    iget-object v1, p0, LH/Y;->c:LH/Y$a;

    new-instance v3, LH/Y$a;

    invoke-direct {v3, v1, v0}, LH/Y$a;-><init>(LH/Y$a;LS0/V;)V

    iput-object v3, p0, LH/Y;->c:LH/Y$a;

    invoke-virtual {v2}, LH/Y$a;->b()LS0/V;

    move-result-object v1

    :cond_0
    return-object v1
.end method
