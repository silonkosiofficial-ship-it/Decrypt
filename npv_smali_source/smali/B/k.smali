.class public final LB/k;
.super LD/o;
.source "SourceFile"

# interfaces
.implements LB/A;


# instance fields
.field private final a:LD/I;

.field private b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 1

    invoke-direct {p0}, LD/o;-><init>()V

    new-instance v0, LD/I;

    invoke-direct {v0}, LD/I;-><init>()V

    iput-object v0, p0, LB/k;->a:LD/I;

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)V
    .locals 2

    .prologue
    iget-object v0, p0, LB/k;->b:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LB/k;->b:Ljava/util/List;

    :cond_0
    invoke-virtual {p0}, LB/k;->j()LD/I;

    move-result-object v1

    invoke-virtual {v1}, LD/I;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, p2, p3}, LB/k;->c(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)V

    return-void
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;Lx7/q;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, LB/k;->j()LD/I;

    move-result-object v0

    new-instance v1, LB/j;

    if-eqz p1, :cond_0

    new-instance v2, LB/k$a;

    invoke-direct {v2, p1}, LB/k$a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance p1, LB/k$b;

    invoke-direct {p1, p2}, LB/k$b;-><init>(Ljava/lang/Object;)V

    new-instance p2, LB/k$c;

    invoke-direct {p2, p3}, LB/k$c;-><init>(Lx7/q;)V

    const p3, -0x3c36593a

    const/4 v3, 0x1

    invoke-static {p3, v3, p2}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object p2

    invoke-direct {v1, v2, p1, p2}, LB/j;-><init>(Lx7/l;Lx7/l;Lx7/r;)V

    invoke-virtual {v0, v3, v1}, LD/I;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public d(ILx7/l;Lx7/l;Lx7/r;)V
    .locals 2

    invoke-virtual {p0}, LB/k;->j()LD/I;

    move-result-object v0

    new-instance v1, LB/j;

    invoke-direct {v1, p2, p3, p4}, LB/j;-><init>(Lx7/l;Lx7/l;Lx7/r;)V

    invoke-virtual {v0, p1, v1}, LD/I;->c(ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic f()LD/d;
    .locals 1

    invoke-virtual {p0}, LB/k;->j()LD/I;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, LB/k;->b:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public j()LD/I;
    .locals 1

    iget-object v0, p0, LB/k;->a:LD/I;

    return-object v0
.end method
