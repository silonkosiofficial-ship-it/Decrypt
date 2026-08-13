.class public final Lc2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/lifecycle/X;

.field private final b:Landroidx/lifecycle/V$c;

.field private final c:Lc2/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/X;Landroidx/lifecycle/V$c;Lc2/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/g;->a:Landroidx/lifecycle/X;

    iput-object p2, p0, Lc2/g;->b:Landroidx/lifecycle/V$c;

    iput-object p3, p0, Lc2/g;->c:Lc2/a;

    return-void
.end method

.method public static synthetic b(Lc2/g;LF7/c;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/T;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Le2/g;->a:Le2/g;

    invoke-virtual {p2, p1}, Le2/g;->e(LF7/c;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lc2/g;->a(LF7/c;Ljava/lang/String;)Landroidx/lifecycle/T;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LF7/c;Ljava/lang/String;)Landroidx/lifecycle/T;
    .locals 2

    .prologue
    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc2/g;->a:Landroidx/lifecycle/X;

    invoke-virtual {v0, p2}, Landroidx/lifecycle/X;->b(Ljava/lang/String;)Landroidx/lifecycle/T;

    move-result-object v0

    invoke-interface {p1, v0}, LF7/c;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lc2/g;->b:Landroidx/lifecycle/V$c;

    instance-of p2, p1, Landroidx/lifecycle/V$e;

    if-eqz p2, :cond_0

    check-cast p1, Landroidx/lifecycle/V$e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/V$e;->d(Landroidx/lifecycle/T;)V

    :cond_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    invoke-static {v0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Lc2/d;

    iget-object v1, p0, Lc2/g;->c:Lc2/a;

    invoke-direct {v0, v1}, Lc2/d;-><init>(Lc2/a;)V

    sget-object v1, Le2/g$a;->a:Le2/g$a;

    invoke-virtual {v0, v1, p2}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    iget-object v1, p0, Lc2/g;->b:Landroidx/lifecycle/V$c;

    invoke-static {v1, p1, v0}, Lc2/h;->a(Landroidx/lifecycle/V$c;LF7/c;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p1

    iget-object v0, p0, Lc2/g;->a:Landroidx/lifecycle/X;

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/X;->d(Ljava/lang/String;Landroidx/lifecycle/T;)V

    return-object p1
.end method
