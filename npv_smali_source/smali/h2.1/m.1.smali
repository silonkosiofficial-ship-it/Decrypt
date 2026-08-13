.class public final Lh2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/m$a;,
        Lh2/m$b;,
        Lh2/m$c;
    }
.end annotation


# instance fields
.field private final a:Lh2/m$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh2/m$b;

    invoke-direct {v0, p0}, Lh2/m$b;-><init>(Lh2/m;)V

    iput-object v0, p0, Lh2/m;->a:Lh2/m$b;

    return-void
.end method


# virtual methods
.method public final a(Lh2/t;Lh2/Z;)V
    .locals 2

    .prologue
    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewportHint"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/t;->D:Lh2/t;

    if-eq p1, v0, :cond_1

    sget-object v0, Lh2/t;->E:Lh2/t;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invalid load type for reset: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    iget-object v0, p0, Lh2/m;->a:Lh2/m$b;

    new-instance v1, Lh2/m$d;

    invoke-direct {v1, p1, p2}, Lh2/m$d;-><init>(Lh2/t;Lh2/Z;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lh2/m$b;->d(Lh2/Z$a;Lx7/p;)V

    return-void
.end method

.method public final b()Lh2/Z$a;
    .locals 1

    iget-object v0, p0, Lh2/m;->a:Lh2/m$b;

    invoke-virtual {v0}, Lh2/m$b;->b()Lh2/Z$a;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lh2/t;)LZ8/f;
    .locals 1

    .prologue
    const-string v0, "loadType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh2/m$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh2/m;->a:Lh2/m$b;

    invoke-virtual {p1}, Lh2/m$b;->a()LZ8/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid load type for hints"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lh2/m;->a:Lh2/m$b;

    invoke-virtual {p1}, Lh2/m$b;->c()LZ8/f;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final d(Lh2/Z;)V
    .locals 3

    .prologue
    const-string v0, "viewportHint"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh2/m;->a:Lh2/m$b;

    instance-of v1, p1, Lh2/Z$a;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lh2/Z$a;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Lh2/m$e;

    invoke-direct {v2, p1}, Lh2/m$e;-><init>(Lh2/Z;)V

    invoke-virtual {v0, v1, v2}, Lh2/m$b;->d(Lh2/Z$a;Lx7/p;)V

    return-void
.end method
