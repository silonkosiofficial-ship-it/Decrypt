.class public final Landroidx/compose/ui/focus/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/j;


# instance fields
.field private a:Z

.field private b:Landroidx/compose/ui/focus/n;

.field private c:Landroidx/compose/ui/focus/n;

.field private d:Landroidx/compose/ui/focus/n;

.field private e:Landroidx/compose/ui/focus/n;

.field private f:Landroidx/compose/ui/focus/n;

.field private g:Landroidx/compose/ui/focus/n;

.field private h:Landroidx/compose/ui/focus/n;

.field private i:Landroidx/compose/ui/focus/n;

.field private j:Lx7/l;

.field private k:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/focus/k;->a:Z

    sget-object v0, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->c:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->d:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->e:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->f:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->g:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/focus/k;->h:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/focus/k;->i:Landroidx/compose/ui/focus/n;

    sget-object v0, Landroidx/compose/ui/focus/k$a;->D:Landroidx/compose/ui/focus/k$a;

    iput-object v0, p0, Landroidx/compose/ui/focus/k;->j:Lx7/l;

    sget-object v0, Landroidx/compose/ui/focus/k$b;->D:Landroidx/compose/ui/focus/k$b;

    iput-object v0, p0, Landroidx/compose/ui/focus/k;->k:Lx7/l;

    return-void
.end method


# virtual methods
.method public d()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->h:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public f()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->f:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public o()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->g:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/focus/k;->a:Z

    return v0
.end method

.method public q()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->c:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public r(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/k;->j:Lx7/l;

    return-void
.end method

.method public s()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->d:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public t()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->b:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public u()Lx7/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->k:Lx7/l;

    return-object v0
.end method

.method public v(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/k;->k:Lx7/l;

    return-void
.end method

.method public w()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->i:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public x()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->e:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public y(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/k;->a:Z

    return-void
.end method

.method public z()Lx7/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/k;->j:Lx7/l;

    return-object v0
.end method
