.class public final Landroidx/compose/ui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/d;


# instance fields
.field private final b:Landroidx/compose/ui/d;

.field private final c:Landroidx/compose/ui/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    iput-object p2, p0, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    return-void
.end method


# virtual methods
.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    iget-object v1, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    invoke-interface {v1, p1, p2}, Landroidx/compose/ui/d;->c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/d;->c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lx7/l;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    invoke-interface {v0, p1}, Landroidx/compose/ui/d;->d(Lx7/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    invoke-interface {v0, p1}, Landroidx/compose/ui/d;->d(Lx7/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Landroidx/compose/ui/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    check-cast p1, Landroidx/compose/ui/a;

    iget-object v1, p1, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    iget-object p1, p1, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g()Landroidx/compose/ui/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/a;->c:Landroidx/compose/ui/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public final j()Landroidx/compose/ui/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/a;->b:Landroidx/compose/ui/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ""

    sget-object v2, Landroidx/compose/ui/a$a;->D:Landroidx/compose/ui/a$a;

    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/a;->c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
