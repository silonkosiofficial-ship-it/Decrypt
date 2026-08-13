.class public final Li9/l;
.super Li9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/l$a;
    }
.end annotation


# instance fields
.field private final a:Lk9/f;


# direct methods
.method public constructor <init>(Lk9/f;)V
    .locals 1

    const-string v0, "actualFormat"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/a;-><init>(Ly7/k;)V

    iput-object p1, p0, Li9/l;->a:Lk9/f;

    return-void
.end method


# virtual methods
.method public c()Lk9/f;
    .locals 1

    iget-object v0, p0, Li9/l;->a:Lk9/f;

    return-object v0
.end method

.method public bridge synthetic d()Lm9/c;
    .locals 1

    invoke-virtual {p0}, Li9/l;->g()Li9/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Lm9/c;
    .locals 0

    check-cast p1, Li9/j;

    invoke-virtual {p0, p1}, Li9/l;->h(Li9/j;)Li9/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lm9/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/k;

    invoke-virtual {p0, p1}, Li9/l;->i(Li9/k;)Li9/j;

    move-result-object p1

    return-object p1
.end method

.method public g()Li9/k;
    .locals 1

    invoke-static {}, Li9/m;->a()Li9/k;

    move-result-object v0

    return-object v0
.end method

.method public h(Li9/j;)Li9/k;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li9/j;->a()Li9/k;

    move-result-object p1

    return-object p1
.end method

.method public i(Li9/k;)Li9/j;
    .locals 1

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li9/j;

    invoke-direct {v0, p1}, Li9/j;-><init>(Li9/k;)V

    return-object v0
.end method
