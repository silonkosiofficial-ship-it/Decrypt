.class public final Landroidx/compose/foundation/d$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/d;->f(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Ljava/lang/String;Lx7/a;Lx7/a;Lx7/a;)Landroidx/compose/ui/d;
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

.field final synthetic H:Lx7/a;

.field final synthetic I:Lx7/a;

.field final synthetic J:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;LK0/h;Lx7/a;Lx7/a;Lx7/a;Ljava/lang/String;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/d$f;->D:Z

    iput-object p2, p0, Landroidx/compose/foundation/d$f;->E:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/foundation/d$f;->F:LK0/h;

    iput-object p4, p0, Landroidx/compose/foundation/d$f;->G:Lx7/a;

    iput-object p5, p0, Landroidx/compose/foundation/d$f;->H:Lx7/a;

    iput-object p6, p0, Landroidx/compose/foundation/d$f;->I:Lx7/a;

    iput-object p7, p0, Landroidx/compose/foundation/d$f;->J:Ljava/lang/String;

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

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/d$f;->a(Landroidx/compose/ui/platform/G0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
