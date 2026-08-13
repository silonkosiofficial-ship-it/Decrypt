.class final Lp8/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field final C:Lp8/j$b;

.field final D:I

.field final E:Lp8/y$b;

.field final F:Z

.field final G:Z


# direct methods
.method constructor <init>(Lp8/j$b;ILp8/y$b;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/i$e;->C:Lp8/j$b;

    iput p2, p0, Lp8/i$e;->D:I

    iput-object p3, p0, Lp8/i$e;->E:Lp8/y$b;

    iput-boolean p4, p0, Lp8/i$e;->F:Z

    iput-boolean p5, p0, Lp8/i$e;->G:Z

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lp8/i$e;->D:I

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lp8/i$e;

    invoke-virtual {p0, p1}, Lp8/i$e;->e(Lp8/i$e;)I

    move-result p1

    return p1
.end method

.method public e(Lp8/i$e;)I
    .locals 1

    iget v0, p0, Lp8/i$e;->D:I

    iget p1, p1, Lp8/i$e;->D:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public g()Lp8/j$b;
    .locals 1

    iget-object v0, p0, Lp8/i$e;->C:Lp8/j$b;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lp8/i$e;->F:Z

    return v0
.end method

.method public j()Lp8/y$b;
    .locals 1

    iget-object v0, p0, Lp8/i$e;->E:Lp8/y$b;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lp8/i$e;->G:Z

    return v0
.end method

.method public l(Lp8/p$a;Lp8/p;)Lp8/p$a;
    .locals 0

    check-cast p1, Lp8/i$b;

    check-cast p2, Lp8/i;

    invoke-virtual {p1, p2}, Lp8/i$b;->l(Lp8/i;)Lp8/i$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Lp8/y$c;
    .locals 1

    iget-object v0, p0, Lp8/i$e;->E:Lp8/y$b;

    invoke-virtual {v0}, Lp8/y$b;->e()Lp8/y$c;

    move-result-object v0

    return-object v0
.end method
