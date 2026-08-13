.class final Landroidx/compose/foundation/m$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/foundation/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/m$b;

    invoke-direct {v0}, Landroidx/compose/foundation/m$b;-><init>()V

    sput-object v0, Landroidx/compose/foundation/m$b;->D:Landroidx/compose/foundation/m$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Landroidx/compose/foundation/m;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/m;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/m;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/m$b;->a(I)Landroidx/compose/foundation/m;

    move-result-object p1

    return-object p1
.end method
