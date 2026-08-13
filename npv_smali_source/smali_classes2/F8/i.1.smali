.class public final LF8/i;
.super LF8/Y;
.source "SourceFile"


# instance fields
.field private final a:LP7/g;


# direct methods
.method public constructor <init>(LP7/g;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/Y;-><init>()V

    iput-object p1, p0, LF8/i;->a:LP7/g;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LF8/Y;)LF8/Y;
    .locals 0

    check-cast p1, LF8/i;

    invoke-virtual {p0, p1}, LF8/i;->d(LF8/i;)LF8/i;

    move-result-object p1

    return-object p1
.end method

.method public b()LF7/c;
    .locals 1

    const-class v0, LF8/i;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LF8/Y;)LF8/Y;
    .locals 0

    check-cast p1, LF8/i;

    invoke-virtual {p0, p1}, LF8/i;->f(LF8/i;)LF8/i;

    move-result-object p1

    return-object p1
.end method

.method public d(LF8/i;)LF8/i;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LF8/i;

    iget-object v1, p0, LF8/i;->a:LP7/g;

    iget-object p1, p1, LF8/i;->a:LP7/g;

    invoke-static {v1, p1}, LP7/i;->a(LP7/g;LP7/g;)LP7/g;

    move-result-object p1

    invoke-direct {v0, p1}, LF8/i;-><init>(LP7/g;)V

    return-object v0
.end method

.method public final e()LP7/g;
    .locals 1

    iget-object v0, p0, LF8/i;->a:LP7/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LF8/i;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LF8/i;

    iget-object p1, p1, LF8/i;->a:LP7/g;

    iget-object v0, p0, LF8/i;->a:LP7/g;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(LF8/i;)LF8/i;
    .locals 0

    .prologue
    invoke-static {p1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LF8/i;->a:LP7/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
