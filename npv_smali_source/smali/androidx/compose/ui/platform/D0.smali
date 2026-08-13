.class public final Landroidx/compose/ui/platform/D0;
.super Landroidx/compose/ui/platform/H0;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/D0$a;
    }
.end annotation


# instance fields
.field private final c:Landroidx/compose/ui/platform/D0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/H0;-><init>(Lx7/l;)V

    new-instance p1, Landroidx/compose/ui/platform/D0$a;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/D0$a;-><init>(Landroidx/compose/ui/platform/D0;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/D0;->c:Landroidx/compose/ui/platform/D0$a;

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
