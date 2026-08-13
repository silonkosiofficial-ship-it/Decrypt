.class final Landroidx/compose/ui/platform/p0$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/platform/p0$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/p0$h;

    invoke-direct {v0}, Landroidx/compose/ui/platform/p0$h;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/p0$h;->D:Landroidx/compose/ui/platform/p0$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LR0/g;
    .locals 1

    const-string v0, "LocalFontLoader"

    invoke-static {v0}, Landroidx/compose/ui/platform/p0;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/p0$h;->a()LR0/g;

    move-result-object v0

    return-object v0
.end method
