.class final Landroidx/compose/ui/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/c;->d(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/ui/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/c$a;

    invoke-direct {v0}, Landroidx/compose/ui/c$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/c$a;->D:Landroidx/compose/ui/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;
    .locals 0

    instance-of p1, p1, Landroidx/compose/ui/b;

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/d$b;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/c$a;->a(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
