.class final Landroidx/compose/ui/platform/r$v;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/platform/r$v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/r$v;

    invoke-direct {v0}, Landroidx/compose/ui/platform/r$v;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/r$v;->D:Landroidx/compose/ui/platform/r$v;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB0/b;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB0/b;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r$v;->a(LB0/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
