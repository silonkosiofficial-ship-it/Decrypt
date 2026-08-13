.class public final Landroidx/compose/ui/platform/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LK0/o;

.field private final b:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LK0/o;Landroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/p1;->a:LK0/o;

    iput-object p2, p0, Landroidx/compose/ui/platform/p1;->b:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/p1;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final b()LK0/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/p1;->a:LK0/o;

    return-object v0
.end method
