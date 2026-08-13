.class final Landroidx/compose/animation/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/x;


# instance fields
.field private final a:Z

.field private final b:Lx7/p;


# direct methods
.method public constructor <init>(ZLx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/animation/l;->a:Z

    iput-object p2, p0, Landroidx/compose/animation/l;->b:Lx7/p;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/animation/l;->a:Z

    return v0
.end method

.method public b(JJ)Lu/I;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/l;->b:Lx7/p;

    invoke-static {p1, p2}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    invoke-static {p3, p4}, LY0/t;->b(J)LY0/t;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/I;

    return-object p1
.end method
