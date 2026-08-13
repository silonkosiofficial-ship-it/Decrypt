.class Lk5/p$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/p$d;->b(Ljava/lang/Boolean;)Ll4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk5/p$d;


# direct methods
.method constructor <init>(Lk5/p$d;)V
    .locals 0

    iput-object p1, p0, Lk5/p$d$a;->a:Lk5/p$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ll4/l;
    .locals 0

    check-cast p1, Ls5/d;

    invoke-virtual {p0, p1}, Lk5/p$d$a;->b(Ls5/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Ls5/d;)Ll4/l;
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-virtual {p1, v1}, Lh5/g;->k(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lk5/p$d$a;->a:Lk5/p$d;

    iget-object p1, p1, Lk5/p$d;->b:Lk5/p;

    invoke-static {p1}, Lk5/p;->l(Lk5/p;)Ll4/l;

    iget-object p1, p0, Lk5/p$d$a;->a:Lk5/p$d;

    iget-object p1, p1, Lk5/p$d;->b:Lk5/p;

    invoke-static {p1}, Lk5/p;->g(Lk5/p;)Lk5/Z;

    move-result-object p1

    iget-object v1, p0, Lk5/p$d$a;->a:Lk5/p$d;

    iget-object v1, v1, Lk5/p$d;->b:Lk5/p;

    invoke-static {v1}, Lk5/p;->k(Lk5/p;)Ll5/f;

    move-result-object v1

    iget-object v1, v1, Ll5/f;->a:Ll5/e;

    invoke-virtual {p1, v1}, Lk5/Z;->y(Ljava/util/concurrent/Executor;)Ll4/l;

    iget-object p1, p0, Lk5/p$d$a;->a:Lk5/p$d;

    iget-object p1, p1, Lk5/p$d;->b:Lk5/p;

    iget-object p1, p1, Lk5/p;->r:Ll4/m;

    invoke-virtual {p1, v0}, Ll4/m;->e(Ljava/lang/Object;)Z

    goto :goto_0
.end method
