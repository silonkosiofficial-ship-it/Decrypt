.class public abstract Lo2/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly2/b;)V
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr2/a;

    if-eqz v0, :cond_0

    check-cast p1, Lr2/a;

    invoke-virtual {p1}, Lr2/a;->a()Lz2/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo2/n$b;->b(Lz2/d;)V

    :cond_0
    return-void
.end method

.method public b(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ly2/b;)V
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr2/a;

    if-eqz v0, :cond_0

    check-cast p1, Lr2/a;

    invoke-virtual {p1}, Lr2/a;->a()Lz2/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo2/n$b;->d(Lz2/d;)V

    :cond_0
    return-void
.end method

.method public d(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ly2/b;)V
    .locals 1

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr2/a;

    if-eqz v0, :cond_0

    check-cast p1, Lr2/a;

    invoke-virtual {p1}, Lr2/a;->a()Lz2/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lo2/n$b;->f(Lz2/d;)V

    :cond_0
    return-void
.end method

.method public f(Lz2/d;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
