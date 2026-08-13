.class final Landroidx/compose/ui/focus/FocusOwnerImpl$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusOwnerImpl;-><init>(Lx7/l;Lx7/p;Lx7/l;Lx7/a;Lx7/a;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/focus/FocusOwnerImpl$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$e;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusOwnerImpl$e;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/FocusOwnerImpl$e;->D:Landroidx/compose/ui/focus/FocusOwnerImpl$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/focus/j;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/j;->y(Z)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/j;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$e;->a(Landroidx/compose/ui/focus/j;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
