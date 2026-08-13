.class public final LB8/A$a;
.super LB8/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final d:Li8/c;

.field private final e:LB8/A$a;

.field private final f:Ln8/b;

.field private final g:Li8/c$c;

.field private final h:Z


# direct methods
.method public constructor <init>(Li8/c;Lk8/c;Lk8/g;LO7/a0;LB8/A$a;)V
    .locals 1

    .prologue
    const-string v0, "classProto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, p4, v0}, LB8/A;-><init>(Lk8/c;Lk8/g;LO7/a0;Ly7/k;)V

    iput-object p1, p0, LB8/A$a;->d:Li8/c;

    iput-object p5, p0, LB8/A$a;->e:LB8/A$a;

    invoke-virtual {p1}, Li8/c;->F0()I

    move-result p3

    invoke-static {p2, p3}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object p2

    iput-object p2, p0, LB8/A$a;->f:Ln8/b;

    sget-object p2, Lk8/b;->f:Lk8/b$d;

    invoke-virtual {p1}, Li8/c;->E0()I

    move-result p3

    invoke-virtual {p2, p3}, Lk8/b$d;->d(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li8/c$c;

    if-nez p2, :cond_0

    sget-object p2, Li8/c$c;->D:Li8/c$c;

    :cond_0
    iput-object p2, p0, LB8/A$a;->g:Li8/c$c;

    sget-object p2, Lk8/b;->g:Lk8/b$b;

    invoke-virtual {p1}, Li8/c;->E0()I

    move-result p1

    invoke-virtual {p2, p1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, LB8/A$a;->h:Z

    return-void
.end method


# virtual methods
.method public a()Ln8/c;
    .locals 2

    iget-object v0, p0, LB8/A$a;->f:Ln8/b;

    invoke-virtual {v0}, Ln8/b;->b()Ln8/c;

    move-result-object v0

    const-string v1, "asSingleFqName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Ln8/b;
    .locals 1

    iget-object v0, p0, LB8/A$a;->f:Ln8/b;

    return-object v0
.end method

.method public final f()Li8/c;
    .locals 1

    iget-object v0, p0, LB8/A$a;->d:Li8/c;

    return-object v0
.end method

.method public final g()Li8/c$c;
    .locals 1

    iget-object v0, p0, LB8/A$a;->g:Li8/c$c;

    return-object v0
.end method

.method public final h()LB8/A$a;
    .locals 1

    iget-object v0, p0, LB8/A$a;->e:LB8/A$a;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LB8/A$a;->h:Z

    return v0
.end method
