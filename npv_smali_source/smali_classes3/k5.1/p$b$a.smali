.class Lk5/p$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/p$b;->a()Ll4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lk5/p$b;


# direct methods
.method constructor <init>(Lk5/p$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lk5/p$b$a;->b:Lk5/p$b;

    iput-object p2, p0, Lk5/p$b$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ll4/l;
    .locals 0

    check-cast p1, Ls5/d;

    invoke-virtual {p0, p1}, Lk5/p$b$a;->b(Ls5/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public b(Ls5/d;)Ll4/l;
    .locals 4

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v1, "Received null app settings, cannot send reports at crash time."

    invoke-virtual {p1, v1}, Lh5/g;->k(Ljava/lang/String;)V

    invoke-static {v0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lk5/p$b$a;->b:Lk5/p$b;

    iget-object p1, p1, Lk5/p$b;->f:Lk5/p;

    invoke-static {p1}, Lk5/p;->l(Lk5/p;)Ll4/l;

    move-result-object p1

    iget-object v1, p0, Lk5/p$b$a;->b:Lk5/p$b;

    iget-object v1, v1, Lk5/p$b;->f:Lk5/p;

    invoke-static {v1}, Lk5/p;->g(Lk5/p;)Lk5/Z;

    move-result-object v1

    iget-object v2, p0, Lk5/p$b$a;->b:Lk5/p$b;

    iget-object v2, v2, Lk5/p$b;->f:Lk5/p;

    invoke-static {v2}, Lk5/p;->k(Lk5/p;)Ll5/f;

    move-result-object v2

    iget-object v2, v2, Ll5/f;->a:Ll5/e;

    iget-object v3, p0, Lk5/p$b$a;->b:Lk5/p$b;

    iget-boolean v3, v3, Lk5/p$b;->e:Z

    if-eqz v3, :cond_1

    iget-object v0, p0, Lk5/p$b$a;->a:Ljava/lang/String;

    :cond_1
    invoke-virtual {v1, v2, v0}, Lk5/Z;->z(Ljava/util/concurrent/Executor;Ljava/lang/String;)Ll4/l;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ll4/l;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, Ll4/o;->g([Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
