.class public final LF0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF0/n;

.field private final b:LF0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LF0/n;

    invoke-direct {v0, p1}, LF0/n;-><init>(Z)V

    iput-object v0, p0, LF0/o;->a:LF0/n;

    new-instance v0, LF0/n;

    invoke-direct {v0, p1}, LF0/n;-><init>(Z)V

    iput-object v0, p0, LF0/o;->b:LF0/n;

    return-void
.end method

.method public static final synthetic a(LF0/o;)LF0/n;
    .locals 0

    iget-object p0, p0, LF0/o;->a:LF0/n;

    return-object p0
.end method

.method public static final synthetic b(LF0/o;)LF0/n;
    .locals 0

    iget-object p0, p0, LF0/o;->b:LF0/n;

    return-object p0
.end method


# virtual methods
.method public final c(LF0/J;Z)V
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    iget-object p2, p0, LF0/o;->a:LF0/n;

    invoke-virtual {p2, p1}, LF0/n;->a(LF0/J;)V

    :goto_0
    iget-object p2, p0, LF0/o;->b:LF0/n;

    invoke-virtual {p2, p1}, LF0/n;->a(LF0/J;)V

    goto :goto_1

    :cond_0
    iget-object p2, p0, LF0/o;->a:LF0/n;

    invoke-virtual {p2, p1}, LF0/n;->b(LF0/J;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final d(LF0/J;)Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/o;->a:LF0/n;

    invoke-virtual {v0, p1}, LF0/n;->b(LF0/J;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LF0/o;->b:LF0/n;

    invoke-virtual {v0, p1}, LF0/n;->b(LF0/J;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final e(LF0/J;Z)Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/o;->a:LF0/n;

    invoke-virtual {v0, p1}, LF0/n;->b(LF0/J;)Z

    move-result v0

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_2

    iget-object p2, p0, LF0/o;->b:LF0/n;

    invoke-virtual {p2, p1}, LF0/n;->b(LF0/J;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    iget-object v0, p0, LF0/o;->b:LF0/n;

    invoke-virtual {v0}, LF0/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF0/o;->a:LF0/n;

    invoke-virtual {v0}, LF0/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(Z)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget-object p1, p0, LF0/o;->a:LF0/n;

    :goto_0
    invoke-virtual {p1}, LF0/n;->d()Z

    move-result p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, LF0/o;->b:LF0/n;

    goto :goto_0

    :goto_1
    return p1
.end method

.method public final h()Z
    .locals 1

    invoke-virtual {p0}, LF0/o;->f()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final i(LF0/J;)Z
    .locals 2

    .prologue
    iget-object v0, p0, LF0/o;->a:LF0/n;

    invoke-virtual {v0, p1}, LF0/n;->f(LF0/J;)Z

    move-result v0

    iget-object v1, p0, LF0/o;->b:LF0/n;

    invoke-virtual {v1, p1}, LF0/n;->f(LF0/J;)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
