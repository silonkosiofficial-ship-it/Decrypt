.class final Landroidx/compose/ui/focus/k$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/k;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/focus/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/k$b;

    invoke-direct {v0}, Landroidx/compose/ui/focus/k$b;-><init>()V

    sput-object v0, Landroidx/compose/ui/focus/k$b;->D:Landroidx/compose/ui/focus/k$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Landroidx/compose/ui/focus/n;
    .locals 0

    sget-object p1, Landroidx/compose/ui/focus/n;->b:Landroidx/compose/ui/focus/n$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/n$a;->b()Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/d;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d;->o()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/k$b;->a(I)Landroidx/compose/ui/focus/n;

    move-result-object p1

    return-object p1
.end method
