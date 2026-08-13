.class final Landroidx/compose/foundation/m$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/foundation/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/m$a;

    invoke-direct {v0}, Landroidx/compose/foundation/m$a;-><init>()V

    sput-object v0, Landroidx/compose/foundation/m$a;->D:Landroidx/compose/foundation/m$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;Landroidx/compose/foundation/m;)Ljava/lang/Integer;
    .locals 0

    invoke-virtual {p2}, Landroidx/compose/foundation/m;->l()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, Landroidx/compose/foundation/m;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/m$a;->a(Le0/l;Landroidx/compose/foundation/m;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
