.class public final LI6/E$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LI6/E$d;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lx7/l;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LI6/E$d;->d(Lx7/l;)LI6/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LC6/c;)V
    .locals 0

    check-cast p1, LI6/E;

    invoke-virtual {p0, p1, p2}, LI6/E$d;->c(LI6/E;LC6/c;)V

    return-void
.end method

.method public c(LI6/E;LC6/c;)V
    .locals 4

    const-string v0, "plugin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LC6/c;->D()LO6/g;

    move-result-object v0

    sget-object v1, LO6/g;->g:LO6/g$a;

    invoke-virtual {v1}, LO6/g$a;->c()La7/i;

    move-result-object v1

    new-instance v2, LI6/E$d$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p2, v3}, LI6/E$d$a;-><init>(LI6/E;LC6/c;Lm7/e;)V

    invoke-virtual {v0, v1, v2}, La7/d;->l(La7/i;Lx7/q;)V

    return-void
.end method

.method public d(Lx7/l;)LI6/E;
    .locals 2

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI6/E$a;

    invoke-direct {v0}, LI6/E$a;-><init>()V

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, LI6/E;

    invoke-virtual {v0}, LI6/E$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LI6/E;-><init>(ILy7/k;)V

    return-object p1
.end method

.method public getKey()LW6/a;
    .locals 1

    invoke-static {}, LI6/E;->b()LW6/a;

    move-result-object v0

    return-object v0
.end method
