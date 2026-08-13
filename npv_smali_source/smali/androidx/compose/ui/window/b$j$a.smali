.class final Landroidx/compose/ui/window/b$j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b$j;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/window/b$j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/window/b$j$a;

    invoke-direct {v0}, Landroidx/compose/ui/window/b$j$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/window/b$j$a;->D:Landroidx/compose/ui/window/b$j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 0

    invoke-static {p1}, LK0/u;->D(LK0/w;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$j$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
