.class final Lh2/v$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/v;->g(Lh2/t;ZLh2/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lh2/t;

.field final synthetic F:Lh2/r;

.field final synthetic G:Lh2/v;


# direct methods
.method constructor <init>(ZLh2/t;Lh2/r;Lh2/v;)V
    .locals 0

    iput-boolean p1, p0, Lh2/v$b;->D:Z

    iput-object p2, p0, Lh2/v$b;->E:Lh2/t;

    iput-object p3, p0, Lh2/v$b;->F:Lh2/r;

    iput-object p4, p0, Lh2/v$b;->G:Lh2/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lh2/g;)Lh2/g;
    .locals 4

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lh2/g;->e()Lh2/s;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lh2/s;->f:Lh2/s$a;

    invoke-virtual {v0}, Lh2/s$a;->a()Lh2/s;

    move-result-object v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lh2/g;->b()Lh2/s;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Lh2/v$b;->D:Z

    if-eqz v2, :cond_3

    sget-object v1, Lh2/s;->f:Lh2/s$a;

    invoke-virtual {v1}, Lh2/s$a;->a()Lh2/s;

    move-result-object v1

    iget-object v2, p0, Lh2/v$b;->E:Lh2/t;

    iget-object v3, p0, Lh2/v$b;->F:Lh2/r;

    invoke-virtual {v1, v2, v3}, Lh2/s;->i(Lh2/t;Lh2/r;)Lh2/s;

    move-result-object v1

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lh2/v$b;->E:Lh2/t;

    iget-object v3, p0, Lh2/v$b;->F:Lh2/r;

    invoke-virtual {v0, v2, v3}, Lh2/s;->i(Lh2/t;Lh2/r;)Lh2/s;

    move-result-object v0

    :goto_1
    iget-object v2, p0, Lh2/v$b;->G:Lh2/v;

    invoke-static {v2, p1, v0, v1}, Lh2/v;->a(Lh2/v;Lh2/g;Lh2/s;Lh2/s;)Lh2/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/g;

    invoke-virtual {p0, p1}, Lh2/v$b;->a(Lh2/g;)Lh2/g;

    move-result-object p1

    return-object p1
.end method
