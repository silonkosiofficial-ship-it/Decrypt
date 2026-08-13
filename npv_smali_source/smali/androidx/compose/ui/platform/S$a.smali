.class final Landroidx/compose/ui/platform/S$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/S;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/platform/S$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/S$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/S$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/S$a;->D:Landroidx/compose/ui/platform/S$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS0/P;)LS0/P;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS0/P;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/S$a;->a(LS0/P;)LS0/P;

    move-result-object p1

    return-object p1
.end method
