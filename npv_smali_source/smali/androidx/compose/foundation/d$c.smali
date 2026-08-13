.class public final Landroidx/compose/foundation/d$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Ljava/lang/String;

.field final synthetic F:LK0/h;

.field final synthetic G:Lx7/a;


# direct methods
.method public constructor <init>(ZLjava/lang/String;LK0/h;Lx7/a;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/d$c;->D:Z

    iput-object p2, p0, Landroidx/compose/foundation/d$c;->E:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/d$c;->F:LK0/h;

    iput-object p4, p0, Landroidx/compose/foundation/d$c;->G:Lx7/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/G0;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/d$c;->a(Landroidx/compose/ui/platform/G0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
