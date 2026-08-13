.class Landroidx/compose/ui/b;
.super Landroidx/compose/ui/platform/H0;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/d$b;


# instance fields
.field private final c:Lx7/q;


# direct methods
.method public constructor <init>(Lx7/l;Lx7/q;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/H0;-><init>(Lx7/l;)V

    iput-object p2, p0, Landroidx/compose/ui/b;->c:Lx7/q;

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

.method public final g()Lx7/q;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/b;->c:Lx7/q;

    return-object v0
.end method
