.class Lk5/p$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/p;->U(Ll4/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll4/l;

.field final synthetic b:Lk5/p;


# direct methods
.method constructor <init>(Lk5/p;Ll4/l;)V
    .locals 0

    iput-object p1, p0, Lk5/p$d;->b:Lk5/p;

    iput-object p2, p0, Lk5/p$d;->a:Ll4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ll4/l;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lk5/p$d;->b(Ljava/lang/Boolean;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Boolean;)Ll4/l;
    .locals 2

    .prologue
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Deleting cached crash reports..."

    invoke-virtual {p1, v0}, Lh5/g;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lk5/p$d;->b:Lk5/p;

    invoke-virtual {p1}, Lk5/p;->L()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lk5/p;->m(Ljava/util/List;)V

    iget-object p1, p0, Lk5/p$d;->b:Lk5/p;

    invoke-static {p1}, Lk5/p;->g(Lk5/p;)Lk5/Z;

    move-result-object p1

    invoke-virtual {p1}, Lk5/Z;->x()V

    iget-object p1, p0, Lk5/p$d;->b:Lk5/p;

    iget-object p1, p1, Lk5/p;->r:Ll4/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll4/m;->e(Ljava/lang/Object;)Z

    invoke-static {v0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object v0

    const-string v1, "Sending cached crash reports..."

    invoke-virtual {v0, v1}, Lh5/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lk5/p$d;->b:Lk5/p;

    invoke-static {v0}, Lk5/p;->j(Lk5/p;)Lk5/C;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk5/C;->c(Z)V

    iget-object p1, p0, Lk5/p$d;->a:Ll4/l;

    iget-object v0, p0, Lk5/p$d;->b:Lk5/p;

    invoke-static {v0}, Lk5/p;->k(Lk5/p;)Ll5/f;

    move-result-object v0

    iget-object v0, v0, Ll5/f;->a:Ll5/e;

    new-instance v1, Lk5/p$d$a;

    invoke-direct {v1, p0}, Lk5/p$d$a;-><init>(Lk5/p$d;)V

    invoke-virtual {p1, v0, v1}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
