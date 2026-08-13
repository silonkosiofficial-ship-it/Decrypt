.class LJ1/a$c;
.super LC1/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:LJ1/a;


# direct methods
.method constructor <init>(LJ1/a;)V
    .locals 0

    iput-object p1, p0, LJ1/a$c;->b:LJ1/a;

    invoke-direct {p0}, LC1/E;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)LC1/B;
    .locals 1

    iget-object v0, p0, LJ1/a$c;->b:LJ1/a;

    invoke-virtual {v0, p1}, LJ1/a;->H(I)LC1/B;

    move-result-object p1

    invoke-static {p1}, LC1/B;->a0(LC1/B;)LC1/B;

    move-result-object p1

    return-object p1
.end method

.method public d(I)LC1/B;
    .locals 1

    .prologue
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LJ1/a$c;->b:LJ1/a;

    iget p1, p1, LJ1/a;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, LJ1/a$c;->b:LJ1/a;

    iget p1, p1, LJ1/a;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, LJ1/a$c;->b(I)LC1/B;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, LJ1/a$c;->b:LJ1/a;

    invoke-virtual {v0, p1, p2, p3}, LJ1/a;->P(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
