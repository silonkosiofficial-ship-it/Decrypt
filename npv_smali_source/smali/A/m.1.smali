.class final LA/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/d;


# instance fields
.field private final b:Lx7/l;

.field private c:LA/S;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/m;->b:Lx7/l;

    return-void
.end method


# virtual methods
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
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LA/m;

    iget-object p1, p1, LA/m;->b:Lx7/l;

    iget-object v1, p0, LA/m;->b:Lx7/l;

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public h(LE0/l;)V
    .locals 1

    .prologue
    invoke-static {}, LA/V;->a()LE0/m;

    move-result-object v0

    invoke-interface {p1, v0}, LE0/l;->D0(LE0/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA/S;

    iget-object v0, p0, LA/m;->c:LA/S;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, LA/m;->c:LA/S;

    iget-object v0, p0, LA/m;->b:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LA/m;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
