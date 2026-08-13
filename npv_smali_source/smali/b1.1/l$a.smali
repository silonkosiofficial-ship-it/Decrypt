.class final Lb1/l$a;
.super Landroidx/compose/ui/platform/H0;
.source "SourceFile"

# interfaces
.implements LD0/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final c:Lb1/f;

.field private final d:Lx7/l;


# direct methods
.method public constructor <init>(Lb1/f;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "ref"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constrainBlock"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lb1/l$a$a;

    invoke-direct {v0, p1, p2}, Lb1/l$a$a;-><init>(Lb1/f;Lx7/l;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/H0;-><init>(Lx7/l;)V

    iput-object p1, p0, Lb1/l$a;->c:Lb1/f;

    iput-object p2, p0, Lb1/l$a;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic G(LY0/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb1/l$a;->g(LY0/e;Ljava/lang/Object;)Lb1/k;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    iget-object v0, p0, Lb1/l$a;->d:Lx7/l;

    instance-of v1, p1, Lb1/l$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lb1/l$a;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object v2, p1, Lb1/l$a;->d:Lx7/l;

    :cond_1
    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(LY0/e;Ljava/lang/Object;)Lb1/k;
    .locals 1

    const-string p2, "<this>"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb1/k;

    iget-object p2, p0, Lb1/l$a;->c:Lb1/f;

    iget-object v0, p0, Lb1/l$a;->d:Lx7/l;

    invoke-direct {p1, p2, v0}, Lb1/k;-><init>(Lb1/f;Lx7/l;)V

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb1/l$a;->d:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
