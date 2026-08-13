.class final Landroidx/compose/foundation/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/g;


# instance fields
.field private final b:Lv/H;


# direct methods
.method public constructor <init>(Lv/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/i;->b:Lv/H;

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

.method public y(Lq0/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/i;->b:Lv/H;

    invoke-interface {v0, p1}, Lv/H;->a(Lq0/c;)V

    return-void
.end method
