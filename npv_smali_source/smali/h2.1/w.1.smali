.class public final Lh2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/w$a;
    }
.end annotation


# instance fields
.field private a:Lh2/r;

.field private b:Lh2/r;

.field private c:Lh2/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v0}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v1

    iput-object v1, p0, Lh2/w;->a:Lh2/r;

    invoke-virtual {v0}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v1

    iput-object v1, p0, Lh2/w;->b:Lh2/r;

    invoke-virtual {v0}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v0

    iput-object v0, p0, Lh2/w;->c:Lh2/r;

    return-void
.end method


# virtual methods
.method public final a(Lh2/t;)Lh2/r;
    .locals 1

    .prologue
    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/w$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh2/w;->b:Lh2/r;

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lh2/w;->c:Lh2/r;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lh2/w;->a:Lh2/r;

    :goto_0
    return-object p1
.end method

.method public final b(Lh2/s;)V
    .locals 1

    const-string v0, "states"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh2/s;->f()Lh2/r;

    move-result-object v0

    iput-object v0, p0, Lh2/w;->a:Lh2/r;

    invoke-virtual {p1}, Lh2/s;->d()Lh2/r;

    move-result-object v0

    iput-object v0, p0, Lh2/w;->c:Lh2/r;

    invoke-virtual {p1}, Lh2/s;->e()Lh2/r;

    move-result-object p1

    iput-object p1, p0, Lh2/w;->b:Lh2/r;

    return-void
.end method

.method public final c(Lh2/t;Lh2/r;)V
    .locals 1

    .prologue
    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/w$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iput-object p2, p0, Lh2/w;->b:Lh2/r;

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    iput-object p2, p0, Lh2/w;->c:Lh2/r;

    goto :goto_0

    :cond_2
    iput-object p2, p0, Lh2/w;->a:Lh2/r;

    :goto_0
    return-void
.end method

.method public final d()Lh2/s;
    .locals 4

    new-instance v0, Lh2/s;

    iget-object v1, p0, Lh2/w;->a:Lh2/r;

    iget-object v2, p0, Lh2/w;->b:Lh2/r;

    iget-object v3, p0, Lh2/w;->c:Lh2/r;

    invoke-direct {v0, v1, v2, v3}, Lh2/s;-><init>(Lh2/r;Lh2/r;Lh2/r;)V

    return-object v0
.end method
