.class public final LH/P$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/P;->d(Landroidx/compose/ui/d;LH/Q;Lz/l;Z)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/Q;

.field final synthetic E:Lz/l;

.field final synthetic F:Z


# direct methods
.method public constructor <init>(LH/Q;Lz/l;Z)V
    .locals 0

    iput-object p1, p0, LH/P$b;->D:LH/Q;

    iput-object p2, p0, LH/P$b;->E:Lz/l;

    iput-boolean p3, p0, LH/P$b;->F:Z

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

    invoke-virtual {p0, p1}, LH/P$b;->a(Landroidx/compose/ui/platform/G0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
