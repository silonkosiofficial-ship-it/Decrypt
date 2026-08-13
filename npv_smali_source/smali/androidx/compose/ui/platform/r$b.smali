.class public final Landroidx/compose/ui/platform/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroidx/lifecycle/r;

.field private final b:Lx2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/r;Lx2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/r$b;->a:Landroidx/lifecycle/r;

    iput-object p2, p0, Landroidx/compose/ui/platform/r$b;->b:Lx2/f;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r$b;->a:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public final b()Lx2/f;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r$b;->b:Lx2/f;

    return-object v0
.end method
