.class public final LC9/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:I = 0x8


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private final c:LC9/i;

.field private final d:LZ8/f;

.field private final e:LZ8/f;

.field private final f:LZ8/f;

.field private final g:LZ8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LC9/i;

    invoke-direct {v0}, LC9/i;-><init>()V

    iput-object v0, p0, LC9/v;->c:LC9/i;

    invoke-virtual {v0}, LC9/i;->c()LZ8/f;

    move-result-object v1

    iput-object v1, p0, LC9/v;->d:LZ8/f;

    invoke-virtual {v0}, LC9/i;->d()LZ8/f;

    move-result-object v1

    iput-object v1, p0, LC9/v;->e:LZ8/f;

    invoke-virtual {v0}, LC9/i;->j()LZ8/f;

    move-result-object v1

    iput-object v1, p0, LC9/v;->f:LZ8/f;

    invoke-virtual {v0}, LC9/i;->b()LZ8/y;

    move-result-object v0

    new-instance v1, LC9/v$a;

    invoke-direct {v1, v0}, LC9/v$a;-><init>(LZ8/f;)V

    iput-object v1, p0, LC9/v;->g:LZ8/f;

    return-void
.end method


# virtual methods
.method public final a()LZ8/f;
    .locals 1

    iget-object v0, p0, LC9/v;->e:LZ8/f;

    return-object v0
.end method

.method public final b()LC9/i;
    .locals 1

    iget-object v0, p0, LC9/v;->c:LC9/i;

    return-object v0
.end method

.method public final c()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LC9/v;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LC9/v;->c:LC9/i;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LC9/i;->n(LC9/i;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final d(Landroidx/lifecycle/r;Landroidx/lifecycle/Y;)V
    .locals 1

    .prologue
    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LC9/v;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LC9/v;->b:Z

    iget-object v0, p0, LC9/v;->c:LC9/i;

    invoke-virtual {v0, p1, p2}, LC9/i;->l(Landroidx/lifecycle/r;Landroidx/lifecycle/Y;)V

    return-void
.end method

.method public final e(Ljava/lang/String;LC9/u;)V
    .locals 1

    .prologue
    const-string v0, "route"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LC9/v;->b:Z

    if-nez v0, :cond_0

    iput-object p1, p0, LC9/v;->a:Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, LC9/v;->c:LC9/i;

    invoke-virtual {v0, p1, p2}, LC9/i;->p(Ljava/lang/String;LC9/u;)V

    return-void
.end method

.method public final f(LC9/I;)V
    .locals 3

    .prologue
    const-string v0, "routeGraph"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/v;->c:LC9/i;

    invoke-virtual {v0, p1}, LC9/i;->r(LC9/I;)V

    iget-object p1, p0, LC9/v;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, LC9/v;->c:LC9/i;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, LC9/i;->q(LC9/i;Ljava/lang/String;LC9/u;ILjava/lang/Object;)V

    iput-object v2, p0, LC9/v;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method
