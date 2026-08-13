.class public abstract Lz0/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz0/p;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lz0/p;-><init>(Ljava/util/List;)V

    sput-object v0, Lz0/U;->a:Lz0/p;

    return-void
.end method

.method public static final a(Lx7/p;)Lz0/W;
    .locals 2

    new-instance v0, Lz0/X;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, p0}, Lz0/X;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lx7/p;)V

    return-object v0
.end method

.method public static final synthetic b()Lz0/p;
    .locals 1

    sget-object v0, Lz0/U;->a:Lz0/p;

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/d;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;
    .locals 8

    new-instance v7, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lx7/p;ILy7/k;)V

    invoke-interface {p0, v7}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/d;Ljava/lang/Object;Lx7/p;)Landroidx/compose/ui/d;
    .locals 8

    new-instance v7, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lx7/p;ILy7/k;)V

    invoke-interface {p0, v7}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
