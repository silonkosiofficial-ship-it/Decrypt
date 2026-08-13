.class public final Lv8/c$b;
.super LP8/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/c;->e(LO7/b;ZLx7/l;)LO7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly7/O;

.field final synthetic b:Lx7/l;


# direct methods
.method constructor <init>(Ly7/O;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lv8/c$b;->a:Ly7/O;

    iput-object p2, p0, Lv8/c$b;->b:Lx7/l;

    invoke-direct {p0}, LP8/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv8/c$b;->f()LO7/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, Lv8/c$b;->d(LO7/b;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, Lv8/c$b;->e(LO7/b;)Z

    move-result p1

    return p1
.end method

.method public d(LO7/b;)V
    .locals 1

    .prologue
    const-string v0, "current"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv8/c$b;->a:Ly7/O;

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, Lv8/c$b;->b:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv8/c$b;->a:Ly7/O;

    iput-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public e(LO7/b;)Z
    .locals 1

    .prologue
    const-string v0, "current"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lv8/c$b;->a:Ly7/O;

    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()LO7/b;
    .locals 1

    iget-object v0, p0, Lv8/c$b;->a:Ly7/O;

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, LO7/b;

    return-object v0
.end method
